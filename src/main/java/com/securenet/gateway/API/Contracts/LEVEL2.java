/**
 * LEVEL2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class LEVEL2  implements java.io.Serializable {
    private java.math.BigDecimal DUTY;

    private java.math.BigDecimal FREIGHT;

    private java.lang.String PONUM;

    private java.math.BigDecimal TAX;

    private java.lang.String TAXFLAG;

    public LEVEL2() {
    }

    public LEVEL2(
           java.math.BigDecimal DUTY,
           java.math.BigDecimal FREIGHT,
           java.lang.String PONUM,
           java.math.BigDecimal TAX,
           java.lang.String TAXFLAG) {
           this.DUTY = DUTY;
           this.FREIGHT = FREIGHT;
           this.PONUM = PONUM;
           this.TAX = TAX;
           this.TAXFLAG = TAXFLAG;
    }


    /**
     * Gets the DUTY value for this LEVEL2.
     * 
     * @return DUTY
     */
    public java.math.BigDecimal getDUTY() {
        return DUTY;
    }


    /**
     * Sets the DUTY value for this LEVEL2.
     * 
     * @param DUTY
     */
    public void setDUTY(java.math.BigDecimal DUTY) {
        this.DUTY = DUTY;
    }


    /**
     * Gets the FREIGHT value for this LEVEL2.
     * 
     * @return FREIGHT
     */
    public java.math.BigDecimal getFREIGHT() {
        return FREIGHT;
    }


    /**
     * Sets the FREIGHT value for this LEVEL2.
     * 
     * @param FREIGHT
     */
    public void setFREIGHT(java.math.BigDecimal FREIGHT) {
        this.FREIGHT = FREIGHT;
    }


    /**
     * Gets the PONUM value for this LEVEL2.
     * 
     * @return PONUM
     */
    public java.lang.String getPONUM() {
        return PONUM;
    }


    /**
     * Sets the PONUM value for this LEVEL2.
     * 
     * @param PONUM
     */
    public void setPONUM(java.lang.String PONUM) {
        this.PONUM = PONUM;
    }


    /**
     * Gets the TAX value for this LEVEL2.
     * 
     * @return TAX
     */
    public java.math.BigDecimal getTAX() {
        return TAX;
    }


    /**
     * Sets the TAX value for this LEVEL2.
     * 
     * @param TAX
     */
    public void setTAX(java.math.BigDecimal TAX) {
        this.TAX = TAX;
    }


    /**
     * Gets the TAXFLAG value for this LEVEL2.
     * 
     * @return TAXFLAG
     */
    public java.lang.String getTAXFLAG() {
        return TAXFLAG;
    }


    /**
     * Sets the TAXFLAG value for this LEVEL2.
     * 
     * @param TAXFLAG
     */
    public void setTAXFLAG(java.lang.String TAXFLAG) {
        this.TAXFLAG = TAXFLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LEVEL2)) return false;
        LEVEL2 other = (LEVEL2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DUTY==null && other.getDUTY()==null) || 
             (this.DUTY!=null &&
              this.DUTY.equals(other.getDUTY()))) &&
            ((this.FREIGHT==null && other.getFREIGHT()==null) || 
             (this.FREIGHT!=null &&
              this.FREIGHT.equals(other.getFREIGHT()))) &&
            ((this.PONUM==null && other.getPONUM()==null) || 
             (this.PONUM!=null &&
              this.PONUM.equals(other.getPONUM()))) &&
            ((this.TAX==null && other.getTAX()==null) || 
             (this.TAX!=null &&
              this.TAX.equals(other.getTAX()))) &&
            ((this.TAXFLAG==null && other.getTAXFLAG()==null) || 
             (this.TAXFLAG!=null &&
              this.TAXFLAG.equals(other.getTAXFLAG())));
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
        if (getDUTY() != null) {
            _hashCode += getDUTY().hashCode();
        }
        if (getFREIGHT() != null) {
            _hashCode += getFREIGHT().hashCode();
        }
        if (getPONUM() != null) {
            _hashCode += getPONUM().hashCode();
        }
        if (getTAX() != null) {
            _hashCode += getTAX().hashCode();
        }
        if (getTAXFLAG() != null) {
            _hashCode += getTAXFLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LEVEL2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DUTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FREIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FREIGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PONUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PONUM"));
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
        elemField.setFieldName("TAXFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXFLAG"));
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
