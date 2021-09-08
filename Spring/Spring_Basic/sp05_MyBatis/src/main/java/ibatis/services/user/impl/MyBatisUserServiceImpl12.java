package ibatis.services.user.impl;

import java.util.List;

import ibatis.services.domain.User;
import ibatis.services.user.UserDAO;
import ibatis.services.user.UserService;

public class MyBatisUserServiceImpl12 implements UserService{
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void addUser(User user) throws Exception {
		userDAO.addUser(user);
		
	}

	@Override
	public void updateUser(User user) throws Exception {
		userDAO.updateUser(user);
		
	}

	@Override
	public User getUser(String userId) throws Exception {
		return userDAO.getUser(userId);
	}

	@Override
	public List<User> getUserList(User user) throws Exception {
		return userDAO.getUserList(user);
	}

}
