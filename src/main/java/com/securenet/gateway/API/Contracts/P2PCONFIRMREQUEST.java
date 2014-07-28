/**
 * P2PCONFIRMREQUEST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class P2PCONFIRMREQUEST  extends com.securenet.gateway.API.Contracts.P2PREQUEST  implements java.io.Serializable {
    private java.lang.String ENCRYPTED_STRING;

    private java.lang.Integer KEYID;

    public P2PCONFIRMREQUEST() {
    }

    public P2PCONFIRMREQUEST(
           com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY,
           java.lang.String ENCRYPTED_STRING,
           java.lang.Integer KEYID) {
        super(
            MERCHANT_KEY);
        this.ENCRYPTED_STRING = ENCRYPTED_STRING;
        this.KEYID = KEYID;
    }


    /**
     * Gets the ENCRYPTED_STRING value for this P2PCONFIRMREQUEST.
     * 
     * @return ENCRYPTED_STRING
     */
    public java.lang.String getENCRYPTED_STRING() {
        return ENCRYPTED_STRING;
    }


    /**
     * Sets the ENCRYPTED_STRING value for this P2PCONFIRMREQUEST.
     * 
     * @param ENCRYPTED_STRING
     */
    public void setENCRYPTED_STRING(java.lang.String ENCRYPTED_STRING) {
        this.ENCRYPTED_STRING = ENCRYPTED_STRING;
    }


    /**
     * Gets the KEYID value for this P2PCONFIRMREQUEST.
     * 
     * @return KEYID
     */
    public java.lang.Integer getKEYID() {
        return KEYID;
    }


    /**
     * Sets the KEYID value for this P2PCONFIRMREQUEST.
     * 
     * @param KEYID
     */
    public void setKEYID(java.lang.Integer KEYID) {
        this.KEYID = KEYID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof P2PCONFIRMREQUEST)) return false;
        P2PCONFIRMREQUEST other = (P2PCONFIRMREQUEST) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ENCRYPTED_STRING==null && other.getENCRYPTED_STRING()==null) || 
             (this.ENCRYPTED_STRING!=null &&
              this.ENCRYPTED_STRING.equals(other.getENCRYPTED_STRING()))) &&
            ((this.KEYID==null && other.getKEYID()==null) || 
             (this.KEYID!=null &&
              this.KEYID.equals(other.getKEYID())));
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
        if (getENCRYPTED_STRING() != null) {
            _hashCode += getENCRYPTED_STRING().hashCode();
        }
        if (getKEYID() != null) {
            _hashCode += getKEYID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(P2PCONFIRMREQUEST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PCONFIRMREQUEST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENCRYPTED_STRING");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENCRYPTED_STRING"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEYID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "KEYID"));
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
