 class Test<T>
 {
     
 
 T obj;
         Test(T obj)
         {
          this.obj=obj;
         }
         public T getObject()
         {
             return this.obj;
         }
 }
class Main
{
    public static void main(String args[])
    {
        Test<Integer> iobj = new Test<Integer>(25);
        System.out.println(iobj.getObject());
        
        Test<String> jobj = new Test<String>("arya");
        System.out.println(jobj.getObject());
    }
}