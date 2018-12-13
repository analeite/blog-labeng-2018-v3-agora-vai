package br.com.fatec.blog.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.blog.service.BaseService;
import br.com.fatec.blog.service.BaseServiceImpl;

public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	System.out.println(username + "::" + password);
	String page = "login.jsp";
	if(username.trim().length() >= 0 && username != null &&
			password.trim().length() >= 0 && password != null) {
		BaseService loginService = new BaseServiceImpl();
		boolean flag = loginService.login(username, password);
		
		if(flag) {
			System.out.println("Login feito com sucesso!");
			request.setAttribute("username", username);
			request.setAttribute("msg", "Login realizado!");
			page = "home.jsp";
		} else {
			request.setAttribute("msg", "Usuário ou senha errado, tente novamente.");
		}
		} else {
			request.setAttribute("msg", "Por favor, entre com o usuário e com a senha.");
		}
		request.getRequestDispatcher(page).include(request, response);
	}
}


