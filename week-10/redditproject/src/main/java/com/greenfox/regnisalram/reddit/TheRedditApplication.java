package com.greenfox.regnisalram.reddit;

import com.greenfox.regnisalram.reddit.models.Post;
import com.greenfox.regnisalram.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheRedditApplication implements CommandLineRunner {

	@Autowired
	private PostRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(TheRedditApplication.class, args);
	}

	public void run(String... strings) throws Exception {
		for (int i = 1; i < 6; i++) {
			repository.save(new Post("Title of post", "This is a post " + i));
		}
	}
}
