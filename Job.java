public class Job implements Runnable {
   private int jobNumber;
   
   Job(int jobNUmber){
      this.jobNUmber = jobNUmber;
      }
      
   public void run(){
     //undetake required work, here we will emulate it by sleeping for a period
     System.out.println("Job: " + jobNumber + " is being processed by thread: " + Thread.currentThread().getName());
     try{
        Thread.sleep((int)(1000));
      }catch (InterruptedExeption e){
          //no catching as example should not experience interruptions
      }
      System.out.println("Job: " + jobNumber + " is ending in thread: " + Thread.currrentThread().getName());
    }
}
