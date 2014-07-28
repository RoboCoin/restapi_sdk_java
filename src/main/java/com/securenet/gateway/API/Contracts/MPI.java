/**
 * MPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class MPI  implements java.io.Serializable {
    private java.lang.String AUTHINDICATOR;

    private java.lang.String AUTHVALUE;

    public MPI() {
    }

    public MPI(
           java.lang.String AUTHINDICATOR,
           java.lang.String AUTHVALUE) {
           this.AUTHINDICATOR = AUTHINDICATOR;
           this.AUTHVALUE = AUTHVALUE;
    }


    /**
     * Gets the AUTHINDICATOR value for this MPI.
     * 
     * @return AUTHINDICATOR
     */
    public java.lang.String getAUTHINDICATOR() {
        return AUTHINDICATOR;
    }


    /**
     * Sets the AUTHINDICATOR value for this MPI.
     * 
     * @param AUTHINDICATOR
     */
    public void setAUTHINDICATOR(java.lang.String AUTHINDICATOR) {
        this.AUTHINDICATOR = AUTHINDICATOR;
    }


    /**
     * Gets the AUTHVALUE value for this MPI.
     * 
     * @return AUTHVALUE
     */
    public java.lang.String getAUTHVALUE() {
        return AUTHVALUE;
    }


    /**
     * Sets the AUTHVALUE value for this MPI.
     * 
     * @param AUTHVALUE
     */
    public void setAUTHVALUE(java.lang.String AUTHVALUE) {
        this.AUTHVALUE = AUTHVALUE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MPI)) return false;
        MPI other = (MPI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AUTHINDICATOR==null && other.getAUTHINDICATOR()==null) || 
             (this.AUTHINDICATOR!=null &&
              this.AUTHINDICATOR.equals(other.getAUTHINDICATOR()))) &&
            ((this.AUTHVALUE==null && other.getAUTHVALUE()==null) || 
             (this.AUTHVALUE!=null &&
              this.AUTHVALUE.equals(other.getAUTHVALUE())));
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
        if (getAUTHINDICATOR() != null) {
            _hashCode += getAUTHINDICATOR().hashCode();
        }
        if (getAUTHVALUE() != null) {
            _hashCode += getAUTHVALUE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MPI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MPI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTHINDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTHINDICATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTHVALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTHVALUE"));
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
