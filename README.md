# Session 1 — Java

Exam-shaped Java 17 + Gradle. Same command as Artemis: `./gradlew test`.

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
./gradlew test
```

Only write code at `// TODO` markers. Do not rename methods, classes, or packages. The tests are the grader.

```bash
./gradlew test --tests eist.warmup.WarmupTest
./gradlew test --tests eist.bakery.PastryStockTest
```
