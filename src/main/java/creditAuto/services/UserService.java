package creditAuto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import creditAuto.dao.UserDAO;
import creditAuto.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public User findByUsername (String username) {
		 return userDAO.findByUsername(username);
	}
	
	public User isUserInDbWithGoodPassword(@RequestBody User user) {
		User userDansAngular = user;
		User userDansLaDb = findByUsername(user.getUsername());

		if (findByUsername(user.getUsername()) != null) {
			System.out.println(userDansLaDb);
			if (userDansLaDb.getPassword().equals(userDansAngular.getPassword())) {
				System.out.println("Meme password et meme username");
				return userDansLaDb;
			} else {
				System.out.println("Pas le meme password");
				return null;
			}
		} else {
			System.out.println("Pas de user avec username");
			return null;
		}
	}

}
