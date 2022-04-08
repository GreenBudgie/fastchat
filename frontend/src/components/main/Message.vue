<template>
  <div>{{ props.text }}</div>
</template>

<script lang="ts" setup>
  const props = defineProps<{id: number, text: string}>();
</script>

<style scoped>
div {
  padding-top: 1em;
  font-size: 24px;
}
</style>