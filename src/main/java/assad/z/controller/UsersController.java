package assad.z.controller;


import assad.z.model.User;
import assad.z.repository.UsersRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v2")
public class UsersController {
//    @RequestMapping(value = "users", method = RequestMethod.GET)
//    private List<User> list() {
//        return usersRepository.findAll();
//    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.POST)
    public User get(@PathVariable Long id) {
        return usersRepository.findOne(id);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id, @RequestBody User user) {
        User existingUser = usersRepository.findOne(id);
        BeanUtils.copyProperties(user, existingUser);
        return usersRepository.saveAndFlush(user);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id){
        User existingUser = usersRepository.findOne(id);
        usersRepository.delete(existingUser);
        return existingUser;
    }

    @RequestMapping(value ="users", method = RequestMethod.POST)
    public User create(@RequestBody User user, BindingResult bindingResult, ModelMap modelMap){
        if(bindingResult.hasErrors()){

        }
        return usersRepository.saveAndFlush(user);
    }

    @RequestMapping(value = "users/{email}/{password}", method = RequestMethod.GET)
    public Long validation(@PathVariable String email, @PathVariable String password){
        System.out.println(email);
        List<User> emailList = usersRepository.findByEmail(email);
        for (User user:emailList){
            if(user.getPassword().equals(password)){
                return user.getUser_id();
            }
        }
        return (long) 0;

    }






    @Autowired
    private UsersRepository usersRepository;


}