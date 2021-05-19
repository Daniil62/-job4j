package ru.job4j.tracker.module;

import dagger.Module;
import dagger.Provides;
import ru.job4j.tracker.Output;

@Module
public class OutputModule {
    @Provides
    public static Output provideOutput() {
        return new Output();
    }
}
