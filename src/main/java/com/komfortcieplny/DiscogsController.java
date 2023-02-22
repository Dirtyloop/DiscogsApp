package com.komfortcieplny;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DiscogsController {
    @RequestMapping("/discogs")
    public String discogs() {
        return "Discogs";
    }

    @GetMapping("/artists/{artist_id}")
    public String getArtistProfile(@PathVariable Long artist_id) {
        String url = "https://api.discogs.com/artists/" + artist_id;
        RestTemplate restTemplate = new RestTemplate();

        Artist artist = restTemplate.getForObject(url, Artist.class);

        return artist.toString();
    }

    @GetMapping("/releases/{release_id}")
    public String getNeverGonnaGiveYouUp(@PathVariable Long release_id) {
        String url = "https://api.discogs.com/releases/" + release_id;
        RestTemplate restTemplate = new RestTemplate();

        Release release = restTemplate.getForObject(url, Release.class);

        System.out.println("Artist: " + release.getArtists_sort());
        System.out.println("Release title: " + release.getTitle());

        return release.toString();
    }
}
