import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.security.Key as Key
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

Windows.click(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Added_Device'))

Windows.rightClick(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Added_Device'))

Windows.click(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Device_Option_Edit'))

Windows.doubleClick(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Edit_Device_Name'))

Windows.clearText(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Edit_Device_Name'))

Windows.setText(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Edit_Device_Name'), 
    'Custom Phone Updated')

Windows.click(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Button_Confirm_Edit'))

Windows.rightClick(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Added_Device'))

Windows.click(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Device_Option_Delete'))

Windows.click(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Button_Confirm_Delete'))

Windows.waitForElementNotPresent(findWindowsObject('Object Repository/Geny_Objects_Record_Script/Geny_Edit_Delete_Decive/Added_Device'), 
    30)