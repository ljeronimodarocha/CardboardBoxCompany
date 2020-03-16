package br.com.cardboardbox.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
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
	@Embedded
	private Tipo tipo;

	private double valor;
	private double tempo;

	public Transportadora(int id, @NotNull Tipo tipo, double valor, double tempo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.valor = valor;
		this.tempo = tempo;
	}

	public Transportadora() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {

		return "Tempo: " + getTempo() + ", Valor: " + getValor() + ", Tipo: " + getTipo() + ", ID: " + getId()
				+ ", Tipo: " + getTipo();
	}

}
