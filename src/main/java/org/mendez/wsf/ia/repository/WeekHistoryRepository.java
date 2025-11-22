package org.mendez.wsf.ia.repository;

import org.mendez.wsf.ia.entity.WeekHistory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface WeekHistoryRepository extends ReactiveCrudRepository<WeekHistory, Long> {

}
