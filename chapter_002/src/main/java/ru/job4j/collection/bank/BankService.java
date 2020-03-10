package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (account != null && user != null) {
            users.get(user).add(account);
        }
    }
    public User findByPassport(String passport) {
        return users.keySet().stream().filter(accounts -> accounts.getPassport().equals(passport))
                .findAny().orElse(null);
    }
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account result = null;
        if (user != null) {
            result = users.get(findByPassport(passport)).stream().filter(a -> a.getRequisite().equals(requisite))
                    .findAny().orElse(null);
        }
        return result;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srsAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srsAcc != null && destAcc != null) {
            double donate = srsAcc.getBalance();
            double gain = destAcc.getBalance();
            if (donate >= amount) {
                donate = donate - amount;
                gain = gain + amount;
                srsAcc.setBalance(donate);
                destAcc.setBalance(gain);
                rsl = true;
            }
        }
        return rsl;
    }
}
