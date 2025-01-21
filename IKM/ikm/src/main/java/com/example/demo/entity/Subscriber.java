package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
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
    @Column(name = "service_address")
    private String serviceAddress;

    @Size(max = 30)
    @Column(name = "basic_service", length = 30)
    private String basicService;

    @OneToMany(mappedBy = "idSubscriber")
    private Set<Service> services = new LinkedHashSet<>();

}