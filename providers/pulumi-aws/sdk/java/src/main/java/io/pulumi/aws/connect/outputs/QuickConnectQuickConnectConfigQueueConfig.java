// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QuickConnectQuickConnectConfigQueueConfig {
    /**
     * Specifies the identifier of the contact flow.
     * 
     */
    private final String contactFlowId;
    /**
     * Specifies the identifier for the queue.
     * 
     */
    private final String queueId;

    @OutputCustomType.Constructor
    private QuickConnectQuickConnectConfigQueueConfig(
        @OutputCustomType.Parameter("contactFlowId") String contactFlowId,
        @OutputCustomType.Parameter("queueId") String queueId) {
        this.contactFlowId = contactFlowId;
        this.queueId = queueId;
    }

    /**
     * Specifies the identifier of the contact flow.
     * 
    */
    public String getContactFlowId() {
        return this.contactFlowId;
    }
    /**
     * Specifies the identifier for the queue.
     * 
    */
    public String getQueueId() {
        return this.queueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigQueueConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactFlowId;
        private String queueId;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigQueueConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.queueId = defaults.queueId;
        }

        public Builder setContactFlowId(String contactFlowId) {
            this.contactFlowId = Objects.requireNonNull(contactFlowId);
            return this;
        }

        public Builder setQueueId(String queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public QuickConnectQuickConnectConfigQueueConfig build() {
            return new QuickConnectQuickConnectConfigQueueConfig(contactFlowId, queueId);
        }
    }
}
