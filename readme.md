#Android APP组件化Demo

随着APP的功能不断的迭代,业务越来越多,逻辑越来越复杂,APP越来越臃肿,臃肿的APP直接
导致一个问题:APK包越来越大.下面是小米应用商店的TOP应用,排除游戏应用,普通应用也越来越大

![Image](/app_list.png)

现在大部分地方都有WIFI,用户对APK的大小已经不再那么敏感,但是过大的APK包,意味着更多的资源,
更多的代码,以及更多的方法,同时也就意味着更长的编译,博主所开发的APK包目前是15M左右,编译时间已经
接近两分钟的时间.

而目前Android Studio的热启动并不是特别成熟,很多时候,代码修改了,运行后跟没有修改一样,有点像以前的Ecplise,
而这个时候又不能确定到底是自己修改的代码无效,还是工具没有真正的编译了修改的代码....所以现在这个功能食之无味,去之可惜.

故MDCC上冯老师提出关于组件化技术,本Demo是根据资料写的一个小demo


#项目结构

![Image](/main.png)

其实中androidlib与baseActivity是我自己创建的两个本地库,第一次类似工具库,第二个类似于base库

这样一来,就可以把业务,工具,主Module分离,达到组件化的目的

这两个[本地库](/applib.zip)在项目的根目录,可解压放到这个[maven](/build.gradle)指定的目录下


参考资料:
[关于Android业务组件化的一些思考](http://zjutkz.net/2016/10/07/%E5%85%B3%E4%BA%8EAndroid%E4%B8%9A%E5%8A%A1%E7%BB%84%E4%BB%B6%E5%8C%96%E7%9A%84%E4%B8%80%E4%BA%9B%E6%80%9D%E8%80%83/?utm_source=tuicool&utm_medium=referral)
[发布Android studio项目到本地Maven仓库](http://www.jianshu.com/p/8d7d0cc8fcc3)