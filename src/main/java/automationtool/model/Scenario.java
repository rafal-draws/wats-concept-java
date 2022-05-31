package automationtool.model;


import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import javax.persistence.*;
import java.io.IOException;
import java.util.HashMap;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="scenarioName")
    private String scenarioName;
    @Column(name="scenarioAttributes", columnDefinition="CLOB NOT NULL")
    private HashMap<String, Object> scenarioAttributes;

}

