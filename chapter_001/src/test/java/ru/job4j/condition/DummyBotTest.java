package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void answer() {
        String in = "Привет, бот.";
        String expected = "Здорова, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void answer2() {
        String in2 = "2х2?";
        String expected2 = "Я не догоняю о чем ты, спроси что-нибудь полегче.";
        String out2 = DummyBot.answer(in2);
        Assert.assertEquals(expected2, out2);
    }
    @Test
    public void answer3() {
        String in3 = "Пока.";
        String expected3 = "До встречи.";
        String out3 = DummyBot.answer(in3);
        Assert.assertEquals(expected3, out3);
    }
}
