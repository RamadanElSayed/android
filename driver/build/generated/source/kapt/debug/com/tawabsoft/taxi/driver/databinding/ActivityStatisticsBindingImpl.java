package com.tawabsoft.taxi.driver.databinding;
import com.tawabsoft.taxi.driver.R;
import com.tawabsoft.taxi.driver.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityStatisticsBindingImpl extends ActivityStatisticsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.tab_date, 3);
        sViewsWithIds.put(R.id.tab_daily, 4);
        sViewsWithIds.put(R.id.income_card, 5);
        sViewsWithIds.put(R.id.income_text, 6);
        sViewsWithIds.put(R.id.income_label, 7);
        sViewsWithIds.put(R.id.service_card, 8);
        sViewsWithIds.put(R.id.service_text, 9);
        sViewsWithIds.put(R.id.service_label, 10);
        sViewsWithIds.put(R.id.rating_card, 11);
        sViewsWithIds.put(R.id.distance_text, 12);
        sViewsWithIds.put(R.id.distance_label, 13);
        sViewsWithIds.put(R.id.chart_card, 14);
        sViewsWithIds.put(R.id.chart, 15);
        sViewsWithIds.put(R.id.button_payment_request, 16);
        sViewsWithIds.put(R.id.empty_state, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityStatisticsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityStatisticsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.db.williamchart.view.LineChartView) bindings[15]
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (com.google.android.material.textview.MaterialTextView) bindings[13]
            , (com.google.android.material.textview.MaterialTextView) bindings[12]
            , (com.tylersuehr.esr.EmptyStateRecyclerView) bindings[17]
            , (com.google.android.material.card.MaterialCardView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[10]
            , (com.google.android.material.textview.MaterialTextView) bindings[9]
            , (com.google.android.material.tabs.TabItem) bindings[4]
            , (com.google.android.material.tabs.TabLayout) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.driver == variableId) {
            setDriver((com.tawabsoft.taxi.common.models.Driver) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDriver(@Nullable com.tawabsoft.taxi.common.models.Driver Driver) {
        this.mDriver = Driver;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): driver
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}