package ru.sf.practicalweek.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.sf.practicalweek.entity.Spend;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class SpendRepositoryTest {
    @Autowired
    private SpendRepository spendRepository;

    @Test
    public void testRepo() {
        // Получаем список всех записей до начала теста
        List<Spend> found = spendRepository.findAll();
        // Добавляем недостающие записи, чтобы общее количество стало равным 10
        for (int i = found.size(); i < 10; i++) {
            spendRepository.save(new Spend());
        }
        // Получаем обновленный список всех записей
        found = spendRepository.findAll();
        // Выводим список на консоль
        System.out.println("\n########################\n");
        found.forEach(System.out::println);
        System.out.println("\n########################\n");
        // Проверяем, что общее количество записей равно 10
        assertEquals(10, found.size());
    }
}
