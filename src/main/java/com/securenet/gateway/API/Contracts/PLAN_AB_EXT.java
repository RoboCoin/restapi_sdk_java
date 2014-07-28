/**
 * PLAN_AB_EXT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class PLAN_AB_EXT  extends com.securenet.gateway.API.Contracts.PLAN_AB  implements java.io.Serializable {
    private com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED;

    public PLAN_AB_EXT() {
    }

    public PLAN_AB_EXT(
           java.lang.Integer ACTIVE,
           java.lang.String CUSTOMERID,
           java.lang.String ENDDATE,
           com.securenet.gateway.API.Contracts.INSTALLMENT INSTALLMENT,
           java.lang.Integer MAXRETRIES,
           com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY,
           java.lang.String NEXTPAYMENT_DATE,
           java.lang.String NOTES,
           java.lang.String PAYMENTID,
           java.lang.String PAYMENTID2,
           java.lang.Integer PLANID,
           com.securenet.gateway.API.Contracts.RECURRING RECURRING,
           com.securenet.gateway.API.Contracts.PAYMENT_AB[] SCHEDULE,
           java.lang.String STARTDATE,
           java.lang.String TYPE,
           com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED) {
        super(
            ACTIVE,
            CUSTOMERID,
            ENDDATE,
            INSTALLMENT,
            MAXRETRIES,
            MERCHANT_KEY,
            NEXTPAYMENT_DATE,
            NOTES,
            PAYMENTID,
            PAYMENTID2,
            PLANID,
            RECURRING,
            SCHEDULE,
            STARTDATE,
            TYPE);
        this.USERDEFINED = USERDEFINED;
    }


    /**
     * Gets the USERDEFINED value for this PLAN_AB_EXT.
     * 
     * @return USERDEFINED
     */
    public com.securenet.gateway.API.Contracts.USERDEFINED getUSERDEFINED() {
        return USERDEFINED;
    }


    /**
     * Sets the USERDEFINED value for this PLAN_AB_EXT.
     * 
     * @param USERDEFINED
     */
    public void setUSERDEFINED(com.securenet.gateway.API.Contracts.USERDEFINED USERDEFINED) {
        this.USERDEFINED = USERDEFINED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PLAN_AB_EXT)) return false;
        PLAN_AB_EXT other = (PLAN_AB_EXT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
        if (getUSERDEFINED() != null) {
            _hashCode += getUSERDEFINED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PLAN_AB_EXT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
