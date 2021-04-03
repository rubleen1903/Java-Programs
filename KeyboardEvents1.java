import java.applet.Applet; 
 import java.awt.*; 
 import java.awt.event.*; 
 /* <APPLET CODE ="KeyboardEvents1" WIDTH=300 HEIGHT=200> </APPLET> */ 
 public class KeyboardEvents1 extends Applet implements KeyListener 
   { 
       TextArea tpress,trel; 
       TextField t; 
       public void init() 
         { 
            t=new TextField(20); 
            t.addKeyListener(this); 
            tpress=new TextArea(3,70); 
            tpress.setEditable(false); 
            trel=new TextArea(3,70); 
            trel.setEditable(false); 
            add(t); 
            add(tpress); 
            add(trel); 
         } 
            public void keyTyped(KeyEvent e) 
              { 
                 disppress(e,"Key Typed:"); 
              } 
                 public void keyPressed(KeyEvent e) 
                   { 
                     disppress(e,"KeyPressed:"); 
                   } 
                      public void keyReleased(KeyEvent e) 
                      { 
                         String charString,keyCodeString,modString; 
                         char c=e.getKeyChar(); 
                         int keyCode=e.getKeyCode(); 
                         int modifiers=e.getModifiers(); 
                         charString="Key character='"+c+"'"; 
                         keyCodeString="key code="+keyCode+"("+KeyEvent.getKeyText(keyCode)+")"; 
                         modString="modifiers="+modifiers; 
                         trel.setText("Key released"+charString+keyCodeString+modString); 
                      } 
                         protected void disppress(KeyEvent e,String s) 
                            { 
                               String charString,keyCodeString,modString,tmpString; 
                               char c=e.getKeyChar(); 
                               int keyCode=e.getKeyCode(); 
                               int modifiers=e.getModifiers(); 
                               if(Character.isISOControl(c)) 
                                 { 
                                    charString="key character=(an unprintable control character)"; 
                                 } 
                                    else 
                                     { 
                                       charString="key character='"+c+"'"; 
                                     } 
                                       modString="modifiers="+modifiers; 
                                       tmpString=KeyEvent.getKeyModifiersText(modifiers);                                                                        
                                                                 if(tmpString.length()>0) 
                                            { 
                                               modString+="("+tmpString+")"; 
                                            } 
                                               else 
                                                 { 
                                                    modString+="(no modifiers)"; 
                                                 }  
                                                    keyCodeString="key code="+keyCode+"("+KeyEvent.getKeyText(keyCode)+")"; 
                                                                                    tpress.setText(s+charString+keyCodeString+modString); 
                         } 
   }                

