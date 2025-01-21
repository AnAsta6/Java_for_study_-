package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "subscriber", schema = "public")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subscriber", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_subscriber", nullable = false)
    private Client client;

    @Size(max = 255)
    @NotNull
    @Column(name = "service_address", nullable = false)
    private String serviceAddress;

    @Size(max = 30)
    @NotNull
    @Column(name = "basic_service", nullable = false, length = 30)
    private String basicService;

}