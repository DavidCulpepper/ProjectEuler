package net.davidculpepper.euler.models;

import net.davidculpepper.euler.models.solutions.LargestPrimeFactor;
import net.davidculpepper.euler.models.solutions.MultiplesOfThreeAndFive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true
)
public class ModelModule {
    @Provides
    @Singleton
    public List<Problem> provideProblems() {
        return new ArrayList<Problem>() {{
            add(new MultiplesOfThreeAndFive());
            add(new LargestPrimeFactor());
        }};
    }
}