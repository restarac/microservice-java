package hello.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import hello.services.models.profile.Profile;

@Service
public class ProfileService {
    private static final String PROFILE_HOST = "http://localhost:3000";
	private final RestTemplate restTemplate;
	
    public ProfileService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

    public Profile getProfile(String token) {
        return this.restTemplate.getForObject(PROFILE_HOST + "/profile?token={token}", Profile.class, token);
    }
}
