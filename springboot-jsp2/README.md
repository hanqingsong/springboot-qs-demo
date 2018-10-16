## springboot 和 jsp整合联系有两种方式：
### jar
    需要指定jsp编译后端路径，编译到/src/main/resources/META-INF/resources/WEB-INF/jsp/下，
    一种方法是直接在resources下创建文件夹/META-INF/resources/WEB-INF/jsp/，另一种方式是在mavne指定编译后的映射文件夹。
    这种能够再idea中直接运行
### war
    编译为war包在idea中不能直接运行，需要使用命令行运行程序。但是这种方式不用指定编译jsp到文件夹。
    <packaging>war</packaging>
    mvn clean install
    java -jar target/app.war