package br.com.fatec.blog.dao;

import br.com.fatec.blog.pojo.User;

public interface BaseDao {
	
	public boolean login(String username, String password);
	
	public String register(User user);

}
