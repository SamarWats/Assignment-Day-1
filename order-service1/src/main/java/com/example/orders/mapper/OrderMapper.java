package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity convertObjectToEntity(OrderRequestDTO dto) {
		return new OrderEntity(null, dto.getCustomerName(), dto.getEmail(),dto.getProductName(), dto.getQuantity(), dto.getPricePerUnit(), null);
    
    }

    public static OrderResponseDTO convertEntityToDto(OrderEntity entity) {
        return new OrderResponseDTO(entity.getOrderId(), entity.getCustomerName(), entity.getEmail(),entity.getProductName(), entity.getQuantity(), entity.getPricePerUnit(), entity.getTotalAmount());
    }
}