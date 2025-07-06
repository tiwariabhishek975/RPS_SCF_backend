package com.SCF.SupplyChain.service;
import java.math.BigDecimal;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SCF.SupplyChain.Entity.BusinessFinanceDetailsS4Entity;
import com.SCF.SupplyChain.Entity.BusinessinformationS2Entity;
import com.SCF.SupplyChain.Entity.CollateralCreditworthinessS6Entity;
import com.SCF.SupplyChain.Entity.CommonDemographicS1Entity;
import com.SCF.SupplyChain.Entity.EarlyPaymentRequestEntity;
import com.SCF.SupplyChain.Entity.OrgDetailsEntity;
import com.SCF.SupplyChain.Entity.OrgKycGroupDetailsEntity;
import com.SCF.SupplyChain.Entity.OrgRoleEntity;
import com.SCF.SupplyChain.Entity.ProprietorDetailsS3Entity;
import com.SCF.SupplyChain.Entity.SCFuserupdatedetailsS7Entity;
import com.SCF.SupplyChain.Entity.ScfApplicationEntity;
import com.SCF.SupplyChain.Entity.ScfBankFundDisbursementEntity;
import com.SCF.SupplyChain.Entity.ScfBankRegistrationEntity;
import com.SCF.SupplyChain.Entity.ScfBankRoleEntity;
import com.SCF.SupplyChain.Entity.ScfFinancingRequestEntity;
import com.SCF.SupplyChain.Entity.ScfFinancingRequestNotificationEntity;
import com.SCF.SupplyChain.Entity.ScfSupplierBankOfferEntity;
import com.SCF.SupplyChain.Entity.ScfSupplierRegistrationEntity;
import com.SCF.SupplyChain.Entity.ScfSupplierSelectedbankOfferEntity;
import com.SCF.SupplyChain.Entity.ScfUserdetailsEntity;
import com.SCF.SupplyChain.Entity.ScfbankFinancingOfferTermsEntity;
import com.SCF.SupplyChain.Entity.ScfbankRiskAssessmentEntity;
import com.SCF.SupplyChain.Entity.SupplyChainDetailsS5Entity;
import com.SCF.SupplyChain.Entity.UserRoleEntity;
import com.SCF.SupplyChain.Entity.UserSession;
import com.SCF.SupplyChain.Supplierdto.EarlyPaymentRequest;
import com.SCF.SupplyChain.Supplierdto.EarlyPaymentResponse;
import com.SCF.SupplyChain.Supplierdto.ScfAddBankOfferRequest;
import com.SCF.SupplyChain.Supplierdto.ScfAddInvoiceBankOfferRequest;
import com.SCF.SupplyChain.Supplierdto.ScfSelectBankOfferRequest;
import com.SCF.SupplyChain.Supplierdto.ScfSupplierBankOfferResponse;
import com.SCF.SupplyChain.Supplierdto.ScfSupplierRegistrationRequest;
import com.SCF.SupplyChain.Supplierdto.ScfSupplierRegistrationResponse;
import com.SCF.SupplyChain.bankdto.ScfBankFundDisbursementRequest;
import com.SCF.SupplyChain.bankdto.ScfBankFundDisbursementResponse;
import com.SCF.SupplyChain.bankdto.ScfBankRegistrationRequest;
import com.SCF.SupplyChain.bankdto.ScfBankRegistrationResponse;
import com.SCF.SupplyChain.bankdto.ScfFinancingRequestNotificationRequest;
import com.SCF.SupplyChain.bankdto.ScfFinancingRequestNotificationResponse;
import com.SCF.SupplyChain.bankdto.ScfbankFinancingOfferTermsRequest;
import com.SCF.SupplyChain.bankdto.ScfbankFinancingOfferTermsResponse;
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
import com.SCF.SupplyChain.exceptions.EmailIdAlreadyExistsException;
import com.SCF.SupplyChain.exceptions.InvoiceNumberAlreadyExist;
import com.SCF.SupplyChain.exceptions.PhoneNumberAlreadyExistsException;
import com.SCF.SupplyChain.repository.BusinessFinanceDetailsS4Repository;
import com.SCF.SupplyChain.repository.BusinessinformationS2Repository;
import com.SCF.SupplyChain.repository.CollateralCreditworthinessS6Repository;
import com.SCF.SupplyChain.repository.CommonDemographicS1Repository;
import com.SCF.SupplyChain.repository.EarlyPaymentRequestRepository;
import com.SCF.SupplyChain.repository.OrgDetailsRepository;
import com.SCF.SupplyChain.repository.OrgKycGroupDetailsRepository;
import com.SCF.SupplyChain.repository.OrgRoleRepository;
import com.SCF.SupplyChain.repository.ProprietorDetailsS3Repository;
import com.SCF.SupplyChain.repository.SCFuserupdatedetailsS7Repository;
import com.SCF.SupplyChain.repository.ScfApplicationRepository;
import com.SCF.SupplyChain.repository.ScfBankFundDisbursementRepository;
import com.SCF.SupplyChain.repository.ScfBankRegistrationRepository;
import com.SCF.SupplyChain.repository.ScfBankRoleRepository;
import com.SCF.SupplyChain.repository.ScfFinancingRequestNotificationRepository;
import com.SCF.SupplyChain.repository.ScfFinancingRequestRepository;
import com.SCF.SupplyChain.repository.ScfSupplierBankOfferRepository;
import com.SCF.SupplyChain.repository.ScfSupplierRegistrationRepository;
import com.SCF.SupplyChain.repository.ScfSupplierSelectedbankOfferRepository;
import com.SCF.SupplyChain.repository.ScfUserdetailsRepository;
import com.SCF.SupplyChain.repository.ScfbankFinancingOfferTermsRepository;
import com.SCF.SupplyChain.repository.ScfbankRiskAssessmentRepository;
import com.SCF.SupplyChain.repository.SupplyChainDetailsS5Repository;
import com.SCF.SupplyChain.repository.UserRoleRepository;
import com.SCF.SupplyChain.repository.UserSessionRepository;
import com.SCF.SupplyChain.utility.AuthKeyGenerator;

@Service
public class SupplyChainService {

    private static final Logger logger = LogManager.getLogger(SupplyChainService.class);
    
    private static final int SESSION_EXPIRY_MINUTES = 50;
    private static final int AUTH_KEY_EXPIRY_MINUTES = 5;
    
    
    private final CommonDemographicS1Repository demographicRepository;
    private final BusinessinformationS2Repository businessRepository;
    private final ProprietorDetailsS3Repository proprietorRepository;
    private final BusinessFinanceDetailsS4Repository financeRepository;
    private final SupplyChainDetailsS5Repository supplyChainRepository;
    private final CollateralCreditworthinessS6Repository collateralRepository;
    private final SCFuserupdatedetailsS7Repository scfuserupdatedetailsS7Repository;
    private final UserSessionRepository userSessionRepository;
    
    private final ScfUserdetailsRepository scfUserdetailsRepository;
    private final UserRoleRepository userRoleRepository;
    private final OrgDetailsRepository orgDetailsRepository;
    private final OrgRoleRepository orgRoleRepository;
    private final OrgKycGroupDetailsRepository orgKycGroupDetailsRepository;
    
    private final ScfApplicationRepository scfApplicationRepository;
    private final ScfFinancingRequestRepository scfFinancingRequestRepository;
    
    private final ScfBankRegistrationRepository scfBankRegistrationRepository;
    private final ScfBankRoleRepository scfBankRoleRepository;
    private final ScfFinancingRequestNotificationRepository scfFinancingRequestNotificationRepository;
    private final ScfbankRiskAssessmentRepository scfbankRiskAssessmentRepository;
    private final ScfbankFinancingOfferTermsRepository scfbankFinancingOfferTermsRepository;
    private final ScfBankFundDisbursementRepository scfBankFundDisbursementRepository;
    
    
    private final ScfSupplierRegistrationRepository scfSupplierRegistrationRepository;
    private final ScfSupplierBankOfferRepository scfSupplierBankOfferRepository;
    private final ScfSupplierSelectedbankOfferRepository scfSupplierSelectedbankOfferRepository;
    private final EarlyPaymentRequestRepository earlyPaymentRequestRepository;
    
    

    @Autowired
    public SupplyChainService(
            CommonDemographicS1Repository demographicRepository,
            BusinessinformationS2Repository businessRepository,
            ProprietorDetailsS3Repository proprietorRepository,
            BusinessFinanceDetailsS4Repository financeRepository,
            SupplyChainDetailsS5Repository supplyChainRepository,
            CollateralCreditworthinessS6Repository collateralRepository,
            SCFuserupdatedetailsS7Repository scfuserupdatedetailsS7Repository,
            UserSessionRepository userSessionRepository,
            ScfUserdetailsRepository scfUserdetailsRepository,
            UserRoleRepository userRoleRepository,
            OrgDetailsRepository orgDetailsRepository,
            OrgRoleRepository orgRoleRepository,
            OrgKycGroupDetailsRepository orgKycGroupDetailsRepository,
            ScfApplicationRepository scfApplicationRepository,
            ScfBankRegistrationRepository scfBankRegistrationRepository,
            ScfBankRoleRepository scfBankRoleRepository,
            ScfFinancingRequestNotificationRepository scfFinancingRequestNotificationRepository,
            ScfbankRiskAssessmentRepository scfbankRiskAssessmentRepository,
            ScfFinancingRequestRepository scfFinancingRequestRepository,
            ScfbankFinancingOfferTermsRepository scfbankFinancingOfferTermsRepository,
            ScfBankFundDisbursementRepository scfBankFundDisbursementRepository,
            ScfSupplierRegistrationRepository scfSupplierRegistrationRepository,
            ScfSupplierBankOfferRepository scfSupplierBankOfferRepository,
            ScfSupplierSelectedbankOfferRepository scfSupplierSelectedbankOfferRepository,
            EarlyPaymentRequestRepository earlyPaymentRequestRepository) 
    {
    	
    	
        this.demographicRepository = demographicRepository;
        this.businessRepository = businessRepository;
        this.proprietorRepository = proprietorRepository;
        this.financeRepository = financeRepository;
        this.supplyChainRepository = supplyChainRepository;
        this.collateralRepository = collateralRepository;
        this.scfuserupdatedetailsS7Repository = scfuserupdatedetailsS7Repository;
        this.userSessionRepository = userSessionRepository;
        this.scfUserdetailsRepository = scfUserdetailsRepository;
        this.userRoleRepository = userRoleRepository;
        this.orgDetailsRepository = orgDetailsRepository;
        this.orgRoleRepository = orgRoleRepository;
        this.orgKycGroupDetailsRepository = orgKycGroupDetailsRepository; 
        this.scfApplicationRepository = scfApplicationRepository;
        this.scfBankRegistrationRepository = scfBankRegistrationRepository;
        this.scfBankRoleRepository = scfBankRoleRepository;
        this.scfFinancingRequestNotificationRepository = scfFinancingRequestNotificationRepository;
        this.scfbankRiskAssessmentRepository = scfbankRiskAssessmentRepository;
        this.scfFinancingRequestRepository = scfFinancingRequestRepository;
        this.scfbankFinancingOfferTermsRepository = scfbankFinancingOfferTermsRepository;
        this.scfBankFundDisbursementRepository = scfBankFundDisbursementRepository;
        this.scfSupplierRegistrationRepository = scfSupplierRegistrationRepository;
        this.scfSupplierBankOfferRepository = scfSupplierBankOfferRepository;
        this.scfSupplierSelectedbankOfferRepository = scfSupplierSelectedbankOfferRepository;
        this.earlyPaymentRequestRepository = earlyPaymentRequestRepository; 
        
        
   
    }
    
    
    
    
    
    ////////////////////////////////////Login & Authentication Api for Scf////////////////////
    
    @Transactional
    public LoginResponse authenticateUser(LoginRequest request) {
    	logger.info("Authenticating user with phone number: {}", request.getPhone_no());
        Optional<UserSession> existingSession = userSessionRepository.findByPhoneNo(request.getPhone_no());
        String sessionId = UUID.randomUUID().toString().replace("-", "");

        if (existingSession.isPresent()) {
            UserSession userSession = existingSession.get();

         // ✅ Check password
            if (userSession.getPassword() == null || !userSession.getPassword().equals(request.getPassword())) {
            	logger.warn("Invalid password attempt for phone number: {}", request.getPhone_no());
                return new LoginResponse(null, "error", "Invalid password");
            }

            if (!Boolean.TRUE.equals(userSession.getIsActive())) {
                userSession.setSessionId(sessionId);
                userSession.setLoginTime(LocalDateTime.now());
                userSession.setIsActive(true);
                userSession.setSessionIdExpiryTime(LocalDateTime.now().plusMinutes(SESSION_EXPIRY_MINUTES));
                userSessionRepository.save(userSession);
                logger.info("Session created for user: {}", request.getPhone_no());
            } else {
            	logger.warn("User already logged in: {}", request.getPhone_no());
                return new LoginResponse(userSession.getSessionId(), "error", "User is already logged in");
            }

        } else {
            // ✅ Create new session with password
            UserSession userSession = new UserSession();
            userSession.setPhoneNo(request.getPhone_no());
            userSession.setPassword(request.getPassword()); // Store password
            userSession.setSessionId(sessionId);
            userSession.setLoginTime(LocalDateTime.now());
            userSession.setIsActive(true);
            userSession.setSessionIdExpiryTime(LocalDateTime.now().plusMinutes(SESSION_EXPIRY_MINUTES));
            userSessionRepository.save(userSession);
            logger.info("New user session created for phone number: {}", request.getPhone_no());
        }

        return new LoginResponse(sessionId, "success", "User authenticated successfully");
    }


    public MobileAuthKeyResponse getMobileAuthKey(MobileAuthKeyRequest request) {
    	logger.info("Generating mobile auth key for sessionId: {}", request.getSessionid());
        List<UserSession> userSessions = userSessionRepository.findBySessionId(request.getSessionid());
        if (userSessions.isEmpty() || 
            userSessions.get(0).getSessionIdExpiryTime() == null || 
            userSessions.get(0).getSessionIdExpiryTime().isBefore(LocalDateTime.now())) {
        	logger.warn("Invalid or expired session ID: {}", request.getSessionid());
            return new MobileAuthKeyResponse("", "error", "Session ID incorrect");
        }

        String authKey = AuthKeyGenerator.generateAuthKey();
        LocalDateTime authKeyExpiryTime = LocalDateTime.now().plusMinutes(AUTH_KEY_EXPIRY_MINUTES);

        UserSession userSession = userSessions.get(0);
        userSession.setAuthKey(authKey);
        userSession.setAuthKeyExpiryTime(authKeyExpiryTime);
        userSessionRepository.save(userSession);
        logger.info("Auth key generated for sessionId: {}", request.getSessionid());
        return new MobileAuthKeyResponse(authKey, "success", "Mobile auth key generated successfully");
    }

    
    public String logoutUser(String sessionId) {
    	logger.info("Logging out session ID: {}", sessionId);
        List<UserSession> userSessions = userSessionRepository.findBySessionId(sessionId);
        
        if (userSessions.isEmpty()) {
        	logger.warn("Logout failed: Invalid session ID: {}", sessionId);
            return "Invalid session ID";
        }

        for (UserSession session : userSessions) {
            session.setIsActive(false);
            session.setLogoutTime(LocalDateTime.now());
            userSessionRepository.save(session);
        }
        logger.info("User logged out successfully for session ID: {}", sessionId);
        return "User logged out successfully";
    }

   //////////////////////Application Invoice Dedupe Service class///////////////////////
    
    
    
    public ScfinvoiceapplicationDedupeResponse checkInvoiceNumber(ScfinvoiceapplicationDedupeRequest request) {
    	String invoiceNumber = request.getInvoiceNumber();
    	logger.info("Checking for existing invoice number: {}", invoiceNumber);
    	CommonDemographicS1Entity existingEntity = demographicRepository.findByInvoiceNumber(invoiceNumber);
        
        
        
        
    	ScfinvoiceapplicationDedupeResponse response = new ScfinvoiceapplicationDedupeResponse();
        if (existingEntity != null) {
            response.setExists(true);
            response.setMessage("Invoice number already exists in the database.");
            logger.warn("Duplicate invoice number found: {}", invoiceNumber);
        } else {
            response.setExists(false);
            response.setMessage("Invoice number is not found in the database.");
            logger.info("Invoice number is unique: {}", invoiceNumber);
        }

        return response;
    }
    
    
    
    

    
    
    
    /////////////////////////////S1 Service//////////////////////////
    
    @Transactional
    public CommonDemographicS1Response saveDemographicDetails(CommonDemographicS1Request request) {
        logger.info("Processing demographic details for Invoice number: {}", request.getInvoiceNumber());
        
        if (demographicRepository.findByInvoiceNumber(request.getInvoiceNumber()) != null) {
            throw new InvoiceNumberAlreadyExist("Invoice Number already exists.");
        }

        
     // Map request data to entity
        CommonDemographicS1Entity entity = new CommonDemographicS1Entity();
        
        
        entity.setInvoiceNumber(request.getInvoiceNumber());
        entity.setFirstName(request.getFirstName());
        entity.setLastName(request.getLastName());
        entity.setEmailId(request.getEmailId());
        entity.setAlternateEmailId(request.getAlternateEmailId());
        entity.setPhoneNo(request.getPhoneNo());
        entity.setAlternatePhoneNo(request.getAlternatePhoneNo());
        entity.setGender(request.getGender());
        entity.setDob(request.getDob());
        entity.setCurrentAddress(request.getCurrentAddress());
        entity.setPermanentAddress(request.getPermanentAddress());
        entity.setCity(request.getCity());
        entity.setState(request.getState());
        entity.setCreateDate(LocalDateTime.now());
        entity.setUpdateDate(LocalDateTime.now());

        // Save entity to database
        CommonDemographicS1Entity savedEntity = demographicRepository.save(entity);

     // Create the response object
        CommonDemographicS1Response response = new CommonDemographicS1Response();
        response.setMessage("New user created successfully.");
        //response.setUser(savedEntity);
        response.setInvoiceNumber(savedEntity.getInvoiceNumber());
        response.setFirstName(savedEntity.getFirstName());
        response.setLastName(savedEntity.getLastName());
        response.setPhoneNo(savedEntity.getPhoneNo());

        logger.info("User details saved successfully for invoice number: {}", request.getInvoiceNumber());
        return response;
    }
    
    
    //////////////////////////////S2 Service////////////////////////////////
    
    @Transactional // Ensures that the operation runs within a transaction
    public BusinessinformationS2Response saveBusinessInformation(BusinessinformationS2Request request) {
        
    	
    	BusinessinformationS2Entity entity = new BusinessinformationS2Entity();
    	
    	
    	    entity.setInvoiceNumber(request.getInvoiceNumber());
    	    entity.setCompanyName(request.getCompanyName());
    	    entity.setBusinessRegNumber(request.getBusinessRegNumber());
    	    entity.setBusinessType(request.getBusinessType());
    	    entity.setDateOfIncorporation(request.getDateOfIncorporation());
    	    entity.setAnnualTurnover(request.getAnnualTurnover());
    	    entity.setBusinessRegisteredAddress(request.getBusinessRegisteredAddress());
    	    entity.setBusinessOperationalAddress(request.getBusinessOperationalAddress());
    	    entity.setCompanyCity(request.getCompanyCity());
    	    entity.setCompanyState(request.getCompanyState());
    	    entity.setEntityConsumptionType(request.getEntityConsumptionType());
    	    entity.setTaxIdentificationNumber(request.getTaxIdentificationNumber());
    	    entity.setBusinessContactPerson(request.getBusinessContactPerson());
    	    entity.setBusinessContactPersonMobNo(request.getBusinessContactPersonMobNo());
    	    entity.setKeyBusinessPartner(request.getKeyBusinessPartner());
    	    entity.setNoOfYearsMonthInBusiness(request.getNoOfYearsMonthInBusiness());
    	    entity.setBusinessWebsite(request.getBusinessWebsite());
    	
    	 // Save entity to database
    	    BusinessinformationS2Entity savedEntity = businessRepository.save(entity);
            
    	 // Create the response object
            BusinessinformationS2Response response = new BusinessinformationS2Response();
            response.setMessage("Business information saved successfully.");
            //response.setUser(savedEntity);

            logger.info("Business details saved successfully for This Invoice number: {}", request.getBusinessContactPersonMobNo());
            return response;

    }
    		          
    
    
    //////////////////////////////S3 Service/////////////////////////////////
    
    
    @Transactional // Ensures that the operation runs within a transaction
    public ProprietorDetailsS3Response saveProprietorDetails(ProprietorDetailsS3Request request) {
        
    	
    	ProprietorDetailsS3Entity entity = new ProprietorDetailsS3Entity();
    	
    	entity.setInvoiceNumber(request.getInvoiceNumber());
    	entity.setFullNameProprietor(request.getFullNameProprietor());
        entity.setDesignation(request.getDesignation());
        entity.setProprietorDob(request.getProprietorDob());
        entity.setProprietorGender(request.getProprietorGender());
        entity.setNationality(request.getNationality());
        entity.setMaritalStatus(request.getMaritalStatus());
        entity.setContactNo(request.getContactNo());
        entity.setProprietorEmailId(request.getProprietorEmailId());
        entity.setResidentialAdd(request.getResidentialAdd());
        entity.setAadharNo(request.getAadharNo());
        entity.setAadharImg(request.getAadharImg());
        entity.setPanNo(request.getPanNo());
        entity.setPanImg(request.getPanImg());
        entity.setPassportNo(request.getPassportNo());
        entity.setPassportImg(request.getPassportImg());
        entity.setYearsOfExperienceInCompany(request.getYearsOfExperienceInCompany());
        entity.setPreviousCompany(request.getPreviousCompany());
        entity.setPercentageOfOwnershipInCompany(request.getPercentageOfOwnershipInCompany());
        
        
     // Save entity to database
        ProprietorDetailsS3Entity savedEntity = proprietorRepository.save(entity);
        
	 // Create the response object
        ProprietorDetailsS3Response response = new ProprietorDetailsS3Response();
        response.setMessage("Propriter/CEO Details saved successfully.");
        //response.setUser(savedEntity);

        logger.info("Propriter/CEO details saved successfully for Invoice number: {}", request.getFullNameProprietor());
        return response;

}
    
    
    ///////////////////////////S4 Service///////////////////////////
    

    @Transactional // Ensures that the operation runs within a transaction
    public BusinessFinanceDetailsS4Response saveBusinessFinanceDetails(BusinessFinanceDetailsS4Request request) {
        
    	BusinessFinanceDetailsS4Entity entity = new BusinessFinanceDetailsS4Entity();
    	
    	entity.setInvoiceNumber(request.getInvoiceNumber());
    	entity.setBusinessAccountName(request.getBusinessAccountName());
        entity.setBusinessAccountNumber(request.getBusinessAccountNumber());
        entity.setBusinessAccountIFSC(request.getBusinessAccountIFSC());
        entity.setPanEntity(request.getPanEntity());
        entity.setLoanAmountRequired(request.getLoanAmountRequired());
        entity.setPurposeOfLoan(request.getPurposeOfLoan());
        entity.setPreferredLoanTenure(request.getPreferredLoanTenure());
        entity.setExistingLoanDetails(request.getExistingLoanDetails());

        entity.setSixMonthBankStatement(request.getSixMonthBankStatement());
        entity.setFinancialStatement(request.getFinancialStatement());
        entity.setBusinessRegCertificate(request.getBusinessRegCertificate());
        entity.setGstCertificate(request.getGstCertificate());
        entity.setKycDocuments(request.getKycDocuments());
        entity.setAuditedBalanceSheet(request.getAuditedBalanceSheet());
        entity.setIncomeTaxReturn(request.getIncomeTaxReturn());
        entity.setCompanyRegCertificate(request.getCompanyRegCertificate());
        
        
     // Save entity to database
        BusinessFinanceDetailsS4Entity savedEntity = financeRepository.save(entity);

        
     // Create the response object
        BusinessFinanceDetailsS4Response response = new BusinessFinanceDetailsS4Response();
        response.setMessage("Business information saved successfully.");
        //response.setUser(savedEntity);

        logger.info("Business finance details saved successfully for mobile number: {}", request.getPanEntity());
        return response;

}
    
    
    
    //////////////////////////////S5 Service///////////////////////////
    
    
    @Transactional // Ensures that the operation runs within a transaction
    public SupplyChainDetailsS5Response saveSupplyChainDetails(SupplyChainDetailsS5Request request) {
        
    	SupplyChainDetailsS5Entity entity = new SupplyChainDetailsS5Entity();
    	
    	entity.setInvoiceNumber(request.getInvoiceNumber());
    	entity.setTopSuppliers(request.getTopSuppliers());
        entity.setTopBuyers(request.getTopBuyers());
        entity.setSupplierName(request.getSupplierName());
        entity.setSupplierContactPerson(request.getSupplierContactPerson());
        entity.setSupplierPaymentTerms(request.getSupplierPaymentTerms());
        entity.setSupplierAnnualPurchaseValue(request.getSupplierAnnualPurchaseValue());
        entity.setKeyCustomer(request.getKeyCustomer());
        entity.setCustomerName(request.getCustomerName());
        entity.setCustomerContactPerson(request.getCustomerContactPerson());
        entity.setCustomerPaymentTerms(request.getCustomerPaymentTerms());
        entity.setCustomerAnnualPurchaseValue(request.getCustomerAnnualPurchaseValue());
        entity.setMonthlyInvoices(request.getMonthlyInvoices());
        
     // Save entity to database
        SupplyChainDetailsS5Entity savedEntity = supplyChainRepository.save(entity);

        
     // Create the response object
        SupplyChainDetailsS5Response response = new SupplyChainDetailsS5Response();
        response.setMessage("Supply chain information saved successfully.");
        //response.setUser(savedEntity);

        logger.info("Supply Chain details saved successfully for mobile number: {}", request.getSupplierName());
        return response;

}
    
    
    
    /////////////////////////////////S6 Service/////////////////////////////////
    
    
    
    @Transactional // Ensures that the operation runs within a transaction
    public CollateralCreditworthinessS6Response saveCollateralDetails(CollateralCreditworthinessS6Request request) {
        
    	CollateralCreditworthinessS6Entity entity = new CollateralCreditworthinessS6Entity();
    	
    	entity.setInvoiceNumber(request.getInvoiceNumber());
    	entity.setDoYouHaveAnyCollateral(request.getDoYouHaveAnyCollateral());
        entity.setTypeOfCollateral(request.getTypeOfCollateral());
        entity.setOwnerOfCollateral(request.getOwnerOfCollateral());
        entity.setEstimatedMarketValue(request.getEstimatedMarketValue());
        entity.setCollateralLocation(request.getCollateralLocation());
        entity.setCollateralDocumentation(request.getCollateralDocumentation());
        entity.setCreditScore(request.getCreditScore());
        entity.setCreditScoreImg(request.getCreditScoreImg());
        entity.setAnyPastLoan(request.getAnyPastLoan());
        entity.setExistingLoan(request.getExistingLoan());
        entity.setCurrentLoanObligation(request.getCurrentLoanObligation());
        entity.setIfYes(request.getIfYes());
        entity.setLenderName(request.getLenderName());
        entity.setLoanAmount(request.getLoanAmount());
        entity.setEmiAmount(request.getEmiAmount());
        entity.setOutstandingBalance(request.getOutstandingBalance());
        entity.setLoanEndDate(request.getLoanEndDate());
        
        
     // Save entity to database
        CollateralCreditworthinessS6Entity savedEntity = collateralRepository.save(entity);

        
     // Create the response object
        CollateralCreditworthinessS6Response response = new CollateralCreditworthinessS6Response();
        response.setMessage("Colateral Credit information saved successfully.");
        //response.setUser(savedEntity);

        logger.info("Colateral Credit saved successfully for mobile number: {}", request.getTypeOfCollateral());
        return response;

}
    
    
    
    //////////////////////////////S7 User Update Servcie class///////////////////////////
    
    
    
    @Transactional
    public SCFuserupdatedetailsS7Entity updateUserDetailsByMobileNumber(String mobileNumber, SCFuserupdatedetailsS7Entity updatedDetails) {
        logger.info("Updating user details for mobileNumber: {}", mobileNumber);
        Optional<SCFuserupdatedetailsS7Entity> existingUserOpt = scfuserupdatedetailsS7Repository.findByPhoneNo(mobileNumber);
        if (existingUserOpt.isPresent()) {
            SCFuserupdatedetailsS7Entity existingUser = existingUserOpt.get();
            updateEntityFields(existingUser, updatedDetails);
            return scfuserupdatedetailsS7Repository.save(existingUser);
        } else {
            throw new RuntimeException("User not found with mobile number: " + mobileNumber);
        }
    }

    @Transactional
    public SCFuserupdatedetailsS7Entity updateUserDetailsByEmailId(String emailId, SCFuserupdatedetailsS7Entity updatedDetails) {
        logger.info("Updating user details for emailId: {}", emailId);
        Optional<SCFuserupdatedetailsS7Entity> existingUserOpt = scfuserupdatedetailsS7Repository.findByEmailId(emailId);
        if (existingUserOpt.isPresent()) {
            SCFuserupdatedetailsS7Entity existingUser = existingUserOpt.get();
            updateEntityFields(existingUser, updatedDetails);
            return scfuserupdatedetailsS7Repository.save(existingUser);
        } else {
            throw new RuntimeException("User not found with email ID: " + emailId);
        }
    }
    
    
    @Transactional
    private void updateEntityFields(SCFuserupdatedetailsS7Entity existingUser, SCFuserupdatedetailsS7Entity updatedDetails) {
        if (updatedDetails.getFirstName() != null) existingUser.setFirstName(updatedDetails.getFirstName());
        if(updatedDetails.getLastName() !=null) existingUser.setLastName(updatedDetails.getLastName());
        if (updatedDetails.getEmailId() != null) existingUser.setEmailId(updatedDetails.getEmailId());
        if (updatedDetails.getAlternateEmailId() != null) existingUser.setAlternateEmailId(updatedDetails.getAlternateEmailId());
        if (updatedDetails.getPhoneNo() != null) existingUser.setPhoneNo(updatedDetails.getPhoneNo());
        if (updatedDetails.getAlternatePhoneNo() != null) existingUser.setAlternatePhoneNo(updatedDetails.getAlternatePhoneNo());
        if (updatedDetails.getGender() != null) existingUser.setGender(updatedDetails.getGender());
        if (updatedDetails.getDob() != null) existingUser.setDob(updatedDetails.getDob());
        if (updatedDetails.getCurrentAddress() != null) existingUser.setCurrentAddress(updatedDetails.getCurrentAddress());
        if (updatedDetails.getPermanentAddress() != null) existingUser.setPermanentAddress(updatedDetails.getPermanentAddress());
        if (updatedDetails.getCity() != null) existingUser.setCity(updatedDetails.getCity());
        if (updatedDetails.getState() != null) existingUser.setState(updatedDetails.getState());
        if (updatedDetails.getCompanyName() != null) existingUser.setCompanyName(updatedDetails.getCompanyName());
        if (updatedDetails.getBusinessRegNumber() != null) existingUser.setBusinessRegNumber(updatedDetails.getBusinessRegNumber());
        if (updatedDetails.getBusinessType() != null) existingUser.setBusinessType(updatedDetails.getBusinessType());
        if (updatedDetails.getDateOfIncorporation() != null) existingUser.setDateOfIncorporation(updatedDetails.getDateOfIncorporation());
        if (updatedDetails.getAnnualTurnover() != null) existingUser.setAnnualTurnover(updatedDetails.getAnnualTurnover());
        if (updatedDetails.getBusinessRegisteredAddress() != null) existingUser.setBusinessRegisteredAddress(updatedDetails.getBusinessRegisteredAddress());
        if (updatedDetails.getBusinessOperationalAddress() != null) existingUser.setBusinessOperationalAddress(updatedDetails.getBusinessOperationalAddress());
        if (updatedDetails.getCompanyCity() != null) existingUser.setCompanyCity(updatedDetails.getCompanyCity());
        if (updatedDetails.getCompanyState() != null) existingUser.setCompanyState(updatedDetails.getCompanyState());
        if (updatedDetails.getEntityConsumptionType() != null) existingUser.setEntityConsumptionType(updatedDetails.getEntityConsumptionType());
        if (updatedDetails.getTaxIdentificationNumber() != null) existingUser.setTaxIdentificationNumber(updatedDetails.getTaxIdentificationNumber());
        if (updatedDetails.getBusinessContactPerson() != null) existingUser.setBusinessContactPerson(updatedDetails.getBusinessContactPerson());
        if (updatedDetails.getBusinessContactPersonMobNo() != null) existingUser.setBusinessContactPersonMobNo(updatedDetails.getBusinessContactPersonMobNo());
        if (updatedDetails.getKeyBusinessPartner() != null) existingUser.setKeyBusinessPartner(updatedDetails.getKeyBusinessPartner());
        if (updatedDetails.getNoOfYearsMonthInBusiness() != null) existingUser.setNoOfYearsMonthInBusiness(updatedDetails.getNoOfYearsMonthInBusiness());
        if (updatedDetails.getBusinessWebsite() != null) existingUser.setBusinessWebsite(updatedDetails.getBusinessWebsite());
        if (updatedDetails.getFullNameProprietor() != null) existingUser.setFullNameProprietor(updatedDetails.getFullNameProprietor());
        if (updatedDetails.getDesignation() != null) existingUser.setDesignation(updatedDetails.getDesignation());
        if (updatedDetails.getProprietorDob() != null) existingUser.setProprietorDob(updatedDetails.getProprietorDob());
        if (updatedDetails.getProprietorGender() != null) existingUser.setProprietorGender(updatedDetails.getProprietorGender());
        if (updatedDetails.getNationality() != null) existingUser.setNationality(updatedDetails.getNationality());
        if (updatedDetails.getMaritalStatus() != null) existingUser.setMaritalStatus(updatedDetails.getMaritalStatus());
        if (updatedDetails.getContactNo() != null) existingUser.setContactNo(updatedDetails.getContactNo());
        if (updatedDetails.getProprietorEmailId() != null) existingUser.setProprietorEmailId(updatedDetails.getProprietorEmailId());
        if (updatedDetails.getResidentialAdd() != null) existingUser.setResidentialAdd(updatedDetails.getResidentialAdd());
        if (updatedDetails.getAadharNo() != null) existingUser.setAadharNo(updatedDetails.getAadharNo());
        if (updatedDetails.getAadharImg() != null) existingUser.setAadharImg(updatedDetails.getAadharImg());
        if (updatedDetails.getPanNo() != null) existingUser.setPanNo(updatedDetails.getPanNo());
        if (updatedDetails.getPanImg() != null) existingUser.setPanImg(updatedDetails.getPanImg());
        if (updatedDetails.getPassportNo() != null) existingUser.setPassportNo(updatedDetails.getPassportNo());
        if (updatedDetails.getPassportImg() != null) existingUser.setPassportImg(updatedDetails.getPassportImg());
        if (updatedDetails.getYearsOfExperienceInCompany() != null) existingUser.setYearsOfExperienceInCompany(updatedDetails.getYearsOfExperienceInCompany());
        if (updatedDetails.getPreviousCompany() != null) existingUser.setPreviousCompany(updatedDetails.getPreviousCompany());
        if (updatedDetails.getPercentageOfOwnershipInCompany() != null) existingUser.setPercentageOfOwnershipInCompany(updatedDetails.getPercentageOfOwnershipInCompany());
        if (updatedDetails.getBusinessAccountName() != null) existingUser.setBusinessAccountName(updatedDetails.getBusinessAccountName());
        if (updatedDetails.getBusinessAccountNumber() != null) existingUser.setBusinessAccountNumber(updatedDetails.getBusinessAccountNumber());
        if (updatedDetails.getBusinessAccountIFSC() != null) existingUser.setBusinessAccountIFSC(updatedDetails.getBusinessAccountIFSC());
        if (updatedDetails.getPanEntity() != null) existingUser.setPanEntity(updatedDetails.getPanEntity());
        if (updatedDetails.getLoanAmountRequired() != null) existingUser.setLoanAmountRequired(updatedDetails.getLoanAmountRequired());
        if (updatedDetails.getPurposeOfLoan() != null) existingUser.setPurposeOfLoan(updatedDetails.getPurposeOfLoan());
        if (updatedDetails.getPreferredLoanTenure() != null) existingUser.setPreferredLoanTenure(updatedDetails.getPreferredLoanTenure());
        if (updatedDetails.getExistingLoanDetails() != null) existingUser.setExistingLoanDetails(updatedDetails.getExistingLoanDetails());
        if (updatedDetails.getSixMonthBankStatement() != null) existingUser.setSixMonthBankStatement(updatedDetails.getSixMonthBankStatement());
        if (updatedDetails.getFinancialStatement() != null) existingUser.setFinancialStatement(updatedDetails.getFinancialStatement());
        if (updatedDetails.getBusinessRegCertificate() != null) existingUser.setBusinessRegCertificate(updatedDetails.getBusinessRegCertificate());
        if (updatedDetails.getGstCertificate() != null) existingUser.setGstCertificate(updatedDetails.getGstCertificate());
        if (updatedDetails.getKycDocuments() != null) existingUser.setKycDocuments(updatedDetails.getKycDocuments());
        if (updatedDetails.getAuditedBalanceSheet() != null) existingUser.setAuditedBalanceSheet(updatedDetails.getAuditedBalanceSheet());
        if (updatedDetails.getIncomeTaxReturn() != null) existingUser.setIncomeTaxReturn(updatedDetails.getIncomeTaxReturn());
        if (updatedDetails.getCompanyRegCertificate() != null) existingUser.setCompanyRegCertificate(updatedDetails.getCompanyRegCertificate());
        if (updatedDetails.getTopSuppliers() != null) existingUser.setTopSuppliers(updatedDetails.getTopSuppliers());
        if (updatedDetails.getTopBuyers() != null) existingUser.setTopBuyers(updatedDetails.getTopBuyers());
        if (updatedDetails.getSupplierName() != null) existingUser.setSupplierName(updatedDetails.getSupplierName());
        if (updatedDetails.getSupplierContactPerson() != null) existingUser.setSupplierContactPerson(updatedDetails.getSupplierContactPerson());
        if (updatedDetails.getSupplierPaymentTerms() != null) existingUser.setSupplierPaymentTerms(updatedDetails.getSupplierPaymentTerms());
        if (updatedDetails.getSupplierAnnualPurchaseValue() != null) existingUser.setSupplierAnnualPurchaseValue(updatedDetails.getSupplierAnnualPurchaseValue());
        if (updatedDetails.getKeyCustomer() != null) existingUser.setKeyCustomer(updatedDetails.getKeyCustomer());
        if (updatedDetails.getCustomerName() != null) existingUser.setCustomerName(updatedDetails.getCustomerName());
        if (updatedDetails.getCustomerContactPerson() != null) existingUser.setCustomerContactPerson(updatedDetails.getCustomerContactPerson());
        if (updatedDetails.getCustomerPaymentTerms() != null) existingUser.setCustomerPaymentTerms(updatedDetails.getCustomerPaymentTerms());
        if (updatedDetails.getCustomerAnnualPurchaseValue() != null) existingUser.setCustomerAnnualPurchaseValue(updatedDetails.getCustomerAnnualPurchaseValue());
        if (updatedDetails.getMonthlyInvoices() != null) existingUser.setMonthlyInvoices(updatedDetails.getMonthlyInvoices());
        if (updatedDetails.getDoYouHaveAnyCollateral() != null) existingUser.setDoYouHaveAnyCollateral(updatedDetails.getDoYouHaveAnyCollateral());
        if (updatedDetails.getTypeOfCollateral() != null) existingUser.setTypeOfCollateral(updatedDetails.getTypeOfCollateral());
        if (updatedDetails.getOwnerOfCollateral() != null) existingUser.setOwnerOfCollateral(updatedDetails.getOwnerOfCollateral());
        if (updatedDetails.getEstimatedMarketValue() != null) existingUser.setEstimatedMarketValue(updatedDetails.getEstimatedMarketValue());
        if (updatedDetails.getCollateralLocation() != null) existingUser.setCollateralLocation(updatedDetails.getCollateralLocation());
        if (updatedDetails.getCollateralDocumentation() != null) existingUser.setCollateralDocumentation(updatedDetails.getCollateralDocumentation());
        if (updatedDetails.getCreditScore() != null) existingUser.setCreditScore(updatedDetails.getCreditScore());
        if (updatedDetails.getCreditScoreImg() != null) existingUser.setCreditScoreImg(updatedDetails.getCreditScoreImg());
        if (updatedDetails.getAnyPastLoan() != null) existingUser.setAnyPastLoan(updatedDetails.getAnyPastLoan());
        if (updatedDetails.getExistingLoan() != null) existingUser.setExistingLoan(updatedDetails.getExistingLoan());
        if (updatedDetails.getCurrentLoanObligation() != null) existingUser.setCurrentLoanObligation(updatedDetails.getCurrentLoanObligation());
        if (updatedDetails.getIfYes() != null) existingUser.setIfYes(updatedDetails.getIfYes());
        if (updatedDetails.getLenderName() != null) existingUser.setLenderName(updatedDetails.getLenderName());
        if (updatedDetails.getLoanAmount() != null) existingUser.setLoanAmount(updatedDetails.getLoanAmount());
        if (updatedDetails.getEmiAmount() != null) existingUser.setEmiAmount(updatedDetails.getEmiAmount());
        if (updatedDetails.getOutstandingBalance() != null) existingUser.setOutstandingBalance(updatedDetails.getOutstandingBalance());
        if (updatedDetails.getLoanEndDate() != null) existingUser.setLoanEndDate(updatedDetails.getLoanEndDate());
    }
    
    
    
    
    
    /////////////////////////////////////////Buyer Registration Service//////////////////////
    
    @Transactional
    public UserRegistrationResponse registerUser(UserRegistrationRequest request)  {
    	
    	logger.info("Processing user registration for phone number: {}", request.getPhoneNumber());

        // Check if phone number already exists
        if (scfUserdetailsRepository.findByPhoneNumber(request.getPhoneNumber()).isPresent()) {
            throw new PhoneNumberAlreadyExistsException("Phone number already exists.");
        }

        // Check if email ID already exists
        if (scfUserdetailsRepository.findByEmailAddress(request.getEmailAddress()).isPresent()) {
            throw new EmailIdAlreadyExistsException("Email Id already exists.");
        }
    
    	
    	// Save User Role
        UserRoleEntity userRole = new UserRoleEntity();
        userRole.setRoleName(request.getRoleName());
        userRole.setAccessLevels(request.getAccessLevels());
        userRoleRepository.save(userRole);
        
     // Save Org KYC Details
        OrgKycGroupDetailsEntity orgKyc = new OrgKycGroupDetailsEntity();
        orgKyc.setOrgType(request.getOrgType());
        orgKyc.setPropName(request.getPropName());
        orgKyc.setPropMobile(request.getPropMobile());
        orgKyc.setPropEmail(request.getPropEmail());
        orgKyc.setPropAadharNo(request.getPropAadharNo());
        orgKyc.setPropAadharPhoto(request.getPropAadharPhoto());
        orgKyc.setPropPanNo(request.getPropPanNo());
        orgKyc.setPropPanImg(request.getPropPanImg());
        orgKyc.setPropAddress(request.getPropAddress());
        orgKyc.setPropCurrAddress(request.getPropCurrAddress());
        orgKyc.setPropDOB(request.getPropDOB());
        orgKycGroupDetailsRepository.save(orgKyc);
        
        
     // Save Org Role
        OrgRoleEntity orgRole = new OrgRoleEntity();
        orgRole.setOrgRoleName(request.getOrgRoleName());
        orgRole.setOrgRoleType(request.getOrgRoleType());
        orgRoleRepository.save(orgRole);
        
        
     // Save Org Details
        OrgDetailsEntity orgDetails = new OrgDetailsEntity();
        orgDetails.setOrgName(request.getOrgName());
        orgDetails.setOrgGstNumber(request.getOrgGstNumber());
        orgDetails.setOrgRole(orgRole);
        orgDetails.setOrgKyc(orgKyc);
        orgDetails.setOrgAddress(request.getOrgAddress());
        orgDetails.setNoOfEmployee(request.getNoOfEmployee());
        orgDetailsRepository.save(orgDetails);
        
        
     // Save User
        ScfUserdetailsEntity user = new ScfUserdetailsEntity();
        
        user.setUserRole(userRole);
        user.setFirstname(request.getFirstname());
        user.setFullName(request.getFullName());
        user.setEmailAddress(request.getEmailAddress());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setCompanyName(request.getCompanyName());
        user.setProfilePicture(request.getProfilePicture());
        user.setAccountStatus(request.getAccountStatus());
        user.setSmsNotifications(request.getSmsNotifications());
        user.setPreferredLanguage(request.getPreferredLanguage());
        scfUserdetailsRepository.save(user);

    // Create Response
        UserRegistrationResponse response = new UserRegistrationResponse();
        response.setMessage("User registration successful!");
        response.setUserId(user.getUserId());
        return response;
    
        
    }
        
        
      /////////////////////////////SCF Application Create Invoice Service class////////////////////
        
        
        @Transactional
        public ScfApplicationResponse createInvoice(ScfApplicationRequest request) {
            ScfApplicationEntity entity = new ScfApplicationEntity();
            entity.setUserId(request.getUserId());
            entity.setCompanyname(request.getCompanyname());
            entity.setSupplierId(request.getSupplierId());
            entity.setSupplierName(request.getSupplierName());
            entity.setSuppliermobNo(request.getSuppliermobNo());
            entity.setSupplierAddress(request.getSupplierAddress());
            entity.setInvoiceDate(request.getInvoiceDate());
            entity.setInvoicedueDate(request.getInvoicedueDate());
            entity.setInvoiceAmount(request.getInvoiceAmount());
            entity.setAlternativepaymentterms(request.getAlternativepaymentterms());
            entity.setDescriptiongoodsservices(request.getDescriptiongoodsservices());
            entity.setPurchaseorder(request.getPurchaseorder());
            entity.setPaymentterms(request.getAlternativepaymentterms()); // Renamed field
            entity.setDiscountoffered(request.getDiscountoffered());
            entity.setFinancingamountrequired(request.getFinancingamountrequired());
            entity.setBankname(request.getBankname());
            entity.setAccountholdername(request.getAccountholdername());
            entity.setAccountnumber(request.getAccountnumber());
            entity.setSwiftifsccode(request.getSwiftifsccode());
            entity.setSupportingdocuments(request.getSupportingdocuments());
            entity.setApplicantname(request.getApplicantname());
            entity.setTodaydate(request.getTodaydate());
            

            // Invoice number and application ID will be generated automatically in @PrePersist
            ScfApplicationEntity savedEntity = scfApplicationRepository.save(entity);
            
            
            
            ScfApplicationResponse response = new ScfApplicationResponse();
            response.setMessage("Invoice is Created Successfully!");
            response.setId(savedEntity.getId());
            //response.setApplicationId(savedEntity.getApplicationId());
            response.setInvoiceNumber(savedEntity.getInvoiceNumber());
            response.setSupplierId(savedEntity.getSupplierId());
           
 
            return response;
   
}
   
        //////////////////////////GET Invoice List by user_id/////////////////////
        
        
        public List<GetApplicationResponse> getApplicationsByUserId(GetApplicationRequest request) {
            List<ScfApplicationEntity> applications = scfApplicationRepository.findByUserId(request.getUserId());

            return applications.stream().map(app -> {
                GetApplicationResponse response = new GetApplicationResponse();
                response.setId(app.getId());
                response.setUserId(app.getUserId());
                response.setCompanyName(app.getCompanyname());
                response.setSupplierId(app.getSupplierId());
                response.setInvoiceNumber(app.getInvoiceNumber());
                //response.setApplicationId(app.getApplicationId());
                response.setAccountholdername(app.getAccountholdername());
                response.setBankname(app.getBankname());
                response.setAccountnumber(app.getAccountnumber());
                response.setSwiftifsccode(app.getSwiftifsccode());
                
                return response;
            }).collect(Collectors.toList());
        }
        
        
        
        //////////////////////////////////GET Application Details By Invoice Number/////////////////////
        
        
            	
            
        public GetApplicationDetailsResponse getApplicationDetailsByInvoiceNumber(String invoiceNumber) {
            SCFuserupdatedetailsS7Entity entity = scfuserupdatedetailsS7Repository.findByInvoiceNumber(invoiceNumber)
                    .orElseThrow(() -> new RuntimeException("No application found with invoice number: " + invoiceNumber));
            
            
            return new GetApplicationDetailsResponse("Application details retrieved successfully", entity);
        }

        
      
        //////////////////////////////////ScfFinancingRequest Service Class////////////////////////
        
        
        public ScfFinancingRequestResponse createRequest(ScfFinancingRequestRequest request) {
            ScfFinancingRequestEntity entity = new ScfFinancingRequestEntity();
            
            entity.setInvoiceNumber(request.getInvoiceNumber()); // ✅ FIX: You forgot this
            entity.setAmount(request.getAmount());
            entity.setTenure(request.getTenure());
            entity.setInterestRate(request.getInterestRate());
            entity.setBankName(request.getBankName());
            entity.setCreatedDate(LocalDate.now());

            ScfFinancingRequestEntity saved = scfFinancingRequestRepository.save(entity);

            return new ScfFinancingRequestResponse(
                    saved.getAmount(),
                    saved.getTenure(),
                    saved.getInterestRate(),
                    saved.getBankName(),
                    saved.getCreatedDate(),
                    saved.getInvoiceNumber() // ✅ FIX: Make sure response order matches constructor
            );
        }

        
        
        public List<ScfFinancingRequestResponse> getAllRequests() {
            return scfFinancingRequestRepository.findAll().stream()
                    .map(e -> new ScfFinancingRequestResponse(
                            e.getAmount(),
                            e.getTenure(),
                            e.getInterestRate(),
                            e.getBankName(),
                            e.getCreatedDate(),
                            e.getInvoiceNumber() // ✅ Add this at the end
                    ))
                    .collect(Collectors.toList());
        }

        
/////////////////////////////////////SCF Bank Side Service Class////////////////////////////////////////  
      
        
        
        ////////////////////Scf Bank Screen Registration API Service class////////////////
        
        @Transactional
        public ScfBankRegistrationResponse registerBank(ScfBankRegistrationRequest request)  {
        	
        	logger.info("Processing user registration for phone number: {}", request.getMobileNo());

            // Check if phone number already exists
            if (scfBankRegistrationRepository.findByMobileNo(request.getMobileNo()).isPresent()) {
                throw new PhoneNumberAlreadyExistsException("Mobile number already exists.");
            }

            // Check if email ID already exists
            if (scfBankRegistrationRepository.findByEmailId(request.getEmailId()).isPresent()) {
                throw new EmailIdAlreadyExistsException("Email Id already exists.");
            }
        
        	
        	// Save Bank Role
            ScfBankRoleEntity bankRole = new ScfBankRoleEntity();
           
            bankRole.setRoleName(request.getRoleName());
            bankRole.setAccesslevel(request.getAccesslevel());
            scfBankRoleRepository.save(bankRole);
            
            // Save Bank Registration 
            
            ScfBankRegistrationEntity entity = new ScfBankRegistrationEntity();
            entity.setBankRole(bankRole);
            entity.setFirstName(request.getFirstName());
            entity.setLastName(request.getLastName());
            entity.setMobileNo(request.getMobileNo());
            entity.setEmailId(request.getEmailId());
            entity.setJobIdNo(request.getJobIdNo());
            
            scfBankRegistrationRepository.save(entity);
            
            
            
         // Create Response
            ScfBankRegistrationResponse response = new ScfBankRegistrationResponse();
            response.setMessage("Scf Bank registration successful Completed!");
          
            return response;
        
            
        }
            
        /////////////////////////Bank Screen Notification API.s FinancingRequestNotification//////////////////
        
        
        public ScfFinancingRequestNotificationResponse createNotification(ScfFinancingRequestNotificationRequest request) {
        	ScfFinancingRequestNotificationEntity notification = new ScfFinancingRequestNotificationEntity();
            notification.setSenderName(request.getSenderName());
            notification.setMessage(request.getMessage());
            notification.setInvoiceNumber(request.getInvoiceNumber());
            notification.setTimestamp(LocalTime.now());

            ScfFinancingRequestNotificationEntity saved = scfFinancingRequestNotificationRepository.save(notification);

            ScfFinancingRequestNotificationResponse response = new ScfFinancingRequestNotificationResponse();
            response.setSenderName(saved.getSenderName());
            response.setMessage(saved.getMessage());
            response.setInvoiceNumber(saved.getInvoiceNumber());
            response.setTimestamp(saved.getTimestamp());

            return response;
        }

        public List<ScfFinancingRequestNotificationResponse> getAllNotifications() {
            return scfFinancingRequestNotificationRepository.findAll().stream().map(n -> {
            	ScfFinancingRequestNotificationResponse res = new ScfFinancingRequestNotificationResponse();
                res.setSenderName(n.getSenderName());
                res.setMessage(n.getMessage());
                res.setInvoiceNumber(n.getInvoiceNumber());
                res.setTimestamp(n.getTimestamp());
                return res;
            }).collect(Collectors.toList());
        }
        
        
    /////////////////////////////////SCF bank Screen Risk Assessment Service Code////////////////////////////////
        
        
        public ScfbankRiskAssessmentResponse createAssessment(ScfbankRiskAssessmentRequest request) {
            ScfbankRiskAssessmentEntity entity = new ScfbankRiskAssessmentEntity();
            entity.setSectionTitle(request.getSectionTitle());
            entity.setDetails(request.getDetails());
            entity.setInvoiceNumber(request.getInvoiceNumber());
            entity.setUpdatedDate(LocalDate.now()); // Automatically set current date

            ScfbankRiskAssessmentEntity saved = scfbankRiskAssessmentRepository.save(entity);
            return new ScfbankRiskAssessmentResponse(
                    saved.getSectionTitle(),
                    saved.getDetails(),
                    saved.getInvoiceNumber(),
                    saved.getUpdatedDate()
            );
        }

        public List<ScfbankRiskAssessmentResponse> getAllAssessments() {
            return scfbankRiskAssessmentRepository.findAll().stream()
                    .map(e -> new ScfbankRiskAssessmentResponse(
                            e.getSectionTitle(),
                            e.getDetails(),
                            e.getInvoiceNumber(),
                            e.getUpdatedDate()
                    ))
                    .collect(Collectors.toList());
        }

        public List<ScfbankRiskAssessmentResponse> getAssessmentsByInvoice(String invoiceNumber) {
            return scfbankRiskAssessmentRepository.findByInvoiceNumber(invoiceNumber).stream()
                    .map(e -> new ScfbankRiskAssessmentResponse(
                            e.getSectionTitle(),
                            e.getDetails(),
                            e.getInvoiceNumber(),
                            e.getUpdatedDate()
                    ))
                    .collect(Collectors.toList());
        }        
        
        
        
     ///////////////////////////////////SCF Bank Financing Offer Terms Service class///////////////////
        
        public ScfbankFinancingOfferTermsResponse saveTerms(ScfbankFinancingOfferTermsRequest request) {
        	ScfbankFinancingOfferTermsEntity entity = new ScfbankFinancingOfferTermsEntity();
            entity.setInterestRateRange(request.getInterestRateRange());
            entity.setRepaymentSchedule(request.getRepaymentSchedule());
            entity.setRepaymentNote(request.getRepaymentNote());
            entity.setProcessingFeesRange(request.getProcessingFeesRange());
            entity.setProcessingNote(request.getProcessingNote());

            ScfbankFinancingOfferTermsEntity saved = scfbankFinancingOfferTermsRepository.save(entity);

            ScfbankFinancingOfferTermsResponse response = new ScfbankFinancingOfferTermsResponse();
            response.setId(saved.getId());
            response.setInterestRateRange(saved.getInterestRateRange());
            response.setRepaymentSchedule(saved.getRepaymentSchedule());
            response.setRepaymentNote(saved.getRepaymentNote());
            response.setProcessingFeesRange(saved.getProcessingFeesRange());
            response.setProcessingNote(saved.getProcessingNote());

            return response;
        }

        public List<ScfbankFinancingOfferTermsResponse> getAllTerms() {
            return scfbankFinancingOfferTermsRepository.findAll().stream().map(entity -> {
            	ScfbankFinancingOfferTermsResponse res = new ScfbankFinancingOfferTermsResponse();
                res.setId(entity.getId());
                res.setInterestRateRange(entity.getInterestRateRange());
                res.setRepaymentSchedule(entity.getRepaymentSchedule());
                res.setRepaymentNote(entity.getRepaymentNote());
                res.setProcessingFeesRange(entity.getProcessingFeesRange());
                res.setProcessingNote(entity.getProcessingNote());
                return res;
            }).collect(Collectors.toList());
        }
        
        
        
  //////////////////////////////////SCF Bank Fund Disbursement Service class/////////////////
        
        
        public ScfBankFundDisbursementEntity save(ScfBankFundDisbursementRequest request) {
        	ScfBankFundDisbursementEntity entity = new ScfBankFundDisbursementEntity();
            entity.setInvoiceNumber(request.getInvoiceNumber());
            entity.setMessage(request.getMessage());
            entity.setStatus(request.getStatus());
            entity.setFundtype(request.getFundtype());
            entity.setAmount(request.getAmount());
            return scfBankFundDisbursementRepository.save(entity); // date/time set automatically via @PrePersist
        } 
       
        public List<ScfBankFundDisbursementResponse> getAllDis() {
            return scfBankFundDisbursementRepository.findAllByOrderByDateDescTimeDesc().stream().map(entity -> {
            	ScfBankFundDisbursementResponse res = new ScfBankFundDisbursementResponse();
                res.setMessage(entity.getMessage());
                res.setInvoiceNumber(entity.getInvoiceNumber());
                res.setStatus(entity.getStatus());
                res.setFundtype(entity.getFundtype());
                res.setDate(entity.getDate());
                res.setTime(entity.getTime());
                res.setAmount(entity.getAmount());
                return res;
            }).collect(Collectors.toList());
        }
        
        
        public Map<String, Object> getSummary() {
            List<ScfBankFundDisbursementEntity> all = scfBankFundDisbursementRepository.findAll();
            BigDecimal totalAmount = all.stream().map(e -> e.getAmount() != null ? e.getAmount() : BigDecimal.ZERO).reduce(BigDecimal.ZERO, BigDecimal::add);
            long completed = all.stream().filter(e -> "Completed".equalsIgnoreCase(e.getStatus())).count();
            long requested = all.stream().filter(e -> "Requested".equalsIgnoreCase(e.getStatus())).count();

            Map<String, Object> map = new HashMap<>();
            map.put("totalAmount", totalAmount);
            map.put("completedTransfers", completed);
            map.put("requestedTransfers", requested);
            return map;
        }
        
        
        
        
        
        
        
        
        
        ////////////////////////////////SCF SUPPLIER SCREEN SERVICE CLASS CODE////////////////////////
        
        //////////////////Scf Supplier screen Registration Api service class///////////////////
        
        
        @Transactional
        public ScfSupplierRegistrationResponse registerSupplier(ScfSupplierRegistrationRequest request)  {
        	
        	logger.info("Processing user registration for phone number: {}", request.getMobileNo());

            // Check if phone number already exists
            if (scfSupplierRegistrationRepository.findByMobileNo(request.getMobileNo()).isPresent()) {
                throw new PhoneNumberAlreadyExistsException("Mobile number already exists.");
            }

            // Check if email ID already exists
            if (scfSupplierRegistrationRepository.findByEmailId(request.getEmailId()).isPresent()) {
                throw new EmailIdAlreadyExistsException("Email Id already exists.");
            }
        
        	
            // Save Supplier Registration 
            
            ScfSupplierRegistrationEntity entity = new ScfSupplierRegistrationEntity();
           
            entity.setFirstName(request.getFirstName());
            entity.setLastName(request.getLastName());
            entity.setMobileNo(request.getMobileNo());
            entity.setEmailId(request.getEmailId());
            entity.setSupplierId(request.getSupplierId());
            
            scfSupplierRegistrationRepository.save(entity);
            
            
            
         // Create Response
            ScfSupplierRegistrationResponse response = new ScfSupplierRegistrationResponse();
            response.setMessage("Scf Supplier registration successfuly Completed!");
          
            return response;
        
            
        }
        
        
        
        
    ///////////////////////BANK OFFER SUPPLIER SCREEN SERVICE CLASS CODE//////////////////
        ///scfSupplierBankOfferRepository.
        ///scfSupplierSelectedbankOfferRepository
        
        public void addOffer(ScfAddBankOfferRequest request) {
            ScfSupplierBankOfferEntity offer = new ScfSupplierBankOfferEntity();
            offer.setBankName(request.getBankName());
            offer.setInterestRate(request.getInterestRate());
            offer.setTermInYears(request.getTermInYears());
            offer.setImageUrl(request.getImageUrl());
            scfSupplierBankOfferRepository.save(offer);
        }

        public List<ScfSupplierBankOfferResponse> getAllOffers() {
            List<ScfSupplierBankOfferEntity> offers = scfSupplierBankOfferRepository.findAll();
            return offers.stream().map(offer -> {
                ScfSupplierBankOfferResponse res = new ScfSupplierBankOfferResponse();
                res.setId(offer.getId());
                res.setBankName(offer.getBankName());
                res.setInterestRate(offer.getInterestRate());
                res.setTermInYears(offer.getTermInYears());
                res.setImageUrl(offer.getImageUrl());

                scfSupplierSelectedbankOfferRepository.findByOffer_Id(offer.getId()).ifPresent(selected -> {
                    res.setSelected(true);
                    res.setProceed(selected.isProceed());
                    res.setInvoiceNumber(selected.getInvoiceNumber());
                });

                return res;
            }).collect(Collectors.toList());
        }

        public void selectOffer(ScfSelectBankOfferRequest request) {
            ScfSupplierBankOfferEntity offer = scfSupplierBankOfferRepository.findById(request.getOfferId())
                    .orElseThrow(() -> new RuntimeException("Offer not found"));

            ScfSupplierSelectedbankOfferEntity selected = new ScfSupplierSelectedbankOfferEntity();
            selected.setOffer(offer);
            selected.setProceed(false);
            selected.setInvoiceNumber("");
            scfSupplierSelectedbankOfferRepository.save(selected);
        }

        public void addInvoice(ScfAddInvoiceBankOfferRequest request) {
            ScfSupplierSelectedbankOfferEntity selected = scfSupplierSelectedbankOfferRepository.findByOffer_Id(request.getOfferId())
                    .orElseThrow(() -> new RuntimeException("Offer not selected"));
            selected.setInvoiceNumber(request.getInvoiceNumber());
            scfSupplierSelectedbankOfferRepository.save(selected);
        }

        public void markProceed(ScfSelectBankOfferRequest request) {
            ScfSupplierSelectedbankOfferEntity selected = scfSupplierSelectedbankOfferRepository.findByOffer_Id(request.getOfferId())
                    .orElseThrow(() -> new RuntimeException("Offer not selected"));
            selected.setProceed(true);
            scfSupplierSelectedbankOfferRepository.save(selected);
        }
        
        
        /////////////////////////////////Early Payment Request API Service class//////////////////////
        
        
        
        /*public EarlyPaymentResponse createEarlyPaymentRequest(EarlyPaymentRequest request) {
            logger.info("Received Early Payment Request for Invoice Number: {}", request.getInvoiceNumber());

            EarlyPaymentRequestEntity entity = new EarlyPaymentRequestEntity();
            BeanUtils.copyProperties(request, entity);

            EarlyPaymentRequestEntity saved = earlyPaymentRequestRepository.save(entity);
            logger.info("Early Payment Request saved successfully with ID: {}", saved.getId());

            EarlyPaymentResponse response = new EarlyPaymentResponse();
            response.setMessage("Early Payment Request submitted successfully.");
            response.setInvoiceNumber(saved.getInvoiceNumber());
            response.setFinancingAmount(saved.getFinancingAmount());

            return response;
        }*/
        
        @Transactional
        public EarlyPaymentResponse submitRequest(EarlyPaymentRequest request) {
            logger.info("Submitting early payment request for invoice: {}", request.getInvoiceNumber());
            
            // Validate invoice number uniqueness
            if (earlyPaymentRequestRepository.existsByInvoiceNumber(request.getInvoiceNumber())) {
                logger.error("Duplicate invoice number: {}", request.getInvoiceNumber());
                throw new RuntimeException("Invoice number already exists.");
            }

            try {
                // Convert DTO to Entity
                EarlyPaymentRequestEntity entity = new EarlyPaymentRequestEntity();
                BeanUtils.copyProperties(request, entity);
                
                // Save to database
                EarlyPaymentRequestEntity savedEntity = earlyPaymentRequestRepository.save(entity);
                logger.info("Successfully saved early payment request with ID: {}", savedEntity.getId());
                
                // Return response
                return new EarlyPaymentResponse(
                    "Early payment request submitted successfully.",
                    savedEntity.getInvoiceNumber(),
                    savedEntity.getId(),
                    savedEntity.getFinancingAmount()
                );
            } catch (Exception e) {
                logger.error("Error saving early payment request", e);
                throw new RuntimeException("Failed to submit early payment request", e);
            }
        }
}