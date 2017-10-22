package application.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class User
{
   private String email;
   private String username;
   private String password;
   @JsonIgnore
   private List<Blog> blogs;

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getUsername()
   {
      return username;
   }

   public void setUsername(String username)
   {
      this.username = username;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public List<Blog> getBlogs()
   {
      return blogs;
   }

   public void setBlogs(List<Blog> blogs)
   {
      this.blogs = blogs;
   }
}
