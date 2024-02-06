import React, {useState}  from "react";
import "./App.css";
import UserForm from "../../components/UserForm/UserForm.tsx";
function App() {
const [hasAccount, setHasAccount] = useState(false);
  return (
    <div>
      <main>
      {hasAccount ? (
      <UserForm
      name={"Login"}
      redirect={"Don’t have an account? Register here."}
      />
      ) : (
      <UserForm
      name={"Register"}
      redirect={"Have an account? Sign in here."}
      />
      )}

      <div/>
      </main>
    </div>
  );
}

export default App;
