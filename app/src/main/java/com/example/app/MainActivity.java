package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by dculpepper on 1/8/14.
 */
public class MainActivity extends Activity {

    @InjectView(android.R.id.list) ListView listView;

    private List<EulerProblemDescription> items = new ArrayList<EulerProblemDescription>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.inject(this);

        items.add(new EulerProblemDescription("Problem 1", "Greatest Prime Factor"));
        items.add(new EulerProblemDescription("Problem 5", "Least Common Multiple"));

        listView.setAdapter(new EulerProblemAdapter(this, items));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClicked(position);
            }
        });
    }

    private void onListItemClicked(int position) {

    }
}
