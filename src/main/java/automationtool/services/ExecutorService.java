package automationtool.services;

import automationtool.model.Scenario;
import automationtool.repositories.ScenarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExecutorService {
    private final ScenarioRepository scenarioRepository;
    private final ScenarioService scenarioService;

    public String executeScenarios(){

        StringBuilder output = new StringBuilder("");

        List<Scenario> scenarios = scenarioService.getScenarios();
        int scenariosCount = scenarios.size();
        for (Scenario s : scenarios) {
            //todo getScenarioAttributes to be interpreted
            output.append(s.getScenarioAttributes());
        }
        return output.toString();
    }

    public String getStepsForDriver(Long scenarioId){
        StringBuilder response = new StringBuilder();
        Scenario scenario = scenarioService.getScenario(scenarioId);
        HashMap<Integer, Object> steps = scenario.getScenarioAttributes();
        for (Map.Entry<Integer, Object> set : steps.entrySet()){
            response.append(set.getValue());
        }

        //instructions to driver
        return String.valueOf(response);
    }

    private void interpretStep(Object step){

        // from scenario.getScenarioAttributes (which is a HashMap<Integer, Object>)
        // we're only interested in value part, being the object of json syntax


//        switch (step){
//            case "GoToUrl":
//                System.out.println("gotoUrl");
//                break;
//            case ""


        }
}
