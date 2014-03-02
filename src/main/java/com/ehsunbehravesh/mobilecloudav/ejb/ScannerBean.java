/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehsunbehravesh.mobilecloudav.ejb;

import com.ehsunbehravesh.mobilecloudav.result.ScanResult;
import com.ehsunbehravesh.mobilecloudav.utils.SystemCommand;
import java.io.File;
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
    return result;
  }

  public ScanResult clean(final File file) {
    ScanResult result = new ScanResult();

    return result;
  }

}
