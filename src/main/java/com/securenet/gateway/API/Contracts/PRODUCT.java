/**
 * PRODUCT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class PRODUCT  implements java.io.Serializable {
    private java.math.BigDecimal AMOUNT;

    private java.lang.String CODE;

    private java.lang.String DESCRIPTION;

    private java.lang.String NAME;

    private java.lang.String QUANTITY;

    private java.math.BigDecimal TAX;

    private java.lang.String TAXABLE;

    private java.lang.String UNIT;

    private java.math.BigDecimal UNITPRICE;

    public PRODUCT() {
    }

    public PRODUCT(
           java.math.BigDecimal AMOUNT,
           java.lang.String CODE,
           java.lang.String DESCRIPTION,
           java.lang.String NAME,
           java.lang.String QUANTITY,
           java.math.BigDecimal TAX,
           java.lang.String TAXABLE,
           java.lang.String UNIT,
           java.math.BigDecimal UNITPRICE) {
           this.AMOUNT = AMOUNT;
           this.CODE = CODE;
           this.DESCRIPTION = DESCRIPTION;
           this.NAME = NAME;
           this.QUANTITY = QUANTITY;
           this.TAX = TAX;
           this.TAXABLE = TAXABLE;
           this.UNIT = UNIT;
           this.UNITPRICE = UNITPRICE;
    }


    /**
     * Gets the AMOUNT value for this PRODUCT.
     * 
     * @return AMOUNT
     */
    public java.math.BigDecimal getAMOUNT() {
        return AMOUNT;
    }


    /**
     * Sets the AMOUNT value for this PRODUCT.
     * 
     * @param AMOUNT
     */
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }


    /**
     * Gets the CODE value for this PRODUCT.
     * 
     * @return CODE
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this PRODUCT.
     * 
     * @param CODE
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }


    /**
     * Gets the DESCRIPTION value for this PRODUCT.
     * 
     * @return DESCRIPTION
     */
    public java.lang.String getDESCRIPTION() {
        return DESCRIPTION;
    }


    /**
     * Sets the DESCRIPTION value for this PRODUCT.
     * 
     * @param DESCRIPTION
     */
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }


    /**
     * Gets the NAME value for this PRODUCT.
     * 
     * @return NAME
     */
    public java.lang.String getNAME() {
        return NAME;
    }


    /**
     * Sets the NAME value for this PRODUCT.
     * 
     * @param NAME
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }


    /**
     * Gets the QUANTITY value for this PRODUCT.
     * 
     * @return QUANTITY
     */
    public java.lang.String getQUANTITY() {
        return QUANTITY;
    }


    /**
     * Sets the QUANTITY value for this PRODUCT.
     * 
     * @param QUANTITY
     */
    public void setQUANTITY(java.lang.String QUANTITY) {
        this.QUANTITY = QUANTITY;
    }


    /**
     * Gets the TAX value for this PRODUCT.
     * 
     * @return TAX
     */
    public java.math.BigDecimal getTAX() {
        return TAX;
    }


    /**
     * Sets the TAX value for this PRODUCT.
     * 
     * @param TAX
     */
    public void setTAX(java.math.BigDecimal TAX) {
        this.TAX = TAX;
    }


    /**
     * Gets the TAXABLE value for this PRODUCT.
     * 
     * @return TAXABLE
     */
    public java.lang.String getTAXABLE() {
        return TAXABLE;
    }


    /**
     * Sets the TAXABLE value for this PRODUCT.
     * 
     * @param TAXABLE
     */
    public void setTAXABLE(java.lang.String TAXABLE) {
        this.TAXABLE = TAXABLE;
    }


    /**
     * Gets the UNIT value for this PRODUCT.
     * 
     * @return UNIT
     */
    public java.lang.String getUNIT() {
        return UNIT;
    }


    /**
     * Sets the UNIT value for this PRODUCT.
     * 
     * @param UNIT
     */
    public void setUNIT(java.lang.String UNIT) {
        this.UNIT = UNIT;
    }


    /**
     * Gets the UNITPRICE value for this PRODUCT.
     * 
     * @return UNITPRICE
     */
    public java.math.BigDecimal getUNITPRICE() {
        return UNITPRICE;
    }


    /**
     * Sets the UNITPRICE value for this PRODUCT.
     * 
     * @param UNITPRICE
     */
    public void setUNITPRICE(java.math.BigDecimal UNITPRICE) {
        this.UNITPRICE = UNITPRICE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRODUCT)) return false;
        PRODUCT other = (PRODUCT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AMOUNT==null && other.getAMOUNT()==null) || 
             (this.AMOUNT!=null &&
              this.AMOUNT.equals(other.getAMOUNT()))) &&
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE()))) &&
            ((this.DESCRIPTION==null && other.getDESCRIPTION()==null) || 
             (this.DESCRIPTION!=null &&
              this.DESCRIPTION.equals(other.getDESCRIPTION()))) &&
            ((this.NAME==null && other.getNAME()==null) || 
             (this.NAME!=null &&
              this.NAME.equals(other.getNAME()))) &&
            ((this.QUANTITY==null && other.getQUANTITY()==null) || 
             (this.QUANTITY!=null &&
              this.QUANTITY.equals(other.getQUANTITY()))) &&
            ((this.TAX==null && other.getTAX()==null) || 
             (this.TAX!=null &&
              this.TAX.equals(other.getTAX()))) &&
            ((this.TAXABLE==null && other.getTAXABLE()==null) || 
             (this.TAXABLE!=null &&
              this.TAXABLE.equals(other.getTAXABLE()))) &&
            ((this.UNIT==null && other.getUNIT()==null) || 
             (this.UNIT!=null &&
              this.UNIT.equals(other.getUNIT()))) &&
            ((this.UNITPRICE==null && other.getUNITPRICE()==null) || 
             (this.UNITPRICE!=null &&
              this.UNITPRICE.equals(other.getUNITPRICE())));
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
        if (getAMOUNT() != null) {
            _hashCode += getAMOUNT().hashCode();
        }
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        if (getDESCRIPTION() != null) {
            _hashCode += getDESCRIPTION().hashCode();
        }
        if (getNAME() != null) {
            _hashCode += getNAME().hashCode();
        }
        if (getQUANTITY() != null) {
            _hashCode += getQUANTITY().hashCode();
        }
        if (getTAX() != null) {
            _hashCode += getTAX().hashCode();
        }
        if (getTAXABLE() != null) {
            _hashCode += getTAXABLE().hashCode();
        }
        if (getUNIT() != null) {
            _hashCode += getUNIT().hashCode();
        }
        if (getUNITPRICE() != null) {
            _hashCode += getUNITPRICE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRODUCT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DESCRIPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "QUANTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXABLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXABLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNITPRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UNITPRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
