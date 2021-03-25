## Download Cucumber

In some cases the following wget commands need https instead of http to download the jar files.

```sh
cd /Library/Java/JUNIT
sudo wget https://repo1.maven.org/maven2/info/cukes/cucumber-java/1.2.5/cucumber-java-1.2.5.jar
sudo wget https://repo1.maven.org/maven2/info/cukes/cucumber-junit/1.2.5/cucumber-junit-1.2.5.jar
sudo wget https://repo1.maven.org/maven2/info/cukes/cucumber-core/1.2.5/cucumber-core-1.2.5.jar
sudo wget https://repo1.maven.org/maven2/info/cukes/gherkin/2.12.2/gherkin-2.12.2.jar
sudo wget https://repo1.maven.org/maven2/info/cukes/cucumber-jvm-deps/1.0.5/cucumber-jvm-deps-1.0.5.jar
sudo chown $USER:$USER /Library/Java/JUNIT/*
sudo chmod 755 /Library/Java/JUNIT/*
```

## Selenium configuration for Junit

```sh
# This 2 sed commands replace the old classpath line by this new one in the 2 profile files (zsh_profile and bash_profile):
#export CLASSPATH=/Library/Java/JUNIT/junit-4.12.jar:/Library/Java/JUNIT/hamcrest-all-1.3.jar:/Library/Java/JUNIT/chromedriver:/Library/Java/JUNIT/client-combined-3.8.1.jar:/Library/Java/JUNIT/client-combined-3.8.1-sources.jar:/Library/Java/JUNIT/selenium-server-standalone-3.8.1.jar:/Library/Java/JUNIT/cucumber-java-1.2.5.jar:/Library/Java/JUNIT/cucumber-junit-1.2.5.jar:/Library/Java/JUNIT/cucumber-core-1.2.5.jar:/Library/Java/JUNIT/gherkin-2.12.2.jar:/Library/Java/JUNIT/cucumber-jvm-deps-1.0.5.jar:.

sed -i'.backup'-e 's/CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:\/Library\/Java\/JUNIT\/chromedriver:\/Library\/Java\/JUNIT\/client-combined-3.8.1.jar:\/Library\/Java\/JUNIT\/client-combined-3.8.1-sources.jar:\/Library\/Java\/JUNIT\/selenium-server-standalone-3.8.1.jar:./CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:\/Library\/Java\/JUNIT\/chromedriver:\/Library\/Java\/JUNIT\/client-combined-3.8.1.jar:\/Library\/Java\/JUNIT\/client-combined-3.8.1-sources.jar:\/Library\/Java\/JUNIT\/selenium-server-standalone-3.8.1.jar:\/Library\/Java\/JUNIT\/cucumber-java-1.2.5.jar:\/Library\/Java\/JUNIT\/cucumber-junit-1.2.5.jar:\/Library\/Java\/JUNIT\/cucumber-core-1.2.5.jar:\/Library\/Java\/JUNIT\/gherkin-2.12.2.jar:\/Library\/Java\/JUNIT\/cucumber-jvm-deps-1.0.5.jar:./g' ~/.zsh_profile

sed -i'.backup'-e 's/CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:\/Library\/Java\/JUNIT\/chromedriver:\/Library\/Java\/JUNIT\/client-combined-3.8.1.jar:\/Library\/Java\/JUNIT\/client-combined-3.8.1-sources.jar:\/Library\/Java\/JUNIT\/selenium-server-standalone-3.8.1.jar:./CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:\/Library\/Java\/JUNIT\/chromedriver:\/Library\/Java\/JUNIT\/client-combined-3.8.1.jar:\/Library\/Java\/JUNIT\/client-combined-3.8.1-sources.jar:\/Library\/Java\/JUNIT\/selenium-server-standalone-3.8.1.jar:\/Library\/Java\/JUNIT\/cucumber-java-1.2.5.jar:\/Library\/Java\/JUNIT\/cucumber-junit-1.2.5.jar:\/Library\/Java\/JUNIT\/cucumber-core-1.2.5.jar:\/Library\/Java\/JUNIT\/gherkin-2.12.2.jar:\/Library\/Java\/JUNIT\/cucumber-jvm-deps-1.0.5.jar:./g' ~/.bash_profile

# Refresh Bash and zsh Conf
source ~/.bash_profile ~/.zsh_profile

```

## First of all, you need to compile your test class (from src folder)

```sh
# Important, to avoid compile errors
cd src/

### Tests
javac -d ../bin/ test/acceptance/Homepage*.java
```

## Then run your test cases (from bin tests folder)

```sh
cd bin/
java org.junit.runner.JUnitCore test.acceptance.HomepageTest
```

## Enjoy Agile Testing

Thank you.
