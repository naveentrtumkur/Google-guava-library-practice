// A small program to write formatted content onto a buffer stream.

void doWrite(int david, int dawson, int dillon, int gordon, double avgDiff) throws IOException
{

BufferedWriter writer = Files.newBufferedWriter(Paths.get("myfiles.txt"));
try(Formatter f = new Formatter(writer)) {
f.format("My uncles are %d, %d, %d years old", david, dawson, dillon);

f.format("The averge age is: %.1f",avgDiff);

}
} 

