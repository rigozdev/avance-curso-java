package Arreglos;

public class Tarea2 {
    public static void main(String[] args) {
        int[] arr = { 14, 33, 15, 10, 78, 21, 43 };
        int mayor = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]>=11 && arr[i]<=99){
                if(arr[i]>mayor){
                    mayor = arr[i];
                }
            }else{
                System.out.println("numero no está en rango");
                System.out.println(arr[i]);;
            }

        }
        System.out.println("El número mayor del arreglo es");
        System.out.println(mayor);
    }
}
