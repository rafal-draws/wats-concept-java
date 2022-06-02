package automationtool;


import automationtool.services.ScenarioService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

@SpringBootApplication
public class AutomationToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationToolApplication.class, args);
	}

//	@Bean
//	public WebDriver chromeWebDriver(){
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//
//		options.addArguments("--start-maximized");
//		options.addArguments("--headless");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--ignore-certificate-errors");
//
////		additional chrome prefs
//		HashMap<String, String> chromePrefs = new HashMap<String, String>();
//		chromePrefs.put("profile.default_content_settings.popups", "false");
//
//		options.setExperimentalOption("prefs", chromePrefs);
//
//		return new ChromeDriver(options);
//
//	}
}
