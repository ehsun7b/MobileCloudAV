/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ehsunbehravesh.mobilecloudav.ejb;

import com.ehsunbehravesh.mobilecloudav.result.ScanResult;
import java.io.File;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ehsun7b
 */
@Stateless
@LocalBean
public class ScannerBean {

  public ScanResult scan(final File file) {
    ScanResult result = new ScanResult();
    
    return result;
  }

  public ScanResult clean(final File file) {
    ScanResult result = new ScanResult();
    
    return result;
  }
  
}
