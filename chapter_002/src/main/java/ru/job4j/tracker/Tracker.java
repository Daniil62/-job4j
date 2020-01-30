package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private String generateId() {
        java.util.Random rm = new java.util.Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }
    public Item[] findAll() {
        Item[] itemsWithoutNulls = new Item[position];
        int index = 0;
        for (int i = 0; i < position; ++i) {
            if (items[i] != null) {
                itemsWithoutNulls[index] = items[i];
                index++;
            }
        }
        itemsWithoutNulls = Arrays.copyOf(itemsWithoutNulls, index);
        return itemsWithoutNulls;
    }
    public Item[] findByName(String key) {
        Item[] itemsNameId = new Item[items.length];
        int index = 0;
        for (int i = 0; i < position; ++i) {
            if (items[i].getName().equals(key)) {
                itemsNameId[index] = items[i];
                index++;
            }
        }
        itemsNameId = Arrays.copyOf(itemsNameId, index);
        return itemsNameId;
    }
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; ++i) {
            if (items[i].getId().equals(id)) {
                result = items[i];
                break;
            }
        }
        return result;
    }
}
