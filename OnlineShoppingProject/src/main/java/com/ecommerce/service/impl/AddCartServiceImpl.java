package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.AddCart;
import com.ecommerce.repository.AddCartRepository;
import com.ecommerce.service.AddCartService;

/*
 * @Auther shiwani dewang
 */
@Service
public class AddCartServiceImpl implements AddCartService {
	@Autowired
	private AddCartRepository addCartRepository;

	@Override
	public AddCart addToCart(AddCart addCart) {
		AddCart cart = addCartRepository.save(addCart);
		return cart;
	}

	@Override
	public AddCart getCartById(Integer id) {
		AddCart addCart = addCartRepository.findById(id).get();
		return addCart;
	}

	@Override
	public AddCart updateCartById(int id, AddCart addCart) {
		AddCart cart = addCartRepository.findById(id).get();
		cart.setProductId(addCart.getProductId());
		cart.setProductname(addCart.getProductname());
		cart.setPrice(addCart.getPrice());
		cart.setQuantity(addCart.getQuantity());
		cart.setTotalAmount(addCart.getTotalAmount());
		AddCart cart1 = addCartRepository.save(cart);
		return cart1;
	}

	@Override
	public void deletedCartById(Integer id) {
		addCartRepository.deleteById(id);

	}

}
