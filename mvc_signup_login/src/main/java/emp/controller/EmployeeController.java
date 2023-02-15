package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.EmployeeDao;
import emp.dto.Employee;

@Controller
public class EmployeeController {
		@Autowired
		Employee employee;
		
		@Autowired
		EmployeeDao dao;
		
		@RequestMapping("load")
		public ModelAndView loadEmployee()
		{
			ModelAndView andView=new ModelAndView("signup.jsp");
//			or	andView.setViewName("signup.jsp");
//			Employee employee=new Employee(); to avoid this we take Autowired bcz spring will create the object
			andView.addObject("emp", employee);
			return andView;
		}
		
		@RequestMapping("signup")
		public ModelAndView saveEmployee(@ModelAttribute Employee emp)
		{
			dao.signup(emp);
			ModelAndView andView=new ModelAndView("login.jsp");
			return andView;
		}
		@PostMapping("login")
		public ModelAndView login(@RequestParam String email,@RequestParam String Password) {
			ModelAndView andView=new ModelAndView();
			Employee employee=dao.login(email);
			if(employee==null) {
				andView.setViewName("login.jsp");
				andView.addObject("msg","invalid email");
			}
			else {
				if(Password.equals(employee.getPassword())) 
				{
					andView.setViewName("result.jsp");
					andView.addObject("list",dao.fetchAll());
					andView.addObject("msg","logged in");
				}
				else {
					andView.setViewName("login.jsp");
					andView.addObject("mesg","invali email");
				}
			}
			return andView;
		}
	}

