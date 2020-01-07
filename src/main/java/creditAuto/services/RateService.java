
package creditAuto.services;

import java.math.BigDecimal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import creditAuto.dao.RateDAO;

import creditAuto.model.Rate;

@Service
public class RateService {

	@Autowired
	private RateDAO rateDao;

	private Rate rate;

	private List<Rate> listUpdatedRate;

	public void createRate(Long id, String rateName, BigDecimal rateValue) {

		rate = new Rate(id, rateName, rateValue);
		System.out.println(rate + "service create");

		// rateDao.persist(rate);

	}

	public List<Rate> find() {

		listUpdatedRate = rateDao.findAll();
		System.out.println(listUpdatedRate + "service get");

		return listUpdatedRate;
	}
	
	public void updateARate(Rate rate) {
		rateDao.update(rate);
	}

}
