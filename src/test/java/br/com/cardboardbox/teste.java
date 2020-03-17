package br.com.cardboardbox;

import br.com.cardboardbox.model.Prioridade;
import br.com.cardboardbox.model.Tipo;
import br.com.cardboardbox.model.TipoTransportadora;
import br.com.cardboardbox.model.Transportadora;
import br.com.cardboardbox.service.Calculo;

import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        //Primeira transportadora
        Transportadora t1 = new Transportadora();
        t1.setId(1);
        TipoTransportadora tt1 = new TipoTransportadora();
        tt1.setId(1);
        tt1.setTipo(Tipo.TERRESTRE);
        tt1.setTempo(1);
        tt1.setValor(50.0);
        //System.out.println(tt1.toString());
        t1.addTipoTransportadora(tt1);


        //segunda transportadora

        Transportadora t2 = new Transportadora();
        t2.setId(2);
        TipoTransportadora tt2 = new TipoTransportadora();
        //primeiro tipotransportadora
        tt2.setId(2);
        tt2.setTipo(Tipo.AERO);
        tt2.setTempo(0.30);
        tt2.setValor(200.0);
        t2.addTipoTransportadora(tt2);
        //segundo tipo da transportadora
        TipoTransportadora tt3 = new TipoTransportadora();
        tt3.setId(3);
        tt3.setTipo(Tipo.TERRESTRE);
        tt3.setTempo(0.59);
        tt3.setValor(75.0);
        t2.addTipoTransportadora(tt3);


        //terceira transportadora
        Transportadora t3 = new Transportadora();
        t3.setId(3);
        //primeiro tipotransportadora
        TipoTransportadora tt4 = new TipoTransportadora();
        tt4.setId(4);
        tt4.setTipo(Tipo.AERO);
        tt4.setTempo(0.33);
        tt4.setValor(180.0);
        t3.addTipoTransportadora(tt4);
        //segunda tipotransportadora
        TipoTransportadora tt5 = new TipoTransportadora();
        tt5.setId(5);
        tt5.setTipo(Tipo.TERRESTRE);
        tt5.setTempo(1.05);
        tt5.setValor(50.0);
        t3.addTipoTransportadora(tt5);


        Transportadora t4 = new Transportadora();
        t4.setId(3);
        //primeiro tipotransportadora
        TipoTransportadora tt6 = new TipoTransportadora();
        tt6.setId(6);
        tt6.setTipo(Tipo.AERO);
        tt6.setTempo(0.30);
        tt6.setValor(175.0);
        t4.addTipoTransportadora(tt6);

        List<Transportadora> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);

        Calculo c = new Calculo();
        lista = c.calcular("", "",  lista, Prioridade.menorPreco, 3875);
        for (Transportadora t : lista) {
            System.out.println("teste: " + t.getTipoTransportadora().toString());
        }
    }
}
