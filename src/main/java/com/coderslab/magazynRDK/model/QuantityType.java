package com.coderslab.magazynRDK.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Table(name= "quantity_types")
public class QuantityType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotBlank
    @Length(min=2)
    private String name;

}
