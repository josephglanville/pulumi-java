// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class QuickConnectQuickConnectConfigQueueConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigQueueConfigGetArgs Empty = new QuickConnectQuickConnectConfigQueueConfigGetArgs();

    /**
     * Specifies the identifier of the contact flow.
     * 
     */
    @Import(name="contactFlowId", required=true)
      private final Output<String> contactFlowId;

    public Output<String> getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * Specifies the identifier for the queue.
     * 
     */
    @Import(name="queueId", required=true)
      private final Output<String> queueId;

    public Output<String> getQueueId() {
        return this.queueId;
    }

    public QuickConnectQuickConnectConfigQueueConfigGetArgs(
        Output<String> contactFlowId,
        Output<String> queueId) {
        this.contactFlowId = Objects.requireNonNull(contactFlowId, "expected parameter 'contactFlowId' to be non-null");
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
    }

    private QuickConnectQuickConnectConfigQueueConfigGetArgs() {
        this.contactFlowId = Output.empty();
        this.queueId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigQueueConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contactFlowId;
        private Output<String> queueId;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigQueueConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.queueId = defaults.queueId;
        }

        public Builder contactFlowId(Output<String> contactFlowId) {
            this.contactFlowId = Objects.requireNonNull(contactFlowId);
            return this;
        }
        public Builder contactFlowId(String contactFlowId) {
            this.contactFlowId = Output.of(Objects.requireNonNull(contactFlowId));
            return this;
        }
        public Builder queueId(Output<String> queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public Builder queueId(String queueId) {
            this.queueId = Output.of(Objects.requireNonNull(queueId));
            return this;
        }        public QuickConnectQuickConnectConfigQueueConfigGetArgs build() {
            return new QuickConnectQuickConnectConfigQueueConfigGetArgs(contactFlowId, queueId);
        }
    }
}
