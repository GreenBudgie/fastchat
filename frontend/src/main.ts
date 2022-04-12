import { createApp } from "vue";
import App from "./App.vue";
import { store } from "@/store";
import { socketConnect } from "@/util/socket";
import { router } from "@/router";

socketConnect();

const app = createApp(App);
app.use(store);
app.use(router);
app.mount("#app");
