package com.example.demobmp.loan;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanApprovalController {
    private final RuntimeService runtimeService;

    public LoanApprovalController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping("/apply")
    public ResponseEntity<String> startLoanApprovalProcess() {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("loanApprovalProcess");
        return ResponseEntity.ok("Loan Approval Process Started: " + processInstance.getId());
    }
}
