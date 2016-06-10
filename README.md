# BasicMapActivity
高德地图-基础地图显示
1.添加高德地图的so文件和jar包放入libs目录下，对于每个jar文件，右键-选择Add As Library，导入到工程中。

2.build.gradle中需要进行如下配置： android{ sourceSets { main { jniLibs.srcDirs = ['libs'] } } }

3.通过Android Studio编译器获取debug.keystore的SHA1需查看高德地图的的详情说明

debug.keystore默认路径在 C:\Users\电脑用户名.android\debug.keystore
