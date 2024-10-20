// Generated by view binder compiler. Do not edit!
package com.example.xhaw_androiddevelopment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.xhaw_androiddevelopment.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView aboutUsIcon;

  @NonNull
  public final TextView aboutUsLabel;

  @NonNull
  public final LinearLayout aboutUsLayout;

  @NonNull
  public final ImageView backIcon;

  @NonNull
  public final Button button2;

  @NonNull
  public final ImageView cartIcon;

  @NonNull
  public final TextView cartLabel;

  @NonNull
  public final LinearLayout cartLayout;

  @NonNull
  public final ImageView contactUsIcon;

  @NonNull
  public final TextView contactUsLabel;

  @NonNull
  public final LinearLayout contactUsLayout;

  @NonNull
  public final LinearLayout courseLayout;

  @NonNull
  public final ImageView coursesIcon;

  @NonNull
  public final ImageView homeIcon;

  @NonNull
  public final TextView homeLabel;

  @NonNull
  public final LinearLayout homeLayout;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout6;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView txtHome;

  @NonNull
  public final TextView txtHome1;

  @NonNull
  public final TextView txtName1;

  @NonNull
  public final TextView txtName2;

  @NonNull
  public final TextView txtName3;

  @NonNull
  public final TextView txtName4;

  private ActivityCheckoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView aboutUsIcon, @NonNull TextView aboutUsLabel,
      @NonNull LinearLayout aboutUsLayout, @NonNull ImageView backIcon, @NonNull Button button2,
      @NonNull ImageView cartIcon, @NonNull TextView cartLabel, @NonNull LinearLayout cartLayout,
      @NonNull ImageView contactUsIcon, @NonNull TextView contactUsLabel,
      @NonNull LinearLayout contactUsLayout, @NonNull LinearLayout courseLayout,
      @NonNull ImageView coursesIcon, @NonNull ImageView homeIcon, @NonNull TextView homeLabel,
      @NonNull LinearLayout homeLayout, @NonNull ImageView imageView4,
      @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout6,
      @NonNull ConstraintLayout main, @NonNull TableLayout tableLayout, @NonNull TextView txtHome,
      @NonNull TextView txtHome1, @NonNull TextView txtName1, @NonNull TextView txtName2,
      @NonNull TextView txtName3, @NonNull TextView txtName4) {
    this.rootView = rootView;
    this.aboutUsIcon = aboutUsIcon;
    this.aboutUsLabel = aboutUsLabel;
    this.aboutUsLayout = aboutUsLayout;
    this.backIcon = backIcon;
    this.button2 = button2;
    this.cartIcon = cartIcon;
    this.cartLabel = cartLabel;
    this.cartLayout = cartLayout;
    this.contactUsIcon = contactUsIcon;
    this.contactUsLabel = contactUsLabel;
    this.contactUsLayout = contactUsLayout;
    this.courseLayout = courseLayout;
    this.coursesIcon = coursesIcon;
    this.homeIcon = homeIcon;
    this.homeLabel = homeLabel;
    this.homeLayout = homeLayout;
    this.imageView4 = imageView4;
    this.linearLayout2 = linearLayout2;
    this.linearLayout6 = linearLayout6;
    this.main = main;
    this.tableLayout = tableLayout;
    this.txtHome = txtHome;
    this.txtHome1 = txtHome1;
    this.txtName1 = txtName1;
    this.txtName2 = txtName2;
    this.txtName3 = txtName3;
    this.txtName4 = txtName4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_checkout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_us_icon;
      ImageView aboutUsIcon = ViewBindings.findChildViewById(rootView, id);
      if (aboutUsIcon == null) {
        break missingId;
      }

      id = R.id.about_us_label;
      TextView aboutUsLabel = ViewBindings.findChildViewById(rootView, id);
      if (aboutUsLabel == null) {
        break missingId;
      }

      id = R.id.about_us_layout;
      LinearLayout aboutUsLayout = ViewBindings.findChildViewById(rootView, id);
      if (aboutUsLayout == null) {
        break missingId;
      }

      id = R.id.back_icon;
      ImageView backIcon = ViewBindings.findChildViewById(rootView, id);
      if (backIcon == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.cart_icon;
      ImageView cartIcon = ViewBindings.findChildViewById(rootView, id);
      if (cartIcon == null) {
        break missingId;
      }

      id = R.id.cart_label;
      TextView cartLabel = ViewBindings.findChildViewById(rootView, id);
      if (cartLabel == null) {
        break missingId;
      }

      id = R.id.cart_layout;
      LinearLayout cartLayout = ViewBindings.findChildViewById(rootView, id);
      if (cartLayout == null) {
        break missingId;
      }

      id = R.id.contact_us_icon;
      ImageView contactUsIcon = ViewBindings.findChildViewById(rootView, id);
      if (contactUsIcon == null) {
        break missingId;
      }

      id = R.id.contact_us_label;
      TextView contactUsLabel = ViewBindings.findChildViewById(rootView, id);
      if (contactUsLabel == null) {
        break missingId;
      }

      id = R.id.contact_us_layout;
      LinearLayout contactUsLayout = ViewBindings.findChildViewById(rootView, id);
      if (contactUsLayout == null) {
        break missingId;
      }

      id = R.id.course_layout;
      LinearLayout courseLayout = ViewBindings.findChildViewById(rootView, id);
      if (courseLayout == null) {
        break missingId;
      }

      id = R.id.courses_icon;
      ImageView coursesIcon = ViewBindings.findChildViewById(rootView, id);
      if (coursesIcon == null) {
        break missingId;
      }

      id = R.id.home_icon;
      ImageView homeIcon = ViewBindings.findChildViewById(rootView, id);
      if (homeIcon == null) {
        break missingId;
      }

      id = R.id.home_label;
      TextView homeLabel = ViewBindings.findChildViewById(rootView, id);
      if (homeLabel == null) {
        break missingId;
      }

      id = R.id.home_layout;
      LinearLayout homeLayout = ViewBindings.findChildViewById(rootView, id);
      if (homeLayout == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout6;
      LinearLayout linearLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout6 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.txtHome;
      TextView txtHome = ViewBindings.findChildViewById(rootView, id);
      if (txtHome == null) {
        break missingId;
      }

      id = R.id.txtHome1;
      TextView txtHome1 = ViewBindings.findChildViewById(rootView, id);
      if (txtHome1 == null) {
        break missingId;
      }

      id = R.id.txtName1;
      TextView txtName1 = ViewBindings.findChildViewById(rootView, id);
      if (txtName1 == null) {
        break missingId;
      }

      id = R.id.txtName2;
      TextView txtName2 = ViewBindings.findChildViewById(rootView, id);
      if (txtName2 == null) {
        break missingId;
      }

      id = R.id.txtName3;
      TextView txtName3 = ViewBindings.findChildViewById(rootView, id);
      if (txtName3 == null) {
        break missingId;
      }

      id = R.id.txtName4;
      TextView txtName4 = ViewBindings.findChildViewById(rootView, id);
      if (txtName4 == null) {
        break missingId;
      }

      return new ActivityCheckoutBinding((ConstraintLayout) rootView, aboutUsIcon, aboutUsLabel,
          aboutUsLayout, backIcon, button2, cartIcon, cartLabel, cartLayout, contactUsIcon,
          contactUsLabel, contactUsLayout, courseLayout, coursesIcon, homeIcon, homeLabel,
          homeLayout, imageView4, linearLayout2, linearLayout6, main, tableLayout, txtHome,
          txtHome1, txtName1, txtName2, txtName3, txtName4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
