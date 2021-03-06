package com.invensense.sync.impl;

import java.util.Date;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import com.invensense.model.FinanceForeCast;
import com.invensense.model.FinanceForeCastHistory;
import com.invensense.model.ForeCast;
import com.invensense.service.EntityService;
import com.invensense.util.Constants;

@Service
public class SyncFinanceForecastPostJanuary extends AbstractSyncFinanceForecast {
	
	private Logger log = Logger.getLogger(SyncFinanceForecastPostJanuary.class);
	
	@Resource
	private EntityService entityService;
	
	protected void updateFinanceForecastFutureMonthsFromSalesForecast(FinanceForeCast financeForeCast, ForeCast salesForecast) {
		financeForeCast.setAsp11(salesForecast.getAsp11());
		financeForeCast.setAsp12(salesForecast.getAsp12());
		financeForeCast.setQuantity11(salesForecast.getQuantity11());
		financeForeCast.setQuantity12(salesForecast.getQuantity12());
		financeForeCast.setModifiedBy(Constants.INTEGRATION_USER);
		financeForeCast.setModifiedDate(new Date());
		entityService.save(financeForeCast);
	}

	@Override
	public void syncFinanceForecastFromHistory(ForeCast salesForecast, FinanceForeCastHistory financeForeCastHistory) throws Exception {
		FinanceForeCast financeForeCast = new FinanceForeCast();
		financeForeCast.setName(salesForecast.getRowId() + "-" + Constants.DEFAULT_FORECAST_MONTH + "-" + salesForecast.getYear());
		financeForeCast.setEndCustomerId(salesForecast.getEndCustomerId());
		financeForeCast.setProductId(salesForecast.getProductId());
		financeForeCast.setYear(salesForecast.getYear());
		financeForeCast.setMarket(salesForecast.getMarket());
		financeForeCast.setSubMarket(salesForecast.getSubMarket());
		financeForeCast.setBusinessUnit(salesForecast.getBusinessUnit());
		financeForeCast.setProgramName(salesForecast.getProgramName());
		financeForeCast.setMonth(Constants.DEFAULT_FORECAST_MONTH);
		financeForeCast.setForecastType(Constants.FORECAST_TYPE_FINANCE_FORECAST);
		financeForeCast.setParentEndCustomer(salesForecast.getParentEndCustomer());
		financeForeCast.setParentEndCustomerName(salesForecast.getParentEndCustomerName());
		financeForeCast.setOwner(salesForecast.getOwner());
		financeForeCast.setPartNumber(salesForecast.getPartNumber());
		financeForeCast.setProductCategory(salesForecast.getProductCategory());
		financeForeCast.setProductName(salesForecast.getProductName());
		financeForeCast.setSalesForecastRowId(salesForecast.getRowId());
		financeForeCast.setSalesRepId(salesForecast.getSalesRepId());
		financeForeCast.setRole(salesForecast.getRole());
		financeForeCast.setAsp1(financeForeCastHistory.getAsp1());
		financeForeCast.setAsp2(financeForeCastHistory.getAsp2());
		financeForeCast.setAsp3(financeForeCastHistory.getAsp3());
		financeForeCast.setAsp4(financeForeCastHistory.getAsp4());
		financeForeCast.setAsp5(financeForeCastHistory.getAsp5());
		financeForeCast.setAsp6(financeForeCastHistory.getAsp6());
		financeForeCast.setAsp7(financeForeCastHistory.getAsp7());
		financeForeCast.setAsp8(financeForeCastHistory.getAsp8());
		financeForeCast.setAsp9(financeForeCastHistory.getAsp9());
		financeForeCast.setAsp10(financeForeCastHistory.getAsp10());
		financeForeCast.setAsp11(salesForecast.getAsp11());
		financeForeCast.setAsp12(salesForecast.getAsp12());
		financeForeCast.setQuantity1(financeForeCastHistory.getQuantity1());
		financeForeCast.setQuantity2(financeForeCastHistory.getQuantity2());
		financeForeCast.setQuantity3(financeForeCastHistory.getQuantity3());
		financeForeCast.setQuantity4(financeForeCastHistory.getQuantity4());
		financeForeCast.setQuantity5(financeForeCastHistory.getQuantity5());
		financeForeCast.setQuantity6(financeForeCastHistory.getQuantity6());
		financeForeCast.setQuantity7(financeForeCastHistory.getQuantity7());
		financeForeCast.setQuantity8(financeForeCastHistory.getQuantity8());
		financeForeCast.setQuantity9(financeForeCastHistory.getQuantity9());
		financeForeCast.setQuantity10(financeForeCastHistory.getQuantity10());
		financeForeCast.setQuantity11(salesForecast.getQuantity11());
		financeForeCast.setQuantity12(salesForecast.getQuantity12());
		financeForeCast.setCreatedBy(Constants.INTEGRATION_USER);
		financeForeCast.setModifiedBy(Constants.INTEGRATION_USER);
		financeForeCast.setCreatedDate(new Date());
		financeForeCast.setModifiedDate(new Date());
		entityService.save(financeForeCast);
	}
}
