import React from 'react';
import CohortDetails from './components/CohortDetails';
import './App.css';

function App() {
  const cohorts = [
    {
      id: 1,
      name: 'Frontend Development',
      startDate: '2023-01-15',
      endDate: '2023-04-15',
      participants: 25,
      status: 'completed'
    },
    {
      id: 2,
      name: 'Backend Development',
      startDate: '2023-05-10',
      endDate: '2023-08-10',
      participants: 18,
      status: 'completed'
    },
    {
      id: 3,
      name: 'Full Stack Development',
      startDate: '2023-09-01',
      endDate: '2023-12-15',
      participants: 30,
      status: 'ongoing'
    }
  ];

  return (
    <div className="App">
      <h1>Cognizant Academy Dashboard</h1>
      <h2>Cohort Details</h2>
      <div className="cohorts-container">
        {cohorts.map(cohort => (
          <CohortDetails key={cohort.id} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;