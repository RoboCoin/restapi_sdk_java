/**
 * CUSTOMER_VAULT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class CUSTOMER_VAULT  implements java.io.Serializable {
    private int CSDI;

    private java.lang.String CUSTOMERID;

    private com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL;

    private java.lang.String NOTES;

    private com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED;

    public CUSTOMER_VAULT() {
    }

    public CUSTOMER_VAULT(
           int CSDI,
           java.lang.String CUSTOMERID,
           com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL,
           java.lang.String NOTES,
           com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED) {
           this.CSDI = CSDI;
           this.CUSTOMERID = CUSTOMERID;
           this.CUSTOMER_BILL = CUSTOMER_BILL;
           this.NOTES = NOTES;
           this.USERDEFINED = USERDEFINED;
    }


    /**
     * Gets the CSDI value for this CUSTOMER_VAULT.
     * 
     * @return CSDI
     */
    public int getCSDI() {
        return CSDI;
    }


    /**
     * Sets the CSDI value for this CUSTOMER_VAULT.
     * 
     * @param CSDI
     */
    public void setCSDI(int CSDI) {
        this.CSDI = CSDI;
    }


    /**
     * Gets the CUSTOMERID value for this CUSTOMER_VAULT.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this CUSTOMER_VAULT.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the CUSTOMER_BILL value for this CUSTOMER_VAULT.
     * 
     * @return CUSTOMER_BILL
     */
    public com.securenet.gateway.API.Contracts.CUSTOMER_BILL getCUSTOMER_BILL() {
        return CUSTOMER_BILL;
    }


    /**
     * Sets the CUSTOMER_BILL value for this CUSTOMER_VAULT.
     * 
     * @param CUSTOMER_BILL
     */
    public void setCUSTOMER_BILL(com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL) {
        this.CUSTOMER_BILL = CUSTOMER_BILL;
    }


    /**
     * Gets the NOTES value for this CUSTOMER_VAULT.
     * 
     * @return NOTES
     */
    public java.lang.String getNOTES() {
        return NOTES;
    }


    /**
     * Sets the NOTES value for this CUSTOMER_VAULT.
     * 
     * @param NOTES
     */
    public void setNOTES(java.lang.String NOTES) {
        this.NOTES = NOTES;
    }


    /**
     * Gets the USERDEFINED value for this CUSTOMER_VAULT.
     * 
     * @return USERDEFINED
     */
    public com.securenet.gateway.API.Contracts.USERDEFINED getUSERDEFINED() {
        return USERDEFINED;
    }


    /**
     * Sets the USERDEFINED value for this CUSTOMER_VAULT.
     * 
     * @param USERDEFINED
     */
    public void setUSERDEFINED(com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED) {
        this.USERDEFINED = USERDEFINED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CUSTOMER_VAULT)) return false;
        CUSTOMER_VAULT other = (CUSTOMER_VAULT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CSDI == other.getCSDI() &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.CUSTOMER_BILL==null && other.getCUSTOMER_BILL()==null) || 
             (this.CUSTOMER_BILL!=null &&
              this.CUSTOMER_BILL.equals(other.getCUSTOMER_BILL()))) &&
            ((this.NOTES==null && other.getNOTES()==null) || 
             (this.NOTES!=null &&
              this.NOTES.equals(other.getNOTES()))) &&
            ((this.USERDEFINED==null && other.getUSERDEFINED()==null) || 
             (this.USERDEFINED!=null &&
              this.USERDEFINED.equals(other.getUSERDEFINED())));
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
        _hashCode += getCSDI();
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getCUSTOMER_BILL() != null) {
            _hashCode += getCUSTOMER_BILL().hashCode();
        }
        if (getNOTES() != null) {
            _hashCode += getNOTES().hashCode();
        }
        if (getUSERDEFINED() != null) {
            _hashCode += getUSERDEFINED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CUSTOMER_VAULT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_VAULT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSDI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CSDI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMER_BILL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NOTES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USERDEFINED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "USERDEFINED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "USERDEFINED"));
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
