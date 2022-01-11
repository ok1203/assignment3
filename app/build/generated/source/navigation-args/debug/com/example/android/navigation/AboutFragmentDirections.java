package com.example.android.navigation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class AboutFragmentDirections {
  private AboutFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAboutFragmentToTitleFragment2() {
    return new ActionOnlyNavDirections(R.id.action_aboutFragment_to_titleFragment2);
  }
}
