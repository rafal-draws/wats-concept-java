package automationtool.controllers;

import automationtool.services.ExecutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExecuteScenariosController {

    private final ExecutorService executorService;

    @GetMapping("/scenarios/execute")
    public String executeScenarios(){
        return executorService.executeScenarios();
    }
    @GetMapping("/scenarios/{id}/execute")
    public List<Object> executeScenario(@PathVariable Long id){
        return executorService.getStepsFromScenarioAttributesValues(id);
    }
}
