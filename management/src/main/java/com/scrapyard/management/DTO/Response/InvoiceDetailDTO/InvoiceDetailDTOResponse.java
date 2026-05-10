package com.scrapyard.management.DTO.Response.InvoiceDetailDTO;
import com.scrapyard.management.Models.Enums.MaterialType;
import com.scrapyard.management.Models.Enums.UnitOfMeasure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceDetailDTOResponse {

    private Long detailId;

    private MaterialType materialType;

    private UnitOfMeasure unit;

    private BigDecimal weight;

    private BigDecimal unitPrice;

    private BigDecimal subtotal;

    private Long containerId;


}
