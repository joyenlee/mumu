package lyy.mumu.user.mapper;

import org.springframework.stereotype.Repository;

import lyy.mumu.user.entity.User;

@Repository
public interface UserMapper {

	User getUser(long id);
}
