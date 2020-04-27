-- 项目client为客户端<br>
-- feginapi为一个对外的api服务<br>
-- service 为服务端<br>
-- gateway 网关服务<br>

-- 实现思路<br>
通过客户端--发起请求到服务端，其中依赖过feginapi项目最终返回结果<br>
-- 运行将你的client中的配置文件改成你的ip地址即可，切记端口不要改变哈<br>
-- 崇尚简单粗暴的原则<br>
-- 去掉注册中心、熔断器的一系列繁琐的配置和服务

-- 请求地址：localhost:9991/client/getRequestService<br>
-- 返回结果: 成功远程到服务端了

-- 网关服务请求地址 localhost:9993/client/getLocal 会请求到client客户端的getLocal接口
