package com.scrapyard.management.Models;
import com.scrapyard.management.Models.Enums.MovementType;
import com.scrapyard.management.Models.Enums.UnitOfMeasure;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movement")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "scrapyard_id", nullable = false)
    private ScrapYard scrapYard;

    @ManyToOne
    @JoinColumn(name = "originContainer_id", nullable = false)
    private Container originContainer;

    // Para destino
    @Column(nullable = false)
    @NotBlank
    private String destination;

    // Cantidad de material movida
    @Column(nullable = false)
    private BigDecimal amountMoved;

    //unidad de pesaje del movimiento
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UnitOfMeasure unitOfMeasure;

    @Column(nullable = false)
    private LocalDateTime movementDate = LocalDateTime.now(ZoneOffset.UTC);

    @ManyToOne(optional = false)
    @JoinColumn(name = "manager_id", nullable = false)
    private ManagerSY managerSY;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MovementType movementType;

}
