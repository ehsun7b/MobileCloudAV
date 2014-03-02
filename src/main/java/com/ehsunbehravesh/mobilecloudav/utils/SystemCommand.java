package com.ehsunbehravesh.mobilecloudav.utils;

import com.ehsunbehravesh.mobilecloudav.ejb.DefaultScanBean;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/**
 *
 * @author ehsun7b
 */
public class SystemCommand {

  private static final Logger logger = Logger.getLogger(SystemCommand.class);

  public static String cmdExec(String cmdLine) {
    String line;
    String output = "";
    try {
      Process p = Runtime.getRuntime().exec(cmdLine);
      BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
      while ((line = input.readLine()) != null) {
        output += (line + '\n');
      }
      input.close();
    } catch (IOException ex) {
      logger.log(Priority.FATAL, ex.getMessage(), ex);
    }
    return output;
  }
}
