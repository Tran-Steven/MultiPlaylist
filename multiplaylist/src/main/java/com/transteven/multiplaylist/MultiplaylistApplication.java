package com.transteven.multiplaylist;

import com.transteven.multiplaylist.playlist.model.Playlist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class MultiplaylistApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultiplaylistApplication.class, args);
	}

	@GetMapping
	public List<Playlist> hello(){
		return List.of(
				new Playlist(
						1L,
						"youtube",
						"playlist"
				)
		);
	}
}
