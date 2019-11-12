package com.example.kaanapos.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class adapterSample {
}

// extends RecyclerView.Adapter<MergeAdapter.MyViewHolder> {
//
//
//public List<TicketListModel> orderDetailsModel = new ArrayList<>();
//        Context mcontext;
//        MergDialogContract mergDialogContract;
//        int lastClickPOsition = -1;
//
//public MergeAdapter(MergeDialoge refundDialoge, Context mContext, List<TicketListModel> merticketListModels) {
//
//        mergDialogContract = (MergDialogContract) refundDialoge;
//        this.mcontext = mContext;
//        this.orderDetailsModel = merticketListModels;
//
//        }
//
//
//public class MyViewHolder extends RecyclerView.ViewHolder {
//
//    @BindView(R.id.item_select)
//    RadioButton itemSelect;
//    @BindView(R.id.item_name)
//    TextView itemName;
//
//    public MyViewHolder(View view) {
//        super(view);
//
//        ButterKnife.bind(this, view);
//
//    }
//
//}
//
//
//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_merge, parent, false);
//
//        return new MyViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(final MyViewHolder holder, final int position) {
//
//        holder.itemName.setText(orderDetailsModel.get(position).getTicketName().toString());
//
//        holder.itemSelect.setChecked(lastClickPOsition == position);
//
//        holder.itemSelect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//
//                    if (holder.itemSelect.isChecked()) {
//
//                        lastClickPOsition = position;
//                        notifyDataSetChanged();
//
//                        Log.e("merged","checked"+position);
//
//                        mergDialogContract.SelectMergeOrder(orderDetailsModel.get(position).getTicketName().toString(), orderDetailsModel.get(position));
//
//                    } else {
//                        Log.e("merged","uncheck"+position);
//                    }
//                } catch (Exception e) {
//                }
//            }
//        });
//    }
//
//
//    @Override
//    public int getItemCount() {
//        if (orderDetailsModel != null)
//            return orderDetailsModel.size();
//        else
//            return 0;
//    }
//
//}

//