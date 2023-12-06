*** Settings ***

Library    SeleniumLibrary

*** Test Cases ***

TambahPengumuman1
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pengumuman 1
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    cici menikah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambaPengumuman2
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Lahir
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah lahir amanda manopo
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    14/06/2003
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman3
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Menikah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Akan Menikah Yohana
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    28/04/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman4
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Meninggal
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah meninggal cucu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    27/09/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman5
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ibadah natal
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    ibadah natal diadakan setelah makan siang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    25/12/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman6
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman hilang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah hilang tas gucci saat ibadah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    24/06/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman7
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman pindah jemaat
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah pindah keluarga rosa
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman8
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman jemaat baru
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    jemaat baru berkeluarga
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    11/11/2011
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman9
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman lama
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iya lama
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    18/10/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman10        
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ke2
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iyatau tauu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/01/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman11      
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman baruu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    mesyaa mesyaa
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/03/2002
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman12     
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumumannnnn
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    semua pengumuman
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/01/2004
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman13  
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pelaksanaan Baptis Sidi
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    akan dibaptis 15 orang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/12/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman14
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pengumuman 1
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    cici menikah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
  
TambaPengumuman15
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Lahir
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah lahir amanda manopo
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman16
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Menikah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Akan Menikah Yohana
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman17
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Meninggal
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah meninggal cucu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

   
TambahPengumuman18
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ibadah natal
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    ibadah natal diadakan setelah makan siang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman19
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman hilang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah hilang tas gucci saat ibadah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman20
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman pindah jemaat
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah pindah keluarga rosa
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman21
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman jemaat baru
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    jemaat baru berkeluarga
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman22
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman lama
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iya lama
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman23  
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ke2
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iyatau tauu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman24   
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman baruu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    mesyaa mesyaa
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman25    
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumumannnnn
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    semua pengumuman
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman26 
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumumannnnn
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    semua pengumuman
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    --/--/--
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman27
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pengumuman 1  
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman28
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Lahir
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    14/06/2003
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman29
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Menikah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    28/04/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman30
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Meninggal
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    27/09/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman31
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ibadah natal
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    25/12/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman32
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman hilang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    24/06/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman33
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman pindah jemaat
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman34
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman jemaat baru
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    11/11/2011
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman35
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman lama
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    18/10/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman36       
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ke2
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/01/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman37      
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman baruu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/03/2002
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman38 
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumumannnnn
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/01/2004
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman39  
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pelaksanaan Baptis Sidi
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/12/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   

TambahPengumuman40
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    cici menikah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   

TambaPengumuman41
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah lahir amanda manopo
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    14/06/2003
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman42
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Akan Menikah Yohana
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    28/04/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman43
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah meninggal cucu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    27/09/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman44
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    ibadah natal diadakan setelah makan siang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    25/12/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman45
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah hilang tas gucci saat ibadah
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    24/06/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman46
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah pindah keluarga rosa
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman47
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    jemaat baru berkeluarga
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    11/11/2011
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman48
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iya lama
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    18/10/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman49       
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iyatau tauu
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/01/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman50    
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    mesyaa mesyaa
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/03/2002
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman51    
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    semua pengumuman
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/01/2004
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman52  
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    akan dibaptis 15 orang
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/12/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman53
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    22/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambaPengumuman54
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    14/06/2003
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman54
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    28/04/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman55
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    27/09/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman56
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    25/12/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman57
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    24/06/2023
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman58
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/06/2022
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman59
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    11/11/2011
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman60
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    18/10/2020
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman61        
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    01/01/2001
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman62      
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/03/2002
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman63   
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input    03/01/2004
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman64
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    cici menikah
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman65
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah lahir amanda manopo
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman66
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Akan Menikah Yohana
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
      
TambahPengumuman67
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    3
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    Telah meninggal cucu
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman68
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    ibadah natal diadakan setelah makan siang
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman69
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah hilang tas gucci saat ibadah
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman70
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    telah pindah keluarga rosa
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman71
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    jemaat baru berkeluarga
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman72
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iya lama
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman73    
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    iyatau tauu
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman74      
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    mesyaa mesyaa
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman75
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    semua pengumuman
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman76
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea    akan dibaptis 15 orang
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman77
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    pengumuman 1
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman78
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Lahir
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman79
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Menikah
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
   
TambahPengumuman80
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman Meninggal
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman81
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ibadah natal
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman82
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman hilang
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman83
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman pindah jemaat
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman84
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman jemaat baru
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman85
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman lama
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman86        
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman ke2
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman87      
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumuman baruu
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman88     
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pengumumannnnn
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman89
     Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Input Text    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input    Pelaksanaan Baptis Sidi
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman90
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman91
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman92
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman93
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman94
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed

TambahPengumuman95
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman96
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
  
TambahPengumuman97
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman98
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman99
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
TambahPengumuman100 
    Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username  user2
    Input Password    password    user2
    Click Element    xpath=/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a
    Click Element    xpath=/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a
    Click Element    xpath=/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button
     Sleep    5
   Close Browser
   Log    Test Completed
   
