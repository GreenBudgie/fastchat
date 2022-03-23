<template>
  <button type="submit" @click="greet">
    {{msg}}
  </button>
  <h1 ref="greeting">There will be a message from backend!</h1>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";

@Options({
  props: {
    msg: String,
  },
})

export default class HelloWorld extends Vue {
  msg!: string;

  $refs!: {
    greeting: HTMLElement;
  }

  mounted() {
    alert("Mounted!");
  }

  public async greet() {
    let greeting = await (await fetch("/api/greet")).text();
    this.$refs.greeting.innerText = greeting;
  }
}
</script>

<style scoped>
button {
  background-color: #8697ff;
  border: none;
  outline: none;
  padding: 2em;
  font-size: 24px;
}
</style>
