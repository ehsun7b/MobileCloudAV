package com.ehsunbehravesh.mobilecloudav.result;

import java.nio.ByteBuffer;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ehsun7b
 */
@XmlRootElement
public class ScanResult {

  private boolean infected;
  private List<MalwareDescription> malwares;
  private ByteBuffer cleanedContent;

  public ScanResult() {
  }

  public ScanResult(boolean infected) {
    this.infected = infected;
  }  
  
  public boolean isInfected() {
    return infected;
  }

  public void setInfected(boolean infected) {
    this.infected = infected;
  }

  public List<MalwareDescription> getMalwares() {
    return malwares;
  }

  public void setMalwares(List<MalwareDescription> malwares) {
    this.malwares = malwares;
  }

  public ByteBuffer getCleanedContent() {
    return cleanedContent;
  }

  public void setCleanedContent(ByteBuffer cleanedContent) {
    this.cleanedContent = cleanedContent;
  }    
}
