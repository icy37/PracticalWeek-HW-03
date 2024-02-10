package ru.sf.practicalweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sf.practicalweek.entity.Spend;


@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}