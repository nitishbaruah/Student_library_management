package Nitish.Student_library_management_system.Respositories;

import Nitish.Student_library_management_system.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions,Integer> {
}
