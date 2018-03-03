// a simple static inputstream method to readall lines from a file.

void readThemAll() throws IOException{
List<String> lines = Files.readAllLines(Paths.get(("data.txt"));

for(String line:lines)
System.out.println(line);
}
