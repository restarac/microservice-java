package hello.controllers.offer.model;

import hello.services.models.profile.Profile;
import hello.services.models.profile.User;

public class OfferViewWithProfile {

	private ProfileView profile;
	private LeadView lead;

	private OfferViewWithProfile(ProfileView profile, LeadView lead) {
		this.profile = profile;
		this.lead = lead;
	}

	public ProfileView getProfile() {
		return profile;
	}

	public LeadView getLead() {
		return lead;
	}

	public static Builder buildWithProfile(Profile profileService) {
		return new Builder(profileService);
	}

	public static class Builder {

		private ProfileView profileView;
		private LeadView lead;

		public Builder(Profile profileService) {
			User user = profileService.getUser();
			this.profileView = new ProfileView(user.getName(), user.getEmail(), profileService.getBalance().intValue());
		}

		public Builder withLeadCount(Integer lead) {
			this.lead = new LeadView(lead);
			return this;
		}

		public OfferViewWithProfile build() {
			return new OfferViewWithProfile(profileView, lead);
		}
	}
}

class ProfileView {
	private String name;
	private String email;
	private int koins;

	public ProfileView(String name, String email, int koins) {
		this.name = name;
		this.email = email;
		this.koins = koins;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getKoins() {
		return koins;
	}
}

class LeadView {
	private Integer count;

	public LeadView(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}
}