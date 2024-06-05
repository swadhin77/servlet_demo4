package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException
	  {
		Cookie c[]=req.getCookies();
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		boolean b=false;
		String name1="";
		if(c==null)
		{
			pw.println("You are new user");
		}
		else
		{
			for(Cookie ck:c)
			{
				String tnm=ck.getName();
				if(tnm.equals("name"))
				{
					b=true;
					name1=ck.getValue();
				}
			}
		}
		if(b)
		{
			pw.println("welcome back "+name1);
		}
		else
		{
			pw.println("You are new user...");
		}
		
	  }
}
