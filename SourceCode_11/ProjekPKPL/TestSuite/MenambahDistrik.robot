*** Settings ***

Library    SeleniumLibrary

*** Test Cases ***

TambahDistrik1
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    tarutung
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    aek uliii
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
   Close Browser
   Log    Test Completed
   
TambahDistrik2
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Binsar aek   
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Mual 
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
   Close Browser
   Log    Test Completed
   

TambahDistrik3
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Sisingamangara
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    tatea
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik4
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Hasanudin
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    bawah riak
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed

TambahDistrik5
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Majalengka
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    tuarani
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik6
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Siborongborong
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Silangit
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik7
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pahae
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Sibolangit
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik8
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Sipultak
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Taput
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik9
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Tinambunan
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Doloksanggul
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik10
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Arjuna
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Tapian
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik11
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pangkitir
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    roaming
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik12
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    bola toon
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    sitakka
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik13
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    parsoburan
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    tuharangan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik14
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    galpak
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    porsea
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik15
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    narumondang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    samosir
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik16
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simarsik
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    sopos
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik17
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    tuannagani
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    tobasa
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik18
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simangkuk
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    sipirok
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      

TambahDistrik19
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simaropmu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    lobusiregar
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik20
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pandan
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    sibolga
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik21
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    banten
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    jabar
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik22
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    timika
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    papua
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik23
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input       palangkaraya
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    sulsel
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik24
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input      pancing
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    medan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik25
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input      sukabumi
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    jatim
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      

TambahDistrik26
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    tarutung
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
      Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik27
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Binsar aek   
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
	 Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik28
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Sisingamangara
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik29
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Hasanudin
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik30
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Majalengka
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik31
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Siborongborong
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik32
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pahae
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
   
TambahDistrik33
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Sipultak
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed

TambahDistrik34
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Tinambunan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik35
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Arjuna
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik36
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pangkitir
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed

TambahDistrik37
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    bola toon
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed   
  
TambahDistrik38
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    parsoburan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
  
TambahDistrik39
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    galpak
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistrik40
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    narumondang
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik41
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simarsik
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik42
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    tuannagani
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik43
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simangkuk
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik44
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simaropmu
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik45
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pandan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik46
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    banten
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
 
TambahDistrik47
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    timika
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik48
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input       palangkaraya
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik49
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input      pancing
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik50
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input      sukabumi
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik51
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    aek uliii
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
    Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik52
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input    Mual 
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
    Sleep    5
   Close Browser
   Log    Test Completed
   
  

TambahDistrik53
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Sisingamangara
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik54
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Hasanudin
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed

TambahDistrik55
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Majalengka
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
 
TambahDistrik56
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Siborongborong
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
     
TambahDistrik57
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pahae
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
 
TambahDistrik58
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Sipultak
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
 TambahDistrik59
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Tinambunan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik60
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Arjuna
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik61
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pangkitir
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik62
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    bola toon
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik63
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    parsoburan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik64
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    galpak
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik65
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    narumondang
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik66
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simarsik
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik67
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    tuannagani
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
  

TambahDistrik68
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simangkuk
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik69
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    simaropmu
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
 TambahDistrik70
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pandan
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik71
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    banten
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed

TambahDistrik72
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    timika
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik73
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input       palangkaraya
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik74
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input      pancing
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik75
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input      sukabumi
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
      
TambahDistrik76
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
    Sleep    5
   Close Browser
   Log    Test Completed
   

TambahDistrik77
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
    Sleep    5
   Close Browser
   Log    Test Completed

TambahDistrik78
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik79
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik80
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik81
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik82
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik83
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
   
TambahDistrik84
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik85
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik86     
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik87    
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik88  
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistrik89  
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
   
TambahDistriK90  
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistriK91 
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
   
TambahDistriK92 
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed
 
TambahDistriK93
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK94
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK95
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK96
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK97
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK98
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK99
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
TambahDistriK100
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button
  Sleep    5
   Close Browser
   Log    Test Completed  
   
