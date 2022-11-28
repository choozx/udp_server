package com.udp.udp_server.domain;

import io.netty.channel.Channel;
import lombok.*;

@Getter
@Setter
@Builder
public class User {

    private String nickName;
    private Channel channel;
}
