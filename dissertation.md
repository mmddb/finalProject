** 价格灵活：

** 利用闲散资源：同样打车的模式，利用社会闲散运力，

** 降低空载率：对货运来说，解决空载率的问题，对于传统货运网站来说，完成一单后，在回程时有空载的问题，借助平台



### Objectives:





#  <u>Background</u>



### Target User and Market

The proposed application targets clients and drivers in short haul transport market and aims to help both parties complete the transportation. The client party including students who need transport their stuff after graduate, buyer or seller trading in Ebay, ordinary people who need transport bulky items sometimes and small businesses which need some transportation just in city. The driver party including individual drivers who have big cars like van, pick up or trucks and small local carrier companies.   

**On the demand side,** people’s demand for short-distance cargo transportation is increasing.

According to the Office of National Statistics, with an estimate of almost 600 million tonnes, the short haul transportation (goods remained in the same 173 NUTS3 region) make up for 43% of the goods lifted domestically by GB HGVs in 2018 [1]. Moreover, the amount of short haul transport have been increasing with 25% since 2013. Also, the proportion of household and office removals and other non-market goods has gradually increased in recent years.[2] 

**On the supply side,** some transportation resources were left in idle by  the impact of COVID-19.

According to the report by IFC [3], due to additional restrictions, the volume of goods transported by road has dropped tremendously. The **small trucking businesses are being severely hit** because they tend not to have any backup, recovery plan, or intermittent operation plan. Moreover, except for those businesses in food distribution, others have seen their **work dry up** almost completely.



### O2O Service Model

[4]With the development of e-commerce, a new e-commerce model, O2O (Online to Offline), has come into being. This model connects offline business opportunities with the Internet, allowing customers filter services online and get the service offline.Alex Rampel [5] first proposed the concept of O2O in 2010. He believes that this model can attract more customers, companies find target customers through the network platform. Lu Yiqing and Li Chen (2013) [6] looked forward to the future development prospects and were very optimistic about the future development and potential of the O2O model. Many companies already adopted the O2O models for their businesses such as Amazon, Welmart, Alibaba [7].

O2O addresses the **inequality of information**, quantifying and visualizing services on the Internet, bringing some benefits to both businesses and consumers. However, there are some issues to be noted in the application process, such as establishing a secure transaction environment, training online and offline service personnel, and seamless integration of online and offline services.

As an O2O network transportation platform, the proposed application connected offline consumers and drivers, consumers request transportation services through the network, track the status of orders, drivers view specific order information on the platform, and both complete the service offline.





// need some statistics

(低价吸引人) In general, however, it appears that the opportunities for attracting traffic are greater through lower rates than improvements in service quality.

Winston, Clifford. "A Disaggregate Model of the Demand for Intercity Freight Transportation." *Econometrica* 49, no. 4 (1981): 981-1006. Accessed July 24, 2021. doi:10.2307/1912514.



### Existing applications



**Traditional transport companies** (**high cost and low timeliness)**

Reliant, AnyVan, The company have their **own transport vehicles, drivers** and many staff and cost a lot to maintain daily e xpenses. If people want to transport some large items, people first go to the website to fill in item-related information to quote and then wait for the company to reply the specific price. After the customer confirms the order, the company arranges for the vehicle to pick up the goods. **a lot of procedure**



**Online transport Platform**

**Gatemover**: user first describe the move and app will send the request to transport companies meet the requirements, then the user get specific quotes from these carriers then Getamover leave consumer and carriers do the business. The **transport companies can register in the Gatemover** with some subscirptions fees.

The Getamover connected the consumer and companies, help carriers  get access to the consumer, but the filter process of transport companies is **not transparent**, transport end still cannot see the whole request information of the consumer. Then there are some chance that the provider and consumer cannot be paired reasonably. **Not for individual drivers.** 





### Novelty of proposed application

1. Decrease the cost in transport end
2. Make the transport demands **transparent**
3. seperated 
4. Restrict drivers and Protect consumer rights





### Microservices architectural style 

In 2014, Fowler and Lewis formally introduced the concept of microservice architecture [8]. It advocates the division of an application into a set of fine-grained services that interact with each other using lightweight communication mechanisms to provide ultimate value to the user [9]. Typically, these fine-grained microservices are small programs with a single responsibility that can be deployed, extended and tested independently [10-11].

Compared to traditional monolithic architecture, microservice architecturehas features such as high maintainability, high scalability, high adaptability, and containerized runtime environment, and has received a lot of attention from industry and academia [12-14].In recent years more and more large applications are migrating to microservice architecture [12].  Amazon, Netflix, TheGuardian, Twitter, Pay Pal, SoundCloud, etc. were the first to start experimenting with microservicing software systems on the cloud. [18]. Netflix's online service system uses about 500 microservices and involves 5 billion service interactions per day [19]. Amazon involves 100 to 150 microservice calls per page [20]. 

Essentially, the idea of servitization of microservices is derived from service oriented architecture (SOA) [21].However, compared to SOA, microservices differ in three significant ways.

1) From a design philosophy perspective, SOA is share-as-much-as-you-can, aiming at a high level of service reuse [22], whereas microservices are share-nothing driven, aiming at promoting further code separation and autonomy, supporting agile approaches or agile methods. [23-24].
2) From the perspective of communication methods, services in SOA architectures communicate with each other through an Enterprise Service Bus (ESB) [22], while microservices in service architectures communicate with each other through lightweight protocols such as RESTful or RPC-based APIs [25].
3) From the perspective of data sharing, the same database is shared between services in SOA architecture, while each microservice can have its own private database in microservice architecture [3].

At the same time, the microservices architecture also poses a number of problems.

Firstly, microservices interact with each other through REST and RPC, which makes the code more complex and difficult to locate the problem and requires consideration of various exceptions (failure of the invoked party, overload and loss of messages). Secondly, the increase in the number of services places an additional burden on operations and maintenance work such as debugging, configuration management and monitoring. In addition, microservices require multiple resources to be updated, and the storage of these resources is distributed, which creates data consistency issues and make business processes more complicated .











### REST architectural style 

Acronym for **RE**presentational **S**tate **T**ransfer. It is architectural style for **distributed hypermedia systems** and was first presented by Roy Fielding in 2000 in his famous [dissertation](https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm).

Principles, pros, cons	

		1. **Stateless** (use HTTP)
		2. use JSON object in request and response (lighter, self-explanation)
		3. http state code: 
		4. use URI to describe intentation





## <u>Architecture & Design</u>

1. #### **Methodology**

   

2. #### Design

   ![截屏2021-07-24 15.56.46](/Users/jon/Desktop/截屏2021-07-24 15.56.46.png)Iteration development process: ?? what method? 

   **First** step: develop the **core activities**

   1) client can publish the transportation order and cancel order

   2) driver can check the details of the order and fetch order

   3) client and dirver can  get notification  in time when order status changed.

   ![截屏2021-07-14 15.53.46](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-14 15.53.46.png)

   

   

   **User Journey**

   ![截屏2021-07-22 15.10.53](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-22 15.10.53.png)

   

   **Second** step: add advanced process (security, ) in project, and make the process robust and solid, fix bug;

   **Finally**: do some user test and imporve the project.



### Services Component division

**a. Break down the business process**

based on the request to the **database** , we can divide the services to, User service, Order service, Notification Service, 

**User service**: authentication, look and make reviews, => Users table, Review table

**Order Service**: publish, check, fetch, cancel order, => Order table

**Notification Service**: send email with different content ( order status update，new quote )



**b. Define service granularity**

first make it bigger and ,   in the 

**c. Define service interface**

​		**use RESTful API**,  ?? goods ...return JSON, including hypermedia links , make consumer easier to do next steps 

​		







3. ###  **Architecture**

   

   ![Architecture](/Users/jon/Downloads/Architecture.png)

   

   ### **platform , language, framework**

   Platform: Web

   Framework: Vue, Spring Cloud



ApacheBench 作为压力测试工具







## Backend development

### 1 environment preperation

Spring boot, spring cloud, mysql, mybatis.., maven, swagger, jwt





### 2 Services RESTful API Design

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

![截屏2021-07-21 18.17.32](/Users/jon/Library/Application Support/typora-user-images/截屏2021-07-21 18.17.32.png)



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









### 3. Service Registration and Discovery

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



### 4 Service Gateway

use Spring Gateway: ?? goods



1. #### Dynamic routing

   get registry table from eureka, and route request to services respectively

2. #### Authentication (filter)

   check the token of request, then 

   

   

1、client 出价，driver 出价，



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
