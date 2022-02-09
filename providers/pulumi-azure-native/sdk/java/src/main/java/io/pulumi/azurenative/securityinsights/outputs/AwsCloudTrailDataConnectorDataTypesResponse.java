// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.AwsCloudTrailDataConnectorDataTypesResponseLogs;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AwsCloudTrailDataConnectorDataTypesResponse {
    private final @Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs;

    @OutputCustomType.Constructor({"logs"})
    private AwsCloudTrailDataConnectorDataTypesResponse(@Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs) {
        this.logs = logs;
    }

    public Optional<AwsCloudTrailDataConnectorDataTypesResponseLogs> getLogs() {
        return Optional.ofNullable(this.logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCloudTrailDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsCloudTrailDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
        }

        public Builder setLogs(@Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs) {
            this.logs = logs;
            return this;
        }

        public AwsCloudTrailDataConnectorDataTypesResponse build() {
            return new AwsCloudTrailDataConnectorDataTypesResponse(logs);
        }
    }
}
