package estelwu.sample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.like.LikeButton;
import com.like.OnLikeListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.default_textview)
    TextView textView;

    @BindView(R.id.default_btn)
    LikeButton btn;


    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);

        btn.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                System.out.println(String.format("===========%d %d like", getPosition(), getAdapterPosition()));
            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });
    }

    public void bindItemData(SimpleItemEntity model) {
        textView.setText(model.getDefaultText());


    }

}
