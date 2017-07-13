package pl.sda.cmed.design_patterns.structural.facade.system;

import java.util.Map;


public class TimeTracker {

    private Map<String, Integer> workTimes;

    public TimeTracker(Map<String, Integer> workTimes) {
        this.workTimes = workTimes;
    }

    public Integer getWorkTime(String id) {
        Integer workTime = workTimes.get(id);
        return workTime == null ? 0 : workTime;
    }
}
