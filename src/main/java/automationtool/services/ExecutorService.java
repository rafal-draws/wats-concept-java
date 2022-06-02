package automationtool.services;

import automationtool.model.Scenario;
import automationtool.repositories.ScenarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

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

    private void readStep(Scenario scenario){
        HashMap<String, Object> steps = scenario.getScenarioAttributes();
        for
    }

}
