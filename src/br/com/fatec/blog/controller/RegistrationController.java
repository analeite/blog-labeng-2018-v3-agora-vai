package br.com.fatec.blog.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.blog.dao.BaseDao;
import br.com.fatec.blog.dao.BaseDaoImpl;
import br.com.fatec.blog.pojo.User;

public class RegistrationController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("userRegistration.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "As senhas devem ser as mesmas";
		String page = "userRegistration.jsp";

		if (request.getParameter("password").equals(request.getParameter("confPassword"))) {
			User user = new User();
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			user.setFirstName(request.getParameter("firstName"));
			user.setLastName(request.getParameter("lastName"));
			user.setBirth(request.getParameter("birth"));
			user.setEmailId(request.getParameter("emailId"));
			user.setCell(request.getParameter("cell"));

			System.out.println(user.toString());
			BaseDao baseDao = new BaseDaoImpl();
			msg = baseDao.register(user);
			page = "login.jsp";
		}

		request.setAttribute("msg2", msg);
		request.getRequestDispatcher(page).include(request, response);
	}

}
