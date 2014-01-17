package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by dculpepper on 1/15/14.
 */
public class EulerProblemAdapter extends ArrayAdapter<EulerProblemDescription> {
    public EulerProblemAdapter(Context context, List<EulerProblemDescription> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_problem, parent, false);
            convertView.setTag(new ViewHolder(convertView));
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.bind(getItem(position));

        return convertView;
    }

    private static class ViewHolder {
        @InjectView(R.id.title) TextView title;
        @InjectView(R.id.description) TextView description;

        public ViewHolder(View root) {
            ButterKnife.inject(this, root);
        }

        public void bind(EulerProblemDescription item) {
            title.setText(item.getTitle());
            description.setText(item.getDescription());
        }
    }
}
