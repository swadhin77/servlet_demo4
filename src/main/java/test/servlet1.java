package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/user")
public class servlet1 extends HttpServlet
{
	@Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException
  {
	  String name=req.getParameter("user_name");
	  String email=req.getParameter("user_email");
	  String gender=req.getParameter("s1");
	  res.setContentType("text/html");
	  PrintWriter pw=res.getWriter();
	  pw.println("Your name is :"+name+"<br>");
	  pw.println("Your mail id is :"+email+"<br>");
	  Cookie ck= new Cookie("name",name);
	  res.addCookie(ck);
	  if(gender.equals("male"))
	  {
		  pw.println("You are "+gender+"<br>");
	  }
	  else
	  {
		  pw.println("You are "+gender+"<br>");
	  }
	  pw.println("<a href='servlet2'><button>Click here to go 2nd Servlet</button></a>");
  }
}
