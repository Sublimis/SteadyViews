package lib.sublimis.steadyviews;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import lib.sublimis.steadyview.ISteadyView;

public class SteadySlidingPaneLayout extends SlidingPaneLayout implements ISteadyView
{
   public SteadySlidingPaneLayout(@NonNull final Context context)
   {
      super(context);

      ISteadyView.super.initSteadyView();
   }

   public SteadySlidingPaneLayout(@NonNull final Context context, @Nullable final AttributeSet attrs)
   {
      super(context, attrs);

      ISteadyView.super.initSteadyView();
   }

   public SteadySlidingPaneLayout(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyle)
   {
      super(context, attrs, defStyle);

      ISteadyView.super.initSteadyView();
   }

   @Override
   public boolean performAccessibilityAction(final int action, @Nullable final Bundle arguments)
   {
      final boolean status = ISteadyView.super.performSteadyViewAction(action, arguments);

      return super.performAccessibilityAction(action, arguments) || status;
   }
}
