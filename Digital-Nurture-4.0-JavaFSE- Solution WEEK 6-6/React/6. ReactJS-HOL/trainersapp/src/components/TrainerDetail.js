import React from 'react';
import { useParams } from 'react-router-dom';
import { trainers } from '../data/TrainersMock';

const TrainerDetail = () => {
    const { id } = useParams();
    const trainer = trainers.find(t => t.TrainerId === parseInt(id));

    if (!trainer) {
        return <div>Trainer not found</div>;
    }

    return (
        <div className="trainer-detail">
            <h2>Trainer Details</h2>
            <div className="trainer-info">
                <p><strong>ID:</strong> {trainer.TrainerId}</p>
                <p><strong>Name:</strong> {trainer.Name}</p>
                <p><strong>Email:</strong> {trainer.Email}</p>
                <p><strong>Phone:</strong> {trainer.Phone}</p>
                <p><strong>Technology:</strong> {trainer.Technology}</p>
                <p><strong>Skills:</strong> {trainer.Skills.join(', ')}</p>
            </div>
        </div>
    );
};

export default TrainerDetail;