/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.us.matrial.util;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author adilramdan
 */
public class SpringUtil {

    private static GenericXmlApplicationContext context;

    public static GenericXmlApplicationContext getContext() {
        if (context == null) {
            context= new GenericXmlApplicationContext();
            context.load("classpath:app-context.xml");
            context.refresh();
        }
        return context;
    }
}
