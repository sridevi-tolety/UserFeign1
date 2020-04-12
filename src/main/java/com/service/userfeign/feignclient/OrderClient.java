package com.service.userfeign.feignclient;
​
import java.util.List;​
​
import org.springframework.cloud.openfeign.FeignClient;​
import org.springframework.stereotype.Service;​
import org.springframework.web.bind.annotation.GetMapping;​
import org.springframework.web.bind.annotation.PathVariable;​
import org.springframework.web.bind.annotation.PostMapping;​
import org.springframework.web.bind.annotation.RequestBody;​
import org.springframework.web.bind.annotation.RequestParam;​
​
import com.service.userfeign.models.Order;​
​
//@FeignClient(value="orders-service", url="http://localhost:8081/demo/orders")​
@FeignClient(name="orders-service", url ="http://localhost:8081")​
//@FeignClient(name="http://localhost:8081/demo/orders")​
public interface OrderClient {​
​
@GetMapping("/demo/orders")​
public List<Order> getAll();​
​
/*@GetMapping("/{userId}")​
public List<Order> getAllById(@PathVariable("userId") String userId);​
​
@GetMapping("/byparam")​
public List<Order> getAllByReqParam(@RequestParam("userId") String userId);​
​
@PostMapping("/byparam")​
public List<Order> getAllByPostReqParam(@RequestParam("userId") String userId);​
​
@PostMapping("/bybody")​
public Order getAllByPostReqBody(@RequestBody Order order);​
*/​
​
}​