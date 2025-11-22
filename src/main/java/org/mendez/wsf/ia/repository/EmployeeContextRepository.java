package org.mendez.wsf.ia.repository;

import org.mendez.wsf.ia.entity.EmployeeContext;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface EmployeeContextRepository extends ReactiveCrudRepository<EmployeeContext, Long> {

    Mono<EmployeeContext> findByEmployeeId(Integer employeeId);



}