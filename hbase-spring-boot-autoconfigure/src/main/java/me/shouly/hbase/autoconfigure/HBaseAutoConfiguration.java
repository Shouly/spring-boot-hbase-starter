package me.shouly.hbase.autoconfigure;

import me.shouly.hbase.operation.api.HBaseTemplate;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * .
 *
 * @author liangbing
 * @version v1.0
 * @date 2019-07-09 19:15
 */
@Configuration
@ConditionalOnClass(HBaseTemplate.class)
@EnableConfigurationProperties(HBaseProperties.class)
public class HBaseAutoConfiguration {

  @Autowired private HBaseProperties hBaseProperties;

  private static final String HBASE_ZOOKEEPER_QUORUM = "hbase.zookeeper.quorum";

  @Bean
  @ConditionalOnMissingBean(HBaseTemplate.class)
  public HBaseTemplate hBaseConfig() {

    org.apache.hadoop.conf.Configuration config = HBaseConfiguration.create();

    config.set(HBASE_ZOOKEEPER_QUORUM, hBaseProperties.getZookeeperQuorum());

    HBaseTemplate hBaseTemplate = new HBaseTemplate(config);

    return hBaseTemplate;
  }
}
