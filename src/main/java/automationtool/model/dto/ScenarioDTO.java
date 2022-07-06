package automationtool.model.dto;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class ScenarioDTO {
    private String scenarioName;
    private HashMap<Integer, Object> scenarioAttributes;
}
