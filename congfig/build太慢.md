##方法
修改studio64.exe.vmoptions文件  

## 参数解释
Xms 是JVM启动的起始堆内存，堆内存是分配给对象的内存。  
Xmx 是JVM最大堆内存。  
XX:MaxPermSize 是指定最大的Permanent generation大小。Permanent generation space，实际上就是方法区，存储了Class的信息以及一些其他信息。有时开发时出现的错误如PermgenSpace方面的，就是指这个内存溢出了。所以一般这个可以不改，也可以加大一点。 

## 我的参数
-Xms512m  
-Xmx4096m  
*原始参数文件保存在当前目录