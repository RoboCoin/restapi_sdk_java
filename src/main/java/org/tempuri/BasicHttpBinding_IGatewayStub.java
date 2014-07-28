/**
 * BasicHttpBinding_IGatewayStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BasicHttpBinding_IGatewayStub extends org.apache.axis.client.Stub implements com.securenet.gateway.API.Contracts.IGateway {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION"), com.securenet.gateway.API.Contracts.TRANSACTION.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessTransactionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessVaultTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), com.securenet.gateway.API.Contracts.TRANSACTION_VAULT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessVaultTransactionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONIMAGE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONIMAGE"), com.securenet.gateway.API.Contracts.TRANSACTIONIMAGE.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "IMAGERESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.IMAGERESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UpdateTransactionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), com.securenet.gateway.API.Contracts.TRANSACTION_VAULT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessCustomer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), com.securenet.gateway.API.Contracts.TRANSACTION_VAULT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessCustomerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessCustomerAndAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT"), com.securenet.gateway.API.Contracts.TRANSACTION_VAULT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessCustomerAndAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CopyVaultAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SOURCE_MERCHANT_KEY"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SOURCE_ACCOUNT_VAULT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"), com.securenet.gateway.API.Contracts.ACCOUNT_VAULT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TARGET_MERCHANT_KEY"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TARGET_ACCOUNT_VAULT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT"), com.securenet.gateway.API.Contracts.ACCOUNT_VAULT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CREATE_CUSTOMER"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHANGE_ACCOUNT_INFO_TO_TARGET"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CopyVaultAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddABAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), com.securenet.gateway.API.Contracts.PLAN_AB.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AddABAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProcessABAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB_EXT"), com.securenet.gateway.API.Contracts.PLAN_AB_EXT.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPERATIONPARAMETERS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPERATIONPARAMETERS"), com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessABAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateABAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), com.securenet.gateway.API.Contracts.PLAN_AB.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UpdateABAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateABSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PLAN_AB"), com.securenet.gateway.API.Contracts.PLAN_AB.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UpdateABScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CloseBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDATA"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.BATCHDATA.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CloseBatchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public BasicHttpBinding_IGatewayStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IGatewayStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IGatewayStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ABRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.ABRESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ACCOUNT_VAULT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.ACCOUNT_VAULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfBATCHDETAIL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.BATCHDETAIL[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAIL");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAIL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfLEVEL3PRODUCT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.LEVEL3PRODUCT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCT");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCT");
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

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfPRODUCT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PRODUCT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AUTO");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.AUTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDATA");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.BATCHDATA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "BATCHDETAIL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.BATCHDETAIL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CHECKIMAGE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CHECKIMAGE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CUSTOMER_BILL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_SHIP");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CUSTOMER_SHIP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_VAULT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CUSTOMER_VAULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ENCRYPTION");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.ENCRYPTION.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "GATEWAYRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HEALTHCARE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.HEALTHCARE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "HOTEL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.HOTEL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "IMAGE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.IMAGE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "IMAGERESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.IMAGERESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "INSTALLMENT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.INSTALLMENT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL2");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.LEVEL2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.LEVEL3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "LEVEL3PRODUCT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.LEVEL3PRODUCT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.MERCHANT_KEY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MPI");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.MPI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPERATIONPARAMETERS");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "OPTIONS");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.OPTIONS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PAYMENT_AB");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PAYMENT_AB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PETROLEUM");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PETROLEUM.class;
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

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "PRODUCT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.PRODUCT.class;
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

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "SERVICE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.SERVICE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TERMINAL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TERMINAL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TRANSACTION.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTION_VAULT");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TRANSACTION_VAULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONIMAGE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TRANSACTIONIMAGE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "USERDEFINED");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.USERDEFINED.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTACCOUNTRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.VAULTACCOUNTRESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "VAULTCUSTOMERRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.VAULTCUSTOMERRESPONSE.class;
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

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE processTransaction(com.securenet.gateway.API.Contracts.TRANSACTION TRANSACTION) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/ProcessTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TRANSACTION});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE processVaultTransaction(com.securenet.gateway.API.Contracts.TRANSACTION_VAULT TRANSACTION_VAULT) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/ProcessVaultTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessVaultTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TRANSACTION_VAULT});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.IMAGERESPONSE updateTransaction(com.securenet.gateway.API.Contracts.TRANSACTIONIMAGE TRANSACTIONIMAGE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/UpdateTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UpdateTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TRANSACTIONIMAGE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.IMAGERESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.IMAGERESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.IMAGERESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE processAccount(com.securenet.gateway.API.Contracts.TRANSACTION_VAULT TRANSACTION_VAULT) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/ProcessAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TRANSACTION_VAULT});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE processCustomer(com.securenet.gateway.API.Contracts.TRANSACTION_VAULT TRANSACTION_VAULT) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/ProcessCustomer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessCustomer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TRANSACTION_VAULT});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE processCustomerAndAccount(com.securenet.gateway.API.Contracts.TRANSACTION_VAULT TRANSACTION_VAULT) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/ProcessCustomerAndAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessCustomerAndAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {TRANSACTION_VAULT});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE copyVaultAccount(com.securenet.gateway.API.Contracts.MERCHANT_KEY SOURCE_MERCHANT_KEY, com.securenet.gateway.API.Contracts.ACCOUNT_VAULT SOURCE_ACCOUNT_VAULT, com.securenet.gateway.API.Contracts.MERCHANT_KEY TARGET_MERCHANT_KEY, com.securenet.gateway.API.Contracts.ACCOUNT_VAULT TARGET_ACCOUNT_VAULT, java.lang.Integer CREATE_CUSTOMER, java.lang.Integer CHANGE_ACCOUNT_INFO_TO_TARGET) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/CopyVaultAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CopyVaultAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SOURCE_MERCHANT_KEY, SOURCE_ACCOUNT_VAULT, TARGET_MERCHANT_KEY, TARGET_ACCOUNT_VAULT, CREATE_CUSTOMER, CHANGE_ACCOUNT_INFO_TO_TARGET});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE addABAccount(com.securenet.gateway.API.Contracts.PLAN_AB PLAN_AB) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/AddABAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "AddABAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PLAN_AB});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE processABAccount(com.securenet.gateway.API.Contracts.PLAN_AB_EXT PLAN_AB_EXT, com.securenet.gateway.API.Contracts.OPERATIONPARAMETERS OPERATIONPARAMETERS) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/ProcessABAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ProcessABAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PLAN_AB_EXT, OPERATIONPARAMETERS});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE updateABAccount(com.securenet.gateway.API.Contracts.PLAN_AB PLAN_AB) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/UpdateABAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UpdateABAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PLAN_AB});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.GATEWAYRESPONSE updateABSchedule(com.securenet.gateway.API.Contracts.PLAN_AB PLAN_AB) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/UpdateABSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "UpdateABSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PLAN_AB});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.GATEWAYRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.GATEWAYRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.BATCHDATA closeBatch(com.securenet.gateway.API.Contracts.MERCHANT_KEY MERCHANT_KEY) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/Contracts/IGateway/CloseBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CloseBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {MERCHANT_KEY});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.BATCHDATA) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.BATCHDATA) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.BATCHDATA.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
