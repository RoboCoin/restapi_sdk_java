/**
 * BATCHDATA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class BATCHDATA  implements java.io.Serializable {
    private java.lang.String BATCHCOUNT;

    private com.securenet.gateway.API.Contracts.BATCHDETAIL[] BATCHDETAILS;

    private java.lang.String SECURENETID;

    public BATCHDATA() {
    }

    public BATCHDATA(
           java.lang.String BATCHCOUNT,
           com.securenet.gateway.API.Contracts.BATCHDETAIL[] BATCHDETAILS,
           java.lang.String SECURENETID) {
           this.BATCHCOUNT = BATCHCOUNT;
           this.BATCHDETAILS = BATCHDETAILS;
           this.SECURENETID = SECURENETID;
    }


    /**
     * Gets the BATCHCOUNT value for this BATCHDATA.
     * 
     * @return BATCHCOUNT
     */
    public java.lang.String getBATCHCOUNT() {
        return BATCHCOUNT;
    }


    /**
     * Sets the BATCHCOUNT value for this BATCHDATA.
     * 
     * @param BATCHCOUNT
     */
    public void setBATCHCOUNT(java.lang.String BATCHCOUNT) {
        this.BATCHCOUNT = BATCHCOUNT;
    }


    /**
     * Gets the BATCHDETAILS value for this BATCHDATA.
     * 
     * @return BATCHDETAILS
     */
    public com.securenet.gateway.API.Contracts.BATCHDETAIL[] getBATCHDETAILS() {
        return BATCHDETAILS;
    }


    /**
     * Sets the BATCHDETAILS value for this BATCHDATA.
     * 
     * @param BATCHDETAILS
     */
    public void setBATCHDETAILS(com.securenet.gateway.API.Contracts.BATCHDETAIL[] BATCHDETAILS) {
        this.BATCHDETAILS = BATCHDETAILS;
    }


    /**
     * Gets the SECURENETID value for this BATCHDATA.
     * 
     * @return SECURENETID
     */
    public java.lang.String getSECURENETID() {
        return SECURENETID;
    }


    /**
     * Sets the SECURENETID value for this BATCHDATA.
     * 
     * @param SECURENETID
     */
    public void setSECURENETID(java.lang.String SECURENETID) {
        this.SECURENETID = SECURENETID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BATCHDATA)) return false;
        BATCHDATA other = (BATCHDATA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BATCHCOUNT==null && other.getBATCHCOUNT()==null) || 
             (this.BATCHCOUNT!=null &&
              this.BATCHCOUNT.equals(other.getBATCHCOUNT()))) &&
            ((this.BATCHDETAILS==null && other.getBATCHDETAILS()==null) || 
             (this.BATCHDETAILS!=null &&
              java.util.Arrays.equals(this.BATCHDETAILS, other.getBATCHDETAILS()))) &&
            ((this.SECURENETID==null && other.getSECURENETID()==null) || 
             (this.SECURENETID!=null &&
              this.SECURENETID.equals(other.getSECURENETID())));
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
        if (getBATCHCOUNT() != null) {
            _hashCode += getBATCHCOUNT().hashCode();
        }
        if (getBATCHDETAILS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBATCHDETAILS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBATCHDETAILS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSECURENETID() != null) {
            _hashCode += getSECURENETID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BATCHDATA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDATA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BATCHCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BATCHDETAILS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAILS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAIL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAIL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECURENETID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECURENETID"));
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
