package application.service;

import application.models.Blog;
import application.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{
   public String createUser(User user)
   {
      //Todo: Call Database Here
      mockusers.add(user);
      return user.getId().toString();
   }

   public void addBlog(Blog blog, String id)
   {
      User user = getUserById(id);
      user.addBlog(blog);
      //Todo: Call Database Here
      System.out.print(mockusers.get(0));
   }

   public User getUserById(String id)
   {
      for(User user: mockusers)
      {
         if (user.getId().toString().equals(id))
            return user;
      }
      return null;
   }

   public List<User> mockusers = new ArrayList<>();
}
