package com.scrapyard.management.Models;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "managerSY")
public class ManagerSY {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false, unique = true)
    private String name;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "scrap_yard_id")
    private ScrapYard scrapYard;
}
