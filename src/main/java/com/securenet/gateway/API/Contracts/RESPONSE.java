/**
 * RESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class RESPONSE  implements java.io.Serializable {
    private java.lang.String RESPONSE_CODE;

    private java.lang.String RESPONSE_REASON_CODE;

    private java.lang.String RESPONSE_REASON_TEXT;

    private java.lang.String RESPONSE_SUBCODE;

    public RESPONSE() {
    }

    public RESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE) {
           this.RESPONSE_CODE = RESPONSE_CODE;
           this.RESPONSE_REASON_CODE = RESPONSE_REASON_CODE;
           this.RESPONSE_REASON_TEXT = RESPONSE_REASON_TEXT;
           this.RESPONSE_SUBCODE = RESPONSE_SUBCODE;
    }


    /**
     * Gets the RESPONSE_CODE value for this RESPONSE.
     * 
     * @return RESPONSE_CODE
     */
    public java.lang.String getRESPONSE_CODE() {
        return RESPONSE_CODE;
    }


    /**
     * Sets the RESPONSE_CODE value for this RESPONSE.
     * 
     * @param RESPONSE_CODE
     */
    public void setRESPONSE_CODE(java.lang.String RESPONSE_CODE) {
        this.RESPONSE_CODE = RESPONSE_CODE;
    }


    /**
     * Gets the RESPONSE_REASON_CODE value for this RESPONSE.
     * 
     * @return RESPONSE_REASON_CODE
     */
    public java.lang.String getRESPONSE_REASON_CODE() {
        return RESPONSE_REASON_CODE;
    }


    /**
     * Sets the RESPONSE_REASON_CODE value for this RESPONSE.
     * 
     * @param RESPONSE_REASON_CODE
     */
    public void setRESPONSE_REASON_CODE(java.lang.String RESPONSE_REASON_CODE) {
        this.RESPONSE_REASON_CODE = RESPONSE_REASON_CODE;
    }


    /**
     * Gets the RESPONSE_REASON_TEXT value for this RESPONSE.
     * 
     * @return RESPONSE_REASON_TEXT
     */
    public java.lang.String getRESPONSE_REASON_TEXT() {
        return RESPONSE_REASON_TEXT;
    }


    /**
     * Sets the RESPONSE_REASON_TEXT value for this RESPONSE.
     * 
     * @param RESPONSE_REASON_TEXT
     */
    public void setRESPONSE_REASON_TEXT(java.lang.String RESPONSE_REASON_TEXT) {
        this.RESPONSE_REASON_TEXT = RESPONSE_REASON_TEXT;
    }


    /**
     * Gets the RESPONSE_SUBCODE value for this RESPONSE.
     * 
     * @return RESPONSE_SUBCODE
     */
    public java.lang.String getRESPONSE_SUBCODE() {
        return RESPONSE_SUBCODE;
    }


    /**
     * Sets the RESPONSE_SUBCODE value for this RESPONSE.
     * 
     * @param RESPONSE_SUBCODE
     */
    public void setRESPONSE_SUBCODE(java.lang.String RESPONSE_SUBCODE) {
        this.RESPONSE_SUBCODE = RESPONSE_SUBCODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RESPONSE)) return false;
        RESPONSE other = (RESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RESPONSE_CODE==null && other.getRESPONSE_CODE()==null) || 
             (this.RESPONSE_CODE!=null &&
              this.RESPONSE_CODE.equals(other.getRESPONSE_CODE()))) &&
            ((this.RESPONSE_REASON_CODE==null && other.getRESPONSE_REASON_CODE()==null) || 
             (this.RESPONSE_REASON_CODE!=null &&
              this.RESPONSE_REASON_CODE.equals(other.getRESPONSE_REASON_CODE()))) &&
            ((this.RESPONSE_REASON_TEXT==null && other.getRESPONSE_REASON_TEXT()==null) || 
             (this.RESPONSE_REASON_TEXT!=null &&
              this.RESPONSE_REASON_TEXT.equals(other.getRESPONSE_REASON_TEXT()))) &&
            ((this.RESPONSE_SUBCODE==null && other.getRESPONSE_SUBCODE()==null) || 
             (this.RESPONSE_SUBCODE!=null &&
              this.RESPONSE_SUBCODE.equals(other.getRESPONSE_SUBCODE())));
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
        if (getRESPONSE_CODE() != null) {
            _hashCode += getRESPONSE_CODE().hashCode();
        }
        if (getRESPONSE_REASON_CODE() != null) {
            _hashCode += getRESPONSE_REASON_CODE().hashCode();
        }
        if (getRESPONSE_REASON_TEXT() != null) {
            _hashCode += getRESPONSE_REASON_TEXT().hashCode();
        }
        if (getRESPONSE_SUBCODE() != null) {
            _hashCode += getRESPONSE_SUBCODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONSE_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONSE_REASON_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE_REASON_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONSE_REASON_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE_REASON_TEXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONSE_SUBCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE_SUBCODE"));
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
