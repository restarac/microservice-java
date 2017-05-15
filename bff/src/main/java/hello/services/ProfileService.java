package hello.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;

import hello.services.models.profile.Profile;

@Service
public class ProfileService {
	private static final String PROFILE_HOST = "http://skarlet.getninjas.com.br";
	private final AsyncRestTemplate restTemplate;

	public ProfileService(AsyncRestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public ListenableFuture<ResponseEntity<Profile>> getProfile(String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", "application/json");
		headers.add("GN-APIKEY", "stage_apikey");

		HttpEntity<String> entity = new HttpEntity<String>("", headers);

		ListenableFuture<ResponseEntity<Profile>> response = this.restTemplate.exchange(PROFILE_HOST + "/api/profiles/{id}",
				HttpMethod.GET, entity, Profile.class, id);
		return response;
	}
}
