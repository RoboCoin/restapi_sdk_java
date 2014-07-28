/**
 * CARD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class CARD  implements java.io.Serializable {
    private java.lang.String CARDCODE;

    private java.lang.String CARDNUMBER;

    private java.lang.String EXPDATE;

    private java.lang.String KSN;

    private java.lang.String PINBLOCK;

    private java.lang.String TRACKDATA;

    private java.lang.String ADDITIONALINFO;

    public CARD() {
    }

    public CARD(
           java.lang.String CARDCODE,
           java.lang.String CARDNUMBER,
           java.lang.String EXPDATE,
           java.lang.String KSN,
           java.lang.String PINBLOCK,
           java.lang.String TRACKDATA,
           java.lang.String ADDITIONALINFO) {
           this.CARDCODE = CARDCODE;
           this.CARDNUMBER = CARDNUMBER;
           this.EXPDATE = EXPDATE;
           this.KSN = KSN;
           this.PINBLOCK = PINBLOCK;
           this.TRACKDATA = TRACKDATA;
           this.ADDITIONALINFO = ADDITIONALINFO;
    }


    /**
     * Gets the CARDCODE value for this CARD.
     * 
     * @return CARDCODE
     */
    public java.lang.String getCARDCODE() {
        return CARDCODE;
    }


    /**
     * Sets the CARDCODE value for this CARD.
     * 
     * @param CARDCODE
     */
    public void setCARDCODE(java.lang.String CARDCODE) {
        this.CARDCODE = CARDCODE;
    }


    /**
     * Gets the CARDNUMBER value for this CARD.
     * 
     * @return CARDNUMBER
     */
    public java.lang.String getCARDNUMBER() {
        return CARDNUMBER;
    }


    /**
     * Sets the CARDNUMBER value for this CARD.
     * 
     * @param CARDNUMBER
     */
    public void setCARDNUMBER(java.lang.String CARDNUMBER) {
        this.CARDNUMBER = CARDNUMBER;
    }


    /**
     * Gets the EXPDATE value for this CARD.
     * 
     * @return EXPDATE
     */
    public java.lang.String getEXPDATE() {
        return EXPDATE;
    }


    /**
     * Sets the EXPDATE value for this CARD.
     * 
     * @param EXPDATE
     */
    public void setEXPDATE(java.lang.String EXPDATE) {
        this.EXPDATE = EXPDATE;
    }


    /**
     * Gets the KSN value for this CARD.
     * 
     * @return KSN
     */
    public java.lang.String getKSN() {
        return KSN;
    }


    /**
     * Sets the KSN value for this CARD.
     * 
     * @param KSN
     */
    public void setKSN(java.lang.String KSN) {
        this.KSN = KSN;
    }


    /**
     * Gets the PINBLOCK value for this CARD.
     * 
     * @return PINBLOCK
     */
    public java.lang.String getPINBLOCK() {
        return PINBLOCK;
    }


    /**
     * Sets the PINBLOCK value for this CARD.
     * 
     * @param PINBLOCK
     */
    public void setPINBLOCK(java.lang.String PINBLOCK) {
        this.PINBLOCK = PINBLOCK;
    }


    /**
     * Gets the TRACKDATA value for this CARD.
     * 
     * @return TRACKDATA
     */
    public java.lang.String getTRACKDATA() {
        return TRACKDATA;
    }


    /**
     * Sets the TRACKDATA value for this CARD.
     * 
     * @param TRACKDATA
     */
    public void setTRACKDATA(java.lang.String TRACKDATA) {
        this.TRACKDATA = TRACKDATA;
    }


    /**
     * Gets the ADDITIONALINFO value for this CARD.
     * 
     * @return ADDITIONALINFO
     */
    public java.lang.String getADDITIONALINFO() {
        return ADDITIONALINFO;
    }


    /**
     * Sets the ADDITIONALINFO value for this CARD.
     * 
     * @param ADDITIONALINFO
     */
    public void setADDITIONALINFO(java.lang.String ADDITIONALINFO) {
        this.ADDITIONALINFO = ADDITIONALINFO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CARD)) return false;
        CARD other = (CARD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CARDCODE==null && other.getCARDCODE()==null) || 
             (this.CARDCODE!=null &&
              this.CARDCODE.equals(other.getCARDCODE()))) &&
            ((this.CARDNUMBER==null && other.getCARDNUMBER()==null) || 
             (this.CARDNUMBER!=null &&
              this.CARDNUMBER.equals(other.getCARDNUMBER()))) &&
            ((this.EXPDATE==null && other.getEXPDATE()==null) || 
             (this.EXPDATE!=null &&
              this.EXPDATE.equals(other.getEXPDATE()))) &&
            ((this.KSN==null && other.getKSN()==null) || 
             (this.KSN!=null &&
              this.KSN.equals(other.getKSN()))) &&
            ((this.PINBLOCK==null && other.getPINBLOCK()==null) || 
             (this.PINBLOCK!=null &&
              this.PINBLOCK.equals(other.getPINBLOCK()))) &&
            ((this.TRACKDATA==null && other.getTRACKDATA()==null) || 
             (this.TRACKDATA!=null &&
              this.TRACKDATA.equals(other.getTRACKDATA()))) &&
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
        if (getCARDCODE() != null) {
            _hashCode += getCARDCODE().hashCode();
        }
        if (getCARDNUMBER() != null) {
            _hashCode += getCARDNUMBER().hashCode();
        }
        if (getEXPDATE() != null) {
            _hashCode += getEXPDATE().hashCode();
        }
        if (getKSN() != null) {
            _hashCode += getKSN().hashCode();
        }
        if (getPINBLOCK() != null) {
            _hashCode += getPINBLOCK().hashCode();
        }
        if (getTRACKDATA() != null) {
            _hashCode += getTRACKDATA().hashCode();
        }
        if (getADDITIONALINFO() != null) {
            _hashCode += getADDITIONALINFO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CARD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EXPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KSN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "KSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINBLOCK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PINBLOCK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRACKDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRACKDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
