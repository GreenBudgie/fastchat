<template>
  <input type="text" name="message" @keydown="onInputKeyPress">
</template>

<script lang="ts" setup>
  function onInputKeyPress(event: KeyboardEvent): void {
    if(event.key == "Enter") {
      const input: HTMLInputElement = event.target as HTMLInputElement;
      const inputValue = input.value.trim();
      if(inputValue.length > 0) addMessage(inputValue);
    }
  }

  function addMessage(text: string) {

  }
</script>

<style scoped>
input {
  background-color: #cbcbcb;
  border: none;
  outline: none;
  padding: 0.5em;
  font-size: 24px;
}
</style>
