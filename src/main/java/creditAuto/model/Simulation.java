package creditAuto.model;

import java.math.BigDecimal;

public class Simulation {
	
	private BigDecimal purchaseAmount;
	private BigDecimal loanAmount;
	private int loanDuration;
	private VehicleCategory vehicleCategory;
	private BigDecimal loanRate;
	private BigDecimal monthlyPayment;
	private BigDecimal loanTotalCost;
	
	
	// Constructor
	public Simulation() {}
	
	public Simulation(BigDecimal purchaseAmount, BigDecimal loanAmount, int loanDuration, VehicleCategory vehicleCategory) {
		super();
		this.purchaseAmount = purchaseAmount;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.vehicleCategory = vehicleCategory;
	}
	
	public Simulation(BigDecimal purchaseAmount, BigDecimal loanAmount, int loanDuration, VehicleCategory vehicleCategory,
			BigDecimal loanRate, BigDecimal monthlyPayment, BigDecimal loanTotalCost) {
		super();
		this.purchaseAmount = purchaseAmount;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.vehicleCategory = vehicleCategory;
		this.loanRate = loanRate;
		this.monthlyPayment = monthlyPayment;
		this.loanTotalCost = loanTotalCost;
	}
	
	//getters/setters

	public BigDecimal getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public VehicleCategory getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(VehicleCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public BigDecimal getLoanRate() {
		return loanRate;
	}

	public void setLoanRate(BigDecimal loanRate) {
		this.loanRate = loanRate;
	}

	public BigDecimal getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(BigDecimal monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public BigDecimal getLoanTotalCost() {
		return loanTotalCost;
	}

	public void setLoanTotalCost(BigDecimal loanTotalCost) {
		this.loanTotalCost = loanTotalCost;
	}

	@Override
	public String toString() {
		return "Simulation [purchaseAmount=" + purchaseAmount + ", loanAmount=" + loanAmount + ", loanDuration="
				+ loanDuration + ", vehicleCategory=" + vehicleCategory + ", loanRate=" + loanRate + ", monthlyPayment="
				+ monthlyPayment + ", loanTotalCost=" + loanTotalCost + "]";
	}
	


}
