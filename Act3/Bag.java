package Act3;

public class Bag <T>{
    private T [] list;
    private int count;
    
    public Bag (int n){
        this.list=(T[]) new Object[n];
        this.count=0;
    }

    public void add (T obj) throws IsFull{
        if(count >= list.length) {
            throw new IsFull("Bag is full");
        }
        list[count] = obj;
        count++;
    }

    public T[] getObjects() throws IsEmpty{
        if(count == 0) {
            throw new IsEmpty("Bag is empty");
        }
        return list;
    }

    public T remove(T obj) throws ObjectNoExist{
        int index = getIndex(obj);
        if(index == -1) {
            throw new ObjectNoExist("Object does not exist");
        }
        T removedObj = list[index];
        System.arraycopy(list, index + 1, list, index, count - index - 1);
        count--;
        return removedObj;
    }

    public int getIndex(T obj){
        for(int i = 0; i < count; i++) {
            if(list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append(list[i].toString());
            if(i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

