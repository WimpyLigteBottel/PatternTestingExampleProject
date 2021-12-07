package com.wimpy.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class ImportantPersonFactory {

  private ImportantPersonFactory() {}

  /*
  Builds the list of directors that is currently with the company

   */

  public static List<String> build() {

    List<String> directorsOfCompany = new ArrayList<>();

    directorsOfCompany.add("billy");
    directorsOfCompany.add("tommy");
    directorsOfCompany.add("Susan");
    directorsOfCompany.add("alexa");
    directorsOfCompany.add("Frank");
    directorsOfCompany.add("Francis");
    directorsOfCompany.add("Francois");

    return directorsOfCompany;
  }


  public static List<String> build2() {

    List<String> directorsOfCompany = new ArrayList<>();

    directorsOfCompany.add("billy");
    directorsOfCompany.add("tommy");
    directorsOfCompany.add("Riaan");
    directorsOfCompany.add("JP");
    return directorsOfCompany;
  }

  /*
  Example of method when some time has passed and only few directors remain.
  I would have the contents in  build method changed to something like below

  public List<String> build() {

      List<String> directorsOfCompany = new ArrayList<>();

      directorsOfCompany.add("billy");
      directorsOfCompany.add("tommy");
      directorsOfCompany.add("Riaan");
      directorsOfCompany.add("JP");
      return directorsOfCompany;
  }
   */

}
