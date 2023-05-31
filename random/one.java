/* How to access Main Thread from the Child Thread */

class MyThread extends Thread
{
    //Creating static instance reference var of Thread class in MyThread class as mt
    static Thread mt;

    public void run()
    {
        try
        {
            mt.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        for(int i=0; i<10; i++)
        {
            System.out.println("Child Thread");
        }
    }
}


class one
{
    public static void main(String[] args) throws InterruptedException
    {
        //Accesing by direct parent name as it's mentioned as static also giving value as current executing thread which is main Thread.
        MyThread.mt = Thread.currentThread();

        MyThread t = new MyThread();
        t.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }

    }
}