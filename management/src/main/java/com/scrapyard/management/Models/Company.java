package com.scrapyard.management.Models;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false)
    private String location;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<ScrapYard> scrapYards=new ArrayList<>();

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<Customer> customers=new ArrayList<>();

    @Column(nullable = false)
    private boolean active = true;



}
