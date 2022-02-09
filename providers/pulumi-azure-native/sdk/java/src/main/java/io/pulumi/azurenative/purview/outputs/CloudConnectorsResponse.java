// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudConnectorsResponse {
    private final String awsExternalId;

    @OutputCustomType.Constructor({"awsExternalId"})
    private CloudConnectorsResponse(String awsExternalId) {
        this.awsExternalId = Objects.requireNonNull(awsExternalId);
    }

    public String getAwsExternalId() {
        return this.awsExternalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudConnectorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsExternalId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudConnectorsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsExternalId = defaults.awsExternalId;
        }

        public Builder setAwsExternalId(String awsExternalId) {
            this.awsExternalId = Objects.requireNonNull(awsExternalId);
            return this;
        }

        public CloudConnectorsResponse build() {
            return new CloudConnectorsResponse(awsExternalId);
        }
    }
}
