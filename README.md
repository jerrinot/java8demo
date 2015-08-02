# Java 8 Demo
Multimodule Maven project where just a single module depends on JDK 8.

It's a blueprint for a project which has to work with JDK 6, but still wants to offer goodies of modern Java development when running on Java8.

Usage:
- Make sure you have JDK8 installed and configured to use
- run `mvn clean install` to install this project into your local Maven repository
- Create a new project and add this as a dependency:
```xml
    <dependencies>
        <dependency>
            <groupId>info.jerrinot.experiements</groupId>
            <artifactId>allinone</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
```
- Sample code:

```java
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        ConcurrentMap<Object, Object> map = proxyFactory.newMap();
        System.out.println(map);
    }
}
```

## Known Issues
- The Java6 project is compiled against JDK8. The classfile version is set to version 6, but it could still cause problems for methods where return types have changed (narrowed). See http://vladmihalcea.com/2014/04/14/maven-and-java-multi-version-modules/ how to configure multiple JDKs. 
