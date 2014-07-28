/**
 * TERMINAL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class TERMINAL  implements java.io.Serializable {
    private java.lang.String STORENUMBER;

    private java.lang.String TERMINALCITY;

    private java.lang.String TERMINALID;

    private java.lang.String TERMINALLOCATION;

    private java.lang.String TERMINALSTATE;

    public TERMINAL() {
    }

    public TERMINAL(
           java.lang.String STORENUMBER,
           java.lang.String TERMINALCITY,
           java.lang.String TERMINALID,
           java.lang.String TERMINALLOCATION,
           java.lang.String TERMINALSTATE) {
           this.STORENUMBER = STORENUMBER;
           this.TERMINALCITY = TERMINALCITY;
           this.TERMINALID = TERMINALID;
           this.TERMINALLOCATION = TERMINALLOCATION;
           this.TERMINALSTATE = TERMINALSTATE;
    }


    /**
     * Gets the STORENUMBER value for this TERMINAL.
     * 
     * @return STORENUMBER
     */
    public java.lang.String getSTORENUMBER() {
        return STORENUMBER;
    }


    /**
     * Sets the STORENUMBER value for this TERMINAL.
     * 
     * @param STORENUMBER
     */
    public void setSTORENUMBER(java.lang.String STORENUMBER) {
        this.STORENUMBER = STORENUMBER;
    }


    /**
     * Gets the TERMINALCITY value for this TERMINAL.
     * 
     * @return TERMINALCITY
     */
    public java.lang.String getTERMINALCITY() {
        return TERMINALCITY;
    }


    /**
     * Sets the TERMINALCITY value for this TERMINAL.
     * 
     * @param TERMINALCITY
     */
    public void setTERMINALCITY(java.lang.String TERMINALCITY) {
        this.TERMINALCITY = TERMINALCITY;
    }


    /**
     * Gets the TERMINALID value for this TERMINAL.
     * 
     * @return TERMINALID
     */
    public java.lang.String getTERMINALID() {
        return TERMINALID;
    }


    /**
     * Sets the TERMINALID value for this TERMINAL.
     * 
     * @param TERMINALID
     */
    public void setTERMINALID(java.lang.String TERMINALID) {
        this.TERMINALID = TERMINALID;
    }


    /**
     * Gets the TERMINALLOCATION value for this TERMINAL.
     * 
     * @return TERMINALLOCATION
     */
    public java.lang.String getTERMINALLOCATION() {
        return TERMINALLOCATION;
    }


    /**
     * Sets the TERMINALLOCATION value for this TERMINAL.
     * 
     * @param TERMINALLOCATION
     */
    public void setTERMINALLOCATION(java.lang.String TERMINALLOCATION) {
        this.TERMINALLOCATION = TERMINALLOCATION;
    }


    /**
     * Gets the TERMINALSTATE value for this TERMINAL.
     * 
     * @return TERMINALSTATE
     */
    public java.lang.String getTERMINALSTATE() {
        return TERMINALSTATE;
    }


    /**
     * Sets the TERMINALSTATE value for this TERMINAL.
     * 
     * @param TERMINALSTATE
     */
    public void setTERMINALSTATE(java.lang.String TERMINALSTATE) {
        this.TERMINALSTATE = TERMINALSTATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TERMINAL)) return false;
        TERMINAL other = (TERMINAL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.STORENUMBER==null && other.getSTORENUMBER()==null) || 
             (this.STORENUMBER!=null &&
              this.STORENUMBER.equals(other.getSTORENUMBER()))) &&
            ((this.TERMINALCITY==null && other.getTERMINALCITY()==null) || 
             (this.TERMINALCITY!=null &&
              this.TERMINALCITY.equals(other.getTERMINALCITY()))) &&
            ((this.TERMINALID==null && other.getTERMINALID()==null) || 
             (this.TERMINALID!=null &&
              this.TERMINALID.equals(other.getTERMINALID()))) &&
            ((this.TERMINALLOCATION==null && other.getTERMINALLOCATION()==null) || 
             (this.TERMINALLOCATION!=null &&
              this.TERMINALLOCATION.equals(other.getTERMINALLOCATION()))) &&
            ((this.TERMINALSTATE==null && other.getTERMINALSTATE()==null) || 
             (this.TERMINALSTATE!=null &&
              this.TERMINALSTATE.equals(other.getTERMINALSTATE())));
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
        if (getSTORENUMBER() != null) {
            _hashCode += getSTORENUMBER().hashCode();
        }
        if (getTERMINALCITY() != null) {
            _hashCode += getTERMINALCITY().hashCode();
        }
        if (getTERMINALID() != null) {
            _hashCode += getTERMINALID().hashCode();
        }
        if (getTERMINALLOCATION() != null) {
            _hashCode += getTERMINALLOCATION().hashCode();
        }
        if (getTERMINALSTATE() != null) {
            _hashCode += getTERMINALSTATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TERMINAL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINAL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STORENUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "STORENUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINALCITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINALCITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINALID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINALID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINALLOCATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINALLOCATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINALSTATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINALSTATE"));
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
