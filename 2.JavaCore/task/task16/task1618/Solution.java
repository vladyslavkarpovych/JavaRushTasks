package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution
{
    public static void main( String[] args ) throws InterruptedException
    {
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    public static class TestThread extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while ( !isInterrupted() )
                {
                    sleep( 1000 );
                }
            }
            catch ( InterruptedException e )
            {
            }
        }
    }
}