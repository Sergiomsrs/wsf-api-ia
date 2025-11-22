package org.mendez.wsf.ia.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table("week_history")
public class WeekHistory {

    @Id
    private Long id;
    private LocalDate weekStart;
    private LocalDate weekEnd;
    private Boolean generatedByAi;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(LocalDate weekStart) {
        this.weekStart = weekStart;
    }

    public LocalDate getWeekEnd() {
        return weekEnd;
    }

    public void setWeekEnd(LocalDate weekEnd) {
        this.weekEnd = weekEnd;
    }

    public Boolean getGeneratedByAi() {
        return generatedByAi;
    }

    public void setGeneratedByAi(Boolean generatedByAi) {
        this.generatedByAi = generatedByAi;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}