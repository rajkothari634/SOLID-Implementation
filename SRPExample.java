// Single Responsibility Principle (SRP)

class UserRepository {
    public void save(String username, String password) {
        System.out.println("User saved to DB.");
    }
}

class EmailService {
    public void sendConfirmation(String email) {
        System.out.println("Confirmation email sent to " + email);
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