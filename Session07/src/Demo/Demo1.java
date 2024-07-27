package Demo;

public class Demo1<T, K> {
    private T data1;
    private K data2;

    public Demo1(T data1, K data2) {
        System.out.println();
    }

    public Demo1() {
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public K getData2() {
        return data2;
    }

    public void setData2(K data2) {
        this.data2 = data2;
    }

    public <A> void newGen(A[] arr) {
        for (A A : arr) {
            System.out.println(A);
        }
    }
}
