package com.tig.pricecomp.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "LidlItems")
@Data
public class LidlPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Item_id", updatable = false, nullable = false)
    public int Item_id;
    public String Item_name;
    public double Item_Price;

    public LocalDateTime Data_Added;





}
