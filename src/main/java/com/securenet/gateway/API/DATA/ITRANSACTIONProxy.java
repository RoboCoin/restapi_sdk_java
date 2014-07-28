package com.securenet.gateway.API.DATA;

public class ITRANSACTIONProxy implements com.securenet.gateway.API.DATA.ITRANSACTION {
  private String _endpoint = null;
  private com.securenet.gateway.API.DATA.ITRANSACTION iTRANSACTION = null;
  
  public ITRANSACTIONProxy() {
    _initITRANSACTIONProxy();
  }
  
  public ITRANSACTIONProxy(String endpoint) {
    _endpoint = endpoint;
    _initITRANSACTIONProxy();
  }
  
  private void _initITRANSACTIONProxy() {
    try {
      iTRANSACTION = (new org.tempuri.TRANSACTIONLocator()).getBasicHttpBinding_ITRANSACTION();
      if (iTRANSACTION != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTRANSACTION)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTRANSACTION)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTRANSACTION != null)
      ((javax.xml.rpc.Stub)iTRANSACTION)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.securenet.gateway.API.DATA.ITRANSACTION getITRANSACTION() {
    if (iTRANSACTION == null)
      _initITRANSACTIONProxy();
    return iTRANSACTION;
  }
  
  public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[] getTransactions(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String startDate, java.lang.String endDate, java.lang.String excludeDate, java.lang.String customerID, java.math.BigDecimal amount, java.lang.String RBOnly) throws java.rmi.RemoteException{
    if (iTRANSACTION == null)
      _initITRANSACTIONProxy();
    return iTRANSACTION.getTransactions(merchantKey, startDate, endDate, excludeDate, customerID, amount, RBOnly);
  }
  
  public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTransactionByTransactionID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String transactionID) throws java.rmi.RemoteException{
    if (iTRANSACTION == null)
      _initITRANSACTIONProxy();
    return iTRANSACTION.getTransactionByTransactionID(merchantKey, transactionID);
  }
  
  public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE getTransactionByOrderID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String orderID) throws java.rmi.RemoteException{
    if (iTRANSACTION == null)
      _initITRANSACTIONProxy();
    return iTRANSACTION.getTransactionByOrderID(merchantKey, orderID);
  }
  
  public com.securenet.gateway.API.Contracts.TRANSACTIONRESPONSE[] getBatchTransactions(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String batchID) throws java.rmi.RemoteException{
    if (iTRANSACTION == null)
      _initITRANSACTIONProxy();
    return iTRANSACTION.getBatchTransactions(merchantKey, batchID);
  }
  
  public java.lang.String getCurrentBatchID(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey) throws java.rmi.RemoteException{
    if (iTRANSACTION == null)
      _initITRANSACTIONProxy();
    return iTRANSACTION.getCurrentBatchID(merchantKey);
  }
  
  
}