package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class AController {

  @GetMapping
  public String sayHello() {
    return "Hello Service A";
  }
}
