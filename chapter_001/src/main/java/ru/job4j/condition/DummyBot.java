package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "";
        if (question.equals("Привет, бот.")) {
            rsl = "Здорова, умник.";
        } else if (question.equals("Пока.")) {
            rsl = "До встречи.";
        } else {
            rsl = "Я не догоняю о чем ты, спроси что-нибудь полегче.";
        }
        System.out.println(question);
        return rsl;
    }
    public static void main(String[] args) {
        System.out.println(DummyBot.answer("Привет, бот."));
        System.out.println(DummyBot.answer("Когда дрель вернешь?"));
        System.out.println(DummyBot.answer("Пока."));
    }
}
