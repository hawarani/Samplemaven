package CrossbrowserExecution;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class ToLaunchApp_01 {
		@Parameters("browsername")
	@Test
	public void launch_app(@Optional("Chrome")String browsername) {
		WebDriver driver = null;
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("invalid browsername");
		}
		
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		driver.quit();
	}
	}



