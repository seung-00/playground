package org.playground.interfaces.user

import org.playground.domain.user.User

data class UserResponse(
  val id: Long,
  val name: String,
  val email: String
)

fun User.toResponse(): UserResponse = UserResponse(
  id = this.id,
  name = this.name,
  email = this.email
)
