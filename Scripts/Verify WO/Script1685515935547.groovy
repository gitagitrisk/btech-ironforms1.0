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

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Dashboard/a_Enter IronLake'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake/span_Task'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake/a_Outstanding Service'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/div_Outstanding Service_btn btn-small btn-i_1463e8'))

WebUI.click(findTestObject('Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Work Order_el-input__inner'))

WebUI.setText(findTestObject('Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Work Order_el-input__inner'), 
    GlobalVariable.work_order)

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/li_9999777020'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/button_Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake/Verify WO/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/div_9999777020'), 
    GlobalVariable.work_order)

