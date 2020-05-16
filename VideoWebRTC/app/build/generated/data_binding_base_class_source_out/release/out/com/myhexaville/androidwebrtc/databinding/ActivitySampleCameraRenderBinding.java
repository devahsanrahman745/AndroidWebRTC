// Generated by data binding compiler. Do not edit!
package com.myhexaville.androidwebrtc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.myhexaville.androidwebrtc.R;
import java.lang.Deprecated;
import java.lang.Object;
import org.webrtc.SurfaceViewRenderer;

public abstract class ActivitySampleCameraRenderBinding extends ViewDataBinding {
  @NonNull
  public final SurfaceViewRenderer surfaceView;

  @NonNull
  public final Toolbar toolbar;

  protected ActivitySampleCameraRenderBinding(Object _bindingComponent, View _root,
      int _localFieldCount, SurfaceViewRenderer surfaceView, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.surfaceView = surfaceView;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivitySampleCameraRenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sample_camera_render, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySampleCameraRenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySampleCameraRenderBinding>inflateInternal(inflater, R.layout.activity_sample_camera_render, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySampleCameraRenderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sample_camera_render, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySampleCameraRenderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySampleCameraRenderBinding>inflateInternal(inflater, R.layout.activity_sample_camera_render, null, false, component);
  }

  public static ActivitySampleCameraRenderBinding bind(@NonNull View view) {
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
  public static ActivitySampleCameraRenderBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivitySampleCameraRenderBinding)bind(component, view, R.layout.activity_sample_camera_render);
  }
}
