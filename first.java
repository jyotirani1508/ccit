 class first
{
  private int a;
  public void setdata(int d)
{
a=d;
}
public int getdata()
{
  System.out.println("Value of a ");
  return a;
}
public static void main(String[] args) {
  first t = new first();
  t.setdata(456);
  System.out.println(t.getdata());
}
}
