package io.girirajvyas.gof.designpatterns.structural.adapter;

/**
 * Consider this class is not in your control and you have to map this to your
 * class
 * 
 * @author Giriraj_Vyas
 *
 */
public class EmployeeLdap {

	private String cn;
	private String surname;
	private String givenName;
	private String mail;

	public EmployeeLdap(String cn, String surname, String givenName, String mail) {
		super();
		this.cn = cn;
		this.surname = surname;
		this.givenName = givenName;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}

	public String getSurname() {
		return surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getMail() {
		return mail;
	}
}
