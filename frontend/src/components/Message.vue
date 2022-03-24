<template>
  <div>{{ text }}</div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";

@Options({
  props: {
    text: String
  }
})

export default class Message extends Vue {
  text = "WOW";


}
</script>

<style scoped>
div {
  padding-top: 1em;
  font-size: 24px;
}
</style>