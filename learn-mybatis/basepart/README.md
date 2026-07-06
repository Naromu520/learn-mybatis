# 1概述主要的三个基础部分,实现最基础的依靠mybatis实现增删改查
***
## 0.0前置准备
需要
1. pom依赖
2. 实体有get()与set()方法、和数据库对应的属性
## 1.1 mybatis核心配置文件（mybatis-config.xml）
--在src.main.resource里  
--核心配置文件主要用于配置连接数据库的环境以及MyBatis的全局配置信息  
需要
1. 在batis的xml配置文件里配置好数据库,或是propertis或是在environment里
2. 在配置xml里，配置映射xml路径为映射xml
***
## 1.2 mapper接口  
--放在src.main.java的mapper包里的UserMapper
需要
1. 准备好sql操作的方法
***
## 1.3 mybatis的映射文件

--放在了src.main.resource里的mappers包里的Usermapper.xml  
--MyBatis映射文件用于编写SQL，面向mapper接口访问以及操作表中的数据
--MyBatis中面向mapper接口操作数据，要保证两个一致  
1. mapper接口的全类名和映射文件的命名空间（namespace）保持一致   
2. mapper接口中方法的方法名和映射文件中编写SQL的标签的id属性保持一致，如果是sql,记得写resultType

