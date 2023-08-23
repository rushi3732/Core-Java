package Test5;
class  FindMedianApp{
	int a[];
	int b[];
	int s,s1;
void SetFirstArray(int a[])
{
	this.a=a;
	 s=a.length;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.println(a[i]+"\n");
//	}
	
}
void SetSecondArray( int b[])
{
	this.b=b;
	 s1=b.length;

	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(b[i]>b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
}
void MergeTwoArray()

{
	int size=s+s1;
	int d[]= new int[size];
	for(int i=0;i<size;i++)
	{
		d[i]=a[i];
	}
	for(int i=s;i<size;i++)
	{
		d[i]=b[i];
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(d[i]+"\n");
	}
	
	
}
}
public class FindMedian {

	public static void main(String[] args) {
		 FindMedianApp f=new  FindMedianApp();
		int a[]={1,12,15,2,6,38};
		int  b[]={2,13,17,30,45};

		 f.SetFirstArray(a);
		 f.SetSecondArray(b);
		 f.MergeTwoArray();
				 
		

	}

}
