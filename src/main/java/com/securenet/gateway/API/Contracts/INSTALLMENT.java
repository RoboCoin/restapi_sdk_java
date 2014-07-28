/**
 * INSTALLMENT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class INSTALLMENT  extends com.securenet.gateway.API.Contracts.OPTIONS  implements java.io.Serializable {
    private java.math.BigDecimal AMOUNT;

    private java.lang.String AUTOCALC_OPTION;

    private java.math.BigDecimal BALLOON_AMOUNT;

    private java.lang.Integer BALLOON_OPTION;

    private java.lang.Integer COUNT;

    private java.lang.Integer REMAINDER_OPTION;

    public INSTALLMENT() {
    }

    public INSTALLMENT(
           java.lang.String CYCLE,
           java.lang.Integer DAY,
           java.lang.Integer FREQUENCY,
           java.lang.Integer MONTH,
           java.lang.Integer WEEKDAY,
           java.math.BigDecimal AMOUNT,
           java.lang.String AUTOCALC_OPTION,
           java.math.BigDecimal BALLOON_AMOUNT,
           java.lang.Integer BALLOON_OPTION,
           java.lang.Integer COUNT,
           java.lang.Integer REMAINDER_OPTION) {
        super(
            CYCLE,
            DAY,
            FREQUENCY,
            MONTH,
            WEEKDAY);
        this.AMOUNT = AMOUNT;
        this.AUTOCALC_OPTION = AUTOCALC_OPTION;
        this.BALLOON_AMOUNT = BALLOON_AMOUNT;
        this.BALLOON_OPTION = BALLOON_OPTION;
        this.COUNT = COUNT;
        this.REMAINDER_OPTION = REMAINDER_OPTION;
    }


    /**
     * Gets the AMOUNT value for this INSTALLMENT.
     * 
     * @return AMOUNT
     */
    public java.math.BigDecimal getAMOUNT() {
        return AMOUNT;
    }


    /**
     * Sets the AMOUNT value for this INSTALLMENT.
     * 
     * @param AMOUNT
     */
    public void setAMOUNT(java.math.BigDecimal AMOUNT) {
        this.AMOUNT = AMOUNT;
    }


    /**
     * Gets the AUTOCALC_OPTION value for this INSTALLMENT.
     * 
     * @return AUTOCALC_OPTION
     */
    public java.lang.String getAUTOCALC_OPTION() {
        return AUTOCALC_OPTION;
    }


    /**
     * Sets the AUTOCALC_OPTION value for this INSTALLMENT.
     * 
     * @param AUTOCALC_OPTION
     */
    public void setAUTOCALC_OPTION(java.lang.String AUTOCALC_OPTION) {
        this.AUTOCALC_OPTION = AUTOCALC_OPTION;
    }


    /**
     * Gets the BALLOON_AMOUNT value for this INSTALLMENT.
     * 
     * @return BALLOON_AMOUNT
     */
    public java.math.BigDecimal getBALLOON_AMOUNT() {
        return BALLOON_AMOUNT;
    }


    /**
     * Sets the BALLOON_AMOUNT value for this INSTALLMENT.
     * 
     * @param BALLOON_AMOUNT
     */
    public void setBALLOON_AMOUNT(java.math.BigDecimal BALLOON_AMOUNT) {
        this.BALLOON_AMOUNT = BALLOON_AMOUNT;
    }


    /**
     * Gets the BALLOON_OPTION value for this INSTALLMENT.
     * 
     * @return BALLOON_OPTION
     */
    public java.lang.Integer getBALLOON_OPTION() {
        return BALLOON_OPTION;
    }


    /**
     * Sets the BALLOON_OPTION value for this INSTALLMENT.
     * 
     * @param BALLOON_OPTION
     */
    public void setBALLOON_OPTION(java.lang.Integer BALLOON_OPTION) {
        this.BALLOON_OPTION = BALLOON_OPTION;
    }


    /**
     * Gets the COUNT value for this INSTALLMENT.
     * 
     * @return COUNT
     */
    public java.lang.Integer getCOUNT() {
        return COUNT;
    }


    /**
     * Sets the COUNT value for this INSTALLMENT.
     * 
     * @param COUNT
     */
    public void setCOUNT(java.lang.Integer COUNT) {
        this.COUNT = COUNT;
    }


    /**
     * Gets the REMAINDER_OPTION value for this INSTALLMENT.
     * 
     * @return REMAINDER_OPTION
     */
    public java.lang.Integer getREMAINDER_OPTION() {
        return REMAINDER_OPTION;
    }


    /**
     * Sets the REMAINDER_OPTION value for this INSTALLMENT.
     * 
     * @param REMAINDER_OPTION
     */
    public void setREMAINDER_OPTION(java.lang.Integer REMAINDER_OPTION) {
        this.REMAINDER_OPTION = REMAINDER_OPTION;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSTALLMENT)) return false;
        INSTALLMENT other = (INSTALLMENT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AMOUNT==null && other.getAMOUNT()==null) || 
             (this.AMOUNT!=null &&
              this.AMOUNT.equals(other.getAMOUNT()))) &&
            ((this.AUTOCALC_OPTION==null && other.getAUTOCALC_OPTION()==null) || 
             (this.AUTOCALC_OPTION!=null &&
              this.AUTOCALC_OPTION.equals(other.getAUTOCALC_OPTION()))) &&
            ((this.BALLOON_AMOUNT==null && other.getBALLOON_AMOUNT()==null) || 
             (this.BALLOON_AMOUNT!=null &&
              this.BALLOON_AMOUNT.equals(other.getBALLOON_AMOUNT()))) &&
            ((this.BALLOON_OPTION==null && other.getBALLOON_OPTION()==null) || 
             (this.BALLOON_OPTION!=null &&
              this.BALLOON_OPTION.equals(other.getBALLOON_OPTION()))) &&
            ((this.COUNT==null && other.getCOUNT()==null) || 
             (this.COUNT!=null &&
              this.COUNT.equals(other.getCOUNT()))) &&
            ((this.REMAINDER_OPTION==null && other.getREMAINDER_OPTION()==null) || 
             (this.REMAINDER_OPTION!=null &&
              this.REMAINDER_OPTION.equals(other.getREMAINDER_OPTION())));
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
        if (getAMOUNT() != null) {
            _hashCode += getAMOUNT().hashCode();
        }
        if (getAUTOCALC_OPTION() != null) {
            _hashCode += getAUTOCALC_OPTION().hashCode();
        }
        if (getBALLOON_AMOUNT() != null) {
            _hashCode += getBALLOON_AMOUNT().hashCode();
        }
        if (getBALLOON_OPTION() != null) {
            _hashCode += getBALLOON_OPTION().hashCode();
        }
        if (getCOUNT() != null) {
            _hashCode += getCOUNT().hashCode();
        }
        if (getREMAINDER_OPTION() != null) {
            _hashCode += getREMAINDER_OPTION().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(INSTALLMENT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUTOCALC_OPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTOCALC_OPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BALLOON_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BALLOON_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BALLOON_OPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BALLOON_OPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "COUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMAINDER_OPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "REMAINDER_OPTION"));
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
