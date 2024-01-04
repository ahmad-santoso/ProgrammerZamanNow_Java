package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "Rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("Data null : " + exception.getMessage());
        } finally {
            System.out.println("Error gak error akan di ekseskusi / Selalu dieksekusi");
        }
        /**
         * catch (ValidationException | NullPointerException exception) {
         *   System.out.println("Data tidak valid : " + exception.getMessage());
         *
         *   ganti username dengan (null), diatas contoh exception 1 atau 2 penganganan yang sama
         */

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
