/**
 * ISERVICE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.securenet.gateway.API.Contracts;

public interface IGateway extends java.rmi.Remote {
    
    
	public GATEWAYRESPONSE processTransaction(  TRANSACTION transaction) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE processVaultTransaction(  TRANSACTION_VAULT transactionVAULT) throws java.rmi.RemoteException;
	public IMAGERESPONSE updateTransaction(  TRANSACTIONIMAGE transactionimage) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE processAccount(  TRANSACTION_VAULT transactionVAULT) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE processCustomer(TRANSACTION_VAULT transactionVAULT) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE processCustomerAndAccount( TRANSACTION_VAULT transactionVAULT) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE copyVaultAccount( MERCHANT_KEY source,  ACCOUNT_VAULT sourceACCOUNTVAULT,  MERCHANT_KEY targetMERCHANTKEY, ACCOUNT_VAULT targetACCOUNTVAULT,Integer createCUSTOMER,Integer changeACCOUNTINFOTOTARGET) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE addABAccount(  PLAN_AB planAB) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE updateABAccount( PLAN_AB planAB) throws java.rmi.RemoteException;
	public GATEWAYRESPONSE updateABSchedule(PLAN_AB planAB) throws java.rmi.RemoteException;
	public BATCHDATA closeBatch( MERCHANT_KEY merchantKEY) throws java.rmi.RemoteException;
    
    
    
    
}
