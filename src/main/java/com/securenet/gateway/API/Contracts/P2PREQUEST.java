/**
 * P2PREQUEST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class P2PREQUEST  implements java.io.Serializable {
    private com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY;

    public P2PREQUEST() {
    }

    public P2PREQUEST(
           com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY) {
           this.MERCHANT_KEY = MERCHANT_KEY;
    }


    /**
     * Gets the MERCHANT_KEY value for this P2PREQUEST.
     * 
     * @return MERCHANT_KEY
     */
    public com.securenet.gateway.API.Contracts.MERCHANT_KEY getMERCHANT_KEY() {
        return MERCHANT_KEY;
    }


    /**
     * Sets the MERCHANT_KEY value for this P2PREQUEST.
     * 
     * @param MERCHANT_KEY
     */
    public void setMERCHANT_KEY(com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY) {
        this.MERCHANT_KEY = MERCHANT_KEY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof P2PREQUEST)) return false;
        P2PREQUEST other = (P2PREQUEST) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MERCHANT_KEY==null && other.getMERCHANT_KEY()==null) || 
             (this.MERCHANT_KEY!=null &&
              this.MERCHANT_KEY.equals(other.getMERCHANT_KEY())));
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
        if (getMERCHANT_KEY() != null) {
            _hashCode += getMERCHANT_KEY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(P2PREQUEST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PREQUEST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCHANT_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
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
