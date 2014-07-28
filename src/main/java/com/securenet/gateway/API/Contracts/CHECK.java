/**
 * CHECK.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class CHECK  implements java.io.Serializable {
    private java.lang.String ABACODE;

    private java.lang.String ACCOUNTNAME;

    private java.lang.String ACCOUNTNUM;

    private java.lang.String ACCOUNTTYPE;

    private java.lang.String BANKNAME;

    private java.lang.String CHECKNUM;

    private java.lang.String MICRDATA;

    private java.lang.String SECCODE;

    private java.lang.String ADDITIONALINFO;

    public CHECK() {
    }

    public CHECK(
           java.lang.String ABACODE,
           java.lang.String ACCOUNTNAME,
           java.lang.String ACCOUNTNUM,
           java.lang.String ACCOUNTTYPE,
           java.lang.String BANKNAME,
           java.lang.String CHECKNUM,
           java.lang.String MICRDATA,
           java.lang.String SECCODE,
           java.lang.String ADDITIONALINFO) {
           this.ABACODE = ABACODE;
           this.ACCOUNTNAME = ACCOUNTNAME;
           this.ACCOUNTNUM = ACCOUNTNUM;
           this.ACCOUNTTYPE = ACCOUNTTYPE;
           this.BANKNAME = BANKNAME;
           this.CHECKNUM = CHECKNUM;
           this.MICRDATA = MICRDATA;
           this.SECCODE = SECCODE;
           this.ADDITIONALINFO = ADDITIONALINFO;
    }


    /**
     * Gets the ABACODE value for this CHECK.
     * 
     * @return ABACODE
     */
    public java.lang.String getABACODE() {
        return ABACODE;
    }


    /**
     * Sets the ABACODE value for this CHECK.
     * 
     * @param ABACODE
     */
    public void setABACODE(java.lang.String ABACODE) {
        this.ABACODE = ABACODE;
    }


    /**
     * Gets the ACCOUNTNAME value for this CHECK.
     * 
     * @return ACCOUNTNAME
     */
    public java.lang.String getACCOUNTNAME() {
        return ACCOUNTNAME;
    }


    /**
     * Sets the ACCOUNTNAME value for this CHECK.
     * 
     * @param ACCOUNTNAME
     */
    public void setACCOUNTNAME(java.lang.String ACCOUNTNAME) {
        this.ACCOUNTNAME = ACCOUNTNAME;
    }


    /**
     * Gets the ACCOUNTNUM value for this CHECK.
     * 
     * @return ACCOUNTNUM
     */
    public java.lang.String getACCOUNTNUM() {
        return ACCOUNTNUM;
    }


    /**
     * Sets the ACCOUNTNUM value for this CHECK.
     * 
     * @param ACCOUNTNUM
     */
    public void setACCOUNTNUM(java.lang.String ACCOUNTNUM) {
        this.ACCOUNTNUM = ACCOUNTNUM;
    }


    /**
     * Gets the ACCOUNTTYPE value for this CHECK.
     * 
     * @return ACCOUNTTYPE
     */
    public java.lang.String getACCOUNTTYPE() {
        return ACCOUNTTYPE;
    }


    /**
     * Sets the ACCOUNTTYPE value for this CHECK.
     * 
     * @param ACCOUNTTYPE
     */
    public void setACCOUNTTYPE(java.lang.String ACCOUNTTYPE) {
        this.ACCOUNTTYPE = ACCOUNTTYPE;
    }


    /**
     * Gets the BANKNAME value for this CHECK.
     * 
     * @return BANKNAME
     */
    public java.lang.String getBANKNAME() {
        return BANKNAME;
    }


    /**
     * Sets the BANKNAME value for this CHECK.
     * 
     * @param BANKNAME
     */
    public void setBANKNAME(java.lang.String BANKNAME) {
        this.BANKNAME = BANKNAME;
    }


    /**
     * Gets the CHECKNUM value for this CHECK.
     * 
     * @return CHECKNUM
     */
    public java.lang.String getCHECKNUM() {
        return CHECKNUM;
    }


    /**
     * Sets the CHECKNUM value for this CHECK.
     * 
     * @param CHECKNUM
     */
    public void setCHECKNUM(java.lang.String CHECKNUM) {
        this.CHECKNUM = CHECKNUM;
    }


    /**
     * Gets the MICRDATA value for this CHECK.
     * 
     * @return MICRDATA
     */
    public java.lang.String getMICRDATA() {
        return MICRDATA;
    }


    /**
     * Sets the MICRDATA value for this CHECK.
     * 
     * @param MICRDATA
     */
    public void setMICRDATA(java.lang.String MICRDATA) {
        this.MICRDATA = MICRDATA;
    }


    /**
     * Gets the SECCODE value for this CHECK.
     * 
     * @return SECCODE
     */
    public java.lang.String getSECCODE() {
        return SECCODE;
    }


    /**
     * Sets the SECCODE value for this CHECK.
     * 
     * @param SECCODE
     */
    public void setSECCODE(java.lang.String SECCODE) {
        this.SECCODE = SECCODE;
    }


    /**
     * Gets the ADDITIONALINFO value for this CHECK.
     * 
     * @return ADDITIONALINFO
     */
    public java.lang.String getADDITIONALINFO() {
        return ADDITIONALINFO;
    }


    /**
     * Sets the ADDITIONALINFO value for this CHECK.
     * 
     * @param ADDITIONALINFO
     */
    public void setADDITIONALINFO(java.lang.String ADDITIONALINFO) {
        this.ADDITIONALINFO = ADDITIONALINFO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CHECK)) return false;
        CHECK other = (CHECK) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ABACODE==null && other.getABACODE()==null) || 
             (this.ABACODE!=null &&
              this.ABACODE.equals(other.getABACODE()))) &&
            ((this.ACCOUNTNAME==null && other.getACCOUNTNAME()==null) || 
             (this.ACCOUNTNAME!=null &&
              this.ACCOUNTNAME.equals(other.getACCOUNTNAME()))) &&
            ((this.ACCOUNTNUM==null && other.getACCOUNTNUM()==null) || 
             (this.ACCOUNTNUM!=null &&
              this.ACCOUNTNUM.equals(other.getACCOUNTNUM()))) &&
            ((this.ACCOUNTTYPE==null && other.getACCOUNTTYPE()==null) || 
             (this.ACCOUNTTYPE!=null &&
              this.ACCOUNTTYPE.equals(other.getACCOUNTTYPE()))) &&
            ((this.BANKNAME==null && other.getBANKNAME()==null) || 
             (this.BANKNAME!=null &&
              this.BANKNAME.equals(other.getBANKNAME()))) &&
            ((this.CHECKNUM==null && other.getCHECKNUM()==null) || 
             (this.CHECKNUM!=null &&
              this.CHECKNUM.equals(other.getCHECKNUM()))) &&
            ((this.MICRDATA==null && other.getMICRDATA()==null) || 
             (this.MICRDATA!=null &&
              this.MICRDATA.equals(other.getMICRDATA()))) &&
            ((this.SECCODE==null && other.getSECCODE()==null) || 
             (this.SECCODE!=null &&
              this.SECCODE.equals(other.getSECCODE()))) &&
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
        if (getABACODE() != null) {
            _hashCode += getABACODE().hashCode();
        }
        if (getACCOUNTNAME() != null) {
            _hashCode += getACCOUNTNAME().hashCode();
        }
        if (getACCOUNTNUM() != null) {
            _hashCode += getACCOUNTNUM().hashCode();
        }
        if (getACCOUNTTYPE() != null) {
            _hashCode += getACCOUNTTYPE().hashCode();
        }
        if (getBANKNAME() != null) {
            _hashCode += getBANKNAME().hashCode();
        }
        if (getCHECKNUM() != null) {
            _hashCode += getCHECKNUM().hashCode();
        }
        if (getMICRDATA() != null) {
            _hashCode += getMICRDATA().hashCode();
        }
        if (getSECCODE() != null) {
            _hashCode += getSECCODE().hashCode();
        }
        if (getADDITIONALINFO() != null) {
            _hashCode += getADDITIONALINFO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CHECK.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECK"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABACODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ABACODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNTNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNTTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BANKNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECKNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MICRDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MICRDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECCODE"));
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
