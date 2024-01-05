package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Anto");
        request.setPassword("Anto");
        request.setName("Anto");
        ValidationUtil.validationReflection(request);
    }
}
