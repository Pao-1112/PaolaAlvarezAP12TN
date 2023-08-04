package com.mindhubap.homebankingap;

import com.mindhubap.homebankingap.models.Client;
import com.mindhubap.homebankingap.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return(args -> {
			Client client1 = new Client();
			client1.setFirstName("Melba");
			client1.setLastName("Morel");
			client1.setEmail("melba@midhub.com");

			Client client2 = new Client();
			client2.setFirstName("Juan");
			client2.setLastName("Perez");
			client2.setEmail("Juan@midhub.com");

			clientRepository.save(client1);
			clientRepository.save(client2);

		});
	}
}
