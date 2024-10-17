package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Services.IUserService;

import java.util.List;

@RestController // Pour définir la classe comme un bean Spring
@AllArgsConstructor // Pour assurer l'ID (Injection de dépendance par constructeur)
@RequestMapping("UserRestController") // Pour personnaliser l'accès à ce RestController
public class UserRestController {

    IUserService userService;

    @PostMapping("add")
    User add(@RequestBody User user){
        return userService.add(user);
    }
    @PostMapping("addAll")
    List<User> addAll(@RequestBody List<User> users){
        return userService.addAll(users);
    }
    @PutMapping("update")
    User update(@RequestBody User user){
        return userService.update(user);
    }
    @PutMapping("updateAll")
    List<User> updateAll(@RequestBody List<User> users){
        return userService.updateAll(users);
    }
    @GetMapping("selectById")
    User selectById(@RequestParam int id){
        return userService.selectById(id);
    }
    @GetMapping("selectAll")
    List<User> selectAll(){
        return userService.selectAll();
    }
    @DeleteMapping("delete")
    void delete(@RequestBody User user){
        userService.delete(user);
    }
    @DeleteMapping("deleteById")
    void deleteById(int id){
        userService.deleteById(id);
    }
    @DeleteMapping("deleteAll2")
    void deleteAll(@RequestBody List<User> users){
        userService.deleteAll(users);
    }
    @DeleteMapping("deleteAll")
    void deleteAll(){
        userService.deleteAll();
    }
    @GetMapping("count")
    long count(){
        return userService.count();
    }


}
