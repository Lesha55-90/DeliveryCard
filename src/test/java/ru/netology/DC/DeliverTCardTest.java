package ru.netology.DC;


import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static com.codeborne.selenide.Selenide.$;


public class DeliverTCardTest {


    private WebDriver driver;

    @BeforeAll
    public static void setUpAll() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();


    }

    @AfterEach
    void teardown() {
        driver.quit();

    }

    @Test
    public void shouldTestСardDelivery() {
        Selenide.open("http://localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='name'] input").setValue("Иванов Иван Иванович");
        $("[data-test-id='phone'] input").setValue("+79000000000");
        $("[data-test-id='agreement']").click();

    }

}