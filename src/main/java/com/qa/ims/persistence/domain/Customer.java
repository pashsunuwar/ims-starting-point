package com.qa.ims.persistence.domain;

public class Customer {

	private Long id;
	private String forename;
	private String surname;
	private String username;
	private String password;
	private String email;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", forename=" + forename + ", surname=" + surname + ", username=" + username
				+ ", password=" + password + ", email=" + email + "]";
	}

	public Customer(String forename, String surname, String username, String password, String email) {
		this.forename = forename;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Customer(Long id, String forename, String surname) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
	}

	// generated constructor using fields
	public Customer(Long id, String forename, String surname, String username, String password, String email) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	// generated getters and setters for username, pass, @.com
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((forename == null) ? 0 : forename.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (forename == null) {
			if (other.forename != null)
				return false;
		} else if (!forename.equals(other.forename))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}