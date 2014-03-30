package com.ehsunbehravesh.mobilecloudav.utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ehsun.behravesh
 */
public class ScanCLParser {

  private String input;

  public ScanCLParser(String input) {
    this.input = input;
  }

  public Map<String, Object> parse() {
    Map<String, Object> result = new HashMap<>();
    
    input = input.substring(input.indexOf("Statistics"));
    input = input.substring(input.indexOf(":"));
    
    String temp = input.substring(input.indexOf("Infected"));    
    String strInfecteds = temp.substring(temp.indexOf(":") + 1, temp.indexOf("\n"));
    int infected = Integer.parseInt(strInfecteds.trim());
    
    temp = input.substring(input.indexOf("Warnings"));    
    String strWarnings = temp.substring(temp.indexOf(":") + 1, temp.indexOf("\n"));
    int warnings = Integer.parseInt(strWarnings.trim());
    
    temp = input.substring(input.indexOf("Suspicious"));    
    String strSuspicious = temp.substring(temp.indexOf(":") + 1, temp.indexOf("\n"));
    int suspicious = Integer.parseInt(strSuspicious.trim());
    
    /*
    System.out.println(infected);
    System.out.println(warnings);
    System.out.println(suspicious);
    */
    
    result.put("infected", infected);
    result.put("warnings", warnings);
    result.put("suspicious", suspicious);
    
    return result;
  }
}
