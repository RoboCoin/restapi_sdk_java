/**
 * ITRANSACTION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.DATA;

public interface ITRANSACTION extends java.rmi.Remote {
    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[] getTransactions(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String startDate, java.lang.String endDate, java.lang.String excludeDate, java.lang.String customerID, java.math.BigDecimal amount, java.lang.String RBOnly) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTransactionByTransactionID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String transactionID) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTransactionByOrderID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String orderID) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[] getBatchTransactions(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String batchID) throws java.rmi.RemoteException;
    public java.lang.String getCurrentBatchID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey) throws java.rmi.RemoteException;
}
