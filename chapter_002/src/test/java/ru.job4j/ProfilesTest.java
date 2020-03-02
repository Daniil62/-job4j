package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.streamapi.Address;
import ru.job4j.streamapi.Profile;
import ru.job4j.streamapi.Profiles;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void checkProfiles() {
        Address address1 = new Address("Leningrad", "Third builders st.", 25, 12);
        Address address2 = new Address("Moscow", "Third builders st.", 25, 12);
        List<Profile> list = Arrays.asList(new Profile(address1), new Profile(address2));
        Profiles profiles = new Profiles();
        Assert.assertThat(profiles.collect(list).get(0), is(address1));
        Assert.assertThat(profiles.collect(list).get(1), is(address2));
    }
}
