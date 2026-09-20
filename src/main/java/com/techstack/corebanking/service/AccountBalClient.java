package com.techstack.corebanking.service;

import com.techstack.corebanking.controller.AccountBalController;
import com.techstack.corebanking.stub.*;
import com.techstack.corebanking.util.RequestUtil;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.techstack.corebanking.dto.*;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.math.BigDecimal;

@Service
public class AccountBalClient {

	@Autowired
     private Jaxb2Marshaller marshaller ;
	 private WebServiceTemplate template ;

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountBalClient.class);

	public QUERYACCBALIOFSRES InvokeAccountBal (AccountBalanceRequest accountbalancerequest, FCUBSHEADERType fcubsheader) {

		LOGGER.info("Branch code is: {}, Account number is: {}", accountbalancerequest.getBranchCode(), accountbalancerequest.getCustacno());

		QUERYACCBALIOFSREQ fcubsMainHeader = new QUERYACCBALIOFSREQ();

		fcubsMainHeader.setFCUBSHEADER(fcubsheader);
		AccBalReqType.ACCBAL accbal = new AccBalReqType.ACCBAL();
		accbal.setBRANCHCODE(accountbalancerequest.getBranchCode());
		accbal.setCUSTACNO(accountbalancerequest.getCustacno());

		AccBalReqType resquesttpe = new AccBalReqType();
		resquesttpe.setACCBAL(accbal);
		QUERYACCBALIOFSREQ.FCUBSBODY flexbosy = new QUERYACCBALIOFSREQ.FCUBSBODY();
		flexbosy.setACCBalance(resquesttpe);
		fcubsMainHeader.setFCUBSBODY(flexbosy);

		template = new WebServiceTemplate(marshaller);
		QUERYACCBALIOFSRES response = (QUERYACCBALIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
		return response ;

	}
	
		/** QUERY ACCOUNT BALANCE **/
	public QUERYACCBALIOFSRES getCustBal (QUERYACCBALIOFSREQ request, FCUBSHEADERType fcubsheader) {
		template = new WebServiceTemplate(marshaller);
		QUERYACCBALIOFSRES response = (QUERYACCBALIOFSRES) template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",request);
		return response ;
	}
	
	/** QUERY ACCOUNT BALANCE SUMMARY **/
	public QUERYACCSUMMIOFSRES getCustSummaryBal (AccountNumberRequest accountnumberrequest, FCUBSHEADERType fcubsheader) {
		QUERYACCSUMMIOFSREQ fcubsMainHeader = new QUERYACCSUMMIOFSREQ();
		fcubsheader.setOPERATION("QueryAccSumm");

		fcubsMainHeader.setFCUBSHEADER(fcubsheader);
		QueryAccSummQueryIOType queryAccSummIo = null ;
		queryAccSummIo = new QueryAccSummQueryIOType();
		queryAccSummIo.setCUSTNO(accountnumberrequest.getCustacno());

		QUERYACCSUMMIOFSREQ.FCUBSBODY flexbosy = new QUERYACCSUMMIOFSREQ.FCUBSBODY();
		flexbosy.setStvwAccountSumaryIO(queryAccSummIo);
		fcubsMainHeader.setFCUBSBODY(flexbosy);

		template = new WebServiceTemplate(marshaller);
		QUERYACCSUMMIOFSRES response = (QUERYACCSUMMIOFSRES) template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
		return response ;
	}
	
	/** CREATE CUSTOMER ACCOUNT **/
	public CREATECUSTACCFSFSRES CreateAccount (AccountCreationRequest accountcreationrequest, FCUBSHEADERType fcubsheader) {

		CREATECUSTACCFSFSREQ fcubsMainHeader = new CREATECUSTACCFSFSREQ();
		fcubsheader.setSOURCE("FCAT");
		fcubsheader.setOPERATION("CreateCustAcc");

		fcubsMainHeader.setFCUBSHEADER(fcubsheader);
		CustAccFullType custacc  =  new CustAccFullType();
		custacc.setBRN(accountcreationrequest.getBrn());
		custacc.setACC(accountcreationrequest.getAcc());
		custacc.setCUSTNO(accountcreationrequest.getCustno());
		custacc.setCCY(accountcreationrequest.getCcy());
		custacc.setACCLS(accountcreationrequest.getAccls());
		System.out.println("Branch sent is :" +accountcreationrequest.getBrn());
		System.out.println("customer no sent is :" +accountcreationrequest.getCustno());
		System.out.println("ccy sent is :" +accountcreationrequest.getCcy());

		System.out.println("Account class sent is :" +accountcreationrequest.getAccls());
		System.out.println("Account sent is :" +accountcreationrequest.getAcc());



		CREATECUSTACCFSFSREQ.FCUBSBODY flexbosy = new CREATECUSTACCFSFSREQ.FCUBSBODY();
		flexbosy.setCustAccountFull(custacc);
		fcubsMainHeader.setFCUBSBODY(flexbosy);
		template = new WebServiceTemplate(marshaller);
		CREATECUSTACCFSFSRES response = (CREATECUSTACCFSFSRES) template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
		return response ;
	}
	
	// full customer balance 
	
	public QUERYCUSTACCIOFSRES FullAccBal (AccountNumberRequest accountnumberrequest, FCUBSHEADERType fcubsheader) {

		QUERYCUSTACCIOFSREQ fcubsMainHeader = new QUERYCUSTACCIOFSREQ();
		fcubsMainHeader.setFCUBSHEADER(fcubsheader);
		CustAccQueryIOType fullbal =  new CustAccQueryIOType();
		fullbal.setACC(accountnumberrequest.getCustacno());
		QUERYCUSTACCIOFSREQ.FCUBSBODY flexbosy = new QUERYCUSTACCIOFSREQ.FCUBSBODY();
		flexbosy.setCustAccountIO(fullbal);
		fcubsMainHeader.setFCUBSBODY(flexbosy);
		template = new WebServiceTemplate(marshaller);
		QUERYCUSTACCIOFSRES response = (QUERYCUSTACCIOFSRES) template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
		return response ;
	}
	/** CREATE CHECK BOOK **/
	public CREATECHECKBOOKFSFSRES createCheckBook (String BRANCH_CODE ,String account_no, FCUBSHEADERType fcubsheader) {

		CREATECHECKBOOKFSFSREQ fcubsMainHeader = new CREATECHECKBOOKFSFSREQ();
		fcubsMainHeader.setFCUBSHEADER(fcubsheader);
		CheckBookFullType checkbook  =  new CheckBookFullType();
		checkbook.setACCOUNT(account_no);
		checkbook.setACCOUNTBRANCH(BRANCH_CODE);
		checkbook.setCHEQUELEAVES(BigDecimal.valueOf(20));
		checkbook.setFIRSTCHEQUENUMBER("1");
		CREATECHECKBOOKFSFSREQ.FCUBSBODY flexbosy = new CREATECHECKBOOKFSFSREQ.FCUBSBODY();
		flexbosy.setChqBkDetailsFull(checkbook); ;
		fcubsMainHeader.setFCUBSBODY(flexbosy);

		template = new WebServiceTemplate(marshaller);
		CREATECHECKBOOKFSFSRES response = (CREATECHECKBOOKFSFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
		return response ;
	}

    public QUERYCUSTACCOUNTDETAILSIOFSRES QueryCustAccDetail (QueryCustAccDetailRequest querycustaccdetailrequest)
	{
		QUERYCUSTACCOUNTDETAILSIOFSREQ fcubsMainHeader = new QUERYCUSTACCOUNTDETAILSIOFSREQ();

		FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
		fcubsheader.setSOURCE("FCAT");
		fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
		fcubsheader.setMSGID("");
		fcubsheader.setCORRELID(null);
		fcubsheader.setUSERID("TAKEON02");
		fcubsheader.setPASSWORD("Oracle@2");
		fcubsheader.setBRANCH("100");
		fcubsheader.setMODULEID("");
		fcubsheader.setSERVICE("FCUBSAccService");
		fcubsheader.setOPERATION("QuerycustAccountDetails");
		fcubsMainHeader.setFCUBSHEADER(fcubsheader);

		FCUBSAccServiceImplQueryIOType accdetails = new FCUBSAccServiceImplQueryIOType();
		accdetails.setCUSTACNO(querycustaccdetailrequest.getCustacno());
		accdetails.setBRANCHCODE(querycustaccdetailrequest.getBranchcode());

		QUERYCUSTACCOUNTDETAILSIOFSREQ.FCUBSBODY flexbosy = new QUERYCUSTACCOUNTDETAILSIOFSREQ.FCUBSBODY();
		flexbosy.setCustDetailsIO(accdetails);
		fcubsMainHeader.setFCUBSBODY(flexbosy);
		template = new WebServiceTemplate(marshaller);
		QUERYCUSTACCOUNTDETAILSIOFSRES response = (QUERYCUSTACCOUNTDETAILSIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
		return response ;
	}

   public QUERYCBSTMTIOFSRES QuerryCbStmt (QueryCbStmtRequest querycbstmtrequest) {


	   QUERYCBSTMTIOFSREQ fcubsMainHeader = new QUERYCBSTMTIOFSREQ();

	   FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
	   fcubsheader.setSOURCE("FCAT");
	   fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
	   fcubsheader.setMSGID("");
	   fcubsheader.setCORRELID(null);
	   fcubsheader.setUSERID("TAKEON02");
	   fcubsheader.setPASSWORD("Oracle@2");
	   fcubsheader.setBRANCH("100");
	   fcubsheader.setMODULEID("");
	   fcubsheader.setSERVICE("FCUBSAccService");
	   fcubsheader.setOPERATION("QueryCbStmt");
	   fcubsMainHeader.setFCUBSHEADER(fcubsheader);

	   CbStmtQueryIOType cbstmtqueryiotype = new CbStmtQueryIOType();
	   cbstmtqueryiotype.setCUSNO(querycbstmtrequest.getCusno());
	   cbstmtqueryiotype.setSTMTID(querycbstmtrequest.getStmtid());

	   QUERYCBSTMTIOFSREQ.FCUBSBODY flexbosy = new QUERYCBSTMTIOFSREQ.FCUBSBODY();
	   flexbosy.setMainIO(cbstmtqueryiotype);
	   fcubsMainHeader.setFCUBSBODY(flexbosy);
	   template = new WebServiceTemplate(marshaller);
	   QUERYCBSTMTIOFSRES response = (QUERYCBSTMTIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService",fcubsMainHeader);
	   return response ;

   }
/**
   public QUERYACCLASSTFRIOFSRES QueryAcclassn (){

	   QUERYTDCUSTACCIOFSREQ  fcubsMainHeader   = new QUERYTDCUSTACCIOFSREQ();


	   FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
	   fcubsheader.setSOURCE("FCAT");
	   fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
	   fcubsheader.setMSGID("");
	   fcubsheader.setCORRELID(null);
	   fcubsheader.setUSERID("TAKEON02");
	   fcubsheader.setPASSWORD("Oracle@2");
	   fcubsheader.setBRANCH("100");
	   fcubsheader.setMODULEID("");
	   fcubsheader.setSERVICE("FCUBSAccService");
	   fcubsheader.setOPERATION("QuerycustAccountDetails");
	   fcubsMainHeader.setFCUBSHEADER(fcubsheader);

	   CustAccTfrQueryIOType cusaccfr = new CustAccTfrQueryIOType();
	   ///cusaccfr.

    return QUERYACCLASSTFRIOFSRES;
   }
**/

}
