package com.minsk.kozlow;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.text.MaskFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class HelloWorldController {
	String message="Welcome to Spring MVC";
	
	@RequestMapping(value="/helloo")
	public ModelAndView showMessage(@RequestParam(value="name", required=false, defaultValue="World") String name){
		System.out.println("in controller");
		
		ModelAndView mv= new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping(value="/")
	public String startPage()
	{
		ModelAndView mw = new ModelAndView();
		return "redirect:/index.jsp";
	}
	/*
	@RequestMapping()
	public ModelAndView getLoginPage
	{
		
	}
	*/
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public ModelAndView getRegistrationForm()
	{
		ModelAndView mw = new ModelAndView("registration");
		return mw;
	}
	
	@RequestMapping(value="/set")
	public String doRegistration(@RequestParam(value="username") String username, @RequestParam(value="password") String password)
	{
		Connection conn=null;
		try {
            Context ctx = new InitialContext();            
            DataSource ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/plcp");
            conn =  ds.getConnection();
            
            
        } catch (SQLException ex) {
        	ex.printStackTrace();
        }
        catch (NamingException ex) {
            
        	ex.printStackTrace();
        }
		try {
			Statement st =conn.createStatement();
			st.execute("INSERT INTO users (username, password, enabled) VALUES ('"+username+"', '"+password+"', 1);");
			st.execute("INSERT INTO authorities (username, authority) VALUES('"+username+"', 'ROLE_ADMIN');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		ModelAndView mw = new ModelAndView("helloworld");
		return "redirect:/";
    }


}
