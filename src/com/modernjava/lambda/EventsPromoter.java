package com.modernjava.lambda;

public class EventsPromoter {
    public double getSupplement(String eventType) {
        if (eventType == "running") {
            return 5.0;
        } else if (eventType == "swimming") {
            return 3.0;
        }
        return 0.0;
    }
}
