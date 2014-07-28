/**
 * AUTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class AUTO  implements java.io.Serializable {
    private java.math.BigDecimal EXTRA_CHARGEAMOUNT;

    private java.lang.String EXTRA_CHARGECODE;

    private java.lang.String PREFERRED_CUSTOMER;

    private java.lang.String RENTALCITY;

    private java.lang.String RENTALDATETIME;

    private java.lang.String RENTALSTATE;

    private java.lang.String RETURNCITY;

    private java.lang.String RETURNDATETIME;

    private java.lang.String RETURNSTATE;

    private java.lang.String SALECODE;

    public AUTO() {
    }

    public AUTO(
           java.math.BigDecimal EXTRA_CHARGEAMOUNT,
           java.lang.String EXTRA_CHARGECODE,
           java.lang.String PREFERRED_CUSTOMER,
           java.lang.String RENTALCITY,
           java.lang.String RENTALDATETIME,
           java.lang.String RENTALSTATE,
           java.lang.String RETURNCITY,
           java.lang.String RETURNDATETIME,
           java.lang.String RETURNSTATE,
           java.lang.String SALECODE) {
           this.EXTRA_CHARGEAMOUNT = EXTRA_CHARGEAMOUNT;
           this.EXTRA_CHARGECODE = EXTRA_CHARGECODE;
           this.PREFERRED_CUSTOMER = PREFERRED_CUSTOMER;
           this.RENTALCITY = RENTALCITY;
           this.RENTALDATETIME = RENTALDATETIME;
           this.RENTALSTATE = RENTALSTATE;
           this.RETURNCITY = RETURNCITY;
           this.RETURNDATETIME = RETURNDATETIME;
           this.RETURNSTATE = RETURNSTATE;
           this.SALECODE = SALECODE;
    }


    /**
     * Gets the EXTRA_CHARGEAMOUNT value for this AUTO.
     * 
     * @return EXTRA_CHARGEAMOUNT
     */
    public java.math.BigDecimal getEXTRA_CHARGEAMOUNT() {
        return EXTRA_CHARGEAMOUNT;
    }


    /**
     * Sets the EXTRA_CHARGEAMOUNT value for this AUTO.
     * 
     * @param EXTRA_CHARGEAMOUNT
     */
    public void setEXTRA_CHARGEAMOUNT(java.math.BigDecimal EXTRA_CHARGEAMOUNT) {
        this.EXTRA_CHARGEAMOUNT = EXTRA_CHARGEAMOUNT;
    }


    /**
     * Gets the EXTRA_CHARGECODE value for this AUTO.
     * 
     * @return EXTRA_CHARGECODE
     */
    public java.lang.String getEXTRA_CHARGECODE() {
        return EXTRA_CHARGECODE;
    }


    /**
     * Sets the EXTRA_CHARGECODE value for this AUTO.
     * 
     * @param EXTRA_CHARGECODE
     */
    public void setEXTRA_CHARGECODE(java.lang.String EXTRA_CHARGECODE) {
        this.EXTRA_CHARGECODE = EXTRA_CHARGECODE;
    }


    /**
     * Gets the PREFERRED_CUSTOMER value for this AUTO.
     * 
     * @return PREFERRED_CUSTOMER
     */
    public java.lang.String getPREFERRED_CUSTOMER() {
        return PREFERRED_CUSTOMER;
    }


    /**
     * Sets the PREFERRED_CUSTOMER value for this AUTO.
     * 
     * @param PREFERRED_CUSTOMER
     */
    public void setPREFERRED_CUSTOMER(java.lang.String PREFERRED_CUSTOMER) {
        this.PREFERRED_CUSTOMER = PREFERRED_CUSTOMER;
    }


    /**
     * Gets the RENTALCITY value for this AUTO.
     * 
     * @return RENTALCITY
     */
    public java.lang.String getRENTALCITY() {
        return RENTALCITY;
    }


    /**
     * Sets the RENTALCITY value for this AUTO.
     * 
     * @param RENTALCITY
     */
    public void setRENTALCITY(java.lang.String RENTALCITY) {
        this.RENTALCITY = RENTALCITY;
    }


    /**
     * Gets the RENTALDATETIME value for this AUTO.
     * 
     * @return RENTALDATETIME
     */
    public java.lang.String getRENTALDATETIME() {
        return RENTALDATETIME;
    }


    /**
     * Sets the RENTALDATETIME value for this AUTO.
     * 
     * @param RENTALDATETIME
     */
    public void setRENTALDATETIME(java.lang.String RENTALDATETIME) {
        this.RENTALDATETIME = RENTALDATETIME;
    }


    /**
     * Gets the RENTALSTATE value for this AUTO.
     * 
     * @return RENTALSTATE
     */
    public java.lang.String getRENTALSTATE() {
        return RENTALSTATE;
    }


    /**
     * Sets the RENTALSTATE value for this AUTO.
     * 
     * @param RENTALSTATE
     */
    public void setRENTALSTATE(java.lang.String RENTALSTATE) {
        this.RENTALSTATE = RENTALSTATE;
    }


    /**
     * Gets the RETURNCITY value for this AUTO.
     * 
     * @return RETURNCITY
     */
    public java.lang.String getRETURNCITY() {
        return RETURNCITY;
    }


    /**
     * Sets the RETURNCITY value for this AUTO.
     * 
     * @param RETURNCITY
     */
    public void setRETURNCITY(java.lang.String RETURNCITY) {
        this.RETURNCITY = RETURNCITY;
    }


    /**
     * Gets the RETURNDATETIME value for this AUTO.
     * 
     * @return RETURNDATETIME
     */
    public java.lang.String getRETURNDATETIME() {
        return RETURNDATETIME;
    }


    /**
     * Sets the RETURNDATETIME value for this AUTO.
     * 
     * @param RETURNDATETIME
     */
    public void setRETURNDATETIME(java.lang.String RETURNDATETIME) {
        this.RETURNDATETIME = RETURNDATETIME;
    }


    /**
     * Gets the RETURNSTATE value for this AUTO.
     * 
     * @return RETURNSTATE
     */
    public java.lang.String getRETURNSTATE() {
        return RETURNSTATE;
    }


    /**
     * Sets the RETURNSTATE value for this AUTO.
     * 
     * @param RETURNSTATE
     */
    public void setRETURNSTATE(java.lang.String RETURNSTATE) {
        this.RETURNSTATE = RETURNSTATE;
    }


    /**
     * Gets the SALECODE value for this AUTO.
     * 
     * @return SALECODE
     */
    public java.lang.String getSALECODE() {
        return SALECODE;
    }


    /**
     * Sets the SALECODE value for this AUTO.
     * 
     * @param SALECODE
     */
    public void setSALECODE(java.lang.String SALECODE) {
        this.SALECODE = SALECODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AUTO)) return false;
        AUTO other = (AUTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EXTRA_CHARGEAMOUNT==null && other.getEXTRA_CHARGEAMOUNT()==null) || 
             (this.EXTRA_CHARGEAMOUNT!=null &&
              this.EXTRA_CHARGEAMOUNT.equals(other.getEXTRA_CHARGEAMOUNT()))) &&
            ((this.EXTRA_CHARGECODE==null && other.getEXTRA_CHARGECODE()==null) || 
             (this.EXTRA_CHARGECODE!=null &&
              this.EXTRA_CHARGECODE.equals(other.getEXTRA_CHARGECODE()))) &&
            ((this.PREFERRED_CUSTOMER==null && other.getPREFERRED_CUSTOMER()==null) || 
             (this.PREFERRED_CUSTOMER!=null &&
              this.PREFERRED_CUSTOMER.equals(other.getPREFERRED_CUSTOMER()))) &&
            ((this.RENTALCITY==null && other.getRENTALCITY()==null) || 
             (this.RENTALCITY!=null &&
              this.RENTALCITY.equals(other.getRENTALCITY()))) &&
            ((this.RENTALDATETIME==null && other.getRENTALDATETIME()==null) || 
             (this.RENTALDATETIME!=null &&
              this.RENTALDATETIME.equals(other.getRENTALDATETIME()))) &&
            ((this.RENTALSTATE==null && other.getRENTALSTATE()==null) || 
             (this.RENTALSTATE!=null &&
              this.RENTALSTATE.equals(other.getRENTALSTATE()))) &&
            ((this.RETURNCITY==null && other.getRETURNCITY()==null) || 
             (this.RETURNCITY!=null &&
              this.RETURNCITY.equals(other.getRETURNCITY()))) &&
            ((this.RETURNDATETIME==null && other.getRETURNDATETIME()==null) || 
             (this.RETURNDATETIME!=null &&
              this.RETURNDATETIME.equals(other.getRETURNDATETIME()))) &&
            ((this.RETURNSTATE==null && other.getRETURNSTATE()==null) || 
             (this.RETURNSTATE!=null &&
              this.RETURNSTATE.equals(other.getRETURNSTATE()))) &&
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
        if (getEXTRA_CHARGEAMOUNT() != null) {
            _hashCode += getEXTRA_CHARGEAMOUNT().hashCode();
        }
        if (getEXTRA_CHARGECODE() != null) {
            _hashCode += getEXTRA_CHARGECODE().hashCode();
        }
        if (getPREFERRED_CUSTOMER() != null) {
            _hashCode += getPREFERRED_CUSTOMER().hashCode();
        }
        if (getRENTALCITY() != null) {
            _hashCode += getRENTALCITY().hashCode();
        }
        if (getRENTALDATETIME() != null) {
            _hashCode += getRENTALDATETIME().hashCode();
        }
        if (getRENTALSTATE() != null) {
            _hashCode += getRENTALSTATE().hashCode();
        }
        if (getRETURNCITY() != null) {
            _hashCode += getRETURNCITY().hashCode();
        }
        if (getRETURNDATETIME() != null) {
            _hashCode += getRETURNDATETIME().hashCode();
        }
        if (getRETURNSTATE() != null) {
            _hashCode += getRETURNSTATE().hashCode();
        }
        if (getSALECODE() != null) {
            _hashCode += getSALECODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AUTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("RENTALCITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RENTALCITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RENTALDATETIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RENTALDATETIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RENTALSTATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RENTALSTATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURNCITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RETURNCITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURNDATETIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RETURNDATETIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURNSTATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RETURNSTATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
