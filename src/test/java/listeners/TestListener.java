package listeners;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {

    Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestFailure(ITestResult testResult) {
        captureScreenshot(testResult.getName());
        logger.info("---------------------------------------------------------------");
        logger.info("Failed because of - " + testResult.getThrowable());
        logger.info("---------------------------------------------------------------");
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

    @Attachment(value = "Failure screenshot", type = "image/png")
    private byte[] captureScreenshot(String testName) {
        File screenshot = Screenshots.takeScreenShotAsFile();
        try {
            String screenshotName = testName + "_" + System.currentTimeMillis() + ".png";
            String screenshotPath = "allure-results/" + screenshotName;
            Selenide.screenshot(screenshotName);
            return java.nio.file.Files.readAllBytes(screenshot.toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }
}
