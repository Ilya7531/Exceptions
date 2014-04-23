package javaapplication17;
import java.util.logging.Logger;
public class Main {
 
        private static final Logger log = Logger.getLogger(Main.class.getName());
    
        public static void main(String[] args)  throws Exception {
            
           
    
            BrainfuckEngine bf = new BrainfuckEngine(30000);
       
        bf.interpret(
        "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>."
        );
       log.info("End of program!");
        }
}
 
    

  