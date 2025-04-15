package com.SCF.SupplyChain.controller;

import java.util.List;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.SCF.SupplyChain.Entity.SCFuserupdatedetailsS7Entity;
import com.SCF.SupplyChain.bankdto.ScfBankRegistrationRequest;
import com.SCF.SupplyChain.bankdto.ScfBankRegistrationResponse;
import com.SCF.SupplyChain.bankdto.ScfFinancingRequestNotificationRequest;
import com.SCF.SupplyChain.bankdto.ScfFinancingRequestNotificationResponse;
import com.SCF.SupplyChain.bankdto.ScfbankRiskAssessmentRequest;
import com.SCF.SupplyChain.bankdto.ScfbankRiskAssessmentResponse;
import com.SCF.SupplyChain.dto.BusinessFinanceDetailsS4Request;
import com.SCF.SupplyChain.dto.BusinessFinanceDetailsS4Response;
import com.SCF.SupplyChain.dto.BusinessinformationS2Request;
import com.SCF.SupplyChain.dto.BusinessinformationS2Response;
import com.SCF.SupplyChain.dto.CollateralCreditworthinessS6Request;
import com.SCF.SupplyChain.dto.CollateralCreditworthinessS6Response;
import com.SCF.SupplyChain.dto.CommonDemographicS1Request;
import com.SCF.SupplyChain.dto.CommonDemographicS1Response;
import com.SCF.SupplyChain.dto.GetApplicationDetailsRequest;
import com.SCF.SupplyChain.dto.GetApplicationDetailsResponse;
import com.SCF.SupplyChain.dto.GetApplicationRequest;
import com.SCF.SupplyChain.dto.GetApplicationResponse;
import com.SCF.SupplyChain.dto.LoginRequest;
import com.SCF.SupplyChain.dto.LoginResponse;
import com.SCF.SupplyChain.dto.MobileAuthKeyRequest;
import com.SCF.SupplyChain.dto.MobileAuthKeyResponse;
import com.SCF.SupplyChain.dto.ProprietorDetailsS3Request;
import com.SCF.SupplyChain.dto.ProprietorDetailsS3Response;
import com.SCF.SupplyChain.dto.ScfApplicationRequest;
import com.SCF.SupplyChain.dto.ScfApplicationResponse;
import com.SCF.SupplyChain.dto.ScfFinancingRequestRequest;
import com.SCF.SupplyChain.dto.ScfFinancingRequestResponse;
import com.SCF.SupplyChain.dto.ScfinvoiceapplicationDedupeRequest;
import com.SCF.SupplyChain.dto.ScfinvoiceapplicationDedupeResponse;
import com.SCF.SupplyChain.dto.SupplyChainDetailsS5Request;
import com.SCF.SupplyChain.dto.SupplyChainDetailsS5Response;
import com.SCF.SupplyChain.dto.UserRegistrationRequest;
import com.SCF.SupplyChain.dto.UserRegistrationResponse;
import com.SCF.SupplyChain.service.SupplyChainService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/scf")
public class SCF_Controller {

	private static final Logger logger = LogManager.getLogger(SCF_Controller.class);
	
	
	private final SupplyChainService supplyChainService;
	
	@Autowired
	 public SCF_Controller(SupplyChainService supplyChainService) {
		
		this.supplyChainService = supplyChainService;
	}
	
	
	
	
	///////////////////////////////////Login & Authentication Api//////////////////////
	
	
	@PostMapping("/Get_SecureUserLogin")
    public LoginResponse secureUserLogin(@RequestBody LoginRequest request) {
        return supplyChainService.authenticateUser(request);
    }

    @PostMapping("/SecuregetMobileAuthKey")
    public MobileAuthKeyResponse secureGetMobileAuthKey(@RequestBody MobileAuthKeyRequest request) {
        return supplyChainService.getMobileAuthKey(request);
    }

    @PostMapping("/Logout")
    public String logoutUser(@RequestParam String sessionId) {
        return supplyChainService.logoutUser(sessionId);
    }
	
    
    /////////////////////////////////Application Invoice Dedupe API.s///////////////////////
    
    
    @PostMapping("/scf-application-dedupe-invoice")
    public ScfinvoiceapplicationDedupeResponse checkInvoiceNumber(@RequestBody ScfinvoiceapplicationDedupeRequest request) {
        return supplyChainService.checkInvoiceNumber(request);
    }
    
    
    
    
    
    
    
	
	///////////////////////CommonDemographicS1 APIs///////////////////
	
	@PostMapping("/common-demographic-S1")
    public CommonDemographicS1Response saveUserDetails(@RequestBody CommonDemographicS1Request request) {
        logger.info("Received request to save employment details for mobile number: {}", request.getPhoneNo());
        return supplyChainService.saveDemographicDetails(request);
    } 
	
	
	
	//////////////////////Business Details S2 APIs///////////////////////
	
	@PostMapping("/business-information-S2")
    public BusinessinformationS2Response saveBusinessInformation(@RequestBody BusinessinformationS2Request request) {
        logger.info("Received request to save business details for mobile number: {}", request.getBusinessContactPersonMobNo());
        return supplyChainService.saveBusinessInformation(request);
    }

	
//////////////////////////proprietor/CEO Details S3 APIs///////////////////
	
	@PostMapping("/propriter-details-S3")
    public ProprietorDetailsS3Response saveBusinessInformation(@RequestBody ProprietorDetailsS3Request request) {
        logger.info("Received request to save business details for mobile number: {}", request.getFullNameProprietor());
        return supplyChainService.saveProprietorDetails(request);
    }
	
	
	
	////////////////////Business Finance DetailsS4 APIs/////////////////////
	
	
	@PostMapping("/business-finance-details-S4")
    public BusinessFinanceDetailsS4Response saveBusinessFinanceDetails(@RequestBody BusinessFinanceDetailsS4Request request) {
        logger.info("Received request to save business finance details for PAN: {}", request.getPanEntity());
        return supplyChainService.saveBusinessFinanceDetails(request);
    }
	
	
	///////////////////Supply chain Details S5 APIs//////////////////////
	
	
	@PostMapping("/supply-chain-details-S5")
    public SupplyChainDetailsS5Response saveSupplyChainDetails(@RequestBody SupplyChainDetailsS5Request request) {
        logger.info("Received request to save supply chain details for Supplier: {}", request.getSupplierName());
        return supplyChainService.saveSupplyChainDetails(request);
    }
	
	
	
	//////////////////////collateral Credit Information S6 APIs////////////////
	
	
	@PostMapping("/collateral-Credit-S6")
    public CollateralCreditworthinessS6Response saveSupplyChainDetails(@RequestBody CollateralCreditworthinessS6Request request) {
        logger.info("Received request to save supply chain details for Supplier: {}", request.getTypeOfCollateral());
        return supplyChainService.saveCollateralDetails(request);
    }

	
	
	
	///////////////////SCF User Update Details APIs / Get User By phone/ Email /////////////////////
	
	/*@GetMapping("/get-scf-user-deatls-by-mobile/{mobileNumber}")
    public ResponseEntity<SCFuserupdatedetailsS7Entity> getUserByMobileNumber(@PathVariable String mobileNumber) {
        Optional<SCFuserupdatedetailsS7Entity> user = supplyChainService.getUserDetailsByMobileNumber(mobileNumber);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	
	@GetMapping("/get-scf-user-deatls-by-email/{emailId}")
    public ResponseEntity<SCFuserupdatedetailsS7Entity> getUserByEmailId(@PathVariable String emailId) {
        Optional<SCFuserupdatedetailsS7Entity> user = supplyChainService.getUserDetailsByEmailId(emailId);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }*/
	
	
	@PutMapping("/Update-SCF-Userdetails-by-mobile/{mobileNumber}")
    public ResponseEntity<SCFuserupdatedetailsS7Entity> updateUserByMobileNumber(@PathVariable String mobileNumber, @RequestBody SCFuserupdatedetailsS7Entity updatedDetails) {
        SCFuserupdatedetailsS7Entity updatedUser = supplyChainService.updateUserDetailsByMobileNumber(mobileNumber, updatedDetails);
        return ResponseEntity.ok(updatedUser);
    }

    @PutMapping("/Update-SCF-Userdetails-by-email/{emailId}")
    public ResponseEntity<SCFuserupdatedetailsS7Entity> updateUserByEmailId(@PathVariable String emailId, @RequestBody SCFuserupdatedetailsS7Entity updatedDetails) {
        SCFuserupdatedetailsS7Entity updatedUser = supplyChainService.updateUserDetailsByEmailId(emailId, updatedDetails);
        return ResponseEntity.ok(updatedUser);
    }
	
	
    
    //////////////////////////////////////User Registration API//////////////////////////////
    
    
    @PostMapping("/register-scf-user")
    public ResponseEntity<UserRegistrationResponse> registerUser(@RequestBody UserRegistrationRequest request) {
        UserRegistrationResponse response = supplyChainService.registerUser(request);
        return ResponseEntity.ok(response);
    }
    
    
    
    //////////////////////////////Scf Application Or Create Invoice API//////////////////////////
    
    
    @PostMapping("/scf-create-invoice-application")
    public ResponseEntity<ScfApplicationResponse> createInvoice(@RequestBody ScfApplicationRequest request) {
        ScfApplicationResponse response = supplyChainService.createInvoice(request);
        return ResponseEntity.ok(response);
    }
   
    
    
    /////////////////////////Get Invoice List By user_id API///////////////////////
    
    
    @PostMapping("/get-all-invoice-list")
    public List<GetApplicationResponse> getApplications(@RequestBody GetApplicationRequest request) {
        return supplyChainService.getApplicationsByUserId(request);
    }
    
    
    //////////////////////Get Application Details By Invoice Number API/////////////////
    
    
    @PostMapping("/get-application-details-s1-s6")
    public ResponseEntity<GetApplicationDetailsResponse> getApplicationDetails(@Valid @RequestBody GetApplicationDetailsRequest request) {
    	GetApplicationDetailsResponse response = supplyChainService.getApplicationDetailsByInvoiceNumber(request.getInvoiceNumber());
        return ResponseEntity.ok(response);
    }
 
    
    ///////////////////////////////////ScfFinancingRequest API.s POST & GET////////////////////////
    
    
    @PostMapping("/create-scf-financing-request")
    public ResponseEntity<ScfFinancingRequestResponse> create(@RequestBody ScfFinancingRequestRequest request) {
        ScfFinancingRequestResponse response = supplyChainService.createRequest(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/Get-all-financing-requests")
    public ResponseEntity<List<ScfFinancingRequestResponse>> getAllRequests() {
        return ResponseEntity.ok(supplyChainService.getAllRequests());
    }
    
    
    
    ///////////////////////////////////Bank Screen Side API.s//////////////////////////////////
    
    @PostMapping("/register-scf-bank")
    public ResponseEntity<ScfBankRegistrationResponse> registerBank(@RequestBody ScfBankRegistrationRequest request) {
    	ScfBankRegistrationResponse response = supplyChainService.registerBank(request);
        return ResponseEntity.ok(response);
    }
    
    
    
    /////////////////////////////////Bank Screen Notification APIs.////////////////////////////
    
    
    @PostMapping("/scf-bank-notification")
    public ScfFinancingRequestNotificationResponse create(@RequestBody ScfFinancingRequestNotificationRequest request) {
        return supplyChainService.createNotification(request);
    }
    
    @GetMapping("/scf-bank-notification")
    public List<ScfFinancingRequestNotificationResponse> getAll() {
        return supplyChainService.getAllNotifications();
    }
    
    
    //////////////////////////////SCF Bank Screen Risk Assessment API.s//////////////////////
    
    
    
    @PostMapping("/create-bank-risk-assessment")
    public ResponseEntity<ScfbankRiskAssessmentResponse> create(@RequestBody ScfbankRiskAssessmentRequest request) {
        return ResponseEntity.ok(supplyChainService.createAssessment(request));
    }

    @GetMapping("/Get-all-bank-risk-assessment")
    public ResponseEntity<List<ScfbankRiskAssessmentResponse>> getAllAssessments() {
        return ResponseEntity.ok(supplyChainService.getAllAssessments());
    }

    @GetMapping("/Get-risk-assesmenst-by-invoice/{invoiceNumber}")
    public ResponseEntity<List<ScfbankRiskAssessmentResponse>> getByInvoice(@PathVariable String invoiceNumber) {
        return ResponseEntity.ok(supplyChainService.getAssessmentsByInvoice(invoiceNumber));
    }
}
