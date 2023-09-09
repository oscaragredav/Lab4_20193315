package com.example.lab4_20193315.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    @Column(name="first_name",nullable=false,length = 20)
    private String first_name;

    @Column(name="last_name",nullable=false,length = 25)
    private String last_name;

    @Column(name="email",nullable=false,length = 25)
    private String email;

    @Column(name="password",nullable=false,length = 25)
    private String password;

    @Column(name="phone_number",nullable=false,length = 20)
    private String phone_number;

    @Column(name="hire_date",nullable=false,length = 20)
    private String hire_date;

    @Column(name="job_id",nullable=false,length = 10)
    private String job_id;

    @Column(name = "salary",nullable = false)
    private Double salary;

    @Column(name = "commission_pct",nullable = false)
    private Double commission_pct;

    @Column(name = "manager_id",nullable = false)
    private Integer manager_id;

    @Column(name = "department_id",nullable = false)
    private Integer department_id;


}
