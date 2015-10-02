/**
 * TRANSACTIONRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class TRANSACTIONRESPONSE  extends com.securenet.gateway.API.Contracts.RESPONSE  implements java.io.Serializable {
    private java.math.BigDecimal ADDITIONALAMOUNT;

    private java.lang.String ADDITIONALDATA1;

    private java.lang.String ADDITIONALDATA2;

    private java.lang.String ADDITIONALDATA3;

    private java.lang.String ADDITIONALDATA4;

    private java.lang.String ADDITIONALDATA5;

    private java.lang.String AUTHCODE;

    private java.math.BigDecimal AUTHORIZEDAMOUNT;

    private java.lang.String AVS_RESULT_CODE;

    private java.lang.String BANK_ACCOUNTNAME;

    private java.lang.String BANK_ACCOUNTTYPE;

    private java.lang.String BATCHID;

    private java.lang.String CARDHOLDER_FIRSTNAME;

    private java.lang.String CARDHOLDER_LASTNAME;

    private java.lang.String CARDLEVEL_RESULTS;

    private java.lang.String CARDTYPE;

    private java.lang.String CARD_CODE_RESPONSE_CODE;

    private java.math.BigDecimal CASHBACK_AMOUNT;

    private java.lang.String CAVV_RESPONSE_CODE;

    private java.lang.String CHECKNUM;

    private java.lang.String CODE;

    private java.lang.String CUSTOMERID;

    private com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL;

    private java.lang.String EXPIRYDATE;

    private java.math.BigDecimal GRATUITY;

    private java.lang.String INDUSTRYSPECIFICDATA;

    private java.lang.String LAST4DIGITS;

    private java.lang.String LEVEL2_VALID;

    private java.lang.String LEVEL3_VALID;

    private java.lang.String MARKETSPECIFICDATA;

    private java.lang.String METHOD;

    private java.lang.String NETWORKCODE;

    private java.lang.String NETWORKID;

    private java.lang.String ORDERID;

    private java.lang.String PAYMENTID;

    private java.lang.String RETREFERENCENUM;

    private java.lang.String RISK_CATEGORY;

    private java.lang.String RISK_REASON1;

    private java.lang.String RISK_REASON2;

    private java.lang.String RISK_REASON3;

    private java.lang.String RISK_REASON4;

    private java.lang.String RISK_REASON5;

    private java.lang.Integer SECURENETID;

    private java.math.BigDecimal SETTLEMENTAMOUNT;

    private java.lang.String SETTLEMENTDATETIME;

    private java.lang.String SYSTEM_TRACENUM;

    private java.lang.String TRACKTYPE;

    private java.math.BigDecimal TRANSACTIONAMOUNT;

    private java.lang.String TRANSACTIONDATETIME;

    private java.lang.Integer TRANSACTIONID;

    public TRANSACTIONRESPONSE() {
    }

    public TRANSACTIONRESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE,
           java.math.BigDecimal ADDITIONALAMOUNT,
           java.lang.String ADDITIONALDATA1,
           java.lang.String ADDITIONALDATA2,
           java.lang.String ADDITIONALDATA3,
           java.lang.String ADDITIONALDATA4,
           java.lang.String ADDITIONALDATA5,
           java.lang.String AUTHCODE,
           java.math.BigDecimal AUTHORIZEDAMOUNT,
           java.lang.String AVS_RESULT_CODE,
           java.lang.String BANK_ACCOUNTNAME,
           java.lang.String BANK_ACCOUNTTYPE,
           java.lang.String BATCHID,
           java.lang.String CARDHOLDER_FIRSTNAME,
           java.lang.String CARDHOLDER_LASTNAME,
           java.lang.String CARDLEVEL_RESULTS,
           java.lang.String CARDTYPE,
           java.lang.String CARD_CODE_RESPONSE_CODE,
           java.math.BigDecimal CASHBACK_AMOUNT,
           java.lang.String CAVV_RESPONSE_CODE,
           java.lang.String CHECKNUM,
           java.lang.String CODE,
           java.lang.String CUSTOMERID,
           com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL,
           java.lang.String EXPIRYDATE,
           java.math.BigDecimal GRATUITY,
           java.lang.String INDUSTRYSPECIFICDATA,
           java.lang.String LAST4DIGITS,
           java.lang.String LEVEL2_VALID,
           java.lang.String LEVEL3_VALID,
           java.lang.String MARKETSPECIFICDATA,
           java.lang.String METHOD,
           java.lang.String NETWORKCODE,
           java.lang.String NETWORKID,
           java.lang.String ORDERID,
           java.lang.String PAYMENTID,
           java.lang.String RETREFERENCENUM,
           java.lang.String RISK_CATEGORY,
           java.lang.String RISK_REASON1,
           java.lang.String RISK_REASON2,
           java.lang.String RISK_REASON3,
           java.lang.String RISK_REASON4,
           java.lang.String RISK_REASON5,
           java.lang.Integer SECURENETID,
           java.math.BigDecimal SETTLEMENTAMOUNT,
           java.lang.String SETTLEMENTDATETIME,
           java.lang.String SYSTEM_TRACENUM,
           java.lang.String TRACKTYPE,
           java.math.BigDecimal TRANSACTIONAMOUNT,
           java.lang.String TRANSACTIONDATETIME,
           java.lang.Integer TRANSACTIONID) {
        super(
            RESPONSE_CODE,
            RESPONSE_REASON_CODE,
            RESPONSE_REASON_TEXT,
            RESPONSE_SUBCODE);
        this.ADDITIONALAMOUNT = ADDITIONALAMOUNT;
        this.ADDITIONALDATA1 = ADDITIONALDATA1;
        this.ADDITIONALDATA2 = ADDITIONALDATA2;
        this.ADDITIONALDATA3 = ADDITIONALDATA3;
        this.ADDITIONALDATA4 = ADDITIONALDATA4;
        this.ADDITIONALDATA5 = ADDITIONALDATA5;
        this.AUTHCODE = AUTHCODE;
        this.AUTHORIZEDAMOUNT = AUTHORIZEDAMOUNT;
        this.AVS_RESULT_CODE = AVS_RESULT_CODE;
        this.BANK_ACCOUNTNAME = BANK_ACCOUNTNAME;
        this.BANK_ACCOUNTTYPE = BANK_ACCOUNTTYPE;
        this.BATCHID = BATCHID;
        this.CARDHOLDER_FIRSTNAME = CARDHOLDER_FIRSTNAME;
        this.CARDHOLDER_LASTNAME = CARDHOLDER_LASTNAME;
        this.CARDLEVEL_RESULTS = CARDLEVEL_RESULTS;
        this.CARDTYPE = CARDTYPE;
        this.CARD_CODE_RESPONSE_CODE = CARD_CODE_RESPONSE_CODE;
        this.CASHBACK_AMOUNT = CASHBACK_AMOUNT;
        this.CAVV_RESPONSE_CODE = CAVV_RESPONSE_CODE;
        this.CHECKNUM = CHECKNUM;
        this.CODE = CODE;
        this.CUSTOMERID = CUSTOMERID;
        this.CUSTOMER_BILL = CUSTOMER_BILL;
        this.EXPIRYDATE = EXPIRYDATE;
        this.GRATUITY = GRATUITY;
        this.INDUSTRYSPECIFICDATA = INDUSTRYSPECIFICDATA;
        this.LAST4DIGITS = LAST4DIGITS;
        this.LEVEL2_VALID = LEVEL2_VALID;
        this.LEVEL3_VALID = LEVEL3_VALID;
        this.MARKETSPECIFICDATA = MARKETSPECIFICDATA;
        this.METHOD = METHOD;
        this.NETWORKCODE = NETWORKCODE;
        this.NETWORKID = NETWORKID;
        this.ORDERID = ORDERID;
        this.PAYMENTID = PAYMENTID;
        this.RETREFERENCENUM = RETREFERENCENUM;
        this.RISK_CATEGORY = RISK_CATEGORY;
        this.RISK_REASON1 = RISK_REASON1;
        this.RISK_REASON2 = RISK_REASON2;
        this.RISK_REASON3 = RISK_REASON3;
        this.RISK_REASON4 = RISK_REASON4;
        this.RISK_REASON5 = RISK_REASON5;
        this.SECURENETID = SECURENETID;
        this.SETTLEMENTAMOUNT = SETTLEMENTAMOUNT;
        this.SETTLEMENTDATETIME = SETTLEMENTDATETIME;
        this.SYSTEM_TRACENUM = SYSTEM_TRACENUM;
        this.TRACKTYPE = TRACKTYPE;
        this.TRANSACTIONAMOUNT = TRANSACTIONAMOUNT;
        this.TRANSACTIONDATETIME = TRANSACTIONDATETIME;
        this.TRANSACTIONID = TRANSACTIONID;
    }


    /**
     * Gets the ADDITIONALAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @return ADDITIONALAMOUNT
     */
    public java.math.BigDecimal getADDITIONALAMOUNT() {
        return ADDITIONALAMOUNT;
    }


    /**
     * Sets the ADDITIONALAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @param ADDITIONALAMOUNT
     */
    public void setADDITIONALAMOUNT(java.math.BigDecimal ADDITIONALAMOUNT) {
        this.ADDITIONALAMOUNT = ADDITIONALAMOUNT;
    }


    /**
     * Gets the ADDITIONALDATA1 value for this TRANSACTIONRESPONSE.
     * 
     * @return ADDITIONALDATA1
     */
    public java.lang.String getADDITIONALDATA1() {
        return ADDITIONALDATA1;
    }


    /**
     * Sets the ADDITIONALDATA1 value for this TRANSACTIONRESPONSE.
     * 
     * @param ADDITIONALDATA1
     */
    public void setADDITIONALDATA1(java.lang.String ADDITIONALDATA1) {
        this.ADDITIONALDATA1 = ADDITIONALDATA1;
    }


    /**
     * Gets the ADDITIONALDATA2 value for this TRANSACTIONRESPONSE.
     * 
     * @return ADDITIONALDATA2
     */
    public java.lang.String getADDITIONALDATA2() {
        return ADDITIONALDATA2;
    }


    /**
     * Sets the ADDITIONALDATA2 value for this TRANSACTIONRESPONSE.
     * 
     * @param ADDITIONALDATA2
     */
    public void setADDITIONALDATA2(java.lang.String ADDITIONALDATA2) {
        this.ADDITIONALDATA2 = ADDITIONALDATA2;
    }


    /**
     * Gets the ADDITIONALDATA3 value for this TRANSACTIONRESPONSE.
     * 
     * @return ADDITIONALDATA3
     */
    public java.lang.String getADDITIONALDATA3() {
        return ADDITIONALDATA3;
    }


    /**
     * Sets the ADDITIONALDATA3 value for this TRANSACTIONRESPONSE.
     * 
     * @param ADDITIONALDATA3
     */
    public void setADDITIONALDATA3(java.lang.String ADDITIONALDATA3) {
        this.ADDITIONALDATA3 = ADDITIONALDATA3;
    }


    /**
     * Gets the ADDITIONALDATA4 value for this TRANSACTIONRESPONSE.
     * 
     * @return ADDITIONALDATA4
     */
    public java.lang.String getADDITIONALDATA4() {
        return ADDITIONALDATA4;
    }


    /**
     * Sets the ADDITIONALDATA4 value for this TRANSACTIONRESPONSE.
     * 
     * @param ADDITIONALDATA4
     */
    public void setADDITIONALDATA4(java.lang.String ADDITIONALDATA4) {
        this.ADDITIONALDATA4 = ADDITIONALDATA4;
    }


    /**
     * Gets the ADDITIONALDATA5 value for this TRANSACTIONRESPONSE.
     * 
     * @return ADDITIONALDATA5
     */
    public java.lang.String getADDITIONALDATA5() {
        return ADDITIONALDATA5;
    }


    /**
     * Sets the ADDITIONALDATA5 value for this TRANSACTIONRESPONSE.
     * 
     * @param ADDITIONALDATA5
     */
    public void setADDITIONALDATA5(java.lang.String ADDITIONALDATA5) {
        this.ADDITIONALDATA5 = ADDITIONALDATA5;
    }


    /**
     * Gets the AUTHCODE value for this TRANSACTIONRESPONSE.
     * 
     * @return AUTHCODE
     */
    public java.lang.String getAUTHCODE() {
        return AUTHCODE;
    }


    /**
     * Sets the AUTHCODE value for this TRANSACTIONRESPONSE.
     * 
     * @param AUTHCODE
     */
    public void setAUTHCODE(java.lang.String AUTHCODE) {
        this.AUTHCODE = AUTHCODE;
    }


    /**
     * Gets the AUTHORIZEDAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @return AUTHORIZEDAMOUNT
     */
    public java.math.BigDecimal getAUTHORIZEDAMOUNT() {
        return AUTHORIZEDAMOUNT;
    }


    /**
     * Sets the AUTHORIZEDAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @param AUTHORIZEDAMOUNT
     */
    public void setAUTHORIZEDAMOUNT(java.math.BigDecimal AUTHORIZEDAMOUNT) {
        this.AUTHORIZEDAMOUNT = AUTHORIZEDAMOUNT;
    }


    /**
     * Gets the AVS_RESULT_CODE value for this TRANSACTIONRESPONSE.
     * 
     * @return AVS_RESULT_CODE
     */
    public java.lang.String getAVS_RESULT_CODE() {
        return AVS_RESULT_CODE;
    }


    /**
     * Sets the AVS_RESULT_CODE value for this TRANSACTIONRESPONSE.
     * 
     * @param AVS_RESULT_CODE
     */
    public void setAVS_RESULT_CODE(java.lang.String AVS_RESULT_CODE) {
        this.AVS_RESULT_CODE = AVS_RESULT_CODE;
    }


    /**
     * Gets the BANK_ACCOUNTNAME value for this TRANSACTIONRESPONSE.
     * 
     * @return BANK_ACCOUNTNAME
     */
    public java.lang.String getBANK_ACCOUNTNAME() {
        return BANK_ACCOUNTNAME;
    }


    /**
     * Sets the BANK_ACCOUNTNAME value for this TRANSACTIONRESPONSE.
     * 
     * @param BANK_ACCOUNTNAME
     */
    public void setBANK_ACCOUNTNAME(java.lang.String BANK_ACCOUNTNAME) {
        this.BANK_ACCOUNTNAME = BANK_ACCOUNTNAME;
    }


    /**
     * Gets the BANK_ACCOUNTTYPE value for this TRANSACTIONRESPONSE.
     * 
     * @return BANK_ACCOUNTTYPE
     */
    public java.lang.String getBANK_ACCOUNTTYPE() {
        return BANK_ACCOUNTTYPE;
    }


    /**
     * Sets the BANK_ACCOUNTTYPE value for this TRANSACTIONRESPONSE.
     * 
     * @param BANK_ACCOUNTTYPE
     */
    public void setBANK_ACCOUNTTYPE(java.lang.String BANK_ACCOUNTTYPE) {
        this.BANK_ACCOUNTTYPE = BANK_ACCOUNTTYPE;
    }


    /**
     * Gets the BATCHID value for this TRANSACTIONRESPONSE.
     * 
     * @return BATCHID
     */
    public java.lang.String getBATCHID() {
        return BATCHID;
    }


    /**
     * Sets the BATCHID value for this TRANSACTIONRESPONSE.
     * 
     * @param BATCHID
     */
    public void setBATCHID(java.lang.String BATCHID) {
        this.BATCHID = BATCHID;
    }


    /**
     * Gets the CARDHOLDER_FIRSTNAME value for this TRANSACTIONRESPONSE.
     * 
     * @return CARDHOLDER_FIRSTNAME
     */
    public java.lang.String getCARDHOLDER_FIRSTNAME() {
        return CARDHOLDER_FIRSTNAME;
    }


    /**
     * Sets the CARDHOLDER_FIRSTNAME value for this TRANSACTIONRESPONSE.
     * 
     * @param CARDHOLDER_FIRSTNAME
     */
    public void setCARDHOLDER_FIRSTNAME(java.lang.String CARDHOLDER_FIRSTNAME) {
        this.CARDHOLDER_FIRSTNAME = CARDHOLDER_FIRSTNAME;
    }


    /**
     * Gets the CARDHOLDER_LASTNAME value for this TRANSACTIONRESPONSE.
     * 
     * @return CARDHOLDER_LASTNAME
     */
    public java.lang.String getCARDHOLDER_LASTNAME() {
        return CARDHOLDER_LASTNAME;
    }


    /**
     * Sets the CARDHOLDER_LASTNAME value for this TRANSACTIONRESPONSE.
     * 
     * @param CARDHOLDER_LASTNAME
     */
    public void setCARDHOLDER_LASTNAME(java.lang.String CARDHOLDER_LASTNAME) {
        this.CARDHOLDER_LASTNAME = CARDHOLDER_LASTNAME;
    }


    /**
     * Gets the CARDLEVEL_RESULTS value for this TRANSACTIONRESPONSE.
     * 
     * @return CARDLEVEL_RESULTS
     */
    public java.lang.String getCARDLEVEL_RESULTS() {
        return CARDLEVEL_RESULTS;
    }


    /**
     * Sets the CARDLEVEL_RESULTS value for this TRANSACTIONRESPONSE.
     * 
     * @param CARDLEVEL_RESULTS
     */
    public void setCARDLEVEL_RESULTS(java.lang.String CARDLEVEL_RESULTS) {
        this.CARDLEVEL_RESULTS = CARDLEVEL_RESULTS;
    }


    /**
     * Gets the CARDTYPE value for this TRANSACTIONRESPONSE.
     * 
     * @return CARDTYPE
     */
    public java.lang.String getCARDTYPE() {
        return CARDTYPE;
    }


    /**
     * Sets the CARDTYPE value for this TRANSACTIONRESPONSE.
     * 
     * @param CARDTYPE
     */
    public void setCARDTYPE(java.lang.String CARDTYPE) {
        this.CARDTYPE = CARDTYPE;
    }


    /**
     * Gets the CARD_CODE_RESPONSE_CODE value for this TRANSACTIONRESPONSE.
     * 
     * @return CARD_CODE_RESPONSE_CODE
     */
    public java.lang.String getCARD_CODE_RESPONSE_CODE() {
        return CARD_CODE_RESPONSE_CODE;
    }


    /**
     * Sets the CARD_CODE_RESPONSE_CODE value for this TRANSACTIONRESPONSE.
     * 
     * @param CARD_CODE_RESPONSE_CODE
     */
    public void setCARD_CODE_RESPONSE_CODE(java.lang.String CARD_CODE_RESPONSE_CODE) {
        this.CARD_CODE_RESPONSE_CODE = CARD_CODE_RESPONSE_CODE;
    }


    /**
     * Gets the CASHBACK_AMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @return CASHBACK_AMOUNT
     */
    public java.math.BigDecimal getCASHBACK_AMOUNT() {
        return CASHBACK_AMOUNT;
    }


    /**
     * Sets the CASHBACK_AMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @param CASHBACK_AMOUNT
     */
    public void setCASHBACK_AMOUNT(java.math.BigDecimal CASHBACK_AMOUNT) {
        this.CASHBACK_AMOUNT = CASHBACK_AMOUNT;
    }


    /**
     * Gets the CAVV_RESPONSE_CODE value for this TRANSACTIONRESPONSE.
     * 
     * @return CAVV_RESPONSE_CODE
     */
    public java.lang.String getCAVV_RESPONSE_CODE() {
        return CAVV_RESPONSE_CODE;
    }


    /**
     * Sets the CAVV_RESPONSE_CODE value for this TRANSACTIONRESPONSE.
     * 
     * @param CAVV_RESPONSE_CODE
     */
    public void setCAVV_RESPONSE_CODE(java.lang.String CAVV_RESPONSE_CODE) {
        this.CAVV_RESPONSE_CODE = CAVV_RESPONSE_CODE;
    }


    /**
     * Gets the CHECKNUM value for this TRANSACTIONRESPONSE.
     * 
     * @return CHECKNUM
     */
    public java.lang.String getCHECKNUM() {
        return CHECKNUM;
    }


    /**
     * Sets the CHECKNUM value for this TRANSACTIONRESPONSE.
     * 
     * @param CHECKNUM
     */
    public void setCHECKNUM(java.lang.String CHECKNUM) {
        this.CHECKNUM = CHECKNUM;
    }


    /**
     * Gets the CODE value for this TRANSACTIONRESPONSE.
     * 
     * @return CODE
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this TRANSACTIONRESPONSE.
     * 
     * @param CODE
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }


    /**
     * Gets the CUSTOMERID value for this TRANSACTIONRESPONSE.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this TRANSACTIONRESPONSE.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the CUSTOMER_BILL value for this TRANSACTIONRESPONSE.
     * 
     * @return CUSTOMER_BILL
     */
    public com.securenet.gateway.API.Contracts.CUSTOMER_BILL getCUSTOMER_BILL() {
        return CUSTOMER_BILL;
    }


    /**
     * Sets the CUSTOMER_BILL value for this TRANSACTIONRESPONSE.
     * 
     * @param CUSTOMER_BILL
     */
    public void setCUSTOMER_BILL(com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL) {
        this.CUSTOMER_BILL = CUSTOMER_BILL;
    }


    /**
     * Gets the EXPIRYDATE value for this TRANSACTIONRESPONSE.
     * 
     * @return EXPIRYDATE
     */
    public java.lang.String getEXPIRYDATE() {
        return EXPIRYDATE;
    }


    /**
     * Sets the EXPIRYDATE value for this TRANSACTIONRESPONSE.
     * 
     * @param EXPIRYDATE
     */
    public void setEXPIRYDATE(java.lang.String EXPIRYDATE) {
        this.EXPIRYDATE = EXPIRYDATE;
    }


    /**
     * Gets the GRATUITY value for this TRANSACTIONRESPONSE.
     * 
     * @return GRATUITY
     */
    public java.math.BigDecimal getGRATUITY() {
        return GRATUITY;
    }


    /**
     * Sets the GRATUITY value for this TRANSACTIONRESPONSE.
     * 
     * @param GRATUITY
     */
    public void setGRATUITY(java.math.BigDecimal GRATUITY) {
        this.GRATUITY = GRATUITY;
    }


    /**
     * Gets the INDUSTRYSPECIFICDATA value for this TRANSACTIONRESPONSE.
     * 
     * @return INDUSTRYSPECIFICDATA
     */
    public java.lang.String getINDUSTRYSPECIFICDATA() {
        return INDUSTRYSPECIFICDATA;
    }


    /**
     * Sets the INDUSTRYSPECIFICDATA value for this TRANSACTIONRESPONSE.
     * 
     * @param INDUSTRYSPECIFICDATA
     */
    public void setINDUSTRYSPECIFICDATA(java.lang.String INDUSTRYSPECIFICDATA) {
        this.INDUSTRYSPECIFICDATA = INDUSTRYSPECIFICDATA;
    }


    /**
     * Gets the LAST4DIGITS value for this TRANSACTIONRESPONSE.
     * 
     * @return LAST4DIGITS
     */
    public java.lang.String getLAST4DIGITS() {
        return LAST4DIGITS;
    }


    /**
     * Sets the LAST4DIGITS value for this TRANSACTIONRESPONSE.
     * 
     * @param LAST4DIGITS
     */
    public void setLAST4DIGITS(java.lang.String LAST4DIGITS) {
        this.LAST4DIGITS = LAST4DIGITS;
    }


    /**
     * Gets the LEVEL2_VALID value for this TRANSACTIONRESPONSE.
     * 
     * @return LEVEL2_VALID
     */
    public java.lang.String getLEVEL2_VALID() {
        return LEVEL2_VALID;
    }


    /**
     * Sets the LEVEL2_VALID value for this TRANSACTIONRESPONSE.
     * 
     * @param LEVEL2_VALID
     */
    public void setLEVEL2_VALID(java.lang.String LEVEL2_VALID) {
        this.LEVEL2_VALID = LEVEL2_VALID;
    }


    /**
     * Gets the LEVEL3_VALID value for this TRANSACTIONRESPONSE.
     * 
     * @return LEVEL3_VALID
     */
    public java.lang.String getLEVEL3_VALID() {
        return LEVEL3_VALID;
    }


    /**
     * Sets the LEVEL3_VALID value for this TRANSACTIONRESPONSE.
     * 
     * @param LEVEL3_VALID
     */
    public void setLEVEL3_VALID(java.lang.String LEVEL3_VALID) {
        this.LEVEL3_VALID = LEVEL3_VALID;
    }


    /**
     * Gets the MARKETSPECIFICDATA value for this TRANSACTIONRESPONSE.
     * 
     * @return MARKETSPECIFICDATA
     */
    public java.lang.String getMARKETSPECIFICDATA() {
        return MARKETSPECIFICDATA;
    }


    /**
     * Sets the MARKETSPECIFICDATA value for this TRANSACTIONRESPONSE.
     * 
     * @param MARKETSPECIFICDATA
     */
    public void setMARKETSPECIFICDATA(java.lang.String MARKETSPECIFICDATA) {
        this.MARKETSPECIFICDATA = MARKETSPECIFICDATA;
    }


    /**
     * Gets the METHOD value for this TRANSACTIONRESPONSE.
     * 
     * @return METHOD
     */
    public java.lang.String getMETHOD() {
        return METHOD;
    }


    /**
     * Sets the METHOD value for this TRANSACTIONRESPONSE.
     * 
     * @param METHOD
     */
    public void setMETHOD(java.lang.String METHOD) {
        this.METHOD = METHOD;
    }


    /**
     * Gets the NETWORKCODE value for this TRANSACTIONRESPONSE.
     * 
     * @return NETWORKCODE
     */
    public java.lang.String getNETWORKCODE() {
        return NETWORKCODE;
    }


    /**
     * Sets the NETWORKCODE value for this TRANSACTIONRESPONSE.
     * 
     * @param NETWORKCODE
     */
    public void setNETWORKCODE(java.lang.String NETWORKCODE) {
        this.NETWORKCODE = NETWORKCODE;
    }


    /**
     * Gets the NETWORKID value for this TRANSACTIONRESPONSE.
     * 
     * @return NETWORKID
     */
    public java.lang.String getNETWORKID() {
        return NETWORKID;
    }


    /**
     * Sets the NETWORKID value for this TRANSACTIONRESPONSE.
     * 
     * @param NETWORKID
     */
    public void setNETWORKID(java.lang.String NETWORKID) {
        this.NETWORKID = NETWORKID;
    }


    /**
     * Gets the ORDERID value for this TRANSACTIONRESPONSE.
     * 
     * @return ORDERID
     */
    public java.lang.String getORDERID() {
        return ORDERID;
    }


    /**
     * Sets the ORDERID value for this TRANSACTIONRESPONSE.
     * 
     * @param ORDERID
     */
    public void setORDERID(java.lang.String ORDERID) {
        this.ORDERID = ORDERID;
    }


    /**
     * Gets the PAYMENTID value for this TRANSACTIONRESPONSE.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this TRANSACTIONRESPONSE.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the RETREFERENCENUM value for this TRANSACTIONRESPONSE.
     * 
     * @return RETREFERENCENUM
     */
    public java.lang.String getRETREFERENCENUM() {
        return RETREFERENCENUM;
    }


    /**
     * Sets the RETREFERENCENUM value for this TRANSACTIONRESPONSE.
     * 
     * @param RETREFERENCENUM
     */
    public void setRETREFERENCENUM(java.lang.String RETREFERENCENUM) {
        this.RETREFERENCENUM = RETREFERENCENUM;
    }

    public String getRISK_CATEGORY() {
        return RISK_CATEGORY;
    }

    public void setRISK_CATEGORY(String RISK_CATEGORY) {
        this.RISK_CATEGORY = RISK_CATEGORY;
    }

    public String getRISK_REASON1() {
        return RISK_REASON1;
    }

    public void setRISK_REASON1(String RISK_REASON1) {
        this.RISK_REASON1 = RISK_REASON1;
    }

    public String getRISK_REASON2() {
        return RISK_REASON2;
    }

    public void setRISK_REASON2(String RISK_REASON2) {
        this.RISK_REASON2 = RISK_REASON2;
    }

    public String getRISK_REASON3() {
        return RISK_REASON3;
    }

    public void setRISK_REASON3(String RISK_REASON3) {
        this.RISK_REASON3 = RISK_REASON3;
    }

    public String getRISK_REASON4() {
        return RISK_REASON4;
    }

    public void setRISK_REASON4(String RISK_REASON4) {
        this.RISK_REASON4 = RISK_REASON4;
    }

    public String getRISK_REASON5() {
        return RISK_REASON5;
    }

    public void setRISK_REASON5(String RISK_REASON5) {
        this.RISK_REASON5 = RISK_REASON5;
    }

    /**
     * Gets the SECURENETID value for this TRANSACTIONRESPONSE.
     * 
     * @return SECURENETID
     */
    public java.lang.Integer getSECURENETID() {
        return SECURENETID;
    }


    /**
     * Sets the SECURENETID value for this TRANSACTIONRESPONSE.
     * 
     * @param SECURENETID
     */
    public void setSECURENETID(java.lang.Integer SECURENETID) {
        this.SECURENETID = SECURENETID;
    }


    /**
     * Gets the SETTLEMENTAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @return SETTLEMENTAMOUNT
     */
    public java.math.BigDecimal getSETTLEMENTAMOUNT() {
        return SETTLEMENTAMOUNT;
    }


    /**
     * Sets the SETTLEMENTAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @param SETTLEMENTAMOUNT
     */
    public void setSETTLEMENTAMOUNT(java.math.BigDecimal SETTLEMENTAMOUNT) {
        this.SETTLEMENTAMOUNT = SETTLEMENTAMOUNT;
    }


    /**
     * Gets the SETTLEMENTDATETIME value for this TRANSACTIONRESPONSE.
     * 
     * @return SETTLEMENTDATETIME
     */
    public java.lang.String getSETTLEMENTDATETIME() {
        return SETTLEMENTDATETIME;
    }


    /**
     * Sets the SETTLEMENTDATETIME value for this TRANSACTIONRESPONSE.
     * 
     * @param SETTLEMENTDATETIME
     */
    public void setSETTLEMENTDATETIME(java.lang.String SETTLEMENTDATETIME) {
        this.SETTLEMENTDATETIME = SETTLEMENTDATETIME;
    }


    /**
     * Gets the SYSTEM_TRACENUM value for this TRANSACTIONRESPONSE.
     * 
     * @return SYSTEM_TRACENUM
     */
    public java.lang.String getSYSTEM_TRACENUM() {
        return SYSTEM_TRACENUM;
    }


    /**
     * Sets the SYSTEM_TRACENUM value for this TRANSACTIONRESPONSE.
     * 
     * @param SYSTEM_TRACENUM
     */
    public void setSYSTEM_TRACENUM(java.lang.String SYSTEM_TRACENUM) {
        this.SYSTEM_TRACENUM = SYSTEM_TRACENUM;
    }


    /**
     * Gets the TRACKTYPE value for this TRANSACTIONRESPONSE.
     * 
     * @return TRACKTYPE
     */
    public java.lang.String getTRACKTYPE() {
        return TRACKTYPE;
    }


    /**
     * Sets the TRACKTYPE value for this TRANSACTIONRESPONSE.
     * 
     * @param TRACKTYPE
     */
    public void setTRACKTYPE(java.lang.String TRACKTYPE) {
        this.TRACKTYPE = TRACKTYPE;
    }


    /**
     * Gets the TRANSACTIONAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @return TRANSACTIONAMOUNT
     */
    public java.math.BigDecimal getTRANSACTIONAMOUNT() {
        return TRANSACTIONAMOUNT;
    }


    /**
     * Sets the TRANSACTIONAMOUNT value for this TRANSACTIONRESPONSE.
     * 
     * @param TRANSACTIONAMOUNT
     */
    public void setTRANSACTIONAMOUNT(java.math.BigDecimal TRANSACTIONAMOUNT) {
        this.TRANSACTIONAMOUNT = TRANSACTIONAMOUNT;
    }


    /**
     * Gets the TRANSACTIONDATETIME value for this TRANSACTIONRESPONSE.
     * 
     * @return TRANSACTIONDATETIME
     */
    public java.lang.String getTRANSACTIONDATETIME() {
        return TRANSACTIONDATETIME;
    }


    /**
     * Sets the TRANSACTIONDATETIME value for this TRANSACTIONRESPONSE.
     * 
     * @param TRANSACTIONDATETIME
     */
    public void setTRANSACTIONDATETIME(java.lang.String TRANSACTIONDATETIME) {
        this.TRANSACTIONDATETIME = TRANSACTIONDATETIME;
    }


    /**
     * Gets the TRANSACTIONID value for this TRANSACTIONRESPONSE.
     * 
     * @return TRANSACTIONID
     */
    public java.lang.Integer getTRANSACTIONID() {
        return TRANSACTIONID;
    }


    /**
     * Sets the TRANSACTIONID value for this TRANSACTIONRESPONSE.
     * 
     * @param TRANSACTIONID
     */
    public void setTRANSACTIONID(java.lang.Integer TRANSACTIONID) {
        this.TRANSACTIONID = TRANSACTIONID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRANSACTIONRESPONSE)) return false;
        TRANSACTIONRESPONSE other = (TRANSACTIONRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ADDITIONALAMOUNT==null && other.getADDITIONALAMOUNT()==null) || 
             (this.ADDITIONALAMOUNT!=null &&
              this.ADDITIONALAMOUNT.equals(other.getADDITIONALAMOUNT()))) &&
            ((this.ADDITIONALDATA1==null && other.getADDITIONALDATA1()==null) || 
             (this.ADDITIONALDATA1!=null &&
              this.ADDITIONALDATA1.equals(other.getADDITIONALDATA1()))) &&
            ((this.ADDITIONALDATA2==null && other.getADDITIONALDATA2()==null) || 
             (this.ADDITIONALDATA2!=null &&
              this.ADDITIONALDATA2.equals(other.getADDITIONALDATA2()))) &&
            ((this.ADDITIONALDATA3==null && other.getADDITIONALDATA3()==null) || 
             (this.ADDITIONALDATA3!=null &&
              this.ADDITIONALDATA3.equals(other.getADDITIONALDATA3()))) &&
            ((this.ADDITIONALDATA4==null && other.getADDITIONALDATA4()==null) || 
             (this.ADDITIONALDATA4!=null &&
              this.ADDITIONALDATA4.equals(other.getADDITIONALDATA4()))) &&
            ((this.ADDITIONALDATA5==null && other.getADDITIONALDATA5()==null) || 
             (this.ADDITIONALDATA5!=null &&
              this.ADDITIONALDATA5.equals(other.getADDITIONALDATA5()))) &&
            ((this.AUTHCODE==null && other.getAUTHCODE()==null) || 
             (this.AUTHCODE!=null &&
              this.AUTHCODE.equals(other.getAUTHCODE()))) &&
            ((this.AUTHORIZEDAMOUNT==null && other.getAUTHORIZEDAMOUNT()==null) || 
             (this.AUTHORIZEDAMOUNT!=null &&
              this.AUTHORIZEDAMOUNT.equals(other.getAUTHORIZEDAMOUNT()))) &&
            ((this.AVS_RESULT_CODE==null && other.getAVS_RESULT_CODE()==null) || 
             (this.AVS_RESULT_CODE!=null &&
              this.AVS_RESULT_CODE.equals(other.getAVS_RESULT_CODE()))) &&
            ((this.BANK_ACCOUNTNAME==null && other.getBANK_ACCOUNTNAME()==null) || 
             (this.BANK_ACCOUNTNAME!=null &&
              this.BANK_ACCOUNTNAME.equals(other.getBANK_ACCOUNTNAME()))) &&
            ((this.BANK_ACCOUNTTYPE==null && other.getBANK_ACCOUNTTYPE()==null) || 
             (this.BANK_ACCOUNTTYPE!=null &&
              this.BANK_ACCOUNTTYPE.equals(other.getBANK_ACCOUNTTYPE()))) &&
            ((this.BATCHID==null && other.getBATCHID()==null) || 
             (this.BATCHID!=null &&
              this.BATCHID.equals(other.getBATCHID()))) &&
            ((this.CARDHOLDER_FIRSTNAME==null && other.getCARDHOLDER_FIRSTNAME()==null) || 
             (this.CARDHOLDER_FIRSTNAME!=null &&
              this.CARDHOLDER_FIRSTNAME.equals(other.getCARDHOLDER_FIRSTNAME()))) &&
            ((this.CARDHOLDER_LASTNAME==null && other.getCARDHOLDER_LASTNAME()==null) || 
             (this.CARDHOLDER_LASTNAME!=null &&
              this.CARDHOLDER_LASTNAME.equals(other.getCARDHOLDER_LASTNAME()))) &&
            ((this.CARDLEVEL_RESULTS==null && other.getCARDLEVEL_RESULTS()==null) || 
             (this.CARDLEVEL_RESULTS!=null &&
              this.CARDLEVEL_RESULTS.equals(other.getCARDLEVEL_RESULTS()))) &&
            ((this.CARDTYPE==null && other.getCARDTYPE()==null) || 
             (this.CARDTYPE!=null &&
              this.CARDTYPE.equals(other.getCARDTYPE()))) &&
            ((this.CARD_CODE_RESPONSE_CODE==null && other.getCARD_CODE_RESPONSE_CODE()==null) || 
             (this.CARD_CODE_RESPONSE_CODE!=null &&
              this.CARD_CODE_RESPONSE_CODE.equals(other.getCARD_CODE_RESPONSE_CODE()))) &&
            ((this.CASHBACK_AMOUNT==null && other.getCASHBACK_AMOUNT()==null) || 
             (this.CASHBACK_AMOUNT!=null &&
              this.CASHBACK_AMOUNT.equals(other.getCASHBACK_AMOUNT()))) &&
            ((this.CAVV_RESPONSE_CODE==null && other.getCAVV_RESPONSE_CODE()==null) || 
             (this.CAVV_RESPONSE_CODE!=null &&
              this.CAVV_RESPONSE_CODE.equals(other.getCAVV_RESPONSE_CODE()))) &&
            ((this.CHECKNUM==null && other.getCHECKNUM()==null) || 
             (this.CHECKNUM!=null &&
              this.CHECKNUM.equals(other.getCHECKNUM()))) &&
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE()))) &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.CUSTOMER_BILL==null && other.getCUSTOMER_BILL()==null) || 
             (this.CUSTOMER_BILL!=null &&
              this.CUSTOMER_BILL.equals(other.getCUSTOMER_BILL()))) &&
            ((this.EXPIRYDATE==null && other.getEXPIRYDATE()==null) || 
             (this.EXPIRYDATE!=null &&
              this.EXPIRYDATE.equals(other.getEXPIRYDATE()))) &&
            ((this.GRATUITY==null && other.getGRATUITY()==null) || 
             (this.GRATUITY!=null &&
              this.GRATUITY.equals(other.getGRATUITY()))) &&
            ((this.INDUSTRYSPECIFICDATA==null && other.getINDUSTRYSPECIFICDATA()==null) || 
             (this.INDUSTRYSPECIFICDATA!=null &&
              this.INDUSTRYSPECIFICDATA.equals(other.getINDUSTRYSPECIFICDATA()))) &&
            ((this.LAST4DIGITS==null && other.getLAST4DIGITS()==null) || 
             (this.LAST4DIGITS!=null &&
              this.LAST4DIGITS.equals(other.getLAST4DIGITS()))) &&
            ((this.LEVEL2_VALID==null && other.getLEVEL2_VALID()==null) || 
             (this.LEVEL2_VALID!=null &&
              this.LEVEL2_VALID.equals(other.getLEVEL2_VALID()))) &&
            ((this.LEVEL3_VALID==null && other.getLEVEL3_VALID()==null) || 
             (this.LEVEL3_VALID!=null &&
              this.LEVEL3_VALID.equals(other.getLEVEL3_VALID()))) &&
            ((this.MARKETSPECIFICDATA==null && other.getMARKETSPECIFICDATA()==null) || 
             (this.MARKETSPECIFICDATA!=null &&
              this.MARKETSPECIFICDATA.equals(other.getMARKETSPECIFICDATA()))) &&
            ((this.METHOD==null && other.getMETHOD()==null) || 
             (this.METHOD!=null &&
              this.METHOD.equals(other.getMETHOD()))) &&
            ((this.NETWORKCODE==null && other.getNETWORKCODE()==null) || 
             (this.NETWORKCODE!=null &&
              this.NETWORKCODE.equals(other.getNETWORKCODE()))) &&
            ((this.NETWORKID==null && other.getNETWORKID()==null) || 
             (this.NETWORKID!=null &&
              this.NETWORKID.equals(other.getNETWORKID()))) &&
            ((this.ORDERID==null && other.getORDERID()==null) || 
             (this.ORDERID!=null &&
              this.ORDERID.equals(other.getORDERID()))) &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.RETREFERENCENUM==null && other.getRETREFERENCENUM()==null) || 
             (this.RETREFERENCENUM!=null &&
              this.RETREFERENCENUM.equals(other.getRETREFERENCENUM()))) &&
            ((this.RISK_CATEGORY==null && other.getRISK_CATEGORY()==null) ||
            (this.RISK_CATEGORY!=null &&
            this.RISK_CATEGORY.equals(other.getRISK_CATEGORY()))) &&
            ((this.RISK_REASON1==null && other.getRISK_REASON1()==null) ||
            (this.RISK_REASON1!=null &&
            this.RISK_REASON1.equals(other.getRISK_REASON1()))) &&
            ((this.RISK_REASON2==null && other.getRISK_REASON2()==null) ||
            (this.RISK_REASON2!=null &&
            this.RISK_REASON2.equals(other.getRISK_REASON2()))) &&
            ((this.RISK_REASON3==null && other.getRISK_REASON3()==null) ||
            (this.RISK_REASON3!=null &&
            this.RISK_REASON3.equals(other.getRISK_REASON3()))) &&
            ((this.RISK_REASON4==null && other.getRISK_REASON4()==null) ||
            (this.RISK_REASON4!=null &&
            this.RISK_REASON4.equals(other.getRISK_REASON4()))) &&
            ((this.RISK_REASON5==null && other.getRISK_REASON5()==null) ||
            (this.RISK_REASON5!=null &&
            this.RISK_REASON5.equals(other.getRISK_REASON5()))) &&
            ((this.SECURENETID==null && other.getSECURENETID()==null) || 
             (this.SECURENETID!=null &&
              this.SECURENETID.equals(other.getSECURENETID()))) &&
            ((this.SETTLEMENTAMOUNT==null && other.getSETTLEMENTAMOUNT()==null) || 
             (this.SETTLEMENTAMOUNT!=null &&
              this.SETTLEMENTAMOUNT.equals(other.getSETTLEMENTAMOUNT()))) &&
            ((this.SETTLEMENTDATETIME==null && other.getSETTLEMENTDATETIME()==null) || 
             (this.SETTLEMENTDATETIME!=null &&
              this.SETTLEMENTDATETIME.equals(other.getSETTLEMENTDATETIME()))) &&
            ((this.SYSTEM_TRACENUM==null && other.getSYSTEM_TRACENUM()==null) || 
             (this.SYSTEM_TRACENUM!=null &&
              this.SYSTEM_TRACENUM.equals(other.getSYSTEM_TRACENUM()))) &&
            ((this.TRACKTYPE==null && other.getTRACKTYPE()==null) || 
             (this.TRACKTYPE!=null &&
              this.TRACKTYPE.equals(other.getTRACKTYPE()))) &&
            ((this.TRANSACTIONAMOUNT==null && other.getTRANSACTIONAMOUNT()==null) || 
             (this.TRANSACTIONAMOUNT!=null &&
              this.TRANSACTIONAMOUNT.equals(other.getTRANSACTIONAMOUNT()))) &&
            ((this.TRANSACTIONDATETIME==null && other.getTRANSACTIONDATETIME()==null) || 
             (this.TRANSACTIONDATETIME!=null &&
              this.TRANSACTIONDATETIME.equals(other.getTRANSACTIONDATETIME()))) &&
            ((this.TRANSACTIONID==null && other.getTRANSACTIONID()==null) || 
             (this.TRANSACTIONID!=null &&
              this.TRANSACTIONID.equals(other.getTRANSACTIONID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getADDITIONALAMOUNT() != null) {
            _hashCode += getADDITIONALAMOUNT().hashCode();
        }
        if (getADDITIONALDATA1() != null) {
            _hashCode += getADDITIONALDATA1().hashCode();
        }
        if (getADDITIONALDATA2() != null) {
            _hashCode += getADDITIONALDATA2().hashCode();
        }
        if (getADDITIONALDATA3() != null) {
            _hashCode += getADDITIONALDATA3().hashCode();
        }
        if (getADDITIONALDATA4() != null) {
            _hashCode += getADDITIONALDATA4().hashCode();
        }
        if (getADDITIONALDATA5() != null) {
            _hashCode += getADDITIONALDATA5().hashCode();
        }
        if (getAUTHCODE() != null) {
            _hashCode += getAUTHCODE().hashCode();
        }
        if (getAUTHORIZEDAMOUNT() != null) {
            _hashCode += getAUTHORIZEDAMOUNT().hashCode();
        }
        if (getAVS_RESULT_CODE() != null) {
            _hashCode += getAVS_RESULT_CODE().hashCode();
        }
        if (getBANK_ACCOUNTNAME() != null) {
            _hashCode += getBANK_ACCOUNTNAME().hashCode();
        }
        if (getBANK_ACCOUNTTYPE() != null) {
            _hashCode += getBANK_ACCOUNTTYPE().hashCode();
        }
        if (getBATCHID() != null) {
            _hashCode += getBATCHID().hashCode();
        }
        if (getCARDHOLDER_FIRSTNAME() != null) {
            _hashCode += getCARDHOLDER_FIRSTNAME().hashCode();
        }
        if (getCARDHOLDER_LASTNAME() != null) {
            _hashCode += getCARDHOLDER_LASTNAME().hashCode();
        }
        if (getCARDLEVEL_RESULTS() != null) {
            _hashCode += getCARDLEVEL_RESULTS().hashCode();
        }
        if (getCARDTYPE() != null) {
            _hashCode += getCARDTYPE().hashCode();
        }
        if (getCARD_CODE_RESPONSE_CODE() != null) {
            _hashCode += getCARD_CODE_RESPONSE_CODE().hashCode();
        }
        if (getCASHBACK_AMOUNT() != null) {
            _hashCode += getCASHBACK_AMOUNT().hashCode();
        }
        if (getCAVV_RESPONSE_CODE() != null) {
            _hashCode += getCAVV_RESPONSE_CODE().hashCode();
        }
        if (getCHECKNUM() != null) {
            _hashCode += getCHECKNUM().hashCode();
        }
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getCUSTOMER_BILL() != null) {
            _hashCode += getCUSTOMER_BILL().hashCode();
        }
        if (getEXPIRYDATE() != null) {
            _hashCode += getEXPIRYDATE().hashCode();
        }
        if (getGRATUITY() != null) {
            _hashCode += getGRATUITY().hashCode();
        }
        if (getINDUSTRYSPECIFICDATA() != null) {
            _hashCode += getINDUSTRYSPECIFICDATA().hashCode();
        }
        if (getLAST4DIGITS() != null) {
            _hashCode += getLAST4DIGITS().hashCode();
        }
        if (getLEVEL2_VALID() != null) {
            _hashCode += getLEVEL2_VALID().hashCode();
        }
        if (getLEVEL3_VALID() != null) {
            _hashCode += getLEVEL3_VALID().hashCode();
        }
        if (getMARKETSPECIFICDATA() != null) {
            _hashCode += getMARKETSPECIFICDATA().hashCode();
        }
        if (getMETHOD() != null) {
            _hashCode += getMETHOD().hashCode();
        }
        if (getNETWORKCODE() != null) {
            _hashCode += getNETWORKCODE().hashCode();
        }
        if (getNETWORKID() != null) {
            _hashCode += getNETWORKID().hashCode();
        }
        if (getORDERID() != null) {
            _hashCode += getORDERID().hashCode();
        }
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getRETREFERENCENUM() != null) {
            _hashCode += getRETREFERENCENUM().hashCode();
        }
        if (getRISK_CATEGORY() != null) {
            _hashCode += getRISK_CATEGORY().hashCode();
        }
        if (getRISK_REASON1() != null) {
            _hashCode += getRISK_REASON1().hashCode();
        }
        if (getRISK_REASON2() != null) {
            _hashCode += getRISK_REASON2().hashCode();
        }
        if (getRISK_REASON3() != null) {
            _hashCode += getRISK_REASON3().hashCode();
        }
        if (getRISK_REASON4() != null) {
            _hashCode += getRISK_REASON4().hashCode();
        }
        if (getRISK_REASON5() != null) {
            _hashCode += getRISK_REASON5().hashCode();
        }
        if (getSECURENETID() != null) {
            _hashCode += getSECURENETID().hashCode();
        }
        if (getSETTLEMENTAMOUNT() != null) {
            _hashCode += getSETTLEMENTAMOUNT().hashCode();
        }
        if (getSETTLEMENTDATETIME() != null) {
            _hashCode += getSETTLEMENTDATETIME().hashCode();
        }
        if (getSYSTEM_TRACENUM() != null) {
            _hashCode += getSYSTEM_TRACENUM().hashCode();
        }
        if (getTRACKTYPE() != null) {
            _hashCode += getTRACKTYPE().hashCode();
        }
        if (getTRANSACTIONAMOUNT() != null) {
            _hashCode += getTRANSACTIONAMOUNT().hashCode();
        }
        if (getTRANSACTIONDATETIME() != null) {
            _hashCode += getTRANSACTIONDATETIME().hashCode();
        }
        if (getTRANSACTIONID() != null) {
            _hashCode += getTRANSACTIONID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRANSACTIONRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALDATA1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALDATA1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALDATA2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALDATA2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALDATA3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALDATA3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALDATA4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALDATA4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALDATA5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALDATA5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTHCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTHCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTHORIZEDAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTHORIZEDAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVS_RESULT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AVS_RESULT_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANK_ACCOUNTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BANK_ACCOUNTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANK_ACCOUNTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BANK_ACCOUNTTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BATCHID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDHOLDER_FIRSTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDHOLDER_FIRSTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDHOLDER_LASTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDHOLDER_LASTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDLEVEL_RESULTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDLEVEL_RESULTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_CODE_RESPONSE_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD_CODE_RESPONSE_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CASHBACK_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CASHBACK_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAVV_RESPONSE_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CAVV_RESPONSE_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECKNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMER_BILL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPIRYDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EXPIRYDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRATUITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GRATUITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDUSTRYSPECIFICDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INDUSTRYSPECIFICDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAST4DIGITS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LAST4DIGITS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEVEL2_VALID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL2_VALID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEVEL3_VALID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3_VALID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MARKETSPECIFICDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MARKETSPECIFICDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("METHOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "METHOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETWORKCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NETWORKCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETWORKID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NETWORKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ORDERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETREFERENCENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RETREFERENCENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK_CATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RISK_CATEGORY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK_REASON1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RISK_REASON1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK_REASON2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RISK_REASON2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK_REASON3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RISK_REASON3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK_REASON4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RISK_REASON4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK_REASON5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RISK_REASON5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECURENETID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECURENETID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SETTLEMENTAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SETTLEMENTAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SETTLEMENTDATETIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SETTLEMENTDATETIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSTEM_TRACENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SYSTEM_TRACENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRACKTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRACKTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONDATETIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONDATETIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
