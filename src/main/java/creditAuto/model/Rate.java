package creditAuto.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rate {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String rateName;
	
	@Column
	private BigDecimal rateValue;

	// Constructor
	public Rate() {
		
	}
	
	public Rate(Long id, String rateName, BigDecimal rateValue) {
		this.id = id;
		this.rateValue = rateValue;
		this.rateName = rateName;
	}

	// Getters/Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getRateValue() {
		return rateValue;
	}

	public void setRateValue(BigDecimal rateValue) {
		this.rateValue = rateValue;
	}

	public String getRateName() {
		return rateName;
	}

	public void setRateName(String rateName) {
		this.rateName = rateName;
	}

	@Override
	public String toString() {
		return "Rate [id=" + id + ", rateName=" + rateName + ", rateValue=" + rateValue + "]";
	}
	
	

	
	
	

}
