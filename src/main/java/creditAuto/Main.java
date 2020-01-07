package creditAuto;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		System.out.println("Context loaded !");

        /*Simulation simu = new Simulation(BigDecimal.valueOf(9000),BigDecimal.valueOf(7500),28, VehicleCategory.A);
        RateCalculations.applyRateAndCalculateTotalCost(simu);
        RateCalculations.newValuesFromProductOwnerCalculateTotalCost(simu);*/
		
	}

}
