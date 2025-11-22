package org.mendez.wsf.ia.config;


import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OllamaConfig {

    @Bean
    public OllamaChatModel ollamaChatModel() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")  // puerto por defecto de Ollama
                .modelName("llama3.1")                  // el modelo que quieras cargar
                .format("json")                     // MUY IMPORTANTE para devolver JSON limpio
                .temperature(0.1)                   // más determinista
                .build();
    }
}