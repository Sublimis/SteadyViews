/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lib.sublimis.steadyviews;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import lib.sublimis.steadyview.ISteadyView;

public class SteadyLinearLayout extends LinearLayout implements ISteadyView
{
	public SteadyLinearLayout(final Context context)
	{
		super(context);

		ISteadyView.super.initSteadyView();
	}

	public SteadyLinearLayout(final Context context, @Nullable final AttributeSet attrs)
	{
		super(context, attrs);

		ISteadyView.super.initSteadyView();
	}

	public SteadyLinearLayout(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr)
	{
		super(context, attrs, defStyleAttr);

		ISteadyView.super.initSteadyView();
	}

	public SteadyLinearLayout(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes)
	{
		super(context, attrs, defStyleAttr, defStyleRes);

		ISteadyView.super.initSteadyView();
	}

	@Override
	public boolean performAccessibilityAction(final int action, @Nullable final Bundle arguments)
	{
		final boolean status = ISteadyView.super.performSteadyViewAction(action, arguments);

		return super.performAccessibilityAction(action, arguments) || status;
	}
}
