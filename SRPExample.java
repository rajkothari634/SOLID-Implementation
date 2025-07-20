// ✅ SINGLE RESPONSIBILITY PRINCIPLE (SRP)
// A class should have only one reason to change.

//// ❌ Bad Example: This class does too much — user management AND email notification
class BadUserService {
    public void registerUser(String username, String password) {
        // 1. Save user to DB
        System.out.println("Saving user: " + username);

        // 2. Send confirmation email
        System.out.println("Sending confirmation email to: " + username);
    }
}

//// ✅ Good Example: Each class has a single responsibility

class UserRepository {
    public void save(String username, String password) {
        System.out.println("User saved: " + username);
    }
}

class EmailService {
    public void sendConfirmation(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}

class UserRegistrationService {
    private UserRepository userRepository;
    private EmailService emailService;

    public UserRegistrationService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void register(String username, String password) {
        userRepository.save(username, password);
        emailService.sendConfirmation(username);
    }
}
