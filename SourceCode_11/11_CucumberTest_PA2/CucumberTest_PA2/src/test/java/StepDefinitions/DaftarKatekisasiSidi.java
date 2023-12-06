package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DaftarKatekisasiSidi {
	WebDriver driver = null;
//	
//	//----------------------------------------------------------------------------------------
//	//		Variansi 1
//	//----------------------------------------------------------------------------------------
//	
//	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 7
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Balige");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("05/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//----------------------------------------------------------------------------------------
	//		Variansi 2
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 7
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Balige");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("05/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
		//----------------------------------------------------------------------------------------
		//		Variansi 3
		//---------------------------------------------------------------------------------------
		
		//Test Case 1
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//	
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//	
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//Test Case 2
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 3
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
			
		//Test Case 4
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 5
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 6
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 7
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Balige");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
	
	//----------------------------------------------------------------------------------------
	//		Variansi 4
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 7
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("05/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	

	//----------------------------------------------------------------------------------------
	//		Variansi 5
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//	
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//	
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}

	//----------------------------------------------------------------------------------------
	//		Variansi 6
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//			System.out.println("Inside Step - browser is open");		   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
// 			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
////			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/");
//		}
//
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//----------------------------------------------------------------------------------------
	//		Variansi 7
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
////			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//----------------------------------------------------------------------------------------
	//		Varian 8
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//----------------------------------------------------------------------------------------
	//		Variansi 8
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}

		//----------------------------------------------------------------------------------------
		//		Variansi 10
		//---------------------------------------------------------------------------------------
		
		//Test Case 1
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//	
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//	
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
		//Test Case 2
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 3
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
			
		//Test Case 4
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 5
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}
		
		//Test Case 6
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//				System.out.println("Inside Step - browser is open");		   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/");
//			}
	//
//			@When("access the app then click Pendaftaran")
//			public void access_the_app_then_click_Pendaftaran() {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//			}
	//
//			@Then("Klik Malua\\/Sidi kemudian isi form")
//			public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//			}
	//
//			@Then("Success daftar")
//			public void success_daftar() {
//				driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//			}	
		
	//----------------------------------------------------------------------------------------
	//		Variansi 11
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//----------------------------------------------------------------------------------------
	//		Variansi 12
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//----------------------------------------------------------------------------------------
	//		Variansi 13
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//----------------------------------------------------------------------------------------
	//		Variansi 14
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Pekanbaru");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Dumai");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Tarutung");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Silangit");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//	
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("Siatas Barita");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//	
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}	

	//----------------------------------------------------------------------------------------
	//		Variansi 15
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/04/2003");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("31/08/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("26/12/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/07/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("29/05/2004");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("17/03/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("02/01/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
////			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("23/09/2003");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("25/03/2004");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}	

	//----------------------------------------------------------------------------------------
	//		Variansi 16
	//---------------------------------------------------------------------------------------
	
	//Test Case 1
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
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
//	@When("access the app then click Pendaftaran")
//	public void access_the_app_then_click_Pendaftaran() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//	}
//
//	@Then("Klik Malua\\/Sidi kemudian isi form")
//	public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success daftar")
//	public void success_daftar() {
//		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//	}
	
	//Test Case 2
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
		
	//Test Case 4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
////			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}
	
	//Test Case 6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
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
//		@When("access the app then click Pendaftaran")
//		public void access_the_app_then_click_Pendaftaran() {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/a")).click();
//		}
//
//		@Then("Klik Malua\\/Sidi kemudian isi form")
//		public void klik_Malua_Sidi_kemudian_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/div[2]/ul/li[4]/ul/li[2]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
////			driver.findElement(By.xpath("//*[@id=\"country\"]/option[3]")).click();
////			driver.findElement(By.xpath("//*[@id=\"tempatLahir\"]")).sendKeys("");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/div[2]/div[2]/input")).sendKeys("");
//		}
//
//		@Then("Success daftar")
//		public void success_daftar() {
//			driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div/div/form/div/button")).click();
//		}	

}
