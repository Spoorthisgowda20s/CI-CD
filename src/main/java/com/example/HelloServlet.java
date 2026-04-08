package com.example;

import java.io.IOException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req,
		             HttpServletResponse res) throws IOException {

	res.setContentType("text/html");
	res.setWriter().println("<h2>Deployment Successful!</h2>");
		}
}
