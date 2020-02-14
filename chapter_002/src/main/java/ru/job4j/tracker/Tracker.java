package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    private ArrayList<Item> items = new ArrayList<>();
    private String generateId() {
        java.util.Random rm = new java.util.Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    private int indexOf(String id) {
        int result = -1;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = this.items.indexOf(item);
                break;
            }
        }
        return result;
    }
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }
    public Item[] findAll() {
        Item[] array = new Item[this.items.size()];
        int i = 0;
        for (Item item : this.items) {
            array[i] = item;
            if (i < this.items.size() - 1) {
                i++;
            }
        }
        return Arrays.copyOf(array, this.items.size());
    }
    public Item[] findByName(String key) {
        Item[] itemsNameId = new Item[this.items.size()];
        int index = 0;
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                itemsNameId[index] = item;
                index++;
            }
        }
        itemsNameId = Arrays.copyOf(itemsNameId, index);
        return itemsNameId;
    }
    public Item findById(String id) {
        Item item = null;
        int index = indexOf(id);
            if (index != -1 && this.items.get(index).getId().equals(id)) {
               item = this.items.get(index);
            }
        return item;
    }
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            this.items.set(indexOf(id), item);
            result = true;
        }
        return result;
    }
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean result = false;
        if (index != -1) {
            this.items.remove(index);
            result = true;
        }
        return result;
    }
}

