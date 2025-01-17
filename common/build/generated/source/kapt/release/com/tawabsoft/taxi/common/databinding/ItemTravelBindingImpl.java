package com.tawabsoft.taxi.common.databinding;
import com.tawabsoft.taxi.common.R;
import com.tawabsoft.taxi.common.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTravelBindingImpl extends ItemTravelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint_id, 5);
        sViewsWithIds.put(R.id.text_status, 6);
        sViewsWithIds.put(R.id.label_from, 7);
        sViewsWithIds.put(R.id.label_to, 8);
        sViewsWithIds.put(R.id.divider_address, 9);
        sViewsWithIds.put(R.id.label_request_time, 10);
        sViewsWithIds.put(R.id.text_request_time, 11);
        sViewsWithIds.put(R.id.text_request_date, 12);
        sViewsWithIds.put(R.id.label_finish_time, 13);
        sViewsWithIds.put(R.id.text_finish_time, 14);
        sViewsWithIds.put(R.id.text_finish_date, 15);
        sViewsWithIds.put(R.id.divider_details, 16);
        sViewsWithIds.put(R.id.label_details_cost, 17);
        sViewsWithIds.put(R.id.text_details_cost, 18);
        sViewsWithIds.put(R.id.label_details_distance, 19);
        sViewsWithIds.put(R.id.text_details_distance, 20);
        sViewsWithIds.put(R.id.button_hide_travel, 21);
        sViewsWithIds.put(R.id.button_Complaint, 22);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTravelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ItemTravelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[22]
            , (com.google.android.material.button.MaterialButton) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.cellContentView.setTag(null);
        this.imageMap.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.textFrom.setTag(null);
        this.textTo.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.tawabsoft.taxi.common.models.Request) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.tawabsoft.taxi.common.models.Request Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        java.lang.String itemImageUrl = null;
        com.tawabsoft.taxi.common.models.Request item = mItem;
        java.lang.String itemAddressesGetInt0 = null;
        int itemAddressesSize = 0;
        java.lang.String itemAddressesGetItemAddressesSizeInt1 = null;
        java.lang.Long itemId = null;
        java.lang.String mboundView1AndroidStringTravelNumberTitleItemId = null;
        int itemAddressesSizeInt1 = 0;
        java.util.List<java.lang.String> itemAddresses = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.imageUrl
                    itemImageUrl = item.getImageUrl();
                    // read item.id
                    itemId = item.getId();
                    // read item.addresses
                    itemAddresses = item.getAddresses();
                }


                // read @android:string/travel_number_title
                mboundView1AndroidStringTravelNumberTitleItemId = mboundView1.getResources().getString(R.string.travel_number_title, itemId);
                if (itemAddresses != null) {
                    // read item.addresses.get(0)
                    itemAddressesGetInt0 = itemAddresses.get(0);
                    // read item.addresses.size()
                    itemAddressesSize = itemAddresses.size();
                }


                // read (item.addresses.size()) - (1)
                itemAddressesSizeInt1 = (itemAddressesSize) - (1);


                if (itemAddresses != null) {
                    // read item.addresses.get((item.addresses.size()) - (1))
                    itemAddressesGetItemAddressesSizeInt1 = itemAddresses.get(itemAddressesSizeInt1);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.tawabsoft.taxi.common.utils.DataBinder.setImageUrl(this.imageMap, itemImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, mboundView1AndroidStringTravelNumberTitleItemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textFrom, itemAddressesGetInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTo, itemAddressesGetItemAddressesSizeInt1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}