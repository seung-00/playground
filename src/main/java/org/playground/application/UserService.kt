package org.playground.application

import org.playground.domain.user.User
import org.playground.domain.user.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
  private val userRepository: UserRepository,
) {
  fun getUsers(): List<User> {
    return userRepository.findAll();
  }
}
