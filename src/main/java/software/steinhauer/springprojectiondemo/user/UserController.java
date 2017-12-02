package software.steinhauer.springprojectiondemo.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class UserController {

	@Inject
	private UserService userService;

	@GetMapping(name = "/user")
	public ResponseEntity<List<User>> allUsers() {
		return ResponseEntity.ok(userService.getAllUser());
	}
}
