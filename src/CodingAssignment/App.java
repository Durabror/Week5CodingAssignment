package CodingAssignment;

public class App {
  
  static Logger logger;

  public static void main(String[] args) {
    
    setLogger(new AsteriskLogger());
    
    logger.log("banana");
    logger.error("banana");
    
    setLogger(new SpacedLogger());
    
    logger.log("chicken");
    logger.error("chicken");
    
  }
  
  private static void setLogger(Logger l) {
    logger = l;
  }

}
