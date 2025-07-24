import React from 'react';
import styles from '../styles/CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
    const { name, startDate, endDate, participants, status } = cohort;
    
    return (
        <div className={styles.box}>
            <h3 style={{ color: status === 'ongoing' ? 'green' : 'blue' }}>
                {name}
            </h3>
            <dl>
                <dt>Start Date:</dt>
                <dd>{startDate}</dd>
                
                <dt>End Date:</dt>
                <dd>{endDate}</dd>
                
                <dt>Participants:</dt>
                <dd>{participants}</dd>
                
                <dt>Status:</dt>
                <dd>{status}</dd>
            </dl>
        </div>
    );
};

export default CohortDetails;