package com.tig.pricecomp;

import com.tig.pricecomp.persistence.connections.Connect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceCompApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceCompApplication.class, args); //COMMENTED OUT FOR TEST
		//Connect.connect();

	}

}
