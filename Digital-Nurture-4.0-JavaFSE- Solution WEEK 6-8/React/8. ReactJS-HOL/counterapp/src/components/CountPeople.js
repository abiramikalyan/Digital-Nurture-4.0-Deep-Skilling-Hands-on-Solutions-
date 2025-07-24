import React, { Component } from 'react';

class CountPeople extends Component {
    constructor(props) {
        super(props);
        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    updateEntry = () => {
        this.setState(prevState => ({
            entryCount: prevState.entryCount + 1
        }));
    };

    updateExit = () => {
        this.setState(prevState => ({
            exitCount: prevState.exitCount + 1
        }));
    };

    render() {
        return (
            <div className="counter-container">
                <h2>Mall People Counter</h2>
                <div className="count-display">
                    <p>People Entered: {this.state.entryCount}</p>
                    <p>People Exited: {this.state.exitCount}</p>
                    <p>Currently Inside: {this.state.entryCount - this.state.exitCount}</p>
                </div>
                <div className="button-group">
                    <button onClick={this.updateEntry}>Login</button>
                    <button onClick={this.updateExit}>Exit</button>
                </div>
            </div>
        );
    }
}

export default CountPeople;