/*class Demo{*/


            /*  Demo(){
                 
               System.out.println("Inside 0 para constructor");


  }
           public static void main (String[] Args){

           Demo obj = new Demo();
}
 
}*/

/*
   int a = 10;
   float b = 20.0f;




    Demo(){
                 
              System.out.println("Inside 0 para constructor");
               a  = 100;
               b  = 200.0f;

  }
           public static void main (String[] Args){
           Demo obj = new Demo();
           System.out.println(obj.a);

}
 
}
*/


 /*  int a = 10;
   float b = 20.0f;

               {
                 
             
               a  = 1000;
               b  = 2000.0f;

  }
           public static void main (String[] Args){
           Demo obj = new Demo();
           System.out.println(obj.a);

}
 
}*/



 /* class Demo{


   int a = 10;
   float b = 20.0f;

 static int var1;
            Demo(){
               System.out.println("Inside 0 para constructor");
               a  = 100;
               b  = 200.0f;
}

{    
        System.out.println("Inside Init Block.");
               a = 1000;
               b = 2000.0f;

}
           public static void main (String[] Args){
           Demo obj = new Demo();
           System.out.println(obj.a);

}
 
}*/


/*class Demo{


   int a = 10;
   float b = 20.0f;

 static int var1;
            Demo(){
               System.out.println("Inside 0 para constructor");
               a  = 100;
               b  = 200.0f;
}

{    
        System.out.println("Inside Init Block.");
               a = 1000;
               b = 2000.0f;
              var1 = 50000;

}

        static{ 
                System.out.println("Inside static block.");
                var1 = 5;
}
         


           public static void main (String[] Args){
           Demo obj = new Demo();
          // System.out.println(obj.a);
          // System.out.println(obj.var1);

}
 
}*/
   


class Demo{


   int a = 10;
   float b = 20.0f;

 static int var1;
            Demo(){
               System.out.println("Inside 0 para constructor");
               a  = 100;
               b  = 200.0f;
}

{    
        System.out.println("Inside Init Block.");
               a = 1000;
               b = 2000.0f;
              var1 = 50000;

}

        static{ 
                System.out.println("Inside static block.");
                var1 = 5;
                a = 1000000;
}
         


           public static void main (String[] Args){
           Demo obj = new Demo();
          

}
 
}



              




















