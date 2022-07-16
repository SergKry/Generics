package ru.netology.Generics.repo;

import ru.netology.Generics.ticket.Ticket;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RepositoryTest
{
    Repository repo = new Repository();


    Ticket ticket1 = new Ticket(9000, "Москва", "Самара", 130, 5);
    Ticket ticket2 = new Ticket(9200, "Москва", "Саратов", 140, 10);
    Ticket ticket3 = new Ticket(10200, "Москва", "Савтывкар", 130, 20);
    Ticket ticket4 = new Ticket(1099, "Москва", "Савтывкар", 170, 30);
    Ticket ticket5 = new Ticket(9025, "Питергоф", "Нижневатервск", 130, 35);
    Ticket ticket6 = new Ticket(9300, "Москва", "Савтывкар", 110, 40);
    Ticket ticket7 = new Ticket(9100, "Самара", "Саратов", 111, 50);
    Ticket ticket8 = new Ticket(9200, "Москва", "ВГ", 130, 51);
    Ticket ticket9 = new Ticket(1100, "Москва", "Нижневатервск", 175, 560);
    Ticket ticket10 = new Ticket(9300, "Архангельск", "Мурманск", 130, 54);
    Ticket ticket11 = new Ticket(18100, "Москва", "Савтывкар", 90, 23);
    Ticket ticket12 = new Ticket(19100, "Москва", "Иркутск", 130, 21);
    Ticket ticket13 = new Ticket(10250, "Москва", "Савтывкар", 190, 212);

    @Test
    public void removeByIdRepository() {
        repo.add(ticket1);
        repo.add(ticket13);
        repo.add(ticket10);
        repo.removeById(54);

        Ticket[] actual = repo.getAll();
        Ticket[] expected = {
                ticket1,
                ticket13

        };
        Assertions.assertArrayEquals(expected, actual);
    }
}
