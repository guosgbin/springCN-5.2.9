package cn.guosgbin.bean_property;

public class UserServiceImpl {
	private UserDao userDao;
	private UserAccountDao userAccountDao;
	private String name;

	public String getUser() {
		return userDao.getUser();
	}

	public String getUserAccount() {
		return userAccountDao.getUserAccount();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setUserAccountDao(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

	public void setName(String name) {
		this.name = name;
	}
}
