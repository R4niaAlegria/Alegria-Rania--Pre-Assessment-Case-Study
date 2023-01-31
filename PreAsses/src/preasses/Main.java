
package preasses;
import java.util.*;

public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
      List<RecordIn> c = new ArrayList<>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int ch;
      do{
            System.out.println("1.ADD");
            System.out.println("2.VIEW");
            System.out.println("3.EDIT");
            System.out.println("4.DELETE");
            System.out.println("5.SEARCH");
            System.out.println("Enter yout choice: ");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    int code = 202200;
                    boolean f = false;
                    Iterator<RecordIn> i = c.iterator();
                    while(i.hasNext()){
                        RecordIn e = i.next();
                        if(e.getCode() == code) {
                            ++code;
                            f = true;
                        }
                    }
                    if(!f){
                       code = 20230000;
                    }
                    System.out.println("Enter name:");
                    String name = s1.nextLine();
                    
                    System.out.println("Enter Peripheral (Inputdevices, Output Devices,\n" +
                        " and Input/Output Devices):");
                    String Pre = s1.nextLine();
                    c.add(new RecordIn(code,name,Pre));
                     System.out.println("---------------");
                    System.out.println("Nmae:"+name+"  Code:"+code+" Peripheral"+Pre);
                    System.out.println("---------------");
                break;
                
                case 2:
                    System.out.println("---------------");
                    i = c.iterator();
                    while(i.hasNext()){
                    RecordIn r = i.next();
                    System.out.println(r);
                    System.out.println("---------------");
                    }
                     
                break;
                case 5:
                    boolean found = false;
                     System.out.println("Enter code to search; ");
                     code = s.nextInt();
                     System.out.println("---------------");
                    i = c.iterator();
                    while(i.hasNext()){
                    RecordIn r = i.next();
                    if(r.getCode()==code){
                    System.out.println(r);
                    found = true;
                    
                    }
                }
                if(!found){
                        System.out.println("Record Not Found"); 
                    }
                    System.out.println("---------------");
                 break;
                 
                case 4:
                    found = false;
                    System.out.println("Enter code to delete; ");
                     code = s.nextInt();
                     System.out.println("---------------");
                    i = c.iterator();
                    while(i.hasNext()){
                    RecordIn r = i.next();
                    if(r.getCode()==code){
                    i.remove();
                    found = true; 
                            }
                    }
                    if(!found){
                        System.out.println("Record Not Found"); 
                    }else{
                         System.out.println("Record is Deleted successfully "); 
                    }
                    System.out.println("---------------");
                break;
                
                case 3:
                    found = false;
                    System.out.print("Enter code to Update :");
                    code = s.nextInt();
               
                    ListIterator<RecordIn>li = c.listIterator();
                    while(li.hasNext()){
                    RecordIn e = li.next();
                    if(e.getCode() == code)  {
                    System.out.print("Enter new Name : ");
                    name = s1.nextLine();

                    System.out.print("Enter new Peripheral (Inputdevices, Output Devices,\n" +
                        " and Input/Output Devices): ");
                    Pre = s1.nextLine();
                    li.set(new RecordIn(code,name,Pre));
                    found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }else{
                  System.out.println("Record is Updated Successfully");
               }

               
            break;

            
         }
   }while(ch!=0);
   }
}
