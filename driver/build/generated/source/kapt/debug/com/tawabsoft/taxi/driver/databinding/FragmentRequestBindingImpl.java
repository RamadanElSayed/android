package com.tawabsoft.taxi.driver.databinding;
import com.tawabsoft.taxi.driver.R;
import com.tawabsoft.taxi.driver.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRequestBindingImpl extends FragmentRequestBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_top, 3);
        sViewsWithIds.put(R.id.icon_car, 4);
        sViewsWithIds.put(R.id.guideline_start, 5);
        sViewsWithIds.put(R.id.icon_user, 6);
        sViewsWithIds.put(R.id.line_driver_user, 7);
        sViewsWithIds.put(R.id.text_driver_user_distance, 8);
        sViewsWithIds.put(R.id.line_user_destination, 9);
        sViewsWithIds.put(R.id.text_user_destination_distance, 10);
        sViewsWithIds.put(R.id.icon_destination, 11);
        sViewsWithIds.put(R.id.icon_pickup, 12);
        sViewsWithIds.put(R.id.line_pickup_dropoff, 13);
        sViewsWithIds.put(R.id.icon_dropoff, 14);
        sViewsWithIds.put(R.id.label_from, 15);
        sViewsWithIds.put(R.id.label_to, 16);
        sViewsWithIds.put(R.id.icon_cost, 17);
        sViewsWithIds.put(R.id.label_cost, 18);
        sViewsWithIds.put(R.id.text_cost, 19);
        sViewsWithIds.put(R.id.divider, 20);
        sViewsWithIds.put(R.id.button_accept, 21);
        sViewsWithIds.put(R.id.button_decline, 22);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRequestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentRequestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[21]
            , (android.widget.Button) bindings[22]
            , (android.widget.ImageView) bindings[20]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textFrom.setTag(null);
        this.textTo.setTag(null);
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
        if (BR.request == variableId) {
            setRequest((com.tawabsoft.taxi.common.models.Request) variable);
        }
        else if (BR.distanceDriver == variableId) {
            setDistanceDriver((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRequest(@Nullable com.tawabsoft.taxi.common.models.Request Request) {
        this.mRequest = Request;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.request);
        super.requestRebind();
    }
    public void setDistanceDriver(@Nullable java.lang.Integer DistanceDriver) {
        this.mDistanceDriver = DistanceDriver;
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
        java.lang.String requestAddressesGetRequestAddressesSizeInt1 = null;
        java.util.List<java.lang.String> requestAddresses = null;
        java.lang.String requestAddresses0 = null;
        com.tawabsoft.taxi.common.models.Request request = mRequest;
        int requestAddressesSize = 0;
        int requestAddressesSizeInt1 = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (request != null) {
                    // read request.addresses
                    requestAddresses = request.getAddresses();
                }


                if (requestAddresses != null) {
                    // read request.addresses[0]
                    requestAddresses0 = getFromList(requestAddresses, 0);
                    // read request.addresses.size()
                    requestAddressesSize = requestAddresses.size();
                }


                // read (request.addresses.size()) - (1)
                requestAddressesSizeInt1 = (requestAddressesSize) - (1);


                if (requestAddresses != null) {
                    // read request.addresses.get((request.addresses.size()) - (1))
                    requestAddressesGetRequestAddressesSizeInt1 = requestAddresses.get(requestAddressesSizeInt1);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textFrom, requestAddresses0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTo, requestAddressesGetRequestAddressesSizeInt1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): request
        flag 1 (0x2L): distanceDriver
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}