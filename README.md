# cacheadmin
Admin console for accessing cache stores such as MemCached,redis,EhCache,CoherenceGrid,etc .The support for cache stores would evolve as soon as the listed ones are completed
##Features

The initial release includes the creation of simple admin application which is built using java stack which supports the following cache stores

1. Memcached
2. Redis
3. EhCache
4. HazelCast

##Approach

The solution involves connecting the above listed cache stores using their respective APIs. Since these API's provide rich features and it's always secure to access the stores
using them.The alternative is to access via JMX api which provides generalized solution approach and don't need compile time library dependencies via build based configuration / deployment.
For Initial release going forward with store-specific client libraries which can later be avoided using JMX if needed

##Deployment

We would like to keep it simple and hence followed a simple WAR based deployment.

##Tools

* Java8
* SpringMVC
* Gradle based build system
* Apache Tomcat 7.0.x
