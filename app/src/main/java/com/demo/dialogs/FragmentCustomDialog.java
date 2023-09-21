package com.demo.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.DialogFragment;

public class FragmentCustomDialog extends DialogFragment {
    ImageView imageView;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog, null);

        // Set the background with rounded corners
        //dialogView.setBackgroundResource(R.drawable.rounded_corner_dialog_bg);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(dialogView);

        imageView = dialogView.findViewById(R.id.detailImageView);
        // Set the image resource
        imageView.setImageResource(R.drawable.baseline_location_on_24);

        final EditText editText = dialogView.findViewById(R.id.edit_text);
        Button dialogButton = dialogView.findViewById(R.id.dialog_button);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click, e.g., get text from editText
                String inputText = editText.getText().toString();
                // Do something with the inputText
                dismiss(); // Close the dialog
            }
        });

        return builder.create();
    }
}
