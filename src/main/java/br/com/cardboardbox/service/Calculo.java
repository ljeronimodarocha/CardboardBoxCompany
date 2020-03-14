package br.com.cardboardbox.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.cardboardbox.model.Prioridade;
import br.com.cardboardbox.model.TipoTransporte;
import br.com.cardboardbox.model.Transportadora;

public class Calculo {

	private List<Transportadora> filtraTipo = new ArrayList<>();

	public Transportadora calcular(String origem, String destino, TipoTransporte tipo, List<Transportadora> transportadoras,
			Prioridade prioridade, int distancia) {
		for (Transportadora transportadora : transportadoras) {
			if (transportadora.getTipo() == tipo) {
				filtraTipo.add(transportadora);
			}
		}
		ordenarTransportado(transportadoras, prioridade, distancia);
		return transportadoras.get(0);
	}

	public void calcular(String origem, String destino, List<Transportadora> transportadoras, Prioridade prioridade,
			int distancia) {
		ordenarTransportado(transportadoras, prioridade, distancia);

	}

	private void ordenarTransportado(List<Transportadora> transportadoras, Prioridade prioridade, int distancia) {
		if (prioridade == Prioridade.menorPreco) {
			transportadoras.sort(Comparator.comparingDouble(Transportadora::getValor));
		} else if (prioridade == Prioridade.menorTempo) {
			transportadoras.sort(Comparator.comparingInt(Transportadora::getTempo));
		}
		System.out.println(distancia * transportadoras.get(0).getValor() / 10);
	}

}
