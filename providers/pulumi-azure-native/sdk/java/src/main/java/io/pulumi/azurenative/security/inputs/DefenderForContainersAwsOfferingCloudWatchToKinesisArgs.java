// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cloudwatch to kinesis connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingCloudWatchToKinesisArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderForContainersAwsOfferingCloudWatchToKinesisArgs Empty = new DefenderForContainersAwsOfferingCloudWatchToKinesisArgs();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @InputImport(name="cloudRoleArn")
      private final @Nullable Input<String> cloudRoleArn;

    public Input<String> getCloudRoleArn() {
        return this.cloudRoleArn == null ? Input.empty() : this.cloudRoleArn;
    }

    public DefenderForContainersAwsOfferingCloudWatchToKinesisArgs(@Nullable Input<String> cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    private DefenderForContainersAwsOfferingCloudWatchToKinesisArgs() {
        this.cloudRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingCloudWatchToKinesisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingCloudWatchToKinesisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder setCloudRoleArn(@Nullable Input<String> cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }

        public Builder setCloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = Input.ofNullable(cloudRoleArn);
            return this;
        }
        public DefenderForContainersAwsOfferingCloudWatchToKinesisArgs build() {
            return new DefenderForContainersAwsOfferingCloudWatchToKinesisArgs(cloudRoleArn);
        }
    }
}
