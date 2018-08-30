package com.qingsong.controller;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by hanqingsong on 18/8/30.
 *
 * @author hanqingsong
 * @date 18/8/30
 */
@RestController
public class zooController {
    @RequestMapping("/zk/get")
    public String getZk() {
        Watcher watcher= new Watcher(){
            public void process(WatchedEvent event) {
                System.out.println("receive event："+event);
            }
        };
        String value=null;
        try {
            ZooKeeper zooKeeper = new ZooKeeper("193.112.46.144:2181", 100, watcher);
            List<String> children = zooKeeper.getChildren("/", watcher);
            System.out.println(children);
            byte[] data = zooKeeper.getData("/node-1", watcher, null);
            String str = new String(data);
            System.out.println(str);
            zooKeeper.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
        return value;
    }
}
