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
@Table(name = "tb_shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String shop_id;
    private String shop_name;
    private String shop_contact;
    private String shop_email;
    private String shop_address;
    @Lob
    private byte[] shop_logo;

}
