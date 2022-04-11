// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorOrganizationAggregationSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorOrganizationAggregationSourceArgs Empty = new ConfigurationAggregatorOrganizationAggregationSourceArgs();

    @Import(name="allAwsRegions")
      private final @Nullable Output<Boolean> allAwsRegions;

    public Output<Boolean> getAllAwsRegions() {
        return this.allAwsRegions == null ? Codegen.empty() : this.allAwsRegions;
    }

    @Import(name="awsRegions")
      private final @Nullable Output<List<String>> awsRegions;

    public Output<List<String>> getAwsRegions() {
        return this.awsRegions == null ? Codegen.empty() : this.awsRegions;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public ConfigurationAggregatorOrganizationAggregationSourceArgs(
        @Nullable Output<Boolean> allAwsRegions,
        @Nullable Output<List<String>> awsRegions,
        Output<String> roleArn) {
        this.allAwsRegions = allAwsRegions;
        this.awsRegions = awsRegions;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ConfigurationAggregatorOrganizationAggregationSourceArgs() {
        this.allAwsRegions = Codegen.empty();
        this.awsRegions = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorOrganizationAggregationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allAwsRegions;
        private @Nullable Output<List<String>> awsRegions;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorOrganizationAggregationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAwsRegions = defaults.allAwsRegions;
    	      this.awsRegions = defaults.awsRegions;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder allAwsRegions(@Nullable Output<Boolean> allAwsRegions) {
            this.allAwsRegions = allAwsRegions;
            return this;
        }
        public Builder allAwsRegions(@Nullable Boolean allAwsRegions) {
            this.allAwsRegions = Codegen.ofNullable(allAwsRegions);
            return this;
        }
        public Builder awsRegions(@Nullable Output<List<String>> awsRegions) {
            this.awsRegions = awsRegions;
            return this;
        }
        public Builder awsRegions(@Nullable List<String> awsRegions) {
            this.awsRegions = Codegen.ofNullable(awsRegions);
            return this;
        }
        public Builder awsRegions(String... awsRegions) {
            return awsRegions(List.of(awsRegions));
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public ConfigurationAggregatorOrganizationAggregationSourceArgs build() {
            return new ConfigurationAggregatorOrganizationAggregationSourceArgs(allAwsRegions, awsRegions, roleArn);
        }
    }
}
