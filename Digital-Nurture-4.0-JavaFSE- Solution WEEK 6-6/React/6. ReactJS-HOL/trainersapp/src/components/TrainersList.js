import React from 'react';
import { Link } from 'react-router-dom';
import { trainers } from '../data/TrainersMock';

const TrainersList = () => {
    return (
        <div className="trainers-list">
            <h2>Our Trainers</h2>
            <ul>
                {trainers.map(trainer => (
                    <li key={trainer.TrainerId}>
                        <Link to={`/trainers/${trainer.TrainerId}`}>
                            {trainer.Name} - {trainer.Technology}
                        </Link>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default TrainersList;