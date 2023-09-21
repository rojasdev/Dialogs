package com.demo.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentThree extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_three, container, false);

        Button showDialogButton = view.findViewById(R.id.show_dialog_button);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the custom dialog when the button is clicked
                showDialog();
            }
        });

        return view;
    }

    private void showDialog() {
        // Create and show the AlertDialog
        FragmentSingleChoiceDialog dialogFragment = new FragmentSingleChoiceDialog();
        dialogFragment.show(getParentFragmentManager(), "MyDialogFragment");
    }
}
