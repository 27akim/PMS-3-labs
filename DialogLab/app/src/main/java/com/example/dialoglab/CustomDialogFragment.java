package com.example.dialoglab;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.app.DialogFragment;

public class CustomDialogFragment extends DialogFragment {

    /*@NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder.setTitle("Диалоговое окно").setMessage("Для закрытия окна нажмите ОК").create();
    }*/

    /*@NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Диалоговое окно")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Для закрытия окна нажмите ОК")
                .setPositiveButton("OK", null)
                .setNegativeButton("Отмена", null)
                .create();
    }*/

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Диалоговое окно")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setView(R.layout.fragment_custom_dialog)
                .setPositiveButton("OK", null)
                .setNegativeButton("Отмена", null)
                .create();
    }
}
