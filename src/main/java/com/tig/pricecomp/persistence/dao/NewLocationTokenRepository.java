package com.tig.pricecomp.persistence.dao;

import com.tig.pricecomp.persistence.model.NewLocationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

}
