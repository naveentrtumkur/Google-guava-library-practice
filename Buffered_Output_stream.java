// To write an array of strings to buffered output with a line break being placed.

public class Solution
{
void writeData(String[] data) throws IOException{

// I am using try-with-resources functionality
try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))){
for(String d:data){
bw.write(d);
bw.newLine();
}
}
}
