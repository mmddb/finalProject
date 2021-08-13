# Introduction

### x 

The project foucus on building a production-grade back-end server, for the test use, a front-end UI was developed.

### x

### Target User and Market   

The proposed application targets clients and drivers in short haul transport market and aims to help both parties complete the transportation. The client party including students who need transport their stuff after graduate, buyer or seller trading in Ebay, ordinary people who need transport bulky items sometimes and small businesses which need some transportation just in city. The driver party including individual drivers who have big cars like van, pick up or trucks and small local carrier companies.   

**On the demand side,** people’s demand for **short-distance freight transportation** is increasing.

According to the Office of National Statistics, with an estimate of almost 600 million tonnes, the short haul transportation (goods remained in the same 173 NUTS3 region) make up for 43% of the goods lifted domestically by GB HGVs in 2018 [1]. Moreover, the amount of short haul transport have been increasing with 25% since 2013. Also, the proportion of household and office removals and other non-market goods has gradually increased in recent years.[2] 

**On the supply side,** some transportation resources were left in idle by  the impact of COVID-19.

According to the report by IFC [3], due to additional restrictions, the volume of goods transported by road has dropped tremendously. The **small trucking businesses are being severely hit** because they tend not to have any backup, recovery plan, or intermittent operation plan. Moreover, except for those businesses in food distribution, others have seen their **work dry up** almost completely.



### Existing  applications

**Traditional transport companies** (**high cost and low timeliness)**

Exploring applications across platforms, there are two types of applications worth mentioning. The first type of application is developed by traditional transportation companies which have their  own transport vehicles, drivers and many staff to run the daily business. With the help of the Internet, these applications broaden the marketing channels of its transportation services and help companies attract potential consumers. But at the same time, the cumbersome transportation service process and the large operating costs of the company have not changed. These applications including Barrington Freight, Street Stream[27,28], etc.  If people want to transport some items, they first go to the website to fill in item-related information to quote and then wait for the company to reply the specific price. After the customer confirms the order, the company arranges for the vehicle to pick up the goods and customer wait for the transportation service to be completed. These applications are backed by traditional transportation companies and have a good problem handling mechanism, so they have a good reputation in the customer group. However, limited by the traditional process and large staff group, the service process is more complicated and consumes more time and money for consumers.



**Online transportation marketplace**

The second type of application is some online transportation marketplaces aim to connect people and transport companies, they provide a platform for users to obtain delivery, transport and removal services from their transport partners. These applications including Gatemover, Anyvan, etc. In the Gatemover, the **transport companies can register in the Gatemover** with some subscirptions fees. User first describe the move in the applicaiton, then app will do some filter or routing process and send the request to specfic transport companies met the requirements, then the user get specific quotes from these carriers, Getamover leave consumer and carriers do the business after user accept the quote. 

Anyvan's service model is basically the same, it matches a user’s transportation route to that of a transport provider’s and connects them,  minimising costs and cutting down CO2 emission by optimising storage space and haulage[32,33]. All transportation partners will paint the anyvan logo on the car and provide services in the name of Anyvan. [31].

These applications connected the consumer and companies, help carriers  get access to the consumer and contributed to improving the environmental protection and efficiency of transportation. However, The entire demand-side situation is still **not transparent** to the actual supplier, and customers have almost **no right** to select service providers and negotiate prices, this may result in some demands on the market that cannot be matched reasonably. In addition, they ignore other idle transportation resources in the society. Service providers in the online market are still companies, and they **do not accept individual** transportation service providers.





### Novelty of proposed application

On the basis of understanding existing applications, the proposed application has some novelties on the supply side, demand side, and utilization of social transportation resources.

On the supply side, the application absorb personal transportation service providers and create a transparent transportation market. This application accepts the registration of most individual drivers, and exposes all freight orders requested by users to drivers. Drivers can choose orders on the platform to bid according to their schedule and freight capacity.

On the demand side, the platform gives customers more right to choose and restrict service providers. After the customer reqeusts the order, he will receive quotes from multiple drivers. The personal information and reviews of these drivers can be viewed. Customers can accept the offer after a thorough consideration and leave reviews after the transportation is completed.

Also, the proposed application is committed to integrating the idle transportation resources in the society to meet the scattered and low-frequency transportation needs. It also provides a transformational idea for the freight companies impacted by the covid-19. Therefore, the project has some positive significance for the efficient use of transportation resources.



#  Background



### 1 O2O Service Model

[4]With the development of e-commerce, a new e-commerce model, O2O (Online to Offline), has come into being. This model connects offline business opportunities with the Internet, allowing customers filter services online and get the service offline.Alex Rampel [5] first proposed the concept of O2O in 2010. He believes that this model can attract more customers, companies find target customers through the network platform. Lu Yiqing and Li Chen (2013) [6] looked forward to the future development prospects and were very optimistic about the future development and potential of the O2O model. Many companies already adopted the O2O models for their businesses such as Amazon, Welmart, Alibaba [7].

O2O addresses the **inequality of information**, quantifying and visualizing services on the Internet, bringing some benefits to both businesses and consumers. However, there are some issues to be noted in the application process, such as establishing a secure transaction environment, training online and offline service personnel, and seamless integration of online and offline services.

As an O2O network transportation platform, the proposed application connected offline consumers and drivers, consumers request transportation services through the network, track the status of orders, drivers view specific order information on the platform, and both complete the service offline.





### 2 Monilithc Architectural



Monolithic Architecture (MA) [1] is the traditional method of software development, which has been used by world-renowned Internet services such as Netflix, Amazon, and eBay. In MA, all functions were encapsulating in a single application. For simple monolithic applications, it has its own advantages including easy to develop, test, deploy, and extend. However, with the development of the enterprise, the scale of the application is always growing, and will eventually become a huge monolith in a few years. At this time, the shortcomings of the monolithic architecture will outweigh its advantages. For example, the extremely complex and incomprehensible code of the MA application may hinder bug fixes and feature additions; due to a longer startup time, the huge scale of monolithic applications will slow down the speed of development and become an obstacle to continuous deployment.



[6] R. Chen, S. Li and Z. Li, "From monolith to microservices: a dataflowdriven approach", *2017 24th Asia-Pacific Software Engineering Conference (APSEC)*, pp. 466-475, 2017.

[1] C. Richardson, *Pattern: Monolithic architecture*, June 2017, [online] Available: http://microservices.io/patterns/monolithic.html.



### 3 Microservices architectural style

In 2014, Fowler and Lewis formally introduced the concept of microservice architecture [8]. It advocates the division of an application into a set of fine-grained services that interact with each other using lightweight communication mechanisms to provide ultimate value to the user [9]. Typically, these fine-grained microservices are small programs with a single responsibility that can be deployed, extended and tested independently [10-11].

Compared to traditional monolithic architecture, microservice architecturehas features such as high maintainability, high scalability, high adaptability, and containerized runtime environment, and has received a lot of attention from industry and academia [12-14].In recent years more and more large applications are migrating to microservice architecture [12].  Amazon, Netflix, TheGuardian, Twitter, Pay Pal, SoundCloud, etc. were the first to start experimenting with microservicing software systems on the cloud. [18]. Netflix's online service system uses about 500 microservices and involves 5 billion service interactions per day [19]. Amazon involves 100 to 150 microservice calls per page [20]. 

Essentially, the idea of servitization of microservices is derived from service oriented architecture (SOA) [21].However, compared to SOA, microservices differ in three significant ways.

1) From a design philosophy perspective, SOA is share-as-much-as-you-can, aiming at a high level of service reuse [22], whereas microservices are share-nothing driven, aiming at promoting further code separation and autonomy, supporting agile approaches or agile methods. [23-24].
2) From the perspective of communication methods, services in SOA architectures communicate with each other through an Enterprise Service Bus (ESB) [22], while microservices in service architectures communicate with each other through lightweight protocols such as RESTful or RPC-based APIs [25].
3) From the perspective of data sharing, the same database is shared between services in SOA architecture, while each microservice can have its own private database in microservice architecture [3].

At the same time, the microservices architecture also poses a number of problems.

Firstly, microservices interact with each other through REST and RPC, which makes the code more complex and difficult to locate the problem and requires consideration of various exceptions (failure of the invoked party, overload and loss of messages). Secondly, the increase in the number of services places an additional burden on operations and maintenance work such as debugging, configuration management and monitoring. In addition, microservices require multiple resources to be updated, and the storage of these resources is distributed, which creates data consistency issues and make business processes more complicated .



### **4 MicroService interface**

There are two popular solutions here, one is use Rpc (remote procedure call) and another is use RESTful API. A remote procedure call (RPC) is when a program causes a procedure to execute in a different physical address space, which is coded as if it were a local procedure call. Generally, the customed communication and serilization protocol were encapsulated in a framework like gRpc[] for user. 

[] https://grpc.io/

Rpc often use the binary serilization protocol like protobuf[] etc to obtain higer throughput, lower response time and performance loss.

REST acronym for **RE**presentational **S**tate **T**ransfer. It is an architectural style for **distributed hypermedia systems** and was first presented by Roy Fielding in 2000 in his famous dissertation[34]. When a client request is made via a RESTful API, it transfers a representation of the state of the resource to the requester. The request and response are made through HTTP. The request url specifies the resource, the HTTP method show the intention to the resources. The header and paremeters are also important as they contain identifier, authorization informations etc. The HTTP response retruned to requester contains the representation of resources in body and HTTP status code to show the result of request.  





# Design &  Architecture



 ##  1 Methodology 

The chosen of methodology of this project draws on the software development theory of ACD[]. One of the core ideas in ACD is "release early and often". For this reason, we applied an iterative development method. 

In the Initial minimal prototype, the implementation of core activities and the design of the micorservices architecture are mainly carried out.

Due to the urgency of time and the difficulty of implementation, the business design of initial prototype is based on informal discussions between myself and some others major in transportation and my understanding of other similar products in the background. To achieve the backend server's high performance requested by the objectives, we compared the MA and microservices and chose to design the system based on microservices architectural style.

After the initial prototype is deployed in the cloud, the software testing phase starts, which includes pressure testing (/unit testing) and user-based integration testing. **First, perform a pressure test to test the correctness of the system in simulated real scenarios and find the weak points in the system. After the unit test, some peoples will use the application, while part of process was mocked due to covid-19. Then we will iterate the business process and server implementation based on these collecting feedbacks.**

The final iteration aims to make a advanced prototype and will focus on the improvement and enhancement of the security, availability and reliability of the back-end server to achieve a system close to the production level.



 ## 2 Design

Initial prototype design is based on the the contextual analysis, the ACD model discussed in the previous Section and informal discussions with several students major in transportation. The following core activities was defined: for the clients, 1) publish order in platform, reviece the quotes from driver and accept the quote, 2) check the driver's review and make review after service; for driver, 3) check the order market and access the details of order 4) give quote to sepecific order; also, 5) clients and drivers will get notification when order status been updated. The use case diagram is shown below:

   <img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-14 15.53.46.png" alt="截屏2021-07-14 15.53.46" style="zoom:33%;" />





## **3 Services Division**

These part introduce the microservice design, including the database schema, service divison, and the interface design for service.

**Services Component division** 

For the microservices architectural, the service granularity is important, either too big or too small will bring troubles. The objective of services division including less-coupled, minimise invoke other services etc. Dividing servics based on the interaction with databse is a good way to divide services, each services has its own database and only interact with these database. This division method ensures the isolation of each services. 

Five tables was designed to support the applicaiton, they are: 

1) **Order table**: the information about the sepecific order, including driverId, clientId, place and cargo details, etc. Order table is responsible for the request when client publish new order, driver check orders in market, and they update the order status. The status of the order is defined in 4 stages - PUBLISHED (once client submit the order request) , FETCHED (after the client accept a driver's quote), PAID (client made the payment to driver), TRANSPORTED (driver completed the service).

2) **Quote table**: including the price, the orderId, driverId and the createdata, the createdata the default value is set to the currenttime by dabase, so we don't need to set this attribute in server. The table is responsible to drivers  make quote and see the quotes of orders.

3) **User table**: store the data of user, including the email, password, telephont etc, responsible for the request of authenication, register and email info when send notifications.

4) **Review table**: store review information about orders, include the comments, star given by clients, and the orderId, clientId to identify user and order. The star is a number out of 5 represented the satisfy content with driver's service.

5) **Payment table**: store driver's payment info, including card details for clients to make payment. The table is responsible for the response the request by client.

   <img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-21 18.17.32.png" alt="截屏2021-07-21 18.17.32" style="zoom:30%;" />

To reduce the constriant of other table when do CURD operation in single table, we will not set the external key between the tables. 

Based on the activity category and the interaction with database, we first divide out 3 services and assign these 5 tables to them. If we found the services are too big or small, we will make adjustment in later development.

These service and their function:

**User service**: login and register, make reviews, get payment info, get users' email,  the service will interact with Users table, Review table, Payment table.

**Order Service**: publish, check, fetch order, update order status, make and check quotes, the service will interact with Order table, Quote table.

**Notification Service**: send email with different content (order status update, new quote, registry etc), it will request the order and user info to user service and order service.

the database schema and use case of the the 3 services is shown below:



<img src="/Users/jon/Desktop/截屏2021-08-09 17.48.12.png" alt="截屏2021-08-09 17.48.12" style="zoom:30%;" />





##  4 RESTful API Design

After we got the seperated services, we need to define how they will communitcate to external request, which is the interface of microservices. Compared to Rpc, Restful use more standard and common communication protocol HTTP. And HTTP supports cross-language which is a good thing to the system because it can support more external requester implemented their system in different language and give more freedom to internal microservice to choose the most fitble language. So, consider the advantages of Restful and the implementation difficulties of Rpc, we decide to use Restful style api as the service interface in initial prototype. 

The core function of services layer is to provide service via exoposed API. So before the coding part, we need first design the RESTful API, this including identify resources, design url and assign HTTP method. Take User-service as an example, userservice interact with database User, Review and Payment, so we define these three table as three resources. Now when the object model is ready, it’s time to decide the resource URIs. At this step, focus on the relationship between services and its resources. These **resource URIs are endpoints for RESTful services**. So, if user want to do operation on User object, the uri he will request is shown below. The 8082 is the User-service's port.

```java
localhost:8082/USER-SERVICE/user
```

Our resource URIs and their representation are fixed now. Let’s decide the possible operations in the application and map these operations on user resource URI. The client can request a user object when login and upload a new user to database when register. According the generally meaning of HTTP method, we assign GET and POST to these two operation. Also, we need to sepcify the parameters needed when client do request. For example , client need set their email and password in URI parameters when do GET user request. " Just like this:

```java
http://127.0.0.1:8081/user?email=jon%40foxmail.com&password=root
```

Generally, we assign GET method to request which want get a object, POST method to request which want to add a new object, PUT to those want update resources and DELETE to those delete resoureces, and the paremeters needed is depends on business requirement.

Another aspect need to consider is the representation of the resources when commnication. The JSON was choosn to represent resources. Compared to another popular representation XML, they both have good readablity by humans and machines, but transform JSON to object is better supported in front-end because javascript has native method to do that. Also, JSON does a better job in data size and transportation speed than XML.



based on the design of services, the sequence diagram and user journey of initial prototype is shown below:   ![sequence diagram](/Users/jon/Downloads/sequence diagram-2.png)

   

   Introduction of basic activities. **maybe one detailed part**

![截屏2021-07-22 15.10.53](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-22 15.10.53.png)



## 5 **Platform, framework and architecture**

To allow the scalability of the application, the back-end and front-end of the application will be separated. Due to the time constriant and learning cost of mobile app development, the chosen platform for application is Web. 

The backend consists of serveral standalone services and exposes RESTful APIs to communicates with external applications or internal services through HTTP requests. 



The front-end will consist of reusable UI componenent and scripts in line with user journey shown in figure x. In the future development, we can transform the front-end app to mobile devices in IOS or Android and same back-end API can be used.



The front-end development used framework VueJS. As a lightweight  front-end development framework, it has some advantages like simplicity, user-friendly, few restrictions and good documentation[] compared to other frameworks like Anguar and React.

[] https://towardsdatascience.com/what-are-the-pros-and-cons-of-using-vue-js-3689d00d87b0

The framework Spring Boot was chosen in back-end development. Spring Boot is an open-source micro framework maintained by Pivotal, it has lot of advantages including help developers autoconfigure all components for a production-grade Spring application, provide sa default setup for unit and integretation tests, add many plugins that can be used to easily connect with database and middle-tier services[]. It also have good supports for microservice application and Restful api develpoment. However, spring boot often installs many extra dependencies, the deployment binary size can become very large and the complicated dependencies mangement brings some burden.

[] https://stackify.com/what-is-spring-boot/



Figure x outlines the architecture of the initial prototype. The arrows indicate the communication flow between different components. The box  represented the scope component, each component will only communicate with components in either its own layer or the layer directly adjacent to it. 

The architecture of Front-end is basd on Vue's architecture. The reqeusts from front-end will first filtered by gateway layer, which responsible for authentication and routing service. Then the services in service layer handle the request, interact with database or other services and make response. 

The services in service layser is divided to actual service modules including User, Order, Notification services, which serve external request, and service management module including services register, discovery center and admin service, which will communicate with other services to do moniter services' health info and maintain the status of each service instances. As development of the application progresses, services can also be added to the service layer. The database layer consists of Mysql database and redis for future use. In the infrastructure layer, we choose deploy the application to cloud server to obtain 24/7 availablity.



![ds](/Users/jon/Downloads/Architecture.png)













# Backend development

## 0 environment preperation

The environment prepartion including the choose of development tools' version, the directory structure of project, the setting of parent maven pom.xml and the common dependenies used.

To get all new features and the inefficient aspects of old framework, we chosed the newest Spring Boot 2.5.3 version and Spring Cloud 2020.3 version at the initial phase in Augest 2021. Then we created a parent Spring boot project called "bravotransport", and choose maven as dependency manager. The microservices will add into the parent as standalone sub-project, the file structure is shown below:

```
--bravotransport
	-- userservice
		-- controller
		-- mapper
		-- model
		-- userapplicaion
	-- orderservice
	-- emailservice
	-- eureka
	-- admin
	-- gateway
	--pom.xml
```

Then we set the content of pom.xml of parent project, we will set some basic projec information (version of framework etc.) and some dependencies which used by all the child project, including Lombok (autogenerate getter and setter), Swagger (generate the API documentaion) and Service discovery denpendency - Eureka (as service register center) etc. 

In this way, child pom can refer the parent POM using `parent` tag and specifying `groupId/artifactId/version` attributes. This pom file will inherit all properties and dependencies from parent POM and additionally can include extra sub-project specific dependencies as well.



## 1 ORM Framework inplementaion 

In the proposed application, most requests would be the CURD opeartion to database and recieve result, so handling interaction between server to database is important. Basiclly, there are two ways communication to database in Java applicaiton. One way is use JDBC and another is use ORM framework.  JDBC is an interface provided by the package java.sql to query and update the database. When we use JDBC to access database, we need manully handle the lifcycle of connections, and it will cause the frequent connections and closes that make a waste to database recources. Also, JDBC need hard-code SQL sentence and attribute into java class, it will cause the poor maintainability.

ORMs are based on JDBC 'under the hood', they encapsulated all tedious work for us and make developer foucs on business logic. One main disadvantage comparison with JDBC is ORM framework have slow performance in case of large batch updates, so we will avoid these query in the business process.

To obtain the convenience and maintainability, the Object-Relational-Mapping framework was used. 

The Spring Framework supports integration with Hibernate, Java Persistence API (JPA), Java Data Objects (JDO) and iBATIS SQL Maps for resource management, data access object (DAO) implementations, and transaction strategies []. 

Why Mybatis ?

Mybatis was chosen as the ORM framework integrated with Spring Boot.

User Order service as example, First we initiate a new Spring Boot project inside parent project bravotransport, and add mybatis dependency. Because we need connect Mysql database, the mysql-connector also need be added.

```xml

<dependency>
  	<groupId>org.mybatis.spring.boot</groupId>
		<artifactId>mybatis-spring-boot-starter</artifactId>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
```

The mybatis-spring-boot-starter is provided by mybatis develop tema for Spring Boot. 

To communication with database, we only need 3 steps, firstly, write configuration information - the attributes of datasource into application.properties file. 

```properties
spring.datasource.driverClassName = com.mysql.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/User?useUnicode=true&characterEncoding=utf-8
spring.datasource.username = root
spring.datasource.password = root
```

Secondly, create resource models and create Mapper interface. We need create the data models of resources to hold the relational data comes from database, for User services, we created User, Payment, Review data type. The interface defines the method to communication with database, and declare the SQL sentence in the annotation of method. For example, the below code shows methods to get a user according email and insert a payment info to payment table. Some of the mapper method is shown below:

```java
public interface UserMapper {
    @Select("SELECT * FROM Users WHERE email = #{email} ")
    User findUserByEmail(String email);

    @Insert("INSERT INTO Payment (userId,recipient,sortcode,accountnumber) VALUES(#{userId}, #{recipient}, #{sortcode},#{accountnumber})")
    void insertPayment(Payment payment);
  ...
}
```

Thirdly, tell the application where is the mapper interface. Add annotaion MapperScan in the start class of project, so mybatis will know where to find the mapper file. 

```java
@MapperScan("com.jon.api.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
```

After the 3 steps, we can communication with database. In the controller class where we handle request, we can just declare the UserMapper type object in class and add the @Autowired annotation provided by Spring Boot. We don't need to concern the instantialise of UserMapper and when we invoke the methods of UserMapper, Mybatis will automaticly generate an instance for us. 

The attribute "required" in @Autowired means if the wire can be ignored if can't find the bean at the begining, the default value is true. But the userMapper instance is generate by Mybatis when project running rather we crreate it before, so there will be an "No beans of 'UserMapper' type found" error if the value is true. The example is shown below:

```java
public class UserController {
    @Autowired(required = false)
    private UserMapper userMapper;
    ...
    // 
    public Boolean register(@RequestBody User user){
        userMapper.insertUser(user);  // we can just use the userMapper
        if(userMapper.findUserByEmail(user.getEmail()) != null){
            return true;
        }
        return false;
    }
}
```





## 2  RESTful API Inplementation

After set the interaction of database, we can implement the APIs based on the API design discussed in previous section. Take the convinenience of Spring Boot, we can easily configure class and method use annotation. In the API inplementation part, we will develop the controller class in User, Order, Email microservices to handle request and use Swagger plugin to generate an useful API documentation for services in web.

The development of these controllers basically is adding annotation to class and methods. In the controller level, we added @RestController, @CrossOrign etc.

Spring 4.0 introduced the *@RestController* annotation in order to simplify the creation of RESTful web services. It will tell Spring that every request handling method of the controller class automatically serializes return objects into ***HttpResponse***. **It's a convenient annotation that combines @Controller and @ResponseBody**[].

[] https://www.baeldung.com/spring-controller-vs-restcontroller

For security reasons, browsers prohibit AJAX calls to resources outside the current origin[]. Cross-Origin Resource Sharing (CORS) is a W3C specification[1] implemented by most browser that lets user specify what kind of cross-domain requests are authorized [2]. By the @CrossOrigin provided by Spring, we can configure it in our application. We can customize the configuration by specifying the value of the annotation attributes: *origins*, *methods*, *allowedHeaders*, *exposedHeaders*, *allowCredentials* etc. At the initial prototype application, we just focused on the core activities and leave it to default value. We added the annotation on the class level and all methods in the class have it enabled to allow request from all origins.

[1] https://www.w3.org/TR/cors/

[2] https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-cors

Also, in the method level, we need add annotations to mapper the request to methods. We will use @GetMapping, @PostMapping, @PutMapping and @DeleteMapping and specify the request url in its attribute . For example, @GetMapping(value = "/user") will mapping HTTP `GET` requests `http://localhost:8081/user` onto specific handler methods.

The last thing is define the return object. We use Java object **Response entity** to hold the information return to consumer. A ResponseEntity consists of a body and http status, which is just satsified our requirements. The status is a Enum object, it has a lot of value like `OK(200)`, `CREATED(201)`, `NO_CONTENT(204)`. We can put the resoureces object to the body and set the status code to suggest the request status and Spring will construct the HTTP response based on the ResponseEntity we returned. 

Along with the API development, to make a good explanation for the API consumers and test the api's functionality easily, the api doc generator Swagger was used. Swagger will scan the clsss's annotations and retrieve the attributes, then make docs available in specific port. In the web pages, we easily test the apis by input the parameters and check the return values. We set the `@Api, @ApiModel, @ApiModelProperty` to the class, and many annotations to the methods to explain the resources model and api details including the parameters, responses, notes etc.

The code below shows an example of a method:

```java
 @GetMapping("/order")
    @ApiOperation(value = "Get orders of specific user", notes = "userType = 'CLIENT' || 'DRIVER'")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Query successfully", response = ResponseEntity.class),
            @ApiResponse(code = 406, message = "User type not acceptable", response = ResponseEntity.class),
            @ApiResponse(code = 204, message = "No Content", response = ResponseEntity.class)
    })
    public ResponseEntity getOrders(String userType, String userId){
        List<Order> orders;
        if("CLIENT".equals(userType)) {
            orders = orderMapper.selectByClientId(userId);
        }else if("DRIVER".equals(userType)){
            orders = orderMapper.selectByDriverId(userId);
        }else{
            return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
        }
        if(orders.size() == 0){
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(orders, HttpStatus.OK);
    }

```

The figures below show the overview API documentation of Order services and a API's details.

![截屏2021-08-11 10.47.10](/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-11 10.47.10.png)



[<img src="file:///Users/jon/Library/Application%20Support/typora-user-images/%E6%88%AA%E5%B1%8F2021-07-21%2018.06.03.png?lastModify=1628573164" alt="截屏2021-07-21 18.06.03" style="zoom:33%;" />](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/HttpStatus.html)





## 3 Service Registration and Discovery

Generally, each services in the system is standalone instances, the number of instances, the running port, and health information in specifc services is changing all the time. So the service registry center helps services know the status of other services and they can use these infos to adjust their request strategy. 

For the services, their instances will register themselves with the registry center on startup and deregistered on shutdown. Other services will query the registry center to find the available instances of a service, this is the discovery process. The registry center maintain a registry table which contains the basic infos of instances registered and may invoke a service instance’s health check API to verify that it is able to handle requests[]. 

To implement the registry center, the popular solution Eureka was used. Eureka is a REST based service for locating services and for the purpose of load balancing and failover of middle-tier servers. We call this service, the **Eureka Server**. Eureka also comes with a Java-based client component, the **Eureka Client**, which makes interactions with the service much easier[]. Like the figure below, the Eureka is inside the each service and get registry form Eureka server, then make remote call to other services. To get a high availability, Eureka can set serveral replicas to avoid single point of failure.

[] https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance

<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-11 11.22.00.png" alt="截屏2021-08-11 11.22.00" style="zoom: 50%;" />

To set the Eureka server and client, we need to add eureka-server dependency to the Eureka project and eureka-client dependency to other services, set a few Eureka configuration attributes in applicantion.properties, and add annotation @EnableEurekaServer and @EnableEurekaClient respectively. 

 evicting the stale instances // 驱逐服务

Eureka server expects heartbeats from the client at specific intervals and counts whether the heartbeat failure rate is less than 85% within 15 minutes. If it is, Eureka Server will protect these instance and set their status always UP. Because we probably need to start and shut down service frequently in the devlopment and test stage, so Eureka server is likely to enter self-presercation mode and hold invalid instances. The Eureka server activate the self-preservation mode defaultly, so in current development stage, we set this attribute to false. The application.properties code with the other attribute's setting is shown below,  

```yml
# For Eureka Server
eureka:
  client:
    register-with-eureka: false   # do not register itself
    fetch-registry: false         # don not cache registry table in local
  server:
    enable-self-preservation: false # disable self-preservation
```

```yml
## For Eureka client
eureka:
  instance:
    prefer-ip-address: true # automatically picked up from system by the application, so we don't need to provide IP address in any configuration
  client:
    fetch-registry: true  # get the registry info
    register-with-eureka: true # client need to register with server
    service-url:
      defaultZone: http://localhost:8761/eureka/  # the url of Eureka Server
```

The figures below shows the info of instances including the status, ipaddress, availability etc. The name of services is the name set at Spring.application.name in application.properties.

<img src="/Users/jon/Desktop/截屏2021-08-11 12.24.50.png" alt="截屏2021-08-11 12.24.50" style="zoom:50%;" />





## 3 Service Consuming

Besides the communication with external resquests, the services also need to be consumed by other services through RESTful API. Spring provides the RestTemplate class which offers templates for common scenarios by HTTP method, in addition to the generalized `exchange` and `execute` methods that support of less frequent cases. For example, if we want to do GET request to the URI http://localhost:8082/order, we need call getForObject method and hardcode the uri, parmeters, return object  into business code. 

```java
Order order = restTemplate.getForObject("http://localhost:8082/order?userid=" + userid, Order.class);   
```

Another solution is the Feign client provide by Netflix. Feign abstracts lots of mechanics of calling a REST service. Similar to Mybatis, the feign is declarative. Once we configure and annotate the Feign interface, we can call a REST service by making a simple Java function call. Also we do not need to write any unit test because we do not need to write any implementation. Another advantages is feign can make request by service name by cooperating with Eureka server. For the better features, we choose Feign as client to make request to other services.

The very first thing is to include the dependencies in each services. Then, we need to write interfaces and request methods. Take the email service as example, we create a UserFeignClient to make all requests to userservicem, add `@FeignClient(value = "USER-SERVICE")` to tell feign the request destination is User-service, Feign will get the IP of user service and make request based on it, and write the methods just like those request handling methods in controller classes.

```java
@Component
@FeignClient(value = "USER-SERVICE")
public interface UserFeignClient {
    @RequestMapping(value = "/email")
    String getUserEmail(@RequestParam String userId);
}
```

In the email service's controller, we Autowired the UserFeignClient and call it just like a normal function, Feign does everything in the background.

```java
@Autowired
private UserFeignClient userFeignClient;
public void getEmail() {
    String email = userFeignClient.getUserEmail("3");
}
```





## 4 Service Gateway

In the micro-services system we build now, the client will directly request to the service by the URL. It will bring two problems, coupling and security issuses. The clients are coupled to the microservices because they need to know the excat ip address and  running port of every services. Also, all the microservices were exposed to the "external world", making the attack surface larger, and the authenication was carry out by microservices themselves. 

To address these problem, we implement the gateway service. Zuul provided by Netflix and Spring Gateway are widely-used in Spring project. Due to the constriant of Spring Boot version, we choose Spring Gateway as the tool. Spring is newer than Zuul and was proved has better performance. Also, Spring Gateway is developed by Spring team and it is better-support to Spring Project.

One of the task of gateway is the dynamic routing service, gateway will recieve all the request and forward them to real service. To use the dynamic routing, we just set the attribute `spring.cloud.gataway.discovery.locator.enabled = true`, then Spring gateway will use the registry table fetched from Eureka to map the request to service.

Another task is to filter the requests. In the initial application, we only add the authentication to the filter. To do that, we wrote a class implements the GlobalFilter to filter all the requests. By overide the filter( ) method, every requests except the `user` (login or register can't be filterd) or get `token` ( implemented in user-service for now) will be checked. If the request is valid, it will be forwarded to internal services, if not, the gateway will set 401 (UNAUTHORIZED)  status code of http response and return.

```java
public class AuthenticationFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        if(path.contains("/user") || path.contains("/token")){
            return chain.filter(exchange);  // let it go
        }
        List<String> token = request.getHeaders().get("token"); // get token
        // if token is right, let it go
        if(JwtUtil.tokenValid(token.get(0))){
            return chain.filter(exchange);
        }
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        return response.setComplete();  // return 401
    }
}
```

The authentication process used JWT token.  JSON Web Token (JWT) is an open standard ([RFC 7519](https://tools.ietf.org/html/rfc7519)) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the **HMAC** algorithm) or a public/private key pair using **RSA** or **ECDSA**[].

Authorization is the most common scenario for using JWT. Compared to use Session to authenticate, the server do not need to remember the authentication information which is fitable for the stateless features with our RESTful server. Also, the

Once the user is logged in and get the token, each subsequent request should include the JWT, allowing the user to access services and resources that are permitted with that token. The jwt has encoded representation and decoded representation. The decoded form consists of Header (the algorithm used ), Payload (we put useid and user type to it), verify signature (like a private secret). After encoded, this information will be representation as a long String. We customised the class JwtUtil to generate the token and check the validity, code is shown in appendix.



## 5 Service Monitor

To better monitor the running of services, we implemented Spring Boot Admin. Spring can display the information in Actuator on an interface, and can also monitor the health status of all services and provide real-time alarm functions.

To get the health info of other services, we need add Actuator denpendency to them and set `management.endpoints.web.exposure.include=*` to  expose all endpoints to external world (we will disable some sensible endpoints in production environment). When implement this part coding, the Actuator only support the Spring Boot version below 2.5.2, so we degraded the Spring Boot to 2.4.9 and solved it. In the admin project, we add Spring Boot Admin dependency and the Eureka so the admin can their health info according the ip address and port. After all the services startup, we can see the services in wallboard and check the details including the JVM, loggers, attributes, memory infos of services. When services start or offline, we can get notification about that. The figures are shown below:

<img src="/Users/jon/Desktop/截屏2021-08-11 16.12.46.png" alt="截屏2021-08-11 16.12.46" style="zoom:50%;" />

![截屏2021-07-30 10.24.03](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-30 10.24.30.png)





# Fronted-end  Development

## 0 set dev environment 

This part mainly consists of researching and installing VueJS, the VueCli tool and other plugins used to in fronted. The plugins including element-ui (a Desktop UI Library), vue-sweetalert2 (make beautiful alert ) and google-maps (request routes info).



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







<img src="/Users/jon/Desktop/截屏2021-08-02 09.02.28.png" alt="截屏2021-08-02 09.02.28" style="zoom: 25%;" />



<img src="/Users/jon/Desktop/截屏2021-08-02 09.02.20.png" alt="截屏2021-08-02 09.02.20" style="zoom: 25%;" ><img src="/Users/jon/Desktop/截屏2021-08-02 09.04.16.png" alt="截屏2021-08-02 09.04.16" style="zoom:30%;" /



## 2 Home page and common part 

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

Makint review: Using the el-rate label, the stars at the top of the dialog box represent scores, each star represents one point, and the bottom is a comment input box. These two parameters are respectively bound to the value and review variables in the component. After the user clicks submit, it will be sent to the backend.

<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-04 14.23.01.png" alt="截屏2021-08-04 14.23.01" style="zoom:33%;" />





## 4 Driver part (Market page)

The market page is the driver's unique interface, which displays all the orders placed by users on the market and the operations that can be performed.

<img src="/Users/jon/Desktop/截屏2021-08-04 13.13.35.png" alt="截屏2021-08-04 13.13.35" style="zoom:33%;" />

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



In terms of obtaining order information, the request for market order information from the backend is encapsulated in the Vue method beforeCreate(), so that before the module is displayed, we can pass the obtained Order array into the data Orderdata defined on this page.

The implementation of the three operations of the order is as follows. The first is the display of the order details: similar to the previous display of MyOrders component, the order data object of the row is assigned to infodata through 'slot-scope', and the variable detailsInvisiable is set to true to display the dialog box.

<img src="/Users/jon/Desktop/截屏2021-08-04 12.41.14.png" alt="截屏2021-08-04 12.41.14" style="zoom:33%;" />



The second is the Quotes module; when the user clicks Quotes, the quote dialog will be displayed. It consists of a quote table and an input box below. The **v-model** attribute of the input box is bound to the Market Component's variable quote, and the driver can input price in his mind and click confirm button to submit (after clicking, Axios sends a request to the backend with the driver id, orderid and price). In the process of implementation, first create and import the sub-module quote component of the market. The parent module market will pass the orderId of the current line to the quote component through the **porp** attribute of the quote component, and the quote component will use this id to request all the quotes of this orderId from the backend Information, and finally display information on the dialog.



<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-04 10.50.13.png" alt="截屏2021-08-04 10.50.13" style="zoom:33%;" />



The last is the display of route information. Drivers can check the route plan, length and estimated time under the google map. The implementation of this part uses the third-party service vue2-google-map. On this basis, this project has developed a custom DirectionsRenderer module that can display the route between two points on the map. This module first obtains the DirectionsService() object provided by Google , and then carry the Google developer key previously applied for and the location and traffic mode (always set to DRIVING) information to request route information. Then, parse out the distance and duration of the first optional route, and store it in the localStorage in the form of key-value for the Market component to use. Finally, draw the route with the help of the setDirections() function provided by vue2-google-maps.



<img src="/Users/jon/Library/Application Support/typora-user-images/截屏2021-08-04 12.39.36.png" alt="截屏2021-08-04 12.39.36" style="zoom:33%;" />





## Deployment

For this project, there are two main solutions for deploying to the cloud. One is the virtual machine in cloud server (IaaS) that needs to manually configure the application but has a higher degree of freedom, and the other is to choose the (PaaS) platform as a service provider that is responsible for all the details of the infrastructure.

Choosing PaaS can focus on developing applications without worrying about configuring and maintaining servers. With the support of PaaS service providers, a single application can be deployed easily, but for a microservice project with multiple independent sub-projects, deployment is more time-consuming. And the front-end server and database may also choose other different service providers for deployment, the communication between them and the back-end server is also a problem.

In the end, we chose the cloud server of IaaS Google Cloud Platform for deployment, and obtained a Linux host running 4G of memory through the trial plan. For deployment, we adopted Multiple Service Instances per Host Pattern. Its advantage is that resource usage is relatively efficient, and multiple service instances share the server and its operating system. Deploying service instances is relatively fast. Just copy the service to the host and start it. Since our service is written in Java, we only need to copy the JAR, and we can package a single service into multiple Jar packages to achieve multiple instances. For the shortcomings like there is no isolation between service instances, we will leave it in the future development.  











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

[40] https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html#deployment.cloud





```java
package com.jon.gateway;

import io.jsonwebtoken.*;

import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    private static long time  = 1000*60*60*24;
    private static String signature = "bravoTransport";
    private static String secret = Base64.getEncoder().encodeToString(signature.getBytes());
    public static String jwt(String userId, String role){
        JwtBuilder jwtBuilder = Jwts.builder();
        return jwtBuilder.setHeaderParam("typ", "jwt")
                .setHeaderParam("alg", "HS256")
                // payload
                .claim("userId", userId)
                .claim("role", role)
                .setSubject("jwt-token")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                // signature
                .setId(UUID.randomUUID().toString())
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
    public static boolean tokenValid(String token){
        JwtParser parser = Jwts.parser();
        try {
            Jws<Claims> claimsJws = parser.setSigningKey(secret).parseClaimsJws(token);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static String getId(String token){
        JwtParser parser = Jwts.parser();
        Jws<Claims> claimsJws = parser.setSigningKey(secret).parseClaimsJws(token);
        return (String) claimsJws.getBody().get("userId");
    }
}
```



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

