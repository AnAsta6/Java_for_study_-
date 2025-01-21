package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "traffic", schema = "public")
public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_traffic", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_service", nullable = false)
    private Service idService;

    @NotNull
    @Column(name = "traffic_cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal trafficCost;

    @NotNull
    @Column(name = "usage_t", nullable = false)
    private Instant usageT;

    @NotNull
    @Column(name = "usage_d", nullable = false)
    private LocalDate usageD;

}