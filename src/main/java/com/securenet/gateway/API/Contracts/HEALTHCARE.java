/**
 * HEALTHCARE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class HEALTHCARE  implements java.io.Serializable {
    private java.lang.String CARRIERID;

    private java.math.BigDecimal CLINIC_AMOUNT;

    private java.math.BigDecimal DENTAL_AMOUNT;

    private java.math.BigDecimal OTC_AMOUNT;

    private java.math.BigDecimal PRESCRIPTION_AMOUNT;

    private java.lang.String SERVICE_TYPECODE;

    private java.math.BigDecimal VISION_AMOUNT;

    public HEALTHCARE() {
    }

    public HEALTHCARE(
           java.lang.String CARRIERID,
           java.math.BigDecimal CLINIC_AMOUNT,
           java.math.BigDecimal DENTAL_AMOUNT,
           java.math.BigDecimal OTC_AMOUNT,
           java.math.BigDecimal PRESCRIPTION_AMOUNT,
           java.lang.String SERVICE_TYPECODE,
           java.math.BigDecimal VISION_AMOUNT) {
           this.CARRIERID = CARRIERID;
           this.CLINIC_AMOUNT = CLINIC_AMOUNT;
           this.DENTAL_AMOUNT = DENTAL_AMOUNT;
           this.OTC_AMOUNT = OTC_AMOUNT;
           this.PRESCRIPTION_AMOUNT = PRESCRIPTION_AMOUNT;
           this.SERVICE_TYPECODE = SERVICE_TYPECODE;
           this.VISION_AMOUNT = VISION_AMOUNT;
    }


    /**
     * Gets the CARRIERID value for this HEALTHCARE.
     * 
     * @return CARRIERID
     */
    public java.lang.String getCARRIERID() {
        return CARRIERID;
    }


    /**
     * Sets the CARRIERID value for this HEALTHCARE.
     * 
     * @param CARRIERID
     */
    public void setCARRIERID(java.lang.String CARRIERID) {
        this.CARRIERID = CARRIERID;
    }


    /**
     * Gets the CLINIC_AMOUNT value for this HEALTHCARE.
     * 
     * @return CLINIC_AMOUNT
     */
    public java.math.BigDecimal getCLINIC_AMOUNT() {
        return CLINIC_AMOUNT;
    }


    /**
     * Sets the CLINIC_AMOUNT value for this HEALTHCARE.
     * 
     * @param CLINIC_AMOUNT
     */
    public void setCLINIC_AMOUNT(java.math.BigDecimal CLINIC_AMOUNT) {
        this.CLINIC_AMOUNT = CLINIC_AMOUNT;
    }


    /**
     * Gets the DENTAL_AMOUNT value for this HEALTHCARE.
     * 
     * @return DENTAL_AMOUNT
     */
    public java.math.BigDecimal getDENTAL_AMOUNT() {
        return DENTAL_AMOUNT;
    }


    /**
     * Sets the DENTAL_AMOUNT value for this HEALTHCARE.
     * 
     * @param DENTAL_AMOUNT
     */
    public void setDENTAL_AMOUNT(java.math.BigDecimal DENTAL_AMOUNT) {
        this.DENTAL_AMOUNT = DENTAL_AMOUNT;
    }


    /**
     * Gets the OTC_AMOUNT value for this HEALTHCARE.
     * 
     * @return OTC_AMOUNT
     */
    public java.math.BigDecimal getOTC_AMOUNT() {
        return OTC_AMOUNT;
    }


    /**
     * Sets the OTC_AMOUNT value for this HEALTHCARE.
     * 
     * @param OTC_AMOUNT
     */
    public void setOTC_AMOUNT(java.math.BigDecimal OTC_AMOUNT) {
        this.OTC_AMOUNT = OTC_AMOUNT;
    }


    /**
     * Gets the PRESCRIPTION_AMOUNT value for this HEALTHCARE.
     * 
     * @return PRESCRIPTION_AMOUNT
     */
    public java.math.BigDecimal getPRESCRIPTION_AMOUNT() {
        return PRESCRIPTION_AMOUNT;
    }


    /**
     * Sets the PRESCRIPTION_AMOUNT value for this HEALTHCARE.
     * 
     * @param PRESCRIPTION_AMOUNT
     */
    public void setPRESCRIPTION_AMOUNT(java.math.BigDecimal PRESCRIPTION_AMOUNT) {
        this.PRESCRIPTION_AMOUNT = PRESCRIPTION_AMOUNT;
    }


    /**
     * Gets the SERVICE_TYPECODE value for this HEALTHCARE.
     * 
     * @return SERVICE_TYPECODE
     */
    public java.lang.String getSERVICE_TYPECODE() {
        return SERVICE_TYPECODE;
    }


    /**
     * Sets the SERVICE_TYPECODE value for this HEALTHCARE.
     * 
     * @param SERVICE_TYPECODE
     */
    public void setSERVICE_TYPECODE(java.lang.String SERVICE_TYPECODE) {
        this.SERVICE_TYPECODE = SERVICE_TYPECODE;
    }


    /**
     * Gets the VISION_AMOUNT value for this HEALTHCARE.
     * 
     * @return VISION_AMOUNT
     */
    public java.math.BigDecimal getVISION_AMOUNT() {
        return VISION_AMOUNT;
    }


    /**
     * Sets the VISION_AMOUNT value for this HEALTHCARE.
     * 
     * @param VISION_AMOUNT
     */
    public void setVISION_AMOUNT(java.math.BigDecimal VISION_AMOUNT) {
        this.VISION_AMOUNT = VISION_AMOUNT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HEALTHCARE)) return false;
        HEALTHCARE other = (HEALTHCARE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CARRIERID==null && other.getCARRIERID()==null) || 
             (this.CARRIERID!=null &&
              this.CARRIERID.equals(other.getCARRIERID()))) &&
            ((this.CLINIC_AMOUNT==null && other.getCLINIC_AMOUNT()==null) || 
             (this.CLINIC_AMOUNT!=null &&
              this.CLINIC_AMOUNT.equals(other.getCLINIC_AMOUNT()))) &&
            ((this.DENTAL_AMOUNT==null && other.getDENTAL_AMOUNT()==null) || 
             (this.DENTAL_AMOUNT!=null &&
              this.DENTAL_AMOUNT.equals(other.getDENTAL_AMOUNT()))) &&
            ((this.OTC_AMOUNT==null && other.getOTC_AMOUNT()==null) || 
             (this.OTC_AMOUNT!=null &&
              this.OTC_AMOUNT.equals(other.getOTC_AMOUNT()))) &&
            ((this.PRESCRIPTION_AMOUNT==null && other.getPRESCRIPTION_AMOUNT()==null) || 
             (this.PRESCRIPTION_AMOUNT!=null &&
              this.PRESCRIPTION_AMOUNT.equals(other.getPRESCRIPTION_AMOUNT()))) &&
            ((this.SERVICE_TYPECODE==null && other.getSERVICE_TYPECODE()==null) || 
             (this.SERVICE_TYPECODE!=null &&
              this.SERVICE_TYPECODE.equals(other.getSERVICE_TYPECODE()))) &&
            ((this.VISION_AMOUNT==null && other.getVISION_AMOUNT()==null) || 
             (this.VISION_AMOUNT!=null &&
              this.VISION_AMOUNT.equals(other.getVISION_AMOUNT())));
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
        if (getCARRIERID() != null) {
            _hashCode += getCARRIERID().hashCode();
        }
        if (getCLINIC_AMOUNT() != null) {
            _hashCode += getCLINIC_AMOUNT().hashCode();
        }
        if (getDENTAL_AMOUNT() != null) {
            _hashCode += getDENTAL_AMOUNT().hashCode();
        }
        if (getOTC_AMOUNT() != null) {
            _hashCode += getOTC_AMOUNT().hashCode();
        }
        if (getPRESCRIPTION_AMOUNT() != null) {
            _hashCode += getPRESCRIPTION_AMOUNT().hashCode();
        }
        if (getSERVICE_TYPECODE() != null) {
            _hashCode += getSERVICE_TYPECODE().hashCode();
        }
        if (getVISION_AMOUNT() != null) {
            _hashCode += getVISION_AMOUNT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HEALTHCARE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HEALTHCARE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARRIERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARRIERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CLINIC_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DENTAL_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DENTAL_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTC_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OTC_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRESCRIPTION_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRESCRIPTION_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERVICE_TYPECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SERVICE_TYPECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISION_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VISION_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
