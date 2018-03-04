// Usage of thread pools to limit our work to restricted number of threads and how the threads are managed is abstracted.

String[] inpFiles = {"./file1.txt","file2.txt", .... , "file8.txt"};
String[] outFiles = {"./file1.out.txt","file2.out.txt", ... , "file8.out.txt"};

ExecutorService es = Executors.newFixedThreadPool(4); // Only max 4 threads will run at any point of time.

for( int i=0; i<inpFiles.length; i++)
 Adder adder = 	new Adder(inpFiles[i] , outFiles[i]);
es.submit(adder);

}

try{

es.shutdown();
es.awaitTermination(60, TimeUnit.Seconds);

}
catch(Exception e)
{
. . .
}
