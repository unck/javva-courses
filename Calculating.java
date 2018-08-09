public class Calculating{
    int result= 0;

    public void add(int ... params){
        for(int param : params){
            this.result += param;
        }
    }

    public int getResult(){
        return this.result;
    }
    public void reset(){
        this.result = 0;
    }
}