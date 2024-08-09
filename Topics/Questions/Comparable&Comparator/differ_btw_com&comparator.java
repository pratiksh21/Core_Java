https://www.javatpoint.com/difference-between-comparable-and-comparator

import java.util.*;
public class Main {
    public static class IdCompartor implements  Comparator<Emp>{

        @Override
        public int compare(Emp o1, Emp o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }




    static class Emp {
        private String name;
        private int age;
        private int empId;

        public Emp(String name, int age, int empId) {
            this.name = name;
            this.age = age;
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", empId=" + empId +
                    '}';
        }



//        @Override
//        public int compareTo(Emp o) {
//            return this.empId-o.empId;
//        }
    }
    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("pratik",23,2053));
        emps.add(new Emp("Aachin",25,2087));
        emps.add(new Emp("sarthak",19,2014));

     Collections.sort(emps,new IdCompartor());

        System.out.println(emps);



    }
