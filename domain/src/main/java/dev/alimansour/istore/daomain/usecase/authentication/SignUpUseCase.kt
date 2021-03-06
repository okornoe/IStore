package dev.alimansour.istore.daomain.usecase.authentication

import dev.alimansour.istore.daomain.repository.AuthenticationRepository

/**
 * IStore Android Application developed by: Ali Mansour
 * Copyright © 2020 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- IStore IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
class SignUpUseCase(private val repository: AuthenticationRepository) {
    fun execute(fullName: String, email: String, password: String): Boolean =
        repository.signUp(fullName, email, password)
}