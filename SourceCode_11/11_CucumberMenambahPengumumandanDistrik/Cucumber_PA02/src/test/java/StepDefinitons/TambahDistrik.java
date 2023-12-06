package StepDefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TambahDistrik {
	WebDriver driver = null;
	
	
//		----VARAIN 1-----
//		--TRUE--TRUE 
	
//	TEST1
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		   System.out.println("Inside Step - browser is open");
		   
		   String projecPath = System.getProperty("user.dir");
		   System.out.println("Project path is:"+projecPath);
		   
		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.navigate().to("http://127.0.0.1:8000/login");
	}

	@When("succes login then click Jemaat")
	public void succes_login_then_click_Jemaat() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
	}

	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Maduma");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Pasar Baru");
	}

	@Then("Success tambah distrik")
	public void success_tambah_distrik() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
	}
	
//	TEST2
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Las Roha");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Sisingamangaraja");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST3
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Nazaret");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("jalan.PI");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST4
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Mamre");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Laguboti");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST5
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Lintong");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Doloksanggul");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST6
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Dos Roha");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Pasaribu");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST8
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 1");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Doloksait");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST8
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 2");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutajulu");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST9
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 3");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutpaung");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST10
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 4");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Hutauruk");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST11
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Las Roha");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Langkat");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST12
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 5");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Binjai kota");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST13
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Kasih");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Pasar Lama");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST14
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Roha");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Merdeka");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}

//	TEST15
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Dos");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Merdeka Raya");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST16
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Hita");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Sisingamangaraja Ujung");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST17
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sekor 6");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Kelurahan Limtong");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST18
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 7");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.IT DEL");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST19
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 8");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Balige");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST20
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 10");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Patuan Nagari");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST21
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 12");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Gereja");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST22
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Hauma Bange");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Lumban Dolok");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST23
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Sopo");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Pastor");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST24
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor 14");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Pembangunan");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST25
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Sektor Horas");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Jl.Parluasan");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
	
	
//	----VARAIN 2-----
//	--FALSE--FALSE 
	
//	TEST26
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST27
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
	
	
//	TEST28
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST29
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST30
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST31
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST32
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST33
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST34
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST35
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST36
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST37
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST38
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST39
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST40
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST41
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST42
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST43
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST44
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST45
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST46
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST47
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST48
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
//	TEST49
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	
//	TEST50
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//		   System.out.println("Inside Step - browser is open");
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
//		   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click Data Distrik kemudian Tambah distrik lalu isi from")
//	public void click_Data_Distrik_kemudian_Tambah_distrik_lalu_isi_from() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah distrik")
//	public void success_tambah_distrik() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
//	}
	
	

}
