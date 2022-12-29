package com.tig.pricecomp.persistence.dao;


import com.tig.pricecomp.persistence.model.LidlPrice;
import com.tig.pricecomp.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceRepository extends JpaRepository<LidlPrice, Integer> {

}
