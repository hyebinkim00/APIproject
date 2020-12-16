package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.service.MemberService;



/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {


	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
    public ModelAndView goStudent(HttpServletRequest httpServletRequest) {
        
        System.out.println("RequestMethod.POST");
        
        String id = httpServletRequest.getParameter("id");
        System.out.println("id : " + id);
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student/student2");
        mav.addObject("studentId", id);
        
        return mav; 
    }



	
	
}
