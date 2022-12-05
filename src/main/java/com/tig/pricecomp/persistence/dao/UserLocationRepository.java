package com.tig.pricecomp.persistence.dao;

import com.tig.pricecomp.persistence.model.User;
import com.tig.pricecomp.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
