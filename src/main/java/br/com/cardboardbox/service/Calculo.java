package br.com.cardboardbox.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.cardboardbox.model.Prioridade;
import br.com.cardboardbox.model.Tipo;
import br.com.cardboardbox.model.Transportadora;

public class Calculo {

	public Transportadora calcular(String origem, String destino, Tipo tipo, List<Transportadora> transportadoras,
			Prioridade prioridade, int distancia) {
		List<Transportadora> filtraTipo = new ArrayList<>();
		for (Transportadora transportadora : transportadoras) {
			if (transportadora.getTipo() == tipo) {
				filtraTipo.add(transportadora);
			}
		}
		ordenarTransportado(filtraTipo, prioridade, distancia);
		return transportadoras.get(0);
	}

	public void calcular(String origem, String destino, List<Transportadora> transportadoras, Prioridade prioridade,
			int distancia) {
		ordenarTransportado(transportadoras, prioridade, distancia);

	}

	private void ordenarTransportado(List<Transportadora> transportadoras, Prioridade prioridade, int distancia) {

		if (prioridade == Prioridade.menorPreco) {
			transportadoras.sort(Comparator.comparingDouble(Transportadora::getValor));
			List<Double> uniques = new ArrayList<Double>();
			List<Double> duplicates = new ArrayList<Double>();
			
			for (Transportadora transportadora : transportadoras) {
				double valor = transportadora.getValor();
				if(true) {
					uniques.add(valor);
				}else {
					duplicates.add(valor);
				}
				
			}
			System.out.println(duplicates.toString());

		} else if (prioridade == Prioridade.menorTempo) {
			transportadoras.sort(Comparator.comparingDouble(Transportadora::getTempo));
		}

	}

}
