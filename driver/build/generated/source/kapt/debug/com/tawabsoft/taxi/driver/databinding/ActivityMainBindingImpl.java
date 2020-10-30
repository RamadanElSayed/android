package com.tawabsoft.taxi.driver.databinding;
import com.tawabsoft.taxi.driver.R;
import com.tawabsoft.taxi.driver.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbarLayout, 8);
        sViewsWithIds.put(R.id.appbar, 9);
        sViewsWithIds.put(R.id.requests_view_pager, 10);
        sViewsWithIds.put(R.id.navigation_view, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            , (com.google.android.material.appbar.AppBarLayout) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.google.android.material.navigation.NavigationView) bindings[11]
            , (com.tawabsoft.taxi.common.ui.WrapContentViewPager) bindings[10]
            , (androidx.appcompat.widget.AppCompatToggleButton) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            );
        this.buttonEnableLocation.setTag(null);
        this.buttonEnablePermission.setTag(null);
        this.buttonOpenLocationSettings.setTag(null);
        this.drawerLayout.setTag(null);
        this.layoutMap.setTag(null);
        this.layoutNoLocation.setTag(null);
        this.switchConnection.setTag(null);
        this.textNoLocation.setTag(null);
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
        if (BR.locationState == variableId) {
            setLocationState((com.tawabsoft.taxi.driver.activities.main.LocationState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLocationState(@Nullable com.tawabsoft.taxi.driver.activities.main.LocationState LocationState) {
        this.mLocationState = LocationState;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.locationState);
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
        int locationStateLocationStateOKViewVISIBLEViewGONE = 0;
        boolean locationStateLocationStatePermissionDenied = false;
        int locationStateLocationStatePermissionNotAskedViewVISIBLEViewGONE = 0;
        int locationStateLocationStateOKViewGONEViewVISIBLE = 0;
        boolean locationStateLocationStateOK = false;
        int locationStateLocationStatePermissionDeniedViewVISIBLEViewGONE = 0;
        java.lang.String locationStateLocationStatePermissionDeniedTextNoLocationAndroidStringDriverNoLocationPermissionDeniedTextNoLocationAndroidStringDriverNoLocationGpsDisabled = null;
        java.lang.String locationStateLocationStatePermissionNotAskedTextNoLocationAndroidStringDriverNoLocationPermissionNotAskedLocationStateLocationStatePermissionDeniedTextNoLocationAndroidStringDriverNoLocationPermissionDeniedTextNoLocationAndroidStringDriverNoLocationGpsDisabled = null;
        boolean locationStateLocationStatePermissionNotAsked = false;
        com.tawabsoft.taxi.driver.activities.main.LocationState locationState = mLocationState;
        int locationStateLocationStateLocationDisabledViewVISIBLEViewGONE = 0;
        boolean locationStateLocationStateLocationDisabled = false;

        if ((dirtyFlags & 0x3L) != 0) {



                // read locationState == LocationState.PermissionDenied
                locationStateLocationStatePermissionDenied = (locationState) == (com.tawabsoft.taxi.driver.activities.main.LocationState.PermissionDenied);
                // read locationState == LocationState.OK
                locationStateLocationStateOK = (locationState) == (com.tawabsoft.taxi.driver.activities.main.LocationState.OK);
                // read locationState == LocationState.PermissionNotAsked
                locationStateLocationStatePermissionNotAsked = (locationState) == (com.tawabsoft.taxi.driver.activities.main.LocationState.PermissionNotAsked);
                // read locationState == LocationState.LocationDisabled
                locationStateLocationStateLocationDisabled = (locationState) == (com.tawabsoft.taxi.driver.activities.main.LocationState.LocationDisabled);
            if((dirtyFlags & 0x3L) != 0) {
                if(locationStateLocationStatePermissionDenied) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x1000L) != 0) {
                if(locationStateLocationStatePermissionDenied) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(locationStateLocationStateOK) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(locationStateLocationStatePermissionNotAsked) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(locationStateLocationStateLocationDisabled) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read locationState == LocationState.PermissionDenied ? View.VISIBLE : View.GONE
                locationStateLocationStatePermissionDeniedViewVISIBLEViewGONE = ((locationStateLocationStatePermissionDenied) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read locationState == LocationState.OK ? View.VISIBLE : View.GONE
                locationStateLocationStateOKViewVISIBLEViewGONE = ((locationStateLocationStateOK) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read locationState == LocationState.OK ? View.GONE : View.VISIBLE
                locationStateLocationStateOKViewGONEViewVISIBLE = ((locationStateLocationStateOK) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read locationState == LocationState.PermissionNotAsked ? View.VISIBLE : View.GONE
                locationStateLocationStatePermissionNotAskedViewVISIBLEViewGONE = ((locationStateLocationStatePermissionNotAsked) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read locationState == LocationState.LocationDisabled ? View.VISIBLE : View.GONE
                locationStateLocationStateLocationDisabledViewVISIBLEViewGONE = ((locationStateLocationStateLocationDisabled) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                // read locationState == LocationState.PermissionDenied ? @android:string/driver_no_location_permission_denied : @android:string/driver_no_location_gps_disabled
                locationStateLocationStatePermissionDeniedTextNoLocationAndroidStringDriverNoLocationPermissionDeniedTextNoLocationAndroidStringDriverNoLocationGpsDisabled = ((locationStateLocationStatePermissionDenied) ? (textNoLocation.getResources().getString(R.string.driver_no_location_permission_denied)) : (textNoLocation.getResources().getString(R.string.driver_no_location_gps_disabled)));
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read locationState == LocationState.PermissionNotAsked ? @android:string/driver_no_location_permission_not_asked : locationState == LocationState.PermissionDenied ? @android:string/driver_no_location_permission_denied : @android:string/driver_no_location_gps_disabled
                locationStateLocationStatePermissionNotAskedTextNoLocationAndroidStringDriverNoLocationPermissionNotAskedLocationStateLocationStatePermissionDeniedTextNoLocationAndroidStringDriverNoLocationPermissionDeniedTextNoLocationAndroidStringDriverNoLocationGpsDisabled = ((locationStateLocationStatePermissionNotAsked) ? (textNoLocation.getResources().getString(R.string.driver_no_location_permission_not_asked)) : (locationStateLocationStatePermissionDeniedTextNoLocationAndroidStringDriverNoLocationPermissionDeniedTextNoLocationAndroidStringDriverNoLocationGpsDisabled));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.buttonEnableLocation.setVisibility(locationStateLocationStateLocationDisabledViewVISIBLEViewGONE);
            this.buttonEnablePermission.setVisibility(locationStateLocationStatePermissionNotAskedViewVISIBLEViewGONE);
            this.buttonOpenLocationSettings.setVisibility(locationStateLocationStatePermissionDeniedViewVISIBLEViewGONE);
            this.layoutMap.setVisibility(locationStateLocationStateOKViewVISIBLEViewGONE);
            this.layoutNoLocation.setVisibility(locationStateLocationStateOKViewGONEViewVISIBLE);
            this.switchConnection.setVisibility(locationStateLocationStateOKViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNoLocation, locationStateLocationStatePermissionNotAskedTextNoLocationAndroidStringDriverNoLocationPermissionNotAskedLocationStateLocationStatePermissionDeniedTextNoLocationAndroidStringDriverNoLocationPermissionDeniedTextNoLocationAndroidStringDriverNoLocationGpsDisabled);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): locationState
        flag 1 (0x2L): null
        flag 2 (0x3L): locationState == LocationState.OK ? View.VISIBLE : View.GONE
        flag 3 (0x4L): locationState == LocationState.OK ? View.VISIBLE : View.GONE
        flag 4 (0x5L): locationState == LocationState.PermissionNotAsked ? View.VISIBLE : View.GONE
        flag 5 (0x6L): locationState == LocationState.PermissionNotAsked ? View.VISIBLE : View.GONE
        flag 6 (0x7L): locationState == LocationState.OK ? View.GONE : View.VISIBLE
        flag 7 (0x8L): locationState == LocationState.OK ? View.GONE : View.VISIBLE
        flag 8 (0x9L): locationState == LocationState.PermissionDenied ? View.VISIBLE : View.GONE
        flag 9 (0xaL): locationState == LocationState.PermissionDenied ? View.VISIBLE : View.GONE
        flag 10 (0xbL): locationState == LocationState.PermissionDenied ? @android:string/driver_no_location_permission_denied : @android:string/driver_no_location_gps_disabled
        flag 11 (0xcL): locationState == LocationState.PermissionDenied ? @android:string/driver_no_location_permission_denied : @android:string/driver_no_location_gps_disabled
        flag 12 (0xdL): locationState == LocationState.PermissionNotAsked ? @android:string/driver_no_location_permission_not_asked : locationState == LocationState.PermissionDenied ? @android:string/driver_no_location_permission_denied : @android:string/driver_no_location_gps_disabled
        flag 13 (0xeL): locationState == LocationState.PermissionNotAsked ? @android:string/driver_no_location_permission_not_asked : locationState == LocationState.PermissionDenied ? @android:string/driver_no_location_permission_denied : @android:string/driver_no_location_gps_disabled
        flag 14 (0xfL): locationState == LocationState.LocationDisabled ? View.VISIBLE : View.GONE
        flag 15 (0x10L): locationState == LocationState.LocationDisabled ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}