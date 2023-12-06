package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DaftarBaptis {
	WebDriver driver = null;
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 1
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 2
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 3
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 4
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 5
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 6
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 7
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 8
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------------------------------------------	
		//	Variansi 9
		//----------------------------------------------------------------------------------------------------------------------------
		//	Test case 1
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//			Thread.sleep(1000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//	Test case 2
//		@Given("open chrome and user in Home page")
//		public void open_chrome_and_user_in_Home_page() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
	//
//		@When("user click Pendaftaran and click Tardidi")
//		public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////			Thread.sleep(1000);
//		}
	//
//		@Then("user input the form")
//		public void user_input_the_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//			driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//			Thread.sleep(2000);
//		}
	//
//		@Then("user successes to Daftar")
//		public void user_successes_to_Daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 10
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 11
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 12
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}

	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 13
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}

	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 14
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 15
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 16
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 17
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yen Tobing");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 18
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//	Test case 2
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
////		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lordian Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Jef Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("05/07/2002");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(2000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 19
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}

	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 20
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
		
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 21
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 22
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 23
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 24
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 25
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 26
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 27
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 28
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 29
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 30
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 31
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 32
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("Lovinta Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 33
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 34
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 35
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 36
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 37
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 38
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 39
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}	
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 40
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 41
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 42
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 43
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 44
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 45
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 46
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 47
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 48
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("Pekanbaru");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 49
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 50
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 51
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
	@Given("open chrome and user in Home page")
	public void open_chrome_and_user_in_Home_page() {
		System.out.println("Inside Step - browser is open");		   
		   String projecPath = System.getProperty("user.dir");
		   System.out.println("Project path is:"+projecPath);
		   
		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.navigate().to("http://127.0.0.1:8000/");
	}

	@When("user click Pendaftaran and click Tardidi")
	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
		Thread.sleep(1000);
	}

	@Then("user input the form")
	public void user_input_the_form() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
		Thread.sleep(1000);
	}

	@Then("user successes to Daftar")
	public void user_successes_to_Daftar() {
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 52
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 53
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 54
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 55
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 56
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("Hunter Hutagalung");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 57
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 58
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 59
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 60
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 61
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 62
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("29/10/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 63
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("Yani Tobing");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//----------------------------------------------------------------------------------------------------------------------------	
	//	Variansi 64
	//----------------------------------------------------------------------------------------------------------------------------
	//	Test case 1
//	@Given("open chrome and user in Home page")
//	public void open_chrome_and_user_in_Home_page() {
//		System.out.println("Inside Step - browser is open");		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		   driver.navigate().to("http://127.0.0.1:8000/");
//	}
//
//	@When("user click Pendaftaran and click Tardidi")
//	public void user_click_Pendaftaran_and_click_Tardidi() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[1]")).click();
//		Thread.sleep(1000);
//	}
//
//	@Then("user input the form")
//	public void user_input_the_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[1]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("");
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[3]/input")).sendKeys("");
//		Thread.sleep(1000);
//	}
//
//	@Then("user successes to Daftar")
//	public void user_successes_to_Daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
}

