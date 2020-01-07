package creditAuto.mapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import creditAuto.dao.ContractDAO;
import creditAuto.model.Contract;
import creditAuto.model.VehicleCategory;

@Service
public final class ContractMapper implements RowMapper<Contract>{
	
	@Autowired
	ContractDAO clientd;

	public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contract contractTemp = new Contract();
		contractTemp.setId(rs.getLong("id"));
		
		contractTemp.setClosureDate(rs.getString("closuredate"));
		contractTemp.setContractNumber(rs.getInt("contractnumber"));
		contractTemp.setLoanDuration(rs.getInt("loanduration"));
		contractTemp.setLoanRate(BigDecimal.valueOf(rs.getInt("loanrate")));
		contractTemp.setLoanTotalCost(BigDecimal.valueOf(rs.getInt("loantotalcost")));
		contractTemp.setPaymentEndDate(rs.getString("paymentenddate"));
		contractTemp.setPaymentStartDate(rs.getString("paymentstartdate"));
		contractTemp.setPurchaseAmount(BigDecimal.valueOf(rs.getInt("purchaseamount")));
		
		contractTemp.setVehicleCategory(rs.getString("vehiclecategory") == "A" ? VehicleCategory.A : VehicleCategory.B);
		
		return contractTemp;
	}



}
