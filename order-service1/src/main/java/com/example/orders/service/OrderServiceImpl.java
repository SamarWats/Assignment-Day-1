package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        OrderEntity entity = OrderMapper.convertObjectToEntity(request);

        return repo.save(entity);
    }

    @Override
    public OrderEntity getOrderById(Long id) {

        return repo.findById(id).orElseThrow(() -> new OrderNotFoundException());
    }

    @Override
    public void deleteOrder(Long id) {

        if (!repo.existsById(id)) {
            throw new OrderNotFoundException();
        }

        repo.deleteById(id);
    }
}