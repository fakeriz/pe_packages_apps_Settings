/*
 * Copyright (C) 2017 The Android Open Source Project
 *
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

package com.android.settings.gestures;

import android.content.Context;

import com.android.settings.R;
import com.android.settingslib.core.AbstractPreferenceController;
import com.android.settingslib.core.lifecycle.Lifecycle;

import java.util.ArrayList;
import java.util.List;

public class AssistGestureFeatureProviderImpl implements AssistGestureFeatureProvider {

    @Override
    public boolean isSupported(Context context) {
        return false;
    }

    @Override
    public boolean isSensorAvailable(Context context) {
        return false;
    }

    @Override
    public int getPreferenceResourceId() {
        return R.xml.assist_gesture_settings;
    }

    @Override
    public List<AbstractPreferenceController> getControllers(Context context, Lifecycle lifecycle) {
        return new ArrayList<>();
    }

}
