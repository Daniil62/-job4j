package ru.job4j;

import org.junit.Test;
import ru.job4j.collection.bank.Account;
import ru.job4j.collection.bank.BankService;
import ru.job4j.collection.bank.User;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150.0));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    @Test
    public void findByPassport() {
        BankService bs = new BankService();
        User user = new User("123456", "Iogann");
        bs.addUser(user);
        assertThat(bs.findByPassport("123456"), is(user));
    }

    @Test
    public void findByRequisite() {
        BankService bs = new BankService();
        User user = new User("123456", "Iogann");
        Account account = new Account("A0000A", 100000.0);
        bs.addUser(user);
        bs.addAccount(user.getPassport(), account);
        assertThat(bs.findByRequisite("123456", "A0000A"), is(account));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 1500.0));
        bank.addAccount(user.getPassport(), new Account("113", 500.0));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 1500.0);
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(2000.0));
    }
}

