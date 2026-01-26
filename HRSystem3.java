package pratices.index;

class HRSystem3 {

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "Registration failed: Employee must be at least 18 years old."
            );
        }
        System.out.println("Registration successful.");
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            validateAge(age);
            System.out.println("Further HR process started...");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
