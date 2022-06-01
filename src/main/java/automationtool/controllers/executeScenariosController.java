package automationtool.controllers;

import automationtool.model.Scenario;
import automationtool.model.ScenarioDTO;
import automationtool.services.ScenarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class executeScenariosController {

    private final ScenarioService scenarioService;

    @GetMapping("/scenarios/execute")
    public void executeScenarios(){

    }

}
