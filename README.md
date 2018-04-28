# SpringBoot实现restful设计风格
###   
项目用到的框架为spring boot、mybatis、mysql   
控制层使用了restful架构风格   
遇到的问题:   
1）启动程序找不到dao层的实体，错误原因，spring boot中不能使用@Repository，而应该使用@Mapper注解
###
