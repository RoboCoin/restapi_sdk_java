/**
 * P2P_PUBLIC_KEY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class P2P_PUBLIC_KEY  implements java.io.Serializable {
    private java.lang.String EXPONENT;

    private java.lang.String MODULUS;

    public P2P_PUBLIC_KEY() {
    }

    public P2P_PUBLIC_KEY(
           java.lang.String EXPONENT,
           java.lang.String MODULUS) {
           this.EXPONENT = EXPONENT;
           this.MODULUS = MODULUS;
    }


    /**
     * Gets the EXPONENT value for this P2P_PUBLIC_KEY.
     * 
     * @return EXPONENT
     */
    public java.lang.String getEXPONENT() {
        return EXPONENT;
    }


    /**
     * Sets the EXPONENT value for this P2P_PUBLIC_KEY.
     * 
     * @param EXPONENT
     */
    public void setEXPONENT(java.lang.String EXPONENT) {
        this.EXPONENT = EXPONENT;
    }


    /**
     * Gets the MODULUS value for this P2P_PUBLIC_KEY.
     * 
     * @return MODULUS
     */
    public java.lang.String getMODULUS() {
        return MODULUS;
    }


    /**
     * Sets the MODULUS value for this P2P_PUBLIC_KEY.
     * 
     * @param MODULUS
     */
    public void setMODULUS(java.lang.String MODULUS) {
        this.MODULUS = MODULUS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof P2P_PUBLIC_KEY)) return false;
        P2P_PUBLIC_KEY other = (P2P_PUBLIC_KEY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EXPONENT==null && other.getEXPONENT()==null) || 
             (this.EXPONENT!=null &&
              this.EXPONENT.equals(other.getEXPONENT()))) &&
            ((this.MODULUS==null && other.getMODULUS()==null) || 
             (this.MODULUS!=null &&
              this.MODULUS.equals(other.getMODULUS())));
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
        if (getEXPONENT() != null) {
            _hashCode += getEXPONENT().hashCode();
        }
        if (getMODULUS() != null) {
            _hashCode += getMODULUS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(P2P_PUBLIC_KEY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2P_PUBLIC_KEY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPONENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EXPONENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODULUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MODULUS"));
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
