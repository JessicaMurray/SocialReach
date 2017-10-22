package application.controller;

import application.models.Blog;
import application.models.User;
import application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class BlogController
{
   @RequestMapping(value = "api/{id}/blog", method = POST)
   @ResponseBody
   public String newBlog (@PathVariable String id, @RequestBody Blog blog)
   {
      userService.addBlog(blog, id);
      return "Success";
   }
   @Autowired
   private UserService userService;
}
