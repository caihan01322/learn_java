# 为vscode配置Java环境

## 安装JDK  
首先你需要安装一个`JDK`，这次我们以`JDK1.8.0`为例进行我们的笔记。

## 为JDK添加环境变量
你需要将`JDK`添加进环境变量，一般这一步安装过程中会自动为你完成。

## 安装vscode
你可以在微软官网上下载`vscode`，或者搜索`vscode`进行下载。

## 安装vscode中文语言包
打开`vscode`，会提示安装中文语言包。或者在插件中心搜索`chinese`安装。

## 安装vscode插件
在`vscode`中，新建一个以`java`为拓展名的文件，`vscode`会提示你安装`java`插件，你可以进行安装，当然你也可以不安装使用命令行进行编译运行。

## 为什么我不用IDEA或者Eclipse？
- `IDEA`和`Eclipse`也是可以的选择，你也可以选择使用它们。
- 但是，`IDEA`和`Eclipse`比`VScode`大很多，而刚开始学习时不需要那么多功能。
- 并且，`IDEA`和`Eclipse`比`VScode`启动速度慢很多。
- 推荐将`vscode`的快捷键设置成和`IDEA`一致，为之后转用`IDEA`打下基础。

## 怎么在命令行编译运行Java文件
- 使用指令`javac HelloWorld.java`编译名字为`HelloWorld`的`java`文件。
- 使用指令`java HelloWorld`运行名字为`HelloWorld`的`class`文件。
- 关于命令行的更多功能会在今后的笔记中出现，当然，你也可以自行查阅相关资料。

## 怎么使用vscode插件运行Java文件  
- 在`java`文件的`main`函数上面会出现一个`Run`和一个`Debug`按钮，使用`Run`即可运行代码。

## 为什么我没有出现Run按钮  
- 检查是否安装了插件。
- 检查主函数是否写错。