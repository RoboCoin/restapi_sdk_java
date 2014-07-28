/**
 * Gateway.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface Gateway extends javax.xml.rpc.Service {
    public java.lang.String getBasicHttpBinding_IGatewayAddress();

    public com.securenet.gateway.API.Contracts.IGateway getBasicHttpBinding_IGateway() throws javax.xml.rpc.ServiceException;

    public com.securenet.gateway.API.Contracts.IGateway getBasicHttpBinding_IGateway(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
