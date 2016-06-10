/**
 * 
 */
package com.myproject.examples.spring.tutOne;

import org.apache.log4j.Logger;

/**
 * @author shiva koduri
 *
 */
public class FixedDepositController {
	
	private static Logger logger = Logger
			.getLogger(FixedDepositController.class);

	private FixedDepositService fixedDepositService;

	public FixedDepositController() {
		logger.info("Controller Initializing..");
	}

	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}

	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(
				1, 10000, 365, "abc@xyz.com"));
	}

	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}

}
