package br.com.cardboardbox.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Transportadora {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private double valor;
	@NotNull
	private int tempo;

	@Enumerated(EnumType.ORDINAL)
	private TipoTransporte tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public TipoTransporte getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransporte tipo) {
		this.tipo = tipo;
	}

}
