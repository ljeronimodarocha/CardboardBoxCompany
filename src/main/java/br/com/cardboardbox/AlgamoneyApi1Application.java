package br.com.cardboardbox;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.cardboardbox.model.Prioridade;
import br.com.cardboardbox.model.Tipo;
import br.com.cardboardbox.model.Transportadora;
import br.com.cardboardbox.service.Calculo;

@SpringBootApplication
public class AlgamoneyApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApi1Application.class, args);

		Transportadora transportadora1 = new Transportadora(1, Tipo.TERRESTRE, 55.00, 1);
		Transportadora transportadora2 = new Transportadora(2, Tipo.AEREO, 200.00, 0.30);
		Transportadora transportadora3 = new Transportadora(3, Tipo.TERRESTRE, 75.00, 00.59);
		Transportadora transportadora4 = new Transportadora(4, Tipo.AEREO, 180.00, 0.33);
		Transportadora transportadora5 = new Transportadora(5, Tipo.TERRESTRE, 55.00, 1.05);
		Transportadora transportadora6 = new Transportadora(6, Tipo.AEREO, 175.00, 0.30);
		
		List<Transportadora> transportadoras = new ArrayList<>();
		transportadoras.add(transportadora1);
		transportadoras.add(transportadora2);
		transportadoras.add(transportadora3);
		transportadoras.add(transportadora4);
		transportadoras.add(transportadora5);
		transportadoras.add(transportadora6);
		
		Calculo c = new Calculo();
		c.calcular("", "", Tipo.TERRESTRE, transportadoras,  Prioridade.menorPreco, 3875);
	}

}
