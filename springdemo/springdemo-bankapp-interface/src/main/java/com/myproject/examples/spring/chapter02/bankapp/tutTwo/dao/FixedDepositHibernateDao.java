package com.myproject.examples.spring.chapter02.bankapp.tutTwo.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.myproject.examples.spring.chapter02.bankapp.tutTwo.domain.FixedDepositDetails;

public class FixedDepositHibernateDao implements FixedDepositDao{
	private static Logger logger = Logger.getLogger(FixedDepositHibernateDao.class);
	
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public FixedDepositHibernateDao() {
		logger.info("initializing");
	}
	
	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
}
