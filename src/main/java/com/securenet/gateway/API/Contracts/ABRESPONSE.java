/**
 * ABRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class ABRESPONSE  extends com.securenet.gateway.API.Contracts.RESPONSE  implements java.io.Serializable {
    private java.lang.String CUSTOMERID;

    private java.lang.String PAYMENTID;

    private java.lang.Integer PLANID;

    private com.securenet.gateway.API.Contracts.PAYMENT_AB[] SCHEDULE;

    public ABRESPONSE() {
    }

    public ABRESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE,
           java.lang.String CUSTOMERID,
           java.lang.String PAYMENTID,
           java.lang.Integer PLANID,
           com.securenet.gateway.API.Contracts.PAYMENT_AB[] SCHEDULE) {
        super(
            RESPONSE_CODE,
            RESPONSE_REASON_CODE,
            RESPONSE_REASON_TEXT,
            RESPONSE_SUBCODE);
        this.CUSTOMERID = CUSTOMERID;
        this.PAYMENTID = PAYMENTID;
        this.PLANID = PLANID;
        this.SCHEDULE = SCHEDULE;
    }


    /**
     * Gets the CUSTOMERID value for this ABRESPONSE.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this ABRESPONSE.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the PAYMENTID value for this ABRESPONSE.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this ABRESPONSE.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the PLANID value for this ABRESPONSE.
     * 
     * @return PLANID
     */
    public java.lang.Integer getPLANID() {
        return PLANID;
    }


    /**
     * Sets the PLANID value for this ABRESPONSE.
     * 
     * @param PLANID
     */
    public void setPLANID(java.lang.Integer PLANID) {
        this.PLANID = PLANID;
    }


    /**
     * Gets the SCHEDULE value for this ABRESPONSE.
     * 
     * @return SCHEDULE
     */
    public com.securenet.gateway.API.Contracts.PAYMENT_AB[] getSCHEDULE() {
        return SCHEDULE;
    }


    /**
     * Sets the SCHEDULE value for this ABRESPONSE.
     * 
     * @param SCHEDULE
     */
    public void setSCHEDULE(com.securenet.gateway.API.Contracts.PAYMENT_AB[] SCHEDULE) {
        this.SCHEDULE = SCHEDULE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ABRESPONSE)) return false;
        ABRESPONSE other = (ABRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.PLANID==null && other.getPLANID()==null) || 
             (this.PLANID!=null &&
              this.PLANID.equals(other.getPLANID()))) &&
            ((this.SCHEDULE==null && other.getSCHEDULE()==null) || 
             (this.SCHEDULE!=null &&
              java.util.Arrays.equals(this.SCHEDULE, other.getSCHEDULE())));
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
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getPLANID() != null) {
            _hashCode += getPLANID().hashCode();
        }
        if (getSCHEDULE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSCHEDULE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSCHEDULE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ABRESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLANID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SCHEDULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB"));
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
