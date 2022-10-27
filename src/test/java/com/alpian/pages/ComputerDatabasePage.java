package com.alpian.pages;

import com.alpian.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerDatabasePage {

    public ComputerDatabasePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "add")
    public WebElement addNewComputerButton;

    @FindBy(xpath = "//h1[.='Add a computer']")
    public WebElement addAComputerText;

    @FindBy(id = "name")
    public WebElement computerNameBox;

    @FindBy(name = "introduced")
    public WebElement introducedBox;

    @FindBy(name = "discontinued")
    public WebElement discontinuedBox;

    @FindBy(name = "company")
    public WebElement companyName;

    @FindBy(xpath = "//input[@class='btn primary']")
    public WebElement createThisComputerButton;

    @FindBy(xpath = "//div[@class='alert-message warning']")
    public WebElement alertMessage;

    @FindBy(xpath = "(//span[@class='help-inline'])[1]")
    public WebElement failedToRefineType;

    @FindBy(xpath = "(//span[@class='help-inline'])[2]")
    public WebElement getAlertMessage;

    @FindBy(linkText = "ACE")
    public WebElement firstComputer;

    @FindBy(xpath = "//h1[.='Edit computer']")
    public WebElement editComputerText;

    @FindBy(xpath = "//input[@class='btn primary']")
    public WebElement saveThisComputerButton;

    @FindBy(xpath = "//input[@class='btn danger']")
    public WebElement deleteThisComputerButton;




}
