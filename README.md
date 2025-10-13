# 项目介绍
Compose中的Material3组件常规使用示例。
androidx中的对应的catalog示例无法直接编译，该项目从androidx的catalog中提取核心模块，构建为一个完整的android项目，方便参考学习。
为了方便后续更新，该项目核心部分保持Androidx的示例相同的结构，后续更新直接复制粘贴核心模块。

# 项目组成部分
* 项目主模块，移除废弃的material部分
* app https://github.com/androidx/androidx/tree/androidx-main/compose/integration-tests/material-catalog
* 
* 项目核心模块，后续更新直接复制替换
* material3-catalog https://github.com/androidx/androidx/tree/androidx-main/compose/material3/material3/integration-tests/material3-catalog
* material3-samples https://github.com/androidx/androidx/tree/androidx-main/compose/material3/material3/samples
* 
* 项目辅助模块，核心项目必须的依赖，更新频率低，比对androidx中的示例部分做了简化合并
* assist:adaptive-samples
* https://github.com/androidx/androidx/tree/androidx-main/compose/material3/adaptive/samples
* https://github.com/androidx/androidx/tree/androidx-main/compose/material3/material3-adaptive-navigation-suite/samples
* assist:annotation-sampled
* https://github.com/androidx/androidx/tree/androidx-main/annotation/annotation-sampled


# 项目更新
* 2025.10.13