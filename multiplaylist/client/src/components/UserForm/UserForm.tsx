import React, { FormEvent } from "react";
import Image from "next/image";
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
    <div className="grid place-content-center w-full h-full">
      <h1 className="text-center">{name}</h1>
      <form onSubmit={onSubmit} className="flex flex-col">
        <label htmlFor={"email"}>Email</label>
        <input id="email" />
        <label htmlFor={"password"}>Password</label>
        <input id="password" />
        <input type="submit" />
      </form>
      <p>{redirect}</p>
    </div>
  );
}
