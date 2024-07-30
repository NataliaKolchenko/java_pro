package WorkWithXML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Создайте программу, которая читает XML файл с информацией о товарах и выводит название самого дорогого товара.
public class ex3_ExpensiveGoods {
    public static void main(String[] args) throws IOException {
        Goods g1 = new Goods("Pensil Mark", "Pencil", 5);
        Goods g2 = new Goods("Screen", "Monitor", 355);
        Goods g3 = new Goods("Pensil Ted", "Pencil", 15);
        Goods g4 = new Goods("Phone old", "Phone", 65);

        XmlMapper xmlMapper = new XmlMapper();
        String fileName = "GOODS.xml";
        File file = new File(fileName);

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);
        goodsList.add(g4);

        xmlMapper.writeValue(file, goodsList);
        CollectionType collectionType = TypeFactory.defaultInstance().constructCollectionType(List.class, Goods.class);

        List<Goods> value = xmlMapper.readValue(file, collectionType);

        int maxPriceGood = 0;
        Goods maxItem = null;
        for (int i = 0; i < value.size(); i++) {
            Goods goods = (Goods) value.get(i);
            if (goods.getPrice() >= maxPriceGood) {
                maxPriceGood = goods.getPrice();
                maxItem = goods;
            }
        }

        System.out.println(maxPriceGood);
        System.out.println(maxItem.getTitle());



    }
}

class Goods {
    private String title;
    private String category;
    private int price;

    public Goods() {
    }

    public Goods(String title, String category, int price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
