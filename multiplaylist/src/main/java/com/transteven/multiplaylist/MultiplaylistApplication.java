package com.transteven.multiplaylist;

import com.transteven.multiplaylist.youtube.model.YoutubeModel;
import com.transteven.multiplaylist.youtube.repository.YoutubeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiplaylistApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(MultiplaylistApplication.class, args);
	}

	@Autowired
	private YoutubeRepository youtubeRepository;

	@Override
	public void run (String...args) throws Exception {
		this.youtubeRepository.save(new YoutubeModel(3293));
	}
}
