package org.ntuhpi.task6;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();

        users.put("user1", "password123");
        users.put("user2", "securepass");
        users.put("user3", "longerpassword");
        users.put("user4", "short");

        System.out.println("Користувачі з паролем довжиною більше 6 символів:");
        for (Map.Entry<String, String> entry : users.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();
            if (password.length() > 6) {
                System.out.println("Ім'я користувача: " + username + ", Пароль: " + password);
            }
        }
    }
}

