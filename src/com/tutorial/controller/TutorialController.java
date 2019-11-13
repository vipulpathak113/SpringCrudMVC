
package com.tutorial.controller;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.model.LoginModel;
import com.tutorial.model.SignupModel;
import com.tutorial.service.TutorialService;
 
@Controller
public class TutorialController {
	
	@Autowired
	private TutorialService tutorialService;
 
	
	@RequestMapping(value ="/" ,method=RequestMethod.GET)
	public String home(){
		return "index";
	}
	
	@RequestMapping(value ="/register" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("user", new SignupModel());
		return "register";
	}
	
	@RequestMapping(value ="/login" ,method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("login", new LoginModel());
		return "login";
	}
	
	  
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") LoginModel login) {
	    ModelAndView mav = null;
	    SignupModel user = tutorialService.validateUser(login);
	    if (null != user) {
	        mav = new ModelAndView("welcome");
	        mav.addObject("firstname", user.getFirstname());
	        mav.addObject("allUsers", tutorialService.getAllUsers());
	        } else {
	        mav = new ModelAndView("login");
	        mav.addObject("message", "Username or Password is wrong!!");
	        }
	        return mav;
	      }
	  
	
	@RequestMapping(value ="/userlist" ,method=RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("user", new SignupModel());
		return "register";
	}
	
	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("user") SignupModel user) {
		  tutorialService.SaveUser(user);
		  ModelAndView mav = new ModelAndView("welcome");
		  mav.addObject("allUsers", tutorialService.getAllUsers());
		  mav.addObject("firstname", user.getFirstname());
	  return mav;
	  }
	  
	  @RequestMapping(value="/delete/{user}",method = RequestMethod.GET)    
	    public String deleteUser(@PathVariable String user){    
	        tutorialService.deleteUser(user);   
	        return "redirect:/loginProcess";    
	    }     
	  
@RequestMapping(value="/edit/{user}",method = RequestMethod.GET)
   public ModelAndView editUser(@PathVariable String user, @ModelAttribute("edit") SignupModel model){    
	ModelAndView mav = new ModelAndView("editUser");
	  mav.addObject("edit", tutorialService.getUser(user));
	return mav;   
    } 

@RequestMapping(value="/editsave",method = RequestMethod.POST)
public ModelAndView updateUser(@ModelAttribute("edit") SignupModel model){  
	 tutorialService.SaveUser(model);
	return new ModelAndView("redirect:/");      
 } 
	  
	  
	  
}