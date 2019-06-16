package com.hackaton.compgenblockdocs;

import com.hackaton.compgenblockdocs.model.BlockchainModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompgenBlockDocsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CompgenBlockDocsApplication.class, args);

		BlockchainModel bc = new BlockchainModel();
		bc.start();
	}

}
