package ExcelTestData;

import org.testng.annotations.DataProvider;

public class HomeTestDataStatus {
	
	private String sTestCaseName;

	private int iTestCaseRow;
	
	@DataProvider (name = "Home_0001")
	public Object[][] Home_0001() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Sheet2");
	 	sTestCaseName = "Home_0001";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Sheet2",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0006")
	public Object[][] Home_0006() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Sheet2");
	 	sTestCaseName = "Home_0006";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Sheet2",iTestCaseRow);

	    	return (testObjArray);

		}

}
