package SETest.Dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DummyTests {
    static WebDriver driver;
    static Properties prop = new Properties();
    static String FilePath="C:\\Users\\Gopi\\eclipse-workspace\\SETest\\src\\main\\java\\SETest\\Config\\config.properties";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gopi\\eclipse-workspace\\SETest\\src\\Drivers\\geckodriver-v0.20.0-win64\\geckodriver.exe");
         driver = new FirefoxDriver();
        // File fp = new File(FilePath);
         FileInputStream ip = new FileInputStream(FilePath);
         prop.load(ip);
         prop.setProperty("uname", "test");
         driver.get(prop.getProperty("url"));
         
	}

}
