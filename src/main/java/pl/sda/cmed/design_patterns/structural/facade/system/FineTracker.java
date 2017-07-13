package pl.sda.cmed.design_patterns.structural.facade.system;

import java.util.Map;

public class FineTracker {

    private Map<String, Integer> fines;

    public FineTracker(Map<String, Integer> fines) {
        this.fines = fines;
    }

    public Integer getFine(String id) {
        Integer fine = fines.get(id);
        return fine == null ? 0 : fine;
    }
}
