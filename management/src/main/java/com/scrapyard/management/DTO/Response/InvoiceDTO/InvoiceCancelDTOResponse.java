package com.scrapyard.management.DTO.Response.InvoiceDTO;
import com.scrapyard.management.Models.Enums.InvoiceStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceCancelDTOResponse {

    private Long invoiceId;

    private InvoiceStatus status;

    private LocalDateTime cancelledAt;


}
