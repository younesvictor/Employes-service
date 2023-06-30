package com.exam.ahibou_younes_springcloud.services;

import com.exam.ahibou_younes_springcloud.dto.EmployesRequestDTO;
import com.exam.ahibou_younes_springcloud.dto.EmployesResponseDTO;

import java.util.List;

public interface EmployesService {
    EmployesResponseDTO save(EmployesRequestDTO employesRequestDTO);
    EmployesResponseDTO getEmployes(Long id);
    EmployesResponseDTO update(EmployesRequestDTO employesRequestDTO);
    List<EmployesResponseDTO>listEmployes();

}
