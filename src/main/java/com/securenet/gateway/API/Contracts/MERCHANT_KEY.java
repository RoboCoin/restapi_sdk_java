/**
 * MERCHANT_KEY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class MERCHANT_KEY  implements java.io.Serializable {
    private int GROUPID;

    private java.lang.String SECUREKEY;

    private int SECURENETID;

    private java.lang.String ADDITIONALINFO;

    public MERCHANT_KEY() {
    }

    public MERCHANT_KEY(
           int GROUPID,
           java.lang.String SECUREKEY,
           int SECURENETID,
           java.lang.String ADDITIONALINFO) {
           this.GROUPID = GROUPID;
           this.SECUREKEY = SECUREKEY;
           this.SECURENETID = SECURENETID;
           this.ADDITIONALINFO = ADDITIONALINFO;
    }


    /**
     * Gets the GROUPID value for this MERCHANT_KEY.
     * 
     * @return GROUPID
     */
    public int getGROUPID() {
        return GROUPID;
    }


    /**
     * Sets the GROUPID value for this MERCHANT_KEY.
     * 
     * @param GROUPID
     */
    public void setGROUPID(int GROUPID) {
        this.GROUPID = GROUPID;
    }


    /**
     * Gets the SECUREKEY value for this MERCHANT_KEY.
     * 
     * @return SECUREKEY
     */
    public java.lang.String getSECUREKEY() {
        return SECUREKEY;
    }


    /**
     * Sets the SECUREKEY value for this MERCHANT_KEY.
     * 
     * @param SECUREKEY
     */
    public void setSECUREKEY(java.lang.String SECUREKEY) {
        this.SECUREKEY = SECUREKEY;
    }


    /**
     * Gets the SECURENETID value for this MERCHANT_KEY.
     * 
     * @return SECURENETID
     */
    public int getSECURENETID() {
        return SECURENETID;
    }


    /**
     * Sets the SECURENETID value for this MERCHANT_KEY.
     * 
     * @param SECURENETID
     */
    public void setSECURENETID(int SECURENETID) {
        this.SECURENETID = SECURENETID;
    }


    /**
     * Gets the ADDITIONALINFO value for this MERCHANT_KEY.
     * 
     * @return ADDITIONALINFO
     */
    public java.lang.String getADDITIONALINFO() {
        return ADDITIONALINFO;
    }


    /**
     * Sets the ADDITIONALINFO value for this MERCHANT_KEY.
     * 
     * @param ADDITIONALINFO
     */
    public void setADDITIONALINFO(java.lang.String ADDITIONALINFO) {
        this.ADDITIONALINFO = ADDITIONALINFO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MERCHANT_KEY)) return false;
        MERCHANT_KEY other = (MERCHANT_KEY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.GROUPID == other.getGROUPID() &&
            ((this.SECUREKEY==null && other.getSECUREKEY()==null) || 
             (this.SECUREKEY!=null &&
              this.SECUREKEY.equals(other.getSECUREKEY()))) &&
            this.SECURENETID == other.getSECURENETID() &&
            ((this.ADDITIONALINFO==null && other.getADDITIONALINFO()==null) || 
             (this.ADDITIONALINFO!=null &&
              this.ADDITIONALINFO.equals(other.getADDITIONALINFO())));
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
        _hashCode += getGROUPID();
        if (getSECUREKEY() != null) {
            _hashCode += getSECUREKEY().hashCode();
        }
        _hashCode += getSECURENETID();
        if (getADDITIONALINFO() != null) {
            _hashCode += getADDITIONALINFO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MERCHANT_KEY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GROUPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GROUPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECUREKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECUREKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECURENETID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECURENETID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDITIONALINFO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDITIONALINFO"));
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
