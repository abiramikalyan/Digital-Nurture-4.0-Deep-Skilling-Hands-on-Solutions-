import React, { Component } from 'react';
import Cart from '../../../../../7. ReactJS-HOL/Ex - 1/shoppingapp/src/components/Cart';

class OnlineShopping extends Component {
    constructor() {
        super();
        this.state = {
            cartItems: [
                { ItemName: "Laptop", Price: 800 },
                { ItemName: "Smartphone", Price: 500 },
                { ItemName: "Headphones", Price: 50 },
                { ItemName: "Mouse", Price: 20 },
                { ItemName: "Keyboard", Price: 30 }
            ]
        };
    }

    render() {
        return (
            <div className="online-shopping">
                <h1>Items in your Cart</h1>
                <div className="cart-items">
                    {this.state.cartItems.map((item, index) => (
                        <Cart 
                            key={index}
                            ItemName={item.ItemName}
                            Price={item.Price}
                        />
                    ))}
                </div>
            </div>
        );
    }
}

export default OnlineShopping;