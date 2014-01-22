package com.ehsunbehravesh.mobilecloudav.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.lang.ArrayUtils;

/**
 *
 * @author ehsun7b
 */
public class Utils {

  public static final int BUFFER_SIZE = 2048;
  
  public static File saveIntoTempFile(Byte[] content) throws IOException {
    String tempDirectory = System.getProperty("java.io.tmpdir");
    String pathToTempFile = tempDirectory + File.separator + System.nanoTime() + ".cav";
    File result = new File(pathToTempFile);

    try (InputStream inputStream = new ByteArrayInputStream(ArrayUtils.toPrimitive(content))) {
      try (OutputStream outputStream = new FileOutputStream(result)) {
        byte[] buffer = new byte[BUFFER_SIZE];
        int len;
        while ((len = inputStream.read(buffer)) > 0) {
          outputStream.write(buffer, 0, len);
        }
      }
    } 
        
    return result;
  }
  
}
