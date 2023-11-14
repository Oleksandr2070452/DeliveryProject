package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.codeborne.selenide.Selenide.screenshot;

public class TestListener implements ITestListener {

    Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestFailure(ITestResult testResult) {
        logger.info("---------------------------------------------------------------");
        logger.info("Failed because of - " + testResult.getThrowable());
        logger.info("---------------------------------------------------------------");

        screenshot(testResult.getName());
    }

    @Override
    public void onTestStart(ITestResult testResult) {
        logger.info("---------------------------------------------------------------");
        logger.info(testResult.getMethod().getMethodName() + " Started");
        logger.info("---------------------------------------------------------------");
        logger.info(testResult.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult testResult) {
        logger.info("---------------------------------------------------------------");
        logger.info(testResult.getMethod().getMethodName() + " Passed");
        logger.info("---------------------------------------------------------------");
    }

    @Override
    public void onTestSkipped(ITestResult testResult) {
        logger.info("---------------------------------------------------------------");
        logger.info("Skipped because of - " + testResult.getThrowable());
        logger.info("---------------------------------------------------------------");
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("===============================================================");
        logger.info("     On Start :-" + context.getName() + "                      ");
        logger.info("===============================================================");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("===============================================================");
        logger.info("     On Finish :-" + context.getName() + "                     ");
        logger.info("===============================================================");
    }
}
