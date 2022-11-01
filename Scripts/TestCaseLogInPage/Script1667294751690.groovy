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

WebUI.openBrowser("https://rahulshettyacademy.com/AutomationPractice/ ")

WebUI.waitForPageLoad(20);

WebUI.click(findTestObject('Object Repository/Page_Practice Page/button_Home'))

WebUI.click(findTestObject('Object Repository/Page_Rahul Shetty Academy/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Rahul Shetty Academy/input_Email_email'), "abc@gmail.com");

WebUI.setText(findTestObject('Object Repository/Page_Rahul Shetty Academy/input_Password_password'), 'ppqr@123')

WebUI.click(findTestObject('Object Repository/Page_Rahul Shetty Academy/input_Forgot Password_commit'))

WebUI.closeBrowser()