class Specify
{
private final int rollNo;
private  String name;
private char status;
private double sal;
public int result;

        public Specify(String name, int rollNo, char status, double sal)
        {
                this.name=name;
                this.rollNo=rollNo;
                this.status=status;
                this.sal=sal;

        }
        public float add(int add1, int add2, double add3)
        {
                float result1=(add1+add2+(int)add3);
                System.out.println(result1);
                return result1;
        }

        void display()
        {
                System.out.println(this.name+this.rollNo+this.status+this.sal);
        }

        public static void main(String[] arg)
        {
		System.out.println("Welcome to class specification");
               	Specify demo = new Specify("Tej",475,'P',20000.555);
                Specify demo1= new Specify("Raj",468,'P',20009.234);
                demo.display();
                demo1.display();
                float finalResult1=demo.add(15, 11, 4.5);
                System.out.println("Result1:" +finalResult1);

        }
}
