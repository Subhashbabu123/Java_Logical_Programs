class Delete
  {
    public void delete(int a[],int value)
    {
      int n=a.length;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]==value)
          {
            continue;
            /*for(int j=i;j<a.length;j++)
              {
                a[j]=a[j+1];
              }
            n--;*/
          }
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
      int arr[]={23,78,44,90,48,41,88,45};
      Delete obj=new Delete();
      obj.delete(arr,44);
    }
  }