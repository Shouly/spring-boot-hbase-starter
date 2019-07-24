package me.shouly.hbase.operation.api;

import java.util.List;

/**
 * .
 *
 * @author liangbing
 * @version v1.0
 * @date 2019-07-10 11:18
 */
public interface HBaseOperationApi {

  /**
   * 创建表
   *
   * @param tableName 表名
   * @param columnFamilies 列族
   * @return
   */
  boolean createTable(String tableName, List<String> columnFamilies);

  /**
   * 创建表
   *
   * @param tableName 表名
   * @param columnFamilies 列族
   * @param splitKeys 预分割region
   * @return
   */
  boolean createTable(String tableName, List<String> columnFamilies, byte[][] splitKeys);
}
