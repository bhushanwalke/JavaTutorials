package com.bhushan.Junk;

import java.util.List;
import java.util.Map;

/**
 * Created by bhushan on 1/4/17.
 */
public class ManufactureItem {
    private final String warehouseId;
    private final String requestId;

    private List<Item> sourceItems;
    private Item targetItem;

    public ManufactureItem(String warehouseId, String requestId, List<Item> sourceItems, Item targetItem) {
        this.warehouseId = warehouseId;
        this.requestId = requestId;
        this.sourceItems = sourceItems;
        this.targetItem = targetItem;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public String getRequestId() {
        return requestId;
    }

    public List<Item> getSourceItems() {
        return sourceItems;
    }

    public void setSourceItems(List<Item> sourceItems) {
        this.sourceItems = sourceItems;
    }

    public Item getTargetItem() {
        return targetItem;
    }

    public void setTargetItem(Item targetItem) {
        this.targetItem = targetItem;
    }
}
