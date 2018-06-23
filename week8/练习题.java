
public class AA {
public void aa1(){
System.out.println("AA.aa1");
}
}
public class BB extends AA{
public void aa1(){
System.out.println("BB.aa1");
}
public void aa3(){
super.aa1();
System.out.println("BB.aa3");
}
}
public class CC extends BB{
public void cc1(){
System.out.println("CC.cc1");
}
public void cc2(){
super.aa1();
System.out.println("CC.aa1");
}
public void cc3(){
super.aa3();
System.out.println("CC.cc3");
}
}
Assume	objects	have	been	created	as	follows:
BB	b	=	new	BB();
CC	c	=	new	CC();
What	will	be	printed?
c.aa1();
   CC.aa1
   BB.aa1
c.aa3();
   CC.cc3
   BB.aa3
b.aa3();
    BB.aa3
    AA.aa1
c.cc3();
    CC.cc3
    AA.aa1
    BB.aa3

c.cc2();
    CC.aa1
    BB.aa1
 
