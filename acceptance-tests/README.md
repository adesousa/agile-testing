## Download Cucumber

```sh
cd /Library/Java/JUNIT
sudo wget http://repo1.maven.org/maven2/info/cukes/cucumber-java/1.2.5/cucumber-java-1.2.5.jar
sudo wget http://repo1.maven.org/maven2/info/cukes/cucumber-junit/1.2.5/cucumber-junit-1.2.5.jar
sudo wget http://repo1.maven.org/maven2/info/cukes/cucumber-core/1.2.5/cucumber-core-1.2.5.jar
sudo wget http://repo1.maven.org/maven2/info/cukes/gherkin/2.12.2/gherkin-2.12.2.jar
sudo wget http://repo1.maven.org/maven2/info/cukes/cucumber-jvm-deps/1.0.5/cucumber-jvm-deps-1.0.5.jar
sudo chown $USER:$USER /Library/Java/JUNIT/*
sudo chmod 755 /Library/Java/JUNIT/*
```

## Selenium configuration for Junit

```sh
vim ~/.bash_profile

# delete this line at the end of file
export CLASSPATH=/Library/Java/JUNIT/junit-4.12.jar:/Library/Java/JUNIT/hamcrest-all-1.3.jar:/Library/Java/JUNIT/chromedriver:/Library/Java/JUNIT/client-combined-3.8.1.jar:/Library/Java/JUNIT/client-combined-3.8.1-sources.jar:/Library/Java/JUNIT/selenium-server-standalone-3.8.1.jar:.

# Put this line at the end of file
export CLASSPATH=/Library/Java/JUNIT/junit-4.12.jar:/Library/Java/JUNIT/hamcrest-all-1.3.jar:/Library/Java/JUNIT/chromedriver:/Library/Java/JUNIT/client-combined-3.8.1.jar:/Library/Java/JUNIT/client-combined-3.8.1-sources.jar:/Library/Java/JUNIT/selenium-server-standalone-3.8.1.jar:/Library/Java/JUNIT/cucumber-java-1.2.5.jar:/Library/Java/JUNIT/cucumber-junit-1.2.5.jar:/Library/Java/JUNIT/cucumber-core-1.2.5.jar:/Library/Java/JUNIT/gherkin-2.12.2.jar:/Library/Java/JUNIT/cucumber-jvm-deps-1.0.5.jar:.

# Save and Quit VIM

# Refresh Bash Conf
source ~/.bash_profile
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
