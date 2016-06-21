package com.myproject.examples.spring.chapter02.bankapp.tutTwo.service;

import com.myproject.examples.spring.chapter02.bankapp.tutTwo.dao.FixedDepositDao;
import com.myproject.examples.spring.chapter02.bankapp.tutTwo.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
