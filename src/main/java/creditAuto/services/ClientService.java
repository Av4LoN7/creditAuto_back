package creditAuto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creditAuto.dao.ClientDAO;
import creditAuto.model.Client;

@Service
public class ClientService {
	
	@Autowired
	private ClientDAO clientDao;
	
	public void createClient(Client client) {
		clientDao.persist(client);
	}
	
	public Client find(String email) {
		Client c = clientDao.findByEmail(email);
		return c;
	}
	
	public Client findById(Long id) {
		return clientDao.findById(id);
	}

}
