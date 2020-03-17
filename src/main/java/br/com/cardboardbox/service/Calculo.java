package br.com.cardboardbox.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.cardboardbox.model.Prioridade;
import br.com.cardboardbox.model.Tipo;
import br.com.cardboardbox.model.TipoTransportadora;
import br.com.cardboardbox.model.Transportadora;

public class Calculo {

    public List<Transportadora> calcular(String origem, String destino, Tipo tipo,
                                         List<Transportadora> transportadoras, Prioridade prioridade, int distancia) {
        List<Transportadora> filtraTipo = new ArrayList<>();
        for (Transportadora
                transportadora : transportadoras) {
            for (int i = 0; i < transportadora.getTipoTransportadora().size(); i++) {
                if (transportadora.getTipoTransportadora().get(i).getTipo() != tipo) {
                    transportadora.removeTipoTransportadora(transportadora.getTipoTransportadora().get(i));
                    filtraTipo.add(transportadora);
                }
            }
        }
        System.out.println(filtraTipo.toString());
        return this.ordenarTransportado(filtraTipo,
                prioridade, distancia);

    }

    public List<Transportadora> calcular(String origem, String destino,
                                         List<Transportadora> transportadoras, Prioridade prioridade, int distancia) {

        return ordenarTransportado(transportadoras, prioridade, distancia);
    }


    public List<Transportadora> ordenarTransportado(List<Transportadora> transportadoras,
                                                    Prioridade prioridade, int distancia) {
        List<Transportadora> t = new ArrayList<>();
        if (prioridade == Prioridade.menorPreco) {
            transportadoras = menorPreco(transportadoras);
            for (int i = 0; i < transportadoras.size(); i++) {
                if (i != 0) {
                    if (transportadoras.get(i - 1).getTipoTransportadora().get(0).getValor() > transportadoras.get(i).getTipoTransportadora().get(0).getValor()) {
                        transportadoras.remove(i - 1);
                    }
                }
            }
            return transportadoras;
        } else if (prioridade == Prioridade.menorTempo) {
            return transportadoras = menorTempo(transportadoras);
        }
        return transportadoras;
    }

    private List<Transportadora> menorTempo(List<Transportadora> transportadoras) {
        double valor = 99999;
        for (Transportadora transportadora : transportadoras) {
            for (TipoTransportadora tipoTransportadora : transportadora.getTipoTransportadora()) {
                if (valor == tipoTransportadora.getTempo()) {
                    //duplicadas.add(tipoTransportadora);
                } else if (valor < tipoTransportadora.getTempo()) {
                    valor = tipoTransportadora.getTempo();
                }
            }
        }
        return transportadoras;
    }

    private List<Transportadora> menorPreco(List<Transportadora> transportadoras) {
        for (Transportadora transportadora : transportadoras) {
            transportadora.getTipoTransportadora().sort(Comparator.comparingDouble(TipoTransportadora::getValor));

            for (int i = 0; i < transportadora.getTipoTransportadora().size(); i++) {
                System.out.println("size: " + transportadora.getTipoTransportadora().size());
                if (i != 0) {
                    if (transportadora.getTipoTransportadora().get(i - 1).getValor() < transportadora.getTipoTransportadora().get(i).getValor()) {
                        System.out.println("a: " + transportadora.getTipoTransportadora().get(i - 1).getValor());
                        System.out.println("a: " + transportadora.getTipoTransportadora().get(i).getValor());
                        transportadora.removeTipoTransportadora(transportadora.getTipoTransportadora().get(i - 1));
                    }

                }
            }
        }
        return transportadoras;
    }
}
