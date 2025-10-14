/*
 * Copyright 2020 The Android Open Source Project
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

package androidx.compose.integration.demos

import androidx.compose.integration.demos.common.DemoCategory
import androidx.compose.material3.demos.Material3Demos


/** [DemoCategory] containing all the top level demo categories. */
val AllDemosCategory =
    //fixme 其他组件库的demo后续补充
    DemoCategory(
        "Jetpack Compose Demos",
        listOf(
           /* AnimationDemos,
            FoundationDemos,
            CoreDemos,
            LayoutDemos,
            MaterialDemos,*/
            Material3Demos,
          /*  NavigationDemos,
            Navigation3Demos,
            PagingFoundationDemos,
            TextDemos,
            AccessibilityDemos,
            PerformanceDemos,*/
        ),
    )
