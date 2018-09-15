package models;

public class Organization {
	private String id;
	private String name;
	private String alternate_name;
	private String description;
	private String email;
	private String url;
	private String tax_status;
	private String tax_id;
	private String year_incorporated;
	private String legal_status;

	public Organization(String id, String name, String alternate_name, String description, String email, String url, String tax_status, String tax_id, String year_incorporated, String legal_status) {
		this.id = id;
		this.name = name;
		this.alternate_name = alternate_name;
		this.description = description;
		this.email = email;
		this.url = url;
		this.tax_status = tax_status;
		this.tax_id = tax_id;
		this.year_incorporated = year_incorporated;
		this.legal_status = legal_status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternate_name() {
		return alternate_name;
	}

	public void setAlternate_name(String alternate_name) {
		this.alternate_name = alternate_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTax_status() {
		return tax_status;
	}

	public void setTax_status(String tax_status) {
		this.tax_status = tax_status;
	}

	public String getTax_id() {
		return tax_id;
	}

	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}

	public String getYear_incorporated() {
		return year_incorporated;
	}

	public void setYear_incorporated(String year_incorporated) {
		this.year_incorporated = year_incorporated;
	}

	public String getLegal_status() {
		return legal_status;
	}

	public void setLegal_status(String legal_status) {
		this.legal_status = legal_status;
	}

	@Override
	public String toString() {
		return "Organization{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", alternate_name='" + alternate_name + '\'' +
				", description='" + description + '\'' +
				", email='" + email + '\'' +
				", url='" + url + '\'' +
				", tax_status='" + tax_status + '\'' +
				", tax_id='" + tax_id + '\'' +
				", year_incorporated='" + year_incorporated + '\'' +
				", legal_status='" + legal_status + '\'' +
				'}';
	}
}
