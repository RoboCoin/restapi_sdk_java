/**
 * PAYMENT_AB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class PAYMENT_AB  implements java.io.Serializable {
    private java.math.BigDecimal AMOUNT;

    private java.lang.String INSTALLMENTDATE;

    private java.lang.Integer INSTALLMENTNUM;

    private java.lang.Integer NUMOFRETRIES;

    private java.lang.Integer PAID;

    private java.lang.String PAYMENTDATE;

    private java.lang.String PAYMENTID;

    private java.lang.Integer PLANID;

    private java.lang.Integer PROCESSED;

    private java.lang.Integer SCHEDULEID;

    private java.lang.Integer TRANSACTIONID;

    public PAYMENT_AB() {
    }

    public PAYMENT_AB(
           java.math.BigDecimal AMOUNT,
           java.lang.String INSTALLMENTDATE,
           java.lang.Integer INSTALLMENTNUM,
           java.lang.Integer NUMOFRETRIES,
           java.lang.Integer PAID,
           java.lang.String PAYMENTDATE,
           java.lang.String PAYMENTID,
           java.lang.Integer PLANID,
           java.lang.Integer PROCESSED,
           java.lang.Integer SCHEDULEID,
           java.lang.Integer TRANSACTIONID) {
           this.AMOUNT = AMOUNT;
           this.INSTALLMENTDATE = INSTALLMENTDATE;
           this.INSTALLMENTNUM = INSTALLMENTNUM;
           this.NUMOFRETRIES = NUMOFRETRIES;
           this.PAID = PAID;
           this.PAYMENTDATE = PAYMENTDATE;
           this.PAYMENTID = PAYMENTID;
           this.PLANID = PLANID;
           this.PROCESSED = PROCESSED;
           this.SCHEDULEID = SCHEDULEID;
           this.TRANSACTIONID = TRANSACTIONID;
    }


    /**
     * Gets the AMOUNT value for this PAYMENT_AB.
     * 
     * @return AMOUNT
     */
    public java.math.BigDecimal getAMOUNT() {
        return AMOUNT;
    }


    /**
     * Sets the AMOUNT value for this PAYMENT_AB.
     * 
     * @param AMOUNT
     */
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }


    /**
     * Gets the INSTALLMENTDATE value for this PAYMENT_AB.
     * 
     * @return INSTALLMENTDATE
     */
    public java.lang.String getINSTALLMENTDATE() {
        return INSTALLMENTDATE;
    }


    /**
     * Sets the INSTALLMENTDATE value for this PAYMENT_AB.
     * 
     * @param INSTALLMENTDATE
     */
    public void setINSTALLMENTDATE(java.lang.String INSTALLMENTDATE) {
        this.INSTALLMENTDATE = INSTALLMENTDATE;
    }


    /**
     * Gets the INSTALLMENTNUM value for this PAYMENT_AB.
     * 
     * @return INSTALLMENTNUM
     */
    public java.lang.Integer getINSTALLMENTNUM() {
        return INSTALLMENTNUM;
    }


    /**
     * Sets the INSTALLMENTNUM value for this PAYMENT_AB.
     * 
     * @param INSTALLMENTNUM
     */
    public void setINSTALLMENTNUM(java.lang.Integer INSTALLMENTNUM) {
        this.INSTALLMENTNUM = INSTALLMENTNUM;
    }


    /**
     * Gets the NUMOFRETRIES value for this PAYMENT_AB.
     * 
     * @return NUMOFRETRIES
     */
    public java.lang.Integer getNUMOFRETRIES() {
        return NUMOFRETRIES;
    }


    /**
     * Sets the NUMOFRETRIES value for this PAYMENT_AB.
     * 
     * @param NUMOFRETRIES
     */
    public void setNUMOFRETRIES(java.lang.Integer NUMOFRETRIES) {
        this.NUMOFRETRIES = NUMOFRETRIES;
    }


    /**
     * Gets the PAID value for this PAYMENT_AB.
     * 
     * @return PAID
     */
    public java.lang.Integer getPAID() {
        return PAID;
    }


    /**
     * Sets the PAID value for this PAYMENT_AB.
     * 
     * @param PAID
     */
    public void setPAID(java.lang.Integer PAID) {
        this.PAID = PAID;
    }


    /**
     * Gets the PAYMENTDATE value for this PAYMENT_AB.
     * 
     * @return PAYMENTDATE
     */
    public java.lang.String getPAYMENTDATE() {
        return PAYMENTDATE;
    }


    /**
     * Sets the PAYMENTDATE value for this PAYMENT_AB.
     * 
     * @param PAYMENTDATE
     */
    public void setPAYMENTDATE(java.lang.String PAYMENTDATE) {
        this.PAYMENTDATE = PAYMENTDATE;
    }


    /**
     * Gets the PAYMENTID value for this PAYMENT_AB.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this PAYMENT_AB.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the PLANID value for this PAYMENT_AB.
     * 
     * @return PLANID
     */
    public java.lang.Integer getPLANID() {
        return PLANID;
    }


    /**
     * Sets the PLANID value for this PAYMENT_AB.
     * 
     * @param PLANID
     */
    public void setPLANID(java.lang.Integer PLANID) {
        this.PLANID = PLANID;
    }


    /**
     * Gets the PROCESSED value for this PAYMENT_AB.
     * 
     * @return PROCESSED
     */
    public java.lang.Integer getPROCESSED() {
        return PROCESSED;
    }


    /**
     * Sets the PROCESSED value for this PAYMENT_AB.
     * 
     * @param PROCESSED
     */
    public void setPROCESSED(java.lang.Integer PROCESSED) {
        this.PROCESSED = PROCESSED;
    }


    /**
     * Gets the SCHEDULEID value for this PAYMENT_AB.
     * 
     * @return SCHEDULEID
     */
    public java.lang.Integer getSCHEDULEID() {
        return SCHEDULEID;
    }


    /**
     * Sets the SCHEDULEID value for this PAYMENT_AB.
     * 
     * @param SCHEDULEID
     */
    public void setSCHEDULEID(java.lang.Integer SCHEDULEID) {
        this.SCHEDULEID = SCHEDULEID;
    }


    /**
     * Gets the TRANSACTIONID value for this PAYMENT_AB.
     * 
     * @return TRANSACTIONID
     */
    public java.lang.Integer getTRANSACTIONID() {
        return TRANSACTIONID;
    }


    /**
     * Sets the TRANSACTIONID value for this PAYMENT_AB.
     * 
     * @param TRANSACTIONID
     */
    public void setTRANSACTIONID(java.lang.Integer TRANSACTIONID) {
        this.TRANSACTIONID = TRANSACTIONID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PAYMENT_AB)) return false;
        PAYMENT_AB other = (PAYMENT_AB) obj;
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
            ((this.INSTALLMENTDATE==null && other.getINSTALLMENTDATE()==null) || 
             (this.INSTALLMENTDATE!=null &&
              this.INSTALLMENTDATE.equals(other.getINSTALLMENTDATE()))) &&
            ((this.INSTALLMENTNUM==null && other.getINSTALLMENTNUM()==null) || 
             (this.INSTALLMENTNUM!=null &&
              this.INSTALLMENTNUM.equals(other.getINSTALLMENTNUM()))) &&
            ((this.NUMOFRETRIES==null && other.getNUMOFRETRIES()==null) || 
             (this.NUMOFRETRIES!=null &&
              this.NUMOFRETRIES.equals(other.getNUMOFRETRIES()))) &&
            ((this.PAID==null && other.getPAID()==null) || 
             (this.PAID!=null &&
              this.PAID.equals(other.getPAID()))) &&
            ((this.PAYMENTDATE==null && other.getPAYMENTDATE()==null) || 
             (this.PAYMENTDATE!=null &&
              this.PAYMENTDATE.equals(other.getPAYMENTDATE()))) &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.PLANID==null && other.getPLANID()==null) || 
             (this.PLANID!=null &&
              this.PLANID.equals(other.getPLANID()))) &&
            ((this.PROCESSED==null && other.getPROCESSED()==null) || 
             (this.PROCESSED!=null &&
              this.PROCESSED.equals(other.getPROCESSED()))) &&
            ((this.SCHEDULEID==null && other.getSCHEDULEID()==null) || 
             (this.SCHEDULEID!=null &&
              this.SCHEDULEID.equals(other.getSCHEDULEID()))) &&
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
        int _hashCode = 1;
        if (getAMOUNT() != null) {
            _hashCode += getAMOUNT().hashCode();
        }
        if (getINSTALLMENTDATE() != null) {
            _hashCode += getINSTALLMENTDATE().hashCode();
        }
        if (getINSTALLMENTNUM() != null) {
            _hashCode += getINSTALLMENTNUM().hashCode();
        }
        if (getNUMOFRETRIES() != null) {
            _hashCode += getNUMOFRETRIES().hashCode();
        }
        if (getPAID() != null) {
            _hashCode += getPAID().hashCode();
        }
        if (getPAYMENTDATE() != null) {
            _hashCode += getPAYMENTDATE().hashCode();
        }
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getPLANID() != null) {
            _hashCode += getPLANID().hashCode();
        }
        if (getPROCESSED() != null) {
            _hashCode += getPROCESSED().hashCode();
        }
        if (getSCHEDULEID() != null) {
            _hashCode += getSCHEDULEID().hashCode();
        }
        if (getTRANSACTIONID() != null) {
            _hashCode += getTRANSACTIONID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PAYMENT_AB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSTALLMENTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSTALLMENTNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENTNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMOFRETRIES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NUMOFRETRIES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTDATE"));
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
        elemField.setFieldName("PLANID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLANID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROCESSED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PROCESSED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SCHEDULEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
