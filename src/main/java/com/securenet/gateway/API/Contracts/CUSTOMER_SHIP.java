/**
 * CUSTOMER_SHIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class CUSTOMER_SHIP  implements java.io.Serializable {
    private java.lang.String ADDRESS;

    private java.lang.String CITY;

    private java.lang.String COMPANY;

    private java.lang.String COUNTRY;

    private java.lang.String FIRSTNAME;

    private java.lang.String LASTNAME;

    private java.lang.String STATE;

    private java.lang.String ZIP;

    public CUSTOMER_SHIP() {
    }

    public CUSTOMER_SHIP(
           java.lang.String ADDRESS,
           java.lang.String CITY,
           java.lang.String COMPANY,
           java.lang.String COUNTRY,
           java.lang.String FIRSTNAME,
           java.lang.String LASTNAME,
           java.lang.String STATE,
           java.lang.String ZIP) {
           this.ADDRESS = ADDRESS;
           this.CITY = CITY;
           this.COMPANY = COMPANY;
           this.COUNTRY = COUNTRY;
           this.FIRSTNAME = FIRSTNAME;
           this.LASTNAME = LASTNAME;
           this.STATE = STATE;
           this.ZIP = ZIP;
    }


    /**
     * Gets the ADDRESS value for this CUSTOMER_SHIP.
     * 
     * @return ADDRESS
     */
    public java.lang.String getADDRESS() {
        return ADDRESS;
    }


    /**
     * Sets the ADDRESS value for this CUSTOMER_SHIP.
     * 
     * @param ADDRESS
     */
    public void setADDRESS(java.lang.String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }


    /**
     * Gets the CITY value for this CUSTOMER_SHIP.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this CUSTOMER_SHIP.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }


    /**
     * Gets the COMPANY value for this CUSTOMER_SHIP.
     * 
     * @return COMPANY
     */
    public java.lang.String getCOMPANY() {
        return COMPANY;
    }


    /**
     * Sets the COMPANY value for this CUSTOMER_SHIP.
     * 
     * @param COMPANY
     */
    public void setCOMPANY(java.lang.String COMPANY) {
        this.COMPANY = COMPANY;
    }


    /**
     * Gets the COUNTRY value for this CUSTOMER_SHIP.
     * 
     * @return COUNTRY
     */
    public java.lang.String getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this CUSTOMER_SHIP.
     * 
     * @param COUNTRY
     */
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    /**
     * Gets the FIRSTNAME value for this CUSTOMER_SHIP.
     * 
     * @return FIRSTNAME
     */
    public java.lang.String getFIRSTNAME() {
        return FIRSTNAME;
    }


    /**
     * Sets the FIRSTNAME value for this CUSTOMER_SHIP.
     * 
     * @param FIRSTNAME
     */
    public void setFIRSTNAME(java.lang.String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }


    /**
     * Gets the LASTNAME value for this CUSTOMER_SHIP.
     * 
     * @return LASTNAME
     */
    public java.lang.String getLASTNAME() {
        return LASTNAME;
    }


    /**
     * Sets the LASTNAME value for this CUSTOMER_SHIP.
     * 
     * @param LASTNAME
     */
    public void setLASTNAME(java.lang.String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }


    /**
     * Gets the STATE value for this CUSTOMER_SHIP.
     * 
     * @return STATE
     */
    public java.lang.String getSTATE() {
        return STATE;
    }


    /**
     * Sets the STATE value for this CUSTOMER_SHIP.
     * 
     * @param STATE
     */
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }


    /**
     * Gets the ZIP value for this CUSTOMER_SHIP.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this CUSTOMER_SHIP.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUSTOMER_SHIP)) return false;
        CUSTOMER_SHIP other = (CUSTOMER_SHIP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ADDRESS==null && other.getADDRESS()==null) || 
             (this.ADDRESS!=null &&
              this.ADDRESS.equals(other.getADDRESS()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              this.CITY.equals(other.getCITY()))) &&
            ((this.COMPANY==null && other.getCOMPANY()==null) || 
             (this.COMPANY!=null &&
              this.COMPANY.equals(other.getCOMPANY()))) &&
            ((this.COUNTRY==null && other.getCOUNTRY()==null) || 
             (this.COUNTRY!=null &&
              this.COUNTRY.equals(other.getCOUNTRY()))) &&
            ((this.FIRSTNAME==null && other.getFIRSTNAME()==null) || 
             (this.FIRSTNAME!=null &&
              this.FIRSTNAME.equals(other.getFIRSTNAME()))) &&
            ((this.LASTNAME==null && other.getLASTNAME()==null) || 
             (this.LASTNAME!=null &&
              this.LASTNAME.equals(other.getLASTNAME()))) &&
            ((this.STATE==null && other.getSTATE()==null) || 
             (this.STATE!=null &&
              this.STATE.equals(other.getSTATE()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP())));
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
        if (getADDRESS() != null) {
            _hashCode += getADDRESS().hashCode();
        }
        if (getCITY() != null) {
            _hashCode += getCITY().hashCode();
        }
        if (getCOMPANY() != null) {
            _hashCode += getCOMPANY().hashCode();
        }
        if (getCOUNTRY() != null) {
            _hashCode += getCOUNTRY().hashCode();
        }
        if (getFIRSTNAME() != null) {
            _hashCode += getFIRSTNAME().hashCode();
        }
        if (getLASTNAME() != null) {
            _hashCode += getLASTNAME().hashCode();
        }
        if (getSTATE() != null) {
            _hashCode += getSTATE().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUSTOMER_SHIP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_SHIP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "COMPANY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "COUNTRY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRSTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FIRSTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LASTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "STATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ZIP"));
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
