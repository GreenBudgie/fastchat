<template>
  <Container/>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";
import Container from "@/components/Container.vue";

@Options({
  components: {
    Container
  },
})
export default class App extends Vue {}
</script>

<style>
* {
  padding: 0;
  margin: 0;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 40px;
}
</style>
