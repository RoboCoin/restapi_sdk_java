package com.securenet.gateway.API.DATA;

public class ISERVICEProxy implements com.securenet.gateway.API.DATA.ISERVICE {
  private String _endpoint = null;
  private com.securenet.gateway.API.DATA.ISERVICE iSERVICE = null;
  
  public ISERVICEProxy() {
    _initISERVICEProxy();
  }
  
  public ISERVICEProxy(String endpoint) {
    _endpoint = endpoint;
    _initISERVICEProxy();
  }
  
  private void _initISERVICEProxy() {
    try {
      iSERVICE = (new org.tempuri.SERVICELocator()).getsoapBinding_ISERVICE();
      if (iSERVICE != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSERVICE)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSERVICE)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSERVICE != null)
      ((javax.xml.rpc.Stub)iSERVICE)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.securenet.gateway.API.DATA.ISERVICE getISERVICE() {
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE;
  }
  
  public com.securenet.gateway.API.Contracts.PLAN_AB getABAccount(com.securenet.gateway.API.Contracts.PLAN_AB oPlan) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getABAccount(oPlan);
  }
  
  public com.securenet.gateway.API.Contracts.PLAN_AB_EXT getABAccount_Ext(com.securenet.gateway.API.Contracts.PLAN_AB_EXT oPlan_Ext) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getABAccount_Ext(oPlan_Ext);
  }
  
  public com.securenet.gateway.API.Contracts.PLAN_AB_EXT[] getABAccounts_Ext(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID, java.lang.Integer isPlan_Ext) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getABAccounts_Ext(merchantKey, customerID, isPlan_Ext);
  }
  
  public com.securenet.gateway.API.Contracts.PLAN_AB[] getABAccounts(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getABAccounts(merchantKey, customerID);
  }
  
  public com.securenet.gateway.API.Contracts.CUSTOMER_VAULT getVaultCustomers(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getVaultCustomers(merchantKey, customerID);
  }
  
  public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[] getVaultAccountByCustomer(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getVaultAccountByCustomer(merchantKey, customerID);
  }
  
  public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT getVaultAccount(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String customerID, java.lang.String paymentID) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getVaultAccount(merchantKey, customerID, paymentID);
  }
  
  public com.securenet.gateway.API.Contracts.ACCOUNT_VAULT[] getVaultRecordByCardNo(com.securenet.gateway.API.Contracts.MERCHANT_KEY merchantKey, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getVaultRecordByCardNo(merchantKey, cardNumber);
  }
  
  public com.securenet.gateway.API.Contracts.P2PRESPONSE getP2PKey(com.securenet.gateway.API.Contracts.P2PREQUEST p2PRequest) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.getP2PKey(p2PRequest);
  }
  
  public com.securenet.gateway.API.Contracts.P2PRESPONSE confirmP2PKey(com.securenet.gateway.API.Contracts.P2PCONFIRMREQUEST request) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.confirmP2PKey(request);
  }
  
  public com.securenet.gateway.API.Contracts.P2PRESPONSE createP2PKey(com.securenet.gateway.API.Contracts.P2PREQUEST request) throws java.rmi.RemoteException{
    if (iSERVICE == null)
      _initISERVICEProxy();
    return iSERVICE.createP2PKey(request);
  }
  
  
}