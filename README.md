### spring-boot

工程download下来，运行该工程，有三种方式.

- 直接运行 `Application`类
- gradle bootRun
- gradle 打包后, java -jar bulid/libs/sprinboot-0.1.jar

打开浏览器,运行[http://localhost:9000/dev/springboot/](http://localhost:9000/dev/springboot/) 就能看到效果了。

系统使用了springboot的特性有:
1. profile特性, application-{profile}中的配置会覆盖默认配置文件的属性
2. 内嵌数据库支持,自动导入import.sql
3. 静态文件演示
4. freemarker模板演示
5. spring-data-jpa audit 自动添加创建时间,更新时间
6. 

示例使用了h2内嵌数据库，系统初始化时自动导入import.sql，添加数据。

