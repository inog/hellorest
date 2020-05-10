package app.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping()
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "50") int limit,
                           @RequestParam(value = "sort", defaultValue = "asc", required = false) String sort) {
        return "getUser was called with page = " + page + " limtt = " + limit + " sort = " + sort;
    }

    @GetMapping(path = "/{userId}",
            produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
        UserRest user = UserRest.builder()
                .firstName("Ingo")
                .lastName("Test")
                .email("test@test.de")
                .userId("007")
                .build();
        return new ResponseEntity<UserRest>(user, HttpStatus.OK);
    }

    @PostMapping
    public String createUser() {
        return "createUser was called";
    }

    @PutMapping
    public String updateUser() {
        return "updateUser was called";
    }

    @DeleteMapping(path = "/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "deleteUser with id = " + userId + " was called";
    }
}
