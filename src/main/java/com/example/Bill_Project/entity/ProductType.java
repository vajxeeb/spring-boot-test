package com.example.Bill_Project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "tb_productType")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pdt_id;
    private String pdt_name;
}
