Spring Boot 1.5升级到2.0改动

security开头的配置及management.security均已过期

Actuator
配置属性变化

| Old property |	New property |
| ---- | ---- |
|endpoints.id.* |	management.endpoint.id.* |
|endpoints.cors.* |	management.endpoints.web.cors.* |
|endpoints.jmx.*	| management.endpoints.jmx.*|
|management.address	|management.server.address|
|management.context-path|	management.server.servlet.context-path|
|management.ssl.*|	management.server.ssl.*|
|management.port|	management.server.port|
management.endpoints.web.base-path的默认值为/actuator，即Actuator访问路径前部增加了actuator([/actuator/health]，[/actuator/info])，这可以在启动日志中看到。
因management.security不再支持，权限配置需添加到WebSecurityConfigurerAdapter中：

.authorizeRequests()
.requestMatchers(EndpointRequest.to("health", "info")).permitAll()
Endpoint变化

|Endpoint	|Changes|
|----|----|
|/actuator	|No longer available. There is, however, a mapping available at the root of management.endpoints.web.base-path that provides links to all the exposed endpoints.|
|/auditevents	|The after parameter is no longer required|
|/autoconfig|	Renamed to /conditions|
|/docs	|No longer available (the API documentation is part of the published documentation now)|
|/health	|Rather than relying on the sensitive flag to figure out if the health endpoint had to show full details or not, there is now a management.endpoint.health.show-details option: never, always, when-authorized. By default, /actuator/health is exposed and details are not shown.|
|/trace|	Renamed to /httptrace|

1.x版本和2.x版本的区别可以查看该文档：

https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Migration-Guide