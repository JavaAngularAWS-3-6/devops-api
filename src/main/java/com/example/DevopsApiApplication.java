package com.example;

import com.example.models.Characters;
import com.example.repository.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevopsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner cmd (CharacterRepository characterRepo) {
		return args -> {
			Characters c = new Characters(1, "SpongeBob", "SquarePants", "SpongeBob", "Sea Sponge", "https://em-devops-api.s3.amazonaws.com/imgs/SpongeBob.png");
			characterRepo.save(c);
			c = new Characters(2, "Patrick", "Star", "Patrick", "Starfish", "https://em-devops-api.s3.amazonaws.com/imgs/Patrick.png");
			characterRepo.save(c);
			c = new Characters(3, "Squidward", "Tentacles", "Squidard", "Pacific Octopus", "https://em-devops-api.s3.amazonaws.com/imgs/Squidward.png");
			characterRepo.save(c);
			c = new Characters(4, "Eugene", "Krabs", "Mr.Krabs", "Crab", "https://em-devops-api.s3.amazonaws.com/imgs/MrKrabs.png");
			characterRepo.save(c);
			c = new Characters(5, "Sheldon", "Plankton", "Plankton", "Planktonic Copepod", "https://em-devops-api.s3.amazonaws.com/imgs/Plankton.png");
			characterRepo.save(c);
			c = new Characters(6, "Sandy", "Cheeks", "Sandy", "Squirrel", "https://em-devops-api.s3.amazonaws.com/imgs/Sandy.png");
			characterRepo.save(c);
		};
	}

}
