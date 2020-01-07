package creditAuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import creditAuto.model.Role;
import creditAuto.model.User;
import creditAuto.services.UserService;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Role isAthenticated(@RequestBody User user) {

		if (userService.isUserInDbWithGoodPassword(user) != null) {
			return userService.isUserInDbWithGoodPassword(user).getRole();
		} else {
			return null;
		}
	}
}
