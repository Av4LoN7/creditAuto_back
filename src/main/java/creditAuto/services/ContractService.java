package creditAuto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import creditAuto.dao.ContractDAO;
import creditAuto.model.Contract;
import creditAuto.model.VehicleCategory;

@Service
public class ContractService {

	@Autowired
	private ContractDAO contractDao;

	public void createContract(Contract contract) {
		contractDao.persist(contract);
	}
}