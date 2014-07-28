/**
 * PETROLEUM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class PETROLEUM  implements java.io.Serializable {
    private java.lang.String DRIVEJOBNUM;

    private java.lang.String FLEET_REFERENCENUM;

    private java.lang.String FULLSERV_INDICATOR;

    private int GALLONS;

    private java.lang.String ODOMETER;

    private java.lang.String PIN;

    private com.securenet.gateway.API.Contracts.PRODUCT[] PRODUCTS;

    private java.math.BigDecimal TAXAMOUNT;

    private java.math.BigDecimal UNITPRICE;

    private java.lang.String VEHICLENUM;

    public PETROLEUM() {
    }

    public PETROLEUM(
           java.lang.String DRIVEJOBNUM,
           java.lang.String FLEET_REFERENCENUM,
           java.lang.String FULLSERV_INDICATOR,
           int GALLONS,
           java.lang.String ODOMETER,
           java.lang.String PIN,
           com.securenet.gateway.API.Contracts.PRODUCT[] PRODUCTS,
           java.math.BigDecimal TAXAMOUNT,
           java.math.BigDecimal UNITPRICE,
           java.lang.String VEHICLENUM) {
           this.DRIVEJOBNUM = DRIVEJOBNUM;
           this.FLEET_REFERENCENUM = FLEET_REFERENCENUM;
           this.FULLSERV_INDICATOR = FULLSERV_INDICATOR;
           this.GALLONS = GALLONS;
           this.ODOMETER = ODOMETER;
           this.PIN = PIN;
           this.PRODUCTS = PRODUCTS;
           this.TAXAMOUNT = TAXAMOUNT;
           this.UNITPRICE = UNITPRICE;
           this.VEHICLENUM = VEHICLENUM;
    }


    /**
     * Gets the DRIVEJOBNUM value for this PETROLEUM.
     * 
     * @return DRIVEJOBNUM
     */
    public java.lang.String getDRIVEJOBNUM() {
        return DRIVEJOBNUM;
    }


    /**
     * Sets the DRIVEJOBNUM value for this PETROLEUM.
     * 
     * @param DRIVEJOBNUM
     */
    public void setDRIVEJOBNUM(java.lang.String DRIVEJOBNUM) {
        this.DRIVEJOBNUM = DRIVEJOBNUM;
    }


    /**
     * Gets the FLEET_REFERENCENUM value for this PETROLEUM.
     * 
     * @return FLEET_REFERENCENUM
     */
    public java.lang.String getFLEET_REFERENCENUM() {
        return FLEET_REFERENCENUM;
    }


    /**
     * Sets the FLEET_REFERENCENUM value for this PETROLEUM.
     * 
     * @param FLEET_REFERENCENUM
     */
    public void setFLEET_REFERENCENUM(java.lang.String FLEET_REFERENCENUM) {
        this.FLEET_REFERENCENUM = FLEET_REFERENCENUM;
    }


    /**
     * Gets the FULLSERV_INDICATOR value for this PETROLEUM.
     * 
     * @return FULLSERV_INDICATOR
     */
    public java.lang.String getFULLSERV_INDICATOR() {
        return FULLSERV_INDICATOR;
    }


    /**
     * Sets the FULLSERV_INDICATOR value for this PETROLEUM.
     * 
     * @param FULLSERV_INDICATOR
     */
    public void setFULLSERV_INDICATOR(java.lang.String FULLSERV_INDICATOR) {
        this.FULLSERV_INDICATOR = FULLSERV_INDICATOR;
    }


    /**
     * Gets the GALLONS value for this PETROLEUM.
     * 
     * @return GALLONS
     */
    public int getGALLONS() {
        return GALLONS;
    }


    /**
     * Sets the GALLONS value for this PETROLEUM.
     * 
     * @param GALLONS
     */
    public void setGALLONS(int GALLONS) {
        this.GALLONS = GALLONS;
    }


    /**
     * Gets the ODOMETER value for this PETROLEUM.
     * 
     * @return ODOMETER
     */
    public java.lang.String getODOMETER() {
        return ODOMETER;
    }


    /**
     * Sets the ODOMETER value for this PETROLEUM.
     * 
     * @param ODOMETER
     */
    public void setODOMETER(java.lang.String ODOMETER) {
        this.ODOMETER = ODOMETER;
    }


    /**
     * Gets the PIN value for this PETROLEUM.
     * 
     * @return PIN
     */
    public java.lang.String getPIN() {
        return PIN;
    }


    /**
     * Sets the PIN value for this PETROLEUM.
     * 
     * @param PIN
     */
    public void setPIN(java.lang.String PIN) {
        this.PIN = PIN;
    }


    /**
     * Gets the PRODUCTS value for this PETROLEUM.
     * 
     * @return PRODUCTS
     */
    public com.securenet.gateway.API.Contracts.PRODUCT[] getPRODUCTS() {
        return PRODUCTS;
    }


    /**
     * Sets the PRODUCTS value for this PETROLEUM.
     * 
     * @param PRODUCTS
     */
    public void setPRODUCTS(com.securenet.gateway.API.Contracts.PRODUCT[] PRODUCTS) {
        this.PRODUCTS = PRODUCTS;
    }


    /**
     * Gets the TAXAMOUNT value for this PETROLEUM.
     * 
     * @return TAXAMOUNT
     */
    public java.math.BigDecimal getTAXAMOUNT() {
        return TAXAMOUNT;
    }


    /**
     * Sets the TAXAMOUNT value for this PETROLEUM.
     * 
     * @param TAXAMOUNT
     */
    public void setTAXAMOUNT(java.math.BigDecimal TAXAMOUNT) {
        this.TAXAMOUNT = TAXAMOUNT;
    }


    /**
     * Gets the UNITPRICE value for this PETROLEUM.
     * 
     * @return UNITPRICE
     */
    public java.math.BigDecimal getUNITPRICE() {
        return UNITPRICE;
    }


    /**
     * Sets the UNITPRICE value for this PETROLEUM.
     * 
     * @param UNITPRICE
     */
    public void setUNITPRICE(java.math.BigDecimal UNITPRICE) {
        this.UNITPRICE = UNITPRICE;
    }


    /**
     * Gets the VEHICLENUM value for this PETROLEUM.
     * 
     * @return VEHICLENUM
     */
    public java.lang.String getVEHICLENUM() {
        return VEHICLENUM;
    }


    /**
     * Sets the VEHICLENUM value for this PETROLEUM.
     * 
     * @param VEHICLENUM
     */
    public void setVEHICLENUM(java.lang.String VEHICLENUM) {
        this.VEHICLENUM = VEHICLENUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PETROLEUM)) return false;
        PETROLEUM other = (PETROLEUM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DRIVEJOBNUM==null && other.getDRIVEJOBNUM()==null) || 
             (this.DRIVEJOBNUM!=null &&
              this.DRIVEJOBNUM.equals(other.getDRIVEJOBNUM()))) &&
            ((this.FLEET_REFERENCENUM==null && other.getFLEET_REFERENCENUM()==null) || 
             (this.FLEET_REFERENCENUM!=null &&
              this.FLEET_REFERENCENUM.equals(other.getFLEET_REFERENCENUM()))) &&
            ((this.FULLSERV_INDICATOR==null && other.getFULLSERV_INDICATOR()==null) || 
             (this.FULLSERV_INDICATOR!=null &&
              this.FULLSERV_INDICATOR.equals(other.getFULLSERV_INDICATOR()))) &&
            this.GALLONS == other.getGALLONS() &&
            ((this.ODOMETER==null && other.getODOMETER()==null) || 
             (this.ODOMETER!=null &&
              this.ODOMETER.equals(other.getODOMETER()))) &&
            ((this.PIN==null && other.getPIN()==null) || 
             (this.PIN!=null &&
              this.PIN.equals(other.getPIN()))) &&
            ((this.PRODUCTS==null && other.getPRODUCTS()==null) || 
             (this.PRODUCTS!=null &&
              java.util.Arrays.equals(this.PRODUCTS, other.getPRODUCTS()))) &&
            ((this.TAXAMOUNT==null && other.getTAXAMOUNT()==null) || 
             (this.TAXAMOUNT!=null &&
              this.TAXAMOUNT.equals(other.getTAXAMOUNT()))) &&
            ((this.UNITPRICE==null && other.getUNITPRICE()==null) || 
             (this.UNITPRICE!=null &&
              this.UNITPRICE.equals(other.getUNITPRICE()))) &&
            ((this.VEHICLENUM==null && other.getVEHICLENUM()==null) || 
             (this.VEHICLENUM!=null &&
              this.VEHICLENUM.equals(other.getVEHICLENUM())));
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
        if (getDRIVEJOBNUM() != null) {
            _hashCode += getDRIVEJOBNUM().hashCode();
        }
        if (getFLEET_REFERENCENUM() != null) {
            _hashCode += getFLEET_REFERENCENUM().hashCode();
        }
        if (getFULLSERV_INDICATOR() != null) {
            _hashCode += getFULLSERV_INDICATOR().hashCode();
        }
        _hashCode += getGALLONS();
        if (getODOMETER() != null) {
            _hashCode += getODOMETER().hashCode();
        }
        if (getPIN() != null) {
            _hashCode += getPIN().hashCode();
        }
        if (getPRODUCTS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRODUCTS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRODUCTS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTAXAMOUNT() != null) {
            _hashCode += getTAXAMOUNT().hashCode();
        }
        if (getUNITPRICE() != null) {
            _hashCode += getUNITPRICE().hashCode();
        }
        if (getVEHICLENUM() != null) {
            _hashCode += getVEHICLENUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PETROLEUM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PETROLEUM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRIVEJOBNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DRIVEJOBNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLEET_REFERENCENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FLEET_REFERENCENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FULLSERV_INDICATOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FULLSERV_INDICATOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GALLONS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GALLONS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ODOMETER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ODOMETER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRODUCTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAXAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TAXAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNITPRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UNITPRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VEHICLENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VEHICLENUM"));
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
