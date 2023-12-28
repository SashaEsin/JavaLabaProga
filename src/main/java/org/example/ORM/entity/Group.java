package org.example.ORM.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "groups")
public class Group extends BaseEntity<Long> {
    private String title;
    private Integer startYear;
    private Integer endYear;
    private Long departmentId;

    public String getTitle() {
        return title;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Group setTitle(String title) {
        this.title = title;
        return this;
    }

    public Group setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Group setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public Group setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
}
