/**
 * IMAGERESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class IMAGERESPONSE  extends com.securenet.gateway.API.Contracts.RESPONSE  implements java.io.Serializable {
    private java.lang.String TRANSACTIONID;

    public IMAGERESPONSE() {
    }

    public IMAGERESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE,
           java.lang.String TRANSACTIONID) {
        super(
            RESPONSE_CODE,
            RESPONSE_REASON_CODE,
            RESPONSE_REASON_TEXT,
            RESPONSE_SUBCODE);
        this.TRANSACTIONID = TRANSACTIONID;
    }


    /**
     * Gets the TRANSACTIONID value for this IMAGERESPONSE.
     * 
     * @return TRANSACTIONID
     */
    public java.lang.String getTRANSACTIONID() {
        return TRANSACTIONID;
    }


    /**
     * Sets the TRANSACTIONID value for this IMAGERESPONSE.
     * 
     * @param TRANSACTIONID
     */
    public void setTRANSACTIONID(java.lang.String TRANSACTIONID) {
        this.TRANSACTIONID = TRANSACTIONID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMAGERESPONSE)) return false;
        IMAGERESPONSE other = (IMAGERESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.TRANSACTIONID==null && other.getTRANSACTIONID()==null) || 
             (this.TRANSACTIONID!=null &&
              this.TRANSACTIONID.equals(other.getTRANSACTIONID())));
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
        if (getTRANSACTIONID() != null) {
            _hashCode += getTRANSACTIONID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IMAGERESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "IMAGERESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONID"));
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
