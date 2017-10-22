package application.controller;

import application.models.User;
import application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class UserController
{
   @RequestMapping(value = "api/user", method = POST)
   @ResponseBody
   public String newUser(@RequestBody User user)
   {
     return userService.createUser(user);
   }

   @Autowired
   private UserService userService;
}
