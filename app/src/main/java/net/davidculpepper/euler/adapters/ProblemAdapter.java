package net.davidculpepper.euler.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.davidculpepper.euler.R;
import net.davidculpepper.euler.models.Problem;
import net.davidculpepper.euler.views.ProblemSummaryView;

import java.util.List;

public class ProblemAdapter extends BindableListAdapter<Problem> {

    public ProblemAdapter(Context context, List<Problem> items) {
        super(context, items);
    }

    @Override
    public View createView(LayoutInflater inflater, int position, ViewGroup parent) {
        View view = inflater.inflate(R.layout.list_item_problem, parent, false);
        return view;
    }

    @Override
    public void bindView(Problem item, int position, View view) {
        ProblemSummaryView summary = (ProblemSummaryView) view;
        summary.bind(item);
    }
}