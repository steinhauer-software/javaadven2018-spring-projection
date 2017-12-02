package software.steinhauer.springprojectiondemo.user;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserService {

	@Inject
	private UserRepository repository;

	public List<User> getAllUser() {
		return repository.findAll();
	}
}
