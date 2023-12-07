public class MyClass {
    public int myNum;        // atributo (variável int)
    public void myMethod() { // método (função)
      System.out.println("Hello World!");
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      MyClass myObj = new MyClass();  // Cria um objeto MyClass
  
      // Acessa atributos e chama métodos
      myObj.myNum = 15;
      System.out.println(myObj.myNum);
      myObj.myMethod();
    }
  }