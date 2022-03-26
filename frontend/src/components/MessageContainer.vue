<template>
  <div>
    <div v-for="message in messages" :key="message.id">

    </div>
  </div>
</template>

<script lang="ts" setup>
  import {IMessage} from "@/components/Message.vue";
  import {reactive} from "vue";

  const messages: IMessage[] = reactive([
    {id: 1, text: "Message #1"},
    {id: 2, text: "Message #2"}
  ]);

</script>

<style>

</style>