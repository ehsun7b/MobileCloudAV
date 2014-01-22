/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ehsunbehravesh.mobilecloudav.ejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ehsun7b
 */
@Stateless
@LocalBean
public class HelloBean {

  public String say() {
    return "Hi, Welcome honey!";
  }

    // Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Business Method")
  
}
