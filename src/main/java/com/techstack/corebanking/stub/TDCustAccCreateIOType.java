
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDCustAcc-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCustAcc-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TERM_ACNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TDCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCOPENDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ALTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOM2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDRESS_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLRBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRKREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MEDIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AUF_LT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="START_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="END_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TOD_LIMTS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OFFLINELIM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NETREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRTXNLMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CRLMSTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CRLMREVDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTCYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTTYPEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENSTMTMV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTTYPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTDAY2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTCYCLE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENSTMTMV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTTYPE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTDAY3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACSTMTCYCLE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENSTMTMV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FLGEXCLRVRTRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STMTAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGCCAVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGDAPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGDPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPCONDLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPCONDTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IBANACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IBANBNKCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DAYLIGHTLIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="COUNTRY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESCROWTRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESCROWPERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ESCROWBRNCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESCROWACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SODNOTP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="REPL_CUST_SIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRS_STST_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MT110_RECON_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROJACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DFLT_WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTO_DEBIT_CARD_REQUEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTO_CHEQUE_BOOK_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTERMEDIARY_REQUIRED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENABLE_SWEEP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENABLE_REV_SWEEP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPDANLSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYINBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLEARING_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRAWEE_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENDDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STMT_OF_FEES_REQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STRDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="STMT_OF_FEES_ON" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ALLOW_TD_COLL_LINK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UTIL_ESN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STMT_OF_FEES_DEL_CHANNEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BASE_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GOAL_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TARGET_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PAYIN_CHQ_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PAYIN_ROUTING_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYIN_CHQ_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P_ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALLOW_TD_COLL_LINK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRVSTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRVPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DISCPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Report-Gentime1" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GENTIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Accmaintinstr" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DTOFLSTMAINT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="INSTR1WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTR2WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTR3WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTR4WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MAINTINSTR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MAINTINSTR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MAINTINSTR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MAINTINSTR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Report-Gentime2" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GENTIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Interim-Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BALRPTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTRMDRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="INTRMCRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="INTRMSTMTCNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="INTRMSTMTYTDCNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="GENINTRMSTMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GENINTRMSTMTMVMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GENBALRPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTRMRPTSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTRMRPTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BALRPTSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Accprdres" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DRTTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Acctxnres" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRTTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Authbicdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BICCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Acstatuslines" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Jointholders" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Acccrdrlmts" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CRDRCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CRLMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DRLMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Intdetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CONSOL_CHG_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CONSOLCHGBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTRATE_CUMAMT_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REDM_INT_PAYOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Intprodmap" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Inteffdtmap" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                                 &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Extude" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXT_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXT_UDE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXT_UDE_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="EXT_UDE_VARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="UDE_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tddetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INITIAL_TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RDFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RDFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RDFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RDAMT_N" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DEPTENYEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DEPTENORMON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DEPTENORDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ROLLTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTRATE_CUMAMT_ROLL_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INT_EARNINGS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TAX_COLLCTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="APY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CASCADE_MONTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDFNDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="BRNCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Dcdmaster" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="LINKCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CCY_OPTION_PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="LINKED_CCY_SETT_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LINKED_CCY_GL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FIX_DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="YLD_ENHC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="INCEPTION_FAIR_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount-Dates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DR_INT_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PROVAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CHG_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="WITHDRAWABLE_UNCOLLED_FUND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_TANK_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_BLOCKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_AVL_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNAUTH_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNAUTH_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNAUTH_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNAUTH_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNAUTH_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNAUTH_TANK_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_ACCRUED_DR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_ACCRUED_CR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_LAST_CR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_LAST_DR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_LAST_DR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DATE_LAST_CR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RECEIVABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DC_LCY_OPEN_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DIS_UNUTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DIS_TOT_AVL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CURRPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SWEEP_ELIG_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DC_ILM_SWEEP_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Turnovers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="LCY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ACY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="LCY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ACY_TOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LCY_TOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Noticepref" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ADVINTREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MONTHLYFREEAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="NOTICEPERIOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="VALIDITYPERIOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Acc-Nominees" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="P_ADDRESS_CODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_CODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="P_ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tdpayindetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MMPAYOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="OFFSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="APPLIED_EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CHQINSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRODUCT_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHQ_ADTE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DRAWEE_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ROUTING_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tdpayoutdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OFFSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYOUTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tod-Renew" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Od-Limit" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LINKAGE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LINKAGE_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EFFECTIVE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EAR_MARKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Doctype-Checklist" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="EXPECTED_DATE_SUBMISSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Doctype-Remarks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SEND_NOTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sttms-Od-Coll-Linkages" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LIMIT_COLLATERAL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_COLLATERAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_LINKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_INTEREST_SPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_COLLATERAL_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIMIT_HAIRCUT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cust-Acc-Check" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FIRST_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK_LEAVES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CHEQUE_BOOK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LANG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHQ_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cust-Acc-Card" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REQUEST_REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CARD_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CARD_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAME_ON_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CARD_APPL_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Intermediary" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INTERMEDIARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY_RATIO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Summary" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHQBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ATM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACSTATNODR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ATMACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACSTATNOCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCLSTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PROJECTACCNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MT110RECONREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IBANACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FROZEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ALTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCOPENDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ACSTATSTPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MULTI_CCY_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Interest-Payout" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ac-Od-Limits" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LNKDAMT_ACY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RATE_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="STDTA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="REVLRATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIMITTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LNKPXNTG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LINKAGE_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Addpayin-Dtls" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PAYOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="OFFSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Endorse-Log" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Account-Signature" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NO_MANDAT_SIGNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MIN_NO_SIGNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TRANSACTION_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="Acc-Mandatory-Sign" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TRANSACTION_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Custacc" type="{http://fcubs.ofss.com/service/FCUBSAccService}LinkedEntities-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Custacc-Icccspcn" type="{http://fcubs.ofss.com/service/FCUBSAccService}Chgcons-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Custacc-Icchspcn" type="{http://fcubs.ofss.com/service/FCUBSAccService}Chgdetails-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Custacc-Iccinstr" type="{http://fcubs.ofss.com/service/FCUBSAccService}Autodepdetails-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="CustAcc" type="{http://fcubs.ofss.com/service/FCUBSAccService}CustAccountMIS-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Custacc-Sicdiary" type="{http://fcubs.ofss.com/service/FCUBSAccService}Diarydetails-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Custacc-Stccusbl" type="{http://fcubs.ofss.com/service/FCUBSAccService}Billingprefmaster-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Accclose" type="{http://fcubs.ofss.com/service/FCUBSAccService}AccClose-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Acc-Svcacsig" type="{http://fcubs.ofss.com/service/FCUBSAccService}Accsigdetails-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Sttms-Debit" type="{http://fcubs.ofss.com/service/FCUBSAccService}Stccrdsa-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Tddetailsprn" type="{http://fcubs.ofss.com/service/FCUBSAccService}Icctdfpo-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Extsys-Ws-Master" type="{http://fcubs.ofss.com/service/FCUBSAccService}Cscofacm-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Custacc-Iccintpo" type="{http://fcubs.ofss.com/service/FCUBSAccService}Iccintpo-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Sttms-Cust-Account" type="{http://fcubs.ofss.com/service/FCUBSAccService}MudrabahSweep-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Customer-Acc" type="{http://fcubs.ofss.com/service/FCUBSAccService}TdRollHistory-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Customer-Accis" type="{http://fcubs.ofss.com/service/FCUBSAccService}TdisRollHistory-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Master" type="{http://fcubs.ofss.com/service/FCUBSAccService}Cscupdoc-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Sttms-Cust-Acc-Swp" type="{http://fcubs.ofss.com/service/FCUBSAccService}OnlineSweep-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Acc-Chnl" type="{http://fcubs.ofss.com/service/FCUBSAccService}Cust-Acc-Channel-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Acc" type="{http://fcubs.ofss.com/service/FCUBSAccService}DenomDeposit-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDCustAcc-Create-IO-Type", propOrder = {
    "brn",
    "termacno",
    "custno",
    "accls",
    "tdccy",
    "adesc",
    "acctype",
    "accopendt",
    "altacc",
    "nom1",
    "nom2",
    "address1",
    "address2",
    "address3",
    "address4",
    "clrbnkcd",
    "trkrec",
    "loc",
    "media",
    "auflt",
    "startdt",
    "enddt",
    "todlimts",
    "offlinelim",
    "netreq",
    "crtxnlmt",
    "crlmstdt",
    "crlmrevdt",
    "acstmtday",
    "acstmtcycle",
    "acstmttypep",
    "genstmtmv",
    "acstmttyps",
    "acstmtday2",
    "acstmtcycle2",
    "genstmtmv2",
    "acstmttype3",
    "acstmtday3",
    "acstmtcycle3",
    "genstmtmv3",
    "flgexclrvrtrans",
    "stmtac",
    "regccavl",
    "regdapp",
    "regdper",
    "prdlst",
    "txnlst",
    "spcondlst",
    "spcondtxn",
    "ibanacc",
    "ibanbnkcd",
    "opmode",
    "daylightlimit",
    "countrycode",
    "escrowtrn",
    "escrowpercentage",
    "escrowbrncode",
    "escrowaccount",
    "sodnotp",
    "replcustsig",
    "crsststreqd",
    "mt110RECONREQD",
    "projacc",
    "dfltwaiver",
    "autodebitcardrequest",
    "autochequebookreq",
    "intermediaryrequired",
    "enablesweepin",
    "enablerevsweepin",
    "spdanlsys",
    "payinby",
    "clearingtype",
    "draweeaccount",
    "dorm",
    "enddat",
    "cycle",
    "stmtoffeesreq",
    "strdate",
    "stmtoffeeson",
    "allowtdcolllink",
    "utilesn",
    "stmtoffeesdelchannel",
    "baseamt",
    "goalrefno",
    "targetamount",
    "payinchqdate",
    "payinroutingno",
    "payinchqno",
    "pcode",
    "paddresscode",
    "allowtdcolllink1",
    "provdetails",
    "reportGentime1",
    "accmaintinstr",
    "reportGentime2",
    "interimDetails",
    "accprdres",
    "acctxnres",
    "authbicdetails",
    "acstatuslines",
    "jointholders",
    "acccrdrlmts",
    "intdetails",
    "tddetails",
    "amountDates",
    "noticepref",
    "accNominees",
    "tdpayindetails",
    "tdpayoutdetails",
    "todRenew",
    "odLimit",
    "doctypeChecklist",
    "doctypeRemarks",
    "sttmsOdCollLinkages",
    "custAccCheck",
    "custAccCard",
    "intermediary",
    "summary",
    "interestPayout",
    "acOdLimits",
    "addpayinDtls",
    "endorseLog",
    "accountSignature",
    "custacc",
    "custaccIcccspcn",
    "custaccIcchspcn",
    "custaccIccinstr",
    "custAcc",
    "custaccSicdiary",
    "custaccStccusbl",
    "accclose",
    "accSvcacsig",
    "sttmsDebit",
    "tddetailsprn",
    "extsysWsMaster",
    "custaccIccintpo",
    "sttmsCustAccount",
    "customerAcc",
    "customerAccis",
    "master",
    "sttmsCustAccSwp",
    "accChnl",
    "acc",
    "udfdetails"
})
public class TDCustAccCreateIOType {

    @XmlElement(name = "BRN", required = true)
    protected String brn;
    @XmlElement(name = "TERM_ACNO", required = true)
    protected String termacno;
    @XmlElement(name = "CUSTNO", required = true)
    protected String custno;
    @XmlElement(name = "ACCLS", required = true)
    protected String accls;
    @XmlElement(name = "TDCCY", required = true)
    protected String tdccy;
    @XmlElement(name = "ADESC")
    protected String adesc;
    @XmlElement(name = "ACCTYPE")
    protected String acctype;
    @XmlElement(name = "ACCOPENDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accopendt;
    @XmlElement(name = "ALTACC")
    protected String altacc;
    @XmlElement(name = "NOM1")
    protected String nom1;
    @XmlElement(name = "NOM2")
    protected String nom2;
    @XmlElement(name = "ADDRESS_1")
    protected String address1;
    @XmlElement(name = "ADDRESS_2")
    protected String address2;
    @XmlElement(name = "ADDRESS_3")
    protected String address3;
    @XmlElement(name = "ADDRESS_4")
    protected String address4;
    @XmlElement(name = "CLRBNKCD")
    protected String clrbnkcd;
    @XmlElement(name = "TRKREC")
    protected String trkrec;
    @XmlElement(name = "LOC", required = true)
    protected String loc;
    @XmlElement(name = "MEDIA", required = true)
    protected String media;
    @XmlElement(name = "AUF_LT")
    protected BigDecimal auflt;
    @XmlElement(name = "START_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdt;
    @XmlElement(name = "END_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddt;
    @XmlElement(name = "TOD_LIMTS")
    protected BigDecimal todlimts;
    @XmlElement(name = "OFFLINELIM")
    protected BigDecimal offlinelim;
    @XmlElement(name = "NETREQ")
    protected String netreq;
    @XmlElement(name = "CRTXNLMT")
    protected BigDecimal crtxnlmt;
    @XmlElement(name = "CRLMSTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crlmstdt;
    @XmlElement(name = "CRLMREVDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crlmrevdt;
    @XmlElement(name = "ACSTMTDAY")
    protected BigDecimal acstmtday;
    @XmlElement(name = "ACSTMTCYCLE")
    protected String acstmtcycle;
    @XmlElement(name = "ACSTMTTYPEP")
    protected String acstmttypep;
    @XmlElement(name = "GENSTMTMV")
    protected String genstmtmv;
    @XmlElement(name = "ACSTMTTYPS")
    protected String acstmttyps;
    @XmlElement(name = "ACSTMTDAY2")
    protected BigDecimal acstmtday2;
    @XmlElement(name = "ACSTMTCYCLE2")
    protected String acstmtcycle2;
    @XmlElement(name = "GENSTMTMV2")
    protected String genstmtmv2;
    @XmlElement(name = "ACSTMTTYPE3")
    protected String acstmttype3;
    @XmlElement(name = "ACSTMTDAY3")
    protected BigDecimal acstmtday3;
    @XmlElement(name = "ACSTMTCYCLE3")
    protected String acstmtcycle3;
    @XmlElement(name = "GENSTMTMV3")
    protected String genstmtmv3;
    @XmlElement(name = "FLGEXCLRVRTRANS")
    protected String flgexclrvrtrans;
    @XmlElement(name = "STMTAC")
    protected String stmtac;
    @XmlElement(name = "REGCCAVL")
    protected String regccavl;
    @XmlElement(name = "REGDAPP")
    protected String regdapp;
    @XmlElement(name = "REGDPER")
    protected String regdper;
    @XmlElement(name = "PRDLST")
    protected String prdlst;
    @XmlElement(name = "TXNLST")
    protected String txnlst;
    @XmlElement(name = "SPCONDLST")
    protected String spcondlst;
    @XmlElement(name = "SPCONDTXN")
    protected String spcondtxn;
    @XmlElement(name = "IBANACC")
    protected String ibanacc;
    @XmlElement(name = "IBANBNKCD")
    protected String ibanbnkcd;
    @XmlElement(name = "OPMODE")
    protected String opmode;
    @XmlElement(name = "DAYLIGHTLIMIT")
    protected BigDecimal daylightlimit;
    @XmlElement(name = "COUNTRY_CODE")
    protected String countrycode;
    @XmlElement(name = "ESCROWTRN")
    protected String escrowtrn;
    @XmlElement(name = "ESCROWPERCENTAGE")
    protected BigDecimal escrowpercentage;
    @XmlElement(name = "ESCROWBRNCODE")
    protected String escrowbrncode;
    @XmlElement(name = "ESCROWACCOUNT")
    protected String escrowaccount;
    @XmlElement(name = "SODNOTP")
    protected BigDecimal sodnotp;
    @XmlElement(name = "REPL_CUST_SIG")
    protected String replcustsig;
    @XmlElement(name = "CRS_STST_REQD")
    protected String crsststreqd;
    @XmlElement(name = "MT110_RECON_REQD")
    protected String mt110RECONREQD;
    @XmlElement(name = "PROJACC")
    protected String projacc;
    @XmlElement(name = "DFLT_WAIVER")
    protected String dfltwaiver;
    @XmlElement(name = "AUTO_DEBIT_CARD_REQUEST")
    protected String autodebitcardrequest;
    @XmlElement(name = "AUTO_CHEQUE_BOOK_REQ")
    protected String autochequebookreq;
    @XmlElement(name = "INTERMEDIARY_REQUIRED")
    protected String intermediaryrequired;
    @XmlElement(name = "ENABLE_SWEEP_IN")
    protected String enablesweepin;
    @XmlElement(name = "ENABLE_REV_SWEEP_IN")
    protected String enablerevsweepin;
    @XmlElement(name = "SPDANLSYS")
    protected String spdanlsys;
    @XmlElement(name = "PAYINBY")
    protected String payinby;
    @XmlElement(name = "CLEARING_TYPE")
    protected String clearingtype;
    @XmlElement(name = "DRAWEE_ACCOUNT")
    protected String draweeaccount;
    @XmlElement(name = "DORM")
    protected String dorm;
    @XmlElement(name = "ENDDAT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddat;
    @XmlElement(name = "CYCLE")
    protected String cycle;
    @XmlElement(name = "STMT_OF_FEES_REQ")
    protected String stmtoffeesreq;
    @XmlElement(name = "STRDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar strdate;
    @XmlElement(name = "STMT_OF_FEES_ON")
    protected BigDecimal stmtoffeeson;
    @XmlElement(name = "ALLOW_TD_COLL_LINK")
    protected String allowtdcolllink;
    @XmlElement(name = "UTIL_ESN")
    protected String utilesn;
    @XmlElement(name = "STMT_OF_FEES_DEL_CHANNEL")
    protected String stmtoffeesdelchannel;
    @XmlElement(name = "BASE_AMT")
    protected BigDecimal baseamt;
    @XmlElement(name = "GOAL_REF_NO")
    protected String goalrefno;
    @XmlElement(name = "TARGET_AMOUNT")
    protected BigDecimal targetamount;
    @XmlElement(name = "PAYIN_CHQ_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payinchqdate;
    @XmlElement(name = "PAYIN_ROUTING_NO")
    protected String payinroutingno;
    @XmlElement(name = "PAYIN_CHQ_NO")
    protected String payinchqno;
    @XmlElement(name = "P_CODE")
    protected String pcode;
    @XmlElement(name = "P_ADDRESS_CODE")
    protected String paddresscode;
    @XmlElement(name = "ALLOW_TD_COLL_LINK1")
    protected String allowtdcolllink1;
    @XmlElement(name = "Provdetails")
    protected List<Provdetails> provdetails;
    @XmlElement(name = "Report-Gentime1")
    protected List<ReportGentime1> reportGentime1;
    @XmlElement(name = "Accmaintinstr")
    protected Accmaintinstr accmaintinstr;
    @XmlElement(name = "Report-Gentime2")
    protected List<ReportGentime2> reportGentime2;
    @XmlElement(name = "Interim-Details")
    protected InterimDetails interimDetails;
    @XmlElement(name = "Accprdres")
    protected List<Accprdres> accprdres;
    @XmlElement(name = "Acctxnres")
    protected List<Acctxnres> acctxnres;
    @XmlElement(name = "Authbicdetails")
    protected List<Authbicdetails> authbicdetails;
    @XmlElement(name = "Acstatuslines")
    protected List<Acstatuslines> acstatuslines;
    @XmlElement(name = "Jointholders")
    protected List<Jointholders> jointholders;
    @XmlElement(name = "Acccrdrlmts")
    protected List<Acccrdrlmts> acccrdrlmts;
    @XmlElement(name = "Intdetails")
    protected Intdetails intdetails;
    @XmlElement(name = "Tddetails")
    protected Tddetails tddetails;
    @XmlElement(name = "Amount-Dates")
    protected AmountDates amountDates;
    @XmlElement(name = "Noticepref")
    protected Noticepref noticepref;
    @XmlElement(name = "Acc-Nominees")
    protected List<AccNominees> accNominees;
    @XmlElement(name = "Tdpayindetails")
    protected List<Tdpayindetails> tdpayindetails;
    @XmlElement(name = "Tdpayoutdetails")
    protected List<Tdpayoutdetails> tdpayoutdetails;
    @XmlElement(name = "Tod-Renew")
    protected TodRenew todRenew;
    @XmlElement(name = "Od-Limit")
    protected List<OdLimit> odLimit;
    @XmlElement(name = "Doctype-Checklist")
    protected List<DoctypeChecklist> doctypeChecklist;
    @XmlElement(name = "Doctype-Remarks")
    protected DoctypeRemarks doctypeRemarks;
    @XmlElement(name = "Sttms-Od-Coll-Linkages")
    protected List<SttmsOdCollLinkages> sttmsOdCollLinkages;
    @XmlElement(name = "Cust-Acc-Check")
    protected CustAccCheck custAccCheck;
    @XmlElement(name = "Cust-Acc-Card")
    protected CustAccCard custAccCard;
    @XmlElement(name = "Intermediary")
    protected List<Intermediary> intermediary;
    @XmlElement(name = "Summary")
    protected Summary summary;
    @XmlElement(name = "Interest-Payout")
    protected List<InterestPayout> interestPayout;
    @XmlElement(name = "Ac-Od-Limits")
    protected List<AcOdLimits> acOdLimits;
    @XmlElement(name = "Addpayin-Dtls")
    protected List<AddpayinDtls> addpayinDtls;
    @XmlElement(name = "Endorse-Log")
    protected List<EndorseLog> endorseLog;
    @XmlElement(name = "Account-Signature")
    protected List<AccountSignature> accountSignature;
    @XmlElement(name = "Custacc")
    protected LinkedEntitiesCreateIOType custacc;
    @XmlElement(name = "Custacc-Icccspcn")
    protected ChgconsCreateIOType custaccIcccspcn;
    @XmlElement(name = "Custacc-Icchspcn")
    protected ChgdetailsCreateIOType custaccIcchspcn;
    @XmlElement(name = "Custacc-Iccinstr")
    protected AutodepdetailsCreateIOType custaccIccinstr;
    @XmlElement(name = "CustAcc")
    protected CustAccountMISCreateIOType custAcc;
    @XmlElement(name = "Custacc-Sicdiary")
    protected DiarydetailsCreateIOType custaccSicdiary;
    @XmlElement(name = "Custacc-Stccusbl")
    protected BillingprefmasterCreateIOType custaccStccusbl;
    @XmlElement(name = "Accclose")
    protected AccCloseCreateIOType accclose;
    @XmlElement(name = "Acc-Svcacsig")
    protected AccsigdetailsCreateIOType accSvcacsig;
    @XmlElement(name = "Sttms-Debit")
    protected StccrdsaCreateIOType sttmsDebit;
    @XmlElement(name = "Tddetailsprn")
    protected IcctdfpoCreateIOType tddetailsprn;
    @XmlElement(name = "Extsys-Ws-Master")
    protected CscofacmCreateIOType extsysWsMaster;
    @XmlElement(name = "Custacc-Iccintpo")
    protected IccintpoCreateIOType custaccIccintpo;
    @XmlElement(name = "Sttms-Cust-Account")
    protected MudrabahSweepCreateIOType sttmsCustAccount;
    @XmlElement(name = "Customer-Acc")
    protected TdRollHistoryCreateIOType customerAcc;
    @XmlElement(name = "Customer-Accis")
    protected TdisRollHistoryCreateIOType customerAccis;
    @XmlElement(name = "Master")
    protected CscupdocCreateIOType master;
    @XmlElement(name = "Sttms-Cust-Acc-Swp")
    protected OnlineSweepCreateIOType sttmsCustAccSwp;
    @XmlElement(name = "Acc-Chnl")
    protected CustAccChannelCreateIOType accChnl;
    @XmlElement(name = "Acc")
    protected DenomDepositCreateIOType acc;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

    /**
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the termacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTERMACNO() {
        return termacno;
    }

    /**
     * Sets the value of the termacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTERMACNO(String value) {
        this.termacno = value;
    }

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the accls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCLS() {
        return accls;
    }

    /**
     * Sets the value of the accls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCLS(String value) {
        this.accls = value;
    }

    /**
     * Gets the value of the tdccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDCCY() {
        return tdccy;
    }

    /**
     * Sets the value of the tdccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDCCY(String value) {
        this.tdccy = value;
    }

    /**
     * Gets the value of the adesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADESC() {
        return adesc;
    }

    /**
     * Sets the value of the adesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADESC(String value) {
        this.adesc = value;
    }

    /**
     * Gets the value of the acctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTYPE() {
        return acctype;
    }

    /**
     * Sets the value of the acctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTYPE(String value) {
        this.acctype = value;
    }

    /**
     * Gets the value of the accopendt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACCOPENDT() {
        return accopendt;
    }

    /**
     * Sets the value of the accopendt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACCOPENDT(XMLGregorianCalendar value) {
        this.accopendt = value;
    }

    /**
     * Gets the value of the altacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTACC() {
        return altacc;
    }

    /**
     * Sets the value of the altacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTACC(String value) {
        this.altacc = value;
    }

    /**
     * Gets the value of the nom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOM1() {
        return nom1;
    }

    /**
     * Sets the value of the nom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOM1(String value) {
        this.nom1 = value;
    }

    /**
     * Gets the value of the nom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOM2() {
        return nom2;
    }

    /**
     * Sets the value of the nom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOM2(String value) {
        this.nom2 = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESS4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESS4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the clrbnkcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLRBNKCD() {
        return clrbnkcd;
    }

    /**
     * Sets the value of the clrbnkcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLRBNKCD(String value) {
        this.clrbnkcd = value;
    }

    /**
     * Gets the value of the trkrec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRKREC() {
        return trkrec;
    }

    /**
     * Sets the value of the trkrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRKREC(String value) {
        this.trkrec = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOC(String value) {
        this.loc = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIA() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIA(String value) {
        this.media = value;
    }

    /**
     * Gets the value of the auflt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAUFLT() {
        return auflt;
    }

    /**
     * Sets the value of the auflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAUFLT(BigDecimal value) {
        this.auflt = value;
    }

    /**
     * Gets the value of the startdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTDT() {
        return startdt;
    }

    /**
     * Sets the value of the startdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTDT(XMLGregorianCalendar value) {
        this.startdt = value;
    }

    /**
     * Gets the value of the enddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDDT() {
        return enddt;
    }

    /**
     * Sets the value of the enddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDDT(XMLGregorianCalendar value) {
        this.enddt = value;
    }

    /**
     * Gets the value of the todlimts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTODLIMTS() {
        return todlimts;
    }

    /**
     * Sets the value of the todlimts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTODLIMTS(BigDecimal value) {
        this.todlimts = value;
    }

    /**
     * Gets the value of the offlinelim property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFFLINELIM() {
        return offlinelim;
    }

    /**
     * Sets the value of the offlinelim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFFLINELIM(BigDecimal value) {
        this.offlinelim = value;
    }

    /**
     * Gets the value of the netreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETREQ() {
        return netreq;
    }

    /**
     * Sets the value of the netreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETREQ(String value) {
        this.netreq = value;
    }

    /**
     * Gets the value of the crtxnlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRTXNLMT() {
        return crtxnlmt;
    }

    /**
     * Sets the value of the crtxnlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRTXNLMT(BigDecimal value) {
        this.crtxnlmt = value;
    }

    /**
     * Gets the value of the crlmstdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCRLMSTDT() {
        return crlmstdt;
    }

    /**
     * Sets the value of the crlmstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCRLMSTDT(XMLGregorianCalendar value) {
        this.crlmstdt = value;
    }

    /**
     * Gets the value of the crlmrevdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCRLMREVDT() {
        return crlmrevdt;
    }

    /**
     * Sets the value of the crlmrevdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCRLMREVDT(XMLGregorianCalendar value) {
        this.crlmrevdt = value;
    }

    /**
     * Gets the value of the acstmtday property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACSTMTDAY() {
        return acstmtday;
    }

    /**
     * Sets the value of the acstmtday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACSTMTDAY(BigDecimal value) {
        this.acstmtday = value;
    }

    /**
     * Gets the value of the acstmtcycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTCYCLE() {
        return acstmtcycle;
    }

    /**
     * Sets the value of the acstmtcycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTCYCLE(String value) {
        this.acstmtcycle = value;
    }

    /**
     * Gets the value of the acstmttypep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTTYPEP() {
        return acstmttypep;
    }

    /**
     * Sets the value of the acstmttypep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTTYPEP(String value) {
        this.acstmttypep = value;
    }

    /**
     * Gets the value of the genstmtmv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENSTMTMV() {
        return genstmtmv;
    }

    /**
     * Sets the value of the genstmtmv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENSTMTMV(String value) {
        this.genstmtmv = value;
    }

    /**
     * Gets the value of the acstmttyps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTTYPS() {
        return acstmttyps;
    }

    /**
     * Sets the value of the acstmttyps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTTYPS(String value) {
        this.acstmttyps = value;
    }

    /**
     * Gets the value of the acstmtday2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACSTMTDAY2() {
        return acstmtday2;
    }

    /**
     * Sets the value of the acstmtday2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACSTMTDAY2(BigDecimal value) {
        this.acstmtday2 = value;
    }

    /**
     * Gets the value of the acstmtcycle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTCYCLE2() {
        return acstmtcycle2;
    }

    /**
     * Sets the value of the acstmtcycle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTCYCLE2(String value) {
        this.acstmtcycle2 = value;
    }

    /**
     * Gets the value of the genstmtmv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENSTMTMV2() {
        return genstmtmv2;
    }

    /**
     * Sets the value of the genstmtmv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENSTMTMV2(String value) {
        this.genstmtmv2 = value;
    }

    /**
     * Gets the value of the acstmttype3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTTYPE3() {
        return acstmttype3;
    }

    /**
     * Sets the value of the acstmttype3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTTYPE3(String value) {
        this.acstmttype3 = value;
    }

    /**
     * Gets the value of the acstmtday3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACSTMTDAY3() {
        return acstmtday3;
    }

    /**
     * Sets the value of the acstmtday3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACSTMTDAY3(BigDecimal value) {
        this.acstmtday3 = value;
    }

    /**
     * Gets the value of the acstmtcycle3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSTMTCYCLE3() {
        return acstmtcycle3;
    }

    /**
     * Sets the value of the acstmtcycle3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSTMTCYCLE3(String value) {
        this.acstmtcycle3 = value;
    }

    /**
     * Gets the value of the genstmtmv3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENSTMTMV3() {
        return genstmtmv3;
    }

    /**
     * Sets the value of the genstmtmv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENSTMTMV3(String value) {
        this.genstmtmv3 = value;
    }

    /**
     * Gets the value of the flgexclrvrtrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLGEXCLRVRTRANS() {
        return flgexclrvrtrans;
    }

    /**
     * Sets the value of the flgexclrvrtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLGEXCLRVRTRANS(String value) {
        this.flgexclrvrtrans = value;
    }

    /**
     * Gets the value of the stmtac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTAC() {
        return stmtac;
    }

    /**
     * Sets the value of the stmtac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTAC(String value) {
        this.stmtac = value;
    }

    /**
     * Gets the value of the regccavl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGCCAVL() {
        return regccavl;
    }

    /**
     * Sets the value of the regccavl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGCCAVL(String value) {
        this.regccavl = value;
    }

    /**
     * Gets the value of the regdapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGDAPP() {
        return regdapp;
    }

    /**
     * Sets the value of the regdapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGDAPP(String value) {
        this.regdapp = value;
    }

    /**
     * Gets the value of the regdper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGDPER() {
        return regdper;
    }

    /**
     * Sets the value of the regdper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGDPER(String value) {
        this.regdper = value;
    }

    /**
     * Gets the value of the prdlst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDLST() {
        return prdlst;
    }

    /**
     * Sets the value of the prdlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDLST(String value) {
        this.prdlst = value;
    }

    /**
     * Gets the value of the txnlst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNLST() {
        return txnlst;
    }

    /**
     * Sets the value of the txnlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNLST(String value) {
        this.txnlst = value;
    }

    /**
     * Gets the value of the spcondlst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPCONDLST() {
        return spcondlst;
    }

    /**
     * Sets the value of the spcondlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPCONDLST(String value) {
        this.spcondlst = value;
    }

    /**
     * Gets the value of the spcondtxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPCONDTXN() {
        return spcondtxn;
    }

    /**
     * Sets the value of the spcondtxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPCONDTXN(String value) {
        this.spcondtxn = value;
    }

    /**
     * Gets the value of the ibanacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANACC() {
        return ibanacc;
    }

    /**
     * Sets the value of the ibanacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANACC(String value) {
        this.ibanacc = value;
    }

    /**
     * Gets the value of the ibanbnkcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANBNKCD() {
        return ibanbnkcd;
    }

    /**
     * Sets the value of the ibanbnkcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANBNKCD(String value) {
        this.ibanbnkcd = value;
    }

    /**
     * Gets the value of the opmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPMODE() {
        return opmode;
    }

    /**
     * Sets the value of the opmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPMODE(String value) {
        this.opmode = value;
    }

    /**
     * Gets the value of the daylightlimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDAYLIGHTLIMIT() {
        return daylightlimit;
    }

    /**
     * Sets the value of the daylightlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDAYLIGHTLIMIT(BigDecimal value) {
        this.daylightlimit = value;
    }

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTRYCODE() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTRYCODE(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the escrowtrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESCROWTRN() {
        return escrowtrn;
    }

    /**
     * Sets the value of the escrowtrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESCROWTRN(String value) {
        this.escrowtrn = value;
    }

    /**
     * Gets the value of the escrowpercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESCROWPERCENTAGE() {
        return escrowpercentage;
    }

    /**
     * Sets the value of the escrowpercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESCROWPERCENTAGE(BigDecimal value) {
        this.escrowpercentage = value;
    }

    /**
     * Gets the value of the escrowbrncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESCROWBRNCODE() {
        return escrowbrncode;
    }

    /**
     * Sets the value of the escrowbrncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESCROWBRNCODE(String value) {
        this.escrowbrncode = value;
    }

    /**
     * Gets the value of the escrowaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESCROWACCOUNT() {
        return escrowaccount;
    }

    /**
     * Sets the value of the escrowaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESCROWACCOUNT(String value) {
        this.escrowaccount = value;
    }

    /**
     * Gets the value of the sodnotp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSODNOTP() {
        return sodnotp;
    }

    /**
     * Sets the value of the sodnotp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSODNOTP(BigDecimal value) {
        this.sodnotp = value;
    }

    /**
     * Gets the value of the replcustsig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPLCUSTSIG() {
        return replcustsig;
    }

    /**
     * Sets the value of the replcustsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPLCUSTSIG(String value) {
        this.replcustsig = value;
    }

    /**
     * Gets the value of the crsststreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSSTSTREQD() {
        return crsststreqd;
    }

    /**
     * Sets the value of the crsststreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSSTSTREQD(String value) {
        this.crsststreqd = value;
    }

    /**
     * Gets the value of the mt110RECONREQD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMT110RECONREQD() {
        return mt110RECONREQD;
    }

    /**
     * Sets the value of the mt110RECONREQD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMT110RECONREQD(String value) {
        this.mt110RECONREQD = value;
    }

    /**
     * Gets the value of the projacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROJACC() {
        return projacc;
    }

    /**
     * Sets the value of the projacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROJACC(String value) {
        this.projacc = value;
    }

    /**
     * Gets the value of the dfltwaiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFLTWAIVER() {
        return dfltwaiver;
    }

    /**
     * Sets the value of the dfltwaiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFLTWAIVER(String value) {
        this.dfltwaiver = value;
    }

    /**
     * Gets the value of the autodebitcardrequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTODEBITCARDREQUEST() {
        return autodebitcardrequest;
    }

    /**
     * Sets the value of the autodebitcardrequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTODEBITCARDREQUEST(String value) {
        this.autodebitcardrequest = value;
    }

    /**
     * Gets the value of the autochequebookreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOCHEQUEBOOKREQ() {
        return autochequebookreq;
    }

    /**
     * Sets the value of the autochequebookreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOCHEQUEBOOKREQ(String value) {
        this.autochequebookreq = value;
    }

    /**
     * Gets the value of the intermediaryrequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERMEDIARYREQUIRED() {
        return intermediaryrequired;
    }

    /**
     * Sets the value of the intermediaryrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERMEDIARYREQUIRED(String value) {
        this.intermediaryrequired = value;
    }

    /**
     * Gets the value of the enablesweepin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENABLESWEEPIN() {
        return enablesweepin;
    }

    /**
     * Sets the value of the enablesweepin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENABLESWEEPIN(String value) {
        this.enablesweepin = value;
    }

    /**
     * Gets the value of the enablerevsweepin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENABLEREVSWEEPIN() {
        return enablerevsweepin;
    }

    /**
     * Sets the value of the enablerevsweepin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENABLEREVSWEEPIN(String value) {
        this.enablerevsweepin = value;
    }

    /**
     * Gets the value of the spdanlsys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDANLSYS() {
        return spdanlsys;
    }

    /**
     * Sets the value of the spdanlsys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDANLSYS(String value) {
        this.spdanlsys = value;
    }

    /**
     * Gets the value of the payinby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYINBY() {
        return payinby;
    }

    /**
     * Sets the value of the payinby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYINBY(String value) {
        this.payinby = value;
    }

    /**
     * Gets the value of the clearingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLEARINGTYPE() {
        return clearingtype;
    }

    /**
     * Sets the value of the clearingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLEARINGTYPE(String value) {
        this.clearingtype = value;
    }

    /**
     * Gets the value of the draweeaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWEEACCOUNT() {
        return draweeaccount;
    }

    /**
     * Sets the value of the draweeaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWEEACCOUNT(String value) {
        this.draweeaccount = value;
    }

    /**
     * Gets the value of the dorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDORM() {
        return dorm;
    }

    /**
     * Sets the value of the dorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDORM(String value) {
        this.dorm = value;
    }

    /**
     * Gets the value of the enddat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDDAT() {
        return enddat;
    }

    /**
     * Sets the value of the enddat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDDAT(XMLGregorianCalendar value) {
        this.enddat = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCYCLE() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCYCLE(String value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the stmtoffeesreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTOFFEESREQ() {
        return stmtoffeesreq;
    }

    /**
     * Sets the value of the stmtoffeesreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTOFFEESREQ(String value) {
        this.stmtoffeesreq = value;
    }

    /**
     * Gets the value of the strdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTRDATE() {
        return strdate;
    }

    /**
     * Sets the value of the strdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTRDATE(XMLGregorianCalendar value) {
        this.strdate = value;
    }

    /**
     * Gets the value of the stmtoffeeson property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTMTOFFEESON() {
        return stmtoffeeson;
    }

    /**
     * Sets the value of the stmtoffeeson property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTMTOFFEESON(BigDecimal value) {
        this.stmtoffeeson = value;
    }

    /**
     * Gets the value of the allowtdcolllink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWTDCOLLLINK() {
        return allowtdcolllink;
    }

    /**
     * Sets the value of the allowtdcolllink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWTDCOLLLINK(String value) {
        this.allowtdcolllink = value;
    }

    /**
     * Gets the value of the utilesn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTILESN() {
        return utilesn;
    }

    /**
     * Sets the value of the utilesn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTILESN(String value) {
        this.utilesn = value;
    }

    /**
     * Gets the value of the stmtoffeesdelchannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTOFFEESDELCHANNEL() {
        return stmtoffeesdelchannel;
    }

    /**
     * Sets the value of the stmtoffeesdelchannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTOFFEESDELCHANNEL(String value) {
        this.stmtoffeesdelchannel = value;
    }

    /**
     * Gets the value of the baseamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBASEAMT() {
        return baseamt;
    }

    /**
     * Sets the value of the baseamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBASEAMT(BigDecimal value) {
        this.baseamt = value;
    }

    /**
     * Gets the value of the goalrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGOALREFNO() {
        return goalrefno;
    }

    /**
     * Sets the value of the goalrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGOALREFNO(String value) {
        this.goalrefno = value;
    }

    /**
     * Gets the value of the targetamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTARGETAMOUNT() {
        return targetamount;
    }

    /**
     * Sets the value of the targetamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTARGETAMOUNT(BigDecimal value) {
        this.targetamount = value;
    }

    /**
     * Gets the value of the payinchqdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPAYINCHQDATE() {
        return payinchqdate;
    }

    /**
     * Sets the value of the payinchqdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPAYINCHQDATE(XMLGregorianCalendar value) {
        this.payinchqdate = value;
    }

    /**
     * Gets the value of the payinroutingno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYINROUTINGNO() {
        return payinroutingno;
    }

    /**
     * Sets the value of the payinroutingno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYINROUTINGNO(String value) {
        this.payinroutingno = value;
    }

    /**
     * Gets the value of the payinchqno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYINCHQNO() {
        return payinchqno;
    }

    /**
     * Sets the value of the payinchqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYINCHQNO(String value) {
        this.payinchqno = value;
    }

    /**
     * Gets the value of the pcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCODE() {
        return pcode;
    }

    /**
     * Sets the value of the pcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCODE(String value) {
        this.pcode = value;
    }

    /**
     * Gets the value of the paddresscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADDRESSCODE() {
        return paddresscode;
    }

    /**
     * Sets the value of the paddresscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADDRESSCODE(String value) {
        this.paddresscode = value;
    }

    /**
     * Gets the value of the allowtdcolllink1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWTDCOLLLINK1() {
        return allowtdcolllink1;
    }

    /**
     * Sets the value of the allowtdcolllink1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWTDCOLLLINK1(String value) {
        this.allowtdcolllink1 = value;
    }

    /**
     * Gets the value of the provdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the provdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Provdetails }
     * 
     * 
     */
    public List<Provdetails> getProvdetails() {
        if (provdetails == null) {
            provdetails = new ArrayList<Provdetails>();
        }
        return this.provdetails;
    }

    /**
     * Gets the value of the reportGentime1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reportGentime1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportGentime1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportGentime1 }
     * 
     * 
     */
    public List<ReportGentime1> getReportGentime1() {
        if (reportGentime1 == null) {
            reportGentime1 = new ArrayList<ReportGentime1>();
        }
        return this.reportGentime1;
    }

    /**
     * Gets the value of the accmaintinstr property.
     * 
     * @return
     *     possible object is
     *     {@link Accmaintinstr }
     *     
     */
    public Accmaintinstr getAccmaintinstr() {
        return accmaintinstr;
    }

    /**
     * Sets the value of the accmaintinstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accmaintinstr }
     *     
     */
    public void setAccmaintinstr(Accmaintinstr value) {
        this.accmaintinstr = value;
    }

    /**
     * Gets the value of the reportGentime2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reportGentime2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportGentime2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportGentime2 }
     * 
     * 
     */
    public List<ReportGentime2> getReportGentime2() {
        if (reportGentime2 == null) {
            reportGentime2 = new ArrayList<ReportGentime2>();
        }
        return this.reportGentime2;
    }

    /**
     * Gets the value of the interimDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InterimDetails }
     *     
     */
    public InterimDetails getInterimDetails() {
        return interimDetails;
    }

    /**
     * Sets the value of the interimDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterimDetails }
     *     
     */
    public void setInterimDetails(InterimDetails value) {
        this.interimDetails = value;
    }

    /**
     * Gets the value of the accprdres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accprdres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccprdres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accprdres }
     * 
     * 
     */
    public List<Accprdres> getAccprdres() {
        if (accprdres == null) {
            accprdres = new ArrayList<Accprdres>();
        }
        return this.accprdres;
    }

    /**
     * Gets the value of the acctxnres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acctxnres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctxnres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acctxnres }
     * 
     * 
     */
    public List<Acctxnres> getAcctxnres() {
        if (acctxnres == null) {
            acctxnres = new ArrayList<Acctxnres>();
        }
        return this.acctxnres;
    }

    /**
     * Gets the value of the authbicdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authbicdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthbicdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authbicdetails }
     * 
     * 
     */
    public List<Authbicdetails> getAuthbicdetails() {
        if (authbicdetails == null) {
            authbicdetails = new ArrayList<Authbicdetails>();
        }
        return this.authbicdetails;
    }

    /**
     * Gets the value of the acstatuslines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acstatuslines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcstatuslines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acstatuslines }
     * 
     * 
     */
    public List<Acstatuslines> getAcstatuslines() {
        if (acstatuslines == null) {
            acstatuslines = new ArrayList<Acstatuslines>();
        }
        return this.acstatuslines;
    }

    /**
     * Gets the value of the jointholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the jointholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJointholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jointholders }
     * 
     * 
     */
    public List<Jointholders> getJointholders() {
        if (jointholders == null) {
            jointholders = new ArrayList<Jointholders>();
        }
        return this.jointholders;
    }

    /**
     * Gets the value of the acccrdrlmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acccrdrlmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcccrdrlmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acccrdrlmts }
     * 
     * 
     */
    public List<Acccrdrlmts> getAcccrdrlmts() {
        if (acccrdrlmts == null) {
            acccrdrlmts = new ArrayList<Acccrdrlmts>();
        }
        return this.acccrdrlmts;
    }

    /**
     * Gets the value of the intdetails property.
     * 
     * @return
     *     possible object is
     *     {@link Intdetails }
     *     
     */
    public Intdetails getIntdetails() {
        return intdetails;
    }

    /**
     * Sets the value of the intdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intdetails }
     *     
     */
    public void setIntdetails(Intdetails value) {
        this.intdetails = value;
    }

    /**
     * Gets the value of the tddetails property.
     * 
     * @return
     *     possible object is
     *     {@link Tddetails }
     *     
     */
    public Tddetails getTddetails() {
        return tddetails;
    }

    /**
     * Sets the value of the tddetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tddetails }
     *     
     */
    public void setTddetails(Tddetails value) {
        this.tddetails = value;
    }

    /**
     * Gets the value of the amountDates property.
     * 
     * @return
     *     possible object is
     *     {@link AmountDates }
     *     
     */
    public AmountDates getAmountDates() {
        return amountDates;
    }

    /**
     * Sets the value of the amountDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountDates }
     *     
     */
    public void setAmountDates(AmountDates value) {
        this.amountDates = value;
    }

    /**
     * Gets the value of the noticepref property.
     * 
     * @return
     *     possible object is
     *     {@link Noticepref }
     *     
     */
    public Noticepref getNoticepref() {
        return noticepref;
    }

    /**
     * Sets the value of the noticepref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Noticepref }
     *     
     */
    public void setNoticepref(Noticepref value) {
        this.noticepref = value;
    }

    /**
     * Gets the value of the accNominees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accNominees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccNominees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccNominees }
     * 
     * 
     */
    public List<AccNominees> getAccNominees() {
        if (accNominees == null) {
            accNominees = new ArrayList<AccNominees>();
        }
        return this.accNominees;
    }

    /**
     * Gets the value of the tdpayindetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdpayindetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdpayindetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tdpayindetails }
     * 
     * 
     */
    public List<Tdpayindetails> getTdpayindetails() {
        if (tdpayindetails == null) {
            tdpayindetails = new ArrayList<Tdpayindetails>();
        }
        return this.tdpayindetails;
    }

    /**
     * Gets the value of the tdpayoutdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdpayoutdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdpayoutdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tdpayoutdetails }
     * 
     * 
     */
    public List<Tdpayoutdetails> getTdpayoutdetails() {
        if (tdpayoutdetails == null) {
            tdpayoutdetails = new ArrayList<Tdpayoutdetails>();
        }
        return this.tdpayoutdetails;
    }

    /**
     * Gets the value of the todRenew property.
     * 
     * @return
     *     possible object is
     *     {@link TodRenew }
     *     
     */
    public TodRenew getTodRenew() {
        return todRenew;
    }

    /**
     * Sets the value of the todRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link TodRenew }
     *     
     */
    public void setTodRenew(TodRenew value) {
        this.todRenew = value;
    }

    /**
     * Gets the value of the odLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the odLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdLimit }
     * 
     * 
     */
    public List<OdLimit> getOdLimit() {
        if (odLimit == null) {
            odLimit = new ArrayList<OdLimit>();
        }
        return this.odLimit;
    }

    /**
     * Gets the value of the doctypeChecklist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the doctypeChecklist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoctypeChecklist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DoctypeChecklist }
     * 
     * 
     */
    public List<DoctypeChecklist> getDoctypeChecklist() {
        if (doctypeChecklist == null) {
            doctypeChecklist = new ArrayList<DoctypeChecklist>();
        }
        return this.doctypeChecklist;
    }

    /**
     * Gets the value of the doctypeRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link DoctypeRemarks }
     *     
     */
    public DoctypeRemarks getDoctypeRemarks() {
        return doctypeRemarks;
    }

    /**
     * Sets the value of the doctypeRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoctypeRemarks }
     *     
     */
    public void setDoctypeRemarks(DoctypeRemarks value) {
        this.doctypeRemarks = value;
    }

    /**
     * Gets the value of the sttmsOdCollLinkages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sttmsOdCollLinkages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttmsOdCollLinkages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SttmsOdCollLinkages }
     * 
     * 
     */
    public List<SttmsOdCollLinkages> getSttmsOdCollLinkages() {
        if (sttmsOdCollLinkages == null) {
            sttmsOdCollLinkages = new ArrayList<SttmsOdCollLinkages>();
        }
        return this.sttmsOdCollLinkages;
    }

    /**
     * Gets the value of the custAccCheck property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccCheck }
     *     
     */
    public CustAccCheck getCustAccCheck() {
        return custAccCheck;
    }

    /**
     * Sets the value of the custAccCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccCheck }
     *     
     */
    public void setCustAccCheck(CustAccCheck value) {
        this.custAccCheck = value;
    }

    /**
     * Gets the value of the custAccCard property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccCard }
     *     
     */
    public CustAccCard getCustAccCard() {
        return custAccCard;
    }

    /**
     * Sets the value of the custAccCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccCard }
     *     
     */
    public void setCustAccCard(CustAccCard value) {
        this.custAccCard = value;
    }

    /**
     * Gets the value of the intermediary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the intermediary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary }
     * 
     * 
     */
    public List<Intermediary> getIntermediary() {
        if (intermediary == null) {
            intermediary = new ArrayList<Intermediary>();
        }
        return this.intermediary;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary }
     *     
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary }
     *     
     */
    public void setSummary(Summary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the interestPayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the interestPayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestPayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestPayout }
     * 
     * 
     */
    public List<InterestPayout> getInterestPayout() {
        if (interestPayout == null) {
            interestPayout = new ArrayList<InterestPayout>();
        }
        return this.interestPayout;
    }

    /**
     * Gets the value of the acOdLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acOdLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcOdLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcOdLimits }
     * 
     * 
     */
    public List<AcOdLimits> getAcOdLimits() {
        if (acOdLimits == null) {
            acOdLimits = new ArrayList<AcOdLimits>();
        }
        return this.acOdLimits;
    }

    /**
     * Gets the value of the addpayinDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addpayinDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddpayinDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddpayinDtls }
     * 
     * 
     */
    public List<AddpayinDtls> getAddpayinDtls() {
        if (addpayinDtls == null) {
            addpayinDtls = new ArrayList<AddpayinDtls>();
        }
        return this.addpayinDtls;
    }

    /**
     * Gets the value of the endorseLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the endorseLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorseLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndorseLog }
     * 
     * 
     */
    public List<EndorseLog> getEndorseLog() {
        if (endorseLog == null) {
            endorseLog = new ArrayList<EndorseLog>();
        }
        return this.endorseLog;
    }

    /**
     * Gets the value of the accountSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accountSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSignature }
     * 
     * 
     */
    public List<AccountSignature> getAccountSignature() {
        if (accountSignature == null) {
            accountSignature = new ArrayList<AccountSignature>();
        }
        return this.accountSignature;
    }

    /**
     * Gets the value of the custacc property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedEntitiesCreateIOType }
     *     
     */
    public LinkedEntitiesCreateIOType getCustacc() {
        return custacc;
    }

    /**
     * Sets the value of the custacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedEntitiesCreateIOType }
     *     
     */
    public void setCustacc(LinkedEntitiesCreateIOType value) {
        this.custacc = value;
    }

    /**
     * Gets the value of the custaccIcccspcn property.
     * 
     * @return
     *     possible object is
     *     {@link ChgconsCreateIOType }
     *     
     */
    public ChgconsCreateIOType getCustaccIcccspcn() {
        return custaccIcccspcn;
    }

    /**
     * Sets the value of the custaccIcccspcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgconsCreateIOType }
     *     
     */
    public void setCustaccIcccspcn(ChgconsCreateIOType value) {
        this.custaccIcccspcn = value;
    }

    /**
     * Gets the value of the custaccIcchspcn property.
     * 
     * @return
     *     possible object is
     *     {@link ChgdetailsCreateIOType }
     *     
     */
    public ChgdetailsCreateIOType getCustaccIcchspcn() {
        return custaccIcchspcn;
    }

    /**
     * Sets the value of the custaccIcchspcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgdetailsCreateIOType }
     *     
     */
    public void setCustaccIcchspcn(ChgdetailsCreateIOType value) {
        this.custaccIcchspcn = value;
    }

    /**
     * Gets the value of the custaccIccinstr property.
     * 
     * @return
     *     possible object is
     *     {@link AutodepdetailsCreateIOType }
     *     
     */
    public AutodepdetailsCreateIOType getCustaccIccinstr() {
        return custaccIccinstr;
    }

    /**
     * Sets the value of the custaccIccinstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutodepdetailsCreateIOType }
     *     
     */
    public void setCustaccIccinstr(AutodepdetailsCreateIOType value) {
        this.custaccIccinstr = value;
    }

    /**
     * Gets the value of the custAcc property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccountMISCreateIOType }
     *     
     */
    public CustAccountMISCreateIOType getCustAcc() {
        return custAcc;
    }

    /**
     * Sets the value of the custAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccountMISCreateIOType }
     *     
     */
    public void setCustAcc(CustAccountMISCreateIOType value) {
        this.custAcc = value;
    }

    /**
     * Gets the value of the custaccSicdiary property.
     * 
     * @return
     *     possible object is
     *     {@link DiarydetailsCreateIOType }
     *     
     */
    public DiarydetailsCreateIOType getCustaccSicdiary() {
        return custaccSicdiary;
    }

    /**
     * Sets the value of the custaccSicdiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiarydetailsCreateIOType }
     *     
     */
    public void setCustaccSicdiary(DiarydetailsCreateIOType value) {
        this.custaccSicdiary = value;
    }

    /**
     * Gets the value of the custaccStccusbl property.
     * 
     * @return
     *     possible object is
     *     {@link BillingprefmasterCreateIOType }
     *     
     */
    public BillingprefmasterCreateIOType getCustaccStccusbl() {
        return custaccStccusbl;
    }

    /**
     * Sets the value of the custaccStccusbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingprefmasterCreateIOType }
     *     
     */
    public void setCustaccStccusbl(BillingprefmasterCreateIOType value) {
        this.custaccStccusbl = value;
    }

    /**
     * Gets the value of the accclose property.
     * 
     * @return
     *     possible object is
     *     {@link AccCloseCreateIOType }
     *     
     */
    public AccCloseCreateIOType getAccclose() {
        return accclose;
    }

    /**
     * Sets the value of the accclose property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccCloseCreateIOType }
     *     
     */
    public void setAccclose(AccCloseCreateIOType value) {
        this.accclose = value;
    }

    /**
     * Gets the value of the accSvcacsig property.
     * 
     * @return
     *     possible object is
     *     {@link AccsigdetailsCreateIOType }
     *     
     */
    public AccsigdetailsCreateIOType getAccSvcacsig() {
        return accSvcacsig;
    }

    /**
     * Sets the value of the accSvcacsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccsigdetailsCreateIOType }
     *     
     */
    public void setAccSvcacsig(AccsigdetailsCreateIOType value) {
        this.accSvcacsig = value;
    }

    /**
     * Gets the value of the sttmsDebit property.
     * 
     * @return
     *     possible object is
     *     {@link StccrdsaCreateIOType }
     *     
     */
    public StccrdsaCreateIOType getSttmsDebit() {
        return sttmsDebit;
    }

    /**
     * Sets the value of the sttmsDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link StccrdsaCreateIOType }
     *     
     */
    public void setSttmsDebit(StccrdsaCreateIOType value) {
        this.sttmsDebit = value;
    }

    /**
     * Gets the value of the tddetailsprn property.
     * 
     * @return
     *     possible object is
     *     {@link IcctdfpoCreateIOType }
     *     
     */
    public IcctdfpoCreateIOType getTddetailsprn() {
        return tddetailsprn;
    }

    /**
     * Sets the value of the tddetailsprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcctdfpoCreateIOType }
     *     
     */
    public void setTddetailsprn(IcctdfpoCreateIOType value) {
        this.tddetailsprn = value;
    }

    /**
     * Gets the value of the extsysWsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CscofacmCreateIOType }
     *     
     */
    public CscofacmCreateIOType getExtsysWsMaster() {
        return extsysWsMaster;
    }

    /**
     * Sets the value of the extsysWsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscofacmCreateIOType }
     *     
     */
    public void setExtsysWsMaster(CscofacmCreateIOType value) {
        this.extsysWsMaster = value;
    }

    /**
     * Gets the value of the custaccIccintpo property.
     * 
     * @return
     *     possible object is
     *     {@link IccintpoCreateIOType }
     *     
     */
    public IccintpoCreateIOType getCustaccIccintpo() {
        return custaccIccintpo;
    }

    /**
     * Sets the value of the custaccIccintpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IccintpoCreateIOType }
     *     
     */
    public void setCustaccIccintpo(IccintpoCreateIOType value) {
        this.custaccIccintpo = value;
    }

    /**
     * Gets the value of the sttmsCustAccount property.
     * 
     * @return
     *     possible object is
     *     {@link MudrabahSweepCreateIOType }
     *     
     */
    public MudrabahSweepCreateIOType getSttmsCustAccount() {
        return sttmsCustAccount;
    }

    /**
     * Sets the value of the sttmsCustAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MudrabahSweepCreateIOType }
     *     
     */
    public void setSttmsCustAccount(MudrabahSweepCreateIOType value) {
        this.sttmsCustAccount = value;
    }

    /**
     * Gets the value of the customerAcc property.
     * 
     * @return
     *     possible object is
     *     {@link TdRollHistoryCreateIOType }
     *     
     */
    public TdRollHistoryCreateIOType getCustomerAcc() {
        return customerAcc;
    }

    /**
     * Sets the value of the customerAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdRollHistoryCreateIOType }
     *     
     */
    public void setCustomerAcc(TdRollHistoryCreateIOType value) {
        this.customerAcc = value;
    }

    /**
     * Gets the value of the customerAccis property.
     * 
     * @return
     *     possible object is
     *     {@link TdisRollHistoryCreateIOType }
     *     
     */
    public TdisRollHistoryCreateIOType getCustomerAccis() {
        return customerAccis;
    }

    /**
     * Sets the value of the customerAccis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdisRollHistoryCreateIOType }
     *     
     */
    public void setCustomerAccis(TdisRollHistoryCreateIOType value) {
        this.customerAccis = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link CscupdocCreateIOType }
     *     
     */
    public CscupdocCreateIOType getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscupdocCreateIOType }
     *     
     */
    public void setMaster(CscupdocCreateIOType value) {
        this.master = value;
    }

    /**
     * Gets the value of the sttmsCustAccSwp property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineSweepCreateIOType }
     *     
     */
    public OnlineSweepCreateIOType getSttmsCustAccSwp() {
        return sttmsCustAccSwp;
    }

    /**
     * Sets the value of the sttmsCustAccSwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineSweepCreateIOType }
     *     
     */
    public void setSttmsCustAccSwp(OnlineSweepCreateIOType value) {
        this.sttmsCustAccSwp = value;
    }

    /**
     * Gets the value of the accChnl property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccChannelCreateIOType }
     *     
     */
    public CustAccChannelCreateIOType getAccChnl() {
        return accChnl;
    }

    /**
     * Sets the value of the accChnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccChannelCreateIOType }
     *     
     */
    public void setAccChnl(CustAccChannelCreateIOType value) {
        this.accChnl = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link DenomDepositCreateIOType }
     *     
     */
    public DenomDepositCreateIOType getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenomDepositCreateIOType }
     *     
     */
    public void setAcc(DenomDepositCreateIOType value) {
        this.acc = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LNKDAMT_ACY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SPRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RATE_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="STDTA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="REVLRATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIMITTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LNKPXNTG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LINKAGE_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lnkdamtacy",
        "sprd",
        "ratevalue",
        "stdta",
        "enddate",
        "revlratecd",
        "limittyp",
        "lnkpxntg",
        "linkagereference"
    })
    public static class AcOdLimits {

        @XmlElement(name = "LNKDAMT_ACY")
        protected BigDecimal lnkdamtacy;
        @XmlElement(name = "SPRD")
        protected BigDecimal sprd;
        @XmlElement(name = "RATE_VALUE")
        protected BigDecimal ratevalue;
        @XmlElement(name = "STDTA")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stdta;
        @XmlElement(name = "END_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar enddate;
        @XmlElement(name = "REVLRATECD")
        protected String revlratecd;
        @XmlElement(name = "LIMITTYP")
        protected String limittyp;
        @XmlElement(name = "LNKPXNTG")
        protected BigDecimal lnkpxntg;
        @XmlElement(name = "LINKAGE_REFERENCE")
        protected String linkagereference;

        /**
         * Gets the value of the lnkdamtacy property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLNKDAMTACY() {
            return lnkdamtacy;
        }

        /**
         * Sets the value of the lnkdamtacy property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLNKDAMTACY(BigDecimal value) {
            this.lnkdamtacy = value;
        }

        /**
         * Gets the value of the sprd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSPRD() {
            return sprd;
        }

        /**
         * Sets the value of the sprd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSPRD(BigDecimal value) {
            this.sprd = value;
        }

        /**
         * Gets the value of the ratevalue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRATEVALUE() {
            return ratevalue;
        }

        /**
         * Sets the value of the ratevalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRATEVALUE(BigDecimal value) {
            this.ratevalue = value;
        }

        /**
         * Gets the value of the stdta property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTDTA() {
            return stdta;
        }

        /**
         * Sets the value of the stdta property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTDTA(XMLGregorianCalendar value) {
            this.stdta = value;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
        }

        /**
         * Gets the value of the revlratecd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREVLRATECD() {
            return revlratecd;
        }

        /**
         * Sets the value of the revlratecd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREVLRATECD(String value) {
            this.revlratecd = value;
        }

        /**
         * Gets the value of the limittyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIMITTYP() {
            return limittyp;
        }

        /**
         * Sets the value of the limittyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIMITTYP(String value) {
            this.limittyp = value;
        }

        /**
         * Gets the value of the lnkpxntg property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLNKPXNTG() {
            return lnkpxntg;
        }

        /**
         * Sets the value of the lnkpxntg property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLNKPXNTG(BigDecimal value) {
            this.lnkpxntg = value;
        }

        /**
         * Gets the value of the linkagereference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKAGEREFERENCE() {
            return linkagereference;
        }

        /**
         * Sets the value of the linkagereference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKAGEREFERENCE(String value) {
            this.linkagereference = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NOMMINOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GUARDNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GUARDRELNSHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GADDR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="RELSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="P_ADDRESS_CODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_CODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="P_ADDRESS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "naddr1",
        "naddr2",
        "naddr3",
        "naddr4",
        "nomminor",
        "guardnam",
        "guardrelnshp",
        "gaddr1",
        "gaddr2",
        "gaddr3",
        "gaddr4",
        "nam",
        "dob",
        "relship",
        "npcode",
        "gpcode",
        "paddresscode1",
        "addresscode",
        "addresscode1",
        "paddresscode"
    })
    public static class AccNominees {

        @XmlElement(name = "NADDR1")
        protected String naddr1;
        @XmlElement(name = "NADDR2")
        protected String naddr2;
        @XmlElement(name = "NADDR3")
        protected String naddr3;
        @XmlElement(name = "NADDR4")
        protected String naddr4;
        @XmlElement(name = "NOMMINOR")
        protected String nomminor;
        @XmlElement(name = "GUARDNAM")
        protected String guardnam;
        @XmlElement(name = "GUARDRELNSHP")
        protected String guardrelnshp;
        @XmlElement(name = "GADDR1")
        protected String gaddr1;
        @XmlElement(name = "GADDR2")
        protected String gaddr2;
        @XmlElement(name = "GADDR3")
        protected String gaddr3;
        @XmlElement(name = "GADDR4")
        protected String gaddr4;
        @XmlElement(name = "NAM")
        protected String nam;
        @XmlElement(name = "DOB")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "RELSHIP")
        protected String relship;
        @XmlElement(name = "NP_CODE")
        protected String npcode;
        @XmlElement(name = "GP_CODE")
        protected String gpcode;
        @XmlElement(name = "P_ADDRESS_CODE1")
        protected String paddresscode1;
        @XmlElement(name = "ADDRESS_CODE")
        protected String addresscode;
        @XmlElement(name = "ADDRESS_CODE1")
        protected String addresscode1;
        @XmlElement(name = "P_ADDRESS_CODE")
        protected String paddresscode;

        /**
         * Gets the value of the naddr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR1() {
            return naddr1;
        }

        /**
         * Sets the value of the naddr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR1(String value) {
            this.naddr1 = value;
        }

        /**
         * Gets the value of the naddr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR2() {
            return naddr2;
        }

        /**
         * Sets the value of the naddr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR2(String value) {
            this.naddr2 = value;
        }

        /**
         * Gets the value of the naddr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR3() {
            return naddr3;
        }

        /**
         * Sets the value of the naddr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR3(String value) {
            this.naddr3 = value;
        }

        /**
         * Gets the value of the naddr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNADDR4() {
            return naddr4;
        }

        /**
         * Sets the value of the naddr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNADDR4(String value) {
            this.naddr4 = value;
        }

        /**
         * Gets the value of the nomminor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOMMINOR() {
            return nomminor;
        }

        /**
         * Sets the value of the nomminor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOMMINOR(String value) {
            this.nomminor = value;
        }

        /**
         * Gets the value of the guardnam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUARDNAM() {
            return guardnam;
        }

        /**
         * Sets the value of the guardnam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUARDNAM(String value) {
            this.guardnam = value;
        }

        /**
         * Gets the value of the guardrelnshp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUARDRELNSHP() {
            return guardrelnshp;
        }

        /**
         * Sets the value of the guardrelnshp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUARDRELNSHP(String value) {
            this.guardrelnshp = value;
        }

        /**
         * Gets the value of the gaddr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR1() {
            return gaddr1;
        }

        /**
         * Sets the value of the gaddr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR1(String value) {
            this.gaddr1 = value;
        }

        /**
         * Gets the value of the gaddr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR2() {
            return gaddr2;
        }

        /**
         * Sets the value of the gaddr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR2(String value) {
            this.gaddr2 = value;
        }

        /**
         * Gets the value of the gaddr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR3() {
            return gaddr3;
        }

        /**
         * Sets the value of the gaddr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR3(String value) {
            this.gaddr3 = value;
        }

        /**
         * Gets the value of the gaddr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGADDR4() {
            return gaddr4;
        }

        /**
         * Sets the value of the gaddr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGADDR4(String value) {
            this.gaddr4 = value;
        }

        /**
         * Gets the value of the nam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAM() {
            return nam;
        }

        /**
         * Sets the value of the nam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAM(String value) {
            this.nam = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
        }

        /**
         * Gets the value of the relship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELSHIP() {
            return relship;
        }

        /**
         * Sets the value of the relship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELSHIP(String value) {
            this.relship = value;
        }

        /**
         * Gets the value of the npcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNPCODE() {
            return npcode;
        }

        /**
         * Sets the value of the npcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNPCODE(String value) {
            this.npcode = value;
        }

        /**
         * Gets the value of the gpcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGPCODE() {
            return gpcode;
        }

        /**
         * Sets the value of the gpcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGPCODE(String value) {
            this.gpcode = value;
        }

        /**
         * Gets the value of the paddresscode1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPADDRESSCODE1() {
            return paddresscode1;
        }

        /**
         * Sets the value of the paddresscode1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPADDRESSCODE1(String value) {
            this.paddresscode1 = value;
        }

        /**
         * Gets the value of the addresscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSCODE() {
            return addresscode;
        }

        /**
         * Sets the value of the addresscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSCODE(String value) {
            this.addresscode = value;
        }

        /**
         * Gets the value of the addresscode1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSCODE1() {
            return addresscode1;
        }

        /**
         * Sets the value of the addresscode1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSCODE1(String value) {
            this.addresscode1 = value;
        }

        /**
         * Gets the value of the paddresscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPADDRESSCODE() {
            return paddresscode;
        }

        /**
         * Sets the value of the paddresscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPADDRESSCODE(String value) {
            this.paddresscode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CRDRCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CRLMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DRLMTAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "crdrccy",
        "crlmtamt",
        "drlmtamt"
    })
    public static class Acccrdrlmts {

        @XmlElement(name = "CRDRCCY", required = true)
        protected String crdrccy;
        @XmlElement(name = "CRLMTAMT")
        protected BigDecimal crlmtamt;
        @XmlElement(name = "DRLMTAMT")
        protected BigDecimal drlmtamt;

        /**
         * Gets the value of the crdrccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRDRCCY() {
            return crdrccy;
        }

        /**
         * Sets the value of the crdrccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRDRCCY(String value) {
            this.crdrccy = value;
        }

        /**
         * Gets the value of the crlmtamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCRLMTAMT() {
            return crlmtamt;
        }

        /**
         * Sets the value of the crlmtamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCRLMTAMT(BigDecimal value) {
            this.crlmtamt = value;
        }

        /**
         * Gets the value of the drlmtamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDRLMTAMT() {
            return drlmtamt;
        }

        /**
         * Sets the value of the drlmtamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDRLMTAMT(BigDecimal value) {
            this.drlmtamt = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DTOFLSTMAINT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="INSTR1WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTR2WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTR3WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTR4WHEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MAINTINSTR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MAINTINSTR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MAINTINSTR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MAINTINSTR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dtoflstmaint",
        "instr1WHEN",
        "instr2WHEN",
        "instr3WHEN",
        "instr4WHEN",
        "maintinstr1",
        "maintinstr2",
        "maintinstr3",
        "maintinstr4"
    })
    public static class Accmaintinstr {

        @XmlElement(name = "DTOFLSTMAINT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtoflstmaint;
        @XmlElement(name = "INSTR1WHEN")
        protected String instr1WHEN;
        @XmlElement(name = "INSTR2WHEN")
        protected String instr2WHEN;
        @XmlElement(name = "INSTR3WHEN")
        protected String instr3WHEN;
        @XmlElement(name = "INSTR4WHEN")
        protected String instr4WHEN;
        @XmlElement(name = "MAINTINSTR1")
        protected String maintinstr1;
        @XmlElement(name = "MAINTINSTR2")
        protected String maintinstr2;
        @XmlElement(name = "MAINTINSTR3")
        protected String maintinstr3;
        @XmlElement(name = "MAINTINSTR4")
        protected String maintinstr4;

        /**
         * Gets the value of the dtoflstmaint property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDTOFLSTMAINT() {
            return dtoflstmaint;
        }

        /**
         * Sets the value of the dtoflstmaint property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDTOFLSTMAINT(XMLGregorianCalendar value) {
            this.dtoflstmaint = value;
        }

        /**
         * Gets the value of the instr1WHEN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTR1WHEN() {
            return instr1WHEN;
        }

        /**
         * Sets the value of the instr1WHEN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTR1WHEN(String value) {
            this.instr1WHEN = value;
        }

        /**
         * Gets the value of the instr2WHEN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTR2WHEN() {
            return instr2WHEN;
        }

        /**
         * Sets the value of the instr2WHEN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTR2WHEN(String value) {
            this.instr2WHEN = value;
        }

        /**
         * Gets the value of the instr3WHEN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTR3WHEN() {
            return instr3WHEN;
        }

        /**
         * Sets the value of the instr3WHEN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTR3WHEN(String value) {
            this.instr3WHEN = value;
        }

        /**
         * Gets the value of the instr4WHEN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTR4WHEN() {
            return instr4WHEN;
        }

        /**
         * Sets the value of the instr4WHEN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTR4WHEN(String value) {
            this.instr4WHEN = value;
        }

        /**
         * Gets the value of the maintinstr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAINTINSTR1() {
            return maintinstr1;
        }

        /**
         * Sets the value of the maintinstr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAINTINSTR1(String value) {
            this.maintinstr1 = value;
        }

        /**
         * Gets the value of the maintinstr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAINTINSTR2() {
            return maintinstr2;
        }

        /**
         * Sets the value of the maintinstr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAINTINSTR2(String value) {
            this.maintinstr2 = value;
        }

        /**
         * Gets the value of the maintinstr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAINTINSTR3() {
            return maintinstr3;
        }

        /**
         * Sets the value of the maintinstr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAINTINSTR3(String value) {
            this.maintinstr3 = value;
        }

        /**
         * Gets the value of the maintinstr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMAINTINSTR4() {
            return maintinstr4;
        }

        /**
         * Sets the value of the maintinstr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMAINTINSTR4(String value) {
            this.maintinstr4 = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NO_MANDAT_SIGNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MIN_NO_SIGNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TRANSACTION_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="Acc-Mandatory-Sign" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TRANSACTION_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "branchcode",
        "custacno",
        "nomandatsigns",
        "productcode",
        "remark",
        "minnosigns",
        "transactionlimit",
        "accMandatorySign"
    })
    public static class AccountSignature {

        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "CUST_AC_NO")
        protected String custacno;
        @XmlElement(name = "NO_MANDAT_SIGNS")
        protected BigDecimal nomandatsigns;
        @XmlElement(name = "PRODUCT_CODE")
        protected String productcode;
        @XmlElement(name = "REMARK")
        protected String remark;
        @XmlElement(name = "MIN_NO_SIGNS")
        protected BigDecimal minnosigns;
        @XmlElement(name = "TRANSACTION_LIMIT")
        protected BigDecimal transactionlimit;
        @XmlElement(name = "Acc-Mandatory-Sign")
        protected List<AccMandatorySign> accMandatorySign;

        /**
         * Gets the value of the branchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHCODE() {
            return branchcode;
        }

        /**
         * Sets the value of the branchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHCODE(String value) {
            this.branchcode = value;
        }

        /**
         * Gets the value of the custacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACNO() {
            return custacno;
        }

        /**
         * Sets the value of the custacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACNO(String value) {
            this.custacno = value;
        }

        /**
         * Gets the value of the nomandatsigns property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNOMANDATSIGNS() {
            return nomandatsigns;
        }

        /**
         * Sets the value of the nomandatsigns property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNOMANDATSIGNS(BigDecimal value) {
            this.nomandatsigns = value;
        }

        /**
         * Gets the value of the productcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTCODE() {
            return productcode;
        }

        /**
         * Sets the value of the productcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTCODE(String value) {
            this.productcode = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK(String value) {
            this.remark = value;
        }

        /**
         * Gets the value of the minnosigns property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINNOSIGNS() {
            return minnosigns;
        }

        /**
         * Sets the value of the minnosigns property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINNOSIGNS(BigDecimal value) {
            this.minnosigns = value;
        }

        /**
         * Gets the value of the transactionlimit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTRANSACTIONLIMIT() {
            return transactionlimit;
        }

        /**
         * Sets the value of the transactionlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTRANSACTIONLIMIT(BigDecimal value) {
            this.transactionlimit = value;
        }

        /**
         * Gets the value of the accMandatorySign property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the accMandatorySign property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccMandatorySign().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccMandatorySign }
         * 
         * 
         */
        public List<AccMandatorySign> getAccMandatorySign() {
            if (accMandatorySign == null) {
                accMandatorySign = new ArrayList<AccMandatorySign>();
            }
            return this.accMandatorySign;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TRANSACTION_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "branchcode",
            "custacno",
            "customerno",
            "productcode",
            "transactionlimit"
        })
        public static class AccMandatorySign {

            @XmlElement(name = "BRANCH_CODE")
            protected String branchcode;
            @XmlElement(name = "CUST_AC_NO")
            protected String custacno;
            @XmlElement(name = "CUSTOMER_NO")
            protected String customerno;
            @XmlElement(name = "PRODUCT_CODE")
            protected String productcode;
            @XmlElement(name = "TRANSACTION_LIMIT")
            protected BigDecimal transactionlimit;

            /**
             * Gets the value of the branchcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBRANCHCODE() {
                return branchcode;
            }

            /**
             * Sets the value of the branchcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBRANCHCODE(String value) {
                this.branchcode = value;
            }

            /**
             * Gets the value of the custacno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTACNO() {
                return custacno;
            }

            /**
             * Sets the value of the custacno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTACNO(String value) {
                this.custacno = value;
            }

            /**
             * Gets the value of the customerno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTOMERNO() {
                return customerno;
            }

            /**
             * Sets the value of the customerno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTOMERNO(String value) {
                this.customerno = value;
            }

            /**
             * Gets the value of the productcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRODUCTCODE() {
                return productcode;
            }

            /**
             * Sets the value of the productcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRODUCTCODE(String value) {
                this.productcode = value;
            }

            /**
             * Gets the value of the transactionlimit property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTRANSACTIONLIMIT() {
                return transactionlimit;
            }

            /**
             * Sets the value of the transactionlimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTRANSACTIONLIMIT(BigDecimal value) {
                this.transactionlimit = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DRTTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "drttxn",
        "crtxn",
        "prd"
    })
    public static class Accprdres {

        @XmlElement(name = "DRTTXN")
        protected String drttxn;
        @XmlElement(name = "CRTXN")
        protected String crtxn;
        @XmlElement(name = "PRD")
        protected String prd;

        /**
         * Gets the value of the drttxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRTTXN() {
            return drttxn;
        }

        /**
         * Sets the value of the drttxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRTTXN(String value) {
            this.drttxn = value;
        }

        /**
         * Gets the value of the crtxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRTXN() {
            return crtxn;
        }

        /**
         * Sets the value of the crtxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRTXN(String value) {
            this.crtxn = value;
        }

        /**
         * Gets the value of the prd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRD() {
            return prd;
        }

        /**
         * Sets the value of the prd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRD(String value) {
            this.prd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRTTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "txncd",
        "drttxn",
        "crtxn"
    })
    public static class Acctxnres {

        @XmlElement(name = "TXNCD")
        protected String txncd;
        @XmlElement(name = "DRTTXN")
        protected String drttxn;
        @XmlElement(name = "CRTXN")
        protected String crtxn;

        /**
         * Gets the value of the txncd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNCD() {
            return txncd;
        }

        /**
         * Sets the value of the txncd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNCD(String value) {
            this.txncd = value;
        }

        /**
         * Gets the value of the drttxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRTTXN() {
            return drttxn;
        }

        /**
         * Sets the value of the drttxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRTTXN(String value) {
            this.drttxn = value;
        }

        /**
         * Gets the value of the crtxn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRTXN() {
            return crtxn;
        }

        /**
         * Sets the value of the crtxn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRTXN(String value) {
            this.crtxn = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ACSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRHOLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRCBLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acstatus",
        "drholine",
        "crholine",
        "crcbline",
        "drcbline",
        "drgl",
        "crgl",
        "desc"
    })
    public static class Acstatuslines {

        @XmlElement(name = "ACSTATUS")
        protected String acstatus;
        @XmlElement(name = "DRHOLINE")
        protected String drholine;
        @XmlElement(name = "CRHOLINE")
        protected String crholine;
        @XmlElement(name = "CRCBLINE")
        protected String crcbline;
        @XmlElement(name = "DRCBLINE")
        protected String drcbline;
        @XmlElement(name = "DRGL")
        protected String drgl;
        @XmlElement(name = "CRGL")
        protected String crgl;
        @XmlElement(name = "DESC")
        protected String desc;

        /**
         * Gets the value of the acstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATUS() {
            return acstatus;
        }

        /**
         * Sets the value of the acstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATUS(String value) {
            this.acstatus = value;
        }

        /**
         * Gets the value of the drholine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRHOLINE() {
            return drholine;
        }

        /**
         * Sets the value of the drholine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRHOLINE(String value) {
            this.drholine = value;
        }

        /**
         * Gets the value of the crholine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRHOLINE() {
            return crholine;
        }

        /**
         * Sets the value of the crholine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRHOLINE(String value) {
            this.crholine = value;
        }

        /**
         * Gets the value of the crcbline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRCBLINE() {
            return crcbline;
        }

        /**
         * Sets the value of the crcbline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRCBLINE(String value) {
            this.crcbline = value;
        }

        /**
         * Gets the value of the drcbline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCBLINE() {
            return drcbline;
        }

        /**
         * Sets the value of the drcbline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCBLINE(String value) {
            this.drcbline = value;
        }

        /**
         * Gets the value of the drgl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRGL() {
            return drgl;
        }

        /**
         * Sets the value of the drgl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRGL(String value) {
            this.drgl = value;
        }

        /**
         * Gets the value of the crgl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRGL() {
            return crgl;
        }

        /**
         * Sets the value of the crgl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRGL(String value) {
            this.crgl = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESC() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESC(String value) {
            this.desc = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PAYOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="OFFSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payopt",
        "amt",
        "offsacc",
        "percentage"
    })
    public static class AddpayinDtls {

        @XmlElement(name = "PAYOPT")
        protected String payopt;
        @XmlElement(name = "AMT")
        protected BigDecimal amt;
        @XmlElement(name = "OFFSACC")
        protected String offsacc;
        @XmlElement(name = "PERCENTAGE")
        protected BigDecimal percentage;

        /**
         * Gets the value of the payopt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYOPT() {
            return payopt;
        }

        /**
         * Sets the value of the payopt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYOPT(String value) {
            this.payopt = value;
        }

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMT() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMT(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the offsacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFSACC() {
            return offsacc;
        }

        /**
         * Sets the value of the offsacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFSACC(String value) {
            this.offsacc = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPERCENTAGE() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPERCENTAGE(BigDecimal value) {
            this.percentage = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DR_INT_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PROVAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CHG_DUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="WITHDRAWABLE_UNCOLLED_FUND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_OPENING_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_TODAY_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_TODAY_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_TANK_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCY_CURR_BALANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_BLOCKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_AVL_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNAUTH_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNAUTH_TANK_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNAUTH_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNAUTH_TANK_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNAUTH_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNAUTH_TANK_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_ACCRUED_DR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="ACY_ACCRUED_CR_IC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DATE_LAST_CR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DATE_LAST_DR_ACTIVITY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DATE_LAST_DR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DATE_LAST_CR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ACY_UNCOLLECTED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RECEIVABLE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DC_LCY_OPEN_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DIS_UNUTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DIS_TOT_AVL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CURRPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UTILIZED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SWEEP_ELIG_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DC_ILM_SWEEP_BAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Turnovers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="LCY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ACY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="LCY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ACY_TOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LCY_TOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "drintdue",
        "provamt",
        "chgdue",
        "withdrawableuncolledfund",
        "acyopeningbal",
        "lcyopeningbal",
        "acytodaytoverdr",
        "lcytodaytoverdr",
        "acytodaytovercr",
        "lcytodaytovercr",
        "acytankcr",
        "acytankdr",
        "lcytankcr",
        "lcytankdr",
        "acytankuncollected",
        "acycurrbalance",
        "lcycurrbalance",
        "acyblockedamount",
        "acyavlbal",
        "acyunauthdr",
        "acyunauthtankdr",
        "acyunauthcr",
        "acyunauthtankcr",
        "acyunauthuncollected",
        "acyunauthtankuncollected",
        "acyaccrueddric",
        "acyaccruedcric",
        "datelastcractivity",
        "datelastdractivity",
        "datelastdr",
        "datelastcr",
        "acyuncollected",
        "receivableamount",
        "dclcyopenbal",
        "disunutilizedamt",
        "distotavlamount",
        "ccy",
        "currprd",
        "utilizedamt",
        "limitamount",
        "sweepeligbal",
        "dcilmsweepbal",
        "amtdue",
        "turnovers"
    })
    public static class AmountDates {

        @XmlElement(name = "DR_INT_DUE")
        protected BigDecimal drintdue;
        @XmlElement(name = "PROVAMT")
        protected BigDecimal provamt;
        @XmlElement(name = "CHG_DUE")
        protected BigDecimal chgdue;
        @XmlElement(name = "WITHDRAWABLE_UNCOLLED_FUND")
        protected BigDecimal withdrawableuncolledfund;
        @XmlElement(name = "ACY_OPENING_BAL")
        protected BigDecimal acyopeningbal;
        @XmlElement(name = "LCY_OPENING_BAL")
        protected BigDecimal lcyopeningbal;
        @XmlElement(name = "ACY_TODAY_TOVER_DR")
        protected BigDecimal acytodaytoverdr;
        @XmlElement(name = "LCY_TODAY_TOVER_DR")
        protected BigDecimal lcytodaytoverdr;
        @XmlElement(name = "ACY_TODAY_TOVER_CR")
        protected BigDecimal acytodaytovercr;
        @XmlElement(name = "LCY_TODAY_TOVER_CR")
        protected BigDecimal lcytodaytovercr;
        @XmlElement(name = "ACY_TANK_CR")
        protected BigDecimal acytankcr;
        @XmlElement(name = "ACY_TANK_DR")
        protected BigDecimal acytankdr;
        @XmlElement(name = "LCY_TANK_CR")
        protected BigDecimal lcytankcr;
        @XmlElement(name = "LCY_TANK_DR")
        protected BigDecimal lcytankdr;
        @XmlElement(name = "ACY_TANK_UNCOLLECTED")
        protected BigDecimal acytankuncollected;
        @XmlElement(name = "ACY_CURR_BALANCE")
        protected BigDecimal acycurrbalance;
        @XmlElement(name = "LCY_CURR_BALANCE")
        protected BigDecimal lcycurrbalance;
        @XmlElement(name = "ACY_BLOCKED_AMOUNT")
        protected BigDecimal acyblockedamount;
        @XmlElement(name = "ACY_AVL_BAL")
        protected BigDecimal acyavlbal;
        @XmlElement(name = "ACY_UNAUTH_DR")
        protected BigDecimal acyunauthdr;
        @XmlElement(name = "ACY_UNAUTH_TANK_DR")
        protected BigDecimal acyunauthtankdr;
        @XmlElement(name = "ACY_UNAUTH_CR")
        protected BigDecimal acyunauthcr;
        @XmlElement(name = "ACY_UNAUTH_TANK_CR")
        protected BigDecimal acyunauthtankcr;
        @XmlElement(name = "ACY_UNAUTH_UNCOLLECTED")
        protected BigDecimal acyunauthuncollected;
        @XmlElement(name = "ACY_UNAUTH_TANK_UNCOLLECTED")
        protected BigDecimal acyunauthtankuncollected;
        @XmlElement(name = "ACY_ACCRUED_DR_IC")
        protected BigDecimal acyaccrueddric;
        @XmlElement(name = "ACY_ACCRUED_CR_IC")
        protected BigDecimal acyaccruedcric;
        @XmlElement(name = "DATE_LAST_CR_ACTIVITY")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datelastcractivity;
        @XmlElement(name = "DATE_LAST_DR_ACTIVITY")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datelastdractivity;
        @XmlElement(name = "DATE_LAST_DR")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datelastdr;
        @XmlElement(name = "DATE_LAST_CR")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datelastcr;
        @XmlElement(name = "ACY_UNCOLLECTED")
        protected BigDecimal acyuncollected;
        @XmlElement(name = "RECEIVABLE_AMOUNT")
        protected BigDecimal receivableamount;
        @XmlElement(name = "DC_LCY_OPEN_BAL")
        protected String dclcyopenbal;
        @XmlElement(name = "DIS_UNUTILIZED_AMT")
        protected String disunutilizedamt;
        @XmlElement(name = "DIS_TOT_AVL_AMOUNT")
        protected String distotavlamount;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "CURRPRD")
        protected String currprd;
        @XmlElement(name = "UTILIZED_AMT")
        protected BigDecimal utilizedamt;
        @XmlElement(name = "LIMIT_AMOUNT")
        protected BigDecimal limitamount;
        @XmlElement(name = "SWEEP_ELIG_BAL")
        protected BigDecimal sweepeligbal;
        @XmlElement(name = "DC_ILM_SWEEP_BAL")
        protected String dcilmsweepbal;
        @XmlElement(name = "AMTDUE")
        protected String amtdue;
        @XmlElement(name = "Turnovers")
        protected Turnovers turnovers;

        /**
         * Gets the value of the drintdue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDRINTDUE() {
            return drintdue;
        }

        /**
         * Sets the value of the drintdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDRINTDUE(BigDecimal value) {
            this.drintdue = value;
        }

        /**
         * Gets the value of the provamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPROVAMT() {
            return provamt;
        }

        /**
         * Sets the value of the provamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPROVAMT(BigDecimal value) {
            this.provamt = value;
        }

        /**
         * Gets the value of the chgdue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHGDUE() {
            return chgdue;
        }

        /**
         * Sets the value of the chgdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHGDUE(BigDecimal value) {
            this.chgdue = value;
        }

        /**
         * Gets the value of the withdrawableuncolledfund property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWITHDRAWABLEUNCOLLEDFUND() {
            return withdrawableuncolledfund;
        }

        /**
         * Sets the value of the withdrawableuncolledfund property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWITHDRAWABLEUNCOLLEDFUND(BigDecimal value) {
            this.withdrawableuncolledfund = value;
        }

        /**
         * Gets the value of the acyopeningbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYOPENINGBAL() {
            return acyopeningbal;
        }

        /**
         * Sets the value of the acyopeningbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYOPENINGBAL(BigDecimal value) {
            this.acyopeningbal = value;
        }

        /**
         * Gets the value of the lcyopeningbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYOPENINGBAL() {
            return lcyopeningbal;
        }

        /**
         * Sets the value of the lcyopeningbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYOPENINGBAL(BigDecimal value) {
            this.lcyopeningbal = value;
        }

        /**
         * Gets the value of the acytodaytoverdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTODAYTOVERDR() {
            return acytodaytoverdr;
        }

        /**
         * Sets the value of the acytodaytoverdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTODAYTOVERDR(BigDecimal value) {
            this.acytodaytoverdr = value;
        }

        /**
         * Gets the value of the lcytodaytoverdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYTODAYTOVERDR() {
            return lcytodaytoverdr;
        }

        /**
         * Sets the value of the lcytodaytoverdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYTODAYTOVERDR(BigDecimal value) {
            this.lcytodaytoverdr = value;
        }

        /**
         * Gets the value of the acytodaytovercr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTODAYTOVERCR() {
            return acytodaytovercr;
        }

        /**
         * Sets the value of the acytodaytovercr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTODAYTOVERCR(BigDecimal value) {
            this.acytodaytovercr = value;
        }

        /**
         * Gets the value of the lcytodaytovercr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYTODAYTOVERCR() {
            return lcytodaytovercr;
        }

        /**
         * Sets the value of the lcytodaytovercr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYTODAYTOVERCR(BigDecimal value) {
            this.lcytodaytovercr = value;
        }

        /**
         * Gets the value of the acytankcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTANKCR() {
            return acytankcr;
        }

        /**
         * Sets the value of the acytankcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTANKCR(BigDecimal value) {
            this.acytankcr = value;
        }

        /**
         * Gets the value of the acytankdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTANKDR() {
            return acytankdr;
        }

        /**
         * Sets the value of the acytankdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTANKDR(BigDecimal value) {
            this.acytankdr = value;
        }

        /**
         * Gets the value of the lcytankcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYTANKCR() {
            return lcytankcr;
        }

        /**
         * Sets the value of the lcytankcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYTANKCR(BigDecimal value) {
            this.lcytankcr = value;
        }

        /**
         * Gets the value of the lcytankdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYTANKDR() {
            return lcytankdr;
        }

        /**
         * Sets the value of the lcytankdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYTANKDR(BigDecimal value) {
            this.lcytankdr = value;
        }

        /**
         * Gets the value of the acytankuncollected property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYTANKUNCOLLECTED() {
            return acytankuncollected;
        }

        /**
         * Sets the value of the acytankuncollected property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYTANKUNCOLLECTED(BigDecimal value) {
            this.acytankuncollected = value;
        }

        /**
         * Gets the value of the acycurrbalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYCURRBALANCE() {
            return acycurrbalance;
        }

        /**
         * Sets the value of the acycurrbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYCURRBALANCE(BigDecimal value) {
            this.acycurrbalance = value;
        }

        /**
         * Gets the value of the lcycurrbalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYCURRBALANCE() {
            return lcycurrbalance;
        }

        /**
         * Sets the value of the lcycurrbalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYCURRBALANCE(BigDecimal value) {
            this.lcycurrbalance = value;
        }

        /**
         * Gets the value of the acyblockedamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYBLOCKEDAMOUNT() {
            return acyblockedamount;
        }

        /**
         * Sets the value of the acyblockedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYBLOCKEDAMOUNT(BigDecimal value) {
            this.acyblockedamount = value;
        }

        /**
         * Gets the value of the acyavlbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYAVLBAL() {
            return acyavlbal;
        }

        /**
         * Sets the value of the acyavlbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYAVLBAL(BigDecimal value) {
            this.acyavlbal = value;
        }

        /**
         * Gets the value of the acyunauthdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHDR() {
            return acyunauthdr;
        }

        /**
         * Sets the value of the acyunauthdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHDR(BigDecimal value) {
            this.acyunauthdr = value;
        }

        /**
         * Gets the value of the acyunauthtankdr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHTANKDR() {
            return acyunauthtankdr;
        }

        /**
         * Sets the value of the acyunauthtankdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHTANKDR(BigDecimal value) {
            this.acyunauthtankdr = value;
        }

        /**
         * Gets the value of the acyunauthcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHCR() {
            return acyunauthcr;
        }

        /**
         * Sets the value of the acyunauthcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHCR(BigDecimal value) {
            this.acyunauthcr = value;
        }

        /**
         * Gets the value of the acyunauthtankcr property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHTANKCR() {
            return acyunauthtankcr;
        }

        /**
         * Sets the value of the acyunauthtankcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHTANKCR(BigDecimal value) {
            this.acyunauthtankcr = value;
        }

        /**
         * Gets the value of the acyunauthuncollected property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHUNCOLLECTED() {
            return acyunauthuncollected;
        }

        /**
         * Sets the value of the acyunauthuncollected property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHUNCOLLECTED(BigDecimal value) {
            this.acyunauthuncollected = value;
        }

        /**
         * Gets the value of the acyunauthtankuncollected property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNAUTHTANKUNCOLLECTED() {
            return acyunauthtankuncollected;
        }

        /**
         * Sets the value of the acyunauthtankuncollected property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNAUTHTANKUNCOLLECTED(BigDecimal value) {
            this.acyunauthtankuncollected = value;
        }

        /**
         * Gets the value of the acyaccrueddric property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYACCRUEDDRIC() {
            return acyaccrueddric;
        }

        /**
         * Sets the value of the acyaccrueddric property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYACCRUEDDRIC(BigDecimal value) {
            this.acyaccrueddric = value;
        }

        /**
         * Gets the value of the acyaccruedcric property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYACCRUEDCRIC() {
            return acyaccruedcric;
        }

        /**
         * Sets the value of the acyaccruedcric property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYACCRUEDCRIC(BigDecimal value) {
            this.acyaccruedcric = value;
        }

        /**
         * Gets the value of the datelastcractivity property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATELASTCRACTIVITY() {
            return datelastcractivity;
        }

        /**
         * Sets the value of the datelastcractivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATELASTCRACTIVITY(XMLGregorianCalendar value) {
            this.datelastcractivity = value;
        }

        /**
         * Gets the value of the datelastdractivity property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATELASTDRACTIVITY() {
            return datelastdractivity;
        }

        /**
         * Sets the value of the datelastdractivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATELASTDRACTIVITY(XMLGregorianCalendar value) {
            this.datelastdractivity = value;
        }

        /**
         * Gets the value of the datelastdr property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATELASTDR() {
            return datelastdr;
        }

        /**
         * Sets the value of the datelastdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATELASTDR(XMLGregorianCalendar value) {
            this.datelastdr = value;
        }

        /**
         * Gets the value of the datelastcr property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDATELASTCR() {
            return datelastcr;
        }

        /**
         * Sets the value of the datelastcr property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDATELASTCR(XMLGregorianCalendar value) {
            this.datelastcr = value;
        }

        /**
         * Gets the value of the acyuncollected property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYUNCOLLECTED() {
            return acyuncollected;
        }

        /**
         * Sets the value of the acyuncollected property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYUNCOLLECTED(BigDecimal value) {
            this.acyuncollected = value;
        }

        /**
         * Gets the value of the receivableamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRECEIVABLEAMOUNT() {
            return receivableamount;
        }

        /**
         * Sets the value of the receivableamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRECEIVABLEAMOUNT(BigDecimal value) {
            this.receivableamount = value;
        }

        /**
         * Gets the value of the dclcyopenbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCLCYOPENBAL() {
            return dclcyopenbal;
        }

        /**
         * Sets the value of the dclcyopenbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCLCYOPENBAL(String value) {
            this.dclcyopenbal = value;
        }

        /**
         * Gets the value of the disunutilizedamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISUNUTILIZEDAMT() {
            return disunutilizedamt;
        }

        /**
         * Sets the value of the disunutilizedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISUNUTILIZEDAMT(String value) {
            this.disunutilizedamt = value;
        }

        /**
         * Gets the value of the distotavlamount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISTOTAVLAMOUNT() {
            return distotavlamount;
        }

        /**
         * Sets the value of the distotavlamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISTOTAVLAMOUNT(String value) {
            this.distotavlamount = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the currprd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCURRPRD() {
            return currprd;
        }

        /**
         * Sets the value of the currprd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCURRPRD(String value) {
            this.currprd = value;
        }

        /**
         * Gets the value of the utilizedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUTILIZEDAMT() {
            return utilizedamt;
        }

        /**
         * Sets the value of the utilizedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUTILIZEDAMT(BigDecimal value) {
            this.utilizedamt = value;
        }

        /**
         * Gets the value of the limitamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITAMOUNT() {
            return limitamount;
        }

        /**
         * Sets the value of the limitamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITAMOUNT(BigDecimal value) {
            this.limitamount = value;
        }

        /**
         * Gets the value of the sweepeligbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSWEEPELIGBAL() {
            return sweepeligbal;
        }

        /**
         * Sets the value of the sweepeligbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSWEEPELIGBAL(BigDecimal value) {
            this.sweepeligbal = value;
        }

        /**
         * Gets the value of the dcilmsweepbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCILMSWEEPBAL() {
            return dcilmsweepbal;
        }

        /**
         * Sets the value of the dcilmsweepbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCILMSWEEPBAL(String value) {
            this.dcilmsweepbal = value;
        }

        /**
         * Gets the value of the amtdue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMTDUE() {
            return amtdue;
        }

        /**
         * Sets the value of the amtdue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMTDUE(String value) {
            this.amtdue = value;
        }

        /**
         * Gets the value of the turnovers property.
         * 
         * @return
         *     possible object is
         *     {@link Turnovers }
         *     
         */
        public Turnovers getTurnovers() {
            return turnovers;
        }

        /**
         * Sets the value of the turnovers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Turnovers }
         *     
         */
        public void setTurnovers(Turnovers value) {
            this.turnovers = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ACY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="LCY_MTD_TOVER_DR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ACY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="LCY_MTD_TOVER_CR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ACY_TOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LCY_TOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "acymtdtoverdr",
            "lcymtdtoverdr",
            "acymtdtovercr",
            "lcymtdtovercr",
            "acytov",
            "lcytov"
        })
        public static class Turnovers {

            @XmlElement(name = "ACY_MTD_TOVER_DR")
            protected BigDecimal acymtdtoverdr;
            @XmlElement(name = "LCY_MTD_TOVER_DR")
            protected BigDecimal lcymtdtoverdr;
            @XmlElement(name = "ACY_MTD_TOVER_CR")
            protected BigDecimal acymtdtovercr;
            @XmlElement(name = "LCY_MTD_TOVER_CR")
            protected BigDecimal lcymtdtovercr;
            @XmlElement(name = "ACY_TOV")
            protected String acytov;
            @XmlElement(name = "LCY_TOV")
            protected String lcytov;

            /**
             * Gets the value of the acymtdtoverdr property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getACYMTDTOVERDR() {
                return acymtdtoverdr;
            }

            /**
             * Sets the value of the acymtdtoverdr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setACYMTDTOVERDR(BigDecimal value) {
                this.acymtdtoverdr = value;
            }

            /**
             * Gets the value of the lcymtdtoverdr property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLCYMTDTOVERDR() {
                return lcymtdtoverdr;
            }

            /**
             * Sets the value of the lcymtdtoverdr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLCYMTDTOVERDR(BigDecimal value) {
                this.lcymtdtoverdr = value;
            }

            /**
             * Gets the value of the acymtdtovercr property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getACYMTDTOVERCR() {
                return acymtdtovercr;
            }

            /**
             * Sets the value of the acymtdtovercr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setACYMTDTOVERCR(BigDecimal value) {
                this.acymtdtovercr = value;
            }

            /**
             * Gets the value of the lcymtdtovercr property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLCYMTDTOVERCR() {
                return lcymtdtovercr;
            }

            /**
             * Sets the value of the lcymtdtovercr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLCYMTDTOVERCR(BigDecimal value) {
                this.lcymtdtovercr = value;
            }

            /**
             * Gets the value of the acytov property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACYTOV() {
                return acytov;
            }

            /**
             * Sets the value of the acytov property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACYTOV(String value) {
                this.acytov = value;
            }

            /**
             * Gets the value of the lcytov property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLCYTOV() {
                return lcytov;
            }

            /**
             * Sets the value of the lcytov property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLCYTOV(String value) {
                this.lcytov = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BICCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "biccode"
    })
    public static class Authbicdetails {

        @XmlElement(name = "BICCODE", required = true)
        protected String biccode;

        /**
         * Gets the value of the biccode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBICCODE() {
            return biccode;
        }

        /**
         * Sets the value of the biccode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBICCODE(String value) {
            this.biccode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="REQUEST_REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CARD_PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CARD_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAME_ON_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CARD_APPL_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestreferenceno",
        "cardproduct",
        "cardbin",
        "nameoncard",
        "cardno",
        "cardappldate"
    })
    public static class CustAccCard {

        @XmlElement(name = "REQUEST_REFERENCE_NO", required = true)
        protected String requestreferenceno;
        @XmlElement(name = "CARD_PRODUCT")
        protected String cardproduct;
        @XmlElement(name = "CARD_BIN")
        protected String cardbin;
        @XmlElement(name = "NAME_ON_CARD")
        protected String nameoncard;
        @XmlElement(name = "CARD_NO")
        protected String cardno;
        @XmlElement(name = "CARD_APPL_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar cardappldate;

        /**
         * Gets the value of the requestreferenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREQUESTREFERENCENO() {
            return requestreferenceno;
        }

        /**
         * Sets the value of the requestreferenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREQUESTREFERENCENO(String value) {
            this.requestreferenceno = value;
        }

        /**
         * Gets the value of the cardproduct property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDPRODUCT() {
            return cardproduct;
        }

        /**
         * Sets the value of the cardproduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDPRODUCT(String value) {
            this.cardproduct = value;
        }

        /**
         * Gets the value of the cardbin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDBIN() {
            return cardbin;
        }

        /**
         * Sets the value of the cardbin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDBIN(String value) {
            this.cardbin = value;
        }

        /**
         * Gets the value of the nameoncard property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAMEONCARD() {
            return nameoncard;
        }

        /**
         * Sets the value of the nameoncard property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAMEONCARD(String value) {
            this.nameoncard = value;
        }

        /**
         * Gets the value of the cardno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDNO() {
            return cardno;
        }

        /**
         * Sets the value of the cardno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDNO(String value) {
            this.cardno = value;
        }

        /**
         * Gets the value of the cardappldate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCARDAPPLDATE() {
            return cardappldate;
        }

        /**
         * Sets the value of the cardappldate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCARDAPPLDATE(XMLGregorianCalendar value) {
            this.cardappldate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FIRST_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHECK_LEAVES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CHEQUE_BOOK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ORDER_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LANG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHQ_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstcheckno",
        "checkleaves",
        "chequebooktype",
        "orderdate",
        "orderdetails",
        "langcode",
        "chqtype"
    })
    public static class CustAccCheck {

        @XmlElement(name = "FIRST_CHECK_NO")
        protected String firstcheckno;
        @XmlElement(name = "CHECK_LEAVES")
        protected BigDecimal checkleaves;
        @XmlElement(name = "CHEQUE_BOOK_TYPE")
        protected String chequebooktype;
        @XmlElement(name = "ORDER_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar orderdate;
        @XmlElement(name = "ORDER_DETAILS")
        protected String orderdetails;
        @XmlElement(name = "LANG_CODE")
        protected String langcode;
        @XmlElement(name = "CHQ_TYPE")
        protected String chqtype;

        /**
         * Gets the value of the firstcheckno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTCHECKNO() {
            return firstcheckno;
        }

        /**
         * Sets the value of the firstcheckno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTCHECKNO(String value) {
            this.firstcheckno = value;
        }

        /**
         * Gets the value of the checkleaves property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHECKLEAVES() {
            return checkleaves;
        }

        /**
         * Sets the value of the checkleaves property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHECKLEAVES(BigDecimal value) {
            this.checkleaves = value;
        }

        /**
         * Gets the value of the chequebooktype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHEQUEBOOKTYPE() {
            return chequebooktype;
        }

        /**
         * Sets the value of the chequebooktype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHEQUEBOOKTYPE(String value) {
            this.chequebooktype = value;
        }

        /**
         * Gets the value of the orderdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getORDERDATE() {
            return orderdate;
        }

        /**
         * Sets the value of the orderdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setORDERDATE(XMLGregorianCalendar value) {
            this.orderdate = value;
        }

        /**
         * Gets the value of the orderdetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDERDETAILS() {
            return orderdetails;
        }

        /**
         * Sets the value of the orderdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDERDETAILS(String value) {
            this.orderdetails = value;
        }

        /**
         * Gets the value of the langcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLANGCODE() {
            return langcode;
        }

        /**
         * Sets the value of the langcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLANGCODE(String value) {
            this.langcode = value;
        }

        /**
         * Gets the value of the chqtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQTYPE() {
            return chqtype;
        }

        /**
         * Sets the value of the chqtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQTYPE(String value) {
            this.chqtype = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CHECKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="EXPECTED_DATE_SUBMISSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "checked",
        "expirydate",
        "expecteddatesubmission"
    })
    public static class DoctypeChecklist {

        @XmlElement(name = "CHECKED")
        protected String checked;
        @XmlElement(name = "EXPIRY_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expirydate;
        @XmlElement(name = "EXPECTED_DATE_SUBMISSION")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expecteddatesubmission;

        /**
         * Gets the value of the checked property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKED() {
            return checked;
        }

        /**
         * Sets the value of the checked property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKED(String value) {
            this.checked = value;
        }

        /**
         * Gets the value of the expirydate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPIRYDATE() {
            return expirydate;
        }

        /**
         * Sets the value of the expirydate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPIRYDATE(XMLGregorianCalendar value) {
            this.expirydate = value;
        }

        /**
         * Gets the value of the expecteddatesubmission property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEXPECTEDDATESUBMISSION() {
            return expecteddatesubmission;
        }

        /**
         * Sets the value of the expecteddatesubmission property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEXPECTEDDATESUBMISSION(XMLGregorianCalendar value) {
            this.expecteddatesubmission = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARK10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SEND_NOTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remark1",
        "remark2",
        "remark3",
        "remark4",
        "remark5",
        "remark6",
        "remark7",
        "remark8",
        "remark9",
        "remark10",
        "sendnotification",
        "frequency",
        "days"
    })
    public static class DoctypeRemarks {

        @XmlElement(name = "REMARK1")
        protected String remark1;
        @XmlElement(name = "REMARK2")
        protected String remark2;
        @XmlElement(name = "REMARK3")
        protected String remark3;
        @XmlElement(name = "REMARK4")
        protected String remark4;
        @XmlElement(name = "REMARK5")
        protected String remark5;
        @XmlElement(name = "REMARK6")
        protected String remark6;
        @XmlElement(name = "REMARK7")
        protected String remark7;
        @XmlElement(name = "REMARK8")
        protected String remark8;
        @XmlElement(name = "REMARK9")
        protected String remark9;
        @XmlElement(name = "REMARK10")
        protected String remark10;
        @XmlElement(name = "SEND_NOTIFICATION")
        protected String sendnotification;
        @XmlElement(name = "FREQUENCY")
        protected String frequency;
        @XmlElement(name = "DAYS")
        protected BigDecimal days;

        /**
         * Gets the value of the remark1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK1() {
            return remark1;
        }

        /**
         * Sets the value of the remark1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK1(String value) {
            this.remark1 = value;
        }

        /**
         * Gets the value of the remark2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK2() {
            return remark2;
        }

        /**
         * Sets the value of the remark2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK2(String value) {
            this.remark2 = value;
        }

        /**
         * Gets the value of the remark3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK3() {
            return remark3;
        }

        /**
         * Sets the value of the remark3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK3(String value) {
            this.remark3 = value;
        }

        /**
         * Gets the value of the remark4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK4() {
            return remark4;
        }

        /**
         * Sets the value of the remark4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK4(String value) {
            this.remark4 = value;
        }

        /**
         * Gets the value of the remark5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK5() {
            return remark5;
        }

        /**
         * Sets the value of the remark5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK5(String value) {
            this.remark5 = value;
        }

        /**
         * Gets the value of the remark6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK6() {
            return remark6;
        }

        /**
         * Sets the value of the remark6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK6(String value) {
            this.remark6 = value;
        }

        /**
         * Gets the value of the remark7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK7() {
            return remark7;
        }

        /**
         * Sets the value of the remark7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK7(String value) {
            this.remark7 = value;
        }

        /**
         * Gets the value of the remark8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK8() {
            return remark8;
        }

        /**
         * Sets the value of the remark8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK8(String value) {
            this.remark8 = value;
        }

        /**
         * Gets the value of the remark9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK9() {
            return remark9;
        }

        /**
         * Sets the value of the remark9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK9(String value) {
            this.remark9 = value;
        }

        /**
         * Gets the value of the remark10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMARK10() {
            return remark10;
        }

        /**
         * Sets the value of the remark10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMARK10(String value) {
            this.remark10 = value;
        }

        /**
         * Gets the value of the sendnotification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDNOTIFICATION() {
            return sendnotification;
        }

        /**
         * Sets the value of the sendnotification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDNOTIFICATION(String value) {
            this.sendnotification = value;
        }

        /**
         * Gets the value of the frequency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREQUENCY() {
            return frequency;
        }

        /**
         * Sets the value of the frequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREQUENCY(String value) {
            this.frequency = value;
        }

        /**
         * Gets the value of the days property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDAYS() {
            return days;
        }

        /**
         * Sets the value of the days property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDAYS(BigDecimal value) {
            this.days = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndorseLog {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CALCACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="HASIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRCRADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGBOOKACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGBOOKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CONSOL_CHG_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CONSOLCHGBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTRATE_CUMAMT_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REDM_INT_PAYOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Intprodmap" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Inteffdtmap" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                       &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Extude" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXT_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXT_UDE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXT_UDE_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="EXT_UDE_VARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="UDE_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "calcacc",
        "bookacc",
        "hasis",
        "bookaccbrn",
        "drcradv",
        "chgbookaccbrn",
        "chgbookacc",
        "consolchgacc",
        "consolchgbrn",
        "intratecumamtreqd",
        "redmintpayout",
        "intprodmap",
        "extude"
    })
    public static class Intdetails {

        @XmlElement(name = "CALCACC")
        protected String calcacc;
        @XmlElement(name = "BOOKACC")
        protected String bookacc;
        @XmlElement(name = "HASIS")
        protected String hasis;
        @XmlElement(name = "BOOKACCBRN")
        protected String bookaccbrn;
        @XmlElement(name = "DRCRADV")
        protected String drcradv;
        @XmlElement(name = "CHGBOOKACCBRN")
        protected String chgbookaccbrn;
        @XmlElement(name = "CHGBOOKACC")
        protected String chgbookacc;
        @XmlElement(name = "CONSOL_CHG_ACC")
        protected String consolchgacc;
        @XmlElement(name = "CONSOLCHGBRN")
        protected String consolchgbrn;
        @XmlElement(name = "INTRATE_CUMAMT_REQD")
        protected String intratecumamtreqd;
        @XmlElement(name = "REDM_INT_PAYOUT")
        protected String redmintpayout;
        @XmlElement(name = "Intprodmap")
        protected List<Intprodmap> intprodmap;
        @XmlElement(name = "Extude")
        protected List<Extude> extude;

        /**
         * Gets the value of the calcacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALCACC() {
            return calcacc;
        }

        /**
         * Sets the value of the calcacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALCACC(String value) {
            this.calcacc = value;
        }

        /**
         * Gets the value of the bookacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKACC() {
            return bookacc;
        }

        /**
         * Sets the value of the bookacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKACC(String value) {
            this.bookacc = value;
        }

        /**
         * Gets the value of the hasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHASIS() {
            return hasis;
        }

        /**
         * Sets the value of the hasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHASIS(String value) {
            this.hasis = value;
        }

        /**
         * Gets the value of the bookaccbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOOKACCBRN() {
            return bookaccbrn;
        }

        /**
         * Sets the value of the bookaccbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOOKACCBRN(String value) {
            this.bookaccbrn = value;
        }

        /**
         * Gets the value of the drcradv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRADV() {
            return drcradv;
        }

        /**
         * Sets the value of the drcradv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRADV(String value) {
            this.drcradv = value;
        }

        /**
         * Gets the value of the chgbookaccbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGBOOKACCBRN() {
            return chgbookaccbrn;
        }

        /**
         * Sets the value of the chgbookaccbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGBOOKACCBRN(String value) {
            this.chgbookaccbrn = value;
        }

        /**
         * Gets the value of the chgbookacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGBOOKACC() {
            return chgbookacc;
        }

        /**
         * Sets the value of the chgbookacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGBOOKACC(String value) {
            this.chgbookacc = value;
        }

        /**
         * Gets the value of the consolchgacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLCHGACC() {
            return consolchgacc;
        }

        /**
         * Sets the value of the consolchgacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLCHGACC(String value) {
            this.consolchgacc = value;
        }

        /**
         * Gets the value of the consolchgbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONSOLCHGBRN() {
            return consolchgbrn;
        }

        /**
         * Sets the value of the consolchgbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONSOLCHGBRN(String value) {
            this.consolchgbrn = value;
        }

        /**
         * Gets the value of the intratecumamtreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTRATECUMAMTREQD() {
            return intratecumamtreqd;
        }

        /**
         * Sets the value of the intratecumamtreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTRATECUMAMTREQD(String value) {
            this.intratecumamtreqd = value;
        }

        /**
         * Gets the value of the redmintpayout property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREDMINTPAYOUT() {
            return redmintpayout;
        }

        /**
         * Sets the value of the redmintpayout property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREDMINTPAYOUT(String value) {
            this.redmintpayout = value;
        }

        /**
         * Gets the value of the intprodmap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the intprodmap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntprodmap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Intprodmap }
         * 
         * 
         */
        public List<Intprodmap> getIntprodmap() {
            if (intprodmap == null) {
                intprodmap = new ArrayList<Intprodmap>();
            }
            return this.intprodmap;
        }

        /**
         * Gets the value of the extude property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the extude property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtude().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Extude }
         * 
         * 
         */
        public List<Extude> getExtude() {
            if (extude == null) {
                extude = new ArrayList<Extude>();
            }
            return this.extude;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ACCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXT_RATE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXT_UDE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXT_UDE_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="EXT_UDE_VARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="UDE_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "acc",
            "acclass",
            "brn",
            "extratecode",
            "extudeid",
            "extudevalue",
            "extudevariance",
            "prod",
            "udeeffdt"
        })
        public static class Extude {

            @XmlElement(name = "ACC")
            protected String acc;
            @XmlElement(name = "ACCLASS")
            protected String acclass;
            @XmlElement(name = "BRN")
            protected String brn;
            @XmlElement(name = "EXT_RATE_CODE")
            protected String extratecode;
            @XmlElement(name = "EXT_UDE_ID")
            protected String extudeid;
            @XmlElement(name = "EXT_UDE_VALUE")
            protected BigDecimal extudevalue;
            @XmlElement(name = "EXT_UDE_VARIANCE")
            protected BigDecimal extudevariance;
            @XmlElement(name = "PROD")
            protected String prod;
            @XmlElement(name = "UDE_EFF_DT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar udeeffdt;

            /**
             * Gets the value of the acc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACC() {
                return acc;
            }

            /**
             * Sets the value of the acc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACC(String value) {
                this.acc = value;
            }

            /**
             * Gets the value of the acclass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCLASS() {
                return acclass;
            }

            /**
             * Sets the value of the acclass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCLASS(String value) {
                this.acclass = value;
            }

            /**
             * Gets the value of the brn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBRN() {
                return brn;
            }

            /**
             * Sets the value of the brn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBRN(String value) {
                this.brn = value;
            }

            /**
             * Gets the value of the extratecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXTRATECODE() {
                return extratecode;
            }

            /**
             * Sets the value of the extratecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXTRATECODE(String value) {
                this.extratecode = value;
            }

            /**
             * Gets the value of the extudeid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXTUDEID() {
                return extudeid;
            }

            /**
             * Sets the value of the extudeid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXTUDEID(String value) {
                this.extudeid = value;
            }

            /**
             * Gets the value of the extudevalue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEXTUDEVALUE() {
                return extudevalue;
            }

            /**
             * Sets the value of the extudevalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEXTUDEVALUE(BigDecimal value) {
                this.extudevalue = value;
            }

            /**
             * Gets the value of the extudevariance property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEXTUDEVARIANCE() {
                return extudevariance;
            }

            /**
             * Sets the value of the extudevariance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEXTUDEVARIANCE(BigDecimal value) {
                this.extudevariance = value;
            }

            /**
             * Gets the value of the prod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROD() {
                return prod;
            }

            /**
             * Sets the value of the prod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROD(String value) {
                this.prod = value;
            }

            /**
             * Gets the value of the udeeffdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getUDEEFFDT() {
                return udeeffdt;
            }

            /**
             * Sets the value of the udeeffdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setUDEEFFDT(XMLGregorianCalendar value) {
                this.udeeffdt = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="GENUDECHNGADV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRODMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INTPROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CONTVARROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Inteffdtmap" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                             &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "genudechngadv",
            "prodmapstat",
            "intprod",
            "contvarroll",
            "inteffdtmap"
        })
        public static class Intprodmap {

            @XmlElement(name = "GENUDECHNGADV")
            protected String genudechngadv;
            @XmlElement(name = "PRODMAPSTAT")
            protected String prodmapstat;
            @XmlElement(name = "INTPROD")
            protected String intprod;
            @XmlElement(name = "CONTVARROLL")
            protected String contvarroll;
            @XmlElement(name = "Inteffdtmap")
            protected List<Inteffdtmap> inteffdtmap;

            /**
             * Gets the value of the genudechngadv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGENUDECHNGADV() {
                return genudechngadv;
            }

            /**
             * Sets the value of the genudechngadv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGENUDECHNGADV(String value) {
                this.genudechngadv = value;
            }

            /**
             * Gets the value of the prodmapstat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRODMAPSTAT() {
                return prodmapstat;
            }

            /**
             * Sets the value of the prodmapstat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRODMAPSTAT(String value) {
                this.prodmapstat = value;
            }

            /**
             * Gets the value of the intprod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINTPROD() {
                return intprod;
            }

            /**
             * Sets the value of the intprod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINTPROD(String value) {
                this.intprod = value;
            }

            /**
             * Gets the value of the contvarroll property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTVARROLL() {
                return contvarroll;
            }

            /**
             * Sets the value of the contvarroll property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTVARROLL(String value) {
                this.contvarroll = value;
            }

            /**
             * Gets the value of the inteffdtmap property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the inteffdtmap property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInteffdtmap().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Inteffdtmap }
             * 
             * 
             */
            public List<Inteffdtmap> getInteffdtmap() {
                if (inteffdtmap == null) {
                    inteffdtmap = new ArrayList<Inteffdtmap>();
                }
                return this.inteffdtmap;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="UDEEFFDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="EFFDTMAPSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="Intsde" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                   &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "udeeffdt",
                "effdtmapstat",
                "intsde"
            })
            public static class Inteffdtmap {

                @XmlElement(name = "UDEEFFDT")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar udeeffdt;
                @XmlElement(name = "EFFDTMAPSTAT")
                protected String effdtmapstat;
                @XmlElement(name = "Intsde")
                protected List<Intsde> intsde;

                /**
                 * Gets the value of the udeeffdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getUDEEFFDT() {
                    return udeeffdt;
                }

                /**
                 * Sets the value of the udeeffdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setUDEEFFDT(XMLGregorianCalendar value) {
                    this.udeeffdt = value;
                }

                /**
                 * Gets the value of the effdtmapstat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEFFDTMAPSTAT() {
                    return effdtmapstat;
                }

                /**
                 * Sets the value of the effdtmapstat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEFFDTMAPSTAT(String value) {
                    this.effdtmapstat = value;
                }

                /**
                 * Gets the value of the intsde property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the intsde property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIntsde().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Intsde }
                 * 
                 * 
                 */
                public List<Intsde> getIntsde() {
                    if (intsde == null) {
                        intsde = new ArrayList<Intsde>();
                    }
                    return this.intsde;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="UDEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="UDEVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *         &lt;element name="RATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="TDRATECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="UDEVARIANCE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "udeid",
                    "udevalue",
                    "ratecode",
                    "tdratecode",
                    "udevariance"
                })
                public static class Intsde {

                    @XmlElement(name = "UDEID")
                    protected String udeid;
                    @XmlElement(name = "UDEVALUE")
                    protected BigDecimal udevalue;
                    @XmlElement(name = "RATECODE")
                    protected String ratecode;
                    @XmlElement(name = "TDRATECODE")
                    protected String tdratecode;
                    @XmlElement(name = "UDEVARIANCE")
                    protected BigDecimal udevariance;

                    /**
                     * Gets the value of the udeid property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUDEID() {
                        return udeid;
                    }

                    /**
                     * Sets the value of the udeid property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUDEID(String value) {
                        this.udeid = value;
                    }

                    /**
                     * Gets the value of the udevalue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getUDEVALUE() {
                        return udevalue;
                    }

                    /**
                     * Sets the value of the udevalue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setUDEVALUE(BigDecimal value) {
                        this.udevalue = value;
                    }

                    /**
                     * Gets the value of the ratecode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRATECODE() {
                        return ratecode;
                    }

                    /**
                     * Sets the value of the ratecode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRATECODE(String value) {
                        this.ratecode = value;
                    }

                    /**
                     * Gets the value of the tdratecode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTDRATECODE() {
                        return tdratecode;
                    }

                    /**
                     * Sets the value of the tdratecode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTDRATECODE(String value) {
                        this.tdratecode = value;
                    }

                    /**
                     * Gets the value of the udevariance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getUDEVARIANCE() {
                        return udevariance;
                    }

                    /**
                     * Sets the value of the udevariance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setUDEVARIANCE(BigDecimal value) {
                        this.udevariance = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InterestPayout {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BALRPTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTRMDRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="INTRMCRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="INTRMSTMTCNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="INTRMSTMTYTDCNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="GENINTRMSTMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GENINTRMSTMTMVMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GENBALRPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTRMRPTSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTRMRPTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BALRPTSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "balrpttyp",
        "intrmdramt",
        "intrmcramt",
        "intrmstmtcnt",
        "intrmstmtytdcnt",
        "genintrmstmt",
        "genintrmstmtmvmt",
        "genbalrpt",
        "intrmrptsince",
        "intrmrpttyp",
        "balrptsince"
    })
    public static class InterimDetails {

        @XmlElement(name = "BALRPTTYP")
        protected String balrpttyp;
        @XmlElement(name = "INTRMDRAMT")
        protected BigDecimal intrmdramt;
        @XmlElement(name = "INTRMCRAMT")
        protected BigDecimal intrmcramt;
        @XmlElement(name = "INTRMSTMTCNT")
        protected BigDecimal intrmstmtcnt;
        @XmlElement(name = "INTRMSTMTYTDCNT")
        protected BigDecimal intrmstmtytdcnt;
        @XmlElement(name = "GENINTRMSTMT")
        protected String genintrmstmt;
        @XmlElement(name = "GENINTRMSTMTMVMT")
        protected String genintrmstmtmvmt;
        @XmlElement(name = "GENBALRPT")
        protected String genbalrpt;
        @XmlElement(name = "INTRMRPTSINCE")
        protected String intrmrptsince;
        @XmlElement(name = "INTRMRPTTYP")
        protected String intrmrpttyp;
        @XmlElement(name = "BALRPTSINCE")
        protected String balrptsince;

        /**
         * Gets the value of the balrpttyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBALRPTTYP() {
            return balrpttyp;
        }

        /**
         * Sets the value of the balrpttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBALRPTTYP(String value) {
            this.balrpttyp = value;
        }

        /**
         * Gets the value of the intrmdramt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTRMDRAMT() {
            return intrmdramt;
        }

        /**
         * Sets the value of the intrmdramt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTRMDRAMT(BigDecimal value) {
            this.intrmdramt = value;
        }

        /**
         * Gets the value of the intrmcramt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTRMCRAMT() {
            return intrmcramt;
        }

        /**
         * Sets the value of the intrmcramt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTRMCRAMT(BigDecimal value) {
            this.intrmcramt = value;
        }

        /**
         * Gets the value of the intrmstmtcnt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTRMSTMTCNT() {
            return intrmstmtcnt;
        }

        /**
         * Sets the value of the intrmstmtcnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTRMSTMTCNT(BigDecimal value) {
            this.intrmstmtcnt = value;
        }

        /**
         * Gets the value of the intrmstmtytdcnt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTRMSTMTYTDCNT() {
            return intrmstmtytdcnt;
        }

        /**
         * Sets the value of the intrmstmtytdcnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTRMSTMTYTDCNT(BigDecimal value) {
            this.intrmstmtytdcnt = value;
        }

        /**
         * Gets the value of the genintrmstmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENINTRMSTMT() {
            return genintrmstmt;
        }

        /**
         * Sets the value of the genintrmstmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENINTRMSTMT(String value) {
            this.genintrmstmt = value;
        }

        /**
         * Gets the value of the genintrmstmtmvmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENINTRMSTMTMVMT() {
            return genintrmstmtmvmt;
        }

        /**
         * Sets the value of the genintrmstmtmvmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENINTRMSTMTMVMT(String value) {
            this.genintrmstmtmvmt = value;
        }

        /**
         * Gets the value of the genbalrpt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENBALRPT() {
            return genbalrpt;
        }

        /**
         * Sets the value of the genbalrpt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENBALRPT(String value) {
            this.genbalrpt = value;
        }

        /**
         * Gets the value of the intrmrptsince property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTRMRPTSINCE() {
            return intrmrptsince;
        }

        /**
         * Sets the value of the intrmrptsince property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTRMRPTSINCE(String value) {
            this.intrmrptsince = value;
        }

        /**
         * Gets the value of the intrmrpttyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTRMRPTTYP() {
            return intrmrpttyp;
        }

        /**
         * Sets the value of the intrmrpttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTRMRPTTYP(String value) {
            this.intrmrpttyp = value;
        }

        /**
         * Gets the value of the balrptsince property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBALRPTSINCE() {
            return balrptsince;
        }

        /**
         * Sets the value of the balrptsince property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBALRPTSINCE(String value) {
            this.balrptsince = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="INTERMEDIARY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY_RATIO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intermediarycode",
        "intermediarydesc",
        "intermediaryratio"
    })
    public static class Intermediary {

        @XmlElement(name = "INTERMEDIARY_CODE")
        protected String intermediarycode;
        @XmlElement(name = "INTERMEDIARY_DESC")
        protected String intermediarydesc;
        @XmlElement(name = "INTERMEDIARY_RATIO")
        protected BigDecimal intermediaryratio;

        /**
         * Gets the value of the intermediarycode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARYCODE() {
            return intermediarycode;
        }

        /**
         * Sets the value of the intermediarycode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARYCODE(String value) {
            this.intermediarycode = value;
        }

        /**
         * Gets the value of the intermediarydesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARYDESC() {
            return intermediarydesc;
        }

        /**
         * Sets the value of the intermediarydesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARYDESC(String value) {
            this.intermediarydesc = value;
        }

        /**
         * Gets the value of the intermediaryratio property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINTERMEDIARYRATIO() {
            return intermediaryratio;
        }

        /**
         * Sets the value of the intermediaryratio property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINTERMEDIARYRATIO(BigDecimal value) {
            this.intermediaryratio = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="JNTHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custno",
        "jnthldtyp",
        "startdate",
        "enddate"
    })
    public static class Jointholders {

        @XmlElement(name = "CUSTNO")
        protected String custno;
        @XmlElement(name = "JNTHLDTYP")
        protected String jnthldtyp;
        @XmlElement(name = "START_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startdate;
        @XmlElement(name = "END_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar enddate;

        /**
         * Gets the value of the custno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNO() {
            return custno;
        }

        /**
         * Sets the value of the custno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNO(String value) {
            this.custno = value;
        }

        /**
         * Gets the value of the jnthldtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJNTHLDTYP() {
            return jnthldtyp;
        }

        /**
         * Sets the value of the jnthldtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJNTHLDTYP(String value) {
            this.jnthldtyp = value;
        }

        /**
         * Gets the value of the startdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTARTDATE() {
            return startdate;
        }

        /**
         * Sets the value of the startdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTARTDATE(XMLGregorianCalendar value) {
            this.startdate = value;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ADVINTREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MONTHLYFREEAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="NOTICEPERIOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="VALIDITYPERIOD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advintreqd",
        "ccy6",
        "monthlyfreeamt",
        "noticeperiod",
        "validityperiod"
    })
    public static class Noticepref {

        @XmlElement(name = "ADVINTREQD")
        protected String advintreqd;
        @XmlElement(name = "CCY6")
        protected String ccy6;
        @XmlElement(name = "MONTHLYFREEAMT")
        protected BigDecimal monthlyfreeamt;
        @XmlElement(name = "NOTICEPERIOD")
        protected BigDecimal noticeperiod;
        @XmlElement(name = "VALIDITYPERIOD")
        protected BigDecimal validityperiod;

        /**
         * Gets the value of the advintreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADVINTREQD() {
            return advintreqd;
        }

        /**
         * Sets the value of the advintreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADVINTREQD(String value) {
            this.advintreqd = value;
        }

        /**
         * Gets the value of the ccy6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY6() {
            return ccy6;
        }

        /**
         * Sets the value of the ccy6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY6(String value) {
            this.ccy6 = value;
        }

        /**
         * Gets the value of the monthlyfreeamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMONTHLYFREEAMT() {
            return monthlyfreeamt;
        }

        /**
         * Sets the value of the monthlyfreeamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMONTHLYFREEAMT(BigDecimal value) {
            this.monthlyfreeamt = value;
        }

        /**
         * Gets the value of the noticeperiod property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNOTICEPERIOD() {
            return noticeperiod;
        }

        /**
         * Sets the value of the noticeperiod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNOTICEPERIOD(BigDecimal value) {
            this.noticeperiod = value;
        }

        /**
         * Gets the value of the validityperiod property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVALIDITYPERIOD() {
            return validityperiod;
        }

        /**
         * Sets the value of the validityperiod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVALIDITYPERIOD(BigDecimal value) {
            this.validityperiod = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LINKAGE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LINKAGE_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EFFECTIVE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EAR_MARKED_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerno",
        "linkagetype",
        "linkagerefno",
        "effectivedate",
        "limitamount",
        "earmarkedamt"
    })
    public static class OdLimit {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "LINKAGE_TYPE")
        protected String linkagetype;
        @XmlElement(name = "LINKAGE_REF_NO")
        protected String linkagerefno;
        @XmlElement(name = "EFFECTIVE_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectivedate;
        @XmlElement(name = "LIMIT_AMOUNT")
        protected BigDecimal limitamount;
        @XmlElement(name = "EAR_MARKED_AMT")
        protected BigDecimal earmarkedamt;

        /**
         * Gets the value of the customerno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERNO() {
            return customerno;
        }

        /**
         * Sets the value of the customerno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERNO(String value) {
            this.customerno = value;
        }

        /**
         * Gets the value of the linkagetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKAGETYPE() {
            return linkagetype;
        }

        /**
         * Sets the value of the linkagetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKAGETYPE(String value) {
            this.linkagetype = value;
        }

        /**
         * Gets the value of the linkagerefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLINKAGEREFNO() {
            return linkagerefno;
        }

        /**
         * Sets the value of the linkagerefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLINKAGEREFNO(String value) {
            this.linkagerefno = value;
        }

        /**
         * Gets the value of the effectivedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEFFECTIVEDATE() {
            return effectivedate;
        }

        /**
         * Sets the value of the effectivedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEFFECTIVEDATE(XMLGregorianCalendar value) {
            this.effectivedate = value;
        }

        /**
         * Gets the value of the limitamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITAMOUNT() {
            return limitamount;
        }

        /**
         * Sets the value of the limitamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITAMOUNT(BigDecimal value) {
            this.limitamount = value;
        }

        /**
         * Gets the value of the earmarkedamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEARMARKEDAMT() {
            return earmarkedamt;
        }

        /**
         * Sets the value of the earmarkedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEARMARKEDAMT(BigDecimal value) {
            this.earmarkedamt = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PRVSTATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRVPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DISCPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prvstatus",
        "prvpc",
        "discpc"
    })
    public static class Provdetails {

        @XmlElement(name = "PRVSTATUS", required = true)
        protected String prvstatus;
        @XmlElement(name = "PRVPC")
        protected BigDecimal prvpc;
        @XmlElement(name = "DISCPC")
        protected BigDecimal discpc;

        /**
         * Gets the value of the prvstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRVSTATUS() {
            return prvstatus;
        }

        /**
         * Sets the value of the prvstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRVSTATUS(String value) {
            this.prvstatus = value;
        }

        /**
         * Gets the value of the prvpc property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRVPC() {
            return prvpc;
        }

        /**
         * Sets the value of the prvpc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRVPC(BigDecimal value) {
            this.prvpc = value;
        }

        /**
         * Gets the value of the discpc property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDISCPC() {
            return discpc;
        }

        /**
         * Sets the value of the discpc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDISCPC(BigDecimal value) {
            this.discpc = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="GENTIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gentime"
    })
    public static class ReportGentime1 {

        @XmlElement(name = "GENTIME")
        protected BigDecimal gentime;

        /**
         * Gets the value of the gentime property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGENTIME() {
            return gentime;
        }

        /**
         * Sets the value of the gentime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGENTIME(BigDecimal value) {
            this.gentime = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="GENTIME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gentime"
    })
    public static class ReportGentime2 {

        @XmlElement(name = "GENTIME")
        protected BigDecimal gentime;

        /**
         * Gets the value of the gentime property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGENTIME() {
            return gentime;
        }

        /**
         * Sets the value of the gentime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGENTIME(BigDecimal value) {
            this.gentime = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LIMIT_COLLATERAL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_COLLATERAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_LINKED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_INTEREST_SPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_COLLATERAL_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIMIT_HAIRCUT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "limitcollateraltype",
        "limitcollateral",
        "limitlinkedamount",
        "limitinterestspread",
        "limitcollateralcategory",
        "limithaircut"
    })
    public static class SttmsOdCollLinkages {

        @XmlElement(name = "LIMIT_COLLATERAL_TYPE")
        protected String limitcollateraltype;
        @XmlElement(name = "LIMIT_COLLATERAL")
        protected String limitcollateral;
        @XmlElement(name = "LIMIT_LINKED_AMOUNT")
        protected BigDecimal limitlinkedamount;
        @XmlElement(name = "LIMIT_INTEREST_SPREAD")
        protected BigDecimal limitinterestspread;
        @XmlElement(name = "LIMIT_COLLATERAL_CATEGORY")
        protected String limitcollateralcategory;
        @XmlElement(name = "LIMIT_HAIRCUT")
        protected BigDecimal limithaircut;

        /**
         * Gets the value of the limitcollateraltype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIMITCOLLATERALTYPE() {
            return limitcollateraltype;
        }

        /**
         * Sets the value of the limitcollateraltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIMITCOLLATERALTYPE(String value) {
            this.limitcollateraltype = value;
        }

        /**
         * Gets the value of the limitcollateral property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIMITCOLLATERAL() {
            return limitcollateral;
        }

        /**
         * Sets the value of the limitcollateral property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIMITCOLLATERAL(String value) {
            this.limitcollateral = value;
        }

        /**
         * Gets the value of the limitlinkedamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITLINKEDAMOUNT() {
            return limitlinkedamount;
        }

        /**
         * Sets the value of the limitlinkedamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITLINKEDAMOUNT(BigDecimal value) {
            this.limitlinkedamount = value;
        }

        /**
         * Gets the value of the limitinterestspread property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITINTERESTSPREAD() {
            return limitinterestspread;
        }

        /**
         * Sets the value of the limitinterestspread property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITINTERESTSPREAD(BigDecimal value) {
            this.limitinterestspread = value;
        }

        /**
         * Gets the value of the limitcollateralcategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIMITCOLLATERALCATEGORY() {
            return limitcollateralcategory;
        }

        /**
         * Sets the value of the limitcollateralcategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIMITCOLLATERALCATEGORY(String value) {
            this.limitcollateralcategory = value;
        }

        /**
         * Gets the value of the limithaircut property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLIMITHAIRCUT() {
            return limithaircut;
        }

        /**
         * Sets the value of the limithaircut property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLIMITHAIRCUT(BigDecimal value) {
            this.limithaircut = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PASSBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHQBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ATM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACSTATNODR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ATMACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACSTATNOCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCLSTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PROJECTACCNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MT110RECONREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IBANACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FROZEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ALTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCOPENDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ACSTATSTPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MULTI_CCY_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passbook",
        "chqbook",
        "accls",
        "atm",
        "acstatnodr",
        "acc",
        "atmacc",
        "acstatnocr",
        "acclstyp",
        "projectaccnt",
        "dorm",
        "mt110RECONREQD",
        "ibanacno",
        "frozen",
        "altacc",
        "accopendt",
        "acstatstpay",
        "ccy",
        "custno",
        "adesc",
        "brn",
        "multiccyacno"
    })
    public static class Summary {

        @XmlElement(name = "PASSBOOK")
        protected String passbook;
        @XmlElement(name = "CHQBOOK")
        protected String chqbook;
        @XmlElement(name = "ACCLS")
        protected String accls;
        @XmlElement(name = "ATM")
        protected String atm;
        @XmlElement(name = "ACSTATNODR")
        protected String acstatnodr;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "ATMACC")
        protected String atmacc;
        @XmlElement(name = "ACSTATNOCR")
        protected String acstatnocr;
        @XmlElement(name = "ACCLSTYP")
        protected String acclstyp;
        @XmlElement(name = "PROJECTACCNT")
        protected String projectaccnt;
        @XmlElement(name = "DORM")
        protected String dorm;
        @XmlElement(name = "MT110RECONREQD")
        protected String mt110RECONREQD;
        @XmlElement(name = "IBANACNO")
        protected String ibanacno;
        @XmlElement(name = "FROZEN")
        protected String frozen;
        @XmlElement(name = "ALTACC")
        protected String altacc;
        @XmlElement(name = "ACCOPENDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar accopendt;
        @XmlElement(name = "ACSTATSTPAY")
        protected String acstatstpay;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "CUSTNO")
        protected String custno;
        @XmlElement(name = "ADESC")
        protected String adesc;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "MULTI_CCY_AC_NO")
        protected String multiccyacno;

        /**
         * Gets the value of the passbook property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPASSBOOK() {
            return passbook;
        }

        /**
         * Sets the value of the passbook property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPASSBOOK(String value) {
            this.passbook = value;
        }

        /**
         * Gets the value of the chqbook property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQBOOK() {
            return chqbook;
        }

        /**
         * Sets the value of the chqbook property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQBOOK(String value) {
            this.chqbook = value;
        }

        /**
         * Gets the value of the accls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLS() {
            return accls;
        }

        /**
         * Sets the value of the accls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLS(String value) {
            this.accls = value;
        }

        /**
         * Gets the value of the atm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getATM() {
            return atm;
        }

        /**
         * Sets the value of the atm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setATM(String value) {
            this.atm = value;
        }

        /**
         * Gets the value of the acstatnodr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATNODR() {
            return acstatnodr;
        }

        /**
         * Sets the value of the acstatnodr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATNODR(String value) {
            this.acstatnodr = value;
        }

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
        }

        /**
         * Gets the value of the atmacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getATMACC() {
            return atmacc;
        }

        /**
         * Sets the value of the atmacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setATMACC(String value) {
            this.atmacc = value;
        }

        /**
         * Gets the value of the acstatnocr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATNOCR() {
            return acstatnocr;
        }

        /**
         * Sets the value of the acstatnocr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATNOCR(String value) {
            this.acstatnocr = value;
        }

        /**
         * Gets the value of the acclstyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCLSTYP() {
            return acclstyp;
        }

        /**
         * Sets the value of the acclstyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCLSTYP(String value) {
            this.acclstyp = value;
        }

        /**
         * Gets the value of the projectaccnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPROJECTACCNT() {
            return projectaccnt;
        }

        /**
         * Sets the value of the projectaccnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPROJECTACCNT(String value) {
            this.projectaccnt = value;
        }

        /**
         * Gets the value of the dorm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDORM() {
            return dorm;
        }

        /**
         * Sets the value of the dorm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDORM(String value) {
            this.dorm = value;
        }

        /**
         * Gets the value of the mt110RECONREQD property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMT110RECONREQD() {
            return mt110RECONREQD;
        }

        /**
         * Sets the value of the mt110RECONREQD property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMT110RECONREQD(String value) {
            this.mt110RECONREQD = value;
        }

        /**
         * Gets the value of the ibanacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIBANACNO() {
            return ibanacno;
        }

        /**
         * Sets the value of the ibanacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIBANACNO(String value) {
            this.ibanacno = value;
        }

        /**
         * Gets the value of the frozen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFROZEN() {
            return frozen;
        }

        /**
         * Sets the value of the frozen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFROZEN(String value) {
            this.frozen = value;
        }

        /**
         * Gets the value of the altacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALTACC() {
            return altacc;
        }

        /**
         * Sets the value of the altacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALTACC(String value) {
            this.altacc = value;
        }

        /**
         * Gets the value of the accopendt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getACCOPENDT() {
            return accopendt;
        }

        /**
         * Sets the value of the accopendt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setACCOPENDT(XMLGregorianCalendar value) {
            this.accopendt = value;
        }

        /**
         * Gets the value of the acstatstpay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATSTPAY() {
            return acstatstpay;
        }

        /**
         * Sets the value of the acstatstpay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATSTPAY(String value) {
            this.acstatstpay = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the custno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNO() {
            return custno;
        }

        /**
         * Sets the value of the custno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNO(String value) {
            this.custno = value;
        }

        /**
         * Gets the value of the adesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADESC() {
            return adesc;
        }

        /**
         * Sets the value of the adesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADESC(String value) {
            this.adesc = value;
        }

        /**
         * Gets the value of the brn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRN() {
            return brn;
        }

        /**
         * Sets the value of the brn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRN(String value) {
            this.brn = value;
        }

        /**
         * Gets the value of the multiccyacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMULTICCYACNO() {
            return multiccyacno;
        }

        /**
         * Sets the value of the multiccyacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMULTICCYACNO(String value) {
            this.multiccyacno = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="INITIAL_TDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="AUTOROLL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CLONMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MOVINTUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ROLLTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ROLLAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RDFREDAY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RDFREMTH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RDFREYEAR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PAYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RDAMT_N" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTOPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FUNDONOVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MOVPRIUNCLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DEPTENOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DEPTENYEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DEPTENORMON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DEPTENORDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ROLLTENORPREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTRATE_CUMAMT_ROLL_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INT_EARNINGS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TAX_COLLCTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CASCADE_MONTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDFNDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADD_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="BRNCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Dcdmaster" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="LINKCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CCY_OPTION_PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="LINKED_CCY_SETT_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LINKED_CCY_GL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FIX_DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="YLD_ENHC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="INCEPTION_FAIR_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initialtdamt",
        "autoroll",
        "clonmat",
        "movintunclm",
        "matdt",
        "rolltype",
        "rollamt",
        "rdfreday",
        "rdfremth",
        "rdfreyear",
        "payacc",
        "paybrn",
        "rdamtn",
        "rdacc",
        "autopay",
        "fundonovd",
        "movpriunclm",
        "deptenor",
        "deptenyear",
        "deptenormon",
        "deptenorday",
        "rolltenorpref",
        "intratecumamtrollreqd",
        "intearnings",
        "taxcollcted",
        "apy",
        "cascademonth",
        "addfnds",
        "addamt",
        "brnch",
        "dcdmaster"
    })
    public static class Tddetails {

        @XmlElement(name = "INITIAL_TDAMT")
        protected BigDecimal initialtdamt;
        @XmlElement(name = "AUTOROLL")
        protected String autoroll;
        @XmlElement(name = "CLONMAT")
        protected String clonmat;
        @XmlElement(name = "MOVINTUNCLM")
        protected String movintunclm;
        @XmlElement(name = "MATDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar matdt;
        @XmlElement(name = "ROLLTYPE")
        protected String rolltype;
        @XmlElement(name = "ROLLAMT")
        protected BigDecimal rollamt;
        @XmlElement(name = "RDFREDAY")
        protected BigDecimal rdfreday;
        @XmlElement(name = "RDFREMTH")
        protected BigDecimal rdfremth;
        @XmlElement(name = "RDFREYEAR")
        protected BigDecimal rdfreyear;
        @XmlElement(name = "PAYACC")
        protected String payacc;
        @XmlElement(name = "PAYBRN")
        protected String paybrn;
        @XmlElement(name = "RDAMT_N")
        protected BigDecimal rdamtn;
        @XmlElement(name = "RDACC")
        protected String rdacc;
        @XmlElement(name = "AUTOPAY")
        protected String autopay;
        @XmlElement(name = "FUNDONOVD")
        protected String fundonovd;
        @XmlElement(name = "MOVPRIUNCLM")
        protected String movpriunclm;
        @XmlElement(name = "DEPTENOR")
        protected String deptenor;
        @XmlElement(name = "DEPTENYEAR")
        protected String deptenyear;
        @XmlElement(name = "DEPTENORMON")
        protected String deptenormon;
        @XmlElement(name = "DEPTENORDAY")
        protected String deptenorday;
        @XmlElement(name = "ROLLTENORPREF")
        protected String rolltenorpref;
        @XmlElement(name = "INTRATE_CUMAMT_ROLL_REQD")
        protected String intratecumamtrollreqd;
        @XmlElement(name = "INT_EARNINGS")
        protected String intearnings;
        @XmlElement(name = "TAX_COLLCTED")
        protected String taxcollcted;
        @XmlElement(name = "APY")
        protected String apy;
        @XmlElement(name = "CASCADE_MONTH")
        protected String cascademonth;
        @XmlElement(name = "ADDFNDS")
        protected String addfnds;
        @XmlElement(name = "ADD_AMT")
        protected BigDecimal addamt;
        @XmlElement(name = "BRNCH")
        protected String brnch;
        @XmlElement(name = "Dcdmaster")
        protected Dcdmaster dcdmaster;

        /**
         * Gets the value of the initialtdamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getINITIALTDAMT() {
            return initialtdamt;
        }

        /**
         * Sets the value of the initialtdamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setINITIALTDAMT(BigDecimal value) {
            this.initialtdamt = value;
        }

        /**
         * Gets the value of the autoroll property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTOROLL() {
            return autoroll;
        }

        /**
         * Sets the value of the autoroll property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTOROLL(String value) {
            this.autoroll = value;
        }

        /**
         * Gets the value of the clonmat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLONMAT() {
            return clonmat;
        }

        /**
         * Sets the value of the clonmat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLONMAT(String value) {
            this.clonmat = value;
        }

        /**
         * Gets the value of the movintunclm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOVINTUNCLM() {
            return movintunclm;
        }

        /**
         * Sets the value of the movintunclm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOVINTUNCLM(String value) {
            this.movintunclm = value;
        }

        /**
         * Gets the value of the matdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMATDT() {
            return matdt;
        }

        /**
         * Sets the value of the matdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMATDT(XMLGregorianCalendar value) {
            this.matdt = value;
        }

        /**
         * Gets the value of the rolltype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROLLTYPE() {
            return rolltype;
        }

        /**
         * Sets the value of the rolltype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROLLTYPE(String value) {
            this.rolltype = value;
        }

        /**
         * Gets the value of the rollamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getROLLAMT() {
            return rollamt;
        }

        /**
         * Sets the value of the rollamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setROLLAMT(BigDecimal value) {
            this.rollamt = value;
        }

        /**
         * Gets the value of the rdfreday property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRDFREDAY() {
            return rdfreday;
        }

        /**
         * Sets the value of the rdfreday property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRDFREDAY(BigDecimal value) {
            this.rdfreday = value;
        }

        /**
         * Gets the value of the rdfremth property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRDFREMTH() {
            return rdfremth;
        }

        /**
         * Sets the value of the rdfremth property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRDFREMTH(BigDecimal value) {
            this.rdfremth = value;
        }

        /**
         * Gets the value of the rdfreyear property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRDFREYEAR() {
            return rdfreyear;
        }

        /**
         * Sets the value of the rdfreyear property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRDFREYEAR(BigDecimal value) {
            this.rdfreyear = value;
        }

        /**
         * Gets the value of the payacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYACC() {
            return payacc;
        }

        /**
         * Sets the value of the payacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYACC(String value) {
            this.payacc = value;
        }

        /**
         * Gets the value of the paybrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYBRN() {
            return paybrn;
        }

        /**
         * Sets the value of the paybrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYBRN(String value) {
            this.paybrn = value;
        }

        /**
         * Gets the value of the rdamtn property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRDAMTN() {
            return rdamtn;
        }

        /**
         * Sets the value of the rdamtn property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRDAMTN(BigDecimal value) {
            this.rdamtn = value;
        }

        /**
         * Gets the value of the rdacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRDACC() {
            return rdacc;
        }

        /**
         * Sets the value of the rdacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRDACC(String value) {
            this.rdacc = value;
        }

        /**
         * Gets the value of the autopay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTOPAY() {
            return autopay;
        }

        /**
         * Sets the value of the autopay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTOPAY(String value) {
            this.autopay = value;
        }

        /**
         * Gets the value of the fundonovd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFUNDONOVD() {
            return fundonovd;
        }

        /**
         * Sets the value of the fundonovd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFUNDONOVD(String value) {
            this.fundonovd = value;
        }

        /**
         * Gets the value of the movpriunclm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOVPRIUNCLM() {
            return movpriunclm;
        }

        /**
         * Sets the value of the movpriunclm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOVPRIUNCLM(String value) {
            this.movpriunclm = value;
        }

        /**
         * Gets the value of the deptenor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPTENOR() {
            return deptenor;
        }

        /**
         * Sets the value of the deptenor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPTENOR(String value) {
            this.deptenor = value;
        }

        /**
         * Gets the value of the deptenyear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPTENYEAR() {
            return deptenyear;
        }

        /**
         * Sets the value of the deptenyear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPTENYEAR(String value) {
            this.deptenyear = value;
        }

        /**
         * Gets the value of the deptenormon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPTENORMON() {
            return deptenormon;
        }

        /**
         * Sets the value of the deptenormon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPTENORMON(String value) {
            this.deptenormon = value;
        }

        /**
         * Gets the value of the deptenorday property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPTENORDAY() {
            return deptenorday;
        }

        /**
         * Sets the value of the deptenorday property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPTENORDAY(String value) {
            this.deptenorday = value;
        }

        /**
         * Gets the value of the rolltenorpref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROLLTENORPREF() {
            return rolltenorpref;
        }

        /**
         * Sets the value of the rolltenorpref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROLLTENORPREF(String value) {
            this.rolltenorpref = value;
        }

        /**
         * Gets the value of the intratecumamtrollreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTRATECUMAMTROLLREQD() {
            return intratecumamtrollreqd;
        }

        /**
         * Sets the value of the intratecumamtrollreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTRATECUMAMTROLLREQD(String value) {
            this.intratecumamtrollreqd = value;
        }

        /**
         * Gets the value of the intearnings property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTEARNINGS() {
            return intearnings;
        }

        /**
         * Sets the value of the intearnings property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTEARNINGS(String value) {
            this.intearnings = value;
        }

        /**
         * Gets the value of the taxcollcted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTAXCOLLCTED() {
            return taxcollcted;
        }

        /**
         * Sets the value of the taxcollcted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTAXCOLLCTED(String value) {
            this.taxcollcted = value;
        }

        /**
         * Gets the value of the apy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPY() {
            return apy;
        }

        /**
         * Sets the value of the apy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPY(String value) {
            this.apy = value;
        }

        /**
         * Gets the value of the cascademonth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCASCADEMONTH() {
            return cascademonth;
        }

        /**
         * Sets the value of the cascademonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCASCADEMONTH(String value) {
            this.cascademonth = value;
        }

        /**
         * Gets the value of the addfnds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDFNDS() {
            return addfnds;
        }

        /**
         * Sets the value of the addfnds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDFNDS(String value) {
            this.addfnds = value;
        }

        /**
         * Gets the value of the addamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getADDAMT() {
            return addamt;
        }

        /**
         * Sets the value of the addamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setADDAMT(BigDecimal value) {
            this.addamt = value;
        }

        /**
         * Gets the value of the brnch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNCH() {
            return brnch;
        }

        /**
         * Sets the value of the brnch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNCH(String value) {
            this.brnch = value;
        }

        /**
         * Gets the value of the dcdmaster property.
         * 
         * @return
         *     possible object is
         *     {@link Dcdmaster }
         *     
         */
        public Dcdmaster getDcdmaster() {
            return dcdmaster;
        }

        /**
         * Sets the value of the dcdmaster property.
         * 
         * @param value
         *     allowed object is
         *     {@link Dcdmaster }
         *     
         */
        public void setDcdmaster(Dcdmaster value) {
            this.dcdmaster = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="LINKCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CCY_OPTION_PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EXCH_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="LINKED_CCY_SETT_ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LINKED_CCY_GL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FIX_DAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="YLD_ENHC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="INCEPTION_FAIR_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "linkccy",
            "ccyoptionprod",
            "exchrate",
            "linkedccysettacc",
            "linkedccygl",
            "fixdays",
            "yldenhc",
            "inceptionfairvalue"
        })
        public static class Dcdmaster {

            @XmlElement(name = "LINKCCY")
            protected String linkccy;
            @XmlElement(name = "CCY_OPTION_PROD")
            protected String ccyoptionprod;
            @XmlElement(name = "EXCH_RATE")
            protected BigDecimal exchrate;
            @XmlElement(name = "LINKED_CCY_SETT_ACC")
            protected String linkedccysettacc;
            @XmlElement(name = "LINKED_CCY_GL")
            protected String linkedccygl;
            @XmlElement(name = "FIX_DAYS")
            protected BigDecimal fixdays;
            @XmlElement(name = "YLD_ENHC")
            protected BigDecimal yldenhc;
            @XmlElement(name = "INCEPTION_FAIR_VALUE")
            protected BigDecimal inceptionfairvalue;

            /**
             * Gets the value of the linkccy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLINKCCY() {
                return linkccy;
            }

            /**
             * Sets the value of the linkccy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLINKCCY(String value) {
                this.linkccy = value;
            }

            /**
             * Gets the value of the ccyoptionprod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCYOPTIONPROD() {
                return ccyoptionprod;
            }

            /**
             * Sets the value of the ccyoptionprod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCYOPTIONPROD(String value) {
                this.ccyoptionprod = value;
            }

            /**
             * Gets the value of the exchrate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEXCHRATE() {
                return exchrate;
            }

            /**
             * Sets the value of the exchrate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEXCHRATE(BigDecimal value) {
                this.exchrate = value;
            }

            /**
             * Gets the value of the linkedccysettacc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLINKEDCCYSETTACC() {
                return linkedccysettacc;
            }

            /**
             * Sets the value of the linkedccysettacc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLINKEDCCYSETTACC(String value) {
                this.linkedccysettacc = value;
            }

            /**
             * Gets the value of the linkedccygl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLINKEDCCYGL() {
                return linkedccygl;
            }

            /**
             * Sets the value of the linkedccygl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLINKEDCCYGL(String value) {
                this.linkedccygl = value;
            }

            /**
             * Gets the value of the fixdays property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFIXDAYS() {
                return fixdays;
            }

            /**
             * Sets the value of the fixdays property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFIXDAYS(BigDecimal value) {
                this.fixdays = value;
            }

            /**
             * Gets the value of the yldenhc property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getYLDENHC() {
                return yldenhc;
            }

            /**
             * Sets the value of the yldenhc property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setYLDENHC(BigDecimal value) {
                this.yldenhc = value;
            }

            /**
             * Gets the value of the inceptionfairvalue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getINCEPTIONFAIRVALUE() {
                return inceptionfairvalue;
            }

            /**
             * Sets the value of the inceptionfairvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setINCEPTIONFAIRVALUE(BigDecimal value) {
                this.inceptionfairvalue = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MMPAYOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="OFFSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="APPLIED_EXCHANGE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CHQINSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRODUCT_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHQ_ADTE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DRAWEE_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ROUTING_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mmpayopt",
        "amt",
        "offsacc",
        "percentage",
        "appliedexchangerate",
        "chqinstno",
        "productf",
        "chqadte",
        "draweeaccount",
        "routingno"
    })
    public static class Tdpayindetails {

        @XmlElement(name = "MMPAYOPT")
        protected String mmpayopt;
        @XmlElement(name = "AMT")
        protected BigDecimal amt;
        @XmlElement(name = "OFFSACC")
        protected String offsacc;
        @XmlElement(name = "PERCENTAGE")
        protected BigDecimal percentage;
        @XmlElement(name = "APPLIED_EXCHANGE_RATE")
        protected BigDecimal appliedexchangerate;
        @XmlElement(name = "CHQINSTNO")
        protected String chqinstno;
        @XmlElement(name = "PRODUCT_F")
        protected String productf;
        @XmlElement(name = "CHQ_ADTE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar chqadte;
        @XmlElement(name = "DRAWEE_ACCOUNT")
        protected String draweeaccount;
        @XmlElement(name = "ROUTING_NO")
        protected String routingno;

        /**
         * Gets the value of the mmpayopt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMMPAYOPT() {
            return mmpayopt;
        }

        /**
         * Sets the value of the mmpayopt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMMPAYOPT(String value) {
            this.mmpayopt = value;
        }

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMT() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMT(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the offsacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFSACC() {
            return offsacc;
        }

        /**
         * Sets the value of the offsacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFSACC(String value) {
            this.offsacc = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPERCENTAGE() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPERCENTAGE(BigDecimal value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the appliedexchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAPPLIEDEXCHANGERATE() {
            return appliedexchangerate;
        }

        /**
         * Sets the value of the appliedexchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAPPLIEDEXCHANGERATE(BigDecimal value) {
            this.appliedexchangerate = value;
        }

        /**
         * Gets the value of the chqinstno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHQINSTNO() {
            return chqinstno;
        }

        /**
         * Sets the value of the chqinstno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHQINSTNO(String value) {
            this.chqinstno = value;
        }

        /**
         * Gets the value of the productf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTF() {
            return productf;
        }

        /**
         * Sets the value of the productf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTF(String value) {
            this.productf = value;
        }

        /**
         * Gets the value of the chqadte property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCHQADTE() {
            return chqadte;
        }

        /**
         * Sets the value of the chqadte property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCHQADTE(XMLGregorianCalendar value) {
            this.chqadte = value;
        }

        /**
         * Gets the value of the draweeaccount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRAWEEACCOUNT() {
            return draweeaccount;
        }

        /**
         * Sets the value of the draweeaccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRAWEEACCOUNT(String value) {
            this.draweeaccount = value;
        }

        /**
         * Gets the value of the routingno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTINGNO() {
            return routingno;
        }

        /**
         * Sets the value of the routingno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTINGNO(String value) {
            this.routingno = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PAYOUTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OFFSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PERCENTAGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYOUTCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payouttype",
        "offsacc",
        "percentage",
        "narrative",
        "payoutcomp"
    })
    public static class Tdpayoutdetails {

        @XmlElement(name = "PAYOUTTYPE")
        protected String payouttype;
        @XmlElement(name = "OFFSACC")
        protected String offsacc;
        @XmlElement(name = "PERCENTAGE")
        protected BigDecimal percentage;
        @XmlElement(name = "NARRATIVE")
        protected String narrative;
        @XmlElement(name = "PAYOUTCOMP")
        protected String payoutcomp;

        /**
         * Gets the value of the payouttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYOUTTYPE() {
            return payouttype;
        }

        /**
         * Sets the value of the payouttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYOUTTYPE(String value) {
            this.payouttype = value;
        }

        /**
         * Gets the value of the offsacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFSACC() {
            return offsacc;
        }

        /**
         * Sets the value of the offsacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFSACC(String value) {
            this.offsacc = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPERCENTAGE() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPERCENTAGE(BigDecimal value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the narrative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE() {
            return narrative;
        }

        /**
         * Sets the value of the narrative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE(String value) {
            this.narrative = value;
        }

        /**
         * Gets the value of the payoutcomp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYOUTCOMP() {
            return payoutcomp;
        }

        /**
         * Sets the value of the payoutcomp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYOUTCOMP(String value) {
            this.payoutcomp = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NXT_RENEW_LMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RNW_UNIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RNW_FLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RNW_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nxtrenewlmt",
        "rnwunit",
        "rnwflg",
        "rnwfreq"
    })
    public static class TodRenew {

        @XmlElement(name = "NXT_RENEW_LMT")
        protected BigDecimal nxtrenewlmt;
        @XmlElement(name = "RNW_UNIT")
        protected BigDecimal rnwunit;
        @XmlElement(name = "RNW_FLG")
        protected String rnwflg;
        @XmlElement(name = "RNW_FREQ")
        protected String rnwfreq;

        /**
         * Gets the value of the nxtrenewlmt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNXTRENEWLMT() {
            return nxtrenewlmt;
        }

        /**
         * Sets the value of the nxtrenewlmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNXTRENEWLMT(BigDecimal value) {
            this.nxtrenewlmt = value;
        }

        /**
         * Gets the value of the rnwunit property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRNWUNIT() {
            return rnwunit;
        }

        /**
         * Sets the value of the rnwunit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRNWUNIT(BigDecimal value) {
            this.rnwunit = value;
        }

        /**
         * Gets the value of the rnwflg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNWFLG() {
            return rnwflg;
        }

        /**
         * Sets the value of the rnwflg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNWFLG(String value) {
            this.rnwflg = value;
        }

        /**
         * Gets the value of the rnwfreq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNWFREQ() {
            return rnwfreq;
        }

        /**
         * Sets the value of the rnwfreq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNWFREQ(String value) {
            this.rnwfreq = value;
        }

    }

}
