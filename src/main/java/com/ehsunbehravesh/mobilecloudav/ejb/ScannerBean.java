/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehsunbehravesh.mobilecloudav.ejb;

import com.ehsunbehravesh.mobilecloudav.result.ScanResult;
import com.ehsunbehravesh.mobilecloudav.utils.ScanCLParser;
import com.ehsunbehravesh.mobilecloudav.utils.SystemCommand;
import java.io.File;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/**
 *
 * @author ehsun7b
 */
@Stateless
@LocalBean
public class ScannerBean {

  private static final Logger logger = Logger.getLogger(ScannerBean.class);

  public ScanResult scan(final File file) {
    ScanResult result = new ScanResult();
    String string = SystemCommand.cmdExec("scancl ".concat(file.getAbsolutePath()));
    logger.log(Priority.INFO, "**** scan result: ".concat(string));
    ScanCLParser parser = new ScanCLParser(string);
    Map<String, Object> parsed = parser.parse();
    int infected = (int) parsed.get("infected");
    
    if (infected <= 0) {
      result.setInfected(false);
    } else {
      result.setInfected(true);
    }
    
    return result;
  }

  public ScanResult clean(final File file) {
    ScanResult result = new ScanResult();

    return result;
  }

}
