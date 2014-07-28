/**
 * TRANSACTION_VAULT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class TRANSACTION_VAULT  implements java.io.Serializable {
    private com.securenet.gateway.API.Contracts.ACCOUNT_VAULT ACCOUNT_VAULT;

    private com.securenet.gateway.API.Contracts.CUSTOMER_VAULT CUSTOMER_VAULT;

    private com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY;

    private com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS OPERATIONPARAMETERS;

    private com.securenet.gateway.API.Contracts.TRANSACTION TRANSACTION;

    public TRANSACTION_VAULT() {
    }

    public TRANSACTION_VAULT(
           com.securenet.gateway.API.Contracts.ACCOUNT_VAULT ACCOUNT_VAULT,
           com.securenet.gateway.API.Contracts.CUSTOMER_VAULT CUSTOMER_VAULT,
           com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY,
           com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS OPERATIONPARAMETERS,
           com.securenet.gateway.API.Contracts.TRANSACTION TRANSACTION) {
           this.ACCOUNT_VAULT = ACCOUNT_VAULT;
           this.CUSTOMER_VAULT = CUSTOMER_VAULT;
           this.MERCHANT_KEY = MERCHANT_KEY;
           this.OPERATIONPARAMETERS = OPERATIONPARAMETERS;
           this.TRANSACTION = TRANSACTION;
    }


    /**
     * Gets the ACCOUNT_VAULT value for this TRANSACTION_VAULT.
     * 
     * @return ACCOUNT_VAULT
     */
    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT getACCOUNT_VAULT() {
        return ACCOUNT_VAULT;
    }


    /**
     * Sets the ACCOUNT_VAULT value for this TRANSACTION_VAULT.
     * 
     * @param ACCOUNT_VAULT
     */
    public void setACCOUNT_VAULT(com.securenet.gateway.API.Contracts.ACCOUNT_VAULT ACCOUNT_VAULT) {
        this.ACCOUNT_VAULT = ACCOUNT_VAULT;
    }


    /**
     * Gets the CUSTOMER_VAULT value for this TRANSACTION_VAULT.
     * 
     * @return CUSTOMER_VAULT
     */
    public com.securenet.gateway.API.Contracts.CUSTOMER_VAULT getCUSTOMER_VAULT() {
        return CUSTOMER_VAULT;
    }


    /**
     * Sets the CUSTOMER_VAULT value for this TRANSACTION_VAULT.
     * 
     * @param CUSTOMER_VAULT
     */
    public void setCUSTOMER_VAULT(com.securenet.gateway.API.Contracts.CUSTOMER_VAULT CUSTOMER_VAULT) {
        this.CUSTOMER_VAULT = CUSTOMER_VAULT;
    }


    /**
     * Gets the MERCHANT_KEY value for this TRANSACTION_VAULT.
     * 
     * @return MERCHANT_KEY
     */
    public com.securenet.gateway.API.Contracts.MERCHANT_KEY getMERCHANT_KEY() {
        return MERCHANT_KEY;
    }


    /**
     * Sets the MERCHANT_KEY value for this TRANSACTION_VAULT.
     * 
     * @param MERCHANT_KEY
     */
    public void setMERCHANT_KEY(com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY) {
        this.MERCHANT_KEY = MERCHANT_KEY;
    }


    /**
     * Gets the OPERATIONPARAMETERS value for this TRANSACTION_VAULT.
     * 
     * @return OPERATIONPARAMETERS
     */
    public com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS getOPERATIONPARAMETERS() {
        return OPERATIONPARAMETERS;
    }


    /**
     * Sets the OPERATIONPARAMETERS value for this TRANSACTION_VAULT.
     * 
     * @param OPERATIONPARAMETERS
     */
    public void setOPERATIONPARAMETERS(com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS OPERATIONPARAMETERS) {
        this.OPERATIONPARAMETERS = OPERATIONPARAMETERS;
    }


    /**
     * Gets the TRANSACTION value for this TRANSACTION_VAULT.
     * 
     * @return TRANSACTION
     */
    public com.securenet.gateway.API.Contracts.TRANSACTION getTRANSACTION() {
        return TRANSACTION;
    }


    /**
     * Sets the TRANSACTION value for this TRANSACTION_VAULT.
     * 
     * @param TRANSACTION
     */
    public void setTRANSACTION(com.securenet.gateway.API.Contracts.TRANSACTION TRANSACTION) {
        this.TRANSACTION = TRANSACTION;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRANSACTION_VAULT)) return false;
        TRANSACTION_VAULT other = (TRANSACTION_VAULT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACCOUNT_VAULT==null && other.getACCOUNT_VAULT()==null) || 
             (this.ACCOUNT_VAULT!=null &&
              this.ACCOUNT_VAULT.equals(other.getACCOUNT_VAULT()))) &&
            ((this.CUSTOMER_VAULT==null && other.getCUSTOMER_VAULT()==null) || 
             (this.CUSTOMER_VAULT!=null &&
              this.CUSTOMER_VAULT.equals(other.getCUSTOMER_VAULT()))) &&
            ((this.MERCHANT_KEY==null && other.getMERCHANT_KEY()==null) || 
             (this.MERCHANT_KEY!=null &&
              this.MERCHANT_KEY.equals(other.getMERCHANT_KEY()))) &&
            ((this.OPERATIONPARAMETERS==null && other.getOPERATIONPARAMETERS()==null) || 
             (this.OPERATIONPARAMETERS!=null &&
              this.OPERATIONPARAMETERS.equals(other.getOPERATIONPARAMETERS()))) &&
            ((this.TRANSACTION==null && other.getTRANSACTION()==null) || 
             (this.TRANSACTION!=null &&
              this.TRANSACTION.equals(other.getTRANSACTION())));
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
        if (getACCOUNT_VAULT() != null) {
            _hashCode += getACCOUNT_VAULT().hashCode();
        }
        if (getCUSTOMER_VAULT() != null) {
            _hashCode += getCUSTOMER_VAULT().hashCode();
        }
        if (getMERCHANT_KEY() != null) {
            _hashCode += getMERCHANT_KEY().hashCode();
        }
        if (getOPERATIONPARAMETERS() != null) {
            _hashCode += getOPERATIONPARAMETERS().hashCode();
        }
        if (getTRANSACTION() != null) {
            _hashCode += getTRANSACTION().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRANSACTION_VAULT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNT_VAULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMER_VAULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_VAULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_VAULT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCHANT_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OPERATIONPARAMETERS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPERATIONPARAMETERS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPERATIONPARAMETERS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION"));
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
