package org.rechvs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = {"/api"})
@RestController
public class TestController {

  @GetMapping("/string")
  public String getString() {
    return "test";
  }
}
