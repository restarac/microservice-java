
package hello.services.models.profile;

import java.util.HashMap;
import java.util.Map;

public class Links {

	private Self self;
	private Leads leads;
	private Plan plan;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	public Leads getLeads() {
		return leads;
	}

	public void setLeads(Leads leads) {
		this.leads = leads;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}


	public class Self {

	private String href;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getHref() {
	return href;
	}

	public void setHref(String href) {
	this.href = href;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
}