package org.mendez.wsf.ia.service;

import org.mendez.wsf.ia.dto.EmployeeScheduleDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class ScheduleApiClientService {

    private final WebClient scheduleApiClient;


    public ScheduleApiClientService(WebClient scheduleApiClient) {
        this.scheduleApiClient = scheduleApiClient;
    }

    public Flux<EmployeeScheduleDto> getSchedulesBetweenDays(String startDate, String endDate){
        return scheduleApiClient.get().uri(
                uriBuilder -> uriBuilder
                        .path("/between-dates")
                        .queryParam("startDate", startDate)
                        .queryParam("endDate", endDate)
                        .build()
        ).retrieve().bodyToFlux(EmployeeScheduleDto.class);
    }
}
