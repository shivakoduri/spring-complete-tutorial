/**
 * 
 */
package com.myproject.examples.spring.tutOne;

import org.apache.log4j.Logger;

/**
 * @author shiva koduri
 *
 */
public class FixedDepositService {
	private static Logger logger = Logger.getLogger(FixedDepositService.class);
	
	private FixedDepositDao fixedDepositDao;
	
	public FixedDepositService() {
		logger.info("Service Initializing..");
	}
	
	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		logger.info("Setting fixedDepositDao property");
		this.fixedDepositDao = fixedDepositDao;
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return fixedDepositDao.createFixedDeposit(fdd);
	}

}
