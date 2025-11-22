package org.mendez.wsf.ia.service;

import org.mendez.wsf.ia.prompts.ScheduleParserPrompt;
import org.springframework.stereotype.Service;

@Service
public class AiParserService {

    private final AiLlmService aiLlmService;

    public AiParserService(AiLlmService aiLlmService) {
        this.aiLlmService = aiLlmService;
    }

    public String parseUserMessage(String message) {
        String prompt = ScheduleParserPrompt.systemPrompt()
                + "\n\nUsuario: " + message;

        System.out.println(prompt);

        return aiLlmService.ask(prompt); // <-- Devuelve JSON directamente
    }
}

