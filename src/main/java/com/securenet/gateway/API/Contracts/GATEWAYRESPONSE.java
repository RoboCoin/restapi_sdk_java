/**
 * GATEWAYRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class GATEWAYRESPONSE  implements java.io.Serializable {
    private com.securenet.gateway.API.Contracts.ABRESPONSE ABRESPONSE;

    private com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE TRANSACTIONRESPONSE;

    private com.securenet.gateway.API.Contracts.VAULTACCOUNTRESPONSE VAULTACCOUNTRESPONSE;

    private com.securenet.gateway.API.Contracts.VAULTCUSTOMERRESPONSE VAULTCUSTOMERRESPONSE;

    public GATEWAYRESPONSE() {
    }

    public GATEWAYRESPONSE(
           com.securenet.gateway.API.Contracts.ABRESPONSE ABRESPONSE,
           com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE TRANSACTIONRESPONSE,
           com.securenet.gateway.API.Contracts.VAULTACCOUNTRESPONSE VAULTACCOUNTRESPONSE,
           com.securenet.gateway.API.Contracts.VAULTCUSTOMERRESPONSE VAULTCUSTOMERRESPONSE) {
           this.ABRESPONSE = ABRESPONSE;
           this.TRANSACTIONRESPONSE = TRANSACTIONRESPONSE;
           this.VAULTACCOUNTRESPONSE = VAULTACCOUNTRESPONSE;
           this.VAULTCUSTOMERRESPONSE = VAULTCUSTOMERRESPONSE;
    }


    /**
     * Gets the ABRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @return ABRESPONSE
     */
    public com.securenet.gateway.API.Contracts.ABRESPONSE getABRESPONSE() {
        return ABRESPONSE;
    }


    /**
     * Sets the ABRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @param ABRESPONSE
     */
    public void setABRESPONSE(com.securenet.gateway.API.Contracts.ABRESPONSE ABRESPONSE) {
        this.ABRESPONSE = ABRESPONSE;
    }


    /**
     * Gets the TRANSACTIONRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @return TRANSACTIONRESPONSE
     */
    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTRANSACTIONRESPONSE() {
        return TRANSACTIONRESPONSE;
    }


    /**
     * Sets the TRANSACTIONRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @param TRANSACTIONRESPONSE
     */
    public void setTRANSACTIONRESPONSE(com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE TRANSACTIONRESPONSE) {
        this.TRANSACTIONRESPONSE = TRANSACTIONRESPONSE;
    }


    /**
     * Gets the VAULTACCOUNTRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @return VAULTACCOUNTRESPONSE
     */
    public com.securenet.gateway.API.Contracts.VAULTACCOUNTRESPONSE getVAULTACCOUNTRESPONSE() {
        return VAULTACCOUNTRESPONSE;
    }


    /**
     * Sets the VAULTACCOUNTRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @param VAULTACCOUNTRESPONSE
     */
    public void setVAULTACCOUNTRESPONSE(com.securenet.gateway.API.Contracts.VAULTACCOUNTRESPONSE VAULTACCOUNTRESPONSE) {
        this.VAULTACCOUNTRESPONSE = VAULTACCOUNTRESPONSE;
    }


    /**
     * Gets the VAULTCUSTOMERRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @return VAULTCUSTOMERRESPONSE
     */
    public com.securenet.gateway.API.Contracts.VAULTCUSTOMERRESPONSE getVAULTCUSTOMERRESPONSE() {
        return VAULTCUSTOMERRESPONSE;
    }


    /**
     * Sets the VAULTCUSTOMERRESPONSE value for this GATEWAYRESPONSE.
     * 
     * @param VAULTCUSTOMERRESPONSE
     */
    public void setVAULTCUSTOMERRESPONSE(com.securenet.gateway.API.Contracts.VAULTCUSTOMERRESPONSE VAULTCUSTOMERRESPONSE) {
        this.VAULTCUSTOMERRESPONSE = VAULTCUSTOMERRESPONSE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GATEWAYRESPONSE)) return false;
        GATEWAYRESPONSE other = (GATEWAYRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ABRESPONSE==null && other.getABRESPONSE()==null) || 
             (this.ABRESPONSE!=null &&
              this.ABRESPONSE.equals(other.getABRESPONSE()))) &&
            ((this.TRANSACTIONRESPONSE==null && other.getTRANSACTIONRESPONSE()==null) || 
             (this.TRANSACTIONRESPONSE!=null &&
              this.TRANSACTIONRESPONSE.equals(other.getTRANSACTIONRESPONSE()))) &&
            ((this.VAULTACCOUNTRESPONSE==null && other.getVAULTACCOUNTRESPONSE()==null) || 
             (this.VAULTACCOUNTRESPONSE!=null &&
              this.VAULTACCOUNTRESPONSE.equals(other.getVAULTACCOUNTRESPONSE()))) &&
            ((this.VAULTCUSTOMERRESPONSE==null && other.getVAULTCUSTOMERRESPONSE()==null) || 
             (this.VAULTCUSTOMERRESPONSE!=null &&
              this.VAULTCUSTOMERRESPONSE.equals(other.getVAULTCUSTOMERRESPONSE())));
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
        if (getABRESPONSE() != null) {
            _hashCode += getABRESPONSE().hashCode();
        }
        if (getTRANSACTIONRESPONSE() != null) {
            _hashCode += getTRANSACTIONRESPONSE().hashCode();
        }
        if (getVAULTACCOUNTRESPONSE() != null) {
            _hashCode += getVAULTACCOUNTRESPONSE().hashCode();
        }
        if (getVAULTCUSTOMERRESPONSE() != null) {
            _hashCode += getVAULTCUSTOMERRESPONSE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GATEWAYRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABRESPONSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ABRESPONSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ABRESPONSE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONRESPONSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAULTACCOUNTRESPONSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTACCOUNTRESPONSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTACCOUNTRESPONSE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAULTCUSTOMERRESPONSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTCUSTOMERRESPONSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTCUSTOMERRESPONSE"));
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
