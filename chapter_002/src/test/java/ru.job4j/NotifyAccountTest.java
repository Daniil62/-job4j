package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.Account;
import ru.job4j.collection.NotifyAccount;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001"));
        HashSet<Account> expect = new HashSet<>(Arrays.asList(new Account
                        ("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")));
        Assert.assertThat(NotifyAccount.sent(accounts), is(expect));
    }
    @Test
    public void whenSentRepeated() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Ivan Ivanov", "10000001"),
                new Account("123", "Ivan Ivanov", "00111000"),
                new Account("123", "Ivan Ivanov", "01001000"),
                new Account("987", "Petr Petrov", "00010010"),
                new Account("234", "Ivan Ivanov", "11000110"),
                new Account("345", "Petr Petrov", "01001010"));
        Assert.assertThat(NotifyAccount.sent(accounts).size(), is(4));
    }
}
