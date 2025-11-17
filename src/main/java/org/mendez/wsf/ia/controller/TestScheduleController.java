package org.mendez.wsf.ia.controller;

import org.mendez.wsf.ia.dto.EmployeeScheduleDto;
import org.mendez.wsf.ia.service.ScheduleApiClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/internal/schedule")
public class TestScheduleController {

    private final ScheduleApiClientService apiClientService;

    public TestScheduleController(ScheduleApiClientService apiClientService) {
        this.apiClientService = apiClientService;
    }

    @GetMapping("/between-dates")
    public Flux<EmployeeScheduleDto> getTurnsBetweenDates(
            @RequestParam String startDate,
            @RequestParam String endDate
    ) {
        return apiClientService.getSchedulesBetweenDays(startDate, endDate);
    }




}
