/**
 * RECURRING.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class RECURRING  extends com.securenet.gateway.API.Contracts.OPTIONS  implements java.io.Serializable {
    private java.math.BigDecimal AMOUNT;

    private java.lang.Integer NOEND_FLAG;

    public RECURRING() {
    }

    public RECURRING(
           java.lang.String CYCLE,
           java.lang.Integer DAY,
           java.lang.Integer FREQUENCY,
           java.lang.Integer MONTH,
           java.lang.Integer WEEKDAY,
           java.math.BigDecimal AMOUNT,
           java.lang.Integer NOEND_FLAG) {
        super(
            CYCLE,
            DAY,
            FREQUENCY,
            MONTH,
            WEEKDAY);
        this.AMOUNT = AMOUNT;
        this.NOEND_FLAG = NOEND_FLAG;
    }


    /**
     * Gets the AMOUNT value for this RECURRING.
     * 
     * @return AMOUNT
     */
    public java.math.BigDecimal getAMOUNT() {
        return AMOUNT;
    }


    /**
     * Sets the AMOUNT value for this RECURRING.
     * 
     * @param AMOUNT
     */
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }


    /**
     * Gets the NOEND_FLAG value for this RECURRING.
     * 
     * @return NOEND_FLAG
     */
    public java.lang.Integer getNOEND_FLAG() {
        return NOEND_FLAG;
    }


    /**
     * Sets the NOEND_FLAG value for this RECURRING.
     * 
     * @param NOEND_FLAG
     */
    public void setNOEND_FLAG(java.lang.Integer NOEND_FLAG) {
        this.NOEND_FLAG = NOEND_FLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RECURRING)) return false;
        RECURRING other = (RECURRING) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AMOUNT==null && other.getAMOUNT()==null) || 
             (this.AMOUNT!=null &&
              this.AMOUNT.equals(other.getAMOUNT()))) &&
            ((this.NOEND_FLAG==null && other.getNOEND_FLAG()==null) || 
             (this.NOEND_FLAG!=null &&
              this.NOEND_FLAG.equals(other.getNOEND_FLAG())));
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
        if (getAMOUNT() != null) {
            _hashCode += getAMOUNT().hashCode();
        }
        if (getNOEND_FLAG() != null) {
            _hashCode += getNOEND_FLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RECURRING.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RECURRING"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOEND_FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NOEND_FLAG"));
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
