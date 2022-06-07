package automationtool.services;

import automationtool.model.Scenario;
import automationtool.repositories.ScenarioRepository;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExecutorService {
    private final ScenarioRepository scenarioRepository;
    private final ScenarioService scenarioService;
    private final DriverService driverService;

    public String executeScenarios(){

        StringBuilder output = new StringBuilder();

        List<Scenario> scenarios = scenarioService.getScenarios();
        int scenariosCount = scenarios.size();
        for (Scenario s : scenarios) {
            //todo create a scenario suite
            //for scenario execute steps
            executeSteps(getStepsFromScenarioAttributesValues(s.getId()));
        }
        return "all tests passed";
    }

    public String executeScenario(Long scenarioId){
        //execute steps of one scenario
        executeSteps(getStepsFromScenarioAttributesValues(scenarioId));
        return "Scenario" + scenarioId + " has been executed successfully";
    }

    public List<Object> getStepsFromScenarioAttributesValues(Long scenarioId){
        List<Object> response = new ArrayList<>();

        Scenario scenario = scenarioService.getScenario(scenarioId);
        HashMap<Integer, Object> steps = scenario.getScenarioAttributes();
        for (Map.Entry<Integer, Object> set : steps.entrySet()){
            response.add(set.getValue());
        }
        return response;
    }

    public void executeSteps(List<Object> response){
        //todo scenario flag
        boolean ScenarioFlag = true;

        for (Object obj : response){
            JsonObject jsonObj = (JsonObject) obj;

            if (jsonObj.has("goToUrl")) {
                //goes to url
                driverService.goToUrl(String.valueOf(jsonObj.get("goToUrl")));
                return;
            } else if (jsonObj.has("assertCurrentUrl")) {
                //asserts cur url with value
                ScenarioFlag = driverService.assertCurrentUrl(String.valueOf(jsonObj.get("assertCurrentUrl")));
                return;
            }
        }
        }
}
