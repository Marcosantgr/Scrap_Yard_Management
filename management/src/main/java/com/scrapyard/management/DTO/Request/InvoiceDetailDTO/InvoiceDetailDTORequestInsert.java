package com.scrapyard.management.DTO.Request.InvoiceDetailDTO;
import com.scrapyard.management.Models.Enums.MaterialType;
import com.scrapyard.management.Models.Enums.UnitOfMeasure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceDetailDTORequestInsert {

    private MaterialType materialType;

    private UnitOfMeasure unit;

    private BigDecimal weight;

    private BigDecimal unitPrice;

    private Long containerId;


}
