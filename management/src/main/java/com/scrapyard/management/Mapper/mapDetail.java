package com.scrapyard.management.Mapper;
import com.scrapyard.management.DTO.Response.InvoiceDetailDTO.InvoiceDetailDTOResponse;
import com.scrapyard.management.Models.InvoiceDetail;
import org.springframework.stereotype.Component;

@Component
public class mapDetail {

    public InvoiceDetailDTOResponse mapDetailFunc(InvoiceDetail detail) {

        InvoiceDetailDTOResponse dto = new InvoiceDetailDTOResponse();

        dto.setDetailId(detail.getId());
        dto.setMaterialType(detail.getMaterialType());
        dto.setUnit(detail.getUnit());
        dto.setWeight(detail.getWeight());
        dto.setUnitPrice(detail.getUnitPrice());
        dto.setContainerId(detail.getContainer().getId());
        dto.setSubtotal(detail.getSubtotal());

        return dto;
    }


}
