package Nitish.Student_library_management_system.Respositories;

import Nitish.Student_library_management_system.Models.CardId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardIdRepository extends JpaRepository<CardId,Integer> {
}
