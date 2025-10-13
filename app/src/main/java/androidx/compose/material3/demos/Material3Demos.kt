/*
 * Copyright 2022 The Android Open Source Project
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

package androidx.compose.material3.demos

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.catalog.library.NavGraph
import androidx.compose.material3.catalog.library.data.UserPreferencesRepository
import androidx.compose.material3.catalog.library.model.Theme
import androidx.compose.material3.catalog.library.ui.theme.CatalogTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.launch

val Material3Demos =
    DemoCategory(
        "Material 3",
        listOf(
            ComposableDemo("Button Groups") { ButtonGroupDemos() },
            ComposableDemo("Color Scheme") { ColorSchemeDemo() },
            ComposableDemo("FAB Menu") { FloatingActionButtonMenuDemo() },
            ComposableDemo("Pull To Refresh") { PullToRefreshDemo() },
            ComposableDemo("Swipe To Dismiss") { SwipeToDismissDemo() },
            ComposableDemo("Tooltip") { TooltipDemo() },
            ComposableDemo("Toggle Buttons") { ToggleButtonDemos() },
            ComposableDemo("Text fields") { MaterialTextFieldDemo() },
            DemoCategory(
                "Icon Buttons",
                listOf(
                    ComposableDemo("Sizes") { IconButtonMeasurementsDemo() },
                    ComposableDemo("Corners") { IconButtonCornerRadiusDemo() },
                    ComposableDemo("Icon button & icon toggle buttons") {
                        IconButtonAndToggleButtonsDemo()
                    },
                ),
            ),
            DemoCategory(
                "Shapes",
                listOf(
                    ComposableDemo("Shape") { ShapeDemo() },
                    ComposableDemo("Material Shape") { MaterialShapeDemo() },
                    ComposableDemo("Material Shape Morphing") { MaterialShapeMorphDemo() },
                ),
            ),
            ComposableDemo("Navigation Suite Scaffold") {
                NavigationSuiteScaffoldCustomConfigDemo()
            },
        ),
    )

@Composable
fun Material3Demo() {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val userPreferencesRepository = remember { UserPreferencesRepository(context) }
    val theme = userPreferencesRepository.theme.collectAsState(Theme()).value
    CatalogTheme(theme = theme) {
        /*NavGraph(
            null,
            theme = theme,
            onThemeChange = { coroutineScope.launch { userPreferencesRepository.saveTheme(it) } },
        )*/
        Material3Demos
    }
}