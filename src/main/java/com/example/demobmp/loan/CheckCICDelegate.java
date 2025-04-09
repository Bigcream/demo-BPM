package com.example.demobmp.loan;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import java.security.SecureRandom;
import java.util.Random;

@Component
public class CheckCICDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
//        int cicScore = new SecureRandom().nextInt();
        int cicScore = new Random().nextInt(900);  // Giả lập điểm CIC ngẫu nhiên
        boolean approved = cicScore > 600;  // Điều kiện phê duyệt
        execution.setVariable("cicApproved", approved);
        System.out.println("Checked CIC Score: " + cicScore + " | Approved: " + approved);
        System.out.println("test new sonar rule");
    }
}
