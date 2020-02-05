package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User person = null;
        for (int i = 0; i < users.length; ++i) {
            if (users[i] != null && users[i].getUsername().equals(login)) {
                person = users[i];
                break;
            }
            if (users[i] != null && i == users.length - 1) {
                throw new UserNotFoundException("This user do not exist");
            }
        }
        return person;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("This username is invalid.");
        } else {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        User[] users = {new User("A.", true), new User("Vovan", false),
                new User ("Ardalion Ivolgin", true)};
        try {
            User user = findUser(users, "Vovan");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uIe) {
            System.out.println(uIe.getMessage());
        } catch (UserNotFoundException uNf) {
            System.out.println(uNf.getMessage());
        }

    }
}
