/**
 * TRANSACTION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class TRANSACTION  implements java.io.Serializable {
    private java.math.BigDecimal AMOUNT;

    private java.lang.String AUTHCODE;

    private com.securenet.gateway.API.Contracts.AUTO AUTO;

    private com.securenet.gateway.API.Contracts.CARD CARD;

    private java.math.BigDecimal CASHBACK_AMOUNT;

    private com.securenet.gateway.API.Contracts.CHECK CHECK;

    private java.lang.String CODE;

    private java.lang.String CUSTOMERID;

    private java.lang.String CUSTOMERIP;

    private com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL;

    private com.securenet.gateway.API.Contracts.CUSTOMER_SHIP CUSTOMER_SHIP;

    private int DCI;

    private java.lang.String DEVICECODE;

    private com.securenet.gateway.API.Contracts.ENCRYPTION ENCRYPTION;

    private java.lang.String ENTRYSOURCE;

    private com.securenet.gateway.API.Contracts.HOTEL HOTEL;

    private java.lang.String INDUSTRYSPECIFICDATA;

    private short INSTALLMENT_SEQUENCENUM;

    private java.lang.String INVOICEDESC;

    private java.lang.String INVOICENUM;

    private com.securenet.gateway.API.Contracts.LEVEL2 LEVEL2;

    private com.securenet.gateway.API.Contracts.LEVEL3 LEVEL3;

    private java.lang.String MARKETSPECIFICDATA;

    private com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY;

    private java.lang.String METHOD;

    private com.securenet.gateway.API.Contracts.MPI MPI;

    private java.lang.String NOTE;

    private java.lang.String ORDERID;

    private int OVERRIDE_FROM;

    private java.lang.String PAYMENTID;

    private com.securenet.gateway.API.Contracts.PETROLEUM PETROLEUM;

    private com.securenet.gateway.API.Contracts.PRODUCT[] PRODUCTS;

    private java.lang.String REF_TRANSID;

    private int RETAIL_LANENUM;

    private java.lang.String RISK_CATEGORY;

    private java.lang.String RISK_REASON1;

    private java.lang.String RISK_REASON2;

    private java.lang.String RISK_REASON3;

    private java.lang.String RISK_REASON4;

    private java.lang.String RISK_REASON5;

    private com.securenet.gateway.API.Contracts.MERCHANT_KEY SECONDARY_MERCHANT_KEY;

    private com.securenet.gateway.API.Contracts.SERVICE SERVICE;

    private java.lang.String SOFTDESCRIPTOR;

    private java.lang.String TEST;

    private short TOTAL_INSTALLMENTCOUNT;

    private int TRANSACTION_SERVICE;

    private com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED;

    private java.lang.String DEVELOPERID;

    private com.securenet.gateway.API.Contracts.TERMINAL TERMINAL;

    private java.lang.String VERSION;

    private com.securenet.gateway.API.Contracts.HEALTHCARE HEALTHCARE;

    private com.securenet.gateway.API.Contracts.IMAGE IMAGE;

    public TRANSACTION() {
    }

    public TRANSACTION(
           java.math.BigDecimal AMOUNT,
           java.lang.String AUTHCODE,
           com.securenet.gateway.API.Contracts.AUTO AUTO,
           com.securenet.gateway.API.Contracts.CARD CARD,
           java.math.BigDecimal CASHBACK_AMOUNT,
           com.securenet.gateway.API.Contracts.CHECK CHECK,
           java.lang.String CODE,
           java.lang.String CUSTOMERID,
           java.lang.String CUSTOMERIP,
           com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL,
           com.securenet.gateway.API.Contracts.CUSTOMER_SHIP CUSTOMER_SHIP,
           int DCI,
           java.lang.String DEVICECODE,
           com.securenet.gateway.API.Contracts.ENCRYPTION ENCRYPTION,
           java.lang.String ENTRYSOURCE,
           com.securenet.gateway.API.Contracts.HOTEL HOTEL,
           java.lang.String INDUSTRYSPECIFICDATA,
           short INSTALLMENT_SEQUENCENUM,
           java.lang.String INVOICEDESC,
           java.lang.String INVOICENUM,
           com.securenet.gateway.API.Contracts.LEVEL2 LEVEL2,
           com.securenet.gateway.API.Contracts.LEVEL3 LEVEL3,
           java.lang.String MARKETSPECIFICDATA,
           com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY,
           java.lang.String METHOD,
           com.securenet.gateway.API.Contracts.MPI MPI,
           java.lang.String NOTE,
           java.lang.String ORDERID,
           int OVERRIDE_FROM,
           java.lang.String PAYMENTID,
           com.securenet.gateway.API.Contracts.PETROLEUM PETROLEUM,
           com.securenet.gateway.API.Contracts.PRODUCT[] PRODUCTS,
           java.lang.String REF_TRANSID,
           int RETAIL_LANENUM,
           java.lang.String RISK_CATEGORY,
           java.lang.String RISK_REASON1,
           java.lang.String RISK_REASON2,
           java.lang.String RISK_REASON3,
           com.securenet.gateway.API.Contracts.MERCHANT_KEY SECONDARY_MERCHANT_KEY,
           com.securenet.gateway.API.Contracts.SERVICE SERVICE,
           java.lang.String SOFTDESCRIPTOR,
           java.lang.String TEST,
           short TOTAL_INSTALLMENTCOUNT,
           int TRANSACTION_SERVICE,
           com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED,
           java.lang.String DEVELOPERID,
           com.securenet.gateway.API.Contracts.TERMINAL TERMINAL,
           java.lang.String VERSION,
           com.securenet.gateway.API.Contracts.HEALTHCARE HEALTHCARE,
           com.securenet.gateway.API.Contracts.IMAGE IMAGE) {
           this.AMOUNT = AMOUNT;
           this.AUTHCODE = AUTHCODE;
           this.AUTO = AUTO;
           this.CARD = CARD;
           this.CASHBACK_AMOUNT = CASHBACK_AMOUNT;
           this.CHECK = CHECK;
           this.CODE = CODE;
           this.CUSTOMERID = CUSTOMERID;
           this.CUSTOMERIP = CUSTOMERIP;
           this.CUSTOMER_BILL = CUSTOMER_BILL;
           this.CUSTOMER_SHIP = CUSTOMER_SHIP;
           this.DCI = DCI;
           this.DEVICECODE = DEVICECODE;
           this.ENCRYPTION = ENCRYPTION;
           this.ENTRYSOURCE = ENTRYSOURCE;
           this.HOTEL = HOTEL;
           this.INDUSTRYSPECIFICDATA = INDUSTRYSPECIFICDATA;
           this.INSTALLMENT_SEQUENCENUM = INSTALLMENT_SEQUENCENUM;
           this.INVOICEDESC = INVOICEDESC;
           this.INVOICENUM = INVOICENUM;
           this.LEVEL2 = LEVEL2;
           this.LEVEL3 = LEVEL3;
           this.MARKETSPECIFICDATA = MARKETSPECIFICDATA;
           this.MERCHANT_KEY = MERCHANT_KEY;
           this.METHOD = METHOD;
           this.MPI = MPI;
           this.NOTE = NOTE;
           this.ORDERID = ORDERID;
           this.OVERRIDE_FROM = OVERRIDE_FROM;
           this.PAYMENTID = PAYMENTID;
           this.PETROLEUM = PETROLEUM;
           this.PRODUCTS = PRODUCTS;
           this.REF_TRANSID = REF_TRANSID;
           this.RETAIL_LANENUM = RETAIL_LANENUM;
           this.RISK_CATEGORY = RISK_CATEGORY;
           this.RISK_REASON1 = RISK_REASON1;
           this.RISK_REASON2 = RISK_REASON2;
           this.RISK_REASON3 = RISK_REASON3;
           this.RISK_REASON4 = RISK_REASON4;
            this.RISK_REASON5 = RISK_REASON5;
           this.SECONDARY_MERCHANT_KEY = SECONDARY_MERCHANT_KEY;
           this.SERVICE = SERVICE;
           this.SOFTDESCRIPTOR = SOFTDESCRIPTOR;
           this.TEST = TEST;
           this.TOTAL_INSTALLMENTCOUNT = TOTAL_INSTALLMENTCOUNT;
           this.TRANSACTION_SERVICE = TRANSACTION_SERVICE;
           this.USERDEFINED = USERDEFINED;
           this.DEVELOPERID = DEVELOPERID;
           this.TERMINAL = TERMINAL;
           this.VERSION = VERSION;
           this.HEALTHCARE = HEALTHCARE;
           this.IMAGE = IMAGE;
    }


    /**
     * Gets the AMOUNT value for this TRANSACTION.
     * 
     * @return AMOUNT
     */
    public java.math.BigDecimal getAMOUNT() {
        return AMOUNT;
    }


    /**
     * Sets the AMOUNT value for this TRANSACTION.
     * 
     * @param AMOUNT
     */
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }


    /**
     * Gets the AUTHCODE value for this TRANSACTION.
     * 
     * @return AUTHCODE
     */
    public java.lang.String getAUTHCODE() {
        return AUTHCODE;
    }


    /**
     * Sets the AUTHCODE value for this TRANSACTION.
     * 
     * @param AUTHCODE
     */
    public void setAUTHCODE(java.lang.String AUTHCODE) {
        this.AUTHCODE = AUTHCODE;
    }


    /**
     * Gets the AUTO value for this TRANSACTION.
     * 
     * @return AUTO
     */
    public com.securenet.gateway.API.Contracts.AUTO getAUTO() {
        return AUTO;
    }


    /**
     * Sets the AUTO value for this TRANSACTION.
     * 
     * @param AUTO
     */
    public void setAUTO(com.securenet.gateway.API.Contracts.AUTO AUTO) {
        this.AUTO = AUTO;
    }


    /**
     * Gets the CARD value for this TRANSACTION.
     * 
     * @return CARD
     */
    public com.securenet.gateway.API.Contracts.CARD getCARD() {
        return CARD;
    }


    /**
     * Sets the CARD value for this TRANSACTION.
     * 
     * @param CARD
     */
    public void setCARD(com.securenet.gateway.API.Contracts.CARD CARD) {
        this.CARD = CARD;
    }


    /**
     * Gets the CASHBACK_AMOUNT value for this TRANSACTION.
     * 
     * @return CASHBACK_AMOUNT
     */
    public java.math.BigDecimal getCASHBACK_AMOUNT() {
        return CASHBACK_AMOUNT;
    }


    /**
     * Sets the CASHBACK_AMOUNT value for this TRANSACTION.
     * 
     * @param CASHBACK_AMOUNT
     */
    public void setCASHBACK_AMOUNT(java.math.BigDecimal CASHBACK_AMOUNT) {
        this.CASHBACK_AMOUNT = CASHBACK_AMOUNT;
    }


    /**
     * Gets the CHECK value for this TRANSACTION.
     * 
     * @return CHECK
     */
    public com.securenet.gateway.API.Contracts.CHECK getCHECK() {
        return CHECK;
    }


    /**
     * Sets the CHECK value for this TRANSACTION.
     * 
     * @param CHECK
     */
    public void setCHECK(com.securenet.gateway.API.Contracts.CHECK CHECK) {
        this.CHECK = CHECK;
    }


    /**
     * Gets the CODE value for this TRANSACTION.
     * 
     * @return CODE
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this TRANSACTION.
     * 
     * @param CODE
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }


    /**
     * Gets the CUSTOMERID value for this TRANSACTION.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this TRANSACTION.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the CUSTOMERIP value for this TRANSACTION.
     * 
     * @return CUSTOMERIP
     */
    public java.lang.String getCUSTOMERIP() {
        return CUSTOMERIP;
    }


    /**
     * Sets the CUSTOMERIP value for this TRANSACTION.
     * 
     * @param CUSTOMERIP
     */
    public void setCUSTOMERIP(java.lang.String CUSTOMERIP) {
        this.CUSTOMERIP = CUSTOMERIP;
    }


    /**
     * Gets the CUSTOMER_BILL value for this TRANSACTION.
     * 
     * @return CUSTOMER_BILL
     */
    public com.securenet.gateway.API.Contracts.CUSTOMER_BILL getCUSTOMER_BILL() {
        return CUSTOMER_BILL;
    }


    /**
     * Sets the CUSTOMER_BILL value for this TRANSACTION.
     * 
     * @param CUSTOMER_BILL
     */
    public void setCUSTOMER_BILL(com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL) {
        this.CUSTOMER_BILL = CUSTOMER_BILL;
    }


    /**
     * Gets the CUSTOMER_SHIP value for this TRANSACTION.
     * 
     * @return CUSTOMER_SHIP
     */
    public com.securenet.gateway.API.Contracts.CUSTOMER_SHIP getCUSTOMER_SHIP() {
        return CUSTOMER_SHIP;
    }


    /**
     * Sets the CUSTOMER_SHIP value for this TRANSACTION.
     * 
     * @param CUSTOMER_SHIP
     */
    public void setCUSTOMER_SHIP(com.securenet.gateway.API.Contracts.CUSTOMER_SHIP CUSTOMER_SHIP) {
        this.CUSTOMER_SHIP = CUSTOMER_SHIP;
    }


    /**
     * Gets the DCI value for this TRANSACTION.
     * 
     * @return DCI
     */
    public int getDCI() {
        return DCI;
    }


    /**
     * Sets the DCI value for this TRANSACTION.
     * 
     * @param DCI
     */
    public void setDCI(int DCI) {
        this.DCI = DCI;
    }


    /**
     * Gets the DEVICECODE value for this TRANSACTION.
     * 
     * @return DEVICECODE
     */
    public java.lang.String getDEVICECODE() {
        return DEVICECODE;
    }


    /**
     * Sets the DEVICECODE value for this TRANSACTION.
     * 
     * @param DEVICECODE
     */
    public void setDEVICECODE(java.lang.String DEVICECODE) {
        this.DEVICECODE = DEVICECODE;
    }


    /**
     * Gets the ENCRYPTION value for this TRANSACTION.
     * 
     * @return ENCRYPTION
     */
    public com.securenet.gateway.API.Contracts.ENCRYPTION getENCRYPTION() {
        return ENCRYPTION;
    }


    /**
     * Sets the ENCRYPTION value for this TRANSACTION.
     * 
     * @param ENCRYPTION
     */
    public void setENCRYPTION(com.securenet.gateway.API.Contracts.ENCRYPTION ENCRYPTION) {
        this.ENCRYPTION = ENCRYPTION;
    }


    /**
     * Gets the ENTRYSOURCE value for this TRANSACTION.
     * 
     * @return ENTRYSOURCE
     */
    public java.lang.String getENTRYSOURCE() {
        return ENTRYSOURCE;
    }


    /**
     * Sets the ENTRYSOURCE value for this TRANSACTION.
     * 
     * @param ENTRYSOURCE
     */
    public void setENTRYSOURCE(java.lang.String ENTRYSOURCE) {
        this.ENTRYSOURCE = ENTRYSOURCE;
    }


    /**
     * Gets the HOTEL value for this TRANSACTION.
     * 
     * @return HOTEL
     */
    public com.securenet.gateway.API.Contracts.HOTEL getHOTEL() {
        return HOTEL;
    }


    /**
     * Sets the HOTEL value for this TRANSACTION.
     * 
     * @param HOTEL
     */
    public void setHOTEL(com.securenet.gateway.API.Contracts.HOTEL HOTEL) {
        this.HOTEL = HOTEL;
    }


    /**
     * Gets the INDUSTRYSPECIFICDATA value for this TRANSACTION.
     * 
     * @return INDUSTRYSPECIFICDATA
     */
    public java.lang.String getINDUSTRYSPECIFICDATA() {
        return INDUSTRYSPECIFICDATA;
    }


    /**
     * Sets the INDUSTRYSPECIFICDATA value for this TRANSACTION.
     * 
     * @param INDUSTRYSPECIFICDATA
     */
    public void setINDUSTRYSPECIFICDATA(java.lang.String INDUSTRYSPECIFICDATA) {
        this.INDUSTRYSPECIFICDATA = INDUSTRYSPECIFICDATA;
    }


    /**
     * Gets the INSTALLMENT_SEQUENCENUM value for this TRANSACTION.
     * 
     * @return INSTALLMENT_SEQUENCENUM
     */
    public short getINSTALLMENT_SEQUENCENUM() {
        return INSTALLMENT_SEQUENCENUM;
    }


    /**
     * Sets the INSTALLMENT_SEQUENCENUM value for this TRANSACTION.
     * 
     * @param INSTALLMENT_SEQUENCENUM
     */
    public void setINSTALLMENT_SEQUENCENUM(short INSTALLMENT_SEQUENCENUM) {
        this.INSTALLMENT_SEQUENCENUM = INSTALLMENT_SEQUENCENUM;
    }


    /**
     * Gets the INVOICEDESC value for this TRANSACTION.
     * 
     * @return INVOICEDESC
     */
    public java.lang.String getINVOICEDESC() {
        return INVOICEDESC;
    }


    /**
     * Sets the INVOICEDESC value for this TRANSACTION.
     * 
     * @param INVOICEDESC
     */
    public void setINVOICEDESC(java.lang.String INVOICEDESC) {
        this.INVOICEDESC = INVOICEDESC;
    }


    /**
     * Gets the INVOICENUM value for this TRANSACTION.
     * 
     * @return INVOICENUM
     */
    public java.lang.String getINVOICENUM() {
        return INVOICENUM;
    }


    /**
     * Sets the INVOICENUM value for this TRANSACTION.
     * 
     * @param INVOICENUM
     */
    public void setINVOICENUM(java.lang.String INVOICENUM) {
        this.INVOICENUM = INVOICENUM;
    }


    /**
     * Gets the LEVEL2 value for this TRANSACTION.
     * 
     * @return LEVEL2
     */
    public com.securenet.gateway.API.Contracts.LEVEL2 getLEVEL2() {
        return LEVEL2;
    }


    /**
     * Sets the LEVEL2 value for this TRANSACTION.
     * 
     * @param LEVEL2
     */
    public void setLEVEL2(com.securenet.gateway.API.Contracts.LEVEL2 LEVEL2) {
        this.LEVEL2 = LEVEL2;
    }


    /**
     * Gets the LEVEL3 value for this TRANSACTION.
     * 
     * @return LEVEL3
     */
    public com.securenet.gateway.API.Contracts.LEVEL3 getLEVEL3() {
        return LEVEL3;
    }


    /**
     * Sets the LEVEL3 value for this TRANSACTION.
     * 
     * @param LEVEL3
     */
    public void setLEVEL3(com.securenet.gateway.API.Contracts.LEVEL3 LEVEL3) {
        this.LEVEL3 = LEVEL3;
    }


    /**
     * Gets the MARKETSPECIFICDATA value for this TRANSACTION.
     * 
     * @return MARKETSPECIFICDATA
     */
    public java.lang.String getMARKETSPECIFICDATA() {
        return MARKETSPECIFICDATA;
    }


    /**
     * Sets the MARKETSPECIFICDATA value for this TRANSACTION.
     * 
     * @param MARKETSPECIFICDATA
     */
    public void setMARKETSPECIFICDATA(java.lang.String MARKETSPECIFICDATA) {
        this.MARKETSPECIFICDATA = MARKETSPECIFICDATA;
    }


    /**
     * Gets the MERCHANT_KEY value for this TRANSACTION.
     * 
     * @return MERCHANT_KEY
     */
    public com.securenet.gateway.API.Contracts.MERCHANT_KEY getMERCHANT_KEY() {
        return MERCHANT_KEY;
    }


    /**
     * Sets the MERCHANT_KEY value for this TRANSACTION.
     * 
     * @param MERCHANT_KEY
     */
    public void setMERCHANT_KEY(com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY) {
        this.MERCHANT_KEY = MERCHANT_KEY;
    }


    /**
     * Gets the METHOD value for this TRANSACTION.
     * 
     * @return METHOD
     */
    public java.lang.String getMETHOD() {
        return METHOD;
    }


    /**
     * Sets the METHOD value for this TRANSACTION.
     * 
     * @param METHOD
     */
    public void setMETHOD(java.lang.String METHOD) {
        this.METHOD = METHOD;
    }


    /**
     * Gets the MPI value for this TRANSACTION.
     * 
     * @return MPI
     */
    public com.securenet.gateway.API.Contracts.MPI getMPI() {
        return MPI;
    }


    /**
     * Sets the MPI value for this TRANSACTION.
     * 
     * @param MPI
     */
    public void setMPI(com.securenet.gateway.API.Contracts.MPI MPI) {
        this.MPI = MPI;
    }


    /**
     * Gets the NOTE value for this TRANSACTION.
     * 
     * @return NOTE
     */
    public java.lang.String getNOTE() {
        return NOTE;
    }


    /**
     * Sets the NOTE value for this TRANSACTION.
     * 
     * @param NOTE
     */
    public void setNOTE(java.lang.String NOTE) {
        this.NOTE = NOTE;
    }


    /**
     * Gets the ORDERID value for this TRANSACTION.
     * 
     * @return ORDERID
     */
    public java.lang.String getORDERID() {
        return ORDERID;
    }


    /**
     * Sets the ORDERID value for this TRANSACTION.
     * 
     * @param ORDERID
     */
    public void setORDERID(java.lang.String ORDERID) {
        this.ORDERID = ORDERID;
    }


    /**
     * Gets the OVERRIDE_FROM value for this TRANSACTION.
     * 
     * @return OVERRIDE_FROM
     */
    public int getOVERRIDE_FROM() {
        return OVERRIDE_FROM;
    }


    /**
     * Sets the OVERRIDE_FROM value for this TRANSACTION.
     * 
     * @param OVERRIDE_FROM
     */
    public void setOVERRIDE_FROM(int OVERRIDE_FROM) {
        this.OVERRIDE_FROM = OVERRIDE_FROM;
    }


    /**
     * Gets the PAYMENTID value for this TRANSACTION.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this TRANSACTION.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the PETROLEUM value for this TRANSACTION.
     * 
     * @return PETROLEUM
     */
    public com.securenet.gateway.API.Contracts.PETROLEUM getPETROLEUM() {
        return PETROLEUM;
    }


    /**
     * Sets the PETROLEUM value for this TRANSACTION.
     * 
     * @param PETROLEUM
     */
    public void setPETROLEUM(com.securenet.gateway.API.Contracts.PETROLEUM PETROLEUM) {
        this.PETROLEUM = PETROLEUM;
    }


    /**
     * Gets the PRODUCTS value for this TRANSACTION.
     * 
     * @return PRODUCTS
     */
    public com.securenet.gateway.API.Contracts.PRODUCT[] getPRODUCTS() {
        return PRODUCTS;
    }


    /**
     * Sets the PRODUCTS value for this TRANSACTION.
     * 
     * @param PRODUCTS
     */
    public void setPRODUCTS(com.securenet.gateway.API.Contracts.PRODUCT[] PRODUCTS) {
        this.PRODUCTS = PRODUCTS;
    }


    /**
     * Gets the REF_TRANSID value for this TRANSACTION.
     * 
     * @return REF_TRANSID
     */
    public java.lang.String getREF_TRANSID() {
        return REF_TRANSID;
    }


    /**
     * Sets the REF_TRANSID value for this TRANSACTION.
     * 
     * @param REF_TRANSID
     */
    public void setREF_TRANSID(java.lang.String REF_TRANSID) {
        this.REF_TRANSID = REF_TRANSID;
    }


    /**
     * Gets the RETAIL_LANENUM value for this TRANSACTION.
     * 
     * @return RETAIL_LANENUM
     */
    public int getRETAIL_LANENUM() {
        return RETAIL_LANENUM;
    }


    /**
     * Sets the RETAIL_LANENUM value for this TRANSACTION.
     * 
     * @param RETAIL_LANENUM
     */
    public void setRETAIL_LANENUM(int RETAIL_LANENUM) {
        this.RETAIL_LANENUM = RETAIL_LANENUM;
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
     * Gets the SECONDARY_MERCHANT_KEY value for this TRANSACTION.
     * 
     * @return SECONDARY_MERCHANT_KEY
     */
    public com.securenet.gateway.API.Contracts.MERCHANT_KEY getSECONDARY_MERCHANT_KEY() {
        return SECONDARY_MERCHANT_KEY;
    }


    /**
     * Sets the SECONDARY_MERCHANT_KEY value for this TRANSACTION.
     * 
     * @param SECONDARY_MERCHANT_KEY
     */
    public void setSECONDARY_MERCHANT_KEY(com.securenet.gateway.API.Contracts.MERCHANT_KEY SECONDARY_MERCHANT_KEY) {
        this.SECONDARY_MERCHANT_KEY = SECONDARY_MERCHANT_KEY;
    }


    /**
     * Gets the SERVICE value for this TRANSACTION.
     * 
     * @return SERVICE
     */
    public com.securenet.gateway.API.Contracts.SERVICE getSERVICE() {
        return SERVICE;
    }


    /**
     * Sets the SERVICE value for this TRANSACTION.
     * 
     * @param SERVICE
     */
    public void setSERVICE(com.securenet.gateway.API.Contracts.SERVICE SERVICE) {
        this.SERVICE = SERVICE;
    }


    /**
     * Gets the SOFTDESCRIPTOR value for this TRANSACTION.
     * 
     * @return SOFTDESCRIPTOR
     */
    public java.lang.String getSOFTDESCRIPTOR() {
        return SOFTDESCRIPTOR;
    }


    /**
     * Sets the SOFTDESCRIPTOR value for this TRANSACTION.
     * 
     * @param SOFTDESCRIPTOR
     */
    public void setSOFTDESCRIPTOR(java.lang.String SOFTDESCRIPTOR) {
        this.SOFTDESCRIPTOR = SOFTDESCRIPTOR;
    }


    /**
     * Gets the TEST value for this TRANSACTION.
     * 
     * @return TEST
     */
    public java.lang.String getTEST() {
        return TEST;
    }


    /**
     * Sets the TEST value for this TRANSACTION.
     * 
     * @param TEST
     */
    public void setTEST(java.lang.String TEST) {
        this.TEST = TEST;
    }


    /**
     * Gets the TOTAL_INSTALLMENTCOUNT value for this TRANSACTION.
     * 
     * @return TOTAL_INSTALLMENTCOUNT
     */
    public short getTOTAL_INSTALLMENTCOUNT() {
        return TOTAL_INSTALLMENTCOUNT;
    }


    /**
     * Sets the TOTAL_INSTALLMENTCOUNT value for this TRANSACTION.
     * 
     * @param TOTAL_INSTALLMENTCOUNT
     */
    public void setTOTAL_INSTALLMENTCOUNT(short TOTAL_INSTALLMENTCOUNT) {
        this.TOTAL_INSTALLMENTCOUNT = TOTAL_INSTALLMENTCOUNT;
    }


    /**
     * Gets the TRANSACTION_SERVICE value for this TRANSACTION.
     * 
     * @return TRANSACTION_SERVICE
     */
    public int getTRANSACTION_SERVICE() {
        return TRANSACTION_SERVICE;
    }


    /**
     * Sets the TRANSACTION_SERVICE value for this TRANSACTION.
     * 
     * @param TRANSACTION_SERVICE
     */
    public void setTRANSACTION_SERVICE(int TRANSACTION_SERVICE) {
        this.TRANSACTION_SERVICE = TRANSACTION_SERVICE;
    }


    /**
     * Gets the USERDEFINED value for this TRANSACTION.
     * 
     * @return USERDEFINED
     */
    public com.securenet.gateway.API.Contracts.USERDEFINED getUSERDEFINED() {
        return USERDEFINED;
    }


    /**
     * Sets the USERDEFINED value for this TRANSACTION.
     * 
     * @param USERDEFINED
     */
    public void setUSERDEFINED(com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED) {
        this.USERDEFINED = USERDEFINED;
    }


    /**
     * Gets the DEVELOPERID value for this TRANSACTION.
     * 
     * @return DEVELOPERID
     */
    public java.lang.String getDEVELOPERID() {
        return DEVELOPERID;
    }


    /**
     * Sets the DEVELOPERID value for this TRANSACTION.
     * 
     * @param DEVELOPERID
     */
    public void setDEVELOPERID(java.lang.String DEVELOPERID) {
        this.DEVELOPERID = DEVELOPERID;
    }


    /**
     * Gets the TERMINAL value for this TRANSACTION.
     * 
     * @return TERMINAL
     */
    public com.securenet.gateway.API.Contracts.TERMINAL getTERMINAL() {
        return TERMINAL;
    }


    /**
     * Sets the TERMINAL value for this TRANSACTION.
     * 
     * @param TERMINAL
     */
    public void setTERMINAL(com.securenet.gateway.API.Contracts.TERMINAL TERMINAL) {
        this.TERMINAL = TERMINAL;
    }


    /**
     * Gets the VERSION value for this TRANSACTION.
     * 
     * @return VERSION
     */
    public java.lang.String getVERSION() {
        return VERSION;
    }


    /**
     * Sets the VERSION value for this TRANSACTION.
     * 
     * @param VERSION
     */
    public void setVERSION(java.lang.String VERSION) {
        this.VERSION = VERSION;
    }


    /**
     * Gets the HEALTHCARE value for this TRANSACTION.
     * 
     * @return HEALTHCARE
     */
    public com.securenet.gateway.API.Contracts.HEALTHCARE getHEALTHCARE() {
        return HEALTHCARE;
    }


    /**
     * Sets the HEALTHCARE value for this TRANSACTION.
     * 
     * @param HEALTHCARE
     */
    public void setHEALTHCARE(com.securenet.gateway.API.Contracts.HEALTHCARE HEALTHCARE) {
        this.HEALTHCARE = HEALTHCARE;
    }


    /**
     * Gets the IMAGE value for this TRANSACTION.
     * 
     * @return IMAGE
     */
    public com.securenet.gateway.API.Contracts.IMAGE getIMAGE() {
        return IMAGE;
    }


    /**
     * Sets the IMAGE value for this TRANSACTION.
     * 
     * @param IMAGE
     */
    public void setIMAGE(com.securenet.gateway.API.Contracts.IMAGE IMAGE) {
        this.IMAGE = IMAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRANSACTION)) return false;
        TRANSACTION other = (TRANSACTION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AMOUNT==null && other.getAMOUNT()==null) || 
             (this.AMOUNT!=null &&
              this.AMOUNT.equals(other.getAMOUNT()))) &&
            ((this.AUTHCODE==null && other.getAUTHCODE()==null) || 
             (this.AUTHCODE!=null &&
              this.AUTHCODE.equals(other.getAUTHCODE()))) &&
            ((this.AUTO==null && other.getAUTO()==null) || 
             (this.AUTO!=null &&
              this.AUTO.equals(other.getAUTO()))) &&
            ((this.CARD==null && other.getCARD()==null) || 
             (this.CARD!=null &&
              this.CARD.equals(other.getCARD()))) &&
            ((this.CASHBACK_AMOUNT==null && other.getCASHBACK_AMOUNT()==null) || 
             (this.CASHBACK_AMOUNT!=null &&
              this.CASHBACK_AMOUNT.equals(other.getCASHBACK_AMOUNT()))) &&
            ((this.CHECK==null && other.getCHECK()==null) || 
             (this.CHECK!=null &&
              this.CHECK.equals(other.getCHECK()))) &&
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE()))) &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.CUSTOMERIP==null && other.getCUSTOMERIP()==null) || 
             (this.CUSTOMERIP!=null &&
              this.CUSTOMERIP.equals(other.getCUSTOMERIP()))) &&
            ((this.CUSTOMER_BILL==null && other.getCUSTOMER_BILL()==null) || 
             (this.CUSTOMER_BILL!=null &&
              this.CUSTOMER_BILL.equals(other.getCUSTOMER_BILL()))) &&
            ((this.CUSTOMER_SHIP==null && other.getCUSTOMER_SHIP()==null) || 
             (this.CUSTOMER_SHIP!=null &&
              this.CUSTOMER_SHIP.equals(other.getCUSTOMER_SHIP()))) &&
            this.DCI == other.getDCI() &&
            ((this.DEVICECODE==null && other.getDEVICECODE()==null) || 
             (this.DEVICECODE!=null &&
              this.DEVICECODE.equals(other.getDEVICECODE()))) &&
            ((this.ENCRYPTION==null && other.getENCRYPTION()==null) || 
             (this.ENCRYPTION!=null &&
              this.ENCRYPTION.equals(other.getENCRYPTION()))) &&
            ((this.ENTRYSOURCE==null && other.getENTRYSOURCE()==null) || 
             (this.ENTRYSOURCE!=null &&
              this.ENTRYSOURCE.equals(other.getENTRYSOURCE()))) &&
            ((this.HOTEL==null && other.getHOTEL()==null) || 
             (this.HOTEL!=null &&
              this.HOTEL.equals(other.getHOTEL()))) &&
            ((this.INDUSTRYSPECIFICDATA==null && other.getINDUSTRYSPECIFICDATA()==null) || 
             (this.INDUSTRYSPECIFICDATA!=null &&
              this.INDUSTRYSPECIFICDATA.equals(other.getINDUSTRYSPECIFICDATA()))) &&
            this.INSTALLMENT_SEQUENCENUM == other.getINSTALLMENT_SEQUENCENUM() &&
            ((this.INVOICEDESC==null && other.getINVOICEDESC()==null) || 
             (this.INVOICEDESC!=null &&
              this.INVOICEDESC.equals(other.getINVOICEDESC()))) &&
            ((this.INVOICENUM==null && other.getINVOICENUM()==null) || 
             (this.INVOICENUM!=null &&
              this.INVOICENUM.equals(other.getINVOICENUM()))) &&
            ((this.LEVEL2==null && other.getLEVEL2()==null) || 
             (this.LEVEL2!=null &&
              this.LEVEL2.equals(other.getLEVEL2()))) &&
            ((this.LEVEL3==null && other.getLEVEL3()==null) || 
             (this.LEVEL3!=null &&
              this.LEVEL3.equals(other.getLEVEL3()))) &&
            ((this.MARKETSPECIFICDATA==null && other.getMARKETSPECIFICDATA()==null) || 
             (this.MARKETSPECIFICDATA!=null &&
              this.MARKETSPECIFICDATA.equals(other.getMARKETSPECIFICDATA()))) &&
            ((this.MERCHANT_KEY==null && other.getMERCHANT_KEY()==null) || 
             (this.MERCHANT_KEY!=null &&
              this.MERCHANT_KEY.equals(other.getMERCHANT_KEY()))) &&
            ((this.METHOD==null && other.getMETHOD()==null) || 
             (this.METHOD!=null &&
              this.METHOD.equals(other.getMETHOD()))) &&
            ((this.MPI==null && other.getMPI()==null) || 
             (this.MPI!=null &&
              this.MPI.equals(other.getMPI()))) &&
            ((this.NOTE==null && other.getNOTE()==null) || 
             (this.NOTE!=null &&
              this.NOTE.equals(other.getNOTE()))) &&
            ((this.ORDERID==null && other.getORDERID()==null) || 
             (this.ORDERID!=null &&
              this.ORDERID.equals(other.getORDERID()))) &&
            this.OVERRIDE_FROM == other.getOVERRIDE_FROM() &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.PETROLEUM==null && other.getPETROLEUM()==null) || 
             (this.PETROLEUM!=null &&
              this.PETROLEUM.equals(other.getPETROLEUM()))) &&
            ((this.PRODUCTS==null && other.getPRODUCTS()==null) || 
             (this.PRODUCTS!=null &&
              java.util.Arrays.equals(this.PRODUCTS, other.getPRODUCTS()))) &&
            ((this.REF_TRANSID==null && other.getREF_TRANSID()==null) || 
             (this.REF_TRANSID!=null &&
              this.REF_TRANSID.equals(other.getREF_TRANSID()))) &&
            this.RETAIL_LANENUM == other.getRETAIL_LANENUM() &&
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
            ((this.SECONDARY_MERCHANT_KEY==null && other.getSECONDARY_MERCHANT_KEY()==null) || 
             (this.SECONDARY_MERCHANT_KEY!=null &&
              this.SECONDARY_MERCHANT_KEY.equals(other.getSECONDARY_MERCHANT_KEY()))) &&
            ((this.SERVICE==null && other.getSERVICE()==null) || 
             (this.SERVICE!=null &&
              this.SERVICE.equals(other.getSERVICE()))) &&
            ((this.SOFTDESCRIPTOR==null && other.getSOFTDESCRIPTOR()==null) || 
             (this.SOFTDESCRIPTOR!=null &&
              this.SOFTDESCRIPTOR.equals(other.getSOFTDESCRIPTOR()))) &&
            ((this.TEST==null && other.getTEST()==null) || 
             (this.TEST!=null &&
              this.TEST.equals(other.getTEST()))) &&
            this.TOTAL_INSTALLMENTCOUNT == other.getTOTAL_INSTALLMENTCOUNT() &&
            this.TRANSACTION_SERVICE == other.getTRANSACTION_SERVICE() &&
            ((this.USERDEFINED==null && other.getUSERDEFINED()==null) || 
             (this.USERDEFINED!=null &&
              this.USERDEFINED.equals(other.getUSERDEFINED()))) &&
            ((this.DEVELOPERID==null && other.getDEVELOPERID()==null) || 
             (this.DEVELOPERID!=null &&
              this.DEVELOPERID.equals(other.getDEVELOPERID()))) &&
            ((this.TERMINAL==null && other.getTERMINAL()==null) || 
             (this.TERMINAL!=null &&
              this.TERMINAL.equals(other.getTERMINAL()))) &&
            ((this.VERSION==null && other.getVERSION()==null) || 
             (this.VERSION!=null &&
              this.VERSION.equals(other.getVERSION()))) &&
            ((this.HEALTHCARE==null && other.getHEALTHCARE()==null) || 
             (this.HEALTHCARE!=null &&
              this.HEALTHCARE.equals(other.getHEALTHCARE()))) &&
            ((this.IMAGE==null && other.getIMAGE()==null) || 
             (this.IMAGE!=null &&
              this.IMAGE.equals(other.getIMAGE())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAMOUNT() != null) {
            _hashCode += getAMOUNT().hashCode();
        }
        if (getAUTHCODE() != null) {
            _hashCode += getAUTHCODE().hashCode();
        }
        if (getAUTO() != null) {
            _hashCode += getAUTO().hashCode();
        }
        if (getCARD() != null) {
            _hashCode += getCARD().hashCode();
        }
        if (getCASHBACK_AMOUNT() != null) {
            _hashCode += getCASHBACK_AMOUNT().hashCode();
        }
        if (getCHECK() != null) {
            _hashCode += getCHECK().hashCode();
        }
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getCUSTOMERIP() != null) {
            _hashCode += getCUSTOMERIP().hashCode();
        }
        if (getCUSTOMER_BILL() != null) {
            _hashCode += getCUSTOMER_BILL().hashCode();
        }
        if (getCUSTOMER_SHIP() != null) {
            _hashCode += getCUSTOMER_SHIP().hashCode();
        }
        _hashCode += getDCI();
        if (getDEVICECODE() != null) {
            _hashCode += getDEVICECODE().hashCode();
        }
        if (getENCRYPTION() != null) {
            _hashCode += getENCRYPTION().hashCode();
        }
        if (getENTRYSOURCE() != null) {
            _hashCode += getENTRYSOURCE().hashCode();
        }
        if (getHOTEL() != null) {
            _hashCode += getHOTEL().hashCode();
        }
        if (getINDUSTRYSPECIFICDATA() != null) {
            _hashCode += getINDUSTRYSPECIFICDATA().hashCode();
        }
        _hashCode += getINSTALLMENT_SEQUENCENUM();
        if (getINVOICEDESC() != null) {
            _hashCode += getINVOICEDESC().hashCode();
        }
        if (getINVOICENUM() != null) {
            _hashCode += getINVOICENUM().hashCode();
        }
        if (getLEVEL2() != null) {
            _hashCode += getLEVEL2().hashCode();
        }
        if (getLEVEL3() != null) {
            _hashCode += getLEVEL3().hashCode();
        }
        if (getMARKETSPECIFICDATA() != null) {
            _hashCode += getMARKETSPECIFICDATA().hashCode();
        }
        if (getMERCHANT_KEY() != null) {
            _hashCode += getMERCHANT_KEY().hashCode();
        }
        if (getMETHOD() != null) {
            _hashCode += getMETHOD().hashCode();
        }
        if (getMPI() != null) {
            _hashCode += getMPI().hashCode();
        }
        if (getNOTE() != null) {
            _hashCode += getNOTE().hashCode();
        }
        if (getORDERID() != null) {
            _hashCode += getORDERID().hashCode();
        }
        _hashCode += getOVERRIDE_FROM();
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getPETROLEUM() != null) {
            _hashCode += getPETROLEUM().hashCode();
        }
        if (getPRODUCTS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRODUCTS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRODUCTS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREF_TRANSID() != null) {
            _hashCode += getREF_TRANSID().hashCode();
        }
        _hashCode += getRETAIL_LANENUM();
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
        if (getSECONDARY_MERCHANT_KEY() != null) {
            _hashCode += getSECONDARY_MERCHANT_KEY().hashCode();
        }
        if (getSERVICE() != null) {
            _hashCode += getSERVICE().hashCode();
        }
        if (getSOFTDESCRIPTOR() != null) {
            _hashCode += getSOFTDESCRIPTOR().hashCode();
        }
        if (getTEST() != null) {
            _hashCode += getTEST().hashCode();
        }
        _hashCode += getTOTAL_INSTALLMENTCOUNT();
        _hashCode += getTRANSACTION_SERVICE();
        if (getUSERDEFINED() != null) {
            _hashCode += getUSERDEFINED().hashCode();
        }
        if (getDEVELOPERID() != null) {
            _hashCode += getDEVELOPERID().hashCode();
        }
        if (getTERMINAL() != null) {
            _hashCode += getTERMINAL().hashCode();
        }
        if (getVERSION() != null) {
            _hashCode += getVERSION().hashCode();
        }
        if (getHEALTHCARE() != null) {
            _hashCode += getHEALTHCARE().hashCode();
        }
        if (getIMAGE() != null) {
            _hashCode += getIMAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRANSACTION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTHCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTHCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD"));
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
        elemField.setFieldName("CHECK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECK"));
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
        elemField.setFieldName("CUSTOMERIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMERIP"));
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
        elemField.setFieldName("CUSTOMER_SHIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_SHIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_SHIP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DCI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DCI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEVICECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DEVICECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENCRYPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENCRYPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENCRYPTION"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENTRYSOURCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENTRYSOURCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOTEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HOTEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HOTEL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDUSTRYSPECIFICDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INDUSTRYSPECIFICDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSTALLMENT_SEQUENCENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENT_SEQUENCENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVOICEDESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INVOICEDESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INVOICENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INVOICENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEVEL2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEVEL3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3"));
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
        elemField.setFieldName("MERCHANT_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
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
        elemField.setFieldName("MPI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MPI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MPI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NOTE"));
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
        elemField.setFieldName("OVERRIDE_FROM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OVERRIDE_FROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PETROLEUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PETROLEUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PETROLEUM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRODUCTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REF_TRANSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "REF_TRANSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETAIL_LANENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RETAIL_LANENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("SECONDARY_MERCHANT_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECONDARY_MERCHANT_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERVICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SERVICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SERVICE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOFTDESCRIPTOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SOFTDESCRIPTOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TEST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOTAL_INSTALLMENTCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TOTAL_INSTALLMENTCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTION_SERVICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_SERVICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USERDEFINED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "USERDEFINED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "USERDEFINED"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEVELOPERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DEVELOPERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINAL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VERSION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HEALTHCARE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HEALTHCARE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HEALTHCARE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "IMAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "IMAGE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
