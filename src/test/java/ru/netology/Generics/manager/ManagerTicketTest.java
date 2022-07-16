package ru.netology.Generics.manager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.Generics.ticket.Ticket;
import ru.netology.Generics.repo.Repository;

import java.util.Arrays;

public class ManagerTicketTest {
    Repository repo = new Repository();
    ManagerTicket ticket = new ManagerTicket(repo);

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
    public void findAllMinTicket() {
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        Ticket[] actual = ticket.findAll("Москва", "Савтывкар");
        Ticket[] expected = {
                ticket3
        };


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addAllMaxTicket() {
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket13);
        ticket.add(ticket4);
        ticket.add(ticket5);
        ticket.add(ticket6);
        ticket.add(ticket7);
        ticket.add(ticket8);
        ticket.add(ticket9);
        ticket.add(ticket10);
        ticket.add(ticket11);
        ticket.add(ticket12);
        ticket.add(ticket3);

        Ticket[] actual = ticket.findAll("Москва", "Савтывкар");
        Ticket[] expected = {
                ticket4,
                ticket6,
                ticket3,
                ticket13,
                ticket11
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllFromTicket() {
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        Ticket[] actual = ticket.findAll("Москва", "");
        Ticket[] expected = {
                ticket1,
                ticket2,
                ticket3
        };


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findAllToTicket() {
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        Ticket[] actual = ticket.findAll("", "Самара");
        Ticket[] expected = {
                ticket1,

        };


        Assertions.assertArrayEquals(expected, actual);

    }
}
