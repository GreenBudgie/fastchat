<template>
  <div>
    <div v-for="message in messages" :key="message.id">
      <Message :id="message.id" :text="message.text"/>
    </div>
  </div>
</template>

<script lang="ts" setup>
  import Message from "@/components/main/Message.vue";
  import {computed} from "vue";
  import {IMessage, store} from "@/store";

  const messages = computed<IMessage[]>(() => store.state.messages);

</script>

<style>

</style>