package com.example.atompointsweb.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contactUs")
public class ContactUsEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;
    @Column( name= "email",nullable = false)
    private String email;
    @Column( name= "text",nullable = false)
    private String text;




}
