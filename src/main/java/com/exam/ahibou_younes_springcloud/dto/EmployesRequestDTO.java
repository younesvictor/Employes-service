package com.exam.ahibou_younes_springcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployesRequestDTO {
    private Long id ;
    private String name ;
    private String prenom ;
    private String email ;
    private int telephone ;
}
