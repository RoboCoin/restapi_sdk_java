/**
 * CHECKIMAGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class CHECKIMAGE  implements java.io.Serializable {
    private byte[] BACKSIDE;

    private byte[] FRONTSIDE;

    public CHECKIMAGE() {
    }

    public CHECKIMAGE(
           byte[] BACKSIDE,
           byte[] FRONTSIDE) {
           this.BACKSIDE = BACKSIDE;
           this.FRONTSIDE = FRONTSIDE;
    }


    /**
     * Gets the BACKSIDE value for this CHECKIMAGE.
     * 
     * @return BACKSIDE
     */
    public byte[] getBACKSIDE() {
        return BACKSIDE;
    }


    /**
     * Sets the BACKSIDE value for this CHECKIMAGE.
     * 
     * @param BACKSIDE
     */
    public void setBACKSIDE(byte[] BACKSIDE) {
        this.BACKSIDE = BACKSIDE;
    }


    /**
     * Gets the FRONTSIDE value for this CHECKIMAGE.
     * 
     * @return FRONTSIDE
     */
    public byte[] getFRONTSIDE() {
        return FRONTSIDE;
    }


    /**
     * Sets the FRONTSIDE value for this CHECKIMAGE.
     * 
     * @param FRONTSIDE
     */
    public void setFRONTSIDE(byte[] FRONTSIDE) {
        this.FRONTSIDE = FRONTSIDE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CHECKIMAGE)) return false;
        CHECKIMAGE other = (CHECKIMAGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BACKSIDE==null && other.getBACKSIDE()==null) || 
             (this.BACKSIDE!=null &&
              java.util.Arrays.equals(this.BACKSIDE, other.getBACKSIDE()))) &&
            ((this.FRONTSIDE==null && other.getFRONTSIDE()==null) || 
             (this.FRONTSIDE!=null &&
              java.util.Arrays.equals(this.FRONTSIDE, other.getFRONTSIDE())));
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
        if (getBACKSIDE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBACKSIDE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBACKSIDE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFRONTSIDE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFRONTSIDE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFRONTSIDE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CHECKIMAGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKIMAGE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BACKSIDE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BACKSIDE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FRONTSIDE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "FRONTSIDE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
