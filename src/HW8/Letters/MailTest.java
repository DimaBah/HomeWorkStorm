package HW8.Letters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://e.mail.ru/");
        Thread.sleep(3000);

        WebElement userField = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        userField.sendKeys("bahtesting");
        userField.submit();
        Thread.sleep(3000);

        WebElement passwordField = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        passwordField.sendKeys("fqjaptCnjhv");
        passwordField.submit();
        Thread.sleep(3000);

        WebElement inbox = driver.findElement(By.xpath("//div[@class=\"portal-menu-element__text\"]"));
        if(inbox.isDisplayed()){
            System.out.println("Inbox page is shown.");
        }
        Thread.sleep(3000);

        WebElement newLetter = driver.findElement(By.xpath("//a[@class=\"compose-button compose-button_white compose-button_short js-shortcut\"]"));
        newLetter.click();
        Thread.sleep(3000);

        WebElement adressField = driver.findElement(By.xpath("//input[@class='container--H9L5q size_s--3_M-_']"));
        adressField.sendKeys("bahtesting@mail.ru");
        Thread.sleep(3000);

        WebElement textField = driver.findElement(By.xpath("//div[@role='textbox']"));
        textField.sendKeys("So.... it works?");
        Thread.sleep(3000);

        WebElement sendButton = driver.findElement(By.xpath("//span[@title=\"Отправить\"]"));
        sendButton.click();
        Thread.sleep(5000);

        WebElement letter = driver.findElement(By.xpath("//span[@title='D B <bahtesting@mail.ru>']"));
        if(letter.isDisplayed()){
            System.out.println("Yeah! It works!");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
