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

WebUI.openBrowser("https://www.saucedemo.com/v1/index.html")
WebUI.maximizeWindow()

WebUI.setText(findTestObject("Object Repository/Login/username"), "standard_user")
WebUI.setText(findTestObject("Object Repository/Login/password"), "secret_sauce")

WebUI.click(findTestObject("Object Repository/Login/buttonLogin"))

//ADD TO CART
WebUI.click(findTestObject("Object Repository/Home Page/productSauceLabsBackpak"))		//Sauce Labs Backpack
WebUI.click(findTestObject("Object Repository/Home Page/productSauceLabsFleeceJacket"))	//Sauce Labs Fleece Jacket

//Cart
WebUI.click(findTestObject("Object Repository/CART/cartMenu"))

//CHECKOUT
WebUI.click(findTestObject("Object Repository/CART/CHECKOUT"))
WebUI.setText(findTestObject("Object Repository/CART/fieldLastName"), "Doe")
WebUI.setText(findTestObject("Object Repository/CART/fieldZipPostalCode"), "12345")
WebUI.click(findTestObject("Object Repository/CART/btnCONTINUE"))
