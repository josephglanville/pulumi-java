// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppPhysicalResourceIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppPhysicalResourceIdArgs Empty = new AppPhysicalResourceIdArgs();

    @Import(name="awsAccountId")
      private final @Nullable Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId == null ? Codegen.empty() : this.awsAccountId;
    }

    @Import(name="awsRegion")
      private final @Nullable Output<String> awsRegion;

    public Output<String> getAwsRegion() {
        return this.awsRegion == null ? Codegen.empty() : this.awsRegion;
    }

    @Import(name="identifier", required=true)
      private final Output<String> identifier;

    public Output<String> getIdentifier() {
        return this.identifier;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AppPhysicalResourceIdArgs(
        @Nullable Output<String> awsAccountId,
        @Nullable Output<String> awsRegion,
        Output<String> identifier,
        Output<String> type) {
        this.awsAccountId = awsAccountId;
        this.awsRegion = awsRegion;
        this.identifier = Objects.requireNonNull(identifier, "expected parameter 'identifier' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AppPhysicalResourceIdArgs() {
        this.awsAccountId = Codegen.empty();
        this.awsRegion = Codegen.empty();
        this.identifier = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppPhysicalResourceIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsAccountId;
        private @Nullable Output<String> awsRegion;
        private Output<String> identifier;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AppPhysicalResourceIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.awsRegion = defaults.awsRegion;
    	      this.identifier = defaults.identifier;
    	      this.type = defaults.type;
        }

        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Codegen.ofNullable(awsAccountId);
            return this;
        }
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = Codegen.ofNullable(awsRegion);
            return this;
        }
        public Builder identifier(Output<String> identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder identifier(String identifier) {
            this.identifier = Output.of(Objects.requireNonNull(identifier));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AppPhysicalResourceIdArgs build() {
            return new AppPhysicalResourceIdArgs(awsAccountId, awsRegion, identifier, type);
        }
    }
}
