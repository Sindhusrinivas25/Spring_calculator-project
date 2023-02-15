package calculator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	//@RequestMapping("add")
	//public void add() {
		//System.out.println("add");
	//}
	@RequestMapping("add")
	private void addition(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		 int num2=Integer.parseInt(request.getParameter("num2"));
		response.getWriter().print("<h1>The addition of "+(num1)+" and "+(num2)+" is "+(num1+num2)+"</h1>");
		
		
	}
	@RequestMapping("sub")
	public void substraction(@RequestParam int num1,@RequestParam int num2,HttpServletResponse response)throws IOException  {
		response.getWriter().print("<h1>The difference of "+(num1)+" and "+(num2)+" is "+(num1-num2)+"</h1>");
		
	}
	@RequestMapping("mul")
	@ResponseBody
	public String multiplication(@RequestParam int num1,@RequestParam int num2)throws IOException  {
		return "<h1>The product of "+(num1)+" and "+(num2)+" is "+(num1*num2)+"</h1>";
		
	}

}
