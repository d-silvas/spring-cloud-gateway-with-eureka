package blog.cybertricks.examples.usersservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public ResponseEntity<List<String>> getAllUsers() {
        List<String> allUsers = Arrays.asList("John", "Mary" );
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }
}
