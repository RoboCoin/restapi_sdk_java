/**
 * BasicHttpBinding_ITRANSACTIONStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BasicHttpBinding_ITRANSACTIONStub extends org.apache.axis.client.Stub implements com.securenet.gateway.API.DATA.ITRANSACTION {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTransactions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "StartDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "EndDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "ExcludeDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "CustomerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "Amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "RBOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfTRANSACTIONRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetTransactionsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTransactionByTransactionID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "TransactionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetTransactionByTransactionIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTransactionByOrderID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "OrderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetTransactionByOrderIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBatchTransactions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "BatchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfTRANSACTIONRESPONSE"));
        oper.setReturnClass(com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetBatchTransactionsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentBatchID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "MerchantKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY"), com.securenet.gateway.API.Contracts.MERCHANT_KEY.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetCurrentBatchIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public BasicHttpBinding_ITRANSACTIONStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ITRANSACTIONStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ITRANSACTIONStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "ArrayOfTRANSACTIONRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE");
            qName2 = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "CUSTOMER_BILL");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.CUSTOMER_BILL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "MERCHANT_KEY");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.MERCHANT_KEY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "RESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.RESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://gateway.securenet.com/API/Contracts", "TRANSACTIONRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE.class;
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

    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[] getTransactions(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String startDate, java.lang.String endDate, java.lang.String excludeDate, java.lang.String customerID, java.math.BigDecimal amount, java.lang.String RBOnly) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ITRANSACTION/GetTransactions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, startDate, endDate, excludeDate, customerID, amount, RBOnly});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTransactionByTransactionID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String transactionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ITRANSACTION/GetTransactionByTransactionID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetTransactionByTransactionID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, transactionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTransactionByOrderID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String orderID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ITRANSACTION/GetTransactionByOrderID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetTransactionByOrderID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, orderID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[] getBatchTransactions(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String batchID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ITRANSACTION/GetBatchTransactions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetBatchTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey, batchID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getCurrentBatchID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://gateway.securenet.com/API/DATA/ITRANSACTION/GetCurrentBatchID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://gateway.securenet.com/API/DATA/", "GetCurrentBatchID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {merchantKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
