package models.components;

import java.lang.reflect.Constructor;

public class ComponentExploring {

    public <T extends LoginPage> void login(Class<T> loginPageClass) {
        //Lay constructor cua lop/class
        //Khai bao 1 mang rong parameters, dai dien cho danh sach tham so cua constructor can tim -> constructor ko co tham so
        Class<?>[] parameters = new Class[]{};

        //Reflection and init an object Phan chieu va khoi tao doi tuong
        try {
            Constructor<T> constructor = loginPageClass.getConstructor(parameters); //lay constructor phu hop voi parameter
            T loginPageObj = constructor.newInstance(); //tao mot doi tuong tu constructor
            loginPageObj.login(); //goi phuong thuc login cua doi tuong

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new ComponentExploring().login(LoginPageInternal.class);
        new ComponentExploring().login(LoginPageExternal.class);
    }
}
