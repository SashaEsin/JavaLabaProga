package org.example.ORM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student extends BaseEntity<Long> {
    public String name;
    public String surname;

    @Column(name = "group_id", insertable = false, updatable = false)
    private Long groupId;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public Student setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public Student setGroup(Group group) {
        this.group = group;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupId=" + groupId +
                ", group=" + group +
                ", id=" + id +
                "} " + super.toString();
    }
}
