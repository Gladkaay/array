package com.gladkaya.array.creator;

import com.gladkaya.array.entity.EntityArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DataCreator {
    private final static Logger logger = LogManager.getLogger();

    public EntityArray createEntityArray(int[] correctString) {
        EntityArray entityArray = new EntityArray(correctString);
        logger.log(Level.INFO, entityArray);
        return entityArray;
    }
}

