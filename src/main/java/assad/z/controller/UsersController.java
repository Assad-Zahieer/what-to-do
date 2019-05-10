package assad.z.controller;


import assad.z.model.User;
import assad.z.repository.UsersRepositry;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class UsersController {
    @RequestMapping(value = "users", method = RequestMethod.GET)
    private List<User> list() {
        return usersRepositry.findAll();
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.POST)
    public User get(@PathVariable Long id) {
        return usersRepositry.findOne(id);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id, @RequestBody User user) {
        User existingUser = usersRepositry.findOne(id);
        BeanUtils.copyProperties(user, existingUser);
        return usersRepositry.saveAndFlush(user);
    }

    @RequestMapping(value = "Users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id){
        User existingUser = usersRepositry.findOne(id);
        usersRepositry.delete(existingUser);
        return existingUser;
    }

    @RequestMapping(value ="users", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return usersRepositry.saveAndFlush(user);
    }


    @Autowired
    private UsersRepositry usersRepositry;


}