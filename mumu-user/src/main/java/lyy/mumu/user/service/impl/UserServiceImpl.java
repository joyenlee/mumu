package lyy.mumu.user.service.impl;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import lyy.mumu.user.entity.User;
import lyy.mumu.user.mapper.UserMapper;
import lyy.mumu.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		Long id = 1L;
		String sql = "select id from user where id = " + id;
		User user = jdbcTemplate.queryForObject(sql, (ResultSet rs, int rownum) -> {
			User result = new User();
			result.setId(rs.getLong("id"));
			return result;
		});
		System.out.println("User id: " + user.getId());
		
		User user1 = userMapper.getUser(1);
		System.out.println("User1 id: " + user1.getId());
		return false;
	}

}
