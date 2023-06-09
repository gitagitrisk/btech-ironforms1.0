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
import java.time.LocalDate as LocalDate
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter

// Get current Jakarta date-time
LocalDateTime now = LocalDateTime.now()

DateTimeFormatter formatter = DateTimeFormatter.ofPattern('yyMMdd')

String formattedDate = now.format(formatter)

// Generate random numbers
Random random = new Random()

int randomNumber1 = random.nextInt(10)

int randomNumber2 = random.nextInt(10)

// Generate incrementing number
// int increment = 1 // Set the initial value
// String incrementString = String.format("%02d", increment)
// Concatenate the strings
String workOrder = (('99' + formattedDate) + randomNumber1) + randomNumber2

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Dashboard/a_Enter IronLake'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/span_Task'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/a_Outstanding Service'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/div_Outstanding Service_btn btn-small btn-i_1463e8'))

WebUI.click(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Unit Number_el-input__inner'))

WebUI.setText(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Unit Number_el-input__inner'), unit_number)

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/li_DT0053  777D Dump Truck CAT'))

WebUI.setText(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_SMU Due (Hours)_el-input__inner'), 
    smu)

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Work Order_el-input__inner'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Work Order_el-input__inner'), 
    GlobalVariable.work_order)

WebUI.click(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Service Size_el-input__inner'))

WebUI.setText(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Service Size_el-input__inner'), 
    service_size)

WebUI.click(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/li_1000 hrs'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Planned Service Date_dateService'))

WebUI.setText(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Planned Service Date_dateService'), 
    planned_service_date)

WebUI.click(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Shift_el-input__inner'))

WebUI.setText(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/input_Shift_el-input__inner'), 
    shift)

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/li_Day'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/button_Submit'))

WebUI.click(findTestObject('Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/button_Submit Popup'))

WebUI.click(findTestObject('Object Repository/Page_BUMA AUSTRALIA - Iron Lake - Task - Ou_df1751/button_Ok'))

