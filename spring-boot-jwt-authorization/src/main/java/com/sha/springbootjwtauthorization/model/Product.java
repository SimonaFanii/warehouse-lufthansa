package com.sha.springbootjwtauthorization.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "price", nullable = true)
    private Double price;

    @Column(name = "create_time", nullable = true)
    private LocalDateTime createTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Purchase> purchaseList;
}