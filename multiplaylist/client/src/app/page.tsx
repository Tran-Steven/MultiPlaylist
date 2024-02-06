"use client"

import { useState } from "react"
import UserForm from "../components/UserForm/UserForm"

export default function Landing() {
  const [hasAccount, setHasAccount] = useState(false)
  return (
    <div>
      <main>
        <UserForm
          name={hasAccount ? "Login" : "Register"}
          redirect={
            hasAccount
              ? "Don’t have an account? Register here."
              : "Have an account? Sign in here."
          }
        />
        <div />
      </main>
    </div>
  )
}
