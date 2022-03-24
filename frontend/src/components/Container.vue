<template>
  <input type="text" name="message" @keydown="onInputKeyPress">
  <div id="message-container">
  </div>
</template>

<script lang="ts">
import {Options, Vue} from "vue-class-component";
import Message from "@/components/Message.vue";
import { createVNode, render } from "vue";

@Options({
  components: {
    Message
  }
})

export default class Container extends Vue {

  private onInputKeyPress(event: KeyboardEvent): void {
    if(event.key == "Enter") {
      const input: HTMLInputElement = event.target as HTMLInputElement;
      const inputValue = input.value.trim();
      if(inputValue.length > 0) this.addMessage(inputValue);
    }
  }

  private addMessage(text: string) {
    const node = createVNode(Message);
    render(node, this.$el);
    //TODO CHECK V-FOR
  }

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
