package br.com.cardboardbox.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/transportadora")
public class TransportadoraResource {
	
	@GetMapping
	public void teste() {
		
	}

}
