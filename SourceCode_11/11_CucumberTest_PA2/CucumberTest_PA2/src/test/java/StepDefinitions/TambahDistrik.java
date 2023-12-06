//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class TambahDistrik {
//	WebDriver driver = null;

//----------------------------------------------------------------------------------------------------------------------------	
//	Variansi 3 
//----------------------------------------------------------------------------------------------------------------------------
//	Test case 51
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 52
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 3");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	

//	Test case 53
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 4");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	

//Test case 54
//@Given("open chrome and admin in login page")
//public void open_chrome_and_admin_in_login_page() {
//	System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	   
//	   driver.navigate().to("http://127.0.0.1:8000/login/");
//}
//
//@When("admin inputs email and password and clicks sign in button")
//public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//    Thread.sleep(1000);
//    
//}
//
//@Then("admin clicks Jemaat and clicks Data Distrik")
//public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//}
//
//@Then("admin clicks Tambah Distrik and inputs the form")
//public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 5");
//    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//}
//
//@Then("admin successes to tambah distrik")
//public void admin_successes_to_tambah_distrik() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//}	
//
	
//	Test case 55
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 6");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 56
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 7");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 57
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 8");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 58
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 9");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 59
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 10");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 60
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 11");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 61
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 12");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 62
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 13");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 63
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 14");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 64
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 15");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 65
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 16");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 66
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 17");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 67
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 18");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 68
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 19");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 69
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 20");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 70
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 21");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 71
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 22");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 72
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 23");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 73
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 24");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 74
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 25");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 75
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 26");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 4 
	//----------------------------------------------------------------------------------------------------------------------------
//	Test case 76
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Komplek Mesjid");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 77
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Komplek Stadion");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	

//	Test case 78
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Pasar Tarutung");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	

//Test case 79
//@Given("open chrome and admin in login page")
//public void open_chrome_and_admin_in_login_page() {
//	System.out.println("Inside Step - browser is open");
//	   
//	   String projecPath = System.getProperty("user.dir");
//	   System.out.println("Project path is:"+projecPath);
//	   
//	   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//	   
//	   driver = new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	   
//	   driver.navigate().to("http://127.0.0.1:8000/login/");
//}
//
//@When("admin inputs email and password and clicks sign in button")
//public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//    Thread.sleep(1000);
//    
//}
//
//@Then("admin clicks Jemaat and clicks Data Distrik")
//public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//}
//
//@Then("admin clicks Tambah Distrik and inputs the form")
//public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutapea");
//}
//
//@Then("admin successes to tambah distrik")
//public void admin_successes_to_tambah_distrik() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//}	
//
	
//	Test case 80
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Parsalakan");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 81
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Pansurnapitu");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 82
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Sipoholon");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 83
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutaraja Ugan");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 84
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutabaginda");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 85
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("D.I. Panjaitan Tarutung");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 86
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Siualuompu");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 87
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Tangsi Tarutung");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	Test case 88
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Sisingamangaraja Tarutung");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}	
	
//	Test case 89
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutabarat Parbaju");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 90
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutabarat Parbaju Julu");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 91
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutabarat Partalian");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 92
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Siatas Barita");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 93
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Simorangkir");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 94
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Panggabean");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 95
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Partungkoan");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 96
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Lapo Gambiri");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 97
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Parbubu Julu");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 98
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Parbubu Pea");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 99
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Parbubu Julu");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	//Test case 100
//	@Given("open chrome and admin in login page")
//	public void open_chrome_and_admin_in_login_page() {
//		System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   
//		   driver.navigate().to("http://127.0.0.1:8000/login/");
//	}
//
//	@When("admin inputs email and password and clicks sign in button")
//	public void admin_inputs_email_and_password_and_clicks_sign_in_button() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	    Thread.sleep(1000);
//	    
//	}
//
//	@Then("admin clicks Jemaat and clicks Data Distrik")
//	public void admin_clicks_Jemaat_and_clicks_Data_Distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//	}
//
//	@Then("admin clicks Tambah Distrik and inputs the form")
//	public void admin_clicks_Tambah_Distrik_and_inputs_the_form() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Saitnihuta");
//	}
//
//	@Then("admin successes to tambah distrik")
//	public void admin_successes_to_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
//}	
