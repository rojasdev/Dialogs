package com.demo.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class FragmentSingleChoiceDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};
        int selected = 0; // Index of the initially selected item

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Select an Option")
                .setSingleChoiceItems(items, selected, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle the selected item here
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle the OK button click
                        // To get the selected item index, use the selected variable
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Handle the Cancel button click
                    }
                });

        return builder.create();
    }
}
