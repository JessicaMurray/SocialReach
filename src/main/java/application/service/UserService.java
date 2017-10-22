package application.service;

import application.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
   public void createUser(User user)
   {
      //Todo: Call Database Here
      System.out.print(user.getUsername());
   }
}
