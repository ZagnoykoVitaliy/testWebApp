package service;

import exception.ValidationException;

public class LoginService {

    public void login(String login, String password) throws ValidationException {
        if (!"admin".equals(login)){
            throw new ValidationException("Login not found");
        }
        if (!"admin".equals(password)){
            throw new ValidationException("Password not valid");
        }


    }
}
