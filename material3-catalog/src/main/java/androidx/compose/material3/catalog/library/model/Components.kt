/*
 * Copyright 2021 The Android Open Source Project
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

package androidx.compose.material3.catalog.library.model

import androidx.annotation.DrawableRes
import androidx.compose.material3.catalog.library.R
import androidx.compose.material3.catalog.library.util.AdaptiveGuidelinesUrl
import androidx.compose.material3.catalog.library.util.AdaptiveNavigationSuiteMaterial3SourceUrl
import androidx.compose.material3.catalog.library.util.AdaptiveSourceUrl
import androidx.compose.material3.catalog.library.util.ComponentGuidelinesUrl
import androidx.compose.material3.catalog.library.util.DocsUrl
import androidx.compose.material3.catalog.library.util.Material3SourceUrl
import androidx.compose.material3.catalog.library.util.PackageSummaryUrl
import androidx.compose.material3.catalog.library.util.StyleGuidelinesUrl

data class Component(
    val id: Int,
    val name: String,
    val description: String,
    @DrawableRes val icon: Int = R.drawable.ic_component,
    val tintIcon: Boolean = true,
    val guidelinesUrl: String,
    val docsUrl: String,
    val sourceUrl: String,
    val examples: List<Example>,
) {
    /** True if the component has expressive examples, false otherwise. */
    val hasExpressiveExamples: Boolean
        get() {
            return examples.any { it.isExpressive }
        }
}

private var nextId: Int = 1

private fun nextId(): Int = nextId.also { nextId += 1 }

// Components are ordered alphabetically by name.

private val Adaptive =
    Component(
        id = nextId(),
        name = "Adaptive",
        description =
            "Adaptive scaffolds provides automatic layout adjustment on different window size " +
                "classes and postures.\n\n" +
                "Note: this sample is better experienced in a resizable emulator or foldable device.",
        // No adaptive icon
        guidelinesUrl = "$AdaptiveGuidelinesUrl/understanding-layout/overview",
        docsUrl = "$DocsUrl/adaptive",
        sourceUrl = "$AdaptiveSourceUrl/ThreePaneScaffold.kt",
        examples = AdaptiveExamples,
    )

private val Badge =
    Component(
        id = nextId(),
        name = "Badge",
        description =
            "A badge can contain dynamic information, such as the presence of a new " +
                "notification or a number of pending requests. Badges can be icon only or contain " +
                "a short text.",
        // No badge icon
        guidelinesUrl = "$ComponentGuidelinesUrl/badge",
        docsUrl = "$DocsUrl#badge",
        sourceUrl = "$Material3SourceUrl/Badge.kt",
        examples = BadgeExamples,
    )

private val BottomAppBars =
    Component(
        id = nextId(),
        name = "Bottom App Bar",
        description =
            "A bottom app bar displays navigation and key actions at the bottom of mobile " +
                "screens.",
        // No bottom app bar icon
        guidelinesUrl = "$ComponentGuidelinesUrl/bottom-app-bars",
        docsUrl = "$DocsUrl#bottomappbar",
        sourceUrl = "$Material3SourceUrl/AppBar.kt",
        examples = BottomAppBarsExamples,
    )

private val BottomSheets =
    Component(
        id = nextId(),
        name = "Bottom Sheet",
        description =
            "Bottom sheets are surfaces containing supplementary content, anchored to the " +
                "bottom of the screen.",
        // No bottom sheet icon
        guidelinesUrl = "$ComponentGuidelinesUrl/bottom-sheets",
        docsUrl = "$DocsUrl#bottomsheet",
        sourceUrl = "$Material3SourceUrl/ModalBottomSheet.android.kt",
        examples = BottomSheetExamples,
    )

private val Buttons =
    Component(
        id = nextId(),
        name = "Buttons",
        description =
            "Buttons help people initiate actions, from sending an email, to sharing a " +
                "document, to liking a post.",
        // No buttons icon
        guidelinesUrl = "$ComponentGuidelinesUrl/buttons",
        docsUrl = "$PackageSummaryUrl#button",
        sourceUrl = "$Material3SourceUrl/Button.kt",
        examples = ButtonsExamples,
    )

private val ButtonGroups =
    Component(
        id = nextId(),
        name = "Button Groups",
        description =
            "button groups is a container for material components that adds an animation on press",
        guidelinesUrl = "$ComponentGuidelinesUrl/button-groups",
        docsUrl = "$PackageSummaryUrl#buttongroups",
        sourceUrl = "$Material3SourceUrl/ButtonGroup.kt",
        examples = ButtonGroupsExamples,
    )

private val Card =
    Component(
        id = nextId(),
        name = "Card",
        description = "Cards contain content and actions that relate information about a subject.",
        // No card icon
        guidelinesUrl = "$StyleGuidelinesUrl/cards",
        docsUrl = "$PackageSummaryUrl#card",
        sourceUrl = "$Material3SourceUrl/Card.kt",
        examples = CardExamples,
    )

private val Carousel =
    Component(
        id = nextId(),
        name = "Carousel",
        description =
            "Carousels are stylized versions of lists that provide a unique viewing and " +
                "behavior that suit large imagery and other visually rich content.",
        // No carousel icon
        guidelinesUrl = "$StyleGuidelinesUrl/carousel",
        docsUrl = "$PackageSummaryUrl#carousel",
        sourceUrl = "$Material3SourceUrl/Carousel.kt",
        examples = CarouselExamples,
    )

private val Checkboxes =
    Component(
        id = nextId(),
        name = "Checkboxes",
        description =
            "Checkboxes allow the user to select one or more items from a set or turn an " +
                "option on or off.",
        // No checkbox icon
        guidelinesUrl = "$ComponentGuidelinesUrl/checkboxes",
        docsUrl = "$DocsUrl#checkbox",
        sourceUrl = "$Material3SourceUrl/Checkbox.kt",
        examples = CheckboxesExamples,
    )

private val Chips =
    Component(
        id = nextId(),
        name = "Chips",
        description =
            "Chips allow users to enter information, make selections, filter content, or" +
                " trigger actions.",
        // No chip icon
        guidelinesUrl = "$ComponentGuidelinesUrl/chips",
        docsUrl = "$DocsUrl#chips",
        sourceUrl = "$Material3SourceUrl/Chip.kt",
        examples = ChipsExamples,
    )

private val DatePickers =
    Component(
        id = nextId(),
        name = "Date pickers",
        description = "Date pickers let users select a date or range of dates.",
        // No date picker icon
        guidelinesUrl = "$ComponentGuidelinesUrl/datepicker",
        docsUrl = "$PackageSummaryUrl#datepicker",
        sourceUrl = "$Material3SourceUrl/DatePicker.kt",
        examples = DatePickerExamples,
    )

private val Dialogs =
    Component(
        id = nextId(),
        name = "Dialogs",
        description =
            "Dialogs provide important prompts in a user flow. They can require an action, " +
                "communicate information, or help users accomplish a task.",
        // No dialogs icon
        guidelinesUrl = "$ComponentGuidelinesUrl/dialogs",
        docsUrl = "$PackageSummaryUrl#alertdialog",
        sourceUrl = "$Material3SourceUrl/AlertDialog.kt",
        examples = DialogExamples,
    )

private val ExtendedFloatingActionButton =
    Component(
        id = nextId(),
        name = "Extended FAB",
        description =
            "Extended FABs help people take primary actions. They're wider than FABs to " +
                "accommodate a text label and larger target area.",
        // No extended FAB icon
        guidelinesUrl = "$ComponentGuidelinesUrl/extended-fab",
        docsUrl = "$PackageSummaryUrl#extendedfloatingactionbutton",
        sourceUrl = "$Material3SourceUrl/FloatingActionButton.kt",
        examples = ExtendedFABExamples,
    )

private val FloatingActionButtons =
    Component(
        id = nextId(),
        name = "Floating action buttons",
        description =
            "The FAB represents the most important action on a screen. It puts key actions " +
                "within reach.",
        // No FABs icon
        guidelinesUrl = "$ComponentGuidelinesUrl/floating-action-button",
        docsUrl = "$PackageSummaryUrl#floatingactionbutton",
        sourceUrl = "$Material3SourceUrl/FloatingActionButton.kt",
        examples = FloatingActionButtonsExamples,
    )

private val FloatingActionButtonMenu =
    Component(
        id = nextId(),
        name = "FAB Menu",
        description = "The FAB Menu displays additional key actions on click of a FAB.",
        // No FAB Menu icon
        guidelinesUrl = "$ComponentGuidelinesUrl/fab-menu",
        docsUrl = "$PackageSummaryUrl#floatingactionbuttonmenu",
        sourceUrl = "$Material3SourceUrl/FloatingActionButtonMenu.kt",
        examples = FloatingActionButtonMenuExamples,
    )

private val FloatingToolbars =
    Component(
        id = nextId(),
        name = "Floating Toolbar",
        description = "A floating toolbar displays key actions above the content.",
        // No floating app bar icon
        guidelinesUrl = "$ComponentGuidelinesUrl/floating-toolbars",
        docsUrl = "$DocsUrl#floatingtoolbar",
        sourceUrl = "$Material3SourceUrl/FloatingToolbar.kt",
        examples = FloatingToolbarsExamples,
    )

private val IconButtons =
    Component(
        id = nextId(),
        name = "Icon buttons",
        description =
            "Icon buttons allow users to take actions and make choices with a single tap.",
        // No icon-button icon
        guidelinesUrl = "$ComponentGuidelinesUrl/icon-button",
        docsUrl = "$PackageSummaryUrl#iconbutton",
        sourceUrl = "$Material3SourceUrl/IconButton.kt",
        examples = IconButtonExamples,
    )

private val Lists =
    Component(
        id = nextId(),
        name = "Lists",
        description = "Lists are continuous, vertical indexes of text or images.",
        // No ListItem icon
        tintIcon = true,
        guidelinesUrl = "$ComponentGuidelinesUrl/list-item",
        docsUrl = "$PackageSummaryUrl#listitem",
        sourceUrl = "$Material3SourceUrl/ListItem.kt",
        examples = ListsExamples,
    )

private val LoadingIndicators =
    Component(
        id = nextId(),
        name = "Loading indicators",
        description =
            "Loading indicators express an unspecified wait time or display the length of " +
                "a loading process.",
        // No loading indicator icon
        guidelinesUrl = "$ComponentGuidelinesUrl/loading-indicators",
        tintIcon = true,
        docsUrl = "$PackageSummaryUrl#loadingindicator",
        sourceUrl = "$Material3SourceUrl/LoadingIndicator.kt",
        examples = LoadingIndicatorsExamples,
    )

private val Menus =
    Component(
        id = nextId(),
        name = "Menus",
        description = "Menus display a list of choices on temporary surfaces.",
        // No menu icon
        guidelinesUrl = "$ComponentGuidelinesUrl/menus",
        docsUrl = "$PackageSummaryUrl#dropdownmenu",
        sourceUrl = "$Material3SourceUrl/Menu.kt",
        examples = MenusExamples,
    )

private val NavigationBar =
    Component(
        id = nextId(),
        name = "Navigation bar",
        description =
            "Navigation bars offer a persistent and convenient way to switch between " +
                "primary destinations in an app.",
        // No navigation bar icon
        guidelinesUrl = "$ComponentGuidelinesUrl/navigation-bar",
        docsUrl = "$PackageSummaryUrl#navigationbar",
        sourceUrl = "$Material3SourceUrl/NavigationBar.kt",
        examples = NavigationBarExamples,
    )

private val NavigationDrawer =
    Component(
        id = nextId(),
        name = "Navigation drawer",
        description = "Navigation drawers provide ergonomic access to destinations in an app.",
        // No navigation drawer icon
        guidelinesUrl = "$ComponentGuidelinesUrl/navigation-drawer",
        docsUrl = "$PackageSummaryUrl#navigationdrawer",
        sourceUrl = "$Material3SourceUrl/NavigationDrawer.kt",
        examples = NavigationDrawerExamples,
    )

private val NavigationRail =
    Component(
        id = nextId(),
        name = "Navigation rail",
        description =
            "Navigation rails provide access to primary destinations in apps when using " +
                "tablet and desktop screens.",
        // No navigation rail icon
        guidelinesUrl = "$ComponentGuidelinesUrl/navigation-rail",
        docsUrl = "$PackageSummaryUrl#navigationrail",
        sourceUrl = "$Material3SourceUrl/NavigationRail.kt",
        examples = NavigationRailExamples,
    )

private val NavigationSuiteScaffold =
    Component(
        id = nextId(),
        name = "Navigation Suite Scaffold",
        description =
            "The Navigation Suite Scaffold wraps the provided content and places the " +
                "adequate provided navigation component on the screen according to the current " +
                "NavigationSuiteType. \n\n" +
                "Note: this sample is better experienced in a resizable emulator or foldable device.",
        // No navigation suite scaffold icon
        guidelinesUrl = "", // TODO: Add guidelines url when available
        docsUrl = "", // TODO: Add docs url when available
        sourceUrl = "$AdaptiveNavigationSuiteMaterial3SourceUrl/NavigationSuiteScaffold.kt",
        examples = NavigationSuiteScaffoldExamples,
    )

private val ProgressIndicators =
    Component(
        id = nextId(),
        name = "Progress indicators",
        description =
            "Progress indicators express an unspecified wait time or display the length of " +
                "a process.",
        // No progress indicator icon
        guidelinesUrl = "$ComponentGuidelinesUrl/progress-indicators",
        docsUrl = "$DocsUrl#circularprogressindicator",
        sourceUrl = "$Material3SourceUrl/ProgressIndicator.kt",
        examples = ProgressIndicatorsExamples,
    )

private val PullToRefreshIndicators =
    Component(
        id = nextId(),
        name = "Pull-to-Refresh Indicator",
        description =
            "Pull to refresh is a swipe gesture available at the beginning of lists, grid " +
                "lists, and card collections where the most recent content appears ",
        // No pull-to-refresh icon
        // TODO: Request component guidelines documentation from design.
        guidelinesUrl = "",
        docsUrl = "$DocsUrl#pulltorefreshcontainer",
        sourceUrl = "$Material3SourceUrl/PullToRefresh.kt",
        examples = PullToRefreshExamples,
    )

private val RadioButtons =
    Component(
        id = nextId(),
        name = "Radio buttons",
        description = "Radio buttons allow the user to select one option from a set.",
        // No radio-button icon
        guidelinesUrl = "$ComponentGuidelinesUrl/radio-buttons",
        docsUrl = "$DocsUrl#radiobutton",
        sourceUrl = "$Material3SourceUrl/RadioButton.kt",
        examples = RadioButtonsExamples,
    )

private val SearchBars =
    Component(
        id = nextId(),
        name = "Search bars",
        description =
            "Search bars allow users to enter a keyword or phrase and get relevant " +
                "information.",
        // No search bar icon
        guidelinesUrl = "", // No guidelines yet
        docsUrl = "", // No docs yet
        sourceUrl = "$Material3SourceUrl/SearchBar.kt",
        examples = SearchBarExamples,
    )

private val SegmentedButtons =
    Component(
        id = nextId(),
        name = "Segmented Button",
        description =
            "Segmented buttons help people select options, switch views, or sort elements.",
        guidelinesUrl = "", // No guidelines yet
        docsUrl = "", // No docs yet
        sourceUrl = "$Material3SourceUrl/SegmentedButton.kt",
        examples = SegmentedButtonExamples,
    )

private val ToggleButtons =
    Component(
        id = nextId(),
        name = "ToggleButtons",
        description = "Toggle buttons provide a selectable button that animates on press.",
        guidelinesUrl = "", // No guidelines yet
        docsUrl = "", // No docs yet
        sourceUrl = "$Material3SourceUrl/ToggleButton.kt",
        examples = ToggleButtonsExamples,
    )

private val Sliders =
    Component(
        id = nextId(),
        name = "Sliders",
        description = "Sliders allow users to make selections from a range of values.",
        // No slider icon
        guidelinesUrl = "", // No guidelines yet
        docsUrl = "", // No docs yet
        sourceUrl = "$Material3SourceUrl/Slider.kt",
        examples = SlidersExamples,
    )

private val Snackbars =
    Component(
        id = nextId(),
        name = "Snackbars",
        description =
            "Snackbars provide brief messages about app processes at the bottom of the " +
                "screen.",
        // No snackbar icon
        guidelinesUrl = "$ComponentGuidelinesUrl/snackbars",
        docsUrl = "$DocsUrl#snackbar",
        sourceUrl = "$Material3SourceUrl/Snackbar.kt",
        examples = SnackbarsExamples,
    )

private val SplitButtons =
    Component(
        id = nextId(),
        name = "Split Button",
        description = "Split buttons let user perform additional actions besides the main action",
        guidelinesUrl = "", // No guidelines yet
        docsUrl = "", // No docs yet
        sourceUrl = "$Material3SourceUrl/SplitButton.kt",
        examples = SplitButtonExamples,
    )

private val Switches =
    Component(
        id = nextId(),
        name = "Switches",
        description = "Switches toggle the state of a single setting on or off.",
        // No switch icon
        // No guidelines yet
        guidelinesUrl = "",
        docsUrl = "",
        sourceUrl = "$Material3SourceUrl/Switch.kt",
        examples = SwitchExamples,
    )

private val Tabs =
    Component(
        id = nextId(),
        name = "Tabs",
        description =
            "Tabs organize content across different screens, data sets, and other " +
                "interactions.",
        // No tabs icon
        guidelinesUrl = "$ComponentGuidelinesUrl/tabs",
        docsUrl = "$DocsUrl#tab",
        sourceUrl = "$Material3SourceUrl/Tab.kt",
        examples = TabsExamples,
    )

private val TextFields =
    Component(
        id = nextId(),
        name = "Text fields",
        description = "Text fields let users enter and edit text.",
        // No text fields icon
        guidelinesUrl = "$ComponentGuidelinesUrl/text-fields",
        docsUrl = "$DocsUrl#textfield",
        sourceUrl = "$Material3SourceUrl/TextField.kt",
        examples = TextFieldsExamples,
    )

private val Tooltips =
    Component(
        id = nextId(),
        name = "Tooltips",
        description = "Tooltips call user attention to an anchor component.",
        // no tooltips icon
        guidelinesUrl = "$ComponentGuidelinesUrl/tooltips",
        docsUrl = "$PackageSummaryUrl#tooltip",
        sourceUrl = "$Material3SourceUrl/Tooltip.kt",
        examples = TooltipsExamples,
    )

private val TimePickers =
    Component(
        id = nextId(),
        name = "Time Picker",
        description = "Time picker allows the user to choose time of day.",
        // No time picker icon
        guidelinesUrl = "$ComponentGuidelinesUrl/time-picker",
        docsUrl = "$DocsUrl#time-pickers",
        sourceUrl = "$Material3SourceUrl/TimePicker.kt",
        examples = TimePickerExamples,
    )

private val TopAppBar =
    Component(
        id = nextId(),
        name = "Top app bar",
        description = "Top app bars display information and actions at the top of a screen.",
        // No top app bar icon
        guidelinesUrl = "$ComponentGuidelinesUrl/top-app-bar",
        docsUrl = "$PackageSummaryUrl#smalltopappbar",
        sourceUrl = "$Material3SourceUrl/AppBar.kt",
        examples = TopAppBarExamples,
    )

/** Components for the catalog, ordered alphabetically by name. */
val Components =
    listOf(

        //常用组件
        TextFields,

        /**
         * 类型：Button,TextButton,FilledButton,outlinedButton,FilledTonalButton
         *  Button布局中支持添加icon
         */
        Buttons,

        /**
         * 类型：IconButton,FilledIconButton,outlinedIconButton,FilledTonalIconButton
         * IconToggleButton,FilledIconToggleButton,outlinedIconToggleButton,FilledTonalIconToggleButton
         *
         */
        IconButtons,

        /**
         * 尺寸：标准，大，中，小
         * 样式:半圆，圆角，文字，icon
         * 类型: elevated，outlined，Tonal
         */
        ToggleButtons,

        /**
         * 尺寸：标准，大，中，小
         * 动画：animateFloatingActionButton
         */
        FloatingActionButtons,

        /**
         * ExtendedFloatingActionButton
         * 根据组件的状态设置是否展开
         */
        ExtendedFloatingActionButton,

        /**
         * button集合，有两种实现方式
         * 1、使用ButtonGroup，需要处理溢出逻辑
         * 2、使用FlowRow+ToggleButton，可可以实现单选和多选
         */
        ButtonGroups,
        /**
         * 多选一按钮
         * 1、与java不同，移除RadioGroup,使用Row，Column中Modifier.selectableGroup()控制选中
         * 2、RadioButton控制按钮，文字使用Text
         */
        RadioButtons,

        /**
         * SplitButtonLayout定义前后按钮实现
         * trailing布局需要定义动画逻辑
         */
        SplitButtons,

        /**
         * 多个块状按钮选择，单选和多选，默认是有icon，支持自定义icon
         * SingleChoiceSegmentedButtonRow
         * MultiChoiceSegmentedButtonRow
         * SegmentedButton
         */
        SegmentedButtons,

        /**
         * 多选多按钮
         * 1、与java不同，移除CheckBoxGroup，使用Row，Column中modifier =
         *                 Modifier.triStateToggleable(
         *                     state = parentState,
         *                     onClick = onParentClick,
         *                     role = Role.Checkbox,
         *                 ),
         * 2、CheckBox控制按钮，文字使用Text
         * 3、TriStateCheckbox三态按钮控制全选，全不选，部分选
         */
        Checkboxes,

        /**
         * 切换按钮switch
         * 支持设置icon thumbContent
         */
        Switches,

        /**
         * 角标
         * 通过BadgeBox+Badge实现
         */
        Badge,

        /**
         * 卡片Card+Box
         * 样式：elevated，outlined，filled
         */
        Card,

        /**
         * 类型：AssistChip+FilterChip+InputChip+SuggestionChip
         */
        Chips,



        //常用布局
        /**
         * 下拉菜单，DropdownMenu，ExposedDropdownMenu，DropdownMenuItem
         * expanded控制显示隐藏
         * 样式，位置，大小可以自定义。
         */
        Menus,
        /**
         * 悬浮按钮菜单使用FloatingActionButtonMenu，FloatingActionButtonMenuItem组件
         */
        FloatingActionButtonMenu,
        /**
         * 建议搭配Scaffold组件使用
         * TopAppBar组成title，subtitle，navigationIcon（最左边），action（最右边），一般使用IconButton填充
         * 当action存在多个时，使用AppBarRow自适应布局
         * 标题居中：使用CenterAlignedTopAppBar或者titleHorizontalAlignment = Alignment.CenterHorizontally,
         * 可以添加滚动时，定义TopAppBar的行为。TopAppBarDefaults
         *  a.对定在顶部。 pinnedScrollBehavior
         *  b.向下滚动时，消失，向上滚动时，显示。enterAlwaysScrollBehavior
         *  c.标题展开收起。exitUntilCollapsedScrollBehavior
         * 滚动时要求展开和还原的标题不一样，使用TwoRowsTopAppBar
         */
        TopAppBar,
        /**
         * 底部导航栏，建议搭配Scaffold组件使用
         * 组成actions（最左边），floatingActionButton（最右边），
         * 多个操作使用FlexibleBottomAppBar，根据宽度自动收起和隐藏
         * 可以添加滚动时，定义BottomAppBar的行为。BottomAppBarDefaults
         */
        BottomAppBars,
        /**
         * 有两种形式
         * 1、中间图标+前后两边图标
         * 2、悬浮按钮+列表图标
         */
        FloatingToolbars,

        Tabs,
        NavigationBar,
        NavigationDrawer,
        NavigationRail,
        NavigationSuiteScaffold,



        //公共控件
        /**
         * AlterDialog默认样式标题靠左，居中显示，按钮靠右。
         * 实践
         * 布局不可设置，其他样式使用BasicAlertDialog自定义布局。
         * 弹窗显示隐藏使用内部变量控制。
         */
        Dialogs,
        /**
         * 1、建议搭配Scaffold组件使用
         * 2、使用SnackbarHost，snackbarHostState调用
         * 3、必须在协程中调用
         *
         * 实践
         *  1、点击屏幕外，Snackbar不会消失
         *  2、多次点击，不会立即覆盖，排队等待。与Toast逻辑不一致
         */
        Snackbars,

        Lists,
        PullToRefreshIndicators,
        ProgressIndicators,
        LoadingIndicators,


        //其他
        SearchBars,
        Adaptive,
        BottomSheets,
        Carousel,
        DatePickers,
        TimePickers,
        Sliders,
        Tooltips,
    )
/**
 * 感悟
 * 1、类型派生
 *     例如：
 * 2、显示与状态隔离，
 *    例如TopAppBar，BottomAppBar中的显示与滚动逻辑分离
 * 3、容器与item隔离，
 * 4、UI的交互存在耗时操作时，要添加防抖提示操作 ，避免用户操作过快
 * 5、组件与组件的隔离，通过层层嵌套实现复杂的UI
 * 6、组件内不同的类型，通过modify等参数来实现
 *
 * ==================================
 * UI的核心：颜色，外观，运动，排版，icon，高度
 *
 */