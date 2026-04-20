package com.devsuperior.dslearn.entities;

import java.time.Instant;

import com.devsuperior.dslearn.entities.pk.EnrollmentPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

	//chave composta. A chave composta é representada por uma classe auxiliar que tem os atributos que compoem a chave composta. No caso, a chave composta é formada pelos atributos user e offer. Esses atributos sao do tipo User e Offer, respectivamente. A classe auxiliar deve ser serializavel e deve implementar os metodos hashCode e equals
	
	@EmbeddedId //indica que a chave primaria é composta por uma classe auxiliar
	private EnrollmentPK id = new EnrollmentPK(); //instanciar
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //definir o tipo da coluna no banco de dados)
	private Instant enrollMoment;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //por questao de compatibilidade nos BD é recomendavel colocar isso
	private Instant refundMoment;
	
	private boolean available; //tipo primitivo verdadeiro ou falso. Se houver possibilidade de ser null, usar Boolean (Wrapper class)
	private boolean onlyUpdate; //tipo primitivo verdadeiro ou falso. Se houver possibilidade de ser null, usar Boolean (Wrapper class)
	
	public Enrollment() {
	}
	
	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available,
			boolean onlyUpdate) {
		id.setUser(user); // setar o user na chave composta
		id.setOffer(offer); // setar a offer na chave composta
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

	public User getUser() {
		return id.getUser(); // pegar o user da chave composta
	}
	
	public void setUser(User user) {
		id.setUser(user); // setar o user na chave composta
	}
	
	public Offer getOffer() {
		return id.getOffer(); // pegar a offer da chave composta
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer); // setar a offer na chave composta
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
	
}
