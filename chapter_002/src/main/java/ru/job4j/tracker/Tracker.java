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
        Item item = null;
        for (int i = 0; i < position; ++i) {
            if (items[indexOf(id)].getId().equals(id)) {
                item = items[i];
                break;
            }
        }
        return item;
    }
    public void replace(String id, Item item) {
        item.setId(id);
        items[indexOf(id)] = item;
    }
    public void delete(String id) {
        System.arraycopy(items, (indexOf(id) + 1), items, indexOf(id), position - (indexOf(id) + 1));
        items[position] = null;
        position--;
    }
}
