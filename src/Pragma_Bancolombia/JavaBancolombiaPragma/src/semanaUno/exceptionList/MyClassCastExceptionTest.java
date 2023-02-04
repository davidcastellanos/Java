package semanaUno.exceptionList;

import java.util.ArrayList;

public class MyClassCastExceptionTest {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        MyClassCastException myClassCastException = new MyClassCastException();
        myClassCastException.testingArrayList(myList);
    }
}
