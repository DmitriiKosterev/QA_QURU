import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        try {
            open("https://www.google.com/");
            $("[name=q]").setValue("selenide").pressEnter();
            $("[id=search]").shouldHave(text("https://selenide.org"));
        } catch (Exception e) {
            System.out.println("Опять произошла ошибка: " + e.getMessage());
        }
    }
}