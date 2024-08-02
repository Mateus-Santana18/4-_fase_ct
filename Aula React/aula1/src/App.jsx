import './App.css'
import Conteudo from './components/Conteudo'
import Header from './components/Header'


function App() {

  function pressButton(){
    alert("Hello Alert!")
  }
  return (
    <div className='app-container'>

      <Header />
      <Conteudo />
      <Conteudo />
      <Conteudo />
      <button onClick={pressButton}>Press for free</button>
    </div>
  )

}

export default App
