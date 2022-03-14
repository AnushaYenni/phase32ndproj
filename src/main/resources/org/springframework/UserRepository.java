package org.springframework;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.UserManager.entities.User;
@Repository
public class UserRepository extends CrudRepository<User, Integer> {
	public User findByName(String name);
	}



