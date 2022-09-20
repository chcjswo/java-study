package com.mocadev.oop.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-21
 **/
class PasswordValidationTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12 이하면 예외가 발생하지 않는다.")
    @Test
    void passwordLengthTest() {
        assertThatCode(() -> PasswordValidation.validate("testestest"))
            .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 최소 8자 이상, 12 이하면 예외가 발생하지 않는다.")
    @ParameterizedTest
    @ValueSource(strings = {"testtest", "testetstes"})
    void passwordLength2Test(String password) {
        assertThatCode(() -> PasswordValidation.validate(password))
            .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("비밀번호 exception 발생")
    void exceptionTest() {
        assertThatCode(() -> PasswordValidation.validate("1234123412341234"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("error");
    }

}
