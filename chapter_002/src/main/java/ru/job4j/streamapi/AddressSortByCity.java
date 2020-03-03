package ru.job4j.streamapi;

import java.util.Comparator;

public class AddressSortByCity implements Comparator<Address> {
    @Override
    public int compare(Address o1, Address o2) {
        int result = o1.getCity().compareTo(o2.getCity());
        if (result == 0) {
            result = o1.getStreet().compareTo(o2.getStreet());
            if (result == 0) {
                result = Integer.compare(o1.getHome(), o2.getHome());
            }
        }
        return  result;
    }
}
