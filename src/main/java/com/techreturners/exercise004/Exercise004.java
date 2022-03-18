package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private final int GIGASECOND = 1000000000;
    private LocalDateTime localDateTime;


    public Exercise004(LocalDate date) {
        localDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        LocalDateTime afterGigaSeconds = localDateTime.plusSeconds(GIGASECOND);
        return afterGigaSeconds;
    }

}
