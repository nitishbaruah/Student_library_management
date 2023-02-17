package Nitish.Student_library_management_system.Controllers;

import Nitish.Student_library_management_system.DTOs.IssueBookDTO;
import Nitish.Student_library_management_system.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/issueBook")
    public String issueBook(@RequestBody() IssueBookDTO issueBookDTO)throws Exception {
        return transactionService.issueBook(issueBookDTO);
    }

}
