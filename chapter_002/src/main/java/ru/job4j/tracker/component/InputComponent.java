package ru.job4j.tracker.component;

import dagger.Component;
import ru.job4j.tracker.CalcSum;
import ru.job4j.tracker.module.InputModule;
import ru.job4j.tracker.module.OutputModule;

@Component(modules = {InputModule.class, OutputModule.class})
public interface InputComponent {
    CalcSum instance();
}
