package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Getter;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "tariff", schema = "public")
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tariff", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "tariff_cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal tariffCost;

    @Size(max = 255)
    @NotNull
    @Column(name = "tariff_n", nullable = false)
    private String tariffN;

    @Column(name = "validity_d")
    private LocalDate validityD;

    @OneToMany(mappedBy = "idTariff")
    private Set<Service> services = new LinkedHashSet<>();

}