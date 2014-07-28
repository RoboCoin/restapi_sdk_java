/**
 * CUSTOMER_BILL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class CUSTOMER_BILL  implements java.io.Serializable {
    private java.lang.String ADDRESS;

    private java.lang.String CITY;

    private java.lang.String COMPANY;

    private java.lang.String COUNTRY;

    private java.lang.String EMAIL;

    private java.lang.String EMAILRECEIPT;

    private java.lang.String FIRSTNAME;

    private java.lang.String LASTNAME;

    private java.lang.String PHONE;

    private java.lang.String STATE;

    private java.lang.String ZIP;

    public CUSTOMER_BILL() {
    }

    public CUSTOMER_BILL(
           java.lang.String ADDRESS,
           java.lang.String CITY,
           java.lang.String COMPANY,
           java.lang.String COUNTRY,
           java.lang.String EMAIL,
           java.lang.String EMAILRECEIPT,
           java.lang.String FIRSTNAME,
           java.lang.String LASTNAME,
           java.lang.String PHONE,
           java.lang.String STATE,
           java.lang.String ZIP) {
           this.ADDRESS = ADDRESS;
           this.CITY = CITY;
           this.COMPANY = COMPANY;
           this.COUNTRY = COUNTRY;
           this.EMAIL = EMAIL;
           this.EMAILRECEIPT = EMAILRECEIPT;
           this.FIRSTNAME = FIRSTNAME;
           this.LASTNAME = LASTNAME;
           this.PHONE = PHONE;
           this.STATE = STATE;
           this.ZIP = ZIP;
    }


    /**
     * Gets the ADDRESS value for this CUSTOMER_BILL.
     * 
     * @return ADDRESS
     */
    public java.lang.String getADDRESS() {
        return ADDRESS;
    }


    /**
     * Sets the ADDRESS value for this CUSTOMER_BILL.
     * 
     * @param ADDRESS
     */
    public void setADDRESS(java.lang.String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }


    /**
     * Gets the CITY value for this CUSTOMER_BILL.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this CUSTOMER_BILL.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }


    /**
     * Gets the COMPANY value for this CUSTOMER_BILL.
     * 
     * @return COMPANY
     */
    public java.lang.String getCOMPANY() {
        return COMPANY;
    }


    /**
     * Sets the COMPANY value for this CUSTOMER_BILL.
     * 
     * @param COMPANY
     */
    public void setCOMPANY(java.lang.String COMPANY) {
        this.COMPANY = COMPANY;
    }


    /**
     * Gets the COUNTRY value for this CUSTOMER_BILL.
     * 
     * @return COUNTRY
     */
    public java.lang.String getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this CUSTOMER_BILL.
     * 
     * @param COUNTRY
     */
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    /**
     * Gets the EMAIL value for this CUSTOMER_BILL.
     * 
     * @return EMAIL
     */
    public java.lang.String getEMAIL() {
        return EMAIL;
    }


    /**
     * Sets the EMAIL value for this CUSTOMER_BILL.
     * 
     * @param EMAIL
     */
    public void setEMAIL(java.lang.String EMAIL) {
        this.EMAIL = EMAIL;
    }


    /**
     * Gets the EMAILRECEIPT value for this CUSTOMER_BILL.
     * 
     * @return EMAILRECEIPT
     */
    public java.lang.String getEMAILRECEIPT() {
        return EMAILRECEIPT;
    }


    /**
     * Sets the EMAILRECEIPT value for this CUSTOMER_BILL.
     * 
     * @param EMAILRECEIPT
     */
    public void setEMAILRECEIPT(java.lang.String EMAILRECEIPT) {
        this.EMAILRECEIPT = EMAILRECEIPT;
    }


    /**
     * Gets the FIRSTNAME value for this CUSTOMER_BILL.
     * 
     * @return FIRSTNAME
     */
    public java.lang.String getFIRSTNAME() {
        return FIRSTNAME;
    }


    /**
     * Sets the FIRSTNAME value for this CUSTOMER_BILL.
     * 
     * @param FIRSTNAME
     */
    public void setFIRSTNAME(java.lang.String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }


    /**
     * Gets the LASTNAME value for this CUSTOMER_BILL.
     * 
     * @return LASTNAME
     */
    public java.lang.String getLASTNAME() {
        return LASTNAME;
    }


    /**
     * Sets the LASTNAME value for this CUSTOMER_BILL.
     * 
     * @param LASTNAME
     */
    public void setLASTNAME(java.lang.String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }


    /**
     * Gets the PHONE value for this CUSTOMER_BILL.
     * 
     * @return PHONE
     */
    public java.lang.String getPHONE() {
        return PHONE;
    }


    /**
     * Sets the PHONE value for this CUSTOMER_BILL.
     * 
     * @param PHONE
     */
    public void setPHONE(java.lang.String PHONE) {
        this.PHONE = PHONE;
    }


    /**
     * Gets the STATE value for this CUSTOMER_BILL.
     * 
     * @return STATE
     */
    public java.lang.String getSTATE() {
        return STATE;
    }


    /**
     * Sets the STATE value for this CUSTOMER_BILL.
     * 
     * @param STATE
     */
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }


    /**
     * Gets the ZIP value for this CUSTOMER_BILL.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this CUSTOMER_BILL.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUSTOMER_BILL)) return false;
        CUSTOMER_BILL other = (CUSTOMER_BILL) obj;
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
            ((this.EMAIL==null && other.getEMAIL()==null) || 
             (this.EMAIL!=null &&
              this.EMAIL.equals(other.getEMAIL()))) &&
            ((this.EMAILRECEIPT==null && other.getEMAILRECEIPT()==null) || 
             (this.EMAILRECEIPT!=null &&
              this.EMAILRECEIPT.equals(other.getEMAILRECEIPT()))) &&
            ((this.FIRSTNAME==null && other.getFIRSTNAME()==null) || 
             (this.FIRSTNAME!=null &&
              this.FIRSTNAME.equals(other.getFIRSTNAME()))) &&
            ((this.LASTNAME==null && other.getLASTNAME()==null) || 
             (this.LASTNAME!=null &&
              this.LASTNAME.equals(other.getLASTNAME()))) &&
            ((this.PHONE==null && other.getPHONE()==null) || 
             (this.PHONE!=null &&
              this.PHONE.equals(other.getPHONE()))) &&
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
        if (getEMAIL() != null) {
            _hashCode += getEMAIL().hashCode();
        }
        if (getEMAILRECEIPT() != null) {
            _hashCode += getEMAILRECEIPT().hashCode();
        }
        if (getFIRSTNAME() != null) {
            _hashCode += getFIRSTNAME().hashCode();
        }
        if (getLASTNAME() != null) {
            _hashCode += getLASTNAME().hashCode();
        }
        if (getPHONE() != null) {
            _hashCode += getPHONE().hashCode();
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
        new org.apache.axis.description.TypeDesc(CUSTOMER_BILL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL"));
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
        elemField.setFieldName("EMAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EMAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAILRECEIPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "EMAILRECEIPT"));
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
        elemField.setFieldName("PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PHONE"));
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
