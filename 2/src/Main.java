public class Main
{
    public static void main(String[] args)
    {
//        int age = 125678128;
//       a: while (age > 0)
//        {
//            int k = age;
//            int d = age;
//            int a = age % 10;
//            while (k > 0)
//            {
//                if (a == (k / 10) % 10)
//                {
//                    int c = k%10;
//                    while(d>0)
//                    {
//                        if(d%10 == a && (d/10)%10 == c)
//                        {
//                            System.out.println("true");
//                            break a;
//                        }
//                        d/=10;
//                    }
//                }
//                k /= 10;
//            }
//            age /= 10;
//        }
        Person a = new Person();
        a.age = 14;
        a.name = "Jorik";
        a.sum();
        System.out.println(a.getAge());
    }
    public static class Person
    {
        public int age;
        public String name;

        public int getAge()
        {
            return age;
        }

        public String getName()
        {
            return name;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public void sum()
        {
            age+=age;
        }
    }
}
