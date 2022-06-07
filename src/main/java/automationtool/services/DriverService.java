package automationtool.services;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverService {

    // by default, the JVM disables assertion validation by default, hence our own flag

    @Autowired
    WebDriver webDriver;

    public void goToUrl(String url) {
        webDriver.get(url);
    }

    public boolean assertCurrentUrl(String url){
        if(url.equalsIgnoreCase(webDriver.getCurrentUrl())){
            return true;
        }else{
            return false;
        }
    }
}
