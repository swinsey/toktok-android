package im.tox.toktok.app.simple_dialogs;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import im.tox.toktok.R;

public final class SimpleColorDialogDesignAdapter extends RecyclerView.Adapter<SimpleColorDialogDesignViewHolder> {

    private static final Logger logger = LoggerFactory.getLogger(SimpleColorDialogDesignAdapter.class);
    private final List<String> items;

    public SimpleColorDialogDesignAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public SimpleColorDialogDesignViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        CardView itemView = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.simple_color_dialog_item, viewGroup, false);

        itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                logger.debug("adsd");
                v.setZ(1000.0f);
            }
        });

        return new SimpleColorDialogDesignViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SimpleColorDialogDesignViewHolder viewHolder, int position) {
        String item = items.get(position);
        logger.debug(item);
        viewHolder.mColor.setBackgroundColor(Color.parseColor(item));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}

final class SimpleColorDialogDesignViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

    private static final Logger logger = LoggerFactory.getLogger(SimpleColorDialogDesignViewHolder.class);

    final View mColor;

    SimpleColorDialogDesignViewHolder(CardView itemView) {
        super(itemView);
        mColor = itemView.findViewById(R.id.simple_color_dialog_item);
    }

    @Override
    public void onClick(View v) {
        logger.debug("adsd");
    }

}
