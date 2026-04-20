package com.scrapyard.management.Models;
import com.scrapyard.management.Models.Enums.MaterialType;
import com.scrapyard.management.Models.Enums.UnitOfMeasure;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "container")
public class Container {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal currentWeight = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MaterialType materialType;

    @ManyToOne
    @JoinColumn(name = "scrapyard_id", nullable = false)
    private ScrapYard scrapYard;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UnitOfMeasure stockUnit = UnitOfMeasure.KILOGRAMS;

    @OneToMany(mappedBy = "defaultContainer")
    private List<Invoice> invoices=new ArrayList<>();

    @OneToMany(mappedBy = "container")
    private List<InvoiceDetail> invoiceDetails=new ArrayList<>();






}
