import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SearchSteps {
	@Given("I navigate to Service NSW homepage")
	def navigateToNSWPage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

		WebUI.maximizeWindow()
	}
	@When("I click Find locations menu")
	def clickButton() {
		WebUI.click(findTestObject('Object Repository/a_Find locations'))
	}
	@And('I enter name location (.*)')
	def clickLogin(String locations) {
		WebUI.click(findTestObject('Object Repository/input_Search by suburb, postcode or current_d530bf'))

		WebUI.setText(findTestObject('Object Repository/input_Search by suburb, postcode or current_d530bf'), locations)
	}

	@And('I click search button')
	def clickSearch() {
		WebUI.click(findTestObject('button_Search by suburb, postcode or current location_button button--primary button--xxlarge'))
	}

	@Then("I should be able to view filtered results (.*)")
	def verifyResult(String serviceNSWlocation)  {
		WebUI.verifyTextPresent(serviceNSWlocation, false)
		
	
	}
}