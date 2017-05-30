package com.example.jocke.incidentguardian.Entities;

import com.microsoft.azure.storage.table.TableServiceEntity;



public class UserEntity extends TableServiceEntity {

    // Note: An entity's partition and row key uniquely identify the entity in
    // the table.
    // Entities with the same partition key can be queried faster than those
    // with different partition keys.
    public UserEntity(String userName, String sensorType) {
        this.partitionKey = userName;
        this.rowKey = sensorType;
    }

    public UserEntity() {
    }
    public String password;
    public Double posX;
    public Double posY;
    public Double posZ;


    public Double getPosX() {
        return posX;
    }

    public void setPosX(Double posX) {
        this.posX = posX;
    }

    public Double getPosY() {
        return posY;
    }

    public void setPosY(Double posY) {
        this.posY = posY;
    }

    public Double getPosZ() {
        return posZ;
    }

    public void setPosZ(Double posZ) {
        this.posZ = posZ;
    }
}
