package com.fgc.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.fgc.data.entity.User;
import com.fgc.data.repository.MatchRepository;
import com.fgc.data.repository.UserRepository;

@SpringBootApplication
public class FgcDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(FgcDataApplication.class, args);
	}

}
