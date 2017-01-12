package com.bhushan.Junk;

import com.google.common.collect.ImmutableList;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Created by bhushan on 1/4/17.
 */
public class testManufacture {
    private static String warehouseId = "ZAA0";
    private static String requestId = UUID.randomUUID().toString();



    private static Item targetItem = new Item("ZAA0", UUID.randomUUID().toString(), "BOO4", "CONTAINER_3", 15L);

    public static List<Item> setupSourceItem() {
        List<Item> sourceItemList = new LinkedList<Item>();

        Item sourceItem1 = new Item("ZAA0", UUID.randomUUID().toString(), "BOO1", "CONTAINER_1", 10L);
        Item sourceItem2 = new Item("ZAA0", UUID.randomUUID().toString(), "BOO2", "CONTAINER_1", 20L);
        Item sourceItem3 = new Item("ZAA0", UUID.randomUUID().toString(), "BOO3", "CONTAINER_2", 5L);

        sourceItemList.add(sourceItem1);
        sourceItemList.add(sourceItem2);
        sourceItemList.add(sourceItem3);

        return sourceItemList;
    }

    private static void updateSourceItem(ManufactureItem input) {
        int count = 1;
        for (Item item: input.getSourceItems()) {
            item.setContainerId("Changed" + count);
//            ManufactureItem newInput = input;
            input.setSourceItems(ImmutableList.<Item>of(item));
            System.out.println("Printing mutated list");
            displayItemList(input.getSourceItems());
            count++;
        }
    }

    private static void displayItemList(List<Item> itemList) {
        System.out.println("Printing Item List");
        for (Item item: itemList) {
            displayItem(item);
        }
    }

    private static void displayItem(Item item) {
        System.out.printf("%s\n%s\n%s\n%s\n%d\n\n",
                item.getRequestId(),
                item.getWarehouseId(),
                item.getFcSku(),
                item.getContainerId(),
                item.getQuantity());
    }

    public static void main(String[] args) {
        ManufactureItem manufactureItem = new ManufactureItem(warehouseId, requestId, setupSourceItem(), targetItem);
        updateSourceItem(manufactureItem);
        displayItemList(manufactureItem.getSourceItems());
    }

}

//
//    private String warehouseId;
//    private String requestId;
//    private String fcSku;
//    private String containerId;
//    private String quantity;
