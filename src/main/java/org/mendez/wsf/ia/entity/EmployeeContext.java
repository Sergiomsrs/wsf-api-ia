package org.mendez.wsf.ia.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("employee_context")
public class EmployeeContext {

    @Id
    private Long id;
    private Integer employeeId;
    private String lastWeekShift;
    private Integer totalNightShifts;
    private Integer totalMorningShifts;
    private Integer totalEveningShifts;
    private LocalDateTime updatedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastWeekShift() {
        return lastWeekShift;
    }

    public void setLastWeekShift(String lastWeekShift) {
        this.lastWeekShift = lastWeekShift;
    }

    public Integer getTotalNightShifts() {
        return totalNightShifts;
    }

    public void setTotalNightShifts(Integer totalNightShifts) {
        this.totalNightShifts = totalNightShifts;
    }

    public Integer getTotalMorningShifts() {
        return totalMorningShifts;
    }

    public void setTotalMorningShifts(Integer totalMorningShifts) {
        this.totalMorningShifts = totalMorningShifts;
    }

    public Integer getTotalEveningShifts() {
        return totalEveningShifts;
    }

    public void setTotalEveningShifts(Integer totalEveningShifts) {
        this.totalEveningShifts = totalEveningShifts;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}