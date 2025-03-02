package com.example.demobmp.loan;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SendResultDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        boolean approved = (boolean) execution.getVariable("cicApproved");
        String result = approved ? "Loan Approved" : "Loan Rejected";
        System.out.println("Sending result to customer: " + result);
    }
}
