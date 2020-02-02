package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private String generateId() {
        java.util.Random rm = new java.util.Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    private int indexOf(String id) {
        int result = -1;
        for (int i = 0; i < position; ++i) {
            if (items[i].getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
    public Item[] findByName(String key) {
        Item[] itemsNameId = new Item[position];
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
        Item item = null;
        int index = indexOf(id);
            if (index != -1 && items[index].getId().equals(id)) {
               item = items[index];
            }
        return item;
    }
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean result = false;
        if (index != -1) {
            System.arraycopy(items, (index + 1), items, index, position - (index + 1));
            items[position] = null;
            position--;
            result = true;
        }
        return result;
    }
}
