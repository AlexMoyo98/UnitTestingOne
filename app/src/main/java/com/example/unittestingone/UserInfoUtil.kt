package com.example.unittestingone

class UserInfoUtil {

    private val existingUsers = listOf("Alex", "Moyo")

    /**
     * the input is not valid if..
     * the username is already taken
     * the surname is empty
     * the location is empty
     * the age is empty
     * the confirmed password is not the same as real password
     * the password contains less than 2 digits
     */

    fun checkUserInput(
        username: String,
        surname: String,
        age: Int,
        location: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}