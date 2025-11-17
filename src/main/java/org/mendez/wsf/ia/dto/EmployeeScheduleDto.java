package org.mendez.wsf.ia.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record EmployeeScheduleDto(Long employeeId,
        LocalDate date,
        LocalTime hora) {
}
