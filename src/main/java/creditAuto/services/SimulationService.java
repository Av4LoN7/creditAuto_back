package creditAuto.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import creditAuto.model.Simulation;
import creditAuto.model.VehicleCategory;
import creditAuto.utils.RateCalculations;


@Service
public class SimulationService {
	
	private Simulation newSimul;
	
	private List<Simulation> listSimul;
	
	private void rateCalculation(Simulation simul) {
		RateCalculations.applyRateAndCalculateTotalCost(simul);
        RateCalculations.newValuesFromProductOwnerCalculateTotalCost(simul);
		//BigDecimal rateValue = BigDecimal.valueOf(0);
		//return rateValue;
	}
	
	public void createSimul(BigDecimal purchaseAmount, BigDecimal loanAmount, int loanDuration, VehicleCategory vehicleCategory) { 
		newSimul= new Simulation(purchaseAmount, loanAmount, loanDuration, vehicleCategory);
		System.out.println(newSimul);
		//listSimul.add(newSimul);
		
	}
	
	public void sendBackRate(Simulation newSimul) {
		rateCalculation(newSimul);
		//return rateValue;
	}
}
