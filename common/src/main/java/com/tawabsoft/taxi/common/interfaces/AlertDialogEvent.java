package com.tawabsoft.taxi.common.interfaces;

import com.tawabsoft.taxi.common.utils.AlertDialogBuilder;

public interface AlertDialogEvent {
    void onAnswerDialog(AlertDialogBuilder.DialogResult result);
}