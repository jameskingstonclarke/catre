import manage.Instantiate;
import manage.Manage;

import java.lang.reflect.Field;

public class Main {


    @Manage
    public static class Person{
        String name;

        public String getName() {
            return name;
        }
    }

    @Instantiate
    private Person person;


    public static void main(String[] args){




        Catre.setup();


        System.out.println("meme");

        for(Field f : Main.class.getDeclaredFields()){
            System.out.println("f");
            if(f.isAnnotationPresent(Manage.class)){
                System.out.println("found Managed! "+f.getName());
            }
        }


    }

}
