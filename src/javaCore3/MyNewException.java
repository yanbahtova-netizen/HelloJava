package javaCore3;

public class MyNewException extends Exception {

}
class Test1 {
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }
}