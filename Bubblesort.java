class cls
{
public static void Sort(int[ ] a )
{
	int tem;
	boolean swap = false;
    for(int i =0;i<a.length;i++)
    {
        for(int j = 0;j<a.length-1;j++)
        {
            if(a[j]>a[j+1])
            {
                tem = a[j];
                a[j] = a[j+1];
                a[j+1]=tem;
                swap = true;
            }
            if(swap = false)
            {
                break;
            }
        }
    }
    for(int i =0;i<a.length;i++)
    {
        System.out.print(a[i] + " ");
    }
}
  public static void main(String args[])
  {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int [] a = new int[t];
        for(int i=0;i<t;i++)
        {
            a[i] = s.nextInt();
          
        }
        Sort(a);
        s.close();
    }
}
