package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



    public static boolean isPrime(int number) {
        boolean prime=true;
        if(number==0){
            prime=false;
        }
        if(number==1){
            prime=false;
        }
        for(int cont=2;cont<number;cont++){

        }
        return false;
    }


    public static void copyVectors(int [] vec, int [] otherVec){
            int otherPos = 0;
            for (int pos=0; pos < vec. length; pos++) {
                if (isPrime(vec[pos]))
                    otherVec[otherPos] = vec[pos];
                otherPos++;


        }


            }
    }