/**
 * ACCOUNT_VAULT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class ACCOUNT_VAULT  implements java.io.Serializable {
    private int ACDI;

    private com.securenet.gateway.API.Contracts.CARD CARD;

    private com.securenet.gateway.API.Contracts.CHECK CHECK;

    private java.lang.String CUSTOMERID;

    private com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL;

    private java.lang.String METHOD;

    private java.lang.String NOTES;

    private java.lang.String PAYMENTID;

    private java.lang.String PRIMARY;

    private com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED;

    private java.lang.String CARDTYPE;

    private java.lang.String LASTACCESSDATE;

    public ACCOUNT_VAULT() {
    }

    public ACCOUNT_VAULT(
           int ACDI,
           com.securenet.gateway.API.Contracts.CARD CARD,
           com.securenet.gateway.API.Contracts.CHECK CHECK,
           java.lang.String CUSTOMERID,
           com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL,
           java.lang.String METHOD,
           java.lang.String NOTES,
           java.lang.String PAYMENTID,
           java.lang.String PRIMARY,
           com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED,
           java.lang.String CARDTYPE,
           java.lang.String LASTACCESSDATE) {
           this.ACDI = ACDI;
           this.CARD = CARD;
           this.CHECK = CHECK;
           this.CUSTOMERID = CUSTOMERID;
           this.CUSTOMER_BILL = CUSTOMER_BILL;
           this.METHOD = METHOD;
           this.NOTES = NOTES;
           this.PAYMENTID = PAYMENTID;
           this.PRIMARY = PRIMARY;
           this.USERDEFINED = USERDEFINED;
           this.CARDTYPE = CARDTYPE;
           this.LASTACCESSDATE = LASTACCESSDATE;
    }


    /**
     * Gets the ACDI value for this ACCOUNT_VAULT.
     * 
     * @return ACDI
     */
    public int getACDI() {
        return ACDI;
    }


    /**
     * Sets the ACDI value for this ACCOUNT_VAULT.
     * 
     * @param ACDI
     */
    public void setACDI(int ACDI) {
        this.ACDI = ACDI;
    }


    /**
     * Gets the CARD value for this ACCOUNT_VAULT.
     * 
     * @return CARD
     */
    public com.securenet.gateway.API.Contracts.CARD getCARD() {
        return CARD;
    }


    /**
     * Sets the CARD value for this ACCOUNT_VAULT.
     * 
     * @param CARD
     */
    public void setCARD(com.securenet.gateway.API.Contracts.CARD CARD) {
        this.CARD = CARD;
    }


    /**
     * Gets the CHECK value for this ACCOUNT_VAULT.
     * 
     * @return CHECK
     */
    public com.securenet.gateway.API.Contracts.CHECK getCHECK() {
        return CHECK;
    }


    /**
     * Sets the CHECK value for this ACCOUNT_VAULT.
     * 
     * @param CHECK
     */
    public void setCHECK(com.securenet.gateway.API.Contracts.CHECK CHECK) {
        this.CHECK = CHECK;
    }


    /**
     * Gets the CUSTOMERID value for this ACCOUNT_VAULT.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this ACCOUNT_VAULT.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the CUSTOMER_BILL value for this ACCOUNT_VAULT.
     * 
     * @return CUSTOMER_BILL
     */
    public com.securenet.gateway.API.Contracts.CUSTOMER_BILL getCUSTOMER_BILL() {
        return CUSTOMER_BILL;
    }


    /**
     * Sets the CUSTOMER_BILL value for this ACCOUNT_VAULT.
     * 
     * @param CUSTOMER_BILL
     */
    public void setCUSTOMER_BILL(com.securenet.gateway.API.Contracts.CUSTOMER_BILL CUSTOMER_BILL) {
        this.CUSTOMER_BILL = CUSTOMER_BILL;
    }


    /**
     * Gets the METHOD value for this ACCOUNT_VAULT.
     * 
     * @return METHOD
     */
    public java.lang.String getMETHOD() {
        return METHOD;
    }


    /**
     * Sets the METHOD value for this ACCOUNT_VAULT.
     * 
     * @param METHOD
     */
    public void setMETHOD(java.lang.String METHOD) {
        this.METHOD = METHOD;
    }


    /**
     * Gets the NOTES value for this ACCOUNT_VAULT.
     * 
     * @return NOTES
     */
    public java.lang.String getNOTES() {
        return NOTES;
    }


    /**
     * Sets the NOTES value for this ACCOUNT_VAULT.
     * 
     * @param NOTES
     */
    public void setNOTES(java.lang.String NOTES) {
        this.NOTES = NOTES;
    }


    /**
     * Gets the PAYMENTID value for this ACCOUNT_VAULT.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this ACCOUNT_VAULT.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the PRIMARY value for this ACCOUNT_VAULT.
     * 
     * @return PRIMARY
     */
    public java.lang.String getPRIMARY() {
        return PRIMARY;
    }


    /**
     * Sets the PRIMARY value for this ACCOUNT_VAULT.
     * 
     * @param PRIMARY
     */
    public void setPRIMARY(java.lang.String PRIMARY) {
        this.PRIMARY = PRIMARY;
    }


    /**
     * Gets the USERDEFINED value for this ACCOUNT_VAULT.
     * 
     * @return USERDEFINED
     */
    public com.securenet.gateway.API.Contracts.USERDEFINED getUSERDEFINED() {
        return USERDEFINED;
    }


    /**
     * Sets the USERDEFINED value for this ACCOUNT_VAULT.
     * 
     * @param USERDEFINED
     */
    public void setUSERDEFINED(com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED) {
        this.USERDEFINED = USERDEFINED;
    }


    /**
     * Gets the CARDTYPE value for this ACCOUNT_VAULT.
     * 
     * @return CARDTYPE
     */
    public java.lang.String getCARDTYPE() {
        return CARDTYPE;
    }


    /**
     * Sets the CARDTYPE value for this ACCOUNT_VAULT.
     * 
     * @param CARDTYPE
     */
    public void setCARDTYPE(java.lang.String CARDTYPE) {
        this.CARDTYPE = CARDTYPE;
    }


    /**
     * Gets the LASTACCESSDATE value for this ACCOUNT_VAULT.
     * 
     * @return LASTACCESSDATE
     */
    public java.lang.String getLASTACCESSDATE() {
        return LASTACCESSDATE;
    }


    /**
     * Sets the LASTACCESSDATE value for this ACCOUNT_VAULT.
     * 
     * @param LASTACCESSDATE
     */
    public void setLASTACCESSDATE(java.lang.String LASTACCESSDATE) {
        this.LASTACCESSDATE = LASTACCESSDATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ACCOUNT_VAULT)) return false;
        ACCOUNT_VAULT other = (ACCOUNT_VAULT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ACDI == other.getACDI() &&
            ((this.CARD==null && other.getCARD()==null) || 
             (this.CARD!=null &&
              this.CARD.equals(other.getCARD()))) &&
            ((this.CHECK==null && other.getCHECK()==null) || 
             (this.CHECK!=null &&
              this.CHECK.equals(other.getCHECK()))) &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.CUSTOMER_BILL==null && other.getCUSTOMER_BILL()==null) || 
             (this.CUSTOMER_BILL!=null &&
              this.CUSTOMER_BILL.equals(other.getCUSTOMER_BILL()))) &&
            ((this.METHOD==null && other.getMETHOD()==null) || 
             (this.METHOD!=null &&
              this.METHOD.equals(other.getMETHOD()))) &&
            ((this.NOTES==null && other.getNOTES()==null) || 
             (this.NOTES!=null &&
              this.NOTES.equals(other.getNOTES()))) &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.PRIMARY==null && other.getPRIMARY()==null) || 
             (this.PRIMARY!=null &&
              this.PRIMARY.equals(other.getPRIMARY()))) &&
            ((this.USERDEFINED==null && other.getUSERDEFINED()==null) || 
             (this.USERDEFINED!=null &&
              this.USERDEFINED.equals(other.getUSERDEFINED()))) &&
            ((this.CARDTYPE==null && other.getCARDTYPE()==null) || 
             (this.CARDTYPE!=null &&
              this.CARDTYPE.equals(other.getCARDTYPE()))) &&
            ((this.LASTACCESSDATE==null && other.getLASTACCESSDATE()==null) || 
             (this.LASTACCESSDATE!=null &&
              this.LASTACCESSDATE.equals(other.getLASTACCESSDATE())));
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
        _hashCode += getACDI();
        if (getCARD() != null) {
            _hashCode += getCARD().hashCode();
        }
        if (getCHECK() != null) {
            _hashCode += getCHECK().hashCode();
        }
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getCUSTOMER_BILL() != null) {
            _hashCode += getCUSTOMER_BILL().hashCode();
        }
        if (getMETHOD() != null) {
            _hashCode += getMETHOD().hashCode();
        }
        if (getNOTES() != null) {
            _hashCode += getNOTES().hashCode();
        }
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getPRIMARY() != null) {
            _hashCode += getPRIMARY().hashCode();
        }
        if (getUSERDEFINED() != null) {
            _hashCode += getUSERDEFINED().hashCode();
        }
        if (getCARDTYPE() != null) {
            _hashCode += getCARDTYPE().hashCode();
        }
        if (getLASTACCESSDATE() != null) {
            _hashCode += getLASTACCESSDATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ACCOUNT_VAULT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACDI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACDI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHECK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECK"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("METHOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "METHOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("PAYMENTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRIMARY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRIMARY"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTACCESSDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LASTACCESSDATE"));
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
