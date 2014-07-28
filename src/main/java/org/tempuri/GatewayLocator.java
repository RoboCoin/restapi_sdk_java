/**
 * GatewayLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GatewayLocator extends org.apache.axis.client.Service implements org.tempuri.Gateway {

    public GatewayLocator() {
    }


    public GatewayLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GatewayLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IGateway
    private java.lang.String BasicHttpBinding_IGateway_address = "http://certify.securenet.com/API/Gateway.svc/soap";

    public java.lang.String getBasicHttpBinding_IGatewayAddress() {
        return BasicHttpBinding_IGateway_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IGatewayWSDDServiceName = "BasicHttpBinding_IGateway";

    public java.lang.String getBasicHttpBinding_IGatewayWSDDServiceName() {
        return BasicHttpBinding_IGatewayWSDDServiceName;
    }

    public void setBasicHttpBinding_IGatewayWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IGatewayWSDDServiceName = name;
    }

    public com.securenet.gateway.API.Contracts.IGateway getBasicHttpBinding_IGateway() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IGateway_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IGateway(endpoint);
    }

    public com.securenet.gateway.API.Contracts.IGateway getBasicHttpBinding_IGateway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IGatewayStub _stub = new org.tempuri.BasicHttpBinding_IGatewayStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IGatewayWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IGatewayEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IGateway_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.securenet.gateway.API.Contracts.IGateway.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IGatewayStub _stub = new org.tempuri.BasicHttpBinding_IGatewayStub(new java.net.URL(BasicHttpBinding_IGateway_address), this);
                _stub.setPortName(getBasicHttpBinding_IGatewayWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IGateway".equals(inputPortName)) {
            return getBasicHttpBinding_IGateway();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Gateway");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IGateway"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IGateway".equals(portName)) {
            setBasicHttpBinding_IGatewayEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
