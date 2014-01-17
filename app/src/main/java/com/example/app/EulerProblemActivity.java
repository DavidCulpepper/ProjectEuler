package com.example.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.OnClick;

/**
 * Created by dculpepper on 1/17/14.
 */
public class EulerProblemActivity extends Activity {

    public static final String EXTRA_PROBLEM_NUMBER = "problem_number";

    public static Intent createIntent(Context context, int position) {
        Intent intent = new Intent(context, EulerProblemActivity.class);
        intent.putExtra(EXTRA_PROBLEM_NUMBER, position);
        return intent;
    }

    private int problemNumber;
    private EulerProblemModel model;
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        problemNumber = getIntent().getIntExtra(EXTRA_PROBLEM_NUMBER, -1);
        if (problemNumber == -1) throw new IllegalArgumentException("Please use createIntent");

        model = new EulerProblemModel();
    }

    @OnClick(R.id.solve)
    public void onSolveClicked() {
        switch (problemNumber) {
            case 0:
                int result = model.greatestPrimeFactor(input.getText().toString());
                output.setText(String.valueOf(result));
                break;
        }


    }
}
