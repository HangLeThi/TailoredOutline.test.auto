package Demo.Test.Mobile.steps.serenity;

import Demo.Test.Mobile.pages.TailoredPage02;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Steps
TailoredPage02 tailoredPage02;
	public void open_home_page() {
		tailoredPage02.open();
		
	}

	public void click_on_Ok_button() {
		tailoredPage02.click_on_Ok_button();
		
	}

	public void click_on_headphones() {
		tailoredPage02.click_on_headPhones();
		
	}

	public void select_an_element(String element) {
		tailoredPage02.select_an_option();
		
	}

	public void click_on_ok_button(String button) {
		tailoredPage02.click_on_button();
		
	}
	
}
