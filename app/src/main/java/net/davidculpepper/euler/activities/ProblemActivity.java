package net.davidculpepper.euler.activities;

import android.app.Activity;
import android.os.Bundle;

import net.davidculpepper.euler.EulerApplication;
import net.davidculpepper.euler.R;
import net.davidculpepper.euler.intents.ProblemIntent;
import net.davidculpepper.euler.models.Problem;
import net.davidculpepper.euler.views.ProblemView;

import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ProblemActivity extends Activity {

    @InjectView(R.id.content) ProblemView content;

    @Inject List<Problem> problems;
    private ProblemIntent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        ButterKnife.inject(this);
        EulerApplication.inject(this);
        intent = new ProblemIntent(getIntent());
        Problem model = problems.get(intent.getPosition());
        getActionBar().setTitle(model.getSummary());
        content.bind(model);
    }
}