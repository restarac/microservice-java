package hello.controllers.offer.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import hello.services.models.profile.Address;
import hello.services.models.profile.Link;
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

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private LeadView lead;
		private String user_name;
		private String email;
		private int koins;
		private String cityNeighborhood;
		private Map<String, Link> links;

		Builder() {
			this.links = new HashMap<String, Link>();
		}

		public Builder withProfile(Profile profile) {
			User user = profile.getUser();
			user_name = user.getName();
			email = user.getEmail();
			koins = 0;
			links.put("bundles", profile.getLinks().get("plan"));

			withAddress(profile.getAddress());
			return this;
		}

		public Builder withAddress(Address address) {
			cityNeighborhood = address.getCity() + address.getNeighborhood();

			return this;
		}

		public Builder withLeadCount(Integer lead) {
			this.lead = new LeadView(lead);
			return this;
		}

		public OfferViewWithProfile build() {
			ProfileView profileView = new ProfileView(user_name, email, koins, cityNeighborhood, links);
			return new OfferViewWithProfile(profileView, lead);
		}
	}
}

class ProfileView {
	private String name;
	private String email;
	private int koins;
	private String nc;
	@JsonProperty("_links")
	private Map<String, Link> links;

	public Map<String, Link> getLinks() {
		return links;
	}

	public void setLinks(Map<String, Link> links) {
		this.links = links;
	}

	public ProfileView(String name, String email, int koins, String nc, Map<String, Link> links) {
		this.name = name;
		this.email = email;
		this.koins = koins;
		this.nc = nc;
		this.links = links;
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

	public String getNc() {
		return nc;
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
