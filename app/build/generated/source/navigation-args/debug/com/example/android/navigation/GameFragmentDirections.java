package com.example.android.navigation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGameFragmentToGameOverFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameFragment_to_gameOverFragment);
  }

  @NonNull
  public static NavDirections actionGameFragmentToGameWonFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameFragment_to_gameWonFragment);
  }
}
