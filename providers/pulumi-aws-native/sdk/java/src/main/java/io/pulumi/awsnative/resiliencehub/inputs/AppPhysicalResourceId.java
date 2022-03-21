// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppPhysicalResourceId extends io.pulumi.resources.InvokeArgs {

    public static final AppPhysicalResourceId Empty = new AppPhysicalResourceId();

    @Import(name="awsAccountId")
      private final @Nullable String awsAccountId;

    public Optional<String> getAwsAccountId() {
        return this.awsAccountId == null ? Optional.empty() : Optional.ofNullable(this.awsAccountId);
    }

    @Import(name="awsRegion")
      private final @Nullable String awsRegion;

    public Optional<String> getAwsRegion() {
        return this.awsRegion == null ? Optional.empty() : Optional.ofNullable(this.awsRegion);
    }

    @Import(name="identifier", required=true)
      private final String identifier;

    public String getIdentifier() {
        return this.identifier;
    }

    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AppPhysicalResourceId(
        @Nullable String awsAccountId,
        @Nullable String awsRegion,
        String identifier,
        String type) {
        this.awsAccountId = awsAccountId;
        this.awsRegion = awsRegion;
        this.identifier = Objects.requireNonNull(identifier, "expected parameter 'identifier' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AppPhysicalResourceId() {
        this.awsAccountId = null;
        this.awsRegion = null;
        this.identifier = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppPhysicalResourceId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String awsAccountId;
        private @Nullable String awsRegion;
        private String identifier;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AppPhysicalResourceId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.awsRegion = defaults.awsRegion;
    	      this.identifier = defaults.identifier;
    	      this.type = defaults.type;
        }

        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsRegion(@Nullable String awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AppPhysicalResourceId build() {
            return new AppPhysicalResourceId(awsAccountId, awsRegion, identifier, type);
        }
    }
}
