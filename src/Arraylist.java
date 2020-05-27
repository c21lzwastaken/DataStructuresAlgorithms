import com.sun.security.jgss.GSSUtil;

public class Arraylist {
    private int[] array;
    private int lastIndex;
    private int chunkSize;

    public Arraylist(){
        this.chunkSize = 10;
        this.lastIndex = -1;
        this.array = new int[10];
    }

    public void add(int addition){
        if(this.lastIndex+1>this.array.length-1){
            int[] replacement= new int[this.array.length+this.chunkSize];

            for (int i = 0; i <= this.lastIndex; i++) {
                replacement[i]=this.array[i];
            }

            replacement[this.lastIndex+1]=addition;
            this.array=replacement;
            this.lastIndex++;
        }
        else{
            this.array[this.lastIndex+1]=addition;
            this.lastIndex++;
        }

    }

    public int get(int index){
        if (index>this.lastIndex){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        return this.array[index];
    }

    public int getCapacity(){
        return this.array.length-(this.lastIndex+1);
    }

    public void insert(int addition, int index){
        if (index>this.lastIndex){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else if(this.lastIndex+1==this.array.length) { //If you're out of storage

            int[] replacement = new int[this.array.length + this.chunkSize];

            for (int i = 0; i < index; i++) { //Replacing the ones to the left as they were
                replacement[i] = this.array[i];
            }

            replacement[index] = addition; //New value

            for (int i = index; i <= lastIndex; i++) { //Moving the other ones to the right
                replacement[i+1] = this.array[i];
            }

            this.array = replacement;

            this.lastIndex++;

        }

        else if (this.lastIndex+1 < this.array.length){
            for (int i = index; i <= this.lastIndex; i++) {
                this.array[i+1]=this.array[i];
                this.array[index]=addition;
            }
            this.lastIndex++;
        }
    }

    public void remove(int index){
        if (index>this.lastIndex){
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else{
            for (int i = index+1; i <= this.lastIndex; i++) { //Moving the other ones to the left
                this.array[i-1] = this.array[i];
            }
            this.array[lastIndex]=0;
            this.lastIndex--;
        }
    }

    public void set(int addition, int index){ //This one is a lot easier, just directly replacement or adding

        if(index > this.array.length){ //If it's outside the existing array
            int a = index;
            int b = this.array.length;
            int c = 0; //How many times you need to +10
            while(a>=b){
                b=b+10;
                c++;
            }
            int[]replacement = new int[this.array.length+chunkSize*c];

            for (int i = 0; i < this.lastIndex; i++) {
                replacement[i]=this.array[i];
            }
            replacement[index]=addition; //New value, wherever it is

            this.array=replacement;

            this.lastIndex=index;
        }

        else{ //Replace a prexisting value
            this.array[index]=addition;
        }
    }

    public int getSize(){
        return this.lastIndex+1;
    }

    public int pop(){
        int a = this.array[0];
        for (int i = 1; i <= this.lastIndex; i++) { //Moving the other ones to the left
            this.array[i-1] = this.array[i];
        }
        this.array[lastIndex]=0;
        this.lastIndex--;

        return a;
    }
    public int pushget(int addition){
        if(this.lastIndex+1==this.array.length) { //If you're out of storage

            int[] replacement = new int[this.array.length + this.chunkSize];

            for (int i = 0; i < 0; i++) { //Replacing the ones to the left as they were
                replacement[i] = this.array[i];
            }

            replacement[0] = addition; //New value

            for (int i = 0; i <= lastIndex; i++) { //Moving the other ones to the right
                replacement[i+1] = this.array[i];
            }

            this.array = replacement;

            this.lastIndex++;

        }

        else if (this.lastIndex+1 < this.array.length){
            for (int i = 0; i <= this.lastIndex; i++) {
                this.array[i+1]=this.array[i];
                this.array[0]=addition;
            }
            this.lastIndex++;
        }
        return this.array[0];
    }
    public int removeget(int index){
        if (index>this.lastIndex){
            System.out.println(this.lastIndex);
            throw new IndexOutOfBoundsException("This is out of bounds");
        }
        else{
            int v = this.array[index];
            for (int i = index+1; i <= this.lastIndex; i++) { //Moving the other ones to the left
                this.array[i-1] = this.array[i];
            }
            this.array[lastIndex]=0;
            this.lastIndex--;
            return v;
        }
    }
}
