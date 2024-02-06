"use client";

import { useState } from "react";
import UserForm from "../components/UserForm/UserForm";
import Image from "next/image";

export default function Landing() {
  const [hasAccount, setHasAccount] = useState(false);
  return (
    <div>
      <main className="flex flex-row">
        <UserForm
          name={hasAccount ? "Login" : "Register"}
          redirect={
            hasAccount
              ? "Don’t have an account? Register here."
              : "Have an account? Sign in here."
          }
        />
        <div className="flex justify-center w-full h-full content-center">
          <h1>
            Mix and match your favorite videos from different websites into one
            playlist
          </h1>
        </div>
      </main>
    </div>
  );
}
