// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Call-specific metadata.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse();

    /**
     * The audio channel that contains the agent.
     * 
     */
    @Import(name="agentChannel", required=true)
      private final Integer agentChannel;

    public Integer getAgentChannel() {
        return this.agentChannel;
    }

    /**
     * The audio channel that contains the customer.
     * 
     */
    @Import(name="customerChannel", required=true)
      private final Integer customerChannel;

    public Integer getCustomerChannel() {
        return this.customerChannel;
    }

    public GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse(
        Integer agentChannel,
        Integer customerChannel) {
        this.agentChannel = Objects.requireNonNull(agentChannel, "expected parameter 'agentChannel' to be non-null");
        this.customerChannel = Objects.requireNonNull(customerChannel, "expected parameter 'customerChannel' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse() {
        this.agentChannel = null;
        this.customerChannel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer agentChannel;
        private Integer customerChannel;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentChannel = defaults.agentChannel;
    	      this.customerChannel = defaults.customerChannel;
        }

        public Builder agentChannel(Integer agentChannel) {
            this.agentChannel = Objects.requireNonNull(agentChannel);
            return this;
        }
        public Builder customerChannel(Integer customerChannel) {
            this.customerChannel = Objects.requireNonNull(customerChannel);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationCallMetadataResponse(agentChannel, customerChannel);
        }
    }
}
