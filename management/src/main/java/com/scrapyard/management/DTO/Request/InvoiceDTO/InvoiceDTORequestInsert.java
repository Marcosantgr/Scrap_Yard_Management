package com.scrapyard.management.DTO.Request.InvoiceDTO;
import com.scrapyard.management.DTO.Request.InvoiceDetailDTO.InvoiceDetailDTORequestInsert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceDTORequestInsert {

    private Long customerId;

    private Long scrapYardId;

    private BigDecimal discount;

    private List<InvoiceDetailDTORequestInsert> details;

}
