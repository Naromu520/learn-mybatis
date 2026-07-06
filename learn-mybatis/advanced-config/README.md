# 在这一个阶段，我们会学习搭建配置的进阶操作
***
## xml配置文件部分
1. 在xml配置文件里用properties指出jdbc.propertis的位置，使得不用在xml配置文件里写，避开耦合
2. 在xml配置文件利用typeAliases给实体类取别名,从而不用每次都写全类名，且用package标签批量对包取默认别名
3. 在xml配置文件里package指出所有mapper.xml的位置
***
## xml映射文件部分
mapper namespace="com.atguigu.mapper.com.learn.mybatis.UserMapper