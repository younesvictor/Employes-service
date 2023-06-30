package com.exam.ahibou_younes_springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String prenom ;
    private String email ;
    private int telephone ;


}
