package org.mendez.wsf.ia.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.mendez.wsf.ia.dto.ScheduleRequestDTO;
import org.mendez.wsf.ia.service.AiParserService;
import org.mendez.wsf.ia.service.ScheduleApiClientService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ai")
public class AiController {

    private final AiParserService parserService;
    private final ScheduleApiClientService scheduleService;

    public AiController(AiParserService parserService, ScheduleApiClientService scheduleService) {
        this.parserService = parserService;
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public Mono<String> handleMessage(@RequestBody Map<String, String> body) {

        String userMessage = body.get("message");

        return Mono.fromCallable(() -> parserService.parseUserMessage(userMessage))
                .flatMap(jsonResponse -> {

                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        mapper.registerModule(new JavaTimeModule());
                        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

                        ScheduleRequestDTO dto = mapper.readValue(jsonResponse, ScheduleRequestDTO.class);

                        System.out.println(dto.employeeId());
                        System.out.println(dto.date());
                        System.out.println(dto.startTime());
                        System.out.println(dto.endTime());

                        return scheduleService.createTurn(dto)
                                .thenReturn("Turno creado correctamente para " + dto.employeeId());

                    } catch (Exception e) {
                        System.out.println(jsonResponse);
                        e.printStackTrace();
                        return Mono.just("No pude entender la solicitud.");
                    }
                })
                .onErrorReturn("Ocurrió un error inesperado.");
    }


}
