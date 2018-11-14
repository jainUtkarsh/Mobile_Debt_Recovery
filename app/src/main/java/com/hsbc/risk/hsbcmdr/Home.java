package com.hsbc.risk.hsbcmdr;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment{

    private RecyclerView customerList;
    private List<CustomerPojo> customerData;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home_main,container,false);
        getActivity().setTitle("Visit Plan");
        customerList = (RecyclerView)rootView.findViewById(R.id.customerList);
        customerList.hasFixedSize();
        layoutManager = new LinearLayoutManager(getContext());
        customerList.setLayoutManager(layoutManager);
        customerList.setItemAnimator(new DefaultItemAnimator());
        customerData = new ArrayList<>();
        for(int i = 0; i < MyData.nameArray.length; i++)
        {
            customerData.add(new CustomerPojo(MyData.nameArray[i],
                    MyData.addressArray[i],MyData.accountArray[i],MyData.phoneArray[i]));
        }
        adapter = new CustomerListAdapter(customerData);
        customerList.setAdapter(adapter);
        return rootView;

    }
}
