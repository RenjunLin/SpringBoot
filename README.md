### 工程创建

开发SpringBoot项目，推荐使用Intellij IDEA，Java开发的新一代神器。当然，作为研发人员，我们要尊重他人的研发成果，因此，推荐使用正版。

下载链接为：http://www.jetbrains.com/idea/download/，Intellij IDEA提供了学生免费版，只要有学生邮箱就能免费使用Ultimate版本。

![](http://oepmbh7b1.bkt.clouddn.com/2017-07-25-071035.jpg)

首先新建一个工程，选择Spring Initializer，IDEA为我们提供了强大的项目构建模块。点击下一步。

![](http://oepmbh7b1.bkt.clouddn.com/2017-07-25-071421.jpg)

这里我们采用Maven管理我们整个项目，填写好对应的group id、artifact id项目名称，点击下一步。

![](http://oepmbh7b1.bkt.clouddn.com/2017-07-25-071856.jpg)

仅选择Web项目，点击下一步。

![](http://oepmbh7b1.bkt.clouddn.com/2017-07-25-072619.jpg)

选择项目存储路径，点击下一步。

![](http://oepmbh7b1.bkt.clouddn.com/2017-07-25-072832.jpg)

创建好之后的项目中有几个maven相关的无用的文件夹和文件，我们可以先将这几个文件删除。

![](http://oepmbh7b1.bkt.clouddn.com/2017-07-25-073702.jpg)

Springboot的工程结构如上图所示，包含以下主要部分：

- SpringbootApplication：项目的起始点，通过@SpringBootApplication注解自动load项目配置
- resource目录，下面存放web项目的一些静态资源、模板资源以及配置文件
- test文件夹，存放单元测试的相关资源
- pom.xml文件，maven项目的管理资源。

至此，项目自动创建完毕。