// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleSigV4Authorization extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleSigV4Authorization Empty = new TopicRuleSigV4Authorization();

    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    @Import(name="signingRegion", required=true)
      private final String signingRegion;

    public String getSigningRegion() {
        return this.signingRegion;
    }

    public TopicRuleSigV4Authorization(
        String roleArn,
        String serviceName,
        String signingRegion) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.signingRegion = Objects.requireNonNull(signingRegion, "expected parameter 'signingRegion' to be non-null");
    }

    private TopicRuleSigV4Authorization() {
        this.roleArn = null;
        this.serviceName = null;
        this.signingRegion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSigV4Authorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private String serviceName;
        private String signingRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSigV4Authorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.serviceName = defaults.serviceName;
    	      this.signingRegion = defaults.signingRegion;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder signingRegion(String signingRegion) {
            this.signingRegion = Objects.requireNonNull(signingRegion);
            return this;
        }        public TopicRuleSigV4Authorization build() {
            return new TopicRuleSigV4Authorization(roleArn, serviceName, signingRegion);
        }
    }
}
