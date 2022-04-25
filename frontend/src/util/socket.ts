import SockJS from "sockjs-client";
import {Client, IFrame, IMessage} from "@stomp/stompjs";
import {store} from "@/store";

const prefixAPI = (url: string) => `/api/socket/${url}`;
let stompClient: Client | null = null;

export function socketConnect() {
    stompClient = new Client({
        webSocketFactory: () => new SockJS(prefixAPI("connect"))
    });

    stompClient.onConnect = (receipt: IFrame) => {

        stompClient!.subscribe(prefixAPI("topic/messages"), (message: IMessage) => {
            receiveMessage(message);
        });

    };

    stompClient.activate();
}

export function socketDisconnect() {
    stompClient?.deactivate();
}

export function sendMessage(message: string) {
    stompClient!.publish({
        destination: prefixAPI("destination/messages"),
        body: message
    });
}

function receiveMessage(message: IMessage) {
    const text = message.body;
    store.commit("addMessage", text);
}