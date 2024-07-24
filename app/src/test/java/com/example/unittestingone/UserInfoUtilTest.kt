package com.example.unittestingone

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class UserInfoUtilTest{

    @Test
    fun `empty username returns false`(){
        val userInfoUtil = UserInfoUtil()
        val result = userInfoUtil.checkUserInput(
            "",
            "Nathan",
            12,
            "Sandstone",
            "123",
            "123"
            )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and valid information`(){
        val userInfoUtil = UserInfoUtil()
        val result = userInfoUtil.checkUserInput(
            "Jonathan",
            "Nathan",
            12,
            "Sandstone",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `the confirmPassword is not the same as password`(){
        val userInfoUtil = UserInfoUtil()
        val result = userInfoUtil.checkUserInput(
            "Jeffery",
            "Nathan",
            12,
            "Sandstone",
            "123",
            "123555555"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits`(){
        val userInfoUtil = UserInfoUtil()
        val result = userInfoUtil.checkUserInput(
            "Josia",
            "Nathan",
            12,
            "Sandstone",
            "12",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly`(){
        val userInfoUtil = UserInfoUtil()
        val result = userInfoUtil.checkUserInput(
            "Jason",
            "Nathan",
            12,
            "Sandstone",
            "123",
            "123789876766"
        )
        assertThat(result).isFalse()
    }
}