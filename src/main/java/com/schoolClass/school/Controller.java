package com.schoolClass.school;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class Controller {

    @RequestMapping("/hello")
   public StudentClass studentClass(@RequestParam(value = "name", defaultValue = "nie pykło") String str) throws IOException {
        return new StudentClass(str);
    }
}
