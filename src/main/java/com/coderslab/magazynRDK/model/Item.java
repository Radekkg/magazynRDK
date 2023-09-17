package com.coderslab.magazynRDK.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@NotBlank
    @Length(min = 2)
    private String name;
    //@NotBlank
    @Length(min = 1)
    private Integer quantity;
    private String qrCode;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idQuantityType")
    private QuantityType quantityType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idWarehouse")
    private Warehouse warehouse;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idRack")
    private Rack rack;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_category")
    private Category category;

}
