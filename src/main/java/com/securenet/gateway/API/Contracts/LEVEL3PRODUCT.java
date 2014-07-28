/**
 * LEVEL3PRODUCT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class LEVEL3PRODUCT  implements java.io.Serializable {
    private java.lang.String ALTTAXID;

    private java.lang.String COMMODITYCODE;

    private java.math.BigDecimal DISCOUNTAMT;

    private java.math.BigDecimal DISCOUNTRATE;

    private java.lang.String DISCOUNT_INDICATOR;

    private java.lang.String GROSSNET_INDICATOR;

    private java.lang.String ITEMCODE;

    private java.lang.String ITEMNAME;

    private java.math.BigDecimal ITEMTOTALAMT;

    private java.math.BigDecimal QUANTITY;

    private java.math.BigDecimal TAXAMT;

    private java.math.BigDecimal TAXRATE;

    private java.lang.String TAXTYPEIDENTIFIER;

    private java.lang.String TAXTYPE_APPLIED;

    private java.lang.String UNIT;

    private java.math.BigDecimal UNITPRICE;

    public LEVEL3PRODUCT() {
    }

    public LEVEL3PRODUCT(
           java.lang.String ALTTAXID,
           java.lang.String COMMODITYCODE,
           java.math.BigDecimal DISCOUNTAMT,
           java.math.BigDecimal DISCOUNTRATE,
           java.lang.String DISCOUNT_INDICATOR,
           java.lang.String GROSSNET_INDICATOR,
           java.lang.String ITEMCODE,
           java.lang.String ITEMNAME,
           java.math.BigDecimal ITEMTOTALAMT,
           java.math.BigDecimal QUANTITY,
           java.math.BigDecimal TAXAMT,
           java.math.BigDecimal TAXRATE,
           java.lang.String TAXTYPEIDENTIFIER,
           java.lang.String TAXTYPE_APPLIED,
           java.lang.String UNIT,
           java.math.BigDecimal UNITPRICE) {
           this.ALTTAXID = ALTTAXID;
           this.COMMODITYCODE = COMMODITYCODE;
           this.DISCOUNTAMT = DISCOUNTAMT;
           this.DISCOUNTRATE = DISCOUNTRATE;
           this.DISCOUNT_INDICATOR = DISCOUNT_INDICATOR;
           this.GROSSNET_INDICATOR = GROSSNET_INDICATOR;
           this.ITEMCODE = ITEMCODE;
           this.ITEMNAME = ITEMNAME;
           this.ITEMTOTALAMT = ITEMTOTALAMT;
           this.QUANTITY = QUANTITY;
           this.TAXAMT = TAXAMT;
           this.TAXRATE = TAXRATE;
           this.TAXTYPEIDENTIFIER = TAXTYPEIDENTIFIER;
           this.TAXTYPE_APPLIED = TAXTYPE_APPLIED;
           this.UNIT = UNIT;
           this.UNITPRICE = UNITPRICE;
    }


    /**
     * Gets the ALTTAXID value for this LEVEL3PRODUCT.
     * 
     * @return ALTTAXID
     */
    public java.lang.String getALTTAXID() {
        return ALTTAXID;
    }


    /**
     * Sets the ALTTAXID value for this LEVEL3PRODUCT.
     * 
     * @param ALTTAXID
     */
    public void setALTTAXID(java.lang.String ALTTAXID) {
        this.ALTTAXID = ALTTAXID;
    }


    /**
     * Gets the COMMODITYCODE value for this LEVEL3PRODUCT.
     * 
     * @return COMMODITYCODE
     */
    public java.lang.String getCOMMODITYCODE() {
        return COMMODITYCODE;
    }


    /**
     * Sets the COMMODITYCODE value for this LEVEL3PRODUCT.
     * 
     * @param COMMODITYCODE
     */
    public void setCOMMODITYCODE(java.lang.String COMMODITYCODE) {
        this.COMMODITYCODE = COMMODITYCODE;
    }


    /**
     * Gets the DISCOUNTAMT value for this LEVEL3PRODUCT.
     * 
     * @return DISCOUNTAMT
     */
    public java.math.BigDecimal getDISCOUNTAMT() {
        return DISCOUNTAMT;
    }


    /**
     * Sets the DISCOUNTAMT value for this LEVEL3PRODUCT.
     * 
     * @param DISCOUNTAMT
     */
    public void setDISCOUNTAMT(java.math.BigDecimal DISCOUNTAMT) {
        this.DISCOUNTAMT = DISCOUNTAMT;
    }


    /**
     * Gets the DISCOUNTRATE value for this LEVEL3PRODUCT.
     * 
     * @return DISCOUNTRATE
     */
    public java.math.BigDecimal getDISCOUNTRATE() {
        return DISCOUNTRATE;
    }


    /**
     * Sets the DISCOUNTRATE value for this LEVEL3PRODUCT.
     * 
     * @param DISCOUNTRATE
     */
    public void setDISCOUNTRATE(java.math.BigDecimal DISCOUNTRATE) {
        this.DISCOUNTRATE = DISCOUNTRATE;
    }


    /**
     * Gets the DISCOUNT_INDICATOR value for this LEVEL3PRODUCT.
     * 
     * @return DISCOUNT_INDICATOR
     */
    public java.lang.String getDISCOUNT_INDICATOR() {
        return DISCOUNT_INDICATOR;
    }


    /**
     * Sets the DISCOUNT_INDICATOR value for this LEVEL3PRODUCT.
     * 
     * @param DISCOUNT_INDICATOR
     */
    public void setDISCOUNT_INDICATOR(java.lang.String DISCOUNT_INDICATOR) {
        this.DISCOUNT_INDICATOR = DISCOUNT_INDICATOR;
    }


    /**
     * Gets the GROSSNET_INDICATOR value for this LEVEL3PRODUCT.
     * 
     * @return GROSSNET_INDICATOR
     */
    public java.lang.String getGROSSNET_INDICATOR() {
        return GROSSNET_INDICATOR;
    }


    /**
     * Sets the GROSSNET_INDICATOR value for this LEVEL3PRODUCT.
     * 
     * @param GROSSNET_INDICATOR
     */
    public void setGROSSNET_INDICATOR(java.lang.String GROSSNET_INDICATOR) {
        this.GROSSNET_INDICATOR = GROSSNET_INDICATOR;
    }


    /**
     * Gets the ITEMCODE value for this LEVEL3PRODUCT.
     * 
     * @return ITEMCODE
     */
    public java.lang.String getITEMCODE() {
        return ITEMCODE;
    }


    /**
     * Sets the ITEMCODE value for this LEVEL3PRODUCT.
     * 
     * @param ITEMCODE
     */
    public void setITEMCODE(java.lang.String ITEMCODE) {
        this.ITEMCODE = ITEMCODE;
    }


    /**
     * Gets the ITEMNAME value for this LEVEL3PRODUCT.
     * 
     * @return ITEMNAME
     */
    public java.lang.String getITEMNAME() {
        return ITEMNAME;
    }


    /**
     * Sets the ITEMNAME value for this LEVEL3PRODUCT.
     * 
     * @param ITEMNAME
     */
    public void setITEMNAME(java.lang.String ITEMNAME) {
        this.ITEMNAME = ITEMNAME;
    }


    /**
     * Gets the ITEMTOTALAMT value for this LEVEL3PRODUCT.
     * 
     * @return ITEMTOTALAMT
     */
    public java.math.BigDecimal getITEMTOTALAMT() {
        return ITEMTOTALAMT;
    }


    /**
     * Sets the ITEMTOTALAMT value for this LEVEL3PRODUCT.
     * 
     * @param ITEMTOTALAMT
     */
    public void setITEMTOTALAMT(java.math.BigDecimal ITEMTOTALAMT) {
        this.ITEMTOTALAMT = ITEMTOTALAMT;
    }


    /**
     * Gets the QUANTITY value for this LEVEL3PRODUCT.
     * 
     * @return QUANTITY
     */
    public java.math.BigDecimal getQUANTITY() {
        return QUANTITY;
    }


    /**
     * Sets the QUANTITY value for this LEVEL3PRODUCT.
     * 
     * @param QUANTITY
     */
    public void setQUANTITY(java.math.BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }


    /**
     * Gets the TAXAMT value for this LEVEL3PRODUCT.
     * 
     * @return TAXAMT
     */
    public java.math.BigDecimal getTAXAMT() {
        return TAXAMT;
    }


    /**
     * Sets the TAXAMT value for this LEVEL3PRODUCT.
     * 
     * @param TAXAMT
     */
    public void setTAXAMT(java.math.BigDecimal TAXAMT) {
        this.TAXAMT = TAXAMT;
    }


    /**
     * Gets the TAXRATE value for this LEVEL3PRODUCT.
     * 
     * @return TAXRATE
     */
    public java.math.BigDecimal getTAXRATE() {
        return TAXRATE;
    }


    /**
     * Sets the TAXRATE value for this LEVEL3PRODUCT.
     * 
     * @param TAXRATE
     */
    public void setTAXRATE(java.math.BigDecimal TAXRATE) {
        this.TAXRATE = TAXRATE;
    }


    /**
     * Gets the TAXTYPEIDENTIFIER value for this LEVEL3PRODUCT.
     * 
     * @return TAXTYPEIDENTIFIER
     */
    public java.lang.String getTAXTYPEIDENTIFIER() {
        return TAXTYPEIDENTIFIER;
    }


    /**
     * Sets the TAXTYPEIDENTIFIER value for this LEVEL3PRODUCT.
     * 
     * @param TAXTYPEIDENTIFIER
     */
    public void setTAXTYPEIDENTIFIER(java.lang.String TAXTYPEIDENTIFIER) {
        this.TAXTYPEIDENTIFIER = TAXTYPEIDENTIFIER;
    }


    /**
     * Gets the TAXTYPE_APPLIED value for this LEVEL3PRODUCT.
     * 
     * @return TAXTYPE_APPLIED
     */
    public java.lang.String getTAXTYPE_APPLIED() {
        return TAXTYPE_APPLIED;
    }


    /**
     * Sets the TAXTYPE_APPLIED value for this LEVEL3PRODUCT.
     * 
     * @param TAXTYPE_APPLIED
     */
    public void setTAXTYPE_APPLIED(java.lang.String TAXTYPE_APPLIED) {
        this.TAXTYPE_APPLIED = TAXTYPE_APPLIED;
    }


    /**
     * Gets the UNIT value for this LEVEL3PRODUCT.
     * 
     * @return UNIT
     */
    public java.lang.String getUNIT() {
        return UNIT;
    }


    /**
     * Sets the UNIT value for this LEVEL3PRODUCT.
     * 
     * @param UNIT
     */
    public void setUNIT(java.lang.String UNIT) {
        this.UNIT = UNIT;
    }


    /**
     * Gets the UNITPRICE value for this LEVEL3PRODUCT.
     * 
     * @return UNITPRICE
     */
    public java.math.BigDecimal getUNITPRICE() {
        return UNITPRICE;
    }


    /**
     * Sets the UNITPRICE value for this LEVEL3PRODUCT.
     * 
     * @param UNITPRICE
     */
    public void setUNITPRICE(java.math.BigDecimal UNITPRICE) {
        this.UNITPRICE = UNITPRICE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LEVEL3PRODUCT)) return false;
        LEVEL3PRODUCT other = (LEVEL3PRODUCT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ALTTAXID==null && other.getALTTAXID()==null) || 
             (this.ALTTAXID!=null &&
              this.ALTTAXID.equals(other.getALTTAXID()))) &&
            ((this.COMMODITYCODE==null && other.getCOMMODITYCODE()==null) || 
             (this.COMMODITYCODE!=null &&
              this.COMMODITYCODE.equals(other.getCOMMODITYCODE()))) &&
            ((this.DISCOUNTAMT==null && other.getDISCOUNTAMT()==null) || 
             (this.DISCOUNTAMT!=null &&
              this.DISCOUNTAMT.equals(other.getDISCOUNTAMT()))) &&
            ((this.DISCOUNTRATE==null && other.getDISCOUNTRATE()==null) || 
             (this.DISCOUNTRATE!=null &&
              this.DISCOUNTRATE.equals(other.getDISCOUNTRATE()))) &&
            ((this.DISCOUNT_INDICATOR==null && other.getDISCOUNT_INDICATOR()==null) || 
             (this.DISCOUNT_INDICATOR!=null &&
              this.DISCOUNT_INDICATOR.equals(other.getDISCOUNT_INDICATOR()))) &&
            ((this.GROSSNET_INDICATOR==null && other.getGROSSNET_INDICATOR()==null) || 
             (this.GROSSNET_INDICATOR!=null &&
              this.GROSSNET_INDICATOR.equals(other.getGROSSNET_INDICATOR()))) &&
            ((this.ITEMCODE==null && other.getITEMCODE()==null) || 
             (this.ITEMCODE!=null &&
              this.ITEMCODE.equals(other.getITEMCODE()))) &&
            ((this.ITEMNAME==null && other.getITEMNAME()==null) || 
             (this.ITEMNAME!=null &&
              this.ITEMNAME.equals(other.getITEMNAME()))) &&
            ((this.ITEMTOTALAMT==null && other.getITEMTOTALAMT()==null) || 
             (this.ITEMTOTALAMT!=null &&
              this.ITEMTOTALAMT.equals(other.getITEMTOTALAMT()))) &&
            ((this.QUANTITY==null && other.getQUANTITY()==null) || 
             (this.QUANTITY!=null &&
              this.QUANTITY.equals(other.getQUANTITY()))) &&
            ((this.TAXAMT==null && other.getTAXAMT()==null) || 
             (this.TAXAMT!=null &&
              this.TAXAMT.equals(other.getTAXAMT()))) &&
            ((this.TAXRATE==null && other.getTAXRATE()==null) || 
             (this.TAXRATE!=null &&
              this.TAXRATE.equals(other.getTAXRATE()))) &&
            ((this.TAXTYPEIDENTIFIER==null && other.getTAXTYPEIDENTIFIER()==null) || 
             (this.TAXTYPEIDENTIFIER!=null &&
              this.TAXTYPEIDENTIFIER.equals(other.getTAXTYPEIDENTIFIER()))) &&
            ((this.TAXTYPE_APPLIED==null && other.getTAXTYPE_APPLIED()==null) || 
             (this.TAXTYPE_APPLIED!=null &&
              this.TAXTYPE_APPLIED.equals(other.getTAXTYPE_APPLIED()))) &&
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
        if (getALTTAXID() != null) {
            _hashCode += getALTTAXID().hashCode();
        }
        if (getCOMMODITYCODE() != null) {
            _hashCode += getCOMMODITYCODE().hashCode();
        }
        if (getDISCOUNTAMT() != null) {
            _hashCode += getDISCOUNTAMT().hashCode();
        }
        if (getDISCOUNTRATE() != null) {
            _hashCode += getDISCOUNTRATE().hashCode();
        }
        if (getDISCOUNT_INDICATOR() != null) {
            _hashCode += getDISCOUNT_INDICATOR().hashCode();
        }
        if (getGROSSNET_INDICATOR() != null) {
            _hashCode += getGROSSNET_INDICATOR().hashCode();
        }
        if (getITEMCODE() != null) {
            _hashCode += getITEMCODE().hashCode();
        }
        if (getITEMNAME() != null) {
            _hashCode += getITEMNAME().hashCode();
        }
        if (getITEMTOTALAMT() != null) {
            _hashCode += getITEMTOTALAMT().hashCode();
        }
        if (getQUANTITY() != null) {
            _hashCode += getQUANTITY().hashCode();
        }
        if (getTAXAMT() != null) {
            _hashCode += getTAXAMT().hashCode();
        }
        if (getTAXRATE() != null) {
            _hashCode += getTAXRATE().hashCode();
        }
        if (getTAXTYPEIDENTIFIER() != null) {
            _hashCode += getTAXTYPEIDENTIFIER().hashCode();
        }
        if (getTAXTYPE_APPLIED() != null) {
            _hashCode += getTAXTYPE_APPLIED().hashCode();
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
        new org.apache.axis.description.TypeDesc(LEVEL3PRODUCT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ALTTAXID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ALTTAXID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMMODITYCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "COMMODITYCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISCOUNTAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DISCOUNTAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISCOUNTRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DISCOUNTRATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISCOUNT_INDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DISCOUNT_INDICATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GROSSNET_INDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GROSSNET_INDICATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ITEMCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ITEMNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMTOTALAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ITEMTOTALAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "QUANTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXRATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXTYPEIDENTIFIER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXTYPEIDENTIFIER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXTYPE_APPLIED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXTYPE_APPLIED"));
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
