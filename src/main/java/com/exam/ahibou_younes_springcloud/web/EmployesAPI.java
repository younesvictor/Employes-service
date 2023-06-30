package com.exam.ahibou_younes_springcloud.web;

import com.exam.ahibou_younes_springcloud.dto.EmployesRequestDTO;
import com.exam.ahibou_younes_springcloud.dto.EmployesResponseDTO;
import com.exam.ahibou_younes_springcloud.services.EmployesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class EmployesAPI {
    private final EmployesService employesService;

    public EmployesAPI(EmployesService employesService) {
        this.employesService = employesService;
    }

    @GetMapping("/customers")
    public List<EmployesResponseDTO> allCustomers(){
        return employesService.listEmployes();
    }

    @PostMapping("/customers")
    public EmployesResponseDTO save(EmployesRequestDTO employesRequestDTO){
        return employesService.save(employesRequestDTO);
    }

    @GetMapping("/customers/{id}")
    public EmployesResponseDTO getEmployes(@PathVariable Long id){
        return employesService.getEmployes(id);
    }
}
