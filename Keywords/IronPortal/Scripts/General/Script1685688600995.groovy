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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Dashboard/a_Enter IronForms'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/div_Digital Service Forms'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/div_Outstanding Services'))

WebUI.setText(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/input_Outstanding Services_form-control py-_b078f9'), 
    GlobalVariable.work_order)

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/li_DT0053 - CAT 777D - 1000 Hour Service - _d87edd'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/button_Select'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/input_Labour Personnel Name_form-control bo_aa2426'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/li_Tom Woodward'))

if (WebUI.verifyElementClickable(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/input_Preview_agreement',10))) {
	WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/input_Preview_agreement'))
} else {
	WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/button_Submit'))
}
	
WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/div_Online_ring d-flex justify-content-center'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/button_(required)_btn btn-sm btn-icon btn-bg-light'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/button_Take a Photo'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/img'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/svg'))

WebUI.click(findTestObject('Object Repository/New Iron Form/Page_BUMA AUSTRALIA - IronForms/button_Submit'))

WebUI.closeBrowser()

