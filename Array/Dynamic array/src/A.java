public class A
{
    int place = 0, size = 5;
    int a[] = new int[size];
    void add(int a)
    {
        if(size>place)
        {
            this.a[place++] = a;
        }
        else{
            size += 1;
            int temp[] = new int[size];
            for (int i = 0 ; i<this.a.length ; i++) {
                temp[i] = this.a[i];
            }
            this.a = temp;
            this.a[place++] = a;
        }
    }
    void display()
    {
        for (int i : a) {
            System.out.println("a is : "+i);
        }
    }
    void insert(int a,int pl)
    {
        this.a[pl] = a;
    }
    void delete(int pl)
    {
        System.out.println("your deleting value is : "+a[pl]);
        this.a[pl] = 0;
    }
}