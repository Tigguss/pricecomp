package com.tig.pricecomp.service;

import com.tig.pricecomp.persistence.model.LidlPrice;
import java.util.List;

public interface IPricesService {


    List<LidlPrice> getAllPrices();

}
