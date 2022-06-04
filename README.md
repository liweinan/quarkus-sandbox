# code-with-quarkus Project

```bash
➤ curl 'http://localhost:8080/p?q=1'                                   23:28:35
Q: 1⏎
weli@ovpn-12-129:~/w/code-with-quarkus|main⚡*?
➤ curl 'http://localhost:8080/p'                                       23:28:40
Q: null⏎
weli@ovpn-12-129:~/w/code-with-quarkus|main⚡*?
➤                                                                      23:28:43
```

```bash
➤ quarkus ext list -i -s hibernate
Current Quarkus extensions installable: 

✬ ArtifactId                                         Extension Name
✬ blaze-persistence-integration-quarkus              Blaze-Persistence
✬ quarkus-agroal                                     Agroal - Database connection pool
✬ quarkus-hibernate-envers                           Hibernate Envers
✬ quarkus-hibernate-orm                              Hibernate ORM
✬ quarkus-hibernate-orm-panache                      Hibernate ORM with Panache
✬ quarkus-hibernate-orm-panache-kotlin               Hibernate ORM with Panache and Kotlin
✬ quarkus-hibernate-orm-rest-data-panache            REST resources for Hibernate ORM with Panache
✬ quarkus-hibernate-reactive                         Hibernate Reactive
✬ quarkus-hibernate-reactive-panache                 Hibernate Reactive with Panache
✬ quarkus-hibernate-reactive-rest-data-panache       REST resources for Hibernate Reactive with Panache
✬ quarkus-hibernate-search-orm-coordination-outb...  Hibernate Search Coordination with Outbox Polling
✬ quarkus-hibernate-search-orm-elasticsearch         Hibernate Search + Elasticsearch
  quarkus-hibernate-search-orm-elasticsearch-aws     Hibernate Search + Elasticsearch - AWS authentication and request signing
  quarkus-hibernate-types                            Quarkus - Hibernate Types - Runtime
✬ quarkus-hibernate-validator                        Hibernate Validator
✬ quarkus-narayana-jta                               Narayana JTA - Transaction manager
  quarkus-renarde                                    Renarde
```


```bash
➤ quarkus ext add quarkus-hibernate-orm-panache                                                                                                                                                                                                                                                                 23:37:41
[SUCCESS] ✅  Extension io.quarkus:quarkus-hibernate-orm-panache has been installed
```

```bash
➤ quarkus ext add quarkus-jdbc-h2                                                                                                                                                                                                                                                                               23:38:18
[SUCCESS] ✅  Extension io.quarkus:quarkus-jdbc-h2 has been installed
```

```bash
➤ quarkus ext add quarkus-jdbc-postgres                                                                                                                                                                                                                                                                         23:53:17
[SUCCESS] ✅  Extension io.quarkus:quarkus-jdbc-postgresql has been installed
weli@ovpn-12-129:~/w/code-with-quarkus|main⚡*?
```


```sql
postgres=# create database quarkus_test owner weli;
CREATE DATABASE
```

---

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
# quarkus-sandbox
