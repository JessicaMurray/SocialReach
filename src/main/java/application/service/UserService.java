package application.service;

import application.models.Blog;
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

   public void addBlog(Blog blog, String id)
   {
      User user = getUserById(id);
      user.addBlog(blog);
      //Todo: Call Database Here
   }

   public User getUserById(String id)
   {
      //Todo get User by id;
      return new User();
   }
}
