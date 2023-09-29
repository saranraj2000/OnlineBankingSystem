package com.wipro.obs.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.obs.entity.AccountSummary;
import com.wipro.obs.entity.CustDetails;
import com.wipro.obs.entity.DepositAccount;
import com.wipro.obs.entity.PayeeDetails;
import com.wipro.obs.entity.RecurringDeposit;
import com.wipro.obs.repository.AccSummaryRepo;
import com.wipro.obs.repository.CustRepo;
import com.wipro.obs.service.AccStatementService;
import com.wipro.obs.service.AccSummaryService;
import com.wipro.obs.service.CustService;
import com.wipro.obs.service.DepositAccountService;
import com.wipro.obs.service.PayeeService;
import com.wipro.obs.service.RecurringDepositService;

@Controller
public class CustDetailsController {
	
	@Autowired
	CustRepo custRepo;
	
	@Autowired
	CustService custService;
	
	@Autowired
	AccSummaryService summaryService; 
	
	@Autowired
	AccStatementService statementService;
	
	@Autowired
	PayeeService payeeService;
	
	@Autowired
	DepositAccountService depositeAccountService;
	
	@Autowired
	RecurringDepositService recurringDepositeService;
	
	@RequestMapping("/")
	public ModelAndView showLogin(Model model) {
	    ModelAndView modelAndView = new ModelAndView();
	    CustDetails cust = new CustDetails();
	    modelAndView.addObject("cust", cust);
	    modelAndView.setViewName("login");
	    
	    
	    return modelAndView;
	}
  

	
String custid ="",accno="";
	
	@RequestMapping("/login")
	public ModelAndView login(CustDetails user,HttpSession session) {
		ModelAndView modelandview=new ModelAndView();
		if(custRepo.existsById(user.getCustid())) {
			if(user.getPassword().equals(custRepo.findById(user.getCustid()).get().getPassword())) {
			custid=user.getCustid();
			CustDetails al = custService.getbyid(custid);
			accno=al.getAccno();
			System.out.println(custid);
			session.setAttribute("userId", custid);
			session.setAttribute("AccountNo",user.getAccno());
			System.out.println(user.getCustid());
			modelandview.setViewName("home");
		}else {
			modelandview.addObject("msg", "Invalid password");
			modelandview.setViewName("login");
		}
		}else {
			modelandview.addObject("msg","Invalid password");
			modelandview.setViewName("login");
		}
		return modelandview;
	}
	
	@GetMapping("/change")
		public String changepass(HttpSession session) {
		 if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }

			return "Password";
		}
	
	
	@RequestMapping("/changepassword")
	public ModelAndView changePassword(@RequestParam String password, String newPassword, String confirmPassword) {
	    ModelAndView modelAndView = new ModelAndView();

	    CustDetails custDetails = custRepo.findById(custid).orElse(null);
	    if (custDetails != null) {
	        if (password.equals(custDetails.getPassword())) {
	            if (!password.equals(newPassword)) {
	                if (newPassword.equals(confirmPassword)) {
	                    custDetails.setPassword(newPassword);
	                    custService.savecust(custDetails);
	                    modelAndView.addObject("msg", "Password Changed Successfully!!");
	                    modelAndView.setViewName("login");
	                } else {
	                    modelAndView.addObject("msg", "Confirm Password Doesn't Match with New Password");
	                    modelAndView.setViewName("Password");
	                }
	            } else {
	                modelAndView.addObject("msg", "New Password Shouldn't Match with Old Password");
	                modelAndView.setViewName("Password");
	            }
	        } else {
	            modelAndView.addObject("msg", "Current Password Doesn't Match with Database");
	            modelAndView.setViewName("Password");
	        }
	    } else {
	        modelAndView.addObject("msg", "Invalid Customer ID");
	        modelAndView.setViewName("Password");
	    }

	    return modelAndView;
	}
	


		
	@PostMapping("/Registration")
	public ModelAndView Registration(CustDetails CustDetails,HttpSession session) {
		ModelAndView ob=new ModelAndView();
		custService.savecust(CustDetails);
		ob.setViewName("login");
		return ob;
	}
	
	 @RequestMapping("/Regis_tration")
	 public String regis(HttpSession session) {
		 
		 return "Registercustomer";
	 }
	 
	 
	 @RequestMapping("/Accountsummary")
	 public ModelAndView accountsummary(HttpSession session) {
		 ModelAndView ob =new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 CustDetails al = custService.getbyid(custid);
		 String accno=al.getAccno();
		 ob.addObject("summarylist", summaryService.getAccountsummariesbyaccno(accno));
		 ob.addObject("mode", "ALLSUMMARY");
		 ob.setViewName("Accountsummary");
		 return ob;
	 }
	 
	 @RequestMapping("/Accountstatement")
	 public ModelAndView accountstatement(HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 ob.addObject("statementlist", statementService.geAccountstatements());
		 ob.addObject("mode", "ALLSTATEMENT");
		 ob.setViewName("Accountstatement");
		 return ob;
	 }
	 
	 @RequestMapping("/home")
	 public ModelAndView home(HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }

		 ob.setViewName("home");
		 return ob;
	 }
	 
		 
	 @RequestMapping("/viewpayee")
	 public ModelAndView viewpayee(PayeeDetails paye,HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 ob.addObject("payeelist", payeeService.getPayeeDetails());
		 ob.addObject("mode", "ALLPAYEE");
		 ob.setViewName("viewpayee");
		 return ob;

	 }
	 
	 @PostMapping("/addpayee")
	  public ModelAndView addpayee(PayeeDetails payee,HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 String custId = (String) session.getAttribute("userId");
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }

		 payeeService.savepayee(payee,custId);
		 ob.addObject("payeelist", payeeService.getPayeeDetails());
		 ob.addObject("mode", "ALLPAYEE");
		 ob.setViewName("successpayee");
		 return ob;
		 
	 }
	 
	 @RequestMapping("/add_payee")
	 public String addpayee(HttpSession session) {
		 if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }

		 return "Payeedetails";
	 }

	 
	 @RequestMapping("/deletepayee")
	 public ModelAndView deletepayee(@RequestParam int payeeid,HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 payeeService.delete(payeeid);
		 ob.addObject("payeelist", payeeService.getPayeeDetails());
		 ob.addObject("mode", "ALLPAYEE");
		 ob.setViewName("viewpayee");
		 return ob;
	 }
	 //fund transfer
	@GetMapping("/fundtransfer")
	public String fundTransfer(HttpSession session) {
		 if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }

		return "FundTransfer";
	}
	@PostMapping("/fund_transfer")
	public String fund_transfer(@RequestParam("accno")String accNo,@RequestParam("amount")int amount,HttpSession session,Model m) {
		String uId =  (String) session.getAttribute("userId");
		if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }
		PayeeDetails payee = payeeService.getByaccno(accNo);
		if(payee.getSetstatus()==null) {
			
			m.addAttribute("error","Payee not approved");
			return "FundTransfer";
		}else {
			
			
			boolean val = custService.transfers(uId,accNo,amount);
			System.out.println(uId);
			System.out.println(true);
			if(val) {
				return "successfundtransfer";
			}else {
				return "redirect:/login";
			}
		}
		
			
		
	}

	@GetMapping("/logout")
	public ModelAndView showlogoutpage(HttpServletRequest request ) {
		HttpSession session = request.getSession(false);
		if(session!=null) session.invalidate();
		ModelAndView modelAndView = new ModelAndView();
		CustDetails cust =new CustDetails();
		modelAndView.addObject("cust", cust);
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping("/deposite_account")
	public String deposite(HttpSession session, Model m) {
		 if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }
		 m.addAttribute("accno",accno);
		return "Depositeaccount";
	}
	
	@PostMapping("/depositeaccount")
	public ModelAndView depositeaccount(DepositAccount deposite,HttpSession session) {
		ModelAndView ob = new ModelAndView();
		if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		depositeAccountService.savedeposite(deposite);
		ob.addObject("depolist", depositeAccountService.getDepositeAccount());
		ob.addObject("mode", "ALLDEPO");
		ob.setViewName("successdposite");
		return ob;
	}
	
	@RequestMapping("/createaccount")
	public String createaccount(HttpSession session) {
		 if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }

		return "CreateAccount";
	}
	
	@RequestMapping("/viewdepositeaccount")
	public ModelAndView viewdepo(DepositAccount deposite,HttpSession session) {
		ModelAndView ob = new ModelAndView();
		if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		ob.addObject("depolist", depositeAccountService.getDepositeAccount());
		ob.addObject("mode", "ALLDEPO");
		ob.setViewName("Viewdepositeaccount");
		return ob;
	
	}
	 @RequestMapping("/deletedepo")
	 public ModelAndView deletedepo(@RequestParam String accno,HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 DepositAccount u = depositeAccountService.getbyid(accno);
		 custService.deduct(custid, accno,Integer.parseInt(u.getDepositeamount()));
		 depositeAccountService.delete(accno);
		 ob.addObject("depolistt", depositeAccountService.getDepositeAccount());
		 ob.addObject("mode", "ALLDEPO");
		 ob.setViewName("Viewdepositeaccount");
		 return ob;
	 }
	 
	 @GetMapping("/approve")
	 public ModelAndView approve(@RequestParam int payeeid,HttpSession session) {
		 ModelAndView ob = new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 PayeeDetails payeedetails = payeeService.getById(payeeid);
		 payeeService.Approve(payeedetails);
		 ob.setViewName("viewpayee");
		 return ob;
		 
	 }
	 @RequestMapping("/recurring_account")
	 public String recurringdeposite(HttpSession session,Model m) {
		 if(session.getAttribute("userId")==null) { 
		     return "redirect:/";
		 }

		 m.addAttribute("accno",accno);
		 System.out.println("acc"+accno);
		 return "Recurringdeposite";
	 }
	 
	 
	 @PostMapping("/recurringaccount")
	 public ModelAndView recurring(RecurringDeposit recurring,HttpSession session) {
		 ModelAndView ob=new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 recurringDepositeService.saverecurring(recurring);
		 ob.addObject("reculist", recurringDepositeService.getRecurringAccount());
		 ob.addObject("mode", "ALLRECURRING");
		 ob.setViewName("successrecurring");
		 return ob;
	 }
	 
	 @RequestMapping("/viewrecurringaccount")
		public ModelAndView viewrecurring(RecurringDeposit recurringdeposite,HttpSession session) {
			ModelAndView ob = new ModelAndView();
			if(session.getAttribute("userId")==null) {
			     ob.setViewName("redirect:/");
			     return ob;
			 }
			ob.addObject("reculist", recurringDepositeService.getRecurringAccount());
			ob.addObject("mode", "ALLRECURRING");
			ob.setViewName("ViewRecurringaccount");
			return ob;
	 }

	 @RequestMapping("/deleterecurring")
	 public ModelAndView deleterecurring(@RequestParam String accno,HttpSession session) {
		 ModelAndView ob = new ModelAndView();
		 if(session.getAttribute("userId")==null) {
		     ob.setViewName("redirect:/");
		     return ob;
		 }
		 recurringDepositeService.delete(accno);
		 ob.addObject("reculist", recurringDepositeService.getRecurringAccount());
		 ob.addObject("mode", "ALLRECURRING");
		 ob.setViewName("ViewRecurringaccount");
		 return ob;
	 }
	 
	


}

