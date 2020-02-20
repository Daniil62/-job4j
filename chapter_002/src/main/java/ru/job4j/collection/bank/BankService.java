package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (user.getPassport().equals(passport) && !users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }
    public User findByPassport(String passport) {
        User person = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                person = user;
            }
        }
        return person;
    }
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account srsAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, dеstRequisite);
        if (srsAcc != null && destAcc != null) {
            double donate = srsAcc.getBalance();
            double gain = destAcc.getBalance();
            if (donate >= amount) {
                srsAcc.setBalance(donate -= amount);
                destAcc.setBalance(gain += amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
