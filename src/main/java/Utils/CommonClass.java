package Utils;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.xml.XmlSuite;

import java.lang.reflect.Method;

public class CommonClass {
//    @BeforeSuite(alwaysRun = true)
//    public void getMethodName(Method method)
//    {
//        System.out.println("The method is running "+method.getName());
//    }
    @BeforeSuite(alwaysRun = true)
    public void performTestSetting(ITestContext iTestContext)
    {
        iTestContext.getCurrentXmlTest().getSuite().setParallel(XmlSuite.ParallelMode.METHODS);
        iTestContext.getCurrentXmlTest().setThreadCount(3);
        iTestContext.getFailedTests();

    }
}
