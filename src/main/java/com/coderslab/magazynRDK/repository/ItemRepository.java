package com.coderslab.magazynRDK.repository;

import com.coderslab.magazynRDK.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <Item, Integer> {
}
