import SockJS from "sockjs-client";
import {CompatClient, IMessage, Stomp} from "@stomp/stompjs";
import {store} from "@/store";

let stompClient: CompatClient | null = null;

export function connect() {
    const socket = new SockJS('/socket-connection');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, (frame: any) => {
        console.log('Connected: ' + frame);

        stompClient!.subscribe('/topic/messages', (message: IMessage) => {
            receiveMessage(message);
        });

    });
}

export function disconnect() {
    if(stompClient !== null) {
        stompClient.disconnect();
    }
    console.log("Disconnected");
}

export function sendMessage(message: string) {
    stompClient!.send("/socket/receiveMessage", {}, message);
}

function receiveMessage(message: IMessage) {
    const text = message.body;
    store.commit("addMessage", text);
}