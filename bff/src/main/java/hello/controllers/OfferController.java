package hello.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
		Profile profile = profileService.getProfile("123111");
		OfferViewWithProfile offerViewWithProfile = OfferViewWithProfile.buildWithProfile(profile).withLeadCount(10).build();
		return offerViewWithProfile;
	}
}
