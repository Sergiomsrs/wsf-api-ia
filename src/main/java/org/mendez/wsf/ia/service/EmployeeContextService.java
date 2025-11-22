package org.mendez.wsf.ia.service;

import org.mendez.wsf.ia.entity.EmployeeContext;
import org.mendez.wsf.ia.repository.EmployeeContextRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EmployeeContextService {

    private final EmployeeContextRepository repository;

    public EmployeeContextService(EmployeeContextRepository repository) {
        this.repository = repository;
    }

    public Mono<EmployeeContext> getByEmployeeId(Integer employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    public Mono<EmployeeContext> save(EmployeeContext context) {
        return repository.save(context);
    }

}
