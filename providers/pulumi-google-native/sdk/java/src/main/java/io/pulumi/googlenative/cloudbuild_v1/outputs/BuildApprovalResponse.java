// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.ApprovalConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.ApprovalResultResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildApprovalResponse {
    /**
     * Configuration for manual approval of this build.
     * 
     */
    private final ApprovalConfigResponse config;
    /**
     * Result of manual approval for this Build.
     * 
     */
    private final ApprovalResultResponse result;
    /**
     * The state of this build's approval.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private BuildApprovalResponse(
        @CustomType.Parameter("config") ApprovalConfigResponse config,
        @CustomType.Parameter("result") ApprovalResultResponse result,
        @CustomType.Parameter("state") String state) {
        this.config = config;
        this.result = result;
        this.state = state;
    }

    /**
     * Configuration for manual approval of this build.
     * 
    */
    public ApprovalConfigResponse getConfig() {
        return this.config;
    }
    /**
     * Result of manual approval for this Build.
     * 
    */
    public ApprovalResultResponse getResult() {
        return this.result;
    }
    /**
     * The state of this build's approval.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildApprovalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApprovalConfigResponse config;
        private ApprovalResultResponse result;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildApprovalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.result = defaults.result;
    	      this.state = defaults.state;
        }

        public Builder config(ApprovalConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder result(ApprovalResultResponse result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public BuildApprovalResponse build() {
            return new BuildApprovalResponse(config, result, state);
        }
    }
}
