package com.coderslab.magazynRDK.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "quantity_types")
public class QuantityType {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Length(min=2)
    private String name;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "quantityType")
//    private List<Item> items;

    @Override
    public String toString() {
        return this.name;
    }
}
