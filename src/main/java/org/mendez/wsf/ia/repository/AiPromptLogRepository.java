package org.mendez.wsf.ia.repository;

import org.mendez.wsf.ia.entity.AiPromptLog;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AiPromptLogRepository extends ReactiveCrudRepository<AiPromptLog, Long> {

}
