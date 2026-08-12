import './App.css';
import Note from './components/notes';
import Addnote from './components/add-note/add_note';
import { useState } from 'react';

function App() {
  const [notes,setNotes] = useState
  return (
    <div className="App">
      <h2>Notes App</h2>
      
      {/* 1. Component to add notes */}
      <Addnote />
      
      {/* 2. Display existing note */}
      <div>
        <Note priority="high" text="this is test notes" />
      </div>
    </div>
  );
}

export default App;