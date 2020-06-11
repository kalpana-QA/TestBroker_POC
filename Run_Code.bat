@ECHO OFF 
:: This batch generate allure report of test execution.
TITLE KoneKT POC Test Execution Report

ECHO ============================
call mvn clean package -DiskipTests=true
ECHO ============================
call allure serve allure-results
ECHO ============================
ECHO Report Generated on Local IP
PAUSE