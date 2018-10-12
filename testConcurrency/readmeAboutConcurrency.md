#Concurrency
###1.two way to create a thread: 1-> implements Runnable; 2-> extends Thread:
advice: choose the first way at first, cus you can extends other class and implements others interface.

###2.Pausing the thread with sleep
Thread.sleep(durée); make the current running thread pause for a period of time.
.sleep() is a static method

###3.Interrupt a thread
3.1 if programmer preprare the sleeping thread with InterruptedException, it will be invoked.
3.2 One thread stand for long time , interrupt happened in this period.
Thread.interrupted(); do the works.
if (Thread.interrupted()) {
    throw new InterruptedException();
}
