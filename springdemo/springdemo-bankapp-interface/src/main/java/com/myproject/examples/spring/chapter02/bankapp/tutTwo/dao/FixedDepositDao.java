package com.myproject.examples.spring.chapter02.bankapp.tutTwo.dao;

import com.myproject.examples.spring.chapter02.bankapp.tutTwo.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
