<template>
  <div class="wrapper">
    <h1>Register</h1>
    <form>
      <input type="text" name="username" placeholder="Username">
      <input type="text" name="email" placeholder="E-Mail">
      <input type="password" name="password" placeholder="Password">
      <input type="submit" value="Create Account">
    </form>
  </div>
</template>

<script lang="ts" setup>
  
</script>

<style scoped>
  .wrapper {
    background-color: #f8f8f8;
    border-radius: 10px;
    margin: 40px auto 0 auto;
    padding: 1em;
    width: 40%;
    min-width: 250px;
    max-width: 600px;
    text-align: center;
  }

  h1 {
    font-size: 30px;
  }

  input {
    display: block;
    margin-top: 20px;
    font-size: 18px;
    width: 100%;
    border-radius: 8px;
    height: 2.2em;
  }

  input[type="text"] {

  }

  input[type="submit"] {
    padding: 0;
    font-size: 25px;
    width: 80%;
    margin-left: auto;
    margin-right: auto;
    cursor: pointer;
    border-radius: 12px;
  }
</style>