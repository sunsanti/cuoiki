/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuoiKi2;

import javax.swing.JOptionPane;
import org.springframework.boot.SpringApplication;

/**
 *
 * @author wincu
 */
public class GetEmailSender {
    static int otp;
    public static String emailadd;
    public GetEmailSender(String emailadd1, int otp1) {
        otp = otp1;
        emailadd = emailadd1;
        SpringApplication.run(SendemailApplication.class, new String [0]);
        JOptionPane.showMessageDialog(null, "OTP Sent, Please check your email for the OTP");
    }
}
