package com.techstack.corebanking.controller;

import com.techstack.corebanking.service.AccountBalClient;
import com.techstack.corebanking.stub.*;
import com.techstack.corebanking.dto.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@Validated
public class AccountBalController {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(AccountBalController.class);

	@Autowired
	private AccountBalClient accountBalClient;

	@PostMapping("/api/vi/bal")
	public QUERYACCBALIOFSRES invokeAccountBal(
			@Valid @RequestBody AccountBalanceRequest accountBalanceRequest) {

		QUERYACCBALIOFSRES responseMsg =
				accountBalClient.InvokeAccountBal(
						accountBalanceRequest
				);

		LOGGER.info(
				"Account Balance Response: {}",
				responseMsg.getFCUBSBODY()
		);

		return responseMsg;
	}

	@PostMapping("/api/v1/Summarybal")
	public QUERYACCSUMMIOFSRES invokeSummaryBal(
			@Valid @RequestBody AccountNumberRequest accountNumberRequest) {


		QUERYACCSUMMIOFSRES responseMsg =
				accountBalClient.getCustSummaryBal(
						accountNumberRequest
				);

		LOGGER.info(
				"Summary Balance Response: {}",
				responseMsg.getFCUBSBODY()
		);

		return responseMsg;
	}

	@PostMapping("/api/v1/createAcc")
	public CREATECUSTACCFSFSRES createAcc(
			@RequestBody AccountCreationRequest accountCreationRequest) {

		CREATECUSTACCFSFSRES responseMsg =
				accountBalClient.CreateAccount(
						accountCreationRequest
				);

		LOGGER.info(
				"Create Account Response: {}",
				responseMsg.getFCUBSBODY()
		);

		return responseMsg;
	}

	@PostMapping("/api/v1/fullAccbal")
	public QUERYCUSTACCIOFSRES fullAccBal(
			@Valid @RequestBody AccountNumberRequest accountNumberRequest) {

		QUERYCUSTACCIOFSRES responseMsg =
				accountBalClient.FullAccBal(
						accountNumberRequest
				);

		LOGGER.info(
				"Full Account Balance Response: {}",
				responseMsg.getFCUBSBODY()
		);

		return responseMsg;
	}

	@PostMapping("/api/v1/checkbook")
	public CREATECHECKBOOKFSFSRES checkBook(
			@RequestParam("BRANCH_CODE") String branchCode,
			@RequestParam("account_no") String accountNo) {

		CREATECHECKBOOKFSFSRES responseMsg =
				accountBalClient.createCheckBook(
						branchCode,
						accountNo
				);

		LOGGER.info(
				"Create CheckBook Response: {}",
				responseMsg.getFCUBSBODY()
		);

		return responseMsg;
	}

	@PostMapping("/api/v1/AccDetails")
	public QUERYCUSTACCOUNTDETAILSIOFSRES AccDetails (@Valid @RequestBody QueryCustAccDetailRequest querycustaccdetailrequest) {
		QUERYCUSTACCOUNTDETAILSIOFSRES responseMsg =  accountBalClient.QueryCustAccDetail(querycustaccdetailrequest) ;
		return responseMsg;

	}

	@PostMapping("/api/v1/Statement")
	public QUERYCBSTMTIOFSRES AccDetails (@Valid @RequestBody QueryCbStmtRequest querycbstmtrequest) {
		QUERYCBSTMTIOFSRES responseMsg =  accountBalClient.QuerryCbStmt(querycbstmtrequest) ;
		return responseMsg;

	}




}