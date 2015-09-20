package training.crudproject.sample.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "clientId")
	String clientId;
	
	@Column(name = "name") 
	String name;
	
	@Column(name = "registrationTime")
	Date registrationTime;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name
				+ ", registrationTime=" + registrationTime + "]";
	}	
}
