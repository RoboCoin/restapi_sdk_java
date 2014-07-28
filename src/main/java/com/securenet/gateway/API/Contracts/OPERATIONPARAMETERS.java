/**
 * OPERATIONPARAMETERS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class OPERATIONPARAMETERS  implements java.io.Serializable {
    private int ACTIONCODE;

    private int ADD_IF_DECLINED;

    public OPERATIONPARAMETERS() {
    }

    public OPERATIONPARAMETERS(
           int ACTIONCODE,
           int ADD_IF_DECLINED) {
           this.ACTIONCODE = ACTIONCODE;
           this.ADD_IF_DECLINED = ADD_IF_DECLINED;
    }


    /**
     * Gets the ACTIONCODE value for this OPERATIONPARAMETERS.
     * 
     * @return ACTIONCODE
     */
    public int getACTIONCODE() {
        return ACTIONCODE;
    }


    /**
     * Sets the ACTIONCODE value for this OPERATIONPARAMETERS.
     * 
     * @param ACTIONCODE
     */
    public void setACTIONCODE(int ACTIONCODE) {
        this.ACTIONCODE = ACTIONCODE;
    }


    /**
     * Gets the ADD_IF_DECLINED value for this OPERATIONPARAMETERS.
     * 
     * @return ADD_IF_DECLINED
     */
    public int getADD_IF_DECLINED() {
        return ADD_IF_DECLINED;
    }


    /**
     * Sets the ADD_IF_DECLINED value for this OPERATIONPARAMETERS.
     * 
     * @param ADD_IF_DECLINED
     */
    public void setADD_IF_DECLINED(int ADD_IF_DECLINED) {
        this.ADD_IF_DECLINED = ADD_IF_DECLINED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OPERATIONPARAMETERS)) return false;
        OPERATIONPARAMETERS other = (OPERATIONPARAMETERS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ACTIONCODE == other.getACTIONCODE() &&
            this.ADD_IF_DECLINED == other.getADD_IF_DECLINED();
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
        _hashCode += getACTIONCODE();
        _hashCode += getADD_IF_DECLINED();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OPERATIONPARAMETERS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPERATIONPARAMETERS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTIONCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACTIONCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADD_IF_DECLINED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADD_IF_DECLINED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
