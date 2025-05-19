
package com.symptomchecker.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class SymptomCheckerController {

    @PostMapping("/check-symptoms")
    public Map<String, Object> checkSymptoms(@RequestBody Map<String, Object> request) {
        List<String> symptoms = (List<String>) request.get("symptoms");
        List<String> conditions = new ArrayList<>();

        if (symptoms.contains("fever") && symptoms.contains("cough")) {
            conditions.add("Flu");
        }
        if (symptoms.contains("headache") && symptoms.contains("blurred vision")) {
            conditions.add("Migraine");
        }
        if (symptoms.contains("fatigue") && symptoms.contains("thirst")) {
            conditions.add("Diabetes");
        }

        if (conditions.isEmpty()) {
            conditions.add("Condition not recognized. Please consult a doctor.");
        }

        Map<String, Object> response = new HashMap<>();
        response.put("possibleConditions", conditions);
        return response;
    }
}
