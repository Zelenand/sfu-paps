package org.example;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class UserController {
  UserFactory userFactory;
  UserDataRepository userDataRepository;

  public UserController(UserFactory userFactory, UserDataRepository userDataRepository) {
    this.userFactory = userFactory;
    this.userDataRepository = userDataRepository;
  }

  public void registerUser(Object userData) {
    User user = userFactory.createUser(userData);
    // Работа с userDataRepository
  }

  public User getUser() {
    // Работа с userDataRepository
    return null;
  }

  public List<User> getUsers() {
    // Работа с userDataRepository
    return null;
  }

  public void sendConfirmationEmail(User user){
    //работа с EmailSystem
    //EmailSystem.sendEmail();
  }

  public void sendPasswordRestorationEmail(User user){
    //работа с EmailSystem
  }
}
