import {createStore} from "vuex";

export interface IMessage {
    id: number;
    text: string;
}

export type State = { messages: IMessage[] };

const state: State = { messages: []};

export const store = createStore({
    state,
    getters: {
        getMaxId(state: State): number {
            if(state.messages.length == 0) return 0;
            return state.messages.map(message => message.id).sort()[state.messages.length - 1];
        }
    },
    mutations: {
        addMessage(state: State, text: string): void {
            state.messages.push({id: store.getters.getMaxId, text});
        }
    }
});
