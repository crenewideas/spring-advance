package cn.pxl.entity.lifecycle.initmethod;

public class Singer {
    private String name;

    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void init() throws IllegalAccessException {
        System.out.println("start init method call");
        if(name == null){
            System.out.println("using default name");
            this.name = "defaultName";
        }
        if(age == null){
            throw new IllegalAccessException("you must set age of your bean");
        }
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
