package com.example.Bill_Project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_unit")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int unit_id;
    private String unit_name;
}
