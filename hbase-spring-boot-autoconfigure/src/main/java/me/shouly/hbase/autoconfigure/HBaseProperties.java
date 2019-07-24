package me.shouly.hbase.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * .
 *
 * @author liangbing
 * @version v1.0
 * @date 2019-07-09 19:12
 */
@Data
@ConfigurationProperties(prefix = "hbase")
public class HBaseProperties {

  /** zk */
  private String zookeeperQuorum;
}
