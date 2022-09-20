package com.mocadev.oop.tdd;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-21
 **/
public class PasswordValidation {

    public static void validate(String password) {
        int length = password.length();
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("error");
        }
    }
}
