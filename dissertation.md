#  Background

   ！！target user and market 可以留到 introduction ？

### 1 Target User and Market   

The proposed application targets clients and drivers in short haul transport market and aims to help both parties complete the transportation. The client party including students who need transport their stuff after graduate, buyer or seller trading in Ebay, ordinary people who need transport bulky items sometimes and small businesses which need some transportation just in city. The driver party including individual drivers who have big cars like van, pick up or trucks and small local carrier companies.   

**On the demand side,** people’s demand for **short-distance freight transportation** is increasing.

According to the Office of National Statistics, with an estimate of almost 600 million tonnes, the short haul transportation (goods remained in the same 173 NUTS3 region) make up for 43% of the goods lifted domestically by GB HGVs in 2018 [1]. Moreover, the amount of short haul transport have been increasing with 25% since 2013. Also, the proportion of household and office removals and other non-market goods has gradually increased in recent years.[2] 

**On the supply side,** some transportation resources were left in idle by  the impact of COVID-19.

According to the report by IFC [3], due to additional restrictions, the volume of goods transported by road has dropped tremendously. The **small trucking businesses are being severely hit** because they tend not to have any backup, recovery plan, or intermittent operation plan. Moreover, except for those businesses in food distribution, others have seen their **work dry up** almost completely.



### 2 O2O Service Model

[4]With the development of e-commerce, a new e-commerce model, O2O (Online to Offline), has come into being. This model connects offline business opportunities with the Internet, allowing customers filter services online and get the service offline.Alex Rampel [5] first proposed the concept of O2O in 2010. He believes that this model can attract more customers, companies find target customers through the network platform. Lu Yiqing and Li Chen (2013) [6] looked forward to the future development prospects and were very optimistic about the future development and potential of the O2O model. Many companies already adopted the O2O models for their businesses such as Amazon, Welmart, Alibaba [7].

O2O addresses the **inequality of information**, quantifying and visualizing services on the Internet, bringing some benefits to both businesses and consumers. However, there are some issues to be noted in the application process, such as establishing a secure transaction environment, training online and offline service personnel, and seamless integration of online and offline services.

As an O2O network transportation platform, the proposed application connected offline consumers and drivers, consumers request transportation services through the network, track the status of orders, drivers view specific order information on the platform, and both complete the service offline.



### 3 Existing  applications

**Traditional transport companies** (**high cost and low timeliness)**

Exploring applications across platforms, there are two types of applications worth mentioning. The first type of application is developed by traditional transportation companies which have their  own transport vehicles, drivers and many staff to run the daily business. With the help of the Internet, these applications broaden the marketing channels of its transportation services and help companies attract potential consumers. But at the same time, the cumbersome transportation service process and the large operating costs of the company have not changed. These applications including Barrington Freight, Street Stream[27,28], etc.  If people want to transport some items, they first go to the website to fill in item-related information to quote and then wait for the company to reply the specific price. After the customer confirms the order, the company arranges for the vehicle to pick up the goods and customer wait for the transportation service to be completed. These applications are backed by traditional transportation companies and have a good problem handling mechanism, so they have a good reputation in the customer group. However, limited by the traditional process and large staff group, the service process is more complicated and consumes more time and money for consumers.



**Online transportation marketplace**

The second type of application is some online transportation marketplaces aim to connect people and transport companies, they provide a platform for users to obtain delivery, transport and removal services from their transport partners. These applications including Gatemover, Anyvan, etc. In the Gatemover, the **transport companies can register in the Gatemover** with some subscirptions fees. User first describe the move in the applicaiton, then app will do some filter or routing process and send the request to specfic transport companies met the requirements, then the user get specific quotes from these carriers, Getamover leave consumer and carriers do the business after user accept the quote. 

Anyvan's service model is basically the same, it matches a user’s transportation route to that of a transport provider’s and connects them,  minimising costs and cutting down CO2 emission by optimising storage space and haulage[32,33]. All transportation partners will paint the anyvan logo on the car and provide services in the name of Anyvan. [31].

These applications connected the consumer and companies, help carriers  get access to the consumer and contributed to improving the environmental protection and efficiency of transportation. However, The entire demand-side situation is still **not transparent** to the actual supplier, and customers have almost **no right** to select service providers and negotiate prices, this may result in some demands on the market that cannot be matched reasonably. In addition, they ignore other idle transportation resources in the society. Service providers in the online market are still companies, and they **do not accept individual** transportation service providers.





### 4 Novelty of proposed application

On the basis of understanding existing applications, the proposed application has some novelties on the supply side, demand side, and utilization of social transportation resources.

On the supply side, the application absorb personal transportation service providers and create a transparent transportation market. This application accepts the registration of most individual drivers, and exposes all freight orders requested by users to drivers. Drivers can choose orders on the platform to bid according to their schedule and freight capacity.

On the demand side, the platform gives customers more right to choose and restrict service providers. After the customer reqeusts the order, he will receive quotes from multiple drivers. The personal information and reviews of these drivers can be viewed. Customers can accept the offer after a thorough consideration and leave reviews after the transportation is completed.

Also, the proposed application is committed to integrating the idle transportation resources in the society to meet the scattered and low-frequency transportation needs. It also provides a transformational idea for the freight companies impacted by the covid-19. Therefore, the project has some positive significance for the efficient use of transportation resources.



！！ 讲一些别的可以

5 Monolithic architecture

使用单体架构(monolithic architecture)设计的软件系统会随着时间的推移变得庞大且复杂,这使得软件的 可维护性和可伸缩性几乎变得很差[35].



[35]  Jonas F, Justus B, Stefan W, Alfred Z. Microservices migration in industry: Intentions, strategies, and challenges. In: Foutse K, ed.Proc. of the Int’l Conf. on Software Maintenance. 2019. 481−490. [doi: 10.1109/ICSME.2019.00081]





### 4 Monilithc Architectural



Monolithic Architecture (MA) [1] is the traditional method of software development, which has been used by world-renowned Internet services such as Netflix, Amazon, and eBay. In MA, all functions were encapsulating in a single application. For simple monolithic applications, it has its own advantages including easy to develop, test, deploy, and extend. However, with the development of the enterprise, the scale of the application is always growing, and will eventually become a huge monolith in a few years. At this time, the shortcomings of the monolithic architecture will outweigh its advantages. For example, the extremely complex and incomprehensible code of the MA application may hinder bug fixes and feature additions; due to a longer startup time, the huge scale of monolithic applications will slow down the speed of development and become an obstacle to continuous deployment.



[6] R. Chen, S. Li and Z. Li, "From monolith to microservices: a dataflowdriven approach", *2017 24th Asia-Pacific Software Engineering Conference (APSEC)*, pp. 466-475, 2017.

[1] C. Richardson, *Pattern: Monolithic architecture*, June 2017, [online] Available: http://microservices.io/patterns/monolithic.html.



### 5 Microservices architectural style  ( needs others )

In 2014, Fowler and Lewis formally introduced the concept of microservice architecture [8]. It advocates the division of an application into a set of fine-grained services that interact with each other using lightweight communication mechanisms to provide ultimate value to the user [9]. Typically, these fine-grained microservices are small programs with a single responsibility that can be deployed, extended and tested independently [10-11].

Compared to traditional monolithic architecture, microservice architecturehas features such as high maintainability, high scalability, high adaptability, and containerized runtime environment, and has received a lot of attention from industry and academia [12-14].In recent years more and more large applications are migrating to microservice architecture [12].  Amazon, Netflix, TheGuardian, Twitter, Pay Pal, SoundCloud, etc. were the first to start experimenting with microservicing software systems on the cloud. [18]. Netflix's online service system uses about 500 microservices and involves 5 billion service interactions per day [19]. Amazon involves 100 to 150 microservice calls per page [20]. 

Essentially, the idea of servitization of microservices is derived from service oriented architecture (SOA) [21].However, compared to SOA, microservices differ in three significant ways.

1) From a design philosophy perspective, SOA is share-as-much-as-you-can, aiming at a high level of service reuse [22], whereas microservices are share-nothing driven, aiming at promoting further code separation and autonomy, supporting agile approaches or agile methods. [23-24].
2) From the perspective of communication methods, services in SOA architectures communicate with each other through an Enterprise Service Bus (ESB) [22], while microservices in service architectures communicate with each other through lightweight protocols such as RESTful or RPC-based APIs [25].
3) From the perspective of data sharing, the same database is shared between services in SOA architecture, while each microservice can have its own private database in microservice architecture [3].

At the same time, the microservices architecture also poses a number of problems.

Firstly, microservices interact with each other through REST and RPC, which makes the code more complex and difficult to locate the problem and requires consideration of various exceptions (failure of the invoked party, overload and loss of messages). Secondly, the increase in the number of services places an additional burden on operations and maintenance work such as debugging, configuration management and monitoring. In addition, microservices require multiple resources to be updated, and the storage of these resources is distributed, which creates data consistency issues and make business processes more complicated .







# <u>Design &  Architecture</u> 



 ##  1 Methodology 

The chosen of methodology of this project draws on the software development theory of ACD[]. One of the core ideas in ACD is "release early and often". For this reason, we applied an iterative development method. 

In the Initial minimal prototype, the implementation of core activities and the design of the micorservices architecture are mainly carried out.

Due to the urgency of time and the difficulty of implementation, the business design of initial prototype is based on informal discussions between myself and some others major in transportation and my understanding of other similar products in the background. To achieve the backend server's high performance requested by the objectives, we compared the MA and microservices and chose to design the system based on microservices architectural style.

After the initial prototype is deployed in the cloud, the software testing phase starts, which includes pressure testing (/unit testing) and user-based integration testing. First, perform a pressure test to test the correctness of the system in simulated real scenarios and find the weak points in the system. After the unit test, some peoples will use the application, while part of process was mocked due to covid-19. Then we will iterate the business process and server implementation based on these collecting feedbacks.

The final iteration aims to make a advanced prototype and will focus on the improvement and enhancement of the security, availability and reliability of the back-end server to achieve a system close to the production level.



 ## 2 Design

Initial prototype design is based on the the contextual analysis, the ACD model discussed in the previous Section and informal discussions with several students major in transportation. The following core activities was defined: for the clients, 1) publish order in platform, reviece the quotes from driver and accept the quote, 2) check the driver's review and make review after service; for driver, 3) check the order market and access the details of order 4) give quote to sepecific order; also, 5) clients and drivers will get notification when order status been updated. The use case diagram is shown below:

   <img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-14 15.53.46.png" alt="截屏2021-07-14 15.53.46" style="zoom:33%;" />





## **3 Services Design**

These part introduce the microservice design, including the database schema, service divison, and the interface design for service.

**Services Component division** 

For the microservices architectural, the divison of services is important, **service granularity**，if single service is too big, 大小的影响。

The objective of services division including less-coupled, minimise invoke other services etc. Dividing servics based on the interaction with databse is a good way to divide services, each services has its own database and only interact with these database. This division method ensures the isolation of each services. 

Five tables was designed to support the applicaiton, they are: 

1) **Order table**: the information about the sepecific order, including driverId, clientId, place and cargo details, etc. Order table is responsible for the request when client publish new order, driver check orders in market, and they update the order status. 值得一提的点，the status of the order is defined in 4 stages - PUBLISHED (once client submit the order request) , FETCHED (after the client accept a driver's quote), PAID (client made the payment to driver), TRANSPORTED (driver completed the service).
2) **Quote table**: including the price, the orderId, driverId and the createdata, the createdata the default value is set to the currenttime by dabase, so we don't need to set this attribute in server. The table is responsible to drivers  make quote and see the quotes of orders.
3) **User table**: store the data of user, including the email, password, telephont etc, responsible for the request of authenication, register and email info when send notifications.
4) **Review table**: store review information about orders, include the comments, star given by clients, and the orderId, clientId to identify user and order. The star is a number out of 5 represented the satisfy content with driver's service.
5) **Payment table**: store driver's payment info, including card details for clients to make payment. The table is responsible for the response the request by client.

To reduce the constriant of other table when do CURD operation in single table, we will not set the external key between the tables. 

Based on the activity category and the interaction with database, we first divide out 3 services and assign these 5 tables to them. If we found the services are too big or small, we will make adjustment in later development.

These service and their function:

**User service**: login and register, make reviews, get payment info, get users' email,  the service will interact with Users table, Review table, Payment table.

**Order Service**: publish, check, fetch order, update order status, make and check quotes, the service will interact with Order table, Quote table.

**Notification Service**: send email with different content (order status update, new quote, registry etc), it will request the order and user info to user service and order service.

the database schema and use case of the the 3 services is shown below:

<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-21 18.17.32.png" alt="截屏2021-07-21 18.17.32" style="zoom:30%;" />

<img src="/Users/jon/Desktop/截屏2021-08-09 17.48.12.png" alt="截屏2021-08-09 17.48.12" style="zoom:30%;" />



**Define service interface**

After we got the seperated services, we need to define how they will communitcate to external request, which is the interface of microservices. There are two popular solutions here, one is use Rpc (remote procedure call) and another is use RESTful API. A remote procedure call (RPC) is when a program causes a procedure to execute in a different physical address space, which is coded as if it were a local procedure call. Generally, the customed communication and serilization protocol were encapsulated in a framework like gRpc[] for user. 

[] https://grpc.io/

Rpc often use the binary serilization protocol like protobuf[] etc to obtain higer throughput, lower response time and performance loss.

REST acronym for **RE**presentational **S**tate **T**ransfer. It is an architectural style for **distributed hypermedia systems** and was first presented by Roy Fielding in 2000 in his famous dissertation[34]. When a client request is made via a RESTful API, it transfers a representation of the state of the resource to the requester. The request and response are made through HTTP. The request url specifies the resource, the HTTP method show the intention to the resources. The header and paremeters are also important as they contain identifier, authorization informations etc. The HTTP response retruned to requester contains the representation of resources in body and HTTP status code to show the result of request.  

Compared to Rpc, Restful use more standard and common communication protocol HTTP. And HTTP supports 跨语言 cross-language which is a good thing to the system because it can support more external requester implemented their system in different language and give more freedom to internal microservice to choose the most fitble language.

So, consider the advantages of Restful and the implementation difficulties of Rpc, we decide to use Restful style api as the service interface in initial prototype. The JSON was choosn to represent resources. Compared to another popular representation XML, they both have good readablity by humans and machines, but transform JSON to object is better supported in front-end because javascript has native method to do that. Also, JSON do a good job in data size and transportation speed than XML.





**c. communication between services**

1. **MQ**:  make some request asynchronized, more efficient (the email service subscribe, the order service, user service publish)







   // sequence diagram

based on the division of services, the sequence diagram is shown below:   ![sequence diagram](/Users/jon/Downloads/sequence diagram-2.png)

   

   Introduction of basic activities. **maybe one detailed part**

// **data schema**   ！！ 数据库图放到这里   




​		

##   2 Architecture



services layer: Actual service modules: provide actual services

​						  Service management module: like service registry and discovery, service monitor

database save data and cache, infrastructure use cloud server (goods ?)



![截屏2021-07-22 15.10.53](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-22 15.10.53.png)



## **Platform and framework**

To allow the scalability of the application, the back-end and front-end of the application will be separated. Due to the time constriant and learning cost of mobile app development, the chosen platform for application is Web. The backend consists of serveral standalone services and exposes RESTful APIs to communicates with external applications or internal services through HTTP requests. The front-end will consist of reusable UI componenent and scripts in line with user journey shown in figure x. In the future development, we can transform the front-end app to mobile devices in IOS or Android and same back-end API can be used.



The front-end development used framework VueJS. As a lightweight  front-end development framework, it has some advantages like simplicity, user-friendly, few restrictions and good documentation[] compared to other frameworks like Anguar and React.

[] https://towardsdatascience.com/what-are-the-pros-and-cons-of-using-vue-js-3689d00d87b0

The framework Spring Boot was chosen in back-end development. Spring Boot is an open-source micro framework maintained by Pivotal, it has lot of advantages including help developers autoconfigure all components for a production-grade Spring application, provide sa default setup for unit and integretation tests, add many plugins that can be used to easily connect with database and middle-tier services[]. It also have good supports for microservice application and Restful api develpoment. However, spring boot often installs many extra dependencies, the deployment binary size can become very large and the complicated dependencies mangement brings some burden.

[] https://stackify.com/what-is-spring-boot/



Figure x outlines the architecture of the initial prototype. The arrows indicate the communication flow between different components. The box  represented the scope component, each component will only communicate with components in either its own layer or the layer directly adjacent to it. 

The architecture of Front-end is basd on Vue's architecture. The reqeusts from front-end will first filtered by gateway layer, which responsible for authentication and routing service. Then the services in service layer handle the request, interact with database or other services and make response. 

 The services in service layser is divided to actual service modules including User, Order, Notification services, which serve external request, and service management module including services register, discovery center and admin service, which will communicate with other services to do moniter services' health info and maintain the status of each service instances. As development of the application progresses, services can also be added to the service layer. 

The database layer consists of Mysql database and redis for future use. In the infrastructure layer, we choose deploy the application to cloud server to obtain 24/7 availablity.



![ds](/Users/jon/Downloads/Architecture.png)



# Backend development

！！ 加入测试过程？？



## 0 environment preperation

Spring boot, spring cloud, mysql, mybatis.., maven, swagger, jwt



##  1 Services RESTful API Design

The very first step in designing a REST API based application is – identifying the objects which will be presented as **resources**.

##### 		1.Identify Object Model

​	User, Payment, **Review**, token,Order, quote 

```java
@ApiModel
public class User {
    @ApiModelProperty(value = "The unique id of user")
    String id;
    @ApiModelProperty(value = "The name of user")
    String name;
    @ApiModelProperty(value = "The unique email of user", required = true)
    String email;
    @ApiModelProperty(value = "The telephone of user")
    String telephone;
    @ApiModelProperty(value = "The password of user", required = true)
    String password;
    @ApiModelProperty(value = "The type of user (CLIENT or DRIVER)", required = true)
    String type;
}
```



##### 		2. Create Model URIs

Now when the object model is ready, it’s time to decide the resource URIs. At this step, focus on the relationship between services and its resources. These **resource URIs are endpoints for RESTful services**. 

```
localhost:8082/USER-SERVICE/user
localhost:8082/ORDER-SERVICE/order
....
```



##### 		3. Determine Representations

​			JSON / XML , use json; json's advantages



##### 		4. Assign HTTP Methods 

​		So our resource URIs and their representation are fixed now. Let’s decide the possible operations in the application and map these operations on resource URIs. A user of our network application can perform browse, create, update, or delete operations. assign them.  

![截屏2021-07-21 18.04.58](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-21 18.04.58.png)

4. **Define Response object**

Return **Response entity** to consumer

Extension of [`HttpEntity`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/HttpEntity.html) that adds an [`HttpStatus`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/HttpStatus.html) status code. Used in `RestTemplate` as well as in `@Controller` methods.

advantages: the field body contains the data model like user, order

​					the HttpStatus defined a lot of httpstatus code,  use specific status code to tell consumer the request's  result.

​		

```java
public ResponseEntity(@Nullable T body,
                      @NotNull org.springframework.http.HttpStatus status)
  

```



Use API docs to describe the api:

![截屏2021-07-21 18.06.03](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-21 18.06.03.png)



## 2 ORM 

#### 1 create data table in **mysql**







#### 2 **Integration Mybatis**	

spring-boot-start-mybatis

```xml
<groupId>org.mybatis.spring.boot</groupId>
<artifactId>mybatis-spring-boot-starter</artifactId>
```

why: 

a. configuration 

```properties
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/User?useUnicode=true&characterEncoding=utf-8
spring.datasource.username = root
spring.datasource.password = 1251251258
```

b. create mapper

```java
public interface UserMapper {

    @Select("SELECT * FROM Users WHERE name = #{name} ")
    // 对应作用，当 类字段 和 数据库表字段不一致时
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password")
    })
    User findUserByName(String name);

    @Select("SELECT * FROM Users WHERE email = #{email} ")
    User findUserByEmail(String email);

    @Select("SELECT * FROM Payment WHERE userId = #{userId} ")
    Payment getPaymentById(String userId);

    @Insert("INSERT INTO Payment (userId,recipient,sortcode,accountnumber) VALUES(#{userId}, #{recipient}, #{sortcode},#{accountnumber})")
    void insertPayment(Payment payment);
```

**Autowired in controller** and add annotation in UserApplication class to tell the positon of mapper.

```java
@MapperScan("com.jon.api.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}

```



```java
public class LoginController {
    @Autowired(required = false)
    private UserMapper userMapper;
    ...
      
      
}
```







## 3. Service Registration and Discovery

Eureka ?? goods, comparation to others

importance: **service aggregation**; monitor the health of service; load balance;  

#### Eureka server impl

#### Eureka client imp

```yml
eureka:
  instance:
    prefer-ip-address: true
  client:
    fetch-registry: true
    register-with-eureka: true
    service-url:
      defaultZone: http://localhost:8761/eureka/
```



## Service Invoke

User feign: goods, load balance? 原理

1 include feign -> write interface -> autowired the interface -> then

```java
@Component
@FeignClient(value = "USER-SERVICE")
public interface UserFeignClient {

    @RequestMapping(value = "/email")
    String getUserEmail(@RequestParam String userId);
}
```



```java
@Autowired
private UserFeignClient userFeignClient;

public void getEmail() {
        System.out.println(userFeignClient.getUserEmail("3"));
    }
```



## 4 Service Gateway

use Spring Gateway: ?? goods



1. #### Dynamic routing

   get registry table from eureka, and route request to services respectively

2. #### Authentication (filter)

   check the token of request, then 



## 5 Service Monitor

1. include actuator to the services, then expose all endpoints

 ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>
 ```

```properties
management.endpoints.web.exposure.include=*
```

so we can access the info on /actutor/metrics/{names}

```json
{
  "names": [
    "hikaricp.connections",
    "hikaricp.connections.acquire",
    .....
    "tomcat.sessions.rejected"
  ]
}
```

the include the spring-admin to pom, and register to Eureka, fetch the registry of other services, then monitor them.

![截屏2021-07-30 10.24.03](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-30 10.24.30.png)

we can monitor the up and down of services,  see the running info of JVM, the loggers...

![截屏2021-07-30 10.33.41](/Users/jon/Desktop/截屏2021-07-30 10.33.41.png)



# Fronted-end  Development

## 0 set dev environment 

researching and installing VueJS  and the VueCli tool - provided by VueJS - was used to set up the project, installing the required packages and creating an initial folder structure. This folder structure, being based on VueJS’s best practices, helped to quickly start development. 

To help with the styling of the application, Bootstrap were used  In this project, Bootstrap is mainly used for its margin and responsive classes, since it allows you to quicker create a basic layout for the application development rather than doing so manually.

plugins: 

vue-sweetalert2,

google-maps,  

element-ui



## 1 login / register page

The login and registration page is the first interface that the user encounters after entering the system. The layout design of this part is basically the same. The upper part is a shared navigation bar, and the lower part is a form for user input. The user can switch in the upper right corner to log in and register. On the login page, the some login links of the most popular social platforms are reserved for future SSO (Single Sign-On) *[ref]* login verification. We also setting up the communication between the front and backend, including requesting a jwt-token from the backend, storing it in localStorage [36] and sending it for validation with every API call to protect again cross site request forgery (CSRF).

[36] https://developer.mozilla.org/zh-CN/docs/Web/API/Window/localStorage

Thanks to Vue's data binding, we can easily access the data in the form; when submitting the form, firstly, the project applies Javascript code to judge the validity of the data, avoiding invalid data being sent to the backend, and then popping up error or successfu reminder box is presented to the user, as shown in the figure below. 

Then, the front end will send  Axios*[ref]* request according to the requirements of the api in the backend User Service, and then perform follow-up operations based on the http response status code. For example, for the registration process, axios send the POST request with the user information to the user service. If it returns 201, it means that the user is successfully created, returns 226, it means that the email has been registered, and if it returns 500, it means that an error occurred inside the server.

In addition, in order to lower the coupling between the front and back ends, Axios only sends requests to the gateway, which also means that only the name of the requested service needs to be remembered instead of its port number. For example, 

```js
axios.post('http://localhost:8090/USER-SERVICE/user', this.form)
```



<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-02 11.12.14.png" alt="截屏2021-08-02 11.12.14" style="zoom:20%;" />

<img src="/Users/jon/Desktop/截屏2021-08-02 11.13.28.png" alt="截屏2021-08-02 11.13.28" style="zoom:20%;" />

<img src="/Users/jon/Desktop/截屏2021-08-02 11.14.02.png" alt="截屏2021-08-02 11.14.02" style="zoom:23%;" />







<img src="/Users/jon/Desktop/截屏2021-08-02 09.02.28.png" alt="截屏2021-08-02 09.02.28" style="zoom: 33%;" />



<img src="/Users/jon/Desktop/截屏2021-08-02 09.02.20.png" alt="截屏2021-08-02 09.02.20" style="zoom:33%;" ><img src="/Users/jon/Desktop/截屏2021-08-02 09.04.16.png" alt="截屏2021-08-02 09.04.16" style="zoom:30%;" /



## 2 Home page and common part (layout...)

在登陆后，紧接着的就是home页面，这也是支持用户后续操作的所有地方。页面采用 Aside，header，main 的布局；aside 作为侧边菜单栏，提供了用户活动的入口。header显示用户相关信息，main的空间用来显示当前的活动页面，例如发布订单，查看订单信息等; main中显示的 component 包含 vue的  '' :is ''标签，这样我们在引入各个活动的 vue component 后可以把 currentView 的值改变为其他模块的名字来更换显示内容。

After logging in, the home page is immediately followed, which is also the place to support all subsequent activities of the user.
The page adopts the layout of Aside, header, and main; aside serves as the side menu bar and provides the entrance to user activities. The header displays user-related information, and the main space is used to display the current active page, such as posting orders, viewing order information, etc. The component displayed in the main contains the '' **:is** '' tag of Vue, so that after impoting the Vue component of each activity, we can change the value of currentView to the name of other modules to replace the displayed content.

```html
<component :is="currentView"></component>
```



![截屏2021-08-02 16.20.45](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-02 16.20.45.png)



The sidebar includes activities such as publish order, order markets, myorders, myreviews and myInfo.
The users of this project are divided into clients requesting transportation services and drivers providing services. In order to display different sidebars for users according to their roles, the " if  "tag of Vue was used. Before loading the html module, the User information stored when logging in was retrieved from localstroage to determine whether the user's role meets the conditions. In this way, the publish order module is not displayed for the driver, the ordermarket module is not displayed for the client, and other general modules can be displayed. The code is shown below.

Driver's view:

![截屏2021-08-02 17.52.59](/Users/jon/Desktop/截屏2021-08-02 17.52.59.png)

Client's view:

![截屏2021-08-02 17.55.27](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-02 17.55.27.png)



Reviews Part



![截屏2021-08-05 10.24.10](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-05 10.24.10.png)





myInfo:





## 3 Clients part

For the client, myOrders displays his previously released order information, and uses the el-table component  design the style conveniently. In the table, the order id, address, type of goods and the status of the order are displayed. The last column is the operations that can be performed on the current order.

According to the current status of the order, the user can perform different operations. When the order is first released, the status is PUBLISHED. At this time, the user can cancel the order. After the order is accepted by the driver, the status is FETCHED and the user can confirm the payment after pay the driver according to the email message. If clients are not satisfied with the driver’s previous reviews, he can still cancel the order; When the status changes to COMPLETED,  the user can make a review to the driver. Order details are independent of status and can be accessed all the time. The implementation of this part is still based on Vue's conditional display of labels, data and method binding.



After setting attribute `data` of `el-table` with an object array, we used `prop` (corresponding to a key of the object in `data` array) in `el-table-column` to insert data to table columns, and set the attribute `label` to define the column name. The implementation of the last column is more complicated. The method of binding each operation in this column needs to obtain the relevant information of the order in the row to send a request to the backend and determine the operation available in the current status. We used the **‘slot-scope’** property provided by Element to get the data of the row and then pass the row object generated from the tableData inside the table to each method. For the update of the order status, we defined some methods to request backend with the parameters required, then show the user an alert box of success or failure based on the returned status code. In order to achieve the function of displaying order details, an <el-dialog> module is defined on the page, and a Boolean value **dialogVisible** is used to define whether it is displayed or not. When the user clicks the details button, it will trigger a method to change the value to True from False.



![截屏2021-08-03 12.25.07](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-03 12.25.07.png)



```vue
<template slot-scope="scope">
  <el-button @click="transportedOrder(scope.row)" v-if="scope.row.status === 'PAID'" type="text" size="small">Transported</el-button>
  <el-button @click="cancelOrder(scope.row)" v-if="scope.row.status === 'FETCHED' || scope.row.status === 'PUBLISHED' " type="text" size="small">Cancel</el-button>
  <el-button @click="confirmPayment(scope.row)" v-if="scope.row.status === 'FETCHED'" type="text" size="small">Paid</el-button>
  <el-button @click="makeReview(scope.row)" v-if="scope.row.status === 'COMPLETED'" type="text" size="small">Review</el-button>
  <el-button @click="confirmTransport(scope.row)" v-if="scope.row.status === 'TRANSPORTED'" type="text" size="small">Confirm</el-button>
  <el-button @click="showDetails(scope.row)"  type="text" size="small">Details</el-button>
</template>
```




![截屏2021-08-03 11.45.58](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-03 11.45.58.png)





make review: 

Using the el-rate label, the stars at the top of the dialog box represent scores, each star represents one point, and the bottom is a comment input box. These two parameters are respectively bound to the value and review variables in the component. After the user clicks submit, it will be sent to the backend.

![截屏2021-08-04 14.23.01](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-04 14.23.01.png)





## 4 Market part

The market page is the driver's unique interface, which displays all the orders placed by users on the market and the operations that can be performed.

![截屏2021-08-04 13.13.35](/Users/jon/Desktop/截屏2021-08-04 13.13.35.png)

司机对于每个订单的操作有 3 种，分别是 More - 查看更多的具体信息，Quotes - 查看历史 quotes 并给订单 quote，Route - 显示路线，里程和耗时。我们在页面中创建3 个可隐藏的 dialog 模块来容纳 这三个部分的展示，并且维护当前订单信息，司机的quote，以及控制 dialog 显示的 3 个 boolean 变量。借助 <el-dialog>  的  **:visible.sync** 属性，我们给他可以绑定布尔值，这样就可以通过改变布尔值的来控制dialog 的 显示与否。

There are 3 types of driver operations for each order, namely More (see more specific information), Quotes (view historical quotes and quote the order), Route (display route, mileage and time). We create three concealable dialog modules on the page to accommodate the display of these three parts, and also maintains the current order information, the driver's quote, and the three boolean variables that control the dialog display. With the help of the **:visible.sync** property of <el-dialog>, we can control the display of the dialog by changing the Boolean variable bound to it.



```vue
<el-dialog title="Quotes" :visible.sync="quotesVisible"
           width="60%" :before-close="handleClose">
  <Quotes :orderid="orderId" ></Quotes>
  <span slot="footer" class="dialog-footer">
    <el-input size="small" placeholder="input your quote" v-model="quote"></el-input>
    <el-button type="primary" @click="quoteOrder">Submit</el-button>
  </span>
</el-dialog>
```



在订单信息到获取方面，向后端请求市场订单信息被封装到 Vue 方法 beforeCreate（）里面，这样，在模块显示前，我们就可以把获取到的 Order array 传入 本页面所定义的数据 orderdata。

In terms of obtaining order information, the request for market order information from the backend is encapsulated in the Vue method beforeCreate(), so that before the module is displayed, we can pass the obtained Order array into the data Orderdata defined on this page.



The implementation of the three operations of the order is as follows. The first is the display of the order details: similar to the previous display of MyOrders component, the order data object of the row is assigned to infodata through 'slot-scope', and the variable detailsInvisiable is set to true to display the dialog box.

<img src="/Users/jon/Desktop/截屏2021-08-04 12.41.14.png" alt="截屏2021-08-04 12.41.14" style="zoom:33%;" />

其次是quotes模块；用户单击 Quotes 时，quote dialog 模块就会显示，该模块由一个 quote表和 下方的一个输入框组成，输入框的 v-model 属性与 market Component's quote变量绑定，司机可以输入他心中的quote，并点击 submit 来提交（单击后 axios 带着司机id和价格给后端发送请求）。

在实现的过程中, 首先创建 market 的子模块 quote component 并引入，父模块 market 会将当前行的 orderId 通过 quote component 的 porp传入 quote component，quote component 会借助这个id 向后台请求这个 orderId 所有的quote信息，最终显示信息。

The second is the Quotes module; when the user clicks Quotes, the quote dialog will be displayed. It consists of a quote table and an input box below. The **v-model** attribute of the input box is bound to the Market Component's variable quote, and the driver can input price in his mind and click confirm button to submit (after clicking, Axios sends a request to the backend with the driver id, orderid and price). In the process of implementation, first create and import the sub-module quote component of the market. The parent module market will pass the orderId of the current line to the quote component through the **porp** attribute of the quote component, and the quote component will use this id to request all the quotes of this orderId from the backend Information, and finally display information on the dialog.



<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-04 10.50.13.png" alt="截屏2021-08-04 10.50.13" style="zoom:33%;" />



最后是路线信息的显示，司机可以查看 google map下的线路规划，长度和预计时常。本部分的实现借助了第三方插件 vue2-googlemap ，在它之上，本项目开发了可以在地图上展示两点间路线的自定义的 DirectionsRenderer 模块，该模块首先获取到谷歌提供的 DirectionsService() 对象，接着携带之前申请到的谷歌开发者key以及地点和交通模式（总是设置为开车）信息请求路线信息。接着，从该路线信息中获取到第一个可选线路的距离，时间，以key-value的形式存储到 localStorage中供market 模块使用。最后借助提供 vue2-google-maps 的 setDirections() 函数绘制路线。

The last is the display of route information. Drivers can check the route plan, length and estimated time under the google map. The implementation of this part uses the third-party service vue2-google-map. On this basis, this project has developed a custom DirectionsRenderer module that can display the route between two points on the map. This module first obtains the DirectionsService() object provided by Google , and then carry the Google developer key previously applied for and the location and traffic mode (always set to DRIVING) information to request route information. Then, parse out the distance and duration of the first optional route, and store it in the localStorage in the form of key-value for the Market component to use. Finally, draw the route with the help of the setDirections() function provided by vue2-google-maps.



<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-04 12.39.36.png" alt="截屏2021-08-04 12.39.36" style="zoom:33%;" />





## Deployment

For this project, there are two main solutions for deploying to the cloud. One is the ecs cloud server (IaaS) that needs to manually configure the application but has a higher degree of freedom, and the other is to choose the (PaaS) platform as a service provider that is responsible for all the details of the infrastructure.

Choosing PaaS can focus on developing applications without worrying about configuring and maintaining servers. With the support of PaaS service providers, a single application can be deployed easily, but for a microservice project with multiple independent sub-projects, deployment is more time-consuming. And the front-end server and database may also choose other different service providers for deployment, the communication between them and the back-end server is also a problem.



In the end, we chose the cloud server of IaaS Google Cloud Platform for deployment, and obtained a Linux host running 4G of memory through the trial plan. For deployment, we adopted Multiple Service Instances per Host Pattern. Its advantage is that resource usage is relatively efficient, and multiple service instances share the server and its operating system. Deploying service instances is relatively fast. Just copy the service to the host and start it. Since our service is written in Java, we only need to copy the JAR, and we can package a single service into multiple Jar packages to achieve multiple instances.

However, this pattern also has an obvious disadvantage. That is, there is no isolation between service instances. Although we can accurately monitor the resource utilization of each service instance, we cannot limit the resources used by each instance. A misbehaving service instance may consume all the memory or CPU of the host.







这样一来，我们直接传输每个服务打包好的的jar文件到云主机对后端服务器进行部署，将vue项目build好后，  将本地数据库的sql文件传到云主机。









[40] https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html#deployment.cloud





// need some statistics

(低价吸引人) In general, however, it appears that the opportunities for attracting traffic are greater through lower rates than improvements in service quality.

Winston, Clifford. "A Disaggregate Model of the Demand for Intercity Freight Transportation." *Econometrica* 49, no. 4 (1981): 981-1006. Accessed July 24, 2021. doi:10.2307/1912514.





# Testing

## **Unit test**











[1] domestic-road-freight-statistics-2018

[2] **Understanding the UK Freight Transport System**

[3] **The Impact of COVID-19 on Logistics**

[4] Study on the Development of O2O E-commerce Platform of China from the Perspective of Offline Service Quality

[5] Alex,R.Why Online to Offline Commerce Is a Trillion Dollar Opportunity [J].Tech Crunch,
2011(10):11.
[6] 卢益清,李忱.O2O 商业模式及发展前景研究[J].企业经济,2013(11):98-101.

[7] X. Hu, P. K. Chen, and Z. Lou, “Building a forecasting model of customer demand for O2O dual-channel,” in Proceedings of 2017 International Conference on Applied System Innovation (ICASI), Sapporo, Japan, 2017, pp. 721-723.

[8] Fowler M, Lewis J. Microservices [EB/OL]. [2014-3-25]. http: //martin-
fowler.com/articles/microservices.html.
[9] Balalaie A, Heydarnoori A, Jamshidi P. Microservices architecture enables DevOps: mi-
gration to a cloud-native architecture [J]. IEEE Software, 2016, 33(3): 42-45.
[10] Thönes J. Microservices [J]. IEEE Software, 2015, 32(1): 113-115.
[11] Newman S. Building microservices: designing fine-grained systems [M]. Beijing: O’Reilly Me-
dia, 2015.

[12] Knoche H, Hasselbring W. Using microservices for legacy software modernization [J]. IEEE
Software, 2018, 35(3): 44-49.
[13] Rademacher F, Sorgalla J, Sachweh S. Challenges of domain-driven microservice design:
a model-driven perspective [J]. IEEE Software, 2018, 35(3): 36-43.
[14] Pahl C, Brogi A, Soldani J, et al. Cloud container technologies: a state-of-the-art review
[J]. IEEE Transactions on Cloud Computing, 2019, 7(3): 677-692.

[15]Zhong C X, Li S S, Zhang H, et al. Microservice granularity evaluation from the perspective
of bounded context [J]. Journal of Software, 2019, 30(10): 3227-3324.
[16] Pahl C, Jamshidi P. Microservices: a systematic mapping study [C]// Proceedings of the 6th
International Conference on Cloud Computing and Services Science, Rome, Italy, 2016: 137-146.
[17] Krylovskiy A, Jahn M, Patti E. Designing a smart city internet of things platform with mi-
croservice architecture [C]// Proceedings of the 3rd International Conference on Future Internet
of Things and Cloud, Rome, 2015: 25-30.
[18] Zhou H, Chen M, Lin Q, et al. Overload control for scaling wechat microservices
[C]//Proceedings of the ACM Symposium on Cloud Computing (SoCC ’18), Association for
Computing Machinery, New York, NY, USA, 2018, 149-161.
[19] Zhou X, Peng X, Tao X, et al. Poster: benchmarking microservice systems for software engi-
neering research [C]//2018 IEEE/ACM 40th International Conference on Software Engineering:
Companion (ICSE-Companion), Gothenburg, 2018: 323-324.
[20] Deb A. Application delivery service challenges in microservices-based applications
[EB/OL]. [2016-3-31]. https://www.thefabricnet.com/application-delivery-service-challenges-in-
microservices-based-applications.

[21] Larrucea X, Santamaria I, Colomo-Palacios R, et al. Microservices [J]. IEEE Software,
2018, 35(3): 96-100.
[22] Papazoglou M P, Traverso P, Dustdar S, et al. Service-oriented computing: state of the
art and research challenges [J]. Computer, 2007, 40(11): 38-45.
[23] Ebert C, Gallardo G, Hernantes J, et al. DevOps [J]. IEEE Software, 2016, 33(3): 94-100.
[24] Trihinas D, Tryfonos A, Dikaiakos M D, et al. DevOps as a service: pushing the boundaries
of microservice adoption [J]. IEEE Internet Computing, 2018, 22(3): 65-71.
[25] Dragoni N, Giallorenzo S, Lafuente A L, et al. Microservices: yesterday, today, and
tomorrow [C]//Proceedings of the Present and Ulterior Software Engineering. Springer, Cham,
2017: 195-216.
[26] Kholy M E, Fatatry A E. Framework for interaction between databases and microservice
architecture [J]. IT Professional, 2019, 21(5): 57-63.

[27] https://www.anyvan.com/ , Anyvan

[28]https://www.barringtonfreight.co.uk/

[29] https://www.streetstream.co.uk/

[30]  https://www.getamover.co.uk/

[31] Frost, Maisha (20 November 2013). ["Moving with the times: Website innovation drives growth"](http://www.express.co.uk/finance/personalfinance/444058/Moving-with-the-times-Website-innovation-drives-growth).

[32] Johnson, Jessica (12 November 2009). ["Website to change way we transport goods?"](http://www.express.co.uk/expressyourself/139763/Website-to-change-way-we-transport-goods).

[33] Brignall, Miles (11 March 2011). ["Make a delivery and cover your petrol costs"](https://www.theguardian.com/money/2011/mar/12/make-a-delivery-petrol-costs) – via The Guardian.

[34] rest-arch https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm).



```vue
<el-aside width="200px" style="background-color: rgb(238, 241, 246)">
  <el-menu :default-openeds="['1', '3']">
    <el-menu-item index="1" @click="showPublish" v-if="usertype === 'CLIENT'">Publish</el-menu-item>
    <el-menu-item index="2" @click="showOrderList"  v-if="usertype === 'DRIVER'"><i class="el-icon-s-marketing" ></i>Markets</el-menu-item>
    <el-menu-item index="3" @click="showMyOrders"><i class="el-icon-s-order" ></i>MyOrders</el-menu-item>
    <el-menu-item index="4" @click="showReviews"><i class="el-icon-s-comment"></i>Reviews</el-menu-item>
    <el-menu-item index="5" @click="showMyInfo"><i class="el-icon-user"></i>MySelf</el-menu-item>
  </el-menu>
</el-aside>

<script>
import PublishOrder from "@/components/PublishOrder";
import OrderList from "@/components/OrderList";
import MyOrders from "@/components/MyOrders";
import Welcome from "@/components/Welcome";
export default {
  name: "Home",
  components: {PublishOrder, OrderList, MyOrders},
  comments:{
    PublishOrder
  },
  methods:{
    showPublish: function(){
      this.currentView = "PublishOrder";
    },
    showReviews: function(){
      this.currentView = "PublishOrder";
    },
    ....
  },
  data() {
    return {
      usertype:"",
      username: "",
      currentView: "",
      form: {
        message: "hello"
      },
    }
  },
  created() {
    this.currentView = Welcome;
    this.username = JSON.parse(window.localStorage.getItem("user")).name;
    this.usertype = JSON.parse(window.localStorage.getItem("user")).type;
    Welcome.data().username = this.username;
  }
}
</script>
```