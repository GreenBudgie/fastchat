import SockJS from "sockjs-client";
import {Client, IFrame, IMessage} from "@stomp/stompjs";
import {store} from "@/store";

let stompClient: Client | null = null;

export function socketConnect() {
    stompClient = new Client({
        webSocketFactory: () => new SockJS('/socket-connection')
    });

    stompClient.onConnect = (receipt: IFrame) => {

        stompClient!.subscribe('/topic/messages', (message: IMessage) => {
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
        destination: "/socket/receiveMessage",
        body: message
    });
}

function receiveMessage(message: IMessage) {
    const text = message.body;
    store.commit("addMessage", text);
}