package com.scrapyard.management.DTO.Response.InvoiceDTO;
import com.scrapyard.management.DTO.Response.InvoiceDetailDTO.InvoiceDetailDTOResponse;
import com.scrapyard.management.Models.Enums.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceDTOResponse {

    private String customerName;
    private Long invoiceId;
    private Long customerId;
    private CustomerType customerType;
    private String scrapyardName;
    private Long scrapyardId;
    private LocalDateTime createdAt;
    private List<InvoiceDetailDTOResponse> details=new ArrayList<>();
    private BigDecimal totalPaid;
    private BigDecimal discount;
    private String managerName;



}
