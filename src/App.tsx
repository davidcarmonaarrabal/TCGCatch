// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <>
//       <div>
//         <a href="https://vite.dev" target="_blank">
//           <img src={viteLogo} className="logo" alt="Vite logo" />
//         </a>
//         <a href="https://react.dev" target="_blank">
//           <img src={reactLogo} className="logo react" alt="React logo" />
//         </a>
//       </div>
//       <h1>Vite + React</h1>
//       <div className="card">
//         <button onClick={() => setCount((count) => count + 1)}>
//           count is {count}
//         </button>
//         <p>
//           Edit <code>src/App.tsx</code> and save to test HMR
//         </p>
//       </div>
//       <p className="read-the-docs">
//         Click on the Vite and React logos to learn more
//       </p>
//     </>
//   )
// }

// export default App

import React, { useEffect, useState } from 'react';
import api from './api';

type Card = {
  id: number;
  name: string;
  type: string;
  era: string;
  cardSet: string;
  number: number;
  price: number;
};

const App: React.FC = () => {
  const [cards, setCards] = useState<Card[]>([]);

  useEffect(() => {
    api.get<Card[]>('')
      .then((response) => {
        setCards(response.data);
        console.log('Cartas obtenidas:', response.data);
      })
      .catch((error) => {
        console.error('Hubo un error al obtener las cartas:', error);
      });
  }, []);

  return (
    <div>
      <h1>Cartas TCG</h1>
      <h2>Listado de cartas:</h2>
      <ul>
        {cards.map((card) => (
          <li key={card.id}>
            {card.name} - {card.type} - ${card.price}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default App;
