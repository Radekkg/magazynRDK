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
@Table(name = "racks")
public class Rack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@NotBlank
    private String name;
    //@NotBlank
    private Integer number;
    //@NotBlank
    private Integer level;
    //@NotBlank
    private Integer place;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "rack")
//    private List<Item> items;

    @Override
    public String toString() {
        return "n " + number +
                ", l " + level +
                ", p " + place;
    }
}
