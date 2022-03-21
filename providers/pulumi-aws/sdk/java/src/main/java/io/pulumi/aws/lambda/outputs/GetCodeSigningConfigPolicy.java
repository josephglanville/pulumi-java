// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCodeSigningConfigPolicy {
    /**
     * Code signing configuration policy for deployment validation failure.
     * 
     */
    private final String untrustedArtifactOnDeployment;

    @CustomType.Constructor
    private GetCodeSigningConfigPolicy(@CustomType.Parameter("untrustedArtifactOnDeployment") String untrustedArtifactOnDeployment) {
        this.untrustedArtifactOnDeployment = untrustedArtifactOnDeployment;
    }

    /**
     * Code signing configuration policy for deployment validation failure.
     * 
    */
    public String getUntrustedArtifactOnDeployment() {
        return this.untrustedArtifactOnDeployment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCodeSigningConfigPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String untrustedArtifactOnDeployment;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCodeSigningConfigPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.untrustedArtifactOnDeployment = defaults.untrustedArtifactOnDeployment;
        }

        public Builder untrustedArtifactOnDeployment(String untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment);
            return this;
        }        public GetCodeSigningConfigPolicy build() {
            return new GetCodeSigningConfigPolicy(untrustedArtifactOnDeployment);
        }
    }
}
