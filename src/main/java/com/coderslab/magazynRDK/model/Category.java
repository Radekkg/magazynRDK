package com.coderslab.magazynRDK.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@NotBlank
    @Length(min = 2)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Item> items;

    @Override
    public String toString() {
        return name;
    }
}
