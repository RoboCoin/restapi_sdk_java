/**
 * P2PRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class P2PRESPONSE  extends com.securenet.gateway.API.Contracts.RESPONSE  implements java.io.Serializable {
    private java.lang.String CONFIRMCODE;

    private java.lang.Long CONFIRMNUMBER;

    private java.lang.String EXPDATE;

    private com.securenet.gateway.API.Contracts.P2P_PUBLIC_KEY KEY;

    private java.lang.Integer KEYID;

    private java.lang.Integer STATUS;

    public P2PRESPONSE() {
    }

    public P2PRESPONSE(
           java.lang.String RESPONSE_CODE,
           java.lang.String RESPONSE_REASON_CODE,
           java.lang.String RESPONSE_REASON_TEXT,
           java.lang.String RESPONSE_SUBCODE,
           java.lang.String CONFIRMCODE,
           java.lang.Long CONFIRMNUMBER,
           java.lang.String EXPDATE,
           com.securenet.gateway.API.Contracts.P2P_PUBLIC_KEY KEY,
           java.lang.Integer KEYID,
           java.lang.Integer STATUS) {
        super(
            RESPONSE_CODE,
            RESPONSE_REASON_CODE,
            RESPONSE_REASON_TEXT,
            RESPONSE_SUBCODE);
        this.CONFIRMCODE = CONFIRMCODE;
        this.CONFIRMNUMBER = CONFIRMNUMBER;
        this.EXPDATE = EXPDATE;
        this.KEY = KEY;
        this.KEYID = KEYID;
        this.STATUS = STATUS;
    }


    /**
     * Gets the CONFIRMCODE value for this P2PRESPONSE.
     * 
     * @return CONFIRMCODE
     */
    public java.lang.String getCONFIRMCODE() {
        return CONFIRMCODE;
    }


    /**
     * Sets the CONFIRMCODE value for this P2PRESPONSE.
     * 
     * @param CONFIRMCODE
     */
    public void setCONFIRMCODE(java.lang.String CONFIRMCODE) {
        this.CONFIRMCODE = CONFIRMCODE;
    }


    /**
     * Gets the CONFIRMNUMBER value for this P2PRESPONSE.
     * 
     * @return CONFIRMNUMBER
     */
    public java.lang.Long getCONFIRMNUMBER() {
        return CONFIRMNUMBER;
    }


    /**
     * Sets the CONFIRMNUMBER value for this P2PRESPONSE.
     * 
     * @param CONFIRMNUMBER
     */
    public void setCONFIRMNUMBER(java.lang.Long CONFIRMNUMBER) {
        this.CONFIRMNUMBER = CONFIRMNUMBER;
    }


    /**
     * Gets the EXPDATE value for this P2PRESPONSE.
     * 
     * @return EXPDATE
     */
    public java.lang.String getEXPDATE() {
        return EXPDATE;
    }


    /**
     * Sets the EXPDATE value for this P2PRESPONSE.
     * 
     * @param EXPDATE
     */
    public void setEXPDATE(java.lang.String EXPDATE) {
        this.EXPDATE = EXPDATE;
    }


    /**
     * Gets the KEY value for this P2PRESPONSE.
     * 
     * @return KEY
     */
    public com.securenet.gateway.API.Contracts.P2P_PUBLIC_KEY getKEY() {
        return KEY;
    }


    /**
     * Sets the KEY value for this P2PRESPONSE.
     * 
     * @param KEY
     */
    public void setKEY(com.securenet.gateway.API.Contracts.P2P_PUBLIC_KEY KEY) {
        this.KEY = KEY;
    }


    /**
     * Gets the KEYID value for this P2PRESPONSE.
     * 
     * @return KEYID
     */
    public java.lang.Integer getKEYID() {
        return KEYID;
    }


    /**
     * Sets the KEYID value for this P2PRESPONSE.
     * 
     * @param KEYID
     */
    public void setKEYID(java.lang.Integer KEYID) {
        this.KEYID = KEYID;
    }


    /**
     * Gets the STATUS value for this P2PRESPONSE.
     * 
     * @return STATUS
     */
    public java.lang.Integer getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this P2PRESPONSE.
     * 
     * @param STATUS
     */
    public void setSTATUS(java.lang.Integer STATUS) {
        this.STATUS = STATUS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof P2PRESPONSE)) return false;
        P2PRESPONSE other = (P2PRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.CONFIRMCODE==null && other.getCONFIRMCODE()==null) || 
             (this.CONFIRMCODE!=null &&
              this.CONFIRMCODE.equals(other.getCONFIRMCODE()))) &&
            ((this.CONFIRMNUMBER==null && other.getCONFIRMNUMBER()==null) || 
             (this.CONFIRMNUMBER!=null &&
              this.CONFIRMNUMBER.equals(other.getCONFIRMNUMBER()))) &&
            ((this.EXPDATE==null && other.getEXPDATE()==null) || 
             (this.EXPDATE!=null &&
              this.EXPDATE.equals(other.getEXPDATE()))) &&
            ((this.KEY==null && other.getKEY()==null) || 
             (this.KEY!=null &&
              this.KEY.equals(other.getKEY()))) &&
            ((this.KEYID==null && other.getKEYID()==null) || 
             (this.KEYID!=null &&
              this.KEYID.equals(other.getKEYID()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS())));
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
        if (getCONFIRMCODE() != null) {
            _hashCode += getCONFIRMCODE().hashCode();
        }
        if (getCONFIRMNUMBER() != null) {
            _hashCode += getCONFIRMNUMBER().hashCode();
        }
        if (getEXPDATE() != null) {
            _hashCode += getEXPDATE().hashCode();
        }
        if (getKEY() != null) {
            _hashCode += getKEY().hashCode();
        }
        if (getKEYID() != null) {
            _hashCode += getKEYID().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(P2PRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PRESPONSE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONFIRMCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CONFIRMCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONFIRMNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CONFIRMNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EXPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2P_PUBLIC_KEY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEYID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "KEYID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "STATUS"));
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
