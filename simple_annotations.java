// Simple code to show how annotations can be useful in our program.

class Doer{
@Deprecated
void doItThisWay()
{
}
void doItThisNewWay()
{
}
}


class MyWorker
{
@SuppressWarnings("deprecations");
void doSomeWork()
{
 Doer d = new Doer();
 d.doItThisNewWay();
}

@SuppressWarnings("deprecations");
void doDoubleWork()
{
 Doer d1 = new Doer();
 Doer d2 = new Doer();
 d1.doItThisWay();
 d2.doItThisNewWay();
 }
}
