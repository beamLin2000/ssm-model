package entity;

import java.util.List;
@lombok.Data
public class Menu {
    private String icon;
    private List<Data> data;

    @Override
    public String toString() {
        return "Menu{" +
                "icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
