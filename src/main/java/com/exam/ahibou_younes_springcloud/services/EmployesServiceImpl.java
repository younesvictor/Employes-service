package com.exam.ahibou_younes_springcloud.services;

import com.exam.ahibou_younes_springcloud.dto.EmployesRequestDTO;
import com.exam.ahibou_younes_springcloud.dto.EmployesResponseDTO;
import com.exam.ahibou_younes_springcloud.entities.Employes;
import com.exam.ahibou_younes_springcloud.mappers.EmployesMapper;
import com.exam.ahibou_younes_springcloud.repositories.EmployesRepositories;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployesServiceImpl implements EmployesService{

    private final EmployesRepositories employesRepositories;
    private final EmployesMapper employesMapper;

    public EmployesServiceImpl(EmployesRepositories employesRepositories, EmployesMapper employesMapper) {
        this.employesRepositories = employesRepositories;
        this.employesMapper = employesMapper;
    }

    @Override
    public EmployesResponseDTO save(EmployesRequestDTO employesRequestDTO) {
        Employes employes = employesMapper.employesRequestToEmployes(employesRequestDTO);
        employes = employesRepositories.save(employes);
        return employesMapper.employesToEmployesResponseDTO(employes);
    }

    @Override
    public EmployesResponseDTO getEmployes(Long id) {
        Employes employes=employesRepositories.findById(id).get();
        return employesMapper.employesToEmployesResponseDTO(employes);
    }

    @Override
    public EmployesResponseDTO update(EmployesRequestDTO employesRequestDTO) {
        Employes employes = employesMapper.employesRequestToEmployes(employesRequestDTO);
        employes = employesRepositories.save(employes);
        return employesMapper.employesToEmployesResponseDTO(employes);
    }

    @Override
    public List<EmployesResponseDTO> listEmployes() {
        List<Employes> employes=employesRepositories.findAll();
        return employes.stream().map(employesMapper::employesToEmployesResponseDTO).collect(Collectors.toList());
    }
}
