import React, { FormEvent } from "react";

type Props = {
  name: string;
  redirect: string;
};

export default function UserForm({ name, redirect }: Readonly<Props>) {
  async function onSubmit(event: FormEvent<HTMLFormElement>) {
    event.preventDefault();
    const formData = new FormData(event.currentTarget);
    const response = await fetch("/register", {
      method: "POST",
    });
  }
  return (
    <div>
      <h1>{name}</h1>
      <form onSubmit={onSubmit}>
        <label htmlFor={"email"}>Email</label>
        <input id="email" />
        <label htmlFor={"password"}>Password</label>
        <input id="password" />
        <input type="submit">{name}</input>
      </form>
      <p>{redirect}</p>
    </div>
  );
}
