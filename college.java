class faculty
{ int fac_id;
   String fac_name;
   void display()
   { System.out.println ("Faculty Id : "+ fac_id);
     System.out.println(" Faculty Name : " +fac_name);
   }
}
class college
{ public static void main(String args[])
  {
    faculty fac1 = new faculty();
     faculty fac2 = new faculty();
    fac1.fac_id=1;
     fac2.fac_id=2;
    fac1.fac_name="Meena ";
    fac2.fac_name="Manoj";
    fac1.display();
    fac2.display();
}
}
