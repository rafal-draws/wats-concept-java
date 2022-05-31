package automationtool.controllers;

import automationtool.model.Scenario;
import automationtool.model.ScenarioDTO;
import automationtool.services.ScenarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class scenarioController {

    public static final Long EMPTY_ID = null;
    private final ScenarioService scenarioService;

    @GetMapping("/scenarios")
    public List<Scenario> getScenarios(){
        return scenarioService.getScenarios();
    }

    @GetMapping("/scenarios/{id}")
    public Scenario getScenario(@PathVariable Long id){
        return scenarioService.getScenario(id);
    }

    @PostMapping("/scenarios")
    public Scenario createScenario(@RequestBody ScenarioDTO scenarioDTO){
        return scenarioService.createScenario(new Scenario(
                EMPTY_ID,
                scenarioDTO.getScenarioName(),
                scenarioDTO.getScenarioAttributes()
        ));
    }

    @PutMapping("/scenarios/{id}")
    public Scenario updateScenario(@PathVariable Long id, @RequestBody ScenarioDTO scenarioDTO){
        return scenarioService.updateScenario(new Scenario(
                id,
                scenarioDTO.getScenarioName(),
                scenarioDTO.getScenarioAttributes()
        ));
    }

    @DeleteMapping("/scenario/{id}/delete")
    public void deleteScenario(@PathVariable Long id) {
        scenarioService.deleteScenario(id);
    }
}
