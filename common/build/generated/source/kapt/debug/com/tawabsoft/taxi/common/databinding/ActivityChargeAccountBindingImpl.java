package com.tawabsoft.taxi.common.databinding;
import com.tawabsoft.taxi.common.R;
import com.tawabsoft.taxi.common.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChargeAccountBindingImpl extends ActivityChargeAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.balance_autocomplete, 7);
        sViewsWithIds.put(R.id.title_method, 8);
        sViewsWithIds.put(R.id.layout_methods, 9);
        sViewsWithIds.put(R.id.progress_charge, 10);
        sViewsWithIds.put(R.id.checkout_button, 11);
        sViewsWithIds.put(R.id.layout_charges, 12);
        sViewsWithIds.put(R.id.charge_add_first, 13);
        sViewsWithIds.put(R.id.charge_add_second, 14);
        sViewsWithIds.put(R.id.charge_add_third, 15);
        sViewsWithIds.put(R.id.card_input, 16);
        sViewsWithIds.put(R.id.price_text_layout, 17);
        sViewsWithIds.put(R.id.text_amount, 18);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView5;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityChargeAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityChargeAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.AutoCompleteTextView) bindings[7]
            , (com.stripe.android.view.CardInputWidget) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[9]
            , (com.google.android.material.button.MaterialButtonToggleGroup) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[17]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.ProgressBar) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[18]
            , (android.widget.TextView) bindings[8]
            );
        this.layoutBalance.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.paymentToggleLayout.setTag(null);
        this.progressBalance.setTag(null);
        this.progressMethods.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.waitingForPayment == variableId) {
            setWaitingForPayment((java.lang.Boolean) variable);
        }
        else if (BR.loadingMode == variableId) {
            setLoadingMode((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWaitingForPayment(@Nullable java.lang.Boolean WaitingForPayment) {
        this.mWaitingForPayment = WaitingForPayment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.waitingForPayment);
        super.requestRebind();
    }
    public void setLoadingMode(@Nullable java.lang.Boolean LoadingMode) {
        this.mLoadingMode = LoadingMode;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.loadingMode);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int loadingModeViewVISIBLEViewGONE = 0;
        int waitingForPaymentViewVISIBLEViewGONE = 0;
        int loadingModeViewGONEViewVISIBLE = 0;
        java.lang.Boolean waitingForPayment = mWaitingForPayment;
        int waitingForPaymentViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoadingMode = false;
        java.lang.Boolean loadingMode = mLoadingMode;
        boolean androidxDatabindingViewDataBindingSafeUnboxWaitingForPayment = false;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment)
                androidxDatabindingViewDataBindingSafeUnboxWaitingForPayment = androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment);
            if((dirtyFlags & 0x5L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxWaitingForPayment) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment) ? View.VISIBLE : View.GONE
                waitingForPaymentViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxWaitingForPayment) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment) ? View.GONE : View.VISIBLE
                waitingForPaymentViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxWaitingForPayment) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(loadingMode)
                androidxDatabindingViewDataBindingSafeUnboxLoadingMode = androidx.databinding.ViewDataBinding.safeUnbox(loadingMode);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxLoadingMode) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(loadingMode) ? View.VISIBLE : View.GONE
                loadingModeViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxLoadingMode) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(loadingMode) ? View.GONE : View.VISIBLE
                loadingModeViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxLoadingMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.layoutBalance.setVisibility(loadingModeViewGONEViewVISIBLE);
            this.paymentToggleLayout.setVisibility(loadingModeViewGONEViewVISIBLE);
            this.progressBalance.setVisibility(loadingModeViewVISIBLEViewGONE);
            this.progressMethods.setVisibility(loadingModeViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(waitingForPaymentViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(waitingForPaymentViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): waitingForPayment
        flag 1 (0x2L): loadingMode
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(loadingMode) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(loadingMode) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(loadingMode) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(loadingMode) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(waitingForPayment) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}