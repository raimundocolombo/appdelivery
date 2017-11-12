package br.com.bsbmob.appdelivery.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bsbmob.appdelivery.domain.Pedido;
import br.com.bsbmob.appdelivery.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		
		Pedido ped1 = service.buscar(id);
		
		return ResponseEntity.ok().body(ped1);
	}

}