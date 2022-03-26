<template>
  <div>{{ props.text }}</div>
</template>

<script lang="ts" setup>

  export interface IMessage {
    id: number;
    text: string;
  }

  const props = defineProps<IMessage>();

</script>

<style scoped>
div {
  padding-top: 1em;
  font-size: 24px;
}
</style>