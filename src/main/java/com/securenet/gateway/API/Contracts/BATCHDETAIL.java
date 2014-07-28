/**
 * BATCHDETAIL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class BATCHDETAIL  implements java.io.Serializable {
    private java.lang.String BATCHID;

    private java.lang.String METHOD;

    private java.lang.String PROCESSOR;

    private java.lang.String SECURENETID;

    private java.lang.String TOTALBATCHAMOUNT;

    private java.lang.String TOTALCREDITAMOUNT;

    private java.lang.String TOTALSALEAMOUNT;

    private java.lang.String TOTALTRANSACTIONS;

    public BATCHDETAIL() {
    }

    public BATCHDETAIL(
           java.lang.String BATCHID,
           java.lang.String METHOD,
           java.lang.String PROCESSOR,
           java.lang.String SECURENETID,
           java.lang.String TOTALBATCHAMOUNT,
           java.lang.String TOTALCREDITAMOUNT,
           java.lang.String TOTALSALEAMOUNT,
           java.lang.String TOTALTRANSACTIONS) {
           this.BATCHID = BATCHID;
           this.METHOD = METHOD;
           this.PROCESSOR = PROCESSOR;
           this.SECURENETID = SECURENETID;
           this.TOTALBATCHAMOUNT = TOTALBATCHAMOUNT;
           this.TOTALCREDITAMOUNT = TOTALCREDITAMOUNT;
           this.TOTALSALEAMOUNT = TOTALSALEAMOUNT;
           this.TOTALTRANSACTIONS = TOTALTRANSACTIONS;
    }


    /**
     * Gets the BATCHID value for this BATCHDETAIL.
     * 
     * @return BATCHID
     */
    public java.lang.String getBATCHID() {
        return BATCHID;
    }


    /**
     * Sets the BATCHID value for this BATCHDETAIL.
     * 
     * @param BATCHID
     */
    public void setBATCHID(java.lang.String BATCHID) {
        this.BATCHID = BATCHID;
    }


    /**
     * Gets the METHOD value for this BATCHDETAIL.
     * 
     * @return METHOD
     */
    public java.lang.String getMETHOD() {
        return METHOD;
    }


    /**
     * Sets the METHOD value for this BATCHDETAIL.
     * 
     * @param METHOD
     */
    public void setMETHOD(java.lang.String METHOD) {
        this.METHOD = METHOD;
    }


    /**
     * Gets the PROCESSOR value for this BATCHDETAIL.
     * 
     * @return PROCESSOR
     */
    public java.lang.String getPROCESSOR() {
        return PROCESSOR;
    }


    /**
     * Sets the PROCESSOR value for this BATCHDETAIL.
     * 
     * @param PROCESSOR
     */
    public void setPROCESSOR(java.lang.String PROCESSOR) {
        this.PROCESSOR = PROCESSOR;
    }


    /**
     * Gets the SECURENETID value for this BATCHDETAIL.
     * 
     * @return SECURENETID
     */
    public java.lang.String getSECURENETID() {
        return SECURENETID;
    }


    /**
     * Sets the SECURENETID value for this BATCHDETAIL.
     * 
     * @param SECURENETID
     */
    public void setSECURENETID(java.lang.String SECURENETID) {
        this.SECURENETID = SECURENETID;
    }


    /**
     * Gets the TOTALBATCHAMOUNT value for this BATCHDETAIL.
     * 
     * @return TOTALBATCHAMOUNT
     */
    public java.lang.String getTOTALBATCHAMOUNT() {
        return TOTALBATCHAMOUNT;
    }


    /**
     * Sets the TOTALBATCHAMOUNT value for this BATCHDETAIL.
     * 
     * @param TOTALBATCHAMOUNT
     */
    public void setTOTALBATCHAMOUNT(java.lang.String TOTALBATCHAMOUNT) {
        this.TOTALBATCHAMOUNT = TOTALBATCHAMOUNT;
    }


    /**
     * Gets the TOTALCREDITAMOUNT value for this BATCHDETAIL.
     * 
     * @return TOTALCREDITAMOUNT
     */
    public java.lang.String getTOTALCREDITAMOUNT() {
        return TOTALCREDITAMOUNT;
    }


    /**
     * Sets the TOTALCREDITAMOUNT value for this BATCHDETAIL.
     * 
     * @param TOTALCREDITAMOUNT
     */
    public void setTOTALCREDITAMOUNT(java.lang.String TOTALCREDITAMOUNT) {
        this.TOTALCREDITAMOUNT = TOTALCREDITAMOUNT;
    }


    /**
     * Gets the TOTALSALEAMOUNT value for this BATCHDETAIL.
     * 
     * @return TOTALSALEAMOUNT
     */
    public java.lang.String getTOTALSALEAMOUNT() {
        return TOTALSALEAMOUNT;
    }


    /**
     * Sets the TOTALSALEAMOUNT value for this BATCHDETAIL.
     * 
     * @param TOTALSALEAMOUNT
     */
    public void setTOTALSALEAMOUNT(java.lang.String TOTALSALEAMOUNT) {
        this.TOTALSALEAMOUNT = TOTALSALEAMOUNT;
    }


    /**
     * Gets the TOTALTRANSACTIONS value for this BATCHDETAIL.
     * 
     * @return TOTALTRANSACTIONS
     */
    public java.lang.String getTOTALTRANSACTIONS() {
        return TOTALTRANSACTIONS;
    }


    /**
     * Sets the TOTALTRANSACTIONS value for this BATCHDETAIL.
     * 
     * @param TOTALTRANSACTIONS
     */
    public void setTOTALTRANSACTIONS(java.lang.String TOTALTRANSACTIONS) {
        this.TOTALTRANSACTIONS = TOTALTRANSACTIONS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BATCHDETAIL)) return false;
        BATCHDETAIL other = (BATCHDETAIL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BATCHID==null && other.getBATCHID()==null) || 
             (this.BATCHID!=null &&
              this.BATCHID.equals(other.getBATCHID()))) &&
            ((this.METHOD==null && other.getMETHOD()==null) || 
             (this.METHOD!=null &&
              this.METHOD.equals(other.getMETHOD()))) &&
            ((this.PROCESSOR==null && other.getPROCESSOR()==null) || 
             (this.PROCESSOR!=null &&
              this.PROCESSOR.equals(other.getPROCESSOR()))) &&
            ((this.SECURENETID==null && other.getSECURENETID()==null) || 
             (this.SECURENETID!=null &&
              this.SECURENETID.equals(other.getSECURENETID()))) &&
            ((this.TOTALBATCHAMOUNT==null && other.getTOTALBATCHAMOUNT()==null) || 
             (this.TOTALBATCHAMOUNT!=null &&
              this.TOTALBATCHAMOUNT.equals(other.getTOTALBATCHAMOUNT()))) &&
            ((this.TOTALCREDITAMOUNT==null && other.getTOTALCREDITAMOUNT()==null) || 
             (this.TOTALCREDITAMOUNT!=null &&
              this.TOTALCREDITAMOUNT.equals(other.getTOTALCREDITAMOUNT()))) &&
            ((this.TOTALSALEAMOUNT==null && other.getTOTALSALEAMOUNT()==null) || 
             (this.TOTALSALEAMOUNT!=null &&
              this.TOTALSALEAMOUNT.equals(other.getTOTALSALEAMOUNT()))) &&
            ((this.TOTALTRANSACTIONS==null && other.getTOTALTRANSACTIONS()==null) || 
             (this.TOTALTRANSACTIONS!=null &&
              this.TOTALTRANSACTIONS.equals(other.getTOTALTRANSACTIONS())));
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
        if (getBATCHID() != null) {
            _hashCode += getBATCHID().hashCode();
        }
        if (getMETHOD() != null) {
            _hashCode += getMETHOD().hashCode();
        }
        if (getPROCESSOR() != null) {
            _hashCode += getPROCESSOR().hashCode();
        }
        if (getSECURENETID() != null) {
            _hashCode += getSECURENETID().hashCode();
        }
        if (getTOTALBATCHAMOUNT() != null) {
            _hashCode += getTOTALBATCHAMOUNT().hashCode();
        }
        if (getTOTALCREDITAMOUNT() != null) {
            _hashCode += getTOTALCREDITAMOUNT().hashCode();
        }
        if (getTOTALSALEAMOUNT() != null) {
            _hashCode += getTOTALSALEAMOUNT().hashCode();
        }
        if (getTOTALTRANSACTIONS() != null) {
            _hashCode += getTOTALTRANSACTIONS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BATCHDETAIL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAIL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BATCHID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("METHOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "METHOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROCESSOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PROCESSOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SECURENETID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SECURENETID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOTALBATCHAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TOTALBATCHAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOTALCREDITAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TOTALCREDITAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOTALSALEAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TOTALSALEAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOTALTRANSACTIONS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TOTALTRANSACTIONS"));
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
