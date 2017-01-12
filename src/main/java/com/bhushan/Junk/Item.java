package com.bhushan.Junk;

/**
 * Created by bhushan on 1/4/17.
 */
public class Item {
    private String warehouseId;
    private String requestId;
    private String fcSku;
    private String containerId;
    private Long quantity;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public Item(String warehouseId, String requestId, String fcSku, String containerId, Long quantity) {
        this.warehouseId = warehouseId;
        this.requestId = requestId;
        this.fcSku = fcSku;
        this.containerId = containerId;

        this.quantity = quantity;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getFcSku() {
        return fcSku;
    }

    public void setFcSku(String fcSku) {
        this.fcSku = fcSku;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
