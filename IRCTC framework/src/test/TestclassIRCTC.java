package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Irctc;

public class TestclassIRCTC extends BaseTest
{
  @Test
  public void save() throws IOException, InterruptedException
  {
	Irctc g=new Irctc(driver);
	g.enterdetails();
  }
}
