package TEST7;

import java.util.ArrayList;
import java.util.List;

public class Safe {

    private List<Item> bestItems = null;

    private double maxV;

    private double maximumValue;

    //вычисляет общий объем предметов
    private double overallVolume(List<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getVolume();
        }
        return result;
    }

    // вычисляет общую ценность набора предметов
    private double totalValue(List<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getValue();
        }
        return result;
    }

    //проверка, является ли данный набор лучшим решением задачи
    private void checkSet(List<Item> items) {
        if (this.bestItems == null) {
            if (this.overallVolume(items) <= this.maxV) {
                this.bestItems = items;
                this.maximumValue = this.totalValue(items);
            }
        } else {
            if (this.overallVolume(items) <= this.maxV && this.totalValue(items) > this.maximumValue) {
                this.bestItems = items;
                this.maximumValue = this.totalValue(items);
            }
        }
    }

    //создание всех наборов перестановок значений
    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public Safe(double maxV) {
        this.maxV = maxV;
    }

    public List<Item> getBestItems() {
        return this.bestItems;
    }


}
