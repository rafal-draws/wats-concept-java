package automationtool.controllers;

import automationtool.services.ExecutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ExecuteScenariosController {

    private final ExecutorService executorService;
    @GetMapping("/scenarios/{id}/execute")
    public String executeScenarios(@PathVariable Long id){
        return executorService.getStepsForDriver(id);
    }

}
