// Generated by data binding compiler. Do not edit!
package com.tawabsoft.taxi.driver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.tawabsoft.taxi.driver.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginDriverBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnLogin;

  @NonNull
  public final MaterialButton btnVerify;

  @NonNull
  public final MaterialTextView countryId;

  @NonNull
  public final MaterialTextView countryIdCode;

  @NonNull
  public final TextInputEditText etxPhone;

  @NonNull
  public final TextInputEditText etxVerify;

  @NonNull
  public final ConstraintLayout layoutPhoneAuth;

  @NonNull
  public final ImageView logoId;

  @NonNull
  public final TextInputLayout phoneLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ImageView smallIc;

  @NonNull
  public final TextInputLayout verifyLayout;

  protected ActivityLoginDriverBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnLogin, MaterialButton btnVerify, MaterialTextView countryId,
      MaterialTextView countryIdCode, TextInputEditText etxPhone, TextInputEditText etxVerify,
      ConstraintLayout layoutPhoneAuth, ImageView logoId, TextInputLayout phoneLayout,
      ProgressBar progressBar, ImageView smallIc, TextInputLayout verifyLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogin = btnLogin;
    this.btnVerify = btnVerify;
    this.countryId = countryId;
    this.countryIdCode = countryIdCode;
    this.etxPhone = etxPhone;
    this.etxVerify = etxVerify;
    this.layoutPhoneAuth = layoutPhoneAuth;
    this.logoId = logoId;
    this.phoneLayout = phoneLayout;
    this.progressBar = progressBar;
    this.smallIc = smallIc;
    this.verifyLayout = verifyLayout;
  }

  @NonNull
  public static ActivityLoginDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login_driver, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginDriverBinding>inflateInternal(inflater, R.layout.activity_login_driver, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginDriverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login_driver, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginDriverBinding>inflateInternal(inflater, R.layout.activity_login_driver, null, false, component);
  }

  public static ActivityLoginDriverBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityLoginDriverBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginDriverBinding)bind(component, view, R.layout.activity_login_driver);
  }
}
