package ru.sf.practicalweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sf.practicalweek.entity.Income;


@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
