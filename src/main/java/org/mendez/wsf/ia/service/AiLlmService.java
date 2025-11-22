package org.mendez.wsf.ia.service;

import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class AiLlmService {

    private final OllamaChatModel ollamaChatModel;

    public AiLlmService(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    public String ask(String prompt) {
        // Llamada al modelo
        String response = ollamaChatModel.generate(prompt);

        // Depuración
        System.out.println("=== OLLAMA RAW RESPONSE ===");
        System.out.println(response);
        System.out.println("===========================");

        return response;
    }
}

