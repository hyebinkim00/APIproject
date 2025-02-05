package org.zerock.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import java.util.Locale;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import com.google.gson.JsonObject;



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

    @RequestMapping(value = "/test")

    public String test() throws IOException {

         {

                     throw new IOException("occured IOException...");

           } 

}
	
	
	
	
	
	@ResponseBody 
	  @RequestMapping("/test3")
	  public String test3(){
		 
		
		JsonObject obj =new JsonObject();

	    obj.addProperty("title", "테스트3");
	    obj.addProperty("content", "테스트3 내용");

	    JsonObject data = new JsonObject();

	    data.addProperty("time", "12:00");

	    obj.add("data", data);

	    return obj.toString();
	  }

	
}
