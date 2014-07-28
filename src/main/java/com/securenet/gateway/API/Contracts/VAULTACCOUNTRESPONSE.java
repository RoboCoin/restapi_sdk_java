/**
 * VAULTACCOUNTRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class VAULTACCOUNTRESPONSE  extends com.securenet.gateway.API.Contracts.RESPONSE  implements java.io.Serializable {
    private java.lang.String ACCOUNTTYPE;

    private java.lang.String ADDITIONALDATA1;

    private java.lang.String ADDITIONALDATA2;

    private java.lang.String CARDTYPE;

    private java.lang.String COMPANY;

    private java.lang.String CUSTOMERID;

    private java.lang.String FIRSTNAME;

    private java.lang.String LAST4DIGITS;

    private java.lang.String LASTNAME;

    private java.lang.String METHOD;

    private java.lang.String PAYMENTID;

    private java.lang.String TRANSACTIONDATETIME;

    public VAULTACCOUNTRESPONSE() {
    }

    public VAULTACCOUNTRESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE,
           java.lang.String ACCOUNTTYPE,
           java.lang.String ADDITIONALDATA1,
           java.lang.String ADDITIONALDATA2,
           java.lang.String CARDTYPE,
           java.lang.String COMPANY,
           java.lang.String CUSTOMERID,
           java.lang.String FIRSTNAME,
           java.lang.String LAST4DIGITS,
           java.lang.String LASTNAME,
           java.lang.String METHOD,
           java.lang.String PAYMENTID,
           java.lang.String TRANSACTIONDATETIME) {
        super(
            RESPONSE_CODE,
            RESPONSE_REASON_CODE,
            RESPONSE_REASON_TEXT,
            RESPONSE_SUBCODE);
        this.ACCOUNTTYPE = ACCOUNTTYPE;
        this.ADDITIONALDATA1 = ADDITIONALDATA1;
        this.ADDITIONALDATA2 = ADDITIONALDATA2;
        this.CARDTYPE = CARDTYPE;
        this.COMPANY = COMPANY;
        this.CUSTOMERID = CUSTOMERID;
        this.FIRSTNAME = FIRSTNAME;
        this.LAST4DIGITS = LAST4DIGITS;
        this.LASTNAME = LASTNAME;
        this.METHOD = METHOD;
        this.PAYMENTID = PAYMENTID;
        this.TRANSACTIONDATETIME = TRANSACTIONDATETIME;
    }


    /**
     * Gets the ACCOUNTTYPE value for this VAULTACCOUNTRESPONSE.
     * 
     * @return ACCOUNTTYPE
     */
    public java.lang.String getACCOUNTTYPE() {
        return ACCOUNTTYPE;
    }


    /**
     * Sets the ACCOUNTTYPE value for this VAULTACCOUNTRESPONSE.
     * 
     * @param ACCOUNTTYPE
     */
    public void setACCOUNTTYPE(java.lang.String ACCOUNTTYPE) {
        this.ACCOUNTTYPE = ACCOUNTTYPE;
    }


    /**
     * Gets the ADDITIONALDATA1 value for this VAULTACCOUNTRESPONSE.
     * 
     * @return ADDITIONALDATA1
     */
    public java.lang.String getADDITIONALDATA1() {
        return ADDITIONALDATA1;
    }


    /**
     * Sets the ADDITIONALDATA1 value for this VAULTACCOUNTRESPONSE.
     * 
     * @param ADDITIONALDATA1
     */
    public void setADDITIONALDATA1(java.lang.String ADDITIONALDATA1) {
        this.ADDITIONALDATA1 = ADDITIONALDATA1;
    }


    /**
     * Gets the ADDITIONALDATA2 value for this VAULTACCOUNTRESPONSE.
     * 
     * @return ADDITIONALDATA2
     */
    public java.lang.String getADDITIONALDATA2() {
        return ADDITIONALDATA2;
    }


    /**
     * Sets the ADDITIONALDATA2 value for this VAULTACCOUNTRESPONSE.
     * 
     * @param ADDITIONALDATA2
     */
    public void setADDITIONALDATA2(java.lang.String ADDITIONALDATA2) {
        this.ADDITIONALDATA2 = ADDITIONALDATA2;
    }


    /**
     * Gets the CARDTYPE value for this VAULTACCOUNTRESPONSE.
     * 
     * @return CARDTYPE
     */
    public java.lang.String getCARDTYPE() {
        return CARDTYPE;
    }


    /**
     * Sets the CARDTYPE value for this VAULTACCOUNTRESPONSE.
     * 
     * @param CARDTYPE
     */
    public void setCARDTYPE(java.lang.String CARDTYPE) {
        this.CARDTYPE = CARDTYPE;
    }


    /**
     * Gets the COMPANY value for this VAULTACCOUNTRESPONSE.
     * 
     * @return COMPANY
     */
    public java.lang.String getCOMPANY() {
        return COMPANY;
    }


    /**
     * Sets the COMPANY value for this VAULTACCOUNTRESPONSE.
     * 
     * @param COMPANY
     */
    public void setCOMPANY(java.lang.String COMPANY) {
        this.COMPANY = COMPANY;
    }


    /**
     * Gets the CUSTOMERID value for this VAULTACCOUNTRESPONSE.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this VAULTACCOUNTRESPONSE.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the FIRSTNAME value for this VAULTACCOUNTRESPONSE.
     * 
     * @return FIRSTNAME
     */
    public java.lang.String getFIRSTNAME() {
        return FIRSTNAME;
    }


    /**
     * Sets the FIRSTNAME value for this VAULTACCOUNTRESPONSE.
     * 
     * @param FIRSTNAME
     */
    public void setFIRSTNAME(java.lang.String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }


    /**
     * Gets the LAST4DIGITS value for this VAULTACCOUNTRESPONSE.
     * 
     * @return LAST4DIGITS
     */
    public java.lang.String getLAST4DIGITS() {
        return LAST4DIGITS;
    }


    /**
     * Sets the LAST4DIGITS value for this VAULTACCOUNTRESPONSE.
     * 
     * @param LAST4DIGITS
     */
    public void setLAST4DIGITS(java.lang.String LAST4DIGITS) {
        this.LAST4DIGITS = LAST4DIGITS;
    }


    /**
     * Gets the LASTNAME value for this VAULTACCOUNTRESPONSE.
     * 
     * @return LASTNAME
     */
    public java.lang.String getLASTNAME() {
        return LASTNAME;
    }


    /**
     * Sets the LASTNAME value for this VAULTACCOUNTRESPONSE.
     * 
     * @param LASTNAME
     */
    public void setLASTNAME(java.lang.String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }


    /**
     * Gets the METHOD value for this VAULTACCOUNTRESPONSE.
     * 
     * @return METHOD
     */
    public java.lang.String getMETHOD() {
        return METHOD;
    }


    /**
     * Sets the METHOD value for this VAULTACCOUNTRESPONSE.
     * 
     * @param METHOD
     */
    public void setMETHOD(java.lang.String METHOD) {
        this.METHOD = METHOD;
    }


    /**
     * Gets the PAYMENTID value for this VAULTACCOUNTRESPONSE.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this VAULTACCOUNTRESPONSE.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the TRANSACTIONDATETIME value for this VAULTACCOUNTRESPONSE.
     * 
     * @return TRANSACTIONDATETIME
     */
    public java.lang.String getTRANSACTIONDATETIME() {
        return TRANSACTIONDATETIME;
    }


    /**
     * Sets the TRANSACTIONDATETIME value for this VAULTACCOUNTRESPONSE.
     * 
     * @param TRANSACTIONDATETIME
     */
    public void setTRANSACTIONDATETIME(java.lang.String TRANSACTIONDATETIME) {
        this.TRANSACTIONDATETIME = TRANSACTIONDATETIME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAULTACCOUNTRESPONSE)) return false;
        VAULTACCOUNTRESPONSE other = (VAULTACCOUNTRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ACCOUNTTYPE==null && other.getACCOUNTTYPE()==null) || 
             (this.ACCOUNTTYPE!=null &&
              this.ACCOUNTTYPE.equals(other.getACCOUNTTYPE()))) &&
            ((this.ADDITIONALDATA1==null && other.getADDITIONALDATA1()==null) || 
             (this.ADDITIONALDATA1!=null &&
              this.ADDITIONALDATA1.equals(other.getADDITIONALDATA1()))) &&
            ((this.ADDITIONALDATA2==null && other.getADDITIONALDATA2()==null) || 
             (this.ADDITIONALDATA2!=null &&
              this.ADDITIONALDATA2.equals(other.getADDITIONALDATA2()))) &&
            ((this.CARDTYPE==null && other.getCARDTYPE()==null) || 
             (this.CARDTYPE!=null &&
              this.CARDTYPE.equals(other.getCARDTYPE()))) &&
            ((this.COMPANY==null && other.getCOMPANY()==null) || 
             (this.COMPANY!=null &&
              this.COMPANY.equals(other.getCOMPANY()))) &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.FIRSTNAME==null && other.getFIRSTNAME()==null) || 
             (this.FIRSTNAME!=null &&
              this.FIRSTNAME.equals(other.getFIRSTNAME()))) &&
            ((this.LAST4DIGITS==null && other.getLAST4DIGITS()==null) || 
             (this.LAST4DIGITS!=null &&
              this.LAST4DIGITS.equals(other.getLAST4DIGITS()))) &&
            ((this.LASTNAME==null && other.getLASTNAME()==null) || 
             (this.LASTNAME!=null &&
              this.LASTNAME.equals(other.getLASTNAME()))) &&
            ((this.METHOD==null && other.getMETHOD()==null) || 
             (this.METHOD!=null &&
              this.METHOD.equals(other.getMETHOD()))) &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.TRANSACTIONDATETIME==null && other.getTRANSACTIONDATETIME()==null) || 
             (this.TRANSACTIONDATETIME!=null &&
              this.TRANSACTIONDATETIME.equals(other.getTRANSACTIONDATETIME())));
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
        if (getACCOUNTTYPE() != null) {
            _hashCode += getACCOUNTTYPE().hashCode();
        }
        if (getADDITIONALDATA1() != null) {
            _hashCode += getADDITIONALDATA1().hashCode();
        }
        if (getADDITIONALDATA2() != null) {
            _hashCode += getADDITIONALDATA2().hashCode();
        }
        if (getCARDTYPE() != null) {
            _hashCode += getCARDTYPE().hashCode();
        }
        if (getCOMPANY() != null) {
            _hashCode += getCOMPANY().hashCode();
        }
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getFIRSTNAME() != null) {
            _hashCode += getFIRSTNAME().hashCode();
        }
        if (getLAST4DIGITS() != null) {
            _hashCode += getLAST4DIGITS().hashCode();
        }
        if (getLASTNAME() != null) {
            _hashCode += getLASTNAME().hashCode();
        }
        if (getMETHOD() != null) {
            _hashCode += getMETHOD().hashCode();
        }
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getTRANSACTIONDATETIME() != null) {
            _hashCode += getTRANSACTIONDATETIME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAULTACCOUNTRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTACCOUNTRESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNTTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("CARDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "COMPANY"));
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
        elemField.setFieldName("FIRSTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FIRSTNAME"));
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
        elemField.setFieldName("LASTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LASTNAME"));
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
        elemField.setFieldName("PAYMENTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONDATETIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONDATETIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
