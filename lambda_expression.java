// To use Lambda expressions to simplify the process of passing code as arguments.

ArrayList<MyClass> list = new ArrayList<>();

MyClass v1 = new MyClass("v1", "abc");
MyClass v2 = new MyClass("v2", "xyz");
MyClass v3 = new MyClass("v3", "abc");

// add 3 elements to the list.

list.add(v1);
list.add(v2);
list.add(v3);

//Lambda expression to iterate through each element in list.
list.forEach(m->System.out.println(m.getLabel()));

 
