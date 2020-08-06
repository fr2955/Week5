package com.frankricker.arrays;

public class Array {

    private char[] arrayList = new char[100];
    private int[] pointerArray = new int[100];
    private int front = 0;
    private int rear = 1;

    public void Array(){

    }

    public void SetUpList(){

        //Add values to Array list
        this.arrayList[0] = 'A';
        this.arrayList[1] = 'B';
        this.arrayList[2] = 'D';
        this.arrayList[3] = 'E';
        this.arrayList[4] = 'F';
        this.arrayList[5] = 'G';

        //Add values to Pointer
        this.pointerArray[0] = 1;
        this.pointerArray[1] = 2;
        this.pointerArray[2] = 3;
        this.pointerArray[3] = 4;
        this.pointerArray[4] = 5;
        this.pointerArray[5] = -1;
        this.rear = 5;

    }

    public void insertElement (char y, char x){

        char toInsert = y;
        char inFrontOf = x;
        int temp = 0;
        //Add one spot to the rear
        this.rear = this.rear + 1;
        this.arrayList[this.rear] = toInsert;
        for(int n = 0; n <= this.rear; n++){
            if(this.arrayList[n] == inFrontOf)
                temp = n;

        }
        this.pointerArray[this.rear] = temp + 1;
        this.pointerArray[temp] = this.rear;


    }  // insert method header

    public void removeElement (char y){
        char toRemove = y;
        int tempInt = 0;
        int tempInt2 = 0;
        char tempChar;
        boolean start;
        for(int n = 0; n <= this.rear; n++) {
            if (this.arrayList[n] == toRemove) {
                tempInt = n;
                tempInt2 = this.pointerArray[n];
                for (int i = 0; i <= this.rear; i++) {
                    if(this.pointerArray[i] == 1 - tempInt2){
                        this.pointerArray[i] = tempInt2;
                    }

                }
            }
        }


        for (int i = tempInt; i <= this.rear && i >= 0; i = this.pointerArray[i]) {

            pointerArray[i] = pointerArray[i +1];

        }

    }  //remove element method header h
    public void ArrayPrinter() {
        int direction = 0;
        int n = 0;

        for (int i = 0; i <= this.rear && i >= 0; i = this.pointerArray[i]) {

            System.out.print(this.arrayList[i] + ", ");

        }
    }
}
