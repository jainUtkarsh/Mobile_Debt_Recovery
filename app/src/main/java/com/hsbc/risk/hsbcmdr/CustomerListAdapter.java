package com.hsbc.risk.hsbcmdr;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.util.List;

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListAdapter.MyViewHolder> {

    private List<CustomerPojo> customerData;

    public CustomerListAdapter(List<CustomerPojo> customerData)
    {
        this.customerData = customerData;
    }
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        TextView customerName = holder.customerName;
        TextView customerAddressLine1 = holder.customerAddressLine1;
        TextView customerAccount = holder.customerAccount;
        final ImageButton customerPhone = holder.customerPhone;

        customerName.setText(customerData.get(position).getCustomerName());
        customerAddressLine1.setText(customerData.get(position).getCustomerAddressLine1());
        customerAccount.setText(customerData.get(position).getCustomerAccount());
        customerPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+customerData.get(position).getCustomerPhone()));
                customerPhone.getContext().startActivity(callIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return customerData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView customerName;
        TextView customerAccount;
        TextView customerAddressLine1;
        ImageButton customerPhone;

        public MyViewHolder(View view){
            super(view);
            this.customerName = view.findViewById(R.id.customerName);
            this.customerAddressLine1 = view.findViewById(R.id.customerAddress);
            this.customerAccount = view.findViewById(R.id.customerAccount);
            this.customerPhone = view.findViewById(R.id.customerPhone);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_list_item,parent,false);
        return new MyViewHolder(view);
    }
}
