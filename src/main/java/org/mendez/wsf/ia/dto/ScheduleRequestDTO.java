package org.mendez.wsf.ia.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record ScheduleRequestDTO(
        String intent,
        Long employeeId,
        LocalDate date,
        LocalTime startTime,
        LocalTime endTime
) {
}
