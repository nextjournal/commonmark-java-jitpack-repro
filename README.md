# Jitpack Failure Repro

Mini program for bisecting different versions of [commonmark-java](https://github.com/commonmark/commonmark-java) against [jitpack](http://jitpack.io) maven repository. Latest commonmark versions need maven version at least 3.6.3.

```xml
<!-- last jitpack good -->
<!-- <dependency>-->
<!--   <groupId>com.github.commonmark</groupId>-->
<!--   <artifactId>commonmark-java</artifactId>-->
<!--   <version>faea2a2a61cfa1b1f26a4e914532b651b3602e34</version>-->
<!-- </dependency>-->

<!-- first jitpack bad -->
<!-- <dependency>-->
<!--   <groupId>com.github.commonmark</groupId>-->
<!--   <artifactId>commonmark-java</artifactId>-->
<!--   <version>682bdb09932a4846c389e9db43eba1b857e219cd</version>-->
<!-- </dependency>-->

<!-- commonmark main (bad) -->
<!-- <dependency>-->
<!--   <groupId>com.github.commonmark</groupId>-->
<!--   <artifactId>commonmark-java</artifactId>-->
<!--   <version>7d12b6fa1aa29397cf74299a5c7cced47496ee63</version>-->
<!-- </dependency>-->

<!-- fixed nextjournal fork-->
<dependency>
    <groupId>com.github.nextjournal</groupId>
    <artifactId>commonmark-java</artifactId>
    <version>0e979ef8f2fcd657214bf37fdd99aea8073068cf</version>
</dependency>
```

Run with

```
mvn compile exec:java -Dexec.mainClass="jitpackfailure.App"
```
