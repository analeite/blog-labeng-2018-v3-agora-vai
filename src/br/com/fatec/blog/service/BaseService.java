package br.com.fatec.blog.service;

import br.com.fatec.blog.pojo.User;

public interface BaseService {
	
	public boolean login(String username, String password);
	
	public String registration(User user);

}
