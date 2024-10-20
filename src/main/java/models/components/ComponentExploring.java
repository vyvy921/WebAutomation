package models.components;

import java.lang.reflect.Constructor;

public class ComponentExploring {

    public <T extends LoginPage> void login(Class<T> loginPageClass) {

        //Khoi tao tham so cho Constructor. Class <?>[] : danh sach cac tham so, khong co kieu biet truoc
        Class<?>[] parameters = new Class[]{};

        //Reflection and init an object Phan chieu va khoi tao doi tuong
        try {
            Constructor<T> constructor = loginPageClass.getConstructor(parameters);
            T loginPageObj = constructor.newInstance();
            loginPageObj.login();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        new ComponentExploring().login(LoginPageInternal.class);
        new ComponentExploring().login(LoginPageExternal.class);
    }
}
