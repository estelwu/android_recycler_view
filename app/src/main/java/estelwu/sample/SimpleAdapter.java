package estelwu.sample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter {

    private List<SimpleItemEntity> models = new ArrayList<>();

    public SimpleAdapter(List<SimpleItemEntity> models) {
        if (models != null) {
            this.models.addAll(models);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.simple_item, viewGroup, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        final SimpleViewHolder vh = ((SimpleViewHolder) viewHolder);
        vh.bindItemData(models.get(i));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
