package com.tawabsoft.taxi.driver.databinding;
import com.tawabsoft.taxi.driver.R;
import com.tawabsoft.taxi.driver.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditProfileBindingImpl extends ActivityEditProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 17);
        sViewsWithIds.put(R.id.collapse_toolbar, 18);
        sViewsWithIds.put(R.id.camera_header_image, 19);
        sViewsWithIds.put(R.id.upload_ride_label, 20);
        sViewsWithIds.put(R.id.toolbar, 21);
        sViewsWithIds.put(R.id.fields_layout, 22);
        sViewsWithIds.put(R.id.label_status, 23);
        sViewsWithIds.put(R.id.layout_note, 24);
        sViewsWithIds.put(R.id.label_note, 25);
        sViewsWithIds.put(R.id.mobile_text_layout, 26);
        sViewsWithIds.put(R.id.email_text_layout, 27);
        sViewsWithIds.put(R.id.first_name_text_layout, 28);
        sViewsWithIds.put(R.id.last_name_text_layout, 29);
        sViewsWithIds.put(R.id.gender_autocomplete, 30);
        sViewsWithIds.put(R.id.car_color_text_layout, 31);
        sViewsWithIds.put(R.id.plate_num_text_layout, 32);
        sViewsWithIds.put(R.id.car_year_text_layout, 33);
        sViewsWithIds.put(R.id.certificate_text_layout, 34);
        sViewsWithIds.put(R.id.bank_name_text_layout, 35);
        sViewsWithIds.put(R.id.account_number_text_layout, 36);
        sViewsWithIds.put(R.id.bank_routing_text_layout, 37);
        sViewsWithIds.put(R.id.bank_swift_text_layout, 38);
        sViewsWithIds.put(R.id.address_text_layout, 39);
        sViewsWithIds.put(R.id.services, 40);
        sViewsWithIds.put(R.id.documents, 41);
        sViewsWithIds.put(R.id.button_upload, 42);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView10;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView12;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView13;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView14;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView15;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView16;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView10androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.carProductionYear
            //         is user.setCarProductionYear((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView10);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.carProductionYear
            java.lang.String userCarProductionYear = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setCarProductionYear(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView11androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.certificateNumber
            //         is user.setCertificateNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView11);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.certificateNumber
            java.lang.String userCertificateNumber = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setCertificateNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.bankName
            //         is user.setBankName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.bankName
            java.lang.String userBankName = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setBankName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView13androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.accountNumber
            //         is user.setAccountNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView13);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user.accountNumber
            java.lang.String userAccountNumber = null;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setAccountNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView14androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.bankRoutingNumber
            //         is user.setBankRoutingNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView14);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.bankRoutingNumber
            java.lang.String userBankRoutingNumber = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setBankRoutingNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView15androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.bankSwift
            //         is user.setBankSwift((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView15);
            // localize variables for thread safety
            // user.bankSwift
            java.lang.String userBankSwift = null;
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setBankSwift(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView16androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.address
            //         is user.setAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView16);
            // localize variables for thread safety
            // user.address
            java.lang.String userAddress = null;
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.email
            //         is user.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // user.email
            java.lang.String userEmail = null;
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.firstName
            //         is user.setFirstName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user.firstName
            java.lang.String userFirstName = null;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setFirstName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.lastName
            //         is user.setLastName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.lastName
            java.lang.String userLastName = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setLastName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.carColor
            //         is user.setCarColor((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.carColor
            java.lang.String userCarColor = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setCarColor(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView9androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.carPlate
            //         is user.setCarPlate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView9);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.tawabsoft.taxi.common.models.Driver user = mUser;
            // user.carPlate
            java.lang.String userCarPlate = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setCarPlate(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityEditProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private ActivityEditProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[36]
            , (com.google.android.material.textfield.TextInputLayout) bindings[39]
            , (com.google.android.material.appbar.AppBarLayout) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[37]
            , (com.google.android.material.textfield.TextInputLayout) bindings[38]
            , (com.google.android.material.button.MaterialButton) bindings[42]
            , (android.widget.ImageView) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[31]
            , (com.google.android.material.textfield.TextInputLayout) bindings[33]
            , (com.google.android.material.textfield.TextInputLayout) bindings[34]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[41]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[28]
            , (android.widget.AutoCompleteTextView) bindings[30]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (com.google.android.material.textfield.TextInputLayout) bindings[32]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[40]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[21]
            , (android.widget.TextView) bindings[20]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (com.google.android.material.textfield.TextInputEditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (com.google.android.material.textfield.TextInputEditText) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (com.google.android.material.textfield.TextInputEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (com.google.android.material.textfield.TextInputEditText) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (com.google.android.material.textfield.TextInputEditText) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (com.google.android.material.textfield.TextInputEditText) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (com.google.android.material.textfield.TextInputEditText) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputEditText) bindings[9];
        this.mboundView9.setTag(null);
        this.profileImage.setTag(null);
        this.textNote.setTag(null);
        this.textStatus.setTag(null);
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
        if (BR.user == variableId) {
            setUser((com.tawabsoft.taxi.common.models.Driver) variable);
        }
        else if (BR.converter == variableId) {
            setConverter((com.tawabsoft.taxi.common.utils.Converters) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.tawabsoft.taxi.common.models.Driver User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setConverter(@Nullable com.tawabsoft.taxi.common.utils.Converters Converter) {
        this.mConverter = Converter;
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
        java.lang.String userCertificateNumber = null;
        java.lang.String stringValueOfUserMobileNumber = null;
        java.lang.String userBankRoutingNumber = null;
        long androidxDatabindingViewDataBindingSafeUnboxUserMobileNumber = 0;
        java.lang.String userCarProductionYear = null;
        com.tawabsoft.taxi.common.models.Driver user = mUser;
        java.lang.String userBankName = null;
        java.lang.String userBankSwift = null;
        java.lang.String userDocumentsNote = null;
        java.lang.String userStatusValue = null;
        java.lang.String userEmail = null;
        com.tawabsoft.taxi.common.models.Media userMedia = null;
        java.lang.String userAddress = null;
        java.lang.String userFirstName = null;
        java.lang.String userCarColor = null;
        java.lang.String userLastName = null;
        java.lang.String userCarPlate = null;
        java.lang.Long userMobileNumber = null;
        java.lang.String userAccountNumber = null;
        com.tawabsoft.taxi.common.models.Driver.Status userStatus = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (user != null) {
                    // read user.certificateNumber
                    userCertificateNumber = user.getCertificateNumber();
                    // read user.bankRoutingNumber
                    userBankRoutingNumber = user.getBankRoutingNumber();
                    // read user.carProductionYear
                    userCarProductionYear = user.getCarProductionYear();
                    // read user.bankName
                    userBankName = user.getBankName();
                    // read user.bankSwift
                    userBankSwift = user.getBankSwift();
                    // read user.documentsNote
                    userDocumentsNote = user.getDocumentsNote();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.media
                    userMedia = user.getMedia();
                    // read user.address
                    userAddress = user.getAddress();
                    // read user.firstName
                    userFirstName = user.getFirstName();
                    // read user.carColor
                    userCarColor = user.getCarColor();
                    // read user.lastName
                    userLastName = user.getLastName();
                    // read user.carPlate
                    userCarPlate = user.getCarPlate();
                    // read user.mobileNumber
                    userMobileNumber = user.getMobileNumber();
                    // read user.accountNumber
                    userAccountNumber = user.getAccountNumber();
                    // read user.status
                    userStatus = user.getStatus();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(user.mobileNumber)
                androidxDatabindingViewDataBindingSafeUnboxUserMobileNumber = androidx.databinding.ViewDataBinding.safeUnbox(userMobileNumber);
                if (userStatus != null) {
                    // read user.status.value
                    userStatusValue = userStatus.getValue();
                }


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(user.mobileNumber))
                stringValueOfUserMobileNumber = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxUserMobileNumber);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, userCarProductionYear);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, userCertificateNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, userBankName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, userAccountNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, userBankRoutingNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, userBankSwift);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, userAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, stringValueOfUserMobileNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, userLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, userCarColor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, userCarPlate);
            com.tawabsoft.taxi.common.utils.DataBinder.setMedia(this.profileImage, userMedia);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textNote, userDocumentsNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textStatus, userStatusValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView10, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView10androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView11, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView11androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView13, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView13androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView14, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView14androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView15, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView15androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView16, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView16androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView9, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView9androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): converter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}