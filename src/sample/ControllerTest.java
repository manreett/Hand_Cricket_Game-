package sample; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ControllerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: computerPlay() 
* 
*/ 
@Test
public void testComputerPlay() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: choice(ActionEvent event) 
* 
*/ 
@Test
public void testChoice() throws Exception { 
//TODO: Test goes here... 

try { 
   Method method = Controller.getClass().getMethod("choice", ActionEvent.class); 
   method.setAccessible(true); 
   method.invoke(method, null<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 

} 

/** 
* 
* Method: playBall(ActionEvent event) 
* 
*/ 
@Test
public void testPlayBall() throws Exception { 
 
 
try {


   Method method = Controller.getClass().getMethod("playBall", ActionEvent.class);
   method.setAccessible(true); 
   method.invoke(method,<Object>, <parameters>);
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) {
} 

} 

/** 
* 
* Method: exit() 
* 
*/ 
@Test
public void testExit() throws Exception { 
 
try { 
   Method method = Controller.getClass().getMethod("exit"); 
   method.setAccessible(true); 
   method.invoke(method ,<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
 
} 

} 
