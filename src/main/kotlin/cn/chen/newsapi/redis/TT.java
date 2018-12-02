package cn.chen.newsapi.redis;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
public class TT {

    @Autowired
    JedisPool jedisPool;

    @GetMapping(value = "redis")
    public JSONObject T() {

        Jedis jedis = jedisPool.getResource();
        jedis.auth("Czc2538755682");
        List list = new LinkedList<Map<String, String>>();
        Map<String, String> map = new HashMap<>();
        map.put("user", "chen");
        list.add(map);
        jedis.set("list", map.toString());
        Gson gson = new Gson();
        Map<String, Object> tmp = new HashMap<String, Object>();
        JSONObject ob = JSONObject.parseObject(jedis.get("list"));

        Map<String, Object> t = new HashMap<>();
        t.put("name", "chen");
        return ob;
    }
}
