package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/index")
public class index extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
			out.println("<title>About Us</title>");
			out.println("<meta charset=\"utf-8\">");
			out.println("<link rel=\"stylesheet\" href=\"styles/index.css\" type=\"text/css\">");
			out.println("<link rel=\"stylesheet\" href=\"styles/general.css\">");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>What Are We Selling?</h2>");
			out.println("<p>We are offering the service for people who like traveling but do not have time to. As you can see, on our product page, we offer various kinds of crazy services. For example, like Pandas? We can deliver one to your house and taken care of it for your! We will handle all the paper work and so on and the only thing that you need to do is telling us what to do!</p>");
			out.println("</body>");
			out.println("<body>");
			out.println("<h2>Project Group</h2>");
			out.println("<img src=\"images/hipanda.jpg\" alt=\"Panda Hi\">");
			out.println("<p>Hi, we are team ForgotPasswords. We have two members who are Zhongjie Shen and Christopher Zhao</p>");
			out.println("</body>");
			out.println("<body>");
			out.println("<h2>What Else Should You x`Know About Us?</h2>");
			out.println("<p>Just ask, and we can help.</p>");
			out.println("</body>");
			out.println("<body>");
			out.println("<h2>Contact Us</h2>");
			out.println("<p>Email: help@wedoeverythingforyou.com</p>");
			out.println("<p>Phone: 949-342(2334)</p>");
			out.println("<p>Address: Superman Co., 14 East 60th St, New York, NY, 10022</p>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
