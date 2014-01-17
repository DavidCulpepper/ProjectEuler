package com.example.app;

/**
 * Created by dculpepper on 1/15/14.
 */
public class EulerProblemDescription {
    private final String title;
    private final String description;

    public EulerProblemDescription(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
