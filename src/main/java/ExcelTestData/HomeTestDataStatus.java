package ExcelTestData;



import org.testng.annotations.DataProvider;

public class HomeTestDataStatus {
	
	private String sTestCaseName;

	private int iTestCaseRow;
	
	
	@DataProvider (name = "Home_0001")
	public Object[][] Home_0001() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0001";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider(name = "Home_0002")
	public Object [][] Home_0002() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0002";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);	
	}
	
	@DataProvider(name = "Home_0003")
	public Object [][] Home_0003() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data");
		sTestCaseName = "Home_0003";
		sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object [][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data", iTestCaseRow);
		
		return (testObjArray);
	}
	
	@DataProvider(name = "Home_0004")
	public Object [][] Home_0004() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data");
		sTestCaseName = "Home_0004";
		sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object [][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data", iTestCaseRow);
		
		return (testObjArray);
	}
	
	@DataProvider(name = "Home_0005")
	public Object [][] Home_0005() throws Exception
	{
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data");
		sTestCaseName = "Home_0005";
		sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, 0);
		Object [][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data", iTestCaseRow);
		
		return (testObjArray);
	}
	
	@DataProvider (name = "Home_0006")
	public Object[][] Home_0006() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0006";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0007")
	public Object[][] Home_0007() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0007";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0008")
	public Object[][] Home_0008() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Status Test Data");
	 	sTestCaseName = "Home_0008";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Status Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	
	@DataProvider (name = "Home_0012")
	public Object[][] Home_0012() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0012";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0013")
	public Object[][] Home_0013() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Poll Test Data");
	 	sTestCaseName = "Home_0013";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Poll Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0014")
	public Object[][] Home_0014() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Category Test Data");
	 	sTestCaseName = "Home_0014";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0015")
	public Object[][] Home_0015() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Add Edit Category Test Data");
	 	sTestCaseName = "Home_0014";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Add Edit Category Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Home_0020")
	public Object[][] Home_0020() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Announcement Test Data");
	 	sTestCaseName = "Home_0020";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Announcement Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	@DataProvider (name = "Home_0024")
	public Object[][] Home_0024() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Molly Test Data");
	 	sTestCaseName = "Home_0024";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Molly Test Data",iTestCaseRow);

	    	return (testObjArray);

		}
	
	
	@DataProvider (name = "Home_0025")
	public Object[][] Home_0025() throws Exception{

	 	ExcelUtils.setExcelFile(System.getProperty("user.dir")+"\\excel\\testdata.xlsx","Search Molly Test Data");
	 	sTestCaseName = "Home_0025";
	  	sTestCaseName = ExcelUtils.getTestCaseName(sTestCaseName.toString());
	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	    Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir")+"\\excel\\testdata.xlsx", "Search Molly Test Data",iTestCaseRow);

	    	return (testObjArray);

		}

}
