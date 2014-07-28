/**
 * HOTEL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class HOTEL  implements java.io.Serializable {
    private java.lang.String CHARGETYPE;

    private java.lang.String CHECKIN_DATE;

    private java.lang.String CHECKOUT_DATE;

    private java.math.BigDecimal EXTRA_CHARGEAMOUNT;

    private java.lang.String EXTRA_CHARGECODE;

    private java.lang.String PREFERRED_CUSTOMER;

    private java.math.BigDecimal ROOMRATE;

    private java.lang.String SALECODE;

    public HOTEL() {
    }

    public HOTEL(
           java.lang.String CHARGETYPE,
           java.lang.String CHECKIN_DATE,
           java.lang.String CHECKOUT_DATE,
           java.math.BigDecimal EXTRA_CHARGEAMOUNT,
           java.lang.String EXTRA_CHARGECODE,
           java.lang.String PREFERRED_CUSTOMER,
           java.math.BigDecimal ROOMRATE,
           java.lang.String SALECODE) {
           this.CHARGETYPE = CHARGETYPE;
           this.CHECKIN_DATE = CHECKIN_DATE;
           this.CHECKOUT_DATE = CHECKOUT_DATE;
           this.EXTRA_CHARGEAMOUNT = EXTRA_CHARGEAMOUNT;
           this.EXTRA_CHARGECODE = EXTRA_CHARGECODE;
           this.PREFERRED_CUSTOMER = PREFERRED_CUSTOMER;
           this.ROOMRATE = ROOMRATE;
           this.SALECODE = SALECODE;
    }


    /**
     * Gets the CHARGETYPE value for this HOTEL.
     * 
     * @return CHARGETYPE
     */
    public java.lang.String getCHARGETYPE() {
        return CHARGETYPE;
    }


    /**
     * Sets the CHARGETYPE value for this HOTEL.
     * 
     * @param CHARGETYPE
     */
    public void setCHARGETYPE(java.lang.String CHARGETYPE) {
        this.CHARGETYPE = CHARGETYPE;
    }


    /**
     * Gets the CHECKIN_DATE value for this HOTEL.
     * 
     * @return CHECKIN_DATE
     */
    public java.lang.String getCHECKIN_DATE() {
        return CHECKIN_DATE;
    }


    /**
     * Sets the CHECKIN_DATE value for this HOTEL.
     * 
     * @param CHECKIN_DATE
     */
    public void setCHECKIN_DATE(java.lang.String CHECKIN_DATE) {
        this.CHECKIN_DATE = CHECKIN_DATE;
    }


    /**
     * Gets the CHECKOUT_DATE value for this HOTEL.
     * 
     * @return CHECKOUT_DATE
     */
    public java.lang.String getCHECKOUT_DATE() {
        return CHECKOUT_DATE;
    }


    /**
     * Sets the CHECKOUT_DATE value for this HOTEL.
     * 
     * @param CHECKOUT_DATE
     */
    public void setCHECKOUT_DATE(java.lang.String CHECKOUT_DATE) {
        this.CHECKOUT_DATE = CHECKOUT_DATE;
    }


    /**
     * Gets the EXTRA_CHARGEAMOUNT value for this HOTEL.
     * 
     * @return EXTRA_CHARGEAMOUNT
     */
    public java.math.BigDecimal getEXTRA_CHARGEAMOUNT() {
        return EXTRA_CHARGEAMOUNT;
    }


    /**
     * Sets the EXTRA_CHARGEAMOUNT value for this HOTEL.
     * 
     * @param EXTRA_CHARGEAMOUNT
     */
    public void setEXTRA_CHARGEAMOUNT(java.math.BigDecimal EXTRA_CHARGEAMOUNT) {
        this.EXTRA_CHARGEAMOUNT = EXTRA_CHARGEAMOUNT;
    }


    /**
     * Gets the EXTRA_CHARGECODE value for this HOTEL.
     * 
     * @return EXTRA_CHARGECODE
     */
    public java.lang.String getEXTRA_CHARGECODE() {
        return EXTRA_CHARGECODE;
    }


    /**
     * Sets the EXTRA_CHARGECODE value for this HOTEL.
     * 
     * @param EXTRA_CHARGECODE
     */
    public void setEXTRA_CHARGECODE(java.lang.String EXTRA_CHARGECODE) {
        this.EXTRA_CHARGECODE = EXTRA_CHARGECODE;
    }


    /**
     * Gets the PREFERRED_CUSTOMER value for this HOTEL.
     * 
     * @return PREFERRED_CUSTOMER
     */
    public java.lang.String getPREFERRED_CUSTOMER() {
        return PREFERRED_CUSTOMER;
    }


    /**
     * Sets the PREFERRED_CUSTOMER value for this HOTEL.
     * 
     * @param PREFERRED_CUSTOMER
     */
    public void setPREFERRED_CUSTOMER(java.lang.String PREFERRED_CUSTOMER) {
        this.PREFERRED_CUSTOMER = PREFERRED_CUSTOMER;
    }


    /**
     * Gets the ROOMRATE value for this HOTEL.
     * 
     * @return ROOMRATE
     */
    public java.math.BigDecimal getROOMRATE() {
        return ROOMRATE;
    }


    /**
     * Sets the ROOMRATE value for this HOTEL.
     * 
     * @param ROOMRATE
     */
    public void setROOMRATE(java.math.BigDecimal ROOMRATE) {
        this.ROOMRATE = ROOMRATE;
    }


    /**
     * Gets the SALECODE value for this HOTEL.
     * 
     * @return SALECODE
     */
    public java.lang.String getSALECODE() {
        return SALECODE;
    }


    /**
     * Sets the SALECODE value for this HOTEL.
     * 
     * @param SALECODE
     */
    public void setSALECODE(java.lang.String SALECODE) {
        this.SALECODE = SALECODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HOTEL)) return false;
        HOTEL other = (HOTEL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CHARGETYPE==null && other.getCHARGETYPE()==null) || 
             (this.CHARGETYPE!=null &&
              this.CHARGETYPE.equals(other.getCHARGETYPE()))) &&
            ((this.CHECKIN_DATE==null && other.getCHECKIN_DATE()==null) || 
             (this.CHECKIN_DATE!=null &&
              this.CHECKIN_DATE.equals(other.getCHECKIN_DATE()))) &&
            ((this.CHECKOUT_DATE==null && other.getCHECKOUT_DATE()==null) || 
             (this.CHECKOUT_DATE!=null &&
              this.CHECKOUT_DATE.equals(other.getCHECKOUT_DATE()))) &&
            ((this.EXTRA_CHARGEAMOUNT==null && other.getEXTRA_CHARGEAMOUNT()==null) || 
             (this.EXTRA_CHARGEAMOUNT!=null &&
              this.EXTRA_CHARGEAMOUNT.equals(other.getEXTRA_CHARGEAMOUNT()))) &&
            ((this.EXTRA_CHARGECODE==null && other.getEXTRA_CHARGECODE()==null) || 
             (this.EXTRA_CHARGECODE!=null &&
              this.EXTRA_CHARGECODE.equals(other.getEXTRA_CHARGECODE()))) &&
            ((this.PREFERRED_CUSTOMER==null && other.getPREFERRED_CUSTOMER()==null) || 
             (this.PREFERRED_CUSTOMER!=null &&
              this.PREFERRED_CUSTOMER.equals(other.getPREFERRED_CUSTOMER()))) &&
            ((this.ROOMRATE==null && other.getROOMRATE()==null) || 
             (this.ROOMRATE!=null &&
              this.ROOMRATE.equals(other.getROOMRATE()))) &&
            ((this.SALECODE==null && other.getSALECODE()==null) || 
             (this.SALECODE!=null &&
              this.SALECODE.equals(other.getSALECODE())));
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
        if (getCHARGETYPE() != null) {
            _hashCode += getCHARGETYPE().hashCode();
        }
        if (getCHECKIN_DATE() != null) {
            _hashCode += getCHECKIN_DATE().hashCode();
        }
        if (getCHECKOUT_DATE() != null) {
            _hashCode += getCHECKOUT_DATE().hashCode();
        }
        if (getEXTRA_CHARGEAMOUNT() != null) {
            _hashCode += getEXTRA_CHARGEAMOUNT().hashCode();
        }
        if (getEXTRA_CHARGECODE() != null) {
            _hashCode += getEXTRA_CHARGECODE().hashCode();
        }
        if (getPREFERRED_CUSTOMER() != null) {
            _hashCode += getPREFERRED_CUSTOMER().hashCode();
        }
        if (getROOMRATE() != null) {
            _hashCode += getROOMRATE().hashCode();
        }
        if (getSALECODE() != null) {
            _hashCode += getSALECODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HOTEL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HOTEL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHARGETYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHARGETYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECKIN_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKIN_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECKOUT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKOUT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXTRA_CHARGEAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EXTRA_CHARGEAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXTRA_CHARGECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EXTRA_CHARGECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PREFERRED_CUSTOMER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PREFERRED_CUSTOMER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROOMRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ROOMRATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SALECODE"));
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
