package com.cognizant.ormlearn.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "em_id")
    private int id;

    @Column(name = "em_name")
    private String name;

    @Column(name = "em_salary")
    private BigDecimal salary;

    @Column(name = "em_permanent")
    private boolean permanent;

    @Column(name = "em_date_of_birth")
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "em_dp_id")
    private Department department;

    // LAZY by default; HQL uses 'fetch' to load skillList in one query
    @ManyToMany
    @JoinTable(name = "employee_skill",
        joinColumns = @JoinColumn(name = "es_em_id"),
        inverseJoinColumns = @JoinColumn(name = "es_sk_id"))
    private Set<Skill> skillList;

    public Employee() {}

    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public BigDecimal getSalary() { return salary; }
    public boolean isPermanent() { return permanent; }
    public Department getDepartment() { return department; }
    public Set<Skill> getSkillList() { return skillList; }
    public void setSkillList(Set<Skill> skillList) { this.skillList = skillList; }

    @Override
    public String toString() { return "Employee [" + id + ", " + name + ", permanent=" + permanent + "]"; }
}
