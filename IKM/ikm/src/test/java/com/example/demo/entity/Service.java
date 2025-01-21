package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "service", schema = "public")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_subscriber", nullable = false)
    private Subscriber idSubscriber;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tariff", nullable = false)
    private Tariff idTariff;

    @Size(max = 255)
    @NotNull
    @Column(name = "service_n", nullable = false)
    private String serviceN;

    @OneToMany(mappedBy = "idService")
    private Set<Traffic> traffic = new LinkedHashSet<>();

}