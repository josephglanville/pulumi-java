// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MySqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetAzureDbForMySqlTaskInputResponse {
    private final MySqlConnectionInfoResponse sourceConnectionInfo;
    private final MySqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"sourceConnectionInfo","targetConnectionInfo"})
    private ConnectToTargetAzureDbForMySqlTaskInputResponse(
        MySqlConnectionInfoResponse sourceConnectionInfo,
        MySqlConnectionInfoResponse targetConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    public MySqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    public MySqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MySqlConnectionInfoResponse sourceConnectionInfo;
        private MySqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSourceConnectionInfo(MySqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(MySqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public ConnectToTargetAzureDbForMySqlTaskInputResponse build() {
            return new ConnectToTargetAzureDbForMySqlTaskInputResponse(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
