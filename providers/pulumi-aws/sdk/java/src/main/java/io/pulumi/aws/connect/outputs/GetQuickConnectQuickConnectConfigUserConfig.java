// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQuickConnectQuickConnectConfigUserConfig {
    /**
     * Specifies the identifier of the contact flow.
     * 
     */
    private final String contactFlowId;
    /**
     * Specifies the identifier for the user.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetQuickConnectQuickConnectConfigUserConfig(
        @CustomType.Parameter("contactFlowId") String contactFlowId,
        @CustomType.Parameter("userId") String userId) {
        this.contactFlowId = contactFlowId;
        this.userId = userId;
    }

    /**
     * Specifies the identifier of the contact flow.
     * 
    */
    public String getContactFlowId() {
        return this.contactFlowId;
    }
    /**
     * Specifies the identifier for the user.
     * 
    */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectQuickConnectConfigUserConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactFlowId;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectQuickConnectConfigUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.userId = defaults.userId;
        }

        public Builder contactFlowId(String contactFlowId) {
            this.contactFlowId = Objects.requireNonNull(contactFlowId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetQuickConnectQuickConnectConfigUserConfig build() {
            return new GetQuickConnectQuickConnectConfigUserConfig(contactFlowId, userId);
        }
    }
}
