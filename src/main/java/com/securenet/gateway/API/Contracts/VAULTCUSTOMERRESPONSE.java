/**
 * VAULTCUSTOMERRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class VAULTCUSTOMERRESPONSE  extends com.securenet.gateway.API.Contracts.RESPONSE  implements java.io.Serializable {
    private java.lang.String COMPANY;

    private java.lang.String CUSTOMERID;

    private java.lang.String FIRSTNAME;

    private java.lang.String LASTNAME;

    private java.lang.String TRANSACTIONDATETIME;

    public VAULTCUSTOMERRESPONSE() {
    }

    public VAULTCUSTOMERRESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE,
           java.lang.String COMPANY,
           java.lang.String CUSTOMERID,
           java.lang.String FIRSTNAME,
           java.lang.String LASTNAME,
           java.lang.String TRANSACTIONDATETIME) {
        super(
            RESPONSE_CODE,
            RESPONSE_REASON_CODE,
            RESPONSE_REASON_TEXT,
            RESPONSE_SUBCODE);
        this.COMPANY = COMPANY;
        this.CUSTOMERID = CUSTOMERID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.TRANSACTIONDATETIME = TRANSACTIONDATETIME;
    }


    /**
     * Gets the COMPANY value for this VAULTCUSTOMERRESPONSE.
     * 
     * @return COMPANY
     */
    public java.lang.String getCOMPANY() {
        return COMPANY;
    }


    /**
     * Sets the COMPANY value for this VAULTCUSTOMERRESPONSE.
     * 
     * @param COMPANY
     */
    public void setCOMPANY(java.lang.String COMPANY) {
        this.COMPANY = COMPANY;
    }


    /**
     * Gets the CUSTOMERID value for this VAULTCUSTOMERRESPONSE.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this VAULTCUSTOMERRESPONSE.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the FIRSTNAME value for this VAULTCUSTOMERRESPONSE.
     * 
     * @return FIRSTNAME
     */
    public java.lang.String getFIRSTNAME() {
        return FIRSTNAME;
    }


    /**
     * Sets the FIRSTNAME value for this VAULTCUSTOMERRESPONSE.
     * 
     * @param FIRSTNAME
     */
    public void setFIRSTNAME(java.lang.String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }


    /**
     * Gets the LASTNAME value for this VAULTCUSTOMERRESPONSE.
     * 
     * @return LASTNAME
     */
    public java.lang.String getLASTNAME() {
        return LASTNAME;
    }


    /**
     * Sets the LASTNAME value for this VAULTCUSTOMERRESPONSE.
     * 
     * @param LASTNAME
     */
    public void setLASTNAME(java.lang.String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }


    /**
     * Gets the TRANSACTIONDATETIME value for this VAULTCUSTOMERRESPONSE.
     * 
     * @return TRANSACTIONDATETIME
     */
    public java.lang.String getTRANSACTIONDATETIME() {
        return TRANSACTIONDATETIME;
    }


    /**
     * Sets the TRANSACTIONDATETIME value for this VAULTCUSTOMERRESPONSE.
     * 
     * @param TRANSACTIONDATETIME
     */
    public void setTRANSACTIONDATETIME(java.lang.String TRANSACTIONDATETIME) {
        this.TRANSACTIONDATETIME = TRANSACTIONDATETIME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAULTCUSTOMERRESPONSE)) return false;
        VAULTCUSTOMERRESPONSE other = (VAULTCUSTOMERRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.COMPANY==null && other.getCOMPANY()==null) || 
             (this.COMPANY!=null &&
              this.COMPANY.equals(other.getCOMPANY()))) &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.FIRSTNAME==null && other.getFIRSTNAME()==null) || 
             (this.FIRSTNAME!=null &&
              this.FIRSTNAME.equals(other.getFIRSTNAME()))) &&
            ((this.LASTNAME==null && other.getLASTNAME()==null) || 
             (this.LASTNAME!=null &&
              this.LASTNAME.equals(other.getLASTNAME()))) &&
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
        if (getCOMPANY() != null) {
            _hashCode += getCOMPANY().hashCode();
        }
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getFIRSTNAME() != null) {
            _hashCode += getFIRSTNAME().hashCode();
        }
        if (getLASTNAME() != null) {
            _hashCode += getLASTNAME().hashCode();
        }
        if (getTRANSACTIONDATETIME() != null) {
            _hashCode += getTRANSACTIONDATETIME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAULTCUSTOMERRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTCUSTOMERRESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("LASTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LASTNAME"));
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
