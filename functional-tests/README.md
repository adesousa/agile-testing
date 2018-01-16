## Download Selenium webdriver & Selenium ChromeDriver

```sh
cd /Library/Java/JUNIT/
sudo mkdir selenium
sudo wget http://selenium-release.storage.googleapis.com/3.8/selenium-server-standalone-3.8.1.jar
sudo wget http://selenium-release.storage.googleapis.com/3.8/selenium-java-3.8.1.zip
sudo unzip selenium-java-3.8.1.zip -d selenium
sudo chmod 755 selenium/libs selenium/libs/*
sudo wget https://chromedriver.storage.googleapis.com/2.34/chromedriver_mac64.zip
sudo unzip chromedriver_mac64.zip
sudo rm chromedriver_mac64.zip
mv selenium/client-combined*.jar .
mv selenium/libs/* .
sudo rm -r selenium-java-3.8.1.zip selenium/
sudo chown $USER /Library/Java/JUNIT /Library/Java/JUNIT/*
sudo chmod 755 /Library/Java/JUNIT /Library/Java/JUNIT/*
```

## Selenium configuration for Junit

```sh
vim ~/.bash_profile

# DELETE this line at the end of file
export CLASSPATH=/Library/Java/JUNIT/junit-4.12.jar:/Library/Java/JUNIT/hamcrest-all-1.3.jar:.

# Instead old line, put this line at the end of file
export CLASSPATH=/Library/Java/JUNIT/junit-4.12.jar:/Library/Java/JUNIT/hamcrest-all-1.3.jar:/Library/Java/JUNIT/chromedriver:/Library/Java/JUNIT/client-combined-3.8.1.jar:/Library/Java/JUNIT/client-combined-3.8.1-sources.jar:/Library/Java/JUNIT/selenium-server-standalone-3.8.1.jar:.

# Save file and exit VIM by doing: esc : wq!
# Refresh terminal config
source ~/.bash_profile
```

## First of all, you need to compile your test class (from src folder)

```sh
# Important, to avoid compile errors
cd src/

### Classes
javac -d ../bin/ test/functional/FunctionalTest.java
```

## Then run your test cases (from bin tests folder)

```sh
cd bin/
java org.junit.runner.JUnitCore test.functional.FunctionalTest
```

## Enjoy Agile Testing

Thank you.
