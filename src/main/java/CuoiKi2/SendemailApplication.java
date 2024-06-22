package CuoiKi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendemailApplication {
    @Autowired
    private SendEmail senderservice;
	public static void main(String[] args) {
		SpringApplication.run(SendemailApplication.class, args);
	}
        
        @EventListener(ApplicationReadyEvent.class)
        public void sendmail() {
            senderservice.send(GetEmailSender.emailadd,"Email Verification",Integer.toString(GetEmailSender.otp));
        }
}