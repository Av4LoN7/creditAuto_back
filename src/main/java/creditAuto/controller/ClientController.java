package creditAuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import creditAuto.model.Client;
import creditAuto.services.ClientService;



	
	@RestController
	@CrossOrigin(origins="http://localhost:4200")
	//@CrossOrigin(origins="*")
	public class ClientController {
		
		@Autowired
		private ClientService clientService;

		@RequestMapping(value = "/nouveauClient", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Client getClient(@RequestBody Client client) {
			
			System.out.println(client +" controller ");
			clientService.createClient(client);
			
			return client;
		}
		
		@RequestMapping(value = "/searchclient", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Client findByEmail(String email) throws Exception {
			Client c2 = null;
			try {
				c2 = clientService.find(email);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return c2;
			
		}
		
		@RequestMapping(value = "/client/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public Client find(@PathVariable Long id) {
			return clientService.findById(id);
		}
		
		
	
}
