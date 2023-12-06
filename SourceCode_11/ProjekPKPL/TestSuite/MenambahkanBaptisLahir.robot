*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
DaftarBaptis1
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed

DaftarBaptis2
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
        Sleep    3
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Jef Hutagalung    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis3
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep   5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis4
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis5
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis6
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis7
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5   
    Close Browser
    Log    Test Completed
    
DaftarBaptis8
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis9
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis10
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis11
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5 
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis12
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5 
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis13
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5 
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
       
DaftarBaptis14
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5 
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis15
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarBaptis16 
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5 
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5    
    Close Browser
    Log    Test Completed
    
DaftarBaptis17
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5    
    Close Browser
    Log    Test Completed
    
DaftarBaptis18
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis19
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5   
    Close Browser
    Log    Test Completed
    
DaftarBaptis20
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis21
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis22
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis23
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis24
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis25
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis26
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis27
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis28
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis29
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis30
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis31
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis32
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis33
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis34
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis35
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis36
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # # # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis37
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis39
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis40
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis41
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis42
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis43
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis44
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5    
    Close Browser
    Log    Test Completed
    
DaftarBaptis45
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis46
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis47
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis48
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis49
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis50
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis51
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarBaptis52
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis53
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis54
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5     
    Close Browser
    Log    Test Completed
    
DaftarBaptis55
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3     
    Close Browser
    Log    Test Completed
    
DaftarBaptis56
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis57
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis58
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis59
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis60
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis61
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis62
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis63
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3     
    Close Browser
    Log    Test Completed
    
DaftarBaptis64
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis65
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis66
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis67
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis68
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis69    
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis70
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis71
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis72
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3    
    Close Browser
    Log    Test Completed
    
DaftarBaptis73
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis74
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis75
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis76
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarBaptis77
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis78
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis79
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis80
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis81
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis82
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis83
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis84
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Hunter Hutagalung
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis85
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis86
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lovinta Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Hunter Hutagalung
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    29/10/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yani Tobing   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarBaptis87
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis88
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]

    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis89
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis90
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis91
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[9]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3     
    Close Browser
    Log    Test Completed

DaftarBaptis92
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis93
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis94
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[9]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis95
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis96
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Jef Hutagalung    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis97
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[9]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis98
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    Input Text    //*[@id="loginName"]    Jef Hutagalung    
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis99
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[9]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarBaptis100
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input    Lordian Hutagalung
    # Input Text    //*[@id="loginEmail"]    Pekanbaru    
    # Input Text    //*[@id="loginName"]    Jef Hutagalung    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[9]
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    05/07/2002    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input    Yen Tobing  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
