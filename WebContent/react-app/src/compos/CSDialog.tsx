/*
 * @Author: Kanata You 
 * @Date: 2020-12-23 20:35:06 
 * @Last Modified by: Kanata You
 * @Last Modified time: 2020-12-24 21:32:39
 */

import React, { useLayoutEffect } from "react";
import { ButtonGroup } from "./ButtonGroup";
import { YouButton } from "./YouButton";
import { CSLog } from "./CustomerService";


export interface CSDialogProps {
    logs:   CSLog[];
    send:   (msg: string) => void;
    call:   (msg: string) => void;
};

export const CSDialog: React.FC<CSDialogProps> = props => {
    const textarea = React.useRef<HTMLTextAreaElement>() as React.RefObject<HTMLTextAreaElement>;

    const sendMsg = () => {
        if (textarea.current) {
            const value = textarea.current.value;
            if (value.length) {
                props.send(value);
                textarea.current.value = "";
            }
            textarea.current.focus();
        }
    };

    const logs = React.useRef() as React.RefObject<HTMLDivElement>;
    useLayoutEffect(() => {
        if (logs.current) {
            logs.current.scrollTop = logs.current.scrollHeight;
            const cs = logs.current.getElementsByClassName("cs");
            for (let i: number = 0; i < cs.length; i++) {
                const text = cs[i].innerHTML.split("\n");
                let target: string[] = [];
                text.forEach(e => {
                    if (/!\(.+\)/.test(e)) {
                        const check = /!\(.+\)/.exec(e)![0];
                        const link = "<span class='cslink' >"
                                + check.slice(2, check.length - 1)
                            + "</span>";
                        target.push(e.replace(check, link));
                    } else {
                        target.push(e);
                    }
                });
                cs[i].innerHTML = target.join("\n");
            }
            const links = logs.current.getElementsByClassName("cslink");
            for (let i: number = 0; i < links.length; i++) {
                const link = links[i];
                link.addEventListener("click", e => {
                    props.call((e.target as HTMLSpanElement).innerText);
                });
            }
        }
    });

    return (
        <div style={{
            display: "flex",
            flexDirection: "column",
            alignItems: "stretch",
            justifyContent: "center",
            width: "calc(30vw + 260px)",
            height: "520px",
            padding: "40px 40px 20px",
            backgroundColor: "rgb(250,250,250)",
            borderRadius: "10px",
            boxShadow: "6px 4px 5px rgba(0,0,0,0.2)"
        }} >
            <div key="logs" ref={ logs } style={{
                flex: 1,
                display: "flex",
                flexDirection: "column",
                alignItems: "stretch",
                justifyContent: "flex-start",
                backgroundColor: "rgb(240,240,240)",
                whiteSpace: "pre-wrap",
                marginBottom: "16px",
                padding: "0 16px",
                overflowY: "scroll"
            }} >
                {
                    props.logs.map((d, i) => {
                        return d.from === "cs" ? (
                            <div key={ i }
                            style={{
                                margin: "6px 0",
                                padding: "0.4em 0",
                                display: "flex",
                                alignItems: "flex-start",
                                justifyContent: "flex-start",
                                textAlign: "left"
                            }} >
                                <img src="/images/cs.png" alt="客服"
                                style={{
                                    width: "36px",
                                    height: "36px",
                                    borderRadius: "18px",
                                    border: "1px solid rgb(200,200,200)"
                                }} />
                                <div key="content" className="cs"
                                style={{
                                    backgroundColor: "rgb(255,255,255)",
                                    lineHeight: "1.2em",
                                    padding: "0.4em 0.8em",
                                    minWidth: "1em",
                                    maxWidth: "calc(30vw + 100px)",
                                    minHeight: "1.2em",
                                    wordBreak: "break-all",
                                    borderRadius: "0.8em",
                                    margin: "0 10px",
                                    boxShadow: "2px 3px 3px rgba(0,0,0,0.2)"
                                }} >
                                    { d.content }
                                </div>
                            </div>
                        ) : (
                            <div key={ i }
                            style={{
                                margin: "6px 0",
                                padding: "0.4em 0",
                                display: "flex",
                                flexDirection: "row-reverse",
                                alignItems: "flex-start",
                                justifyContent: "flex-start",
                                flexWrap: "wrap",
                                textAlign: "left"
                            }} >
                                <img src="/images/user.png" alt="我"
                                style={{
                                    width: "36px",
                                    height: "36px",
                                    borderRadius: "18px",
                                    border: "1px solid rgb(200,200,200)"
                                }} />
                                <div key="content"
                                style={{
                                    backgroundColor: "rgb(255,255,255)",
                                    lineHeight: "1.2em",
                                    padding: "0.4em 0.8em",
                                    minWidth: "1em",
                                    maxWidth: "calc(30vw + 100px)",
                                    minHeight: "1.2em",
                                    wordBreak: "break-all",
                                    borderRadius: "0.8em",
                                    margin: "0 10px",
                                    boxShadow: "2px 3px 3px rgba(0,0,0,0.2)"
                                }} >
                                    { d.content }
                                </div>
                            </div>
                        );
                    })
                }
            </div>
            <div key="inputarea" style={{
                display: "flex",
                flexDirection: "column",
                alignItems: "stretch",
                justifyContent: "center",
                backgroundColor: "rgb(240,240,240)",
                padding: "6px"
            }} >
                <textarea ref={ textarea } spellCheck="false" style={{
                    height: "84px",
                    background: "none",
                    border: "none",
                    resize: "none",
                    lineHeight: "1.3em",
                    fontFamily: 'ubuntu, "Yu Mincho", 游明朝, source-code-pro, Menlo, Monaco, '
                        + 'Consolas, "Courier New", monospace',
                    fontSize: "110%"
                }}
                onKeyDown={
                    e => {
                        if (e.key === "Enter") {
                            e.preventDefault();
                            sendMsg();
                        }
                    }
                } />
            </div>
            <ButtonGroup style={{
                marginTop: "12px",
                justifyContent: "flex-end"
            }} >
                <YouButton key="quit" onClick={ () => { window.history.go(-1); } }
                style={{
                    marginRight: "20px"
                }} >
                    返回
                </YouButton>
                <YouButton key="send" onClick={ sendMsg } >
                    发送
                </YouButton>
            </ButtonGroup>
        </div>
    );
};
