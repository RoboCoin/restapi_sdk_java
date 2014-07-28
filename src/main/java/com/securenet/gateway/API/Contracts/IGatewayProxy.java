package com.securenet.gateway.API.Contracts;

import java.rmi.RemoteException;

public class IGatewayProxy implements com.securenet.gateway.API.Contracts.IGateway {
  private String _endpoint = null;
  private com.securenet.gateway.API.Contracts.IGateway iGateway = null;
  
  public IGatewayProxy() {
    _initIGatewayProxy();
  }
  
  public IGatewayProxy(String endpoint) {
    _endpoint = endpoint;
    _initIGatewayProxy();
  }
  
  private void _initIGatewayProxy() {
    try {
      iGateway = (new org.tempuri.GatewayLocator()).getBasicHttpBinding_IGateway();
      if (iGateway != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iGateway)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iGateway)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iGateway != null)
      ((javax.xml.rpc.Stub)iGateway)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.securenet.gateway.API.Contracts.IGateway getIGateway() {
    if (iGateway == null)
      _initIGatewayProxy();
    return iGateway;
  }


public GATEWAYRESPONSE processTransaction(TRANSACTION transaction) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.processTransaction(transaction);
}


public GATEWAYRESPONSE processVaultTransaction(TRANSACTION_VAULT transactionVAULT) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.processVaultTransaction(transactionVAULT);
}


public IMAGERESPONSE updateTransaction(TRANSACTIONIMAGE transactionimage) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.updateTransaction(transactionimage);
}


public GATEWAYRESPONSE processAccount(TRANSACTION_VAULT transactionVAULT) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.processAccount(transactionVAULT);
}


public GATEWAYRESPONSE processCustomer(TRANSACTION_VAULT transactionVAULT) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.processCustomer(transactionVAULT);
}


public GATEWAYRESPONSE processCustomerAndAccount(TRANSACTION_VAULT transactionVAULT) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.processCustomerAndAccount(transactionVAULT);
}


public GATEWAYRESPONSE copyVaultAccount(MERCHANT_KEY source, ACCOUNT_VAULT sourceACCOUNTVAULT, MERCHANT_KEY targetMERCHANTKEY, ACCOUNT_VAULT targetACCOUNTVAULT, Integer createCUSTOMER, Integer changeACCOUNTINFOTOTARGET) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.copyVaultAccount(source, sourceACCOUNTVAULT, targetMERCHANTKEY, targetACCOUNTVAULT, createCUSTOMER, changeACCOUNTINFOTOTARGET);
}


public GATEWAYRESPONSE addABAccount(PLAN_AB planAB) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.addABAccount(planAB);
}


public GATEWAYRESPONSE updateABAccount(PLAN_AB planAB) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.updateABAccount(planAB);
}


public GATEWAYRESPONSE updateABSchedule(PLAN_AB planAB) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.updateABSchedule(planAB);
}


public BATCHDATA closeBatch(MERCHANT_KEY merchantKEY) throws RemoteException {
    if (iGateway == null)
        _initIGatewayProxy();
      return iGateway.closeBatch(merchantKEY);
}
  
  
}