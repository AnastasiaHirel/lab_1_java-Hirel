package lab_1_java;

public class Food {
    private String type;

    public String getType(){
        return type;
    }

    public Food(String type){
        this.type = type;
    }

    public String toString(){
        return type;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Food)){
            return false;
        }
        else if (type == null || ((Food)obj).type == null){  // имя не задано
            return false;
        }
        return type.equals(((Food)obj).type);
    }
    private void equals(){

    }
}
