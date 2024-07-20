package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import o.MenuBuilder;
import o.clearHeader;
import o.findGroupIndex;
import o.onCreateActionView;
import o.onPerformDefaultAction;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new clearHeader(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new findGroupIndex(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new MenuBuilder.ItemInvoker(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new onPerformDefaultAction(context, attributeSet);
    }

    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new onCreateActionView(context, attributeSet);
    }
}
