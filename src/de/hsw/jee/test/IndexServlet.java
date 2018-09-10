package de.hsw.jee.test;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.hsw.jee.html.HTML;

@WebServlet("/")
public class IndexServlet extends HttpServlet {
	
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.YYYY");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath() + "/main");
	}
	
}