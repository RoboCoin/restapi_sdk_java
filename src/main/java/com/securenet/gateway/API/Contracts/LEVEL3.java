/**
 * LEVEL3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class LEVEL3  implements java.io.Serializable {
    private java.lang.String COUNTRYCODETO;

    private com.securenet.gateway.API.Contracts.LEVEL3PRODUCT[] LEVEL3PRODUCTS;

    private java.lang.String MERCHANT_VAT_REGISTRATION_NUM;

    private java.math.BigDecimal ORDER_DISCOUNT_AMT;

    private java.lang.String PURCHASER_ORDER_DATE;

    private java.lang.String PURCHASER_VAT_REGISTRATION_NUM;

    private java.lang.String SUMMARY_COMMODITY_CODE;

    private java.math.BigDecimal VATTAX_RATE;

    private java.lang.String ZIPFROM;

    private java.lang.String ZIPTO;

    public LEVEL3() {
    }

    public LEVEL3(
           java.lang.String COUNTRYCODETO,
           com.securenet.gateway.API.Contracts.LEVEL3PRODUCT[] LEVEL3PRODUCTS,
           java.lang.String MERCHANT_VAT_REGISTRATION_NUM,
           java.math.BigDecimal ORDER_DISCOUNT_AMT,
           java.lang.String PURCHASER_ORDER_DATE,
           java.lang.String PURCHASER_VAT_REGISTRATION_NUM,
           java.lang.String SUMMARY_COMMODITY_CODE,
           java.math.BigDecimal VATTAX_RATE,
           java.lang.String ZIPFROM,
           java.lang.String ZIPTO) {
           this.COUNTRYCODETO = COUNTRYCODETO;
           this.LEVEL3PRODUCTS = LEVEL3PRODUCTS;
           this.MERCHANT_VAT_REGISTRATION_NUM = MERCHANT_VAT_REGISTRATION_NUM;
           this.ORDER_DISCOUNT_AMT = ORDER_DISCOUNT_AMT;
           this.PURCHASER_ORDER_DATE = PURCHASER_ORDER_DATE;
           this.PURCHASER_VAT_REGISTRATION_NUM = PURCHASER_VAT_REGISTRATION_NUM;
           this.SUMMARY_COMMODITY_CODE = SUMMARY_COMMODITY_CODE;
           this.VATTAX_RATE = VATTAX_RATE;
           this.ZIPFROM = ZIPFROM;
           this.ZIPTO = ZIPTO;
    }


    /**
     * Gets the COUNTRYCODETO value for this LEVEL3.
     * 
     * @return COUNTRYCODETO
     */
    public java.lang.String getCOUNTRYCODETO() {
        return COUNTRYCODETO;
    }


    /**
     * Sets the COUNTRYCODETO value for this LEVEL3.
     * 
     * @param COUNTRYCODETO
     */
    public void setCOUNTRYCODETO(java.lang.String COUNTRYCODETO) {
        this.COUNTRYCODETO = COUNTRYCODETO;
    }


    /**
     * Gets the LEVEL3PRODUCTS value for this LEVEL3.
     * 
     * @return LEVEL3PRODUCTS
     */
    public com.securenet.gateway.API.Contracts.LEVEL3PRODUCT[] getLEVEL3PRODUCTS() {
        return LEVEL3PRODUCTS;
    }


    /**
     * Sets the LEVEL3PRODUCTS value for this LEVEL3.
     * 
     * @param LEVEL3PRODUCTS
     */
    public void setLEVEL3PRODUCTS(com.securenet.gateway.API.Contracts.LEVEL3PRODUCT[] LEVEL3PRODUCTS) {
        this.LEVEL3PRODUCTS = LEVEL3PRODUCTS;
    }


    /**
     * Gets the MERCHANT_VAT_REGISTRATION_NUM value for this LEVEL3.
     * 
     * @return MERCHANT_VAT_REGISTRATION_NUM
     */
    public java.lang.String getMERCHANT_VAT_REGISTRATION_NUM() {
        return MERCHANT_VAT_REGISTRATION_NUM;
    }


    /**
     * Sets the MERCHANT_VAT_REGISTRATION_NUM value for this LEVEL3.
     * 
     * @param MERCHANT_VAT_REGISTRATION_NUM
     */
    public void setMERCHANT_VAT_REGISTRATION_NUM(java.lang.String MERCHANT_VAT_REGISTRATION_NUM) {
        this.MERCHANT_VAT_REGISTRATION_NUM = MERCHANT_VAT_REGISTRATION_NUM;
    }


    /**
     * Gets the ORDER_DISCOUNT_AMT value for this LEVEL3.
     * 
     * @return ORDER_DISCOUNT_AMT
     */
    public java.math.BigDecimal getORDER_DISCOUNT_AMT() {
        return ORDER_DISCOUNT_AMT;
    }


    /**
     * Sets the ORDER_DISCOUNT_AMT value for this LEVEL3.
     * 
     * @param ORDER_DISCOUNT_AMT
     */
    public void setORDER_DISCOUNT_AMT(java.math.BigDecimal ORDER_DISCOUNT_AMT) {
        this.ORDER_DISCOUNT_AMT = ORDER_DISCOUNT_AMT;
    }


    /**
     * Gets the PURCHASER_ORDER_DATE value for this LEVEL3.
     * 
     * @return PURCHASER_ORDER_DATE
     */
    public java.lang.String getPURCHASER_ORDER_DATE() {
        return PURCHASER_ORDER_DATE;
    }


    /**
     * Sets the PURCHASER_ORDER_DATE value for this LEVEL3.
     * 
     * @param PURCHASER_ORDER_DATE
     */
    public void setPURCHASER_ORDER_DATE(java.lang.String PURCHASER_ORDER_DATE) {
        this.PURCHASER_ORDER_DATE = PURCHASER_ORDER_DATE;
    }


    /**
     * Gets the PURCHASER_VAT_REGISTRATION_NUM value for this LEVEL3.
     * 
     * @return PURCHASER_VAT_REGISTRATION_NUM
     */
    public java.lang.String getPURCHASER_VAT_REGISTRATION_NUM() {
        return PURCHASER_VAT_REGISTRATION_NUM;
    }


    /**
     * Sets the PURCHASER_VAT_REGISTRATION_NUM value for this LEVEL3.
     * 
     * @param PURCHASER_VAT_REGISTRATION_NUM
     */
    public void setPURCHASER_VAT_REGISTRATION_NUM(java.lang.String PURCHASER_VAT_REGISTRATION_NUM) {
        this.PURCHASER_VAT_REGISTRATION_NUM = PURCHASER_VAT_REGISTRATION_NUM;
    }


    /**
     * Gets the SUMMARY_COMMODITY_CODE value for this LEVEL3.
     * 
     * @return SUMMARY_COMMODITY_CODE
     */
    public java.lang.String getSUMMARY_COMMODITY_CODE() {
        return SUMMARY_COMMODITY_CODE;
    }


    /**
     * Sets the SUMMARY_COMMODITY_CODE value for this LEVEL3.
     * 
     * @param SUMMARY_COMMODITY_CODE
     */
    public void setSUMMARY_COMMODITY_CODE(java.lang.String SUMMARY_COMMODITY_CODE) {
        this.SUMMARY_COMMODITY_CODE = SUMMARY_COMMODITY_CODE;
    }


    /**
     * Gets the VATTAX_RATE value for this LEVEL3.
     * 
     * @return VATTAX_RATE
     */
    public java.math.BigDecimal getVATTAX_RATE() {
        return VATTAX_RATE;
    }


    /**
     * Sets the VATTAX_RATE value for this LEVEL3.
     * 
     * @param VATTAX_RATE
     */
    public void setVATTAX_RATE(java.math.BigDecimal VATTAX_RATE) {
        this.VATTAX_RATE = VATTAX_RATE;
    }


    /**
     * Gets the ZIPFROM value for this LEVEL3.
     * 
     * @return ZIPFROM
     */
    public java.lang.String getZIPFROM() {
        return ZIPFROM;
    }


    /**
     * Sets the ZIPFROM value for this LEVEL3.
     * 
     * @param ZIPFROM
     */
    public void setZIPFROM(java.lang.String ZIPFROM) {
        this.ZIPFROM = ZIPFROM;
    }


    /**
     * Gets the ZIPTO value for this LEVEL3.
     * 
     * @return ZIPTO
     */
    public java.lang.String getZIPTO() {
        return ZIPTO;
    }


    /**
     * Sets the ZIPTO value for this LEVEL3.
     * 
     * @param ZIPTO
     */
    public void setZIPTO(java.lang.String ZIPTO) {
        this.ZIPTO = ZIPTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LEVEL3)) return false;
        LEVEL3 other = (LEVEL3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COUNTRYCODETO==null && other.getCOUNTRYCODETO()==null) || 
             (this.COUNTRYCODETO!=null &&
              this.COUNTRYCODETO.equals(other.getCOUNTRYCODETO()))) &&
            ((this.LEVEL3PRODUCTS==null && other.getLEVEL3PRODUCTS()==null) || 
             (this.LEVEL3PRODUCTS!=null &&
              java.util.Arrays.equals(this.LEVEL3PRODUCTS, other.getLEVEL3PRODUCTS()))) &&
            ((this.MERCHANT_VAT_REGISTRATION_NUM==null && other.getMERCHANT_VAT_REGISTRATION_NUM()==null) || 
             (this.MERCHANT_VAT_REGISTRATION_NUM!=null &&
              this.MERCHANT_VAT_REGISTRATION_NUM.equals(other.getMERCHANT_VAT_REGISTRATION_NUM()))) &&
            ((this.ORDER_DISCOUNT_AMT==null && other.getORDER_DISCOUNT_AMT()==null) || 
             (this.ORDER_DISCOUNT_AMT!=null &&
              this.ORDER_DISCOUNT_AMT.equals(other.getORDER_DISCOUNT_AMT()))) &&
            ((this.PURCHASER_ORDER_DATE==null && other.getPURCHASER_ORDER_DATE()==null) || 
             (this.PURCHASER_ORDER_DATE!=null &&
              this.PURCHASER_ORDER_DATE.equals(other.getPURCHASER_ORDER_DATE()))) &&
            ((this.PURCHASER_VAT_REGISTRATION_NUM==null && other.getPURCHASER_VAT_REGISTRATION_NUM()==null) || 
             (this.PURCHASER_VAT_REGISTRATION_NUM!=null &&
              this.PURCHASER_VAT_REGISTRATION_NUM.equals(other.getPURCHASER_VAT_REGISTRATION_NUM()))) &&
            ((this.SUMMARY_COMMODITY_CODE==null && other.getSUMMARY_COMMODITY_CODE()==null) || 
             (this.SUMMARY_COMMODITY_CODE!=null &&
              this.SUMMARY_COMMODITY_CODE.equals(other.getSUMMARY_COMMODITY_CODE()))) &&
            ((this.VATTAX_RATE==null && other.getVATTAX_RATE()==null) || 
             (this.VATTAX_RATE!=null &&
              this.VATTAX_RATE.equals(other.getVATTAX_RATE()))) &&
            ((this.ZIPFROM==null && other.getZIPFROM()==null) || 
             (this.ZIPFROM!=null &&
              this.ZIPFROM.equals(other.getZIPFROM()))) &&
            ((this.ZIPTO==null && other.getZIPTO()==null) || 
             (this.ZIPTO!=null &&
              this.ZIPTO.equals(other.getZIPTO())));
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
        if (getCOUNTRYCODETO() != null) {
            _hashCode += getCOUNTRYCODETO().hashCode();
        }
        if (getLEVEL3PRODUCTS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLEVEL3PRODUCTS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLEVEL3PRODUCTS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMERCHANT_VAT_REGISTRATION_NUM() != null) {
            _hashCode += getMERCHANT_VAT_REGISTRATION_NUM().hashCode();
        }
        if (getORDER_DISCOUNT_AMT() != null) {
            _hashCode += getORDER_DISCOUNT_AMT().hashCode();
        }
        if (getPURCHASER_ORDER_DATE() != null) {
            _hashCode += getPURCHASER_ORDER_DATE().hashCode();
        }
        if (getPURCHASER_VAT_REGISTRATION_NUM() != null) {
            _hashCode += getPURCHASER_VAT_REGISTRATION_NUM().hashCode();
        }
        if (getSUMMARY_COMMODITY_CODE() != null) {
            _hashCode += getSUMMARY_COMMODITY_CODE().hashCode();
        }
        if (getVATTAX_RATE() != null) {
            _hashCode += getVATTAX_RATE().hashCode();
        }
        if (getZIPFROM() != null) {
            _hashCode += getZIPFROM().hashCode();
        }
        if (getZIPTO() != null) {
            _hashCode += getZIPTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LEVEL3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRYCODETO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "COUNTRYCODETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEVEL3PRODUCTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCT"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCHANT_VAT_REGISTRATION_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_VAT_REGISTRATION_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDER_DISCOUNT_AMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ORDER_DISCOUNT_AMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PURCHASER_ORDER_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PURCHASER_ORDER_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PURCHASER_VAT_REGISTRATION_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PURCHASER_VAT_REGISTRATION_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUMMARY_COMMODITY_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SUMMARY_COMMODITY_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATTAX_RATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VATTAX_RATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPFROM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ZIPFROM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPTO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ZIPTO"));
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
