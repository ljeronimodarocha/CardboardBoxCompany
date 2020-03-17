package br.com.cardboardbox;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import br.com.cardboardbox.model.Prioridade;
import br.com.cardboardbox.service.Calculo;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.cardboardbox.model.Tipo;
import br.com.cardboardbox.model.TipoTransportadora;
import br.com.cardboardbox.model.Transportadora;
import br.com.cardboardbox.repository.TransportadoraRepository;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
public class testeCalcular {

    @Autowired
    private TransportadoraRepository repo;

    //private MockMvc mockMvc;

    @Test
    void calcular() {
		//Primeira transportadora
        Transportadora t1 = new Transportadora();
        t1.setId(1);
        TipoTransportadora tt1 = new TipoTransportadora();
        tt1.setTipo(Tipo.TERRESTRE);
        tt1.setTempo(1);
        tt1.setValor(50.00);
        t1.addTipoTransportadora(tt1);

		//segunda transportadora

        Transportadora t2 = new Transportadora();
        t2.setId(2);
        TipoTransportadora tt2 = new TipoTransportadora();
        //primeiro tipotransportadora
        tt2.setTipo(Tipo.AERO);
        tt2.setTempo(0.30);
        tt2.setValor(200.00);
		t2.addTipoTransportadora(tt2);
		//segundo tipo da transportadora
        TipoTransportadora tt3 = new TipoTransportadora();
        tt3.setTipo(Tipo.TERRESTRE);
        tt3.setTempo(0.59);
        tt3.setValor(75.00);
        t2.addTipoTransportadora(tt3);


        //terceira transportadora
		Transportadora t3 = new Transportadora();
		t3.setId(3);
		//primeiro tipotransportadora
		TipoTransportadora tt4 = new TipoTransportadora();
		tt4.setTipo(Tipo.AERO);
		tt4.setTempo(0.33);
		tt4.setValor(180.00);
		t3.addTipoTransportadora(tt4);
		//segunda tipotransportadora
		TipoTransportadora tt5 = new TipoTransportadora();
		tt5.setTipo(Tipo.TERRESTRE);
		tt5.setTempo(1.05);
		tt5.setValor(55.00);
		t3.addTipoTransportadora(tt5);


		Transportadora t4 = new Transportadora();
		t4.setId(3);
		//primeiro tipotransportadora
		TipoTransportadora tt6 = new TipoTransportadora();
		tt6.setTipo(Tipo.AERO);
		tt6.setTempo(0.30);
		tt6.setValor(175.00);
		t4.addTipoTransportadora(tt6);

		List<Transportadora> lista = new ArrayList<>();
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		lista.add(t4);

		Calculo c = new Calculo();
		//c.calcular("","", lista, Prioridade.menorPreco, 3875);

    }

}
