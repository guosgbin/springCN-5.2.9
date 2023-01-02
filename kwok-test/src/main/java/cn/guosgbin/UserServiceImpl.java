package cn.guosgbin;

public class UserServiceImpl implements UserService{
	@Override
	public User getUserById(Integer id) {
		User user = new User();
		user.setName("珺珺");
		user.setAge(25);
		return user;
	}
}
