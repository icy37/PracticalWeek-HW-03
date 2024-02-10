package ru.sf.practicalweek.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.sf.practicalweek.entity.Income;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class IncomeRepositoryTest {

    @Autowired
    private IncomeRepository incomeRepository;

    @Test
    public void testRepo() {
        // Добавляем недостающие записи, чтобы общее количество стало равным 10
        for (long i = incomeRepository.count(); i < 10; i++) {
            incomeRepository.save(new Income());
        }
        // Получаем обновленный список всех записей
        List<Income> found = incomeRepository.findAll();
        // Выводим список на консоль
        System.out.println("\n########################\n");
        found.forEach(System.out::println);
        System.out.println("\n########################\n");
        // Проверяем, что общее количество записей равно 10
        assertEquals(10, found.size());
    }
}