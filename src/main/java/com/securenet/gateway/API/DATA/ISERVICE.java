/**
 * ISERVICE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.DATA;

public interface ISERVICE extends java.rmi.Remote {
    public com.securenet.gateway.API.Contracts.PLAN_AB getABAccount(com.securenet.gateway.API.Contracts.PLAN_AB oPlan) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.PLAN_AB_EXT getABAccount_Ext(com.securenet.gateway.API.Contracts.PLAN_AB_EXT oPlan_Ext) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.PLAN_AB_EXT[] getABAccounts_Ext(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID, java.lang.Integer isPlan_Ext) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.PLAN_AB[] getABAccounts(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.CUSTOMER_VAULT getVaultCustomers(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[] getVaultAccountByCustomer(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT getVaultAccount(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID, java.lang.String paymentID) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[] getVaultRecordByCardNo(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String cardNumber) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.P2PRESPONSE getP2PKey(com.securenet.gateway.API.Contracts.P2PREQUEST p2PRequest) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.P2PRESPONSE confirmP2PKey(com.securenet.gateway.API.Contracts.P2PCONFIRMREQUEST request) throws java.rmi.RemoteException;
    public com.securenet.gateway.API.Contracts.P2PRESPONSE createP2PKey(com.securenet.gateway.API.Contracts.P2PREQUEST request) throws java.rmi.RemoteException;
}
