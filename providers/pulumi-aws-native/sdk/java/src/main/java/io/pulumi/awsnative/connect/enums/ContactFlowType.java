// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ContactFlowType {
        ContactFlow("CONTACT_FLOW"),
        CustomerQueue("CUSTOMER_QUEUE"),
        CustomerHold("CUSTOMER_HOLD"),
        CustomerWhisper("CUSTOMER_WHISPER"),
        AgentHold("AGENT_HOLD"),
        AgentWhisper("AGENT_WHISPER"),
        OutboundWhisper("OUTBOUND_WHISPER"),
        AgentTransfer("AGENT_TRANSFER"),
        QueueTransfer("QUEUE_TRANSFER");

        private final String value;

        ContactFlowType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContactFlowType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }