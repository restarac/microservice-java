package hello.controllers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.controllers.offer.model.OfferViewWithProfile;
import hello.services.ProfileService;
import hello.services.models.profile.Profile;

@RestController
public class OfferController {

	@Autowired
	private ProfileService profileService;

	@RequestMapping("bff/offer")
	public OfferViewWithProfile offerView(String token) {
		ListenableFuture<ResponseEntity<Profile>> futProfile = profileService.getProfile("222417");

		Profile profile;
		try {
			profile = futProfile.get().getBody();

			OfferViewWithProfile offerViewWithProfile = OfferViewWithProfile.builder().withProfile(profile)
					.withLeadCount(10).build();
			return offerViewWithProfile;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
