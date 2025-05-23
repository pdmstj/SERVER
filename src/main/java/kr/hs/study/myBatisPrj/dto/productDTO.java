package kr.hs.study.myBatisPrj.dto;


public class productDTO {
    private String item;
    private int price;

    public productDTO(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
