package br.com.cardboardbox.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Transportadora {

   /* @Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    private int id;


    private List<TipoTransportadora> tipoTransportadora = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TipoTransportadora> getTipoTransportadora() {
        return tipoTransportadora;
    }



    public void addTipoTransportadora( TipoTransportadora tipoTransportadora) {

        this.tipoTransportadora.add(tipoTransportadora);

    }

    public void removeTipoTransportadora(TipoTransportadora tipoTransportadora) {
        this.tipoTransportadora.remove(tipoTransportadora);
    }

    @Override
    public String toString() {
        return "Transportadora{" +
                "id=" + id +
                ", tipoTransportadora=" + tipoTransportadora +
                '}';
    }


}
