/**
 * OPTIONS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class OPTIONS  implements java.io.Serializable {
    private java.lang.String CYCLE;

    private java.lang.Integer DAY;

    private java.lang.Integer FREQUENCY;

    private java.lang.Integer MONTH;

    private java.lang.Integer WEEKDAY;

    public OPTIONS() {
    }

    public OPTIONS(
           java.lang.String CYCLE,
           java.lang.Integer DAY,
           java.lang.Integer FREQUENCY,
           java.lang.Integer MONTH,
           java.lang.Integer WEEKDAY) {
           this.CYCLE = CYCLE;
           this.DAY = DAY;
           this.FREQUENCY = FREQUENCY;
           this.MONTH = MONTH;
           this.WEEKDAY = WEEKDAY;
    }


    /**
     * Gets the CYCLE value for this OPTIONS.
     * 
     * @return CYCLE
     */
    public java.lang.String getCYCLE() {
        return CYCLE;
    }


    /**
     * Sets the CYCLE value for this OPTIONS.
     * 
     * @param CYCLE
     */
    public void setCYCLE(java.lang.String CYCLE) {
        this.CYCLE = CYCLE;
    }


    /**
     * Gets the DAY value for this OPTIONS.
     * 
     * @return DAY
     */
    public java.lang.Integer getDAY() {
        return DAY;
    }


    /**
     * Sets the DAY value for this OPTIONS.
     * 
     * @param DAY
     */
    public void setDAY(java.lang.Integer DAY) {
        this.DAY = DAY;
    }


    /**
     * Gets the FREQUENCY value for this OPTIONS.
     * 
     * @return FREQUENCY
     */
    public java.lang.Integer getFREQUENCY() {
        return FREQUENCY;
    }


    /**
     * Sets the FREQUENCY value for this OPTIONS.
     * 
     * @param FREQUENCY
     */
    public void setFREQUENCY(java.lang.Integer FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }


    /**
     * Gets the MONTH value for this OPTIONS.
     * 
     * @return MONTH
     */
    public java.lang.Integer getMONTH() {
        return MONTH;
    }


    /**
     * Sets the MONTH value for this OPTIONS.
     * 
     * @param MONTH
     */
    public void setMONTH(java.lang.Integer MONTH) {
        this.MONTH = MONTH;
    }


    /**
     * Gets the WEEKDAY value for this OPTIONS.
     * 
     * @return WEEKDAY
     */
    public java.lang.Integer getWEEKDAY() {
        return WEEKDAY;
    }


    /**
     * Sets the WEEKDAY value for this OPTIONS.
     * 
     * @param WEEKDAY
     */
    public void setWEEKDAY(java.lang.Integer WEEKDAY) {
        this.WEEKDAY = WEEKDAY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OPTIONS)) return false;
        OPTIONS other = (OPTIONS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CYCLE==null && other.getCYCLE()==null) || 
             (this.CYCLE!=null &&
              this.CYCLE.equals(other.getCYCLE()))) &&
            ((this.DAY==null && other.getDAY()==null) || 
             (this.DAY!=null &&
              this.DAY.equals(other.getDAY()))) &&
            ((this.FREQUENCY==null && other.getFREQUENCY()==null) || 
             (this.FREQUENCY!=null &&
              this.FREQUENCY.equals(other.getFREQUENCY()))) &&
            ((this.MONTH==null && other.getMONTH()==null) || 
             (this.MONTH!=null &&
              this.MONTH.equals(other.getMONTH()))) &&
            ((this.WEEKDAY==null && other.getWEEKDAY()==null) || 
             (this.WEEKDAY!=null &&
              this.WEEKDAY.equals(other.getWEEKDAY())));
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
        if (getCYCLE() != null) {
            _hashCode += getCYCLE().hashCode();
        }
        if (getDAY() != null) {
            _hashCode += getDAY().hashCode();
        }
        if (getFREQUENCY() != null) {
            _hashCode += getFREQUENCY().hashCode();
        }
        if (getMONTH() != null) {
            _hashCode += getMONTH().hashCode();
        }
        if (getWEEKDAY() != null) {
            _hashCode += getWEEKDAY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OPTIONS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPTIONS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CYCLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CYCLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DAY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "DAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FREQUENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FREQUENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MONTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WEEKDAY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "WEEKDAY"));
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
