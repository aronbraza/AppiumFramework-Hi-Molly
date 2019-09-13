package ExcelTestData;

import org.testng.annotations.DataProvider;

public class ProfileTestData {
	
	private String sTestCaseName;

	private int iTestCaseRow;
	
	@DataProvider (name = "Profile_0029")
	public Object[][] Profile_0029() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Personal Information Test Data");
	 	sTestCaseName = "Profile_0029";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Personal Information Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0030")
	public Object[][] Profile_0030() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Contact Information Test Data");
	 	sTestCaseName = "Profile_0030";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Contact Information Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Profile_0031")
	public Object[][] Profile_0031() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Educational Attainment TestData");
	 	sTestCaseName = "Profile_0031";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Educational Attainment TestData",iTestCaseRow);

	    	return (testObjArray);

		}

}
