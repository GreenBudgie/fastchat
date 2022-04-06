import { createApp } from "vue";
import App from "./App.vue";
import { store } from "@/store";
import {connect, disconnect} from "@/util/socket";

connect();

const app = createApp(App);
app.use(store);
app.mount("#app");
