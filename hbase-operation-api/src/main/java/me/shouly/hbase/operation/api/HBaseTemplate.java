package me.shouly.hbase.operation.api;

import java.io.IOException;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.springframework.util.Assert;

/**
 * .
 *
 * @author liangbing
 * @version v1.0
 * @date 2019-07-10 11:01
 */
@Slf4j
public class HBaseTemplate implements HBaseOperationApi {

  private Configuration configuration;

  private Connection connection;

  public HBaseTemplate(Configuration configuration) {

    Assert.notNull(configuration, "hbase configuration can't be null!");
    this.configuration = configuration;

    try {
      this.connection = ConnectionFactory.createConnection();
    } catch (IOException e) {
      log.error("hbase create connection error!", e);
    }
  }

  @Override
  public boolean createTable(String tableName, List<String> columnFamilies) {
    return false;
  }

  @Override
  public boolean createTable(String tableName, List<String> columnFamilies, byte[][] splitKeys) {
    return false;
  }
}
