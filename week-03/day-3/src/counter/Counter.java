package counter;

public class Counter {


    int value;
    int initialValue;
    public Counter(){}
    public Counter(int value){
        this.value=value;
        initialValue=value;
    }
    public void add(int number){
        value+=number;
    }
    public void add(){
        value++;
    }
    public int get() {
        return value;
    }
    public void reset(){
        value=initialValue;
    }
}
