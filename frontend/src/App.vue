<template>
  <MessageInput/>
  <MessageContainer/>
</template>

<script lang="ts" setup>
import MessageInput from "@/components/MessageInput.vue";
import MessageContainer from "@/components/MessageContainer.vue";
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
