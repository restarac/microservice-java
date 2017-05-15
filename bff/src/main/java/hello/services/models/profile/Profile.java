package hello.services.models.profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {

	private Integer id;
	private String job;
	private Address address;
	private Integer balance;
	private String rootCategory;
	private List<String> breadcrumb = null;
	private User user;
	private Integer unreadLeads;
	private String cellphone;
	@JsonProperty("_links")
	private Map<String, Link> links;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getRootCategory() {
		return rootCategory;
	}

	public void setRootCategory(String rootCategory) {
		this.rootCategory = rootCategory;
	}

	public List<String> getBreadcrumb() {
		return breadcrumb;
	}

	public void setBreadcrumb(List<String> breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getUnreadLeads() {
		return unreadLeads;
	}

	public void setUnreadLeads(Integer unreadLeads) {
		this.unreadLeads = unreadLeads;
	}

	public Map<String, Link> getLinks() {
		return links;
	}

	public void setLinks(Map<String, Link> links) {
		this.links = links;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

}