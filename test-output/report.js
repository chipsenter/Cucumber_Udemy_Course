$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "The Login Page",
  "description": "As a returning customer\nI want to login to the application \nSo that I can view my account balance",
  "id": "the-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@fullrun_test"
    }
  ]
});
formatter.before({
  "duration": 1817179947,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_is_on_the_login_page()"
});
formatter.result({
  "duration": 905938444,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "after a failed attempt, the user should be able to login again",
  "description": "",
  "id": "the-login-page;after-a-failed-attempt,-the-user-should-be-able-to-login-again",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@datatable_test"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user enters set of username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 42
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 43
    },
    {
      "cells": [
        "admin2@yourstore.com",
        "admin2"
      ],
      "line": 44
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "the user should be able to see dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_set_of_username_and_password(DataTable)"
});
formatter.result({
  "duration": 3658805852,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#Email\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027Johans-MacBook-Pro-2.local\u0027, ip: \u0027fe80:0:0:0:10c0:f115:3715:7f30%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/_2/r2cp9s1564s...}, goog:chromeOptions: {debuggerAddress: localhost:65193}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: dca35a7ce01b9d5ee83a670672260b77\n*** Element info: {Using\u003did, value\u003dEmail}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefinitions.LoginSteps.user_enters_set_of_username_and_password(LoginSteps.java:149)\n\tat ✽.When user enters set of username and password(login.feature:41)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_able_to_see_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 108234086,
  "status": "passed"
});
});