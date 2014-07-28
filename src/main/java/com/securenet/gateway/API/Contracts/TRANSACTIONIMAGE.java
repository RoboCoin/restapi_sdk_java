/**
 * TRANSACTIONIMAGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class TRANSACTIONIMAGE  implements java.io.Serializable {
    private com.securenet.gateway.API.Contracts.CHECKIMAGE CHECKIMAGE;

    private com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANTKEY;

    private byte[] SIGNATURE;

    private java.lang.Integer TRANSACTIONID;

    public TRANSACTIONIMAGE() {
    }

    public TRANSACTIONIMAGE(
           com.securenet.gateway.API.Contracts.CHECKIMAGE CHECKIMAGE,
           com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANTKEY,
           byte[] SIGNATURE,
           java.lang.Integer TRANSACTIONID) {
           this.CHECKIMAGE = CHECKIMAGE;
           this.MERCHANTKEY = MERCHANTKEY;
           this.SIGNATURE = SIGNATURE;
           this.TRANSACTIONID = TRANSACTIONID;
    }


    /**
     * Gets the CHECKIMAGE value for this TRANSACTIONIMAGE.
     * 
     * @return CHECKIMAGE
     */
    public com.securenet.gateway.API.Contracts.CHECKIMAGE getCHECKIMAGE() {
        return CHECKIMAGE;
    }


    /**
     * Sets the CHECKIMAGE value for this TRANSACTIONIMAGE.
     * 
     * @param CHECKIMAGE
     */
    public void setCHECKIMAGE(com.securenet.gateway.API.Contracts.CHECKIMAGE CHECKIMAGE) {
        this.CHECKIMAGE = CHECKIMAGE;
    }


    /**
     * Gets the MERCHANTKEY value for this TRANSACTIONIMAGE.
     * 
     * @return MERCHANTKEY
     */
    public com.securenet.gateway.API.Contracts.MERCHANT_KEY getMERCHANTKEY() {
        return MERCHANTKEY;
    }


    /**
     * Sets the MERCHANTKEY value for this TRANSACTIONIMAGE.
     * 
     * @param MERCHANTKEY
     */
    public void setMERCHANTKEY(com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANTKEY) {
        this.MERCHANTKEY = MERCHANTKEY;
    }


    /**
     * Gets the SIGNATURE value for this TRANSACTIONIMAGE.
     * 
     * @return SIGNATURE
     */
    public byte[] getSIGNATURE() {
        return SIGNATURE;
    }


    /**
     * Sets the SIGNATURE value for this TRANSACTIONIMAGE.
     * 
     * @param SIGNATURE
     */
    public void setSIGNATURE(byte[] SIGNATURE) {
        this.SIGNATURE = SIGNATURE;
    }


    /**
     * Gets the TRANSACTIONID value for this TRANSACTIONIMAGE.
     * 
     * @return TRANSACTIONID
     */
    public java.lang.Integer getTRANSACTIONID() {
        return TRANSACTIONID;
    }


    /**
     * Sets the TRANSACTIONID value for this TRANSACTIONIMAGE.
     * 
     * @param TRANSACTIONID
     */
    public void setTRANSACTIONID(java.lang.Integer TRANSACTIONID) {
        this.TRANSACTIONID = TRANSACTIONID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRANSACTIONIMAGE)) return false;
        TRANSACTIONIMAGE other = (TRANSACTIONIMAGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CHECKIMAGE==null && other.getCHECKIMAGE()==null) || 
             (this.CHECKIMAGE!=null &&
              this.CHECKIMAGE.equals(other.getCHECKIMAGE()))) &&
            ((this.MERCHANTKEY==null && other.getMERCHANTKEY()==null) || 
             (this.MERCHANTKEY!=null &&
              this.MERCHANTKEY.equals(other.getMERCHANTKEY()))) &&
            ((this.SIGNATURE==null && other.getSIGNATURE()==null) || 
             (this.SIGNATURE!=null &&
              java.util.Arrays.equals(this.SIGNATURE, other.getSIGNATURE()))) &&
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
        int _hashCode = 1;
        if (getCHECKIMAGE() != null) {
            _hashCode += getCHECKIMAGE().hashCode();
        }
        if (getMERCHANTKEY() != null) {
            _hashCode += getMERCHANTKEY().hashCode();
        }
        if (getSIGNATURE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSIGNATURE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSIGNATURE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTRANSACTIONID() != null) {
            _hashCode += getTRANSACTIONID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRANSACTIONIMAGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONIMAGE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECKIMAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKIMAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKIMAGE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCHANTKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANTKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGNATURE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SIGNATURE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONID"));
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
