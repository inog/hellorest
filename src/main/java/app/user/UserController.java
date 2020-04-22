package app.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping()
    public String getUsers(@RequestParam(value="page") int page,
                           @RequestParam(value="limit") int limit){
        return "getUser was called with page = " + page + " limtt = " + limit;
    }

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){
        return "getUser was called with userId "+ userId;
    }

    @PostMapping
    public String createUser(){
        return "createUser was called";
    }

    @PutMapping
    public String updateUser(){
        return "updateUser was called";
    }

    @DeleteMapping(path = "/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "deleteUser with id = " + userId + " was called";
    }
}
