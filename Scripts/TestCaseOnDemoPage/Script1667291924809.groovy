import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("https://rahulshettyacademy.com/AutomationPractice/")
//Verify if the given web element presents or not. it will wait till ATMOST 20 sec
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Practice Page/legend_Radio Button Example'), 20);

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Practice Page/input_Radio1_radioButton'), 20)
//click on the radio button & chose first option
WebUI.click(findTestObject('Object Repository/Page_Practice Page/input_Radio1_radioButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Practice Page/legend_Suggession Class Example'), 20)

WebUI.setText(findTestObject('Object Repository/Page_Practice Page/input_Suggession Class Example_autocomplete'), "India")

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Practice Page/legend_Checkbox Example'), 20)

WebUI.click(findTestObject('Object Repository/Page_Practice Page/input_Option1_checkBoxOption1'));

WebUI.click(findTestObject('Object Repository/Page_Practice Page/select_Select                     Option1                    Option2                    Option3'))

WebUI.closeBrowser();
