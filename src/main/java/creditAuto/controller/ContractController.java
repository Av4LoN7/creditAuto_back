package creditAuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import creditAuto.model.Contract;
import creditAuto.services.ContractService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContractController {

	@Autowired
	private ContractService contractService;

	@RequestMapping(value = "/contract", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Contract sendContract(@RequestBody Contract contract) {
		this.contractService.createContract(contract);
		System.out.println(contract + " contract controller ");

		return contract;
	}

//	@RequestMapping(value = "/contract", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public Contract sendContract(@RequestBody Contract contract, Client client) {
//
//		this.contractService.createContract(contract.getId(), contract.getContractNumber(),
//				contract.getPaymentStartDate(), contract.getPaymentEndDate(), contract.getClosureDate(),
//				contract.getPurchaseAmount(), contract.getLoanTotalCost(), contract.getLoanDuration(),
//				contract.getVehicleCategory(), contract.getLoanRate());
//
//		System.out.println(contract + " contract controller ");
//
//		return contract;
//	}
}
