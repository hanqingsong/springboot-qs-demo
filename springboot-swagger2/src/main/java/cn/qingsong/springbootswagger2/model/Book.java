package cn.qingsong.springbootswagger2.model;

/**
 * Created by hanqingsong on 18/9/25.
 *
 * @author hanqingsong
 * @date 18/9/25
 */
public class Book {
    private String name;
    private double price;
    private Integer repertory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }
}
