package creditAuto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import creditAuto.model.Rate;

@Service
public final class RateMapper implements RowMapper<Rate>{

    public Rate mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rate rateTemp = new Rate();
        rateTemp.setRateValue(rs.getBigDecimal("rateValue"));
        rateTemp.setId(rs.getLong("id"));
        rateTemp.setRateName(rs.getString("rateName"));
        return rateTemp;
    }

}
