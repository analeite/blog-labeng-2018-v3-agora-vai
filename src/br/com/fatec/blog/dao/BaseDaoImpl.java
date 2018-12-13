package br.com.fatec.blog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import br.com.fatec.blog.pojo.User;
import br.com.fatec.blog.util.HibernateUtil;

public class BaseDaoImpl implements BaseDao {
	
	@Override
	public boolean login(String username, String password) {
		Session session = HibernateUtil.getSession();
		
		if(session != null) {
			try {
				User user = (User) session.get(User.class, username);
				if(password.equals(user.getPassword())) {
					System.out.println("User: " + user.toString());
					return true;
				}
			} catch (Exception exception) {
				System.out.println("Ocorreu uma exce��o durante a leitura dos dados do usu�rio: "
						+ exception.getMessage());
				return false;
			}
		} else {
			System.out.println("O servidor do banco caiu!");
		}
		return false;
	}

	@Override
	public String register(User user) {
		String msg = "O registro n�o foi bem sucedido, tente novamente, por favor.";
		Session session = HibernateUtil.getSession();
		if(session != null) {
			try {
				if (user != null) {
					String username = (String) session.save(user);
					session.beginTransaction().commit();
					msg = "Usu�rio " + username + " criado com sucesso, fa�a o login por favor."; 
				}
			} catch (Exception exception) {
				System.out.println("Ocorreu uma exce��o durante a leitura dos dados do usu�rio: "
				+ exception.getMessage());
			}
		} else {
			System.out.println("O servidor do banco caiu!");
		}
		
		System.out.println("msg: " + msg);
		return msg;
	}

}
