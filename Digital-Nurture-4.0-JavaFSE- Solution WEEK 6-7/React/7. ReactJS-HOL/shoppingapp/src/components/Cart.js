import React, { Component } from 'react';

class Cart extends Component {
    render() {
        return (
            <div className="cart-item">
                <h3>{this.props.ItemName}</h3>
                <p>Price: ${this.props.Price}</p>
            </div>
        );
    }
}

Cart.defaultProps = {
    ItemName: "No Item",
    Price: 0
};

export default Cart;