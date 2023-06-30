package com.exam.ahibou_younes_springcloud.mappers;

import com.exam.ahibou_younes_springcloud.dto.EmployesRequestDTO;
import com.exam.ahibou_younes_springcloud.dto.EmployesResponseDTO;
import com.exam.ahibou_younes_springcloud.entities.Employes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployesMapper {
     Employes employesRequestToEmployes(EmployesRequestDTO employesRequestDTO);
     EmployesResponseDTO employesToEmployesResponseDTO(Employes employes);
}
