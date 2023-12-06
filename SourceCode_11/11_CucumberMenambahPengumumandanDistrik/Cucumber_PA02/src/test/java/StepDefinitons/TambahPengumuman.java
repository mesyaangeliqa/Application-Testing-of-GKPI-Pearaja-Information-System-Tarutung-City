package StepDefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TambahPengumuman {
	WebDriver driver = null;
	
	//------VARIAN1-------
	//---TRUE---TRUE---TRUE
	
//TEST1	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("besok");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("12/03/2003");
//
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//	   
//	}

	//TEST2	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kematian");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Jl.Laguboti");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/01/2022");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	//TEST3
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Laki Laki umur 29");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("12/10/2030");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	//TEST4
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Putra dan Luana ");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("30/05/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST5
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("anak dari bapak samuel");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("12/12/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	//TEST6
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Digedung serbguna balige");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("03/03/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	//TEST7	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kelahiran ");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Lahir anak laki-laki dari bapak putra");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("20/02/2022");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST8	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kelahiran");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("anak perempuan dari bapak hiskia");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/02/2002");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	//TEST9	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("total yang malua 10");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("04/06/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST10
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Albert dan Yosafat di audit");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("31/05/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST11	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kematian");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Naposo umur 15");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("12/10/2019");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST12
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Hiskia dan Krina dilapangan pniel");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/06/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST13
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("anak dari bapak albert");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("25/12/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}	
	
	//TEST14	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pindah Jemaat");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Pindah dari gereja HKBP Medan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/03/2023");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}

	//TEST15
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Suan dan Gavin");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/02/2022");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	//TEST16
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("total yang malua 8 orang");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("25/12/2021");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	
	//-----VARIAN2-----
	//TRUE---TRUE---FALSE
	
	
	
	//TEST17	
//			@Given("open chrome and start application")
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
//}
//@When("succes login then click Jemaat")
//public void succes_login_then_click_Jemaat() throws InterruptedException {
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//}
//
//@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys(" / /10");
//}
//
//@Then("Success tambah pengumuman")
//public void success_tambah_pengumuman() {
//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	
	

	
	//TEST18	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click();
//		   
//		}
	
	//TEST20	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}

	//TEST21	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kematian");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/2002");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}

	//TEST22	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST23	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("///");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST24	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Diaudit");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}

	//TEST25	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST26	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("anak bapak ");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/1");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST27	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("minggu depan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/10");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	
	//-----VARIAN3-----
	//----TRUE---FALSE----TRUE
	
	
	
	//TEST28	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10/2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST29	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10/2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST30	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kelahiran");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10/2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
//	
	
	//TEST31	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kematian");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10/2022");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
//	
	
	//TEST32	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/12/2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST33	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("12/11/2021");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST34	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/12/2022");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST35	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("20/01/2022");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST36	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("25/12/2020");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST37	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("22/11/2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST38	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kematian");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10/2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST39	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kelahiran");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/10/2002");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST40	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("22/04/2021");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//-----VARIAN4-----
	//----TRUE---FALSE----FALSE
	
	
	//TEST41	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
//	
	
	//TEST42	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Malua");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/ / ");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST43	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / 2022");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST44	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST45 	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("kematian");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST46	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kematian");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/10/ ");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST47	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST48	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Tardidi");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST49	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kelahiran");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/ / ");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}

	//TEST50	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Kelahiran");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST51	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pindah Ruas");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST52	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pindah Ruas");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / 2022");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST53	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("Pernikahan");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/ /2022");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	
	
	
		
	//-----VARIAN5-----
	//----FALSE---TRUE----TRUE
		
		
		
		
		
	//TEST54	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Digedung serba guna");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/10/2010");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}

	
	
	//TEST55
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Anak dari bapak");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/12/2010");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}		
	
	
	//TEST56	
//		@Given("open chrome and start application")
//		public void open_chrome_and_start_application() {
//				   System.out.println("Inside Step - browser is open");
//				   
//				   String projecPath = System.getProperty("user.dir");
//				   System.out.println("Project path is:"+projecPath);
//				   
//				   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//				   
//				   driver = new ChromeDriver();
//				   
//				   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//				   driver.navigate().to("http://127.0.0.1:8000/login");
//		}
//		@When("succes login then click Jemaat")
//		public void succes_login_then_click_Jemaat() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//		}
//
//		@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//		public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Naposo umur 13 tahun");
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/01/2019");
//		}
//
//		@Then("Success tambah pengumuman")
//		public void success_tambah_pengumuman() {
//			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST57	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Lahir anak perempuan ");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("05/10/2003");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST58	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("jumlah 10 orang ");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("25D/12/2019");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST59	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Ama umur 50 tahun");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/05/2015");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST60	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("anak dari bapak pandi");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("28/02/2019");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//		}
	
	//TEST61	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("menikah di gedung serba guna ");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("30/11/2022");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST62	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Naposo umur 19 tahun");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("06/06/2018");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	

	//TEST63	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("telah lahi anak laki-laki");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("02/02/2022");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST64	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("lahir anak lakik-laki");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("20/03/2003");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST65	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("dari GKPI medan area");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("27/07/2020");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	//TEST66	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("menikah diporsea");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("30/11/2028");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
//	
	
	
	//-----VARIAN6-----
	//----FALSE---TRUE----FALSE
	
	
	
	//TEST67	
//			@Given("open chrome and start application")
//			public void open_chrome_and_start_application() {
//					   System.out.println("Inside Step - browser is open");
//					   
//					   String projecPath = System.getProperty("user.dir");
//					   System.out.println("Project path is:"+projecPath);
//					   
//					   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//					   
//					   driver = new ChromeDriver();
//					   
//					   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//					   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//					   driver.navigate().to("http://127.0.0.1:8000/login");
//			}
//			@When("succes login then click Jemaat")
//			public void succes_login_then_click_Jemaat() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//			}
//
//			@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//			public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//				Thread.sleep(500);
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Naposo umur 13 tahun");
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//			}
//
//			@Then("Success tambah pengumuman")
//			public void success_tambah_pengumuman() {
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//			}
	
	
	//TEST68	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Naposo umur 18 tahun");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys(" 01/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST69	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Tri dan Tri ");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST70	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("jumlah 5 orang");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ /2003 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST71	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("telah lahir anak perempuan");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST72	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("digedung serba guna balige");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST73	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("jumlah 13 orang");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys(" /12 / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST74	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("telah lahir anak laki-laki");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ 03/ ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST75	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Ina umur 80 tahun");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST76	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Diaudit");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ /2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST77	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Jumlah 5 orang");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("25/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST78
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("Naposo umur 16 tahun");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/10 / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//-----VARIAN7-----
	//----FALSE---FALSE----TRUE
	
	
	//TEST79	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/01/2001 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}

	
	//TEST80	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/05/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST81	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("30/01/2013 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST82	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("30/11/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST83	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("21/12/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST84	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("30/11/2022 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST85	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("05/10/2003 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST86	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("17/08/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST87	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/06/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST88	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("05/06/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST89	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("20/03/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST90	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("05/10/2023 ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}

	
	//-----VARIA8-----
	//----FALSE---FALSE----FALSE
	
	
	
	//TEST91	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST92	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST93	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("01/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST94	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ 20/ 2003");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST95	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10/ / 2010");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST96	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / 2023");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	
	//TEST97	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST98	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("10");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST99	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("/10/");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
	
	//TEST100	
//	@Given("open chrome and start application")
//	public void open_chrome_and_start_application() {
//			   System.out.println("Inside Step - browser is open");
//			   
//			   String projecPath = System.getProperty("user.dir");
//			   System.out.println("Project path is:"+projecPath);
//			   
//			   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//			   
//			   driver = new ChromeDriver();
//			   
//			   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//			   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//			   driver.navigate().to("http://127.0.0.1:8000/login");
//	}
//	@When("succes login then click Jemaat")
//	public void succes_login_then_click_Jemaat() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[2]/div/input")).sendKeys("user2");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[3]/div/input")).sendKeys("user2");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/div/div/div[4]/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/a/span")).click();
//	}
//
//	@Then("click pengumuman kemudian Tambah pengumuman lalu isi form")
//	public void click_pengumuman_kemudian_Tambah_pengumuman_lalu_isi_form() throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[3]/ul/li[7]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/a")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/textarea")).sendKeys("");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("13/ / ");
//	}
//
//	@Then("Success tambah pengumuman")
//	public void success_tambah_pengumuman() {
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[4]/button")).click(); 
//	}
//	
	
	
	
	
	
	
	
	
	
	




}
