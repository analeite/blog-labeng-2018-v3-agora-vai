package br.com.fatec.blog.service;

import br.com.fatec.blog.dao.BaseDao;
import br.com.fatec.blog.dao.BaseDaoImpl;
import br.com.fatec.blog.pojo.User;

public class BaseServiceImpl implements BaseService {
	
	private BaseDao loginDao = new BaseDaoImpl();

	@Override
	public boolean login(String username, String password) {
		return loginDao.login(username, password);
	}

	@Override
	public String registration(User user) {
		// TODO Auto-generated method stub
		return loginDao.register(user);
	}
	

}
