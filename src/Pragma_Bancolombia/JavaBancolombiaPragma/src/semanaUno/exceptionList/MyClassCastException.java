package semanaUno.exceptionList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClassCastException {
    void testingArrayList(ArrayList<Object> arrayObjects) {
        int castedValue = 0;

        for(int i = 0; i < arrayObjects.size(); i++) {
            try {
                castedValue = (int) arrayObjects.get(i);

            } catch (ClassCastException e) {
                System.out.printf("Error en índice %d, no se puede castear %s\n", i, arrayObjects.get(i));
                //throw new ClassCastException(String.format("Error en índice %d, no se puede castear %s\n", i, arrayObjects.get(i)));
            }

        }

    }


}
