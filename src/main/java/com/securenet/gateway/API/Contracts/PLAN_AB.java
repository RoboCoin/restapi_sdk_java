/**
 * PLAN_AB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public class PLAN_AB  implements java.io.Serializable {
    private java.lang.Integer ACTIVE;

    private java.lang.String CUSTOMERID;

    private java.lang.String ENDDATE;

    private com.securenet.gateway.API.Contracts.INSTALLMENT INSTALLMENT;

    private java.lang.Integer MAXRETRIES;

    private com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY;

    private java.lang.String NEXTPAYMENT_DATE;

    private java.lang.String NOTES;

    private java.lang.String PAYMENTID;

    private java.lang.String PAYMENTID2;

    private java.lang.Integer PLANID;

    private com.securenet.gateway.API.Contracts.RECURRING RECURRING;

    private com.securenet.gateway.API.Contracts.PAYMENT_AB[] SCHEDULE;

    private java.lang.String STARTDATE;

    private java.lang.String TYPE;

    public PLAN_AB() {
    }

    public PLAN_AB(
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
           java.lang.String TYPE) {
           this.ACTIVE = ACTIVE;
           this.CUSTOMERID = CUSTOMERID;
           this.ENDDATE = ENDDATE;
           this.INSTALLMENT = INSTALLMENT;
           this.MAXRETRIES = MAXRETRIES;
           this.MERCHANT_KEY = MERCHANT_KEY;
           this.NEXTPAYMENT_DATE = NEXTPAYMENT_DATE;
           this.NOTES = NOTES;
           this.PAYMENTID = PAYMENTID;
           this.PAYMENTID2 = PAYMENTID2;
           this.PLANID = PLANID;
           this.RECURRING = RECURRING;
           this.SCHEDULE = SCHEDULE;
           this.STARTDATE = STARTDATE;
           this.TYPE = TYPE;
    }


    /**
     * Gets the ACTIVE value for this PLAN_AB.
     * 
     * @return ACTIVE
     */
    public java.lang.Integer getACTIVE() {
        return ACTIVE;
    }


    /**
     * Sets the ACTIVE value for this PLAN_AB.
     * 
     * @param ACTIVE
     */
    public void setACTIVE(java.lang.Integer ACTIVE) {
        this.ACTIVE = ACTIVE;
    }


    /**
     * Gets the CUSTOMERID value for this PLAN_AB.
     * 
     * @return CUSTOMERID
     */
    public java.lang.String getCUSTOMERID() {
        return CUSTOMERID;
    }


    /**
     * Sets the CUSTOMERID value for this PLAN_AB.
     * 
     * @param CUSTOMERID
     */
    public void setCUSTOMERID(java.lang.String CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }


    /**
     * Gets the ENDDATE value for this PLAN_AB.
     * 
     * @return ENDDATE
     */
    public java.lang.String getENDDATE() {
        return ENDDATE;
    }


    /**
     * Sets the ENDDATE value for this PLAN_AB.
     * 
     * @param ENDDATE
     */
    public void setENDDATE(java.lang.String ENDDATE) {
        this.ENDDATE = ENDDATE;
    }


    /**
     * Gets the INSTALLMENT value for this PLAN_AB.
     * 
     * @return INSTALLMENT
     */
    public com.securenet.gateway.API.Contracts.INSTALLMENT getINSTALLMENT() {
        return INSTALLMENT;
    }


    /**
     * Sets the INSTALLMENT value for this PLAN_AB.
     * 
     * @param INSTALLMENT
     */
    public void setINSTALLMENT(com.securenet.gateway.API.Contracts.INSTALLMENT INSTALLMENT) {
        this.INSTALLMENT = INSTALLMENT;
    }


    /**
     * Gets the MAXRETRIES value for this PLAN_AB.
     * 
     * @return MAXRETRIES
     */
    public java.lang.Integer getMAXRETRIES() {
        return MAXRETRIES;
    }


    /**
     * Sets the MAXRETRIES value for this PLAN_AB.
     * 
     * @param MAXRETRIES
     */
    public void setMAXRETRIES(java.lang.Integer MAXRETRIES) {
        this.MAXRETRIES = MAXRETRIES;
    }


    /**
     * Gets the MERCHANT_KEY value for this PLAN_AB.
     * 
     * @return MERCHANT_KEY
     */
    public com.securenet.gateway.API.Contracts.MERCHANT_KEY getMERCHANT_KEY() {
        return MERCHANT_KEY;
    }


    /**
     * Sets the MERCHANT_KEY value for this PLAN_AB.
     * 
     * @param MERCHANT_KEY
     */
    public void setMERCHANT_KEY(com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY) {
        this.MERCHANT_KEY = MERCHANT_KEY;
    }


    /**
     * Gets the NEXTPAYMENT_DATE value for this PLAN_AB.
     * 
     * @return NEXTPAYMENT_DATE
     */
    public java.lang.String getNEXTPAYMENT_DATE() {
        return NEXTPAYMENT_DATE;
    }


    /**
     * Sets the NEXTPAYMENT_DATE value for this PLAN_AB.
     * 
     * @param NEXTPAYMENT_DATE
     */
    public void setNEXTPAYMENT_DATE(java.lang.String NEXTPAYMENT_DATE) {
        this.NEXTPAYMENT_DATE = NEXTPAYMENT_DATE;
    }


    /**
     * Gets the NOTES value for this PLAN_AB.
     * 
     * @return NOTES
     */
    public java.lang.String getNOTES() {
        return NOTES;
    }


    /**
     * Sets the NOTES value for this PLAN_AB.
     * 
     * @param NOTES
     */
    public void setNOTES(java.lang.String NOTES) {
        this.NOTES = NOTES;
    }


    /**
     * Gets the PAYMENTID value for this PLAN_AB.
     * 
     * @return PAYMENTID
     */
    public java.lang.String getPAYMENTID() {
        return PAYMENTID;
    }


    /**
     * Sets the PAYMENTID value for this PLAN_AB.
     * 
     * @param PAYMENTID
     */
    public void setPAYMENTID(java.lang.String PAYMENTID) {
        this.PAYMENTID = PAYMENTID;
    }


    /**
     * Gets the PAYMENTID2 value for this PLAN_AB.
     * 
     * @return PAYMENTID2
     */
    public java.lang.String getPAYMENTID2() {
        return PAYMENTID2;
    }


    /**
     * Sets the PAYMENTID2 value for this PLAN_AB.
     * 
     * @param PAYMENTID2
     */
    public void setPAYMENTID2(java.lang.String PAYMENTID2) {
        this.PAYMENTID2 = PAYMENTID2;
    }


    /**
     * Gets the PLANID value for this PLAN_AB.
     * 
     * @return PLANID
     */
    public java.lang.Integer getPLANID() {
        return PLANID;
    }


    /**
     * Sets the PLANID value for this PLAN_AB.
     * 
     * @param PLANID
     */
    public void setPLANID(java.lang.Integer PLANID) {
        this.PLANID = PLANID;
    }


    /**
     * Gets the RECURRING value for this PLAN_AB.
     * 
     * @return RECURRING
     */
    public com.securenet.gateway.API.Contracts.RECURRING getRECURRING() {
        return RECURRING;
    }


    /**
     * Sets the RECURRING value for this PLAN_AB.
     * 
     * @param RECURRING
     */
    public void setRECURRING(com.securenet.gateway.API.Contracts.RECURRING RECURRING) {
        this.RECURRING = RECURRING;
    }


    /**
     * Gets the SCHEDULE value for this PLAN_AB.
     * 
     * @return SCHEDULE
     */
    public com.securenet.gateway.API.Contracts.PAYMENT_AB[] getSCHEDULE() {
        return SCHEDULE;
    }


    /**
     * Sets the SCHEDULE value for this PLAN_AB.
     * 
     * @param SCHEDULE
     */
    public void setSCHEDULE(com.securenet.gateway.API.Contracts.PAYMENT_AB[] SCHEDULE) {
        this.SCHEDULE = SCHEDULE;
    }


    /**
     * Gets the STARTDATE value for this PLAN_AB.
     * 
     * @return STARTDATE
     */
    public java.lang.String getSTARTDATE() {
        return STARTDATE;
    }


    /**
     * Sets the STARTDATE value for this PLAN_AB.
     * 
     * @param STARTDATE
     */
    public void setSTARTDATE(java.lang.String STARTDATE) {
        this.STARTDATE = STARTDATE;
    }


    /**
     * Gets the TYPE value for this PLAN_AB.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this PLAN_AB.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PLAN_AB)) return false;
        PLAN_AB other = (PLAN_AB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACTIVE==null && other.getACTIVE()==null) || 
             (this.ACTIVE!=null &&
              this.ACTIVE.equals(other.getACTIVE()))) &&
            ((this.CUSTOMERID==null && other.getCUSTOMERID()==null) || 
             (this.CUSTOMERID!=null &&
              this.CUSTOMERID.equals(other.getCUSTOMERID()))) &&
            ((this.ENDDATE==null && other.getENDDATE()==null) || 
             (this.ENDDATE!=null &&
              this.ENDDATE.equals(other.getENDDATE()))) &&
            ((this.INSTALLMENT==null && other.getINSTALLMENT()==null) || 
             (this.INSTALLMENT!=null &&
              this.INSTALLMENT.equals(other.getINSTALLMENT()))) &&
            ((this.MAXRETRIES==null && other.getMAXRETRIES()==null) || 
             (this.MAXRETRIES!=null &&
              this.MAXRETRIES.equals(other.getMAXRETRIES()))) &&
            ((this.MERCHANT_KEY==null && other.getMERCHANT_KEY()==null) || 
             (this.MERCHANT_KEY!=null &&
              this.MERCHANT_KEY.equals(other.getMERCHANT_KEY()))) &&
            ((this.NEXTPAYMENT_DATE==null && other.getNEXTPAYMENT_DATE()==null) || 
             (this.NEXTPAYMENT_DATE!=null &&
              this.NEXTPAYMENT_DATE.equals(other.getNEXTPAYMENT_DATE()))) &&
            ((this.NOTES==null && other.getNOTES()==null) || 
             (this.NOTES!=null &&
              this.NOTES.equals(other.getNOTES()))) &&
            ((this.PAYMENTID==null && other.getPAYMENTID()==null) || 
             (this.PAYMENTID!=null &&
              this.PAYMENTID.equals(other.getPAYMENTID()))) &&
            ((this.PAYMENTID2==null && other.getPAYMENTID2()==null) || 
             (this.PAYMENTID2!=null &&
              this.PAYMENTID2.equals(other.getPAYMENTID2()))) &&
            ((this.PLANID==null && other.getPLANID()==null) || 
             (this.PLANID!=null &&
              this.PLANID.equals(other.getPLANID()))) &&
            ((this.RECURRING==null && other.getRECURRING()==null) || 
             (this.RECURRING!=null &&
              this.RECURRING.equals(other.getRECURRING()))) &&
            ((this.SCHEDULE==null && other.getSCHEDULE()==null) || 
             (this.SCHEDULE!=null &&
              java.util.Arrays.equals(this.SCHEDULE, other.getSCHEDULE()))) &&
            ((this.STARTDATE==null && other.getSTARTDATE()==null) || 
             (this.STARTDATE!=null &&
              this.STARTDATE.equals(other.getSTARTDATE()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE())));
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
        if (getACTIVE() != null) {
            _hashCode += getACTIVE().hashCode();
        }
        if (getCUSTOMERID() != null) {
            _hashCode += getCUSTOMERID().hashCode();
        }
        if (getENDDATE() != null) {
            _hashCode += getENDDATE().hashCode();
        }
        if (getINSTALLMENT() != null) {
            _hashCode += getINSTALLMENT().hashCode();
        }
        if (getMAXRETRIES() != null) {
            _hashCode += getMAXRETRIES().hashCode();
        }
        if (getMERCHANT_KEY() != null) {
            _hashCode += getMERCHANT_KEY().hashCode();
        }
        if (getNEXTPAYMENT_DATE() != null) {
            _hashCode += getNEXTPAYMENT_DATE().hashCode();
        }
        if (getNOTES() != null) {
            _hashCode += getNOTES().hashCode();
        }
        if (getPAYMENTID() != null) {
            _hashCode += getPAYMENTID().hashCode();
        }
        if (getPAYMENTID2() != null) {
            _hashCode += getPAYMENTID2().hashCode();
        }
        if (getPLANID() != null) {
            _hashCode += getPLANID().hashCode();
        }
        if (getRECURRING() != null) {
            _hashCode += getRECURRING().hashCode();
        }
        if (getSCHEDULE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSCHEDULE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSCHEDULE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSTARTDATE() != null) {
            _hashCode += getSTARTDATE().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PLAN_AB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTIVE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACTIVE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUSTOMERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENDDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSTALLMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAXRETRIES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MAXRETRIES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MERCHANT_KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEXTPAYMENT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NEXTPAYMENT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "NOTES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAYMENTID2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENTID2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLANID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RECURRING");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RECURRING"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RECURRING"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDULE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SCHEDULE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STARTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "STARTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TYPE"));
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
