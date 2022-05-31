package automationtool.services;

import automationtool.model.Scenario;
import automationtool.repositories.ScenarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScenarioService {
    private final ScenarioRepository scenarioRepository;

    public List<Scenario> getScenarios(){
     return scenarioRepository.findAll();
    }

    public Scenario getScenario(Long id){
        return scenarioRepository.findById(id).orElseThrow();
    }

    public Scenario createScenario(Scenario scenario) {
        return scenarioRepository.save(scenario);
    }

    public Scenario updateScenario(Scenario scenario) {
        return scenarioRepository.save(scenario);
    }

    public void deleteScenario(Long id) {
        scenarioRepository.deleteById(id);
    }
}
