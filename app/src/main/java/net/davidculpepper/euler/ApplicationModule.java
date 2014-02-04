package net.davidculpepper.euler;

import net.davidculpepper.euler.activities.ProblemActivity;
import net.davidculpepper.euler.activities.ProblemListActivity;
import net.davidculpepper.euler.models.ModelModule;

import dagger.Module;

@Module(
        injects = {
                ProblemActivity.class,
                ProblemListActivity.class
        },
        includes = {
                ModelModule.class
        }
)
public class ApplicationModule {
}