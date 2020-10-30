// Generated by data binding compiler. Do not edit!
package com.tawabsoft.taxi.rider.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.tawabsoft.taxi.rider.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySplashBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton loginButton;

  @NonNull
  public final ImageView logoImage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView;

  protected ActivitySplashBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton loginButton, ImageView logoImage, ProgressBar progressBar, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loginButton = loginButton;
    this.logoImage = logoImage;
    this.progressBar = progressBar;
    this.textView = textView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_splash, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySplashBinding>inflateInternal(inflater, R.layout.activity_splash, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_splash, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySplashBinding>inflateInternal(inflater, R.layout.activity_splash, null, false, component);
  }

  public static ActivitySplashBinding bind(@NonNull View view) {
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
  public static ActivitySplashBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySplashBinding)bind(component, view, R.layout.activity_splash);
  }
}
