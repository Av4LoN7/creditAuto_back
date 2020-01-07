package creditAuto.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import creditAuto.model.Rate;
import creditAuto.services.RateService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RateController {	

	@Autowired
	private RateService rateService;


	@RequestMapping(value = "/rate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void sendRate(@RequestBody Rate rate) {

		//List<Rate> listRate = new ArrayList<Rate>();

		/*for (Rate r : listRate) {
			this.rateService.createRate(r.getId(), r.getRateName(),r.getRateValue());
			System.out.println(rate +" rate controller ");
		}*/
		// return listRate;
//		System.out.println(rate);
		rateService.updateARate(rate);
		
	}

	

	@RequestMapping(value = "/rate", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Rate> find() throws Exception {
		List<Rate> listUpdatedRate = null;

		try {
			listUpdatedRate = rateService.find();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return listUpdatedRate;
	}

}
