package com.ehsunbehravesh.mobilecloudav.ejb;

import com.ehsunbehravesh.mobilecloudav.result.ScanResult;
import com.ehsunbehravesh.mobilecloudav.utils.Utils;
import java.io.File;
import java.io.IOException;
import javax.ejb.EJB;
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
public class DefaultScanBean {

  private static final Logger logger = Logger.getLogger(DefaultScanBean.class);
  
  @EJB
  private ScannerBean scanner;
  
  public ScanResult scanBytes(final Byte[] content) {
    ScanResult result = new ScanResult();
    try {
      File file = Utils.saveIntoTempFile(content);
      result = scanner.scan(file);
    } catch (IOException ex) {
      logger.log(Priority.FATAL, ex.getMessage(), ex);      
    }
    
    return result;
  }  
  
  public ScanResult cleanBytes(final Byte[] content) {
    ScanResult result = new ScanResult();
    try {
      File file = Utils.saveIntoTempFile(content);
      result = scanner.clean(file);
    } catch (IOException ex) {
      logger.log(Priority.FATAL, ex.getMessage(), ex);      
    }
    
    return result;
  }
}

