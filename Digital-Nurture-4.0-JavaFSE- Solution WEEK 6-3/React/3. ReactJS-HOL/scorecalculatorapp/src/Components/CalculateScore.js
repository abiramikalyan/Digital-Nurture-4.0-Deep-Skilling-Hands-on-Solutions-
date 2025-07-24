import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore({ Name, School, Total, goal }) {
    const averageScore = (Total / goal) * 100;

    return (
        <div className="score-container">
            <h2>Student Score Details</h2>
            <p><strong>Name:</strong> {Name}</p>
            <p><strong>School:</strong> {School}</p>
            <p><strong>Total Marks:</strong> {Total}</p>
            <p><strong>Goal:</strong> {goal}</p>
            <p><strong>Average Score:</strong> {averageScore.toFixed(2)}%</p>
        </div>
    );
}

export default CalculateScore;