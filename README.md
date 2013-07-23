Spring_message_xml_json
=======================

通过Spring 框架，实现根据客户端请求头部的数据格式，返回指定的数据格式：XML，JSON。
我们用Spring MVC来实现请求派发。这样，我们对于同样的请求路径，只需返回一个特定的Class实例，
而客户端只需要指定HTTP的请求头部就可以返回想要的数据类型，这些Spring 的Message都会自动帮我们转换格式。

简单的测试可以通过curl命令，下载地址在http://curl.haxx.se/download/。

部署到服务器后，我们通过命令行定位到下载的curl目录下，输入：curl -i -H "Accept: application/xml" http://localhost:8080/XXX/user/100
就可以看到返回的数据了。。。非常方便。


