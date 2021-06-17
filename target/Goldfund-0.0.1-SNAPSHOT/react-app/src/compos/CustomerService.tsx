/*
 * @Author: Kanata You 
 * @Date: 2020-12-23 19:42:00 
 * @Last Modified by: Kanata You
 * @Last Modified time: 2020-12-24 21:27:49
 */

import React from "react";
import { CSDialog } from "./CSDialog";
import { WelcomeLog, answers } from "./CSAI";


export type CSLog = {
    from:       "user" | "cs";
    content:    string;
};

export type CustomerServiceState = {
    logs:       CSLog[];
};

export const CustomerService: React.FC = () => {
    const [state, setState] = React.useState<CustomerServiceState>({
        logs: [{
            from: "cs",
            content: WelcomeLog()
        }]
    });

    const pushMsg = (msg: string) => {
        const curState = state.logs.concat([{
            from: "user",
            content: msg
        }]);
        setState({
            logs: curState
        });
        setTimeout(() => {
            setState({
                logs: curState.concat([{
                    from: "cs",
                    content: (answers as any)[msg] || "对不起，无法回答您的问题，请咨询网站管理员。"
                }])
            });
        }, Math.random() * 1000 + 400);
    };

    const call = (msg: string) => {
        const curState = state.logs.concat([{
            from: "user",
            content: msg
        }]);
        setState({
            logs: curState
        });
        setTimeout(() => {
            setState({
                logs: curState.concat([{
                    from: "cs",
                    content: (answers as any)[msg] || "对不起，无法回答您的问题，请咨询网站管理员。"
                }])
            });
        }, Math.random() * 1000 + 400);
    };

    return (
        <CSDialog logs={ state.logs } send={ pushMsg } call={ call } />
    );
};
