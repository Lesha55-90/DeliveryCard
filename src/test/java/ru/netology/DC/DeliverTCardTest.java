package ru.netology.DC;


import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Selenide.$;


public class DeliverTCardTest {



    @Test
    public void shouldTestСardDelivery() {
        Selenide.open("http://localhost:9999/");
        $("[data-test-id='city'] input").setValue("Омск");
        $("[data-test-id='name'] input").setValue("Иванов Иван Иванович");
        $("[data-test-id='phone'] input").setValue("+79000000000");
        $("[data-test-id='agreement']").click();

    }

}