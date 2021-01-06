/*
 * @Author: Kanata You 
 * @Date: 2020-12-06 16:48:21 
 * @Last Modified by: Kanata You
 * @Last Modified time: 2020-12-23 20:39:42
 */

import React from "react";


type NativeListener<T extends HTMLElement, E extends keyof (
    Required<
        React.DetailedHTMLProps<React.HTMLAttributes<T>, T>
    >
)> = Pick<Required<
    React.DetailedHTMLProps<React.HTMLAttributes<T>, T>
>, E>[E];

type DivClickListener = NativeListener<HTMLDivElement, "onClick">;

export interface YouButtonProps {
    children: string;
    style?: React.CSSProperties;
    onClick: DivClickListener;
};

export const YouButton: React.FC<YouButtonProps> = props => (
    <div className="YouButton" style={{ ...props.style }} onClick={ props.onClick }
    tabIndex={ 1 } >
        { props.children }
    </div>
);
