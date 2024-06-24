package org.playground.interfaces.user

import org.playground.application.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
  private val userService: UserService
) {

  @GetMapping("/users")
  fun getUsers(): List<UserResponse> {
    return userService.getUsers().map { it.toResponse() }
  }
}
