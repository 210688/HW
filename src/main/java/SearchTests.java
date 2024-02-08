import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
	@Test
	void successfulSearchTest() {

		$("[name=q]").setValue("selenide").pressEnter();
		$("[id=search]").shouldHave(text("https://selenide.org")); //
	}
}