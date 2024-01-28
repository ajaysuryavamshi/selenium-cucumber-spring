package com.automation.spring.selenium.bdd.util;

import com.automation.spring.selenium.bdd.annotation.LazyComponent;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@LazyComponent
public class ScreenshotUtil {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${screenshot.path}/image.png")
    private Path path;

    public void takeScreenshot() throws IOException {
        File srcFile = applicationContext.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(srcFile, this.path.toFile());
    }

}
