package com.exam.ahibou_younes_springcloud.repositories;

import com.exam.ahibou_younes_springcloud.entities.Employes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployesRepositories extends JpaRepository<Employes,Long> {
}
