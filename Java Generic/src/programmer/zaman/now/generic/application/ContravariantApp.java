package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Anto");
        // objectMyData.setData(1000); // ini gak bakal jadi masalah, kalo dibawah diubah menjadi Object

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {     // ini adalah contravariant
        // Object value = myData.getData();
        String value = (String) myData.getData();

        System.out.println("Process parameter " + value);

        myData.setData("Ahmad Santoso");
    }
}
