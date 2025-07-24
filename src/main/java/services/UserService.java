package services;

import exceptions.InvalidAgeException;
import models.User;

public class UserService {
    public void registerUser(User user) throws InvalidAgeException {

        if (user.getAge() < 18) {
            throw new InvalidAgeException("User should be 18 or above to register\n");
        }

        System.out.println("User " + user.getUserName() + " regsitered successfully");
    }
}
