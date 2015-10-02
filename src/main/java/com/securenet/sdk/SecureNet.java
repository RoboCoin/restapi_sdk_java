package com.securenet.sdk;

import java.net.URL;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.tempuri.GatewayLocator;
import org.tempuri.SERVICELocator;
import org.tempuri.TRANSACTIONLocator;

import com.securenet.gateway.API.Contracts.IGateway;
import com.securenet.gateway.API.Contracts.MERCHANT_KEY;
import com.securenet.gateway.API.DATA.ISERVICE;
import com.securenet.gateway.API.DATA.ITRANSACTION;
import com.securenet.sdk.response.AddCustomerResponse;
import com.securenet.sdk.response.AddPaymentMethodResponse;
import com.securenet.sdk.response.BatchResponse;
import com.securenet.sdk.response.ChargeResponse;
import com.securenet.sdk.response.CreditResponse;
import com.securenet.sdk.response.PaymentPlanResponse;
import com.securenet.sdk.response.PreVaultResponse;
import com.securenet.sdk.response.RefundRequest;
import com.securenet.sdk.response.RefundResponse;
import com.securenet.sdk.response.SecureNetResponse;
import com.securenet.sdk.response.StoredPaymentPlan;
import com.securenet.sdk.response.StoredTransaction;
import com.securenet.sdk.response.UpdateCustomerResponse;
import com.securenet.sdk.response.VaultCustomer;
import com.securenet.sdk.response.VerificationResponse;

/**
 * SecureNet represents the public proxy between your Java code and the SecureNet processing system.  Every method needed to communicate
 * with the backend is exposed in this class.
 */
public class SecureNet {

	public enum Environment { PRODUCTION, CERTFICATION, SANDBOX }
	
	protected MERCHANT_KEY merchantKey;
	protected MERCHANT_KEY secondaryMerchantKey;
	protected Environment environment;
	protected SdkToWsdlMapper mapper;
	
	// External public endpoints
	
	/**
	 * Create a proxy for the PRODUCTION SecureNet gateway 
	 * @param id the m_id of the account
	 * @param key the secret key to authenticate the account 
	 */
	public SecureNet(String id, String key /*, SecureNetConfiguration config */) {
		this(id, key, Environment.PRODUCTION, null, null);
	}
	
	/**
	 * Create a proxy for the PRODUCTION SecureNet gateway 
	 * @param id the m_id of the account
	 * @param key the secret key to authenticate the account 
	 */
	public SecureNet(String id, String key, String vaultId, String vaultKey /*, SecureNetConfiguration config */) {
		this(id, key, Environment.PRODUCTION, vaultId, vaultKey);
	}
	
	/**
	 * Create a proxy for the SecureNet gateway
	 * @param id the m_id of the account
	 * @param key the secret key to authenticate the account
	 * @param environment the destination to connect into - PRODUCTION, CERTFICATION, or SANDBOX
	 */
	public SecureNet(String id, String key, Environment environment, String vaultId, String vaultKey) {
		merchantKey = new MERCHANT_KEY();
		merchantKey.setSECUREKEY(key);
		merchantKey.setSECURENETID(Integer.valueOf(id));
		if (vaultId != null && vaultKey != null) {
			secondaryMerchantKey = merchantKey;
			merchantKey = new MERCHANT_KEY();
			merchantKey.setSECUREKEY(vaultKey);
			merchantKey.setSECURENETID(Integer.valueOf(vaultId));
		}
		this.environment = environment;
		mapper = new SdkToWsdlMapper();
	}

	// The remainder of this class contains the business logic mappings between our inbound calls and the SOAP calls specified in the generated WSDL package
	// It will assemble the actual request objects

	////////////////////////////////////////////////////////////////////////
	// Vaulting
	
	public PreVaultResponse preVault(PreVaultRequest request) {
		return new SecureNetVault(this).preVault(request);
	}
	
	////////////////////////////////////////////////////////////////////////
	// Batches
	
	public BatchResponse getCurrentBatchId() {
		return new SecureNetBatch(this).getCurrentBatchId();
	}
	
	public BatchResponse closeBatch() {
		return new SecureNetBatch(this).closeBatch();
	}
	

	////////////////////////////////////////////////////////////////////////
	// Customers
	
	public VaultCustomer getCustomer(String customerId) {
		return new SecureNetVault(this).getVaultCustomer(customerId);
	}
	
	public AddCustomerResponse addCustomer(AddCustomerRequest request) {
		return new SecureNetVault(this).addVaultCustomer(request);
	}
	
	public UpdateCustomerResponse updateCustomer(UpdateCustomerRequest request) {
		return new SecureNetVault(this).updateVaultCustomer(request);
	}
	
	public SecureNetResponse removeCustomer(String customerId) {
		return new SecureNetVault(this).removeVaultCustomer(customerId);
	}
	
	public AddPaymentMethodResponse addCustomerPaymentMethod(AddPaymentMethodRequest request) {
		return new SecureNetVault(this).addVaultCustomerPaymentMethod(request);
	}
	
	public UpdatePaymentMethodResponse updateCustomerPaymentMethod(UpdatePaymentMethodRequest request) {
		return new SecureNetVault(this).updateVaultCustomerPaymentMethod(request);
	}
	
	public SecureNetResponse removeCustomerPaymentMethod(String customerId, String paymentMethodId) {
		return new SecureNetVault(this).removeVaultCustomerPaymentMethod(customerId, paymentMethodId);
	}

	public SecureNetResponse addCustomerScheduledPayment() {
		return null; // TODO
	}
	
	public PaymentPlanResponse addCustomerPaymentPlan(AddRecurringPaymentPlanRequest request) {
		return new SecureNetVault(this).addVaultCustomerPaymentPlan(request);
	}
	
	public PaymentPlanResponse addCustomerPaymentPlan(AddInstallmentPaymentPlanRequest request) {
		return new SecureNetVault(this).addVaultCustomerPaymentPlan(request);
	}
	
	public StoredPaymentPlan getPaymentPlan(String customerId, Integer planId) {
		return new SecureNetVault(this).getPaymentPlan(customerId, planId);
	}
	
	
	////////////////////////////////////////////////////////////////////////
	// Transactions
	
	public VerificationResponse verify(VerificationRequest request) {
		return new SecureNetTransaction(this).verify(request);
	}
		
	public SecureNetResponse updateExpirationDate() {
		return null; // TODO
	}

	public List<StoredTransaction> getTransactions(TransactionSearchRequest request) {
		return new SecureNetReporting(this).getTransactions(request);
	}
	
	public SecureNetResponse updateTransaction(TransactionUpdateRequest request) {
		return new SecureNetTransaction(this).update(request);
	}
	
	public ChargeResponse authorize(AuthorizeRequest request) {
		return new SecureNetTransaction(this).authorize(request);
	}
	
	public CaptureResponse capture(CaptureRequest request) {
		return new SecureNetTransaction(this).capture(request);
	}
	
	public ChargeResponse authorizeAndCapture(ChargeRequest request) {
		return new SecureNetTransaction(this).authorizeAndCapture(request);
	}
	
	public RefundResponse refund(RefundRequest request) {
		return new SecureNetTransaction(this).refund(request);
	}

	public RefundResponse voidTransaction(VoidRequest request) {
		return new SecureNetTransaction(this).voidTransaction(request);
	}
	
	public CreditResponse credit(CreditRequest request) {
		return new SecureNetTransaction(this).credit(request);
	}
	
	// Handle the SOAP communication
	
	ITRANSACTION getTransactionProxy() {
		try {
			return new TRANSACTIONLocator().getBasicHttpBinding_ITRANSACTION(getUrl(environment, "DATA/TRANSACTION"));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	ISERVICE getServiceProxy() {
		try {
			return new SERVICELocator().getsoapBinding_ISERVICE(getUrl(environment, "DATA/SERVICE"));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	IGateway getGatewayProxy() {
		try {
			return new GatewayLocator().getBasicHttpBinding_IGateway(getUrl(environment, "Gateway"));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private URL getUrl(Environment environment, String service) {
		try {
			return new URL("http://certify.securenet.com/API/" + service + ".svc/soap"); // TODO
//			switch(environment) {
//			case CERTFICATION:
//			case SANDBOX:
//				return new URL("https://certify.securenet.com/API/" + service + ".svc/soap");
//			case PRODUCTION:
//			default:
//				return new URL("https://gateway.securenet.com/API/Gateway.svc/soap");
//				break;
//			}
		} catch (Exception e) {
			return null;
		}
	}
}
