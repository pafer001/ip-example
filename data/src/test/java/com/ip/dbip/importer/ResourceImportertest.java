package com.ip.dbip.importer;

import com.ip.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ResourceImportertest extends BaseTest {

    @Autowired
    private ResourceImporter resourceImporter;

    @Test
    public void testLoad() throws Exception {

        resourceImporter.load();
    }
}
