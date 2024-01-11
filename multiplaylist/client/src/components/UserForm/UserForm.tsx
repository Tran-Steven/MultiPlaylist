import React from "react";

export default function UserForm(
  { name }: { name: string },
  { redirect }: { redirect: string }
) {
  return (
    <div>
      <h1>{name}</h1>
      <form>
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
