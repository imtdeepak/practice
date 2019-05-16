package reflection;import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by deepak on 5/1/19.
 */

public class ReflectionUtil {

    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (int i = 0; i < methods.length; i++) {
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

}

