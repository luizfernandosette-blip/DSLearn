package com.devsuperior.dslearn.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.devsuperior.dslearn.entities.Offer;
import com.devsuperior.dslearn.entities.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //essa classe define atributos de outra classe
public class EnrollmentPK implements Serializable {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//JPA nao trabalha com chave composta. Para isso precisamos criar uma classe auxiliar para representar a chave composta. Essa classe deve ser serializavel e deve implementar os metodos hashCode e equals
  
	@ManyToOne
	@JoinColumn(name = "user_id") //definir o nome da coluna que vai ser criada no banco de dados para representar a chave estrangeira do user
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "offer_id") //definir o nome da coluna que vai ser criada no banco de dados para representar a chave estrangeira da offer
	private Offer offer;
	
	public EnrollmentPK() {
	}
	
	public EnrollmentPK(User user, Offer offer) {
		this.user = user;
		this.offer = offer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(offer, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollmentPK other = (EnrollmentPK) obj;
		return Objects.equals(offer, other.offer) && Objects.equals(user, other.user);
	}
	
	
}
