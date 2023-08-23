package Comparable;
import java.util.*;

public class OpertionsApp {

	public static void main(String[] args) {
		OperationApp op1=new OperationApp();
		op1.setId(4);
		op1.setName("rushi");
		op1.setRuns(100000);
		OperationApp op2=new OperationApp();
		op2.setId(2);
		op2.setName("karan");
		op2.setRuns(20000);
		OperationApp op3=new OperationApp();
		op3.setId(1);
		op3.setName("reahul");
		op3.setRuns(3500);
		ArrayList al=new ArrayList();
		al.add(op1);
		al.add(op2);
		al.add(op3);
		Scanner ad=new Scanner(System.in);
		do {
			System.out.println("enter your choice");
			System.out.println(" case 1: Show all Object");
			System.out.println("case 2: Add new Object");
			System.out.println("case 3: show all object ascending order");
			System.out.println("case 4: show all object decending order");
			System.out.println("case 5: delete record by its id");
			System.out.println("case 6: find employee its id");
			int no;
			no=ad.nextInt();			
			switch(no)
			{
			case 1:
				for(Object obj:al)
				{
					OperationApp op =(OperationApp)obj;
					System.out.println("Name \t"+op.getName()+"\t"+"Id \t"+op.getId()+"\t"+"Runs\t"+op.getRuns()+"\n");
				}
				break;
				
			case 2:
				OperationApp op4=new OperationApp();
			System.out.println("enter  id name  and runs");
			int id=ad.nextInt();
			String name=ad.next();
			int runs=ad.nextInt();
			op4.setId(id);
			op4.setName(name);
			op4.setRuns(runs);
			al.add(op4);
				break;
				
			case 3:
				Collections.sort(al);
				System.out.println("After Ascending order \n");
				for(Object obj:al)
				{
					OperationApp op =(OperationApp)obj;
					System.out.println("Name \t"+op.getName()+"\t"+"Id \t"+op.getId()+"\t"+"Runs\t"+op.getRuns()+"\n");
				}
				break;
				
			case 4:
				System.out.println("Descending order\n");
				ListIterator i=al.listIterator(al.size());
				while(i.hasPrevious())
				{
					OperationApp op=(OperationApp)i.previous();
					System.out.println("Name \t"+op.getName()+"\t"+"Id \t"+op.getId()+"\t"+"Runs\t"+op.getRuns()+"\n");
				}
				break;
				
				
			case 5:
				System.out.println("Enter your id \n");
				int s=ad.nextInt();
				for(Object obj:al)
				{
				OperationApp  op=(OperationApp)obj;
				if(op.getId()==s)
				{
					al.remove(op);
					
				}
				
				break;
				}
				
			case 6:
				System.out.println("Enter a Emlpyee id if record found then print record is present in arraylist and ia not present then record nit oresent in arratlist");
				int mo=ad.nextInt();
				for(Object obj:al)
				{
					OperationApp p=(OperationApp)obj;
					
					if(p.getId()==mo)
					{
						System.out.println("Name \t"+p.getName()+"\t"+"Id \t"+p.getId()+"\t"+"Runs\t"+p.getRuns()+"\n");

						
					}
					else {
						System.out.println("recors not present");
					}
				}
				break;
			}
			
		
		}
		while(true);

	}

}
