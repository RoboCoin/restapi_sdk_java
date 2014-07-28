/**
 * SoapBinding_ISERVICEStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SoapBinding_ISERVICEStub extends org.apache.axis.client.Stub implements com.securenet.gateway.API.DATA.ISERVICE {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetABAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "oPlan"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), com.securenet.gateway.API.Contracts.PLAN_AB.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.PLAN_AB.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetABAccount_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "oPlan_Ext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT"), com.securenet.gateway.API.Contracts.PLAN_AB_EXT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.PLAN_AB_EXT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccount_ExtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetABAccounts_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CustomerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "isPlan_Ext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfPLAN_AB_EXT"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.PLAN_AB_EXT[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccounts_ExtResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetABAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CustomerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfPLAN_AB"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.PLAN_AB[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccountsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVaultCustomers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CustomerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_VAULT"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.CUSTOMER_VAULT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultCustomersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVaultAccountByCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CustomerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfACCOUNT_VAULT"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultAccountByCustomerResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVaultAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CustomerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "PaymentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.ACCOUNT_VAULT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVaultRecordByCardNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CardNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfACCOUNT_VAULT"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultRecordByCardNoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetP2PKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "P2PRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PREQUEST"), com.securenet.gateway.API.Contracts.P2PREQUEST.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.P2PRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetP2PKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfirmP2PKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PCONFIRMREQUEST"), com.securenet.gateway.API.Contracts.P2PCONFIRMREQUEST.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.P2PRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "ConfirmP2PKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateP2PKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PREQUEST"), com.securenet.gateway.API.Contracts.P2PREQUEST.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.P2PRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CreateP2PKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public SoapBinding_ISERVICEStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBinding_ISERVICEStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBinding_ISERVICEStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.ACCOUNT_VAULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfACCOUNT_VAULT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfPAYMENT_AB");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PAYMENT_AB[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfPLAN_AB");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PLAN_AB[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfPLAN_AB_EXT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PLAN_AB_EXT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CARD");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CARD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECK");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CHECK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CUSTOMER_BILL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_VAULT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CUSTOMER_VAULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.INSTALLMENT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.MERCHANT_KEY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPTIONS");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.OPTIONS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2P_PUBLIC_KEY");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.P2P_PUBLIC_KEY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PCONFIRMREQUEST");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.P2PCONFIRMREQUEST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PREQUEST");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.P2PREQUEST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "P2PRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.P2PRESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PAYMENT_AB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PLAN_AB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PLAN_AB_EXT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RECURRING");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.RECURRING.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.RESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "USERDEFINED");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.USERDEFINED.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.securenet.gateway.API.Contracts.PLAN_AB getABAccount(com.securenet.gateway.API.Contracts.PLAN_AB oPlan) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetABAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {oPlan});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.PLAN_AB) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.PLAN_AB) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.PLAN_AB.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.PLAN_AB_EXT getABAccount_Ext(com.securenet.gateway.API.Contracts.PLAN_AB_EXT oPlan_Ext) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetABAccount_Ext");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccount_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {oPlan_Ext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.PLAN_AB_EXT) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.PLAN_AB_EXT) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.PLAN_AB_EXT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.PLAN_AB_EXT[] getABAccounts_Ext(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID, java.lang.Integer isPlan_Ext) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetABAccounts_Ext");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccounts_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, customerID, isPlan_Ext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.PLAN_AB_EXT[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.PLAN_AB_EXT[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.PLAN_AB_EXT[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.PLAN_AB[] getABAccounts(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetABAccounts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetABAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, customerID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.PLAN_AB[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.PLAN_AB[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.PLAN_AB[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.CUSTOMER_VAULT getVaultCustomers(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetVaultCustomers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultCustomers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, customerID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.CUSTOMER_VAULT) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.CUSTOMER_VAULT) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.CUSTOMER_VAULT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[] getVaultAccountByCustomer(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetVaultAccountByCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultAccountByCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, customerID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT getVaultAccount(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID, java.lang.String paymentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetVaultAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, customerID, paymentID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.ACCOUNT_VAULT) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.ACCOUNT_VAULT) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.ACCOUNT_VAULT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[] getVaultRecordByCardNo(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String cardNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetVaultRecordByCardNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetVaultRecordByCardNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, cardNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.P2PRESPONSE getP2PKey(com.securenet.gateway.API.Contracts.P2PREQUEST p2PRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/GetP2PKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetP2PKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {p2PRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.P2PRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.P2PRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.P2PRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.P2PRESPONSE confirmP2PKey(com.securenet.gateway.API.Contracts.P2PCONFIRMREQUEST request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/ConfirmP2PKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "ConfirmP2PKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.P2PRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.P2PRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.P2PRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.P2PRESPONSE createP2PKey(com.securenet.gateway.API.Contracts.P2PREQUEST request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ISERVICE/CreateP2PKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CreateP2PKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.P2PRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.P2PRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.P2PRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
