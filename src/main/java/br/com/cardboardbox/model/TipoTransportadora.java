package br.com.cardboardbox.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TipoTransportadora implements Comparable<Double> {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    private int id;
    private double valor;
    private double tempo;


    //@Enumerated(EnumType.ORDINAL)
    private Tipo tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return this.valor;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoTransportadora{" +
                "id=" + id +
                ", valor=" + valor +
                ", tempo=" + tempo +
                ", tipo=" + tipo +
                '}';
    }



    @Override
    public int compareTo(Double o) {
        if(this.getValor() > o){
            return 1;
        }if(this.getValor() < o){
            return -1;
        }
        return 0;
    }
}
