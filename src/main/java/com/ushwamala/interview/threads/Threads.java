package com.ushwamala.interview.threads;

public class Threads {
     int N = 100;
    int counter = 1;

    public static void main(String[] args) {
        Threads threads = new Threads();

        Thread T1 = new Thread(threads::printOddNumber);
        Thread T2 = new Thread(threads::printEvenNumber);



        T1.start();
        T2.start();



    }

    public void printOddNumber() {
        synchronized (this) {
            //print till N
            while (counter < N) {

                //if counter is an EVEN number
                if (counter % 2 == 0) {

                    try {
                        //don't print it, WAIT()
                        wait();
                    }
                    catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                //print the value of the counter
                System.out.println(counter);
                //Increment the counter
                counter++;
                //Notify the second thread
                notify();
            }
        }
    }

    public void printEvenNumber(){
        //everything should be synced because threads don't guaranty order
        synchronized (this) {
            while (counter < N) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }


}
