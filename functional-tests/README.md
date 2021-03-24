## Download Selenium webdriver & Selenium ChromeDriver

```sh
cd /Library/Java/JUNIT/
sudo mkdir selenium
sudo wget http://selenium-release.storage.googleapis.com/3.8/selenium-server-standalone-3.8.1.jar
sudo wget http://selenium-release.storage.googleapis.com/3.8/selenium-java-3.8.1.zip
sudo unzip selenium-java-3.8.1.zip -d selenium
sudo chmod 755 selenium/libs
sudo chmod 755 selenium/libs/*
version=$(/Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome --version | sed 's/Google Chrome //; s/ *$//g')
sudo wget https://chromedriver.storage.googleapis.com/$version/chromedriver_mac64.zip
sudo unzip chromedriver_mac64.zip
sudo rm chromedriver_mac64.zip
sudo mv selenium/client-combined*.jar .
sudo mv selenium/libs/* .
sudo rm -r selenium-java-3.8.1.zip selenium/
sudo chown $USER /Library/Java/JUNIT /Library/Java/JUNIT/*
sudo chmod 755 /Library/Java/JUNIT /Library/Java/JUNIT/*
```

## Selenium configuration for Junit

```sh
# This 2 sed commands replace the old classpath line by this new one in the 2 profile files (zsh_profile and bash_profile):
# export CLASSPATH=/Library/Java/JUNIT/junit-4.12.jar:/Library/Java/JUNIT/hamcrest-all-1.3.jar:/Library/Java/JUNIT/chromedriver:/Library/Java/JUNIT/client-combined-3.8.1.jar:/Library/Java/JUNIT/client-combined-3.8.1-sources.jar:/Library/Java/JUNIT/selenium-server-standalone-3.8.1.jar:.

sed -i'.backup'-e 's/CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:./CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:\/Library\/Java\/JUNIT\/chromedriver:\/Library\/Java\/JUNIT\/client-combined-3.8.1.jar:\/Library\/Java\/JUNIT\/client-combined-3.8.1-sources.jar:\/Library\/Java\/JUNIT\/selenium-server-standalone-3.8.1.jar:./g' ~/.zsh_profile

sed -i'.backup'-e 's/CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:./CLASSPATH=\/Library\/Java\/JUNIT\/junit-4.12.jar:\/Library\/Java\/JUNIT\/hamcrest-all-1.3.jar:\/Library\/Java\/JUNIT\/chromedriver:\/Library\/Java\/JUNIT\/client-combined-3.8.1.jar:\/Library\/Java\/JUNIT\/client-combined-3.8.1-sources.jar:\/Library\/Java\/JUNIT\/selenium-server-standalone-3.8.1.jar:./g' ~/.bash_profile

# Refresh terminal config
source ~/.bash_profile ~/.zsh_profile
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
