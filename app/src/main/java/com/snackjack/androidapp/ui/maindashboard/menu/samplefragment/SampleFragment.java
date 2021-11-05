package com.snackjack.androidapp.ui.maindashboard.menu.samplefragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.snackjack.androidapp.R;
public class SampleFragment extends Fragment {

    private SampleFragmentViewModel homeViewModel;
    Button VegetableButton;
    Button FruitsButton;
    Button CerealsButton;
    Button PulsesButton;
    Button MeatButton;
    Button DairyButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(SampleFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sample, container, false);

        Activity activity=this.getActivity();
        Toolbar toolbar=(Toolbar)activity.findViewById(R.id.toolbar);
        /*toolbar.post(new Runnable() {
            @Override
            public void run() {
                toolbar.setTitle("SNACK JACK");
            }
        });*/

        //VEGETABLE BUTTON ONCLICK
        VegetableButton = (Button) root.findViewById(R.id.vegetable_button);
        VegetableButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                /*Intent intent=new Intent(getActivity(), ProductsView.class);
                intent.putExtra("segment","vegetables");
                getActivity().startActivity(intent);*/

            }

        });
        //FRUITS BUTTON ONCLICK
        FruitsButton = (Button) root.findViewById(R.id.fruits_button);
        FruitsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                /*Intent intent=new Intent(getActivity(), ProductsView.class);
                intent.putExtra("segment","fruits");
                getActivity().startActivity(intent);*/

            }
        });

        //CEREALS BUTTON ONCLICK
        CerealsButton = (Button) root.findViewById(R.id.cereals_button);
        CerealsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                /*Intent intent=new Intent(getActivity(), ProductsView.class);
                intent.putExtra("segment","cereals");
                getActivity().startActivity(intent);*/

            }
        });
        //PULSES BUTTON ONCLICK
        PulsesButton = (Button) root.findViewById(R.id.pulses_button);
        PulsesButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
               /* Intent intent=new Intent(getActivity(), ProductsView.class);
                intent.putExtra("segment","pulses");
                getActivity().startActivity(intent);*/

            }
        });
        //MEAT BUTTON ONCLICK
        MeatButton = (Button) root.findViewById(R.id.meat_button);
        MeatButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                /*Intent intent=new Intent(getActivity(), ProductsView.class);
                intent.putExtra("segment","meat");
                getActivity().startActivity(intent);*/

            }
        });
        //DAIRY BUTTON ONCLICK
        DairyButton = (Button) root.findViewById(R.id.dairy_button);
        DairyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                /*Intent intent=new Intent(getActivity(), ProductsView.class);
                intent.putExtra("segment","dairy");
                getActivity().startActivity(intent);*/

            }
        });


        return root;
    }


}