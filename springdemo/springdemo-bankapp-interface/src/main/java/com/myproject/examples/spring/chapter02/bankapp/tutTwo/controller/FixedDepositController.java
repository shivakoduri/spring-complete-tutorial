package com.myproject.examples.spring.chapter02.bankapp.tutTwo.controller;

import com.myproject.examples.spring.chapter02.bankapp.tutTwo.domain.FixedDepositDetails;
import com.myproject.examples.spring.chapter02.bankapp.tutTwo.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit();

	FixedDepositDetails get();
}
