package automationtool.controllers;

import automationtool.services.ExecutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ExecuteScenariosController {

    private final ExecutorService executorService;
    @GetMapping("/scenarios/execute")
    public String executeScenarios(){
        return executorService.executeScenarios();
    }

}
