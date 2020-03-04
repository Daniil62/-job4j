package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
    public List<Address> sortAddress(List<Profile> profiles) {
        List<Address> addresses = collect(profiles);
        return addresses.stream().sorted(new AddressSortByCity()).distinct().collect(Collectors.toList());
    }
}
