package com.tawabsoft.taxi.driver;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.tawabsoft.taxi.driver.databinding.ActivityEditProfileBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ActivityLoginDriverBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ActivityMainBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ActivitySplashBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ActivityStatisticsBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ActivityTravelBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ActivityWaitingForPaymentBindingImpl;
import com.tawabsoft.taxi.driver.databinding.FragmentRequestBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ItemDocumentBindingImpl;
import com.tawabsoft.taxi.driver.databinding.ItemServiceBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYEDITPROFILE = 1;

  private static final int LAYOUT_ACTIVITYLOGINDRIVER = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYSPLASH = 4;

  private static final int LAYOUT_ACTIVITYSTATISTICS = 5;

  private static final int LAYOUT_ACTIVITYTRAVEL = 6;

  private static final int LAYOUT_ACTIVITYWAITINGFORPAYMENT = 7;

  private static final int LAYOUT_FRAGMENTREQUEST = 8;

  private static final int LAYOUT_ITEMDOCUMENT = 9;

  private static final int LAYOUT_ITEMSERVICE = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_login_driver, LAYOUT_ACTIVITYLOGINDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_statistics, LAYOUT_ACTIVITYSTATISTICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_travel, LAYOUT_ACTIVITYTRAVEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.activity_waiting_for_payment, LAYOUT_ACTIVITYWAITINGFORPAYMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.fragment_request, LAYOUT_FRAGMENTREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.item_document, LAYOUT_ITEMDOCUMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.tawabsoft.taxi.driver.R.layout.item_service, LAYOUT_ITEMSERVICE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYEDITPROFILE: {
          if ("layout/activity_edit_profile_0".equals(tag)) {
            return new ActivityEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGINDRIVER: {
          if ("layout/activity_login_driver_0".equals(tag)) {
            return new ActivityLoginDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTATISTICS: {
          if ("layout/activity_statistics_0".equals(tag)) {
            return new ActivityStatisticsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_statistics is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTRAVEL: {
          if ("layout/activity_travel_0".equals(tag)) {
            return new ActivityTravelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_travel is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWAITINGFORPAYMENT: {
          if ("layout/activity_waiting_for_payment_0".equals(tag)) {
            return new ActivityWaitingForPaymentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_waiting_for_payment is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREQUEST: {
          if ("layout/fragment_request_0".equals(tag)) {
            return new FragmentRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_request is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDOCUMENT: {
          if ("layout/item_document_0".equals(tag)) {
            return new ItemDocumentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_document is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSERVICE: {
          if ("layout/item_service_0".equals(tag)) {
            return new ItemServiceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_service is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.tawabsoft.taxi.common.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(12);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "converter");
      sKeys.put(2, "distanceDriver");
      sKeys.put(3, "driver");
      sKeys.put(4, "item");
      sKeys.put(5, "loadingMode");
      sKeys.put(6, "locationState");
      sKeys.put(7, "media");
      sKeys.put(8, "request");
      sKeys.put(9, "service");
      sKeys.put(10, "user");
      sKeys.put(11, "waitingForPayment");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_edit_profile_0", com.tawabsoft.taxi.driver.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_login_driver_0", com.tawabsoft.taxi.driver.R.layout.activity_login_driver);
      sKeys.put("layout/activity_main_0", com.tawabsoft.taxi.driver.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.tawabsoft.taxi.driver.R.layout.activity_splash);
      sKeys.put("layout/activity_statistics_0", com.tawabsoft.taxi.driver.R.layout.activity_statistics);
      sKeys.put("layout/activity_travel_0", com.tawabsoft.taxi.driver.R.layout.activity_travel);
      sKeys.put("layout/activity_waiting_for_payment_0", com.tawabsoft.taxi.driver.R.layout.activity_waiting_for_payment);
      sKeys.put("layout/fragment_request_0", com.tawabsoft.taxi.driver.R.layout.fragment_request);
      sKeys.put("layout/item_document_0", com.tawabsoft.taxi.driver.R.layout.item_document);
      sKeys.put("layout/item_service_0", com.tawabsoft.taxi.driver.R.layout.item_service);
    }
  }
}
