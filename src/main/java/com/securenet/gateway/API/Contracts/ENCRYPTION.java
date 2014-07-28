/**
 * ENCRYPTION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class ENCRYPTION  implements java.io.Serializable {
    private int ENCRYPTIONMODE;

    private java.lang.String KEYID;

    private java.lang.String KSI;

    public ENCRYPTION() {
    }

    public ENCRYPTION(
           int ENCRYPTIONMODE,
           java.lang.String KEYID,
           java.lang.String KSI) {
           this.ENCRYPTIONMODE = ENCRYPTIONMODE;
           this.KEYID = KEYID;
           this.KSI = KSI;
    }


    /**
     * Gets the ENCRYPTIONMODE value for this ENCRYPTION.
     * 
     * @return ENCRYPTIONMODE
     */
    public int getENCRYPTIONMODE() {
        return ENCRYPTIONMODE;
    }


    /**
     * Sets the ENCRYPTIONMODE value for this ENCRYPTION.
     * 
     * @param ENCRYPTIONMODE
     */
    public void setENCRYPTIONMODE(int ENCRYPTIONMODE) {
        this.ENCRYPTIONMODE = ENCRYPTIONMODE;
    }


    /**
     * Gets the KEYID value for this ENCRYPTION.
     * 
     * @return KEYID
     */
    public java.lang.String getKEYID() {
        return KEYID;
    }


    /**
     * Sets the KEYID value for this ENCRYPTION.
     * 
     * @param KEYID
     */
    public void setKEYID(java.lang.String KEYID) {
        this.KEYID = KEYID;
    }


    /**
     * Gets the KSI value for this ENCRYPTION.
     * 
     * @return KSI
     */
    public java.lang.String getKSI() {
        return KSI;
    }


    /**
     * Sets the KSI value for this ENCRYPTION.
     * 
     * @param KSI
     */
    public void setKSI(java.lang.String KSI) {
        this.KSI = KSI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ENCRYPTION)) return false;
        ENCRYPTION other = (ENCRYPTION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ENCRYPTIONMODE == other.getENCRYPTIONMODE() &&
            ((this.KEYID==null && other.getKEYID()==null) || 
             (this.KEYID!=null &&
              this.KEYID.equals(other.getKEYID()))) &&
            ((this.KSI==null && other.getKSI()==null) || 
             (this.KSI!=null &&
              this.KSI.equals(other.getKSI())));
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
        _hashCode += getENCRYPTIONMODE();
        if (getKEYID() != null) {
            _hashCode += getKEYID().hashCode();
        }
        if (getKSI() != null) {
            _hashCode += getKSI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ENCRYPTION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENCRYPTION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENCRYPTIONMODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENCRYPTIONMODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEYID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "KEYID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "KSI"));
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
