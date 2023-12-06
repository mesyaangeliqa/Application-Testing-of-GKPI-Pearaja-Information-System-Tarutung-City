*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***


DaftarNaikSidi1
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="loginEmail"]    Dumai
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi2
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="loginEmail"]    Dumai  
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004     
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi3
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="loginEmail"]    Dumai  
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi4
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Dumai   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi5
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="loginEmail"]    Dumai   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi6
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Dumai  
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi7
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Dumai
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004     
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi8
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="loginEmail"]    Dumai  
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi9
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]    
    # Input Text    //*[@id="tempatLahir"]    Dumai
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2004    
    # Input Text    //*[@id="loginEmail"]    29/10/2003  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi10
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="loginEmail"]    Dumai
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Sleep    3 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi11
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]    
    # Input Text    //*[@id="tempatLahir"]    Dumai
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi12
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]      
    # Input Text    //*[@id="tempatLahir"]    Dumai
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi13
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    #Click Element    //*[@id="country"]
    #Click Element    //*[@id="country"]/option[2]    
    Input Text    ///*[@id="tempatLahir"]    Dumai
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    #Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

    
DaftarNaikSidi14
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Dumai
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi15
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Dumai
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi16
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Dumai
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/04/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi17
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi18
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi19
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi20
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi21
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi22
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi23
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
        
DaftarNaikSidi24
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi25
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi26
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi27
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi28
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi29
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi30
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi31
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi32
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Pekanbaru
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    26/12/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3     
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi33
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Tarutung                   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi34
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //*[@id="tempatLahir"]    Tarutung   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    10      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi35
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //*[@id="tempatLahir"]    Tarutung   
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi36
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Tarutung   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi37
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="tempatLahir"]    Tarutung  
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi38
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Tarutung  
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi39
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Tarutung
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004     
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSid40
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Tarutung
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi41
    Open Browser    http://127.0.0.1:8000    chrome
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Tarutung
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //*[@id="loginEmail"]    29/10/2003  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi42
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Tarutung
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi43
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Tarutung
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi44
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Tarutung
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi45
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Tarutung
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi46
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Tarutung
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi47
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Tarutung
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi48
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Tarutung
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi49
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi50
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi51
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi52
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi53
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi54
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi55
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
        
DaftarNaikSidi56
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi57
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi58
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi59
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi60
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi61
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi62
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi63
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi64
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Sipoholon
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    31/11/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi65
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Silangit
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi66
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //*[@id="tempatLahir"]    Silangit   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi67
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //*[@id="tempatLahir"]    Silangit   
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi68
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Silangit   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi69
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]  
    Input Text    //*[@id="tempatLahir"]    Silangit  
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi70
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Silangit  
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi71
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Silangit
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004     
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi72
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Silangit
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi73
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Silangit
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2004    
    # Input Text    //*[@id="loginEmail"]    29/10/2003  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi74
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Silangit
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi75
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]    
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Silangit
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    Sleep    3 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi76
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Silangit
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi77
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Silangit
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi78
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Silangit
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi79
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Silangit
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi80
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[2]   
    # Input Text    //*[@id="tempatLahir"]    Silangit
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    17/14/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004 
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi81
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi82
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi83
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi84
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi85
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    5      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi86
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi87
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
        
DaftarNaikSidi88
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi89
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi90
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi91
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi92
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi93
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi94
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi95
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi96
    Open Browser    http://127.0.0.1:8000    chrome
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    # Click Element    //*[@id="country"]
    # Click Element    //*[@id="country"]/option[3]   
    # Input Text    //*[@id="tempatLahir"]    Siatas Barita
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    31/08/2004    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    2004   
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi97
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]   
    Input Text    //*[@id="tempatLahir"]    Balige                   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    05/07/2002    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    17/04/2004  
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed

DaftarNaikSidi98
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //*[@id="tempatLahir"]    Balige   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004     
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi99
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2]
    Input Text    //*[@id="tempatLahir"]    Balige   
    # Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
DaftarNaikSidi100
    Open Browser    http://127.0.0.1:8000    edge
    Set Selenium Implicit Wait    5
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a
    Click Element    //html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]
    Click Element    //*[@id="country"]
    Click Element    //*[@id="country"]/option[2] 
    # Input Text    //*[@id="tempatLahir"]    Balige   
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input    29/02/2003    
    Input Text    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input    02/01/2004    
    Click Button    //html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button
    Sleep    3      
    Close Browser
    Log    Test Completed
    
